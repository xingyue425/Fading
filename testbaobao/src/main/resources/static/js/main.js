!function($) {
	$.formatJson = function(json, options) {
		if(!json) return "";
		var reg = null,
        formatted = '',
        pad = 0,
        PADDING = '    '; // 也可以使用 '\t'代替

      // 属性设置-初始化
      options = options || {};
      // 如果冒号“:”后面存在花括号“{”、中括号“[”，即":{"或":["这种，是否需要换行
      options.newlineAfterColonIfBeforeBraceOrBracket = (options.newlineAfterColonIfBeforeBraceOrBracket === true) ? true : false;
      // 判断冒号后是否添加空格
      options.spaceAfterColon = (options.spaceAfterColon === false) ? false : true;
      
      // 判断格式化json是否为string类型，否则转换
      if (typeof json !== 'string') {
        json = JSON.stringify(json);
      }
      
      // 格式化解析去除多余的空格
      json = JSON.parse(json);
      json = JSON.stringify(json);

      // 在花括号“{}”前后添加换行回车符
      reg = /([\{\}])/g;
      json = json.replace(reg, '\r\n$1\r\n');

      // 在方括号“[]”前后添加换行回车符
      reg = /([\[\]])/g;
      json = json.replace(reg, '\r\n$1\r\n');
      
      // 在逗号“,”后添加回车换行符
      reg = /(\,)/g;
      json = json.replace(reg, '$1\r\n');
      
      // 去掉包含多个的回车换行
      reg = /(\r\n\r\n)/g;
      json = json.replace(reg, '\r\n');
      
      // 去掉逗号“,”前面的回车换行
      reg = /\r\n\,/g;
      json = json.replace(reg, ',');

      if (!options.newlineAfterColonIfBeforeBraceOrBracket) {     
        reg = /\:\r\n\{/g;
        json = json.replace(reg, ':{');
        reg = /\:\r\n\[/g;
        json = json.replace(reg, ':[');
      }
      if (options.spaceAfterColon) {      
        reg = /\:/g;
        json = json.replace(reg, ': ');
      }
      reg = /^(\r\n)?/;
      json = json.replace(reg, "");

      $.each(json.split('\r\n'), function(index, node) {
        var i = 0,
          indent = 0,
          padding = '';
        
        if (node.match(/\{$/) || node.match(/\[$/)) {
          indent = 1;
        } else if (node.match(/\}/) || node.match(/\]/)) {
          if (pad !== 0) {
            pad -= 1;
          }
        } else {
          indent = 0;
        }
      
        for (i = 0; i < pad; i++) {
          padding += PADDING;
        }
      
        formatted += padding + node + '\r\n';
        pad += indent;
      });
      
      return formatted;
	};
	
	$.keyHighlight = function(content,keys) {
		if(!content) return "";
		$.each(keys, function(index, item) {
			if(content.indexOf(item) >= 0) {
				eval('var re =/' + item + '/g'); 
				content = content.replace(re, '<span class="jf-PropertyName">' + item + '</span>');
			}
		});
		
		return content;
	};
	
	_keys = ['cmd', 'h_status', "h_msg", "h_err", ",h_result_code"];
	
	$.ajaxSubmit = function(url) {
		$('div.overlay').addClass('open');
		$.ajax({
	        url: url,
	        type: 'post',
	        data: $('#inputForm').serialize(),
	        dataType: 'json',
	        timeout: 30000,
	        error: function (e) {
	        	$('div.overlay').removeClass('open');
	        	if(e.responseText=='异常') {
	        		alert('异常:【该协议需要登录后获取秘钥信息,请登录后再操作!】');
	        		return false;
	        	}
	        	
	            alert('处理超时或系统处理错误:【' + e.responseText + '】');
	        },
	        success: function (data) {
	        	$('div.overlay').removeClass('open');
	        	$('#showResult').empty();
	        	$('#showResult').append('<div>');
	        	$('#showResult').append('<span class="btn btn-success">响应头</span>');
	        	$('#showResult').append('<div class="show-head" id="responseHead">' + $.keyHighlight(data.head, _keys) + '</div>');
	        	$('#showResult').append('<span class="btn btn-danger" onclick="showResp();">响应体(点击放大)</span><br/>');
	        	$('#showResult').append('<div class="show-body" id="responseBody"><textarea id="outJson" class="show-body">' + $.formatJson(data.body) + '</textarea></div>');
	        	$('#showResult').append('</div>');
	        }
	    });
	};
	
	$('.form_date').datetimepicker({
	    language:  'zh-CN',
	    weekStart: 1,
	    todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 2,
		minView: 2,
		forceParse: 0
	});
	
	//监听页面回车事件
	document.onkeydown = function keyDownSearch(e) {    
        // 兼容FF和IE和Opera    
        var theEvent = e || window.event;    
        var code = theEvent.keyCode || theEvent.which || theEvent.charCode;    
        if (code == 13) {    
            $('.btn-primary').click();
            return false;    
        }    
        return true;    
    };
}(window.jQuery);

function showResp() {
	// 获取系统当前样式高度值
	var height = $(".show-body").css("height");
	if (height=='300px') {
		// 高为屏幕的高
		$(".show-body").css("height",($(document).height()));
	}
	// 自动滚动到主窗体底端
	document.getElementsByTagName('BODY')[0].scrollTop=document.getElementsByTagName('BODY')[0].scrollHeight;
}

function bindTypeAhead(id,data){
	$(id).typeahead({
		minLength: 0,
		items: 30,
        source: function (query, process) {
            var results = $.map(data, function (product) {
                return product.id + "-" + product.value;
            });
            process(results);
        },
        highlighter: function (item) {
           return item;
        },
        updater: function (item) {
            return item.substring(0,item.indexOf('-'));
        }
    });
}

        