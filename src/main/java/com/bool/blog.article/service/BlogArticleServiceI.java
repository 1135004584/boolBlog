package com.bool.blog.article.service;
import com.bool.blog.article.entity.BlogArticleEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface BlogArticleServiceI extends CommonService{
	
 	public void delete(BlogArticleEntity entity) throws Exception;
 	
 	public Serializable save(BlogArticleEntity entity) throws Exception;
 	
 	public void saveOrUpdate(BlogArticleEntity entity) throws Exception;

 	public List<Map<String,String>> getArticleList(String keywords, int page, int limit) throws Exception;

 	public int getCount() throws Exception;
}