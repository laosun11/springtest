
/**
 * Date:2018年5月5日下午3:59:17
 * Copyright (c) 2018, www.bwbroad.com All Rights Reserved.
 *
*/

package com.scy.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Description: TODO <br/>
 * Date:     2018年5月5日 下午3:59:17 <br/>
 * @author   sunchaoyuan	 
 */
@Component
public class BeanPostProcessorTest implements BeanPostProcessor{

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if("dog".equals(beanName)){
			Dog dog = (Dog) bean;
			dog.setHeight("11");
			bean = dog;
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}
	

}

