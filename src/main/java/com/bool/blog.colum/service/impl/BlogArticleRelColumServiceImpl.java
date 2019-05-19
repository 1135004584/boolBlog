package com.bool.blog.colum.service.impl;
import com.bool.blog.colum.service.BlogArticleRelColumServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import com.bool.blog.colum.entity.BlogArticleRelColumEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.io.Serializable;
import org.jeecgframework.core.util.ApplicationContextUtil;
import org.jeecgframework.core.util.MyClassLoader;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.web.cgform.enhance.CgformEnhanceJavaInter;

import org.jeecgframework.minidao.util.FreemarkerParseFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.jeecgframework.core.util.ResourceUtil;

@Service("blogArticleRelColumService")
@Transactional
public class BlogArticleRelColumServiceImpl extends CommonServiceImpl implements BlogArticleRelColumServiceI {

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
 	public void delete(BlogArticleRelColumEntity entity) throws Exception{
 		super.delete(entity);
 	}
 	
 	public Serializable save(BlogArticleRelColumEntity entity) throws Exception{
 		Serializable t = super.save(entity);
 		return t;
 	}
 	
 	public void saveOrUpdate(BlogArticleRelColumEntity entity) throws Exception{
 		super.saveOrUpdate(entity);
 	}

}