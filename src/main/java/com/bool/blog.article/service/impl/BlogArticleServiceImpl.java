package com.bool.blog.article.service.impl;
import com.bool.blog.article.service.BlogArticleServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import com.bool.blog.article.entity.BlogArticleEntity;
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

@Service("blogArticleService")
@Transactional
public class BlogArticleServiceImpl extends CommonServiceImpl implements BlogArticleServiceI {

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
 	public void delete(BlogArticleEntity entity) throws Exception{
 		super.delete(entity);
 	}
 	
 	public Serializable save(BlogArticleEntity entity) throws Exception{
 		Serializable t = super.save(entity);
 		return t;
 	}
 	
 	public void saveOrUpdate(BlogArticleEntity entity) throws Exception{
 		super.saveOrUpdate(entity);
 	}

	@Override
	public List<Map<String, String>> getArticleList(String keywords, int page, int limit) throws Exception {

 		if("".equals(keywords))
		{
			return (List<Map<String, String>>) super.doQuery("select t1.id as id,t1.article_title as article_title,t1.article_text as article_text,t2.article_time as article_time,t2.article_pageviewCount,t3.typename as typename from blog_article as t1 left join blog_article_properties as t2 on t1.art_propertiesId=t2.id left join blog_article_type as t3 on t1.art_typeId=t3.id");
		}else{
			return (List<Map<String, String>>) super.doQuery("select t1.id as id,t1.article_title as article_title,t1.article_text as article_text,t2.article_time as article_time,t2.article_pageviewCount,t3.typename as typename from blog_article as t1 left join blog_article_properties as t2 on t1.art_propertiesId=t2.id left join blog_article_type as t3 on t1.art_typeId=t3.id where t1.article_title like '%"+keywords+"%'");
		}
	}

	@Override
	public int getCount() throws Exception {
		List list = super.doQuery("select count(*) as count from blog_article");
		if(((Map)list.get(0)).get("count") == null)
		return 0;
		else
			return Integer.parseInt(((Map)list.get(0)).get("count")+"");
	}

}