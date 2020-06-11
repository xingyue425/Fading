<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/common/taglibs.jsp"%>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"> 
<%@ include file="/WEB-INF/common/commonlib.jsp"%>
<title></title>
<script type="text/javascript">
function submit() {
    $.ajax({
        url: '${ctx}/showmsg/submit',
        type: 'post',
        data: $('#inputForm').serialize(),
        dataType: 'json',
        timeout: 30000,
        error: function () {
            alert('处理超时或系统处理错误');
        },
        success: function (data) {
        	$('#showResult').empty();
//        	$('#showResult').append(data);
        	$.each(data, function(name, value) {
        		$('#showResult').append(value + "<BR/>");
        	});
        }
    });
}
setInterval("submit();",1000);

function process() {
    $.ajax({
        url: '${ctx}/showmsg/clear',
        type: 'post',
        data: $('#inputForm').serialize(),
        dataType: 'text',
        timeout: 10000,
        error: function () {
            alert('处理超时或系统处理错误');
        },
        success: function (data) {
        	alert("删除成功！");
        }
    });
}


</script>
<style>
.bs-docs-example:after {
	background-color: #F5F5F5;
	border: 1px solid #DDDDDD;
	border-radius: 4px 0 4px 0;
	color: #9DA0A4;
	content: "登录";
	font-size: 12px;
	font-weight: bold;
	left: -1px;
	padding: 3px 7px;
	position: absolute;
	top: -1px;
}
</style>
</head>

<body>
	<%@ include file="/WEB-INF/views/simu/simu_memu.jsp"%>
	<div class="control-group">
			<div class="controls">
				<button class="btn btn-primary" type="button" onclick="process();">清     空</button>
			</div>
		</div>
	<legend >
	    <div id="showResult" style="font-size:14px;"></div>
	</legend>
</body>
</html>
