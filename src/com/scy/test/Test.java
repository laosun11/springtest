
/**
 * Date:2018年5月5日上午11:22:04
 * Copyright (c) 2018, www.bwbroad.com All Rights Reserved.
 *
*/

package com.scy.test;

import javax.security.auth.DestroyFailedException;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.scy.spring.JdbcTest;

/**
 * Description: TODO <br/>
 * Date:     2018年5月5日 上午11:22:04 <br/>
 * @author   sunchaoyuan	 
 */
public class Test {
	
	
	
	public static void main(String[] args) throws DestroyFailedException {
		/**
		 * spring生命周期
		 * 1.beanfacotrypostprocessor用法
		 * 2.beannameaware
		 * 3.beanpostprocessor
		 * 4.InitializingBean
		 * 5.销毁 predestroy
		 */
		ApplicationContext ac = new ClassPathXmlApplicationContext("/application.xml");
		JdbcTest jdbcTest = ac.getBean(JdbcTest.class);
		jdbcTest.sqlExcute();
	}
	
}

