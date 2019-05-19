package com.bool.blog.article.service;
import com.bool.blog.article.entity.BlogArticleCategoryEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface BlogArticleCategoryServiceI extends CommonService{
	
 	public void delete(BlogArticleCategoryEntity entity) throws Exception;
 	
 	public Serializable save(BlogArticleCategoryEntity entity) throws Exception;
 	
 	public void saveOrUpdate(BlogArticleCategoryEntity entity) throws Exception;
 	
}
