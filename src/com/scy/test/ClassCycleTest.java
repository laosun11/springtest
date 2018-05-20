
/**
 * Date:2018年5月5日下午4:44:55
 * Copyright (c) 2018, www.bwbroad.com All Rights Reserved.
 *
*/

package com.scy.test;
/**
 * Description: TODO <br/>
 * Date:     2018年5月5日 下午4:44:55 <br/>
 * @author   sunchaoyuan	 
 */
public class ClassCycleTest {
	private String name = "zhangsan";
	private static Integer age = 10;
	public ClassCycleTest() {
	}
	static{
		String a = "haha";
	}
	
	public static void main(String[] args) {
		/*类生命周期
		 * 1.加载
		 * 2.验证
		 * 3.准备（给类属性分配空间）
		 * 4.解析(符号变量转化为引用变量)
		 * 4.初始化
		 * clinit
		 * init
		 */
//		ClassLoader classLoader = ClassCycleTest.class.getClassLoader();
		
		synchronized (ClassCycleTest.class)
	    {
	         
	    }
	}
}

