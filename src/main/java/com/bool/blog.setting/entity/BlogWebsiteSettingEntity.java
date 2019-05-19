package com.bool.blog.setting.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.lang.String;
import java.lang.Double;
import java.lang.Integer;
import java.math.BigDecimal;
import javax.xml.soap.Text;
import java.sql.Blob;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.SequenceGenerator;
import org.jeecgframework.poi.excel.annotation.Excel;

/**   
 * @Title: Entity
 * @Description: blog_website_setting
 * @author onlineGenerator
 * @date 2019-05-12 01:15:08
 * @version V1.0   
 *
 */
@Entity
@Table(name = "blog_website_setting", schema = "")
@SuppressWarnings("serial")
public class BlogWebsiteSettingEntity implements java.io.Serializable {
	/**id*/
	private java.lang.Integer id;
	/**blogTitle*/
	@Excel(name="blogTitle",width=15)
	private java.lang.String blogTitle;
	/**copyright*/
	@Excel(name="copyright",width=15)
	private java.lang.String copyright;
	/**webSeo*/
	@Excel(name="webSeo",width=15)
	private java.lang.String webSeo;
	/**网站格言*/
	@Excel(name="网站格言",width=15)
	private java.lang.String webDescription;
	
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name ="ID",nullable=false,length=19)
	public java.lang.Integer getId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  id
	 */
	public void setId(java.lang.Integer id){
		this.id = id;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  blogTitle
	 */

	@Column(name ="BLOG_TITLE",nullable=true,length=255)
	public java.lang.String getBlogTitle(){
		return this.blogTitle;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  blogTitle
	 */
	public void setBlogTitle(java.lang.String blogTitle){
		this.blogTitle = blogTitle;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  copyright
	 */

	@Column(name ="COPYRIGHT",nullable=true,length=255)
	public java.lang.String getCopyright(){
		return this.copyright;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  copyright
	 */
	public void setCopyright(java.lang.String copyright){
		this.copyright = copyright;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  webSeo
	 */

	@Column(name ="WEB_SEO",nullable=true,length=255)
	public java.lang.String getWebSeo(){
		return this.webSeo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  webSeo
	 */
	public void setWebSeo(java.lang.String webSeo){
		this.webSeo = webSeo;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  网站格言
	 */

	@Column(name ="WEB_DESCRIPTION",nullable=true,length=255)
	public java.lang.String getWebDescription(){
		return this.webDescription;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  网站格言
	 */
	public void setWebDescription(java.lang.String webDescription){
		this.webDescription = webDescription;
	}
}
