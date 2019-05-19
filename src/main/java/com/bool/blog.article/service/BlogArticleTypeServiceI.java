package com.bool.blog.article.service;
import com.bool.blog.article.entity.BlogArticleTypeEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface BlogArticleTypeServiceI extends CommonService{
	
 	public void delete(BlogArticleTypeEntity entity) throws Exception;
 	
 	public Serializable save(BlogArticleTypeEntity entity) throws Exception;
 	
 	public void saveOrUpdate(BlogArticleTypeEntity entity) throws Exception;
 	
}
