package com.bool.blog.colum.service;
import com.bool.blog.colum.entity.BlogArticleRelColumEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;
import java.util.List;

public interface BlogArticleRelColumServiceI extends CommonService{
	
 	public void delete(BlogArticleRelColumEntity entity) throws Exception;
 	
 	public Serializable save(BlogArticleRelColumEntity entity) throws Exception;
 	
 	public void saveOrUpdate(BlogArticleRelColumEntity entity) throws Exception;

}
