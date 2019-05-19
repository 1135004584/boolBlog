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
 * @Description: blog_article
 * @author onlineGenerator
 * @date 2019-05-12 01:17:42
 * @version V1.0   
 *
 */
@Entity
@Table(name = "blog_article", schema = "")
@SuppressWarnings("serial")
public class BlogArticleEntity implements java.io.Serializable {
	/**id*/
	private java.lang.Integer id;
	/**articleTitle*/
	@Excel(name="articleTitle",width=15)
	private java.lang.String articleTitle;
	/**articleText*/
	@Excel(name="articleText",width=15)
	private java.lang.String articleText;
	/**artPropertiesid*/
	@Excel(name="artPropertiesid",width=15)
	private java.lang.Integer artPropertiesid;
	/**artTypeid*/
	@Excel(name="artTypeid",width=15)
	private java.lang.Integer artTypeid;
	
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
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  articleTitle
	 */

	@Column(name ="ARTICLE_TITLE",nullable=true,length=255)
	public java.lang.String getArticleTitle(){
		return this.articleTitle;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  articleTitle
	 */
	public void setArticleTitle(java.lang.String articleTitle){
		this.articleTitle = articleTitle;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  articleText
	 */

	@Column(name ="ARTICLE_TEXT",nullable=true,length=65535)
	public java.lang.String getArticleText(){
		return this.articleText;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  articleText
	 */
	public void setArticleText(java.lang.String articleText){
		this.articleText = articleText;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  artPropertiesid
	 */

	@Column(name ="ART_PROPERTIESID",nullable=true,length=10)
	public java.lang.Integer getArtPropertiesid(){
		return this.artPropertiesid;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  artPropertiesid
	 */
	public void setArtPropertiesid(java.lang.Integer artPropertiesid){
		this.artPropertiesid = artPropertiesid;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  artTypeid
	 */

	@Column(name ="ART_TYPEID",nullable=true,length=10)
	public java.lang.Integer getArtTypeid(){
		return this.artTypeid;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  artTypeid
	 */
	public void setArtTypeid(java.lang.Integer artTypeid){
		this.artTypeid = artTypeid;
	}
}
