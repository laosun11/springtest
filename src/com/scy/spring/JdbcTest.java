
/**
 * Date:2018年5月13日下午6:06:16
 * Copyright (c) 2018, www.bwbroad.com All Rights Reserved.
 *
*/

package com.scy.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * Description: TODO <br/>
 * Date:     2018年5月13日 下午6:06:16 <br/>
 * @author   sunchaoyuan	 
 */

@Component
public class JdbcTest {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public void sqlExcute(){
		List list = jdbcTemplate.queryForList("select * from user");
		System.out.println(list.size());
	}
}

