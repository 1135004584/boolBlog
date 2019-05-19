package com.bool.blog.setting.service.impl;
import com.bool.blog.setting.service.BlogWebsiteSettingServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import com.bool.blog.setting.entity.BlogWebsiteSettingEntity;
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

@Service("blogWebsiteSettingService")
@Transactional
public class BlogWebsiteSettingServiceImpl extends CommonServiceImpl implements BlogWebsiteSettingServiceI {

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
 	public void delete(BlogWebsiteSettingEntity entity) throws Exception{
 		super.delete(entity);
 	}
 	
 	public Serializable save(BlogWebsiteSettingEntity entity) throws Exception{
 		Serializable t = super.save(entity);
 		return t;
 	}
 	
 	public void saveOrUpdate(BlogWebsiteSettingEntity entity) throws Exception{
 		super.saveOrUpdate(entity);
 	}

 	//获取网站的设置信息
	@Override
	public BlogWebsiteSettingEntity getSettingInfo() throws Exception {
 		List list = super.findByQueryString("from BlogWebsiteSettingEntity");
 		if(list.size()!=0)
 			return (BlogWebsiteSettingEntity) list.get(0);
 		else
 			return new BlogWebsiteSettingEntity();
	}

}