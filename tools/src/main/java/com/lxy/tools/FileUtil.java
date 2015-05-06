package com.lxy.tools;

import java.io.File;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * 文件处理工具类
 * @author lxy
 *
 */
public class FileUtil {
	
	/**
	 * 传入路径删除指定文件, 只删除文件
	 * 如果是文件夹或者删除失败, 返回false
	 */
	public static boolean deleteFile(String filePath){
		if(StringUtils.isBlank(filePath)){
			return false;
		}
		
		File file = new File(filePath);
		
		if(file.isDirectory() || !file.exists()){
			return false;
		}
		
		return file.delete();
	}
	
	/**
	 * 删除文件或文件夹, 如果是文件夹包括所有文件和子目录
	 * 可能存在部分文件删除失败, 不返回结果
	 */
	public static void deleteWithChild(String dirPath){
		if(StringUtils.isBlank(dirPath)){
			return;
		}
		
		File dir = new File(dirPath);
		
		if(!dir.exists()){
			return;
		}
		
		if(dir.isFile()){
			dir.delete();
			return;
		}
		
		File[] subFiles = dir.listFiles();
		
		if(ArrayUtils.isNotEmpty(subFiles)){
			for(File file: subFiles){
				if(file.isDirectory()){
					deleteWithChild(file.getAbsolutePath());
				}else{
					file.delete();
				}
			}
		}
		dir.delete();
	}

}
