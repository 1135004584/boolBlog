package com.bool.blog.colum.service;
import com.bool.blog.colum.entity.BlogArticleRelColumEntity;
import com.bool.blog.colum.entity.BlogColumListEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface BlogColumListServiceI extends CommonService{
	
 	public void delete(BlogColumListEntity entity) throws Exception;
 	
 	public Serializable save(BlogColumListEntity entity) throws Exception;
 	
 	public void saveOrUpdate(BlogColumListEntity entity) throws Exception;

	public List<Map<String,String>> getColumInfo() throws Exception;

}
