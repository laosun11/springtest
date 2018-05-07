
/**
 * Date:2018年5月5日下午12:07:33
 * Copyright (c) 2018, www.bwbroad.com All Rights Reserved.
 *
*/

package com.scy.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.security.auth.DestroyFailedException;
import javax.security.auth.Destroyable;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Description: TODO <br/>
 * Date:     2018年5月5日 下午12:07:33 <br/>
 * @author   sunchaoyuan	 
 */
@Component
@Scope("singleton")
public class Dog implements Animal,BeanNameAware,InitializingBean{
	
	private String height;
	
	public Dog() {
		System.out.println("dog construct");
	}
	
	
	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("dog is sing "+height);
	}

	public String getHeight() {
		return height;
	}
	
	@Value("10")
	public void setHeight(String height) {
		System.out.println("dog height is set "+height);
		this.height = height;
	}


	@Override
	public void setBeanName(String name) {
		System.out.println("beannameaware setBeanName --> "+name);
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean --> afterPropertiesSet");
	}
	
	@PostConstruct
	public void initTest(){
		System.out.println("dog --> init");
	}
	
	@PreDestroy
	public void destroy() throws DestroyFailedException {
		System.out.println("dog --> Destroyable destroy");
	}
}

