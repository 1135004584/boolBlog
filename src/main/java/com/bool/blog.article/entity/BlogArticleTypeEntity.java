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
 * @Description: blog_article_type
 * @author onlineGenerator
 * @date 2019-05-12 01:18:09
 * @version V1.0   
 *
 */
@Entity
@Table(name = "blog_article_type", schema = "")
@SuppressWarnings("serial")
public class BlogArticleTypeEntity implements java.io.Serializable {
	/**id*/
	private java.lang.Integer id;
	/**typename*/
	@Excel(name="typename",width=15)
	private java.lang.String typename;
	
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
	 *@return: java.lang.String  typename
	 */

	@Column(name ="TYPENAME",nullable=true,length=255)
	public java.lang.String getTypename(){
		return this.typename;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  typename
	 */
	public void setTypename(java.lang.String typename){
		this.typename = typename;
	}
}
