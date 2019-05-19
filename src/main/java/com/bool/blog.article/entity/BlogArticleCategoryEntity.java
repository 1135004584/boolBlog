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
 * @Description: blog_article_category
 * @author onlineGenerator
 * @date 2019-05-12 01:18:01
 * @version V1.0   
 *
 */
@Entity
@Table(name = "blog_article_category", schema = "")
@SuppressWarnings("serial")
public class BlogArticleCategoryEntity implements java.io.Serializable {
	/**id*/
	private java.lang.Integer id;
	/**categoryName*/
	@Excel(name="categoryName",width=15)
	private java.lang.String categoryName;
	/**categoryHref*/
	@Excel(name="categoryHref",width=15)
	private java.lang.String categoryHref;
	/**fatherid*/
	@Excel(name="fatherid",width=15)
	private java.lang.Integer fatherid;
	
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
	 *@return: java.lang.String  categoryName
	 */

	@Column(name ="CATEGORY_NAME",nullable=true,length=255)
	public java.lang.String getCategoryName(){
		return this.categoryName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  categoryName
	 */
	public void setCategoryName(java.lang.String categoryName){
		this.categoryName = categoryName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  categoryHref
	 */

	@Column(name ="CATEGORY_HREF",nullable=true,length=255)
	public java.lang.String getCategoryHref(){
		return this.categoryHref;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  categoryHref
	 */
	public void setCategoryHref(java.lang.String categoryHref){
		this.categoryHref = categoryHref;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  fatherid
	 */

	@Column(name ="FATHERID",nullable=true,length=10)
	public java.lang.Integer getFatherid(){
		return this.fatherid;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  fatherid
	 */
	public void setFatherid(java.lang.Integer fatherid){
		this.fatherid = fatherid;
	}
}
