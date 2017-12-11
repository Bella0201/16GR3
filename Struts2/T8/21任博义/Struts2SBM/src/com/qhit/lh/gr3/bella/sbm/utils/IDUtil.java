package com.qhit.lh.gr3.bella.sbm.utils;

import java.util.UUID;
/**
 * 
 * @author 任博义
 *TODO
 *2017年12月8日下午10:55:22
 */
public class IDUtil {
	public static String getUUID(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}

}
