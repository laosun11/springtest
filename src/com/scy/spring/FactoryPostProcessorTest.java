
/**
 * Date:2018年5月5日下午3:52:46
 * Copyright (c) 2018, www.bwbroad.com All Rights Reserved.
 *
*/

package com.scy.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.cglib.beans.BeanMap;
import org.springframework.stereotype.Component;

/**
 * Description: TODO <br/>
 * Date:     2018年5月5日 下午3:52:46 <br/>
 * @author   sunchaoyuan	 
 */
//@Component
public class FactoryPostProcessorTest implements BeanFactoryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0) throws BeansException {
		String[] beannameArr = arg0.getBeanDefinitionNames();
		for (int i = 0; i < beannameArr.length; i++) {
//			String name = arg0.getBeanDefinition(beannameArr[i]);
			System.out.println(beannameArr[i]);
		}
//		System.out.println(arg0.getBeanDefinitionCount());
	}

}

