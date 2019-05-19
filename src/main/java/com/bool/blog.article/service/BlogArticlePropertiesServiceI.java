package com.bool.blog.article.service;
import com.bool.blog.article.entity.BlogArticlePropertiesEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface BlogArticlePropertiesServiceI extends CommonService{
	
 	public void delete(BlogArticlePropertiesEntity entity) throws Exception;
 	
 	public Serializable save(BlogArticlePropertiesEntity entity) throws Exception;
 	
 	public void saveOrUpdate(BlogArticlePropertiesEntity entity) throws Exception;
 	
}
