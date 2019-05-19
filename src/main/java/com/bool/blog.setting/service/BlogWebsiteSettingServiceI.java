package com.bool.blog.setting.service;
import com.bool.blog.setting.entity.BlogWebsiteSettingEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface BlogWebsiteSettingServiceI extends CommonService{
	
 	public void delete(BlogWebsiteSettingEntity entity) throws Exception;
 	
 	public Serializable save(BlogWebsiteSettingEntity entity) throws Exception;
 	
 	public void saveOrUpdate(BlogWebsiteSettingEntity entity) throws Exception;

 	public BlogWebsiteSettingEntity getSettingInfo() throws Exception;
}
