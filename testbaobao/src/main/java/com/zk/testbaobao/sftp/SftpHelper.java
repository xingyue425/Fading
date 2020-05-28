package com.zk.testbaobao.sftp;

import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.SftpException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class SftpHelper {

    private static final Logger log = LoggerFactory.getLogger(SftpHelper.class);

    private SftpPool pool;

    public SftpHelper(SftpPool pool) {
        this.pool = pool;
    }

    public List<String> listFiles(String dir){

        List<String> files=new ArrayList<String>();
        ChannelSftp sftp = pool.borrowObject();
        try {
            Vector vec=sftp.ls(dir);
            if(vec!=null && !vec.isEmpty()){
                Iterator i$ = vec.iterator();
                while(i$.hasNext()) {
                    Object item = i$.next();
                    if (item instanceof ChannelSftp.LsEntry) {
                        String fileName = ((ChannelSftp.LsEntry)item).getFilename();
                        log.debug(String.format("扫描到开奖文件 %s",fileName));
                        if (!fileName.equals(".") && !fileName.equals("..")) {
                            files.add(fileName);
                        }
                    }
                }
            }else{
                log.debug(String.format("没有扫描到开奖文件"));
            }
        } catch (SftpException e) {
            log.error("sftp遍历文件异常", e);
        }finally {
            pool.returnObject(sftp);
        }
        return files;
    }

    /**
     * 下载文件
     * @param remotePath 远程目录
     * @param name 远程文件名
     * @param localPath 下载目录
     * @return 文件字节数组
     */
    public void download(String remotePath, String localPath, String name) {
        ChannelSftp sftp = pool.borrowObject();
        try {
            sftp.cd(remotePath);
            sftp.get(name,localPath+name);

            return;
        } catch (SftpException e) {
            log.error("sftp单个文件下载异常", e);
        }finally {
            try {
                sftp.cd(sftp.getHome());
            } catch (SftpException e) {
                e.printStackTrace();
            }
            pool.returnObject(sftp);
        }
    }
    public boolean downloadFiles(String remotePath, String localPath, List<String> files){
        ChannelSftp sftp = pool.borrowObject();
        try {
            sftp.cd(remotePath);
            if(files!=null && files.size()>0){
                for(String name:files){

                    try {
                        sftp.get(name, localPath + name);
                        Thread.sleep(100);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
            return true;
        } catch (Exception e) {
            log.error("sftp批量文件下载异常", e);
        } finally {
            try {
                sftp.cd(sftp.getHome());
            } catch (SftpException e) {
                e.printStackTrace();
            }
            pool.returnObject(sftp);
        }
        return false;
    }

    /**
     * 上传文件
     * @param dir 远程目录
     * @param name 远程文件名
     * @param localPath 本地目录
     */
    public void upload(String dir, String name, String localPath) {
        ChannelSftp sftp = pool.borrowObject();
        try {
//            mkdirs(sftp, dir);
            sftp.cd(dir);
            sftp.put(localPath+name,name);
        } catch (SftpException e) {
            log.error("sftp上传单个文件异常", e);
        } finally {
            try {
                sftp.cd(sftp.getHome());
            } catch (SftpException e) {
                e.printStackTrace();
            }
            pool.returnObject(sftp);
        }
    }
    public void uploadFiles(String dir, List<String> files, String localPath) {
        ChannelSftp sftp = pool.borrowObject();
        try {
//            mkdirs(sftp, dir);
            sftp.cd(dir);
            if(files!=null && files.size()>0){
                for(String name:files) {
                    sftp.put(localPath + name, name);
                    Thread.sleep(100);
                }
            }
        } catch (Exception e) {
            log.error("sftp批量上传文件异常", e);
        } finally {
            try {
                sftp.cd(sftp.getHome());
            } catch (SftpException e) {
                e.printStackTrace();
            }
            pool.returnObject(sftp);
        }
    }

    /**
     * 删除文件
     * @param dir 远程目录
     * @param name 远程文件名
     */
    public void delete(String dir, String name) {
        ChannelSftp sftp = pool.borrowObject();
        try {
            sftp.cd(dir);
            sftp.rm(name);
        } catch (SftpException e) {
            log.error("sftp删除单个文件异常", e);
        } finally {
            try {
                sftp.cd(sftp.getHome());
            } catch (SftpException e) {
                e.printStackTrace();
            }
            pool.returnObject(sftp);
        }
    }
    public void deleteAll(String dir, List<String> files) {
        ChannelSftp sftp = pool.borrowObject();
        try {
            sftp.cd(dir);
            if(files!=null && files.size()>0) {
                for(String name:files) {
                    sftp.rm(name);
                    Thread.sleep(100);
                }
            }
        } catch (SftpException e) {
            log.error("sftp批量删除文件异常", e);
        } catch (InterruptedException e) {
            log.error("sftp批量删除文件异常", e);
        } finally {
            try {
                sftp.cd(sftp.getHome());
            } catch (SftpException e) {
                e.printStackTrace();
            }
            pool.returnObject(sftp);
        }
    }

    public List<String> findFiles(String remotePath, String prefix, String suffix){

        List<String> resultFiles=new ArrayList<String>();
        List<String> files=listFiles(remotePath);
        if(files!=null && files.size()>0) {
            for (String item:files){
                if(!StringUtils.isEmpty(prefix) && !item.startsWith(prefix)){
                    continue;
                }
                if(!StringUtils.isEmpty(suffix) && !item.endsWith(suffix)){
                    continue;
                }
                resultFiles.add(item);
            }
        }
        return resultFiles;

    }

}
