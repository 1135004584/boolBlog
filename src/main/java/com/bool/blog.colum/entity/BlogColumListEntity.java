package com.bool.blog.colum.entity;

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
 * @Description: blog_colum_list
 * @author onlineGenerator
 * @date 2019-05-12 10:40:23
 * @version V1.0   
 *
 */
@Entity
@Table(name = "blog_colum_list", schema = "")
@SuppressWarnings("serial")
public class BlogColumListEntity implements java.io.Serializable {
	/**id*/
	private java.lang.Integer id;
	/**栏目名称*/
	@Excel(name="栏目名称",width=15)
	private java.lang.String columName;
	/**栏目地址*/
	@Excel(name="栏目地址",width=15)
	private java.lang.String columHref;
	/**父栏目ID*/
	@Excel(name="父栏目ID",width=15)
	private java.lang.Integer fathercolumid;
	
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
	 *@return: java.lang.String  栏目名称

	 */

	@Column(name ="COLUM_NAME",nullable=true,length=255)
	public java.lang.String getColumName(){
		return this.columName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  栏目名称

	 */
	public void setColumName(java.lang.String columName){
		this.columName = columName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  栏目地址
	 */

	@Column(name ="COLUM_HREF",nullable=true,length=255)
	public java.lang.String getColumHref(){
		return this.columHref;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  栏目地址
	 */
	public void setColumHref(java.lang.String columHref){
		this.columHref = columHref;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  父栏目ID
	 */

	@Column(name ="FATHERCOLUMID",nullable=true,length=10)
	public java.lang.Integer getFathercolumid(){
		return this.fathercolumid;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  父栏目ID
	 */
	public void setFathercolumid(java.lang.Integer fathercolumid){
		this.fathercolumid = fathercolumid;
	}
}
