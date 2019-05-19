package com.bool.blog.colum.service.impl;
import com.bool.blog.colum.service.BlogColumListServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import com.bool.blog.colum.entity.BlogColumListEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

@Service("blogColumListService")
@Transactional
public class BlogColumListServiceImpl extends CommonServiceImpl implements BlogColumListServiceI {

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
 	public void delete(BlogColumListEntity entity) throws Exception{
 		super.delete(entity);
 	}
 	
 	public Serializable save(BlogColumListEntity entity) throws Exception{
 		Serializable t = super.save(entity);
 		return t;
 	}
 	
 	public void saveOrUpdate(BlogColumListEntity entity) throws Exception{
 		super.saveOrUpdate(entity);
 	}


	@Override
	public List<Map<String, String>> getColumInfo() {
		List list = super.doQuery("select t1.id as id,t1.colum_name as columName,t1.colum_href as columHref,t2.id as fathercolumid,t2.colum_name as fname from blog_colum_list as t1 left join blog_colum_list as t2 on t1.id=t2.fatherColumID");

		return (List<Map<String, String>>)list;
	}

}