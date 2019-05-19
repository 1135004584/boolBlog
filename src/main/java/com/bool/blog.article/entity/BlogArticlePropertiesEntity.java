package com.bool.blog.article.entity;

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
 * @Description: blog_article_properties
 * @author onlineGenerator
 * @date 2019-05-12 01:17:50
 * @version V1.0   
 *
 */
@Entity
@Table(name = "blog_article_properties", schema = "")
@SuppressWarnings("serial")
public class BlogArticlePropertiesEntity implements java.io.Serializable {
	/**id*/
	private java.lang.Integer id;
	/**articleId*/
	@Excel(name="articleId",width=15)
	private java.lang.Integer articleId;
	/**articleTime*/
	@Excel(name="articleTime",width=15,format = "yyyy-MM-dd")
	private java.util.Date articleTime;
	/**articlePageviewcount*/
	@Excel(name="articlePageviewcount",width=15)
	private java.lang.Integer articlePageviewcount;
	
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name ="ID",nullable=false,length=10)
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
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  articleId
	 */

	@Column(name ="ARTICLE_ID",nullable=true,length=10)
	public java.lang.Integer getArticleId(){
		return this.articleId;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  articleId
	 */
	public void setArticleId(java.lang.Integer articleId){
		this.articleId = articleId;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  articleTime
	 */

	@Column(name ="ARTICLE_TIME",nullable=true)
	public java.util.Date getArticleTime(){
		return this.articleTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  articleTime
	 */
	public void setArticleTime(java.util.Date articleTime){
		this.articleTime = articleTime;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  articlePageviewcount
	 */

	@Column(name ="ARTICLE_PAGEVIEWCOUNT",nullable=true,length=10)
	public java.lang.Integer getArticlePageviewcount(){
		return this.articlePageviewcount;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  articlePageviewcount
	 */
	public void setArticlePageviewcount(java.lang.Integer articlePageviewcount){
		this.articlePageviewcount = articlePageviewcount;
	}
}
