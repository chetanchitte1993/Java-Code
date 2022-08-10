package com.demo.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@ApiModel(description = "All details about the user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Size(min = 2, message = "Name should have atleast 2 characters")
	@ApiModelProperty(notes = "name should have at least 2 characters")
	private String name;
	
	@Past
	@ApiModelProperty(notes = "Birth date should be in the past")
	private Date birthDate;
	
	@OneToMany(mappedBy = "user")
	private List<Post> post;
	
	
	/**
	 * @param post
	 */
	public User(List<Post> post) {
		super();
		this.post = post;
	}
	/**
	 * @return the post
	 */
	public List<Post> getPost() {
		return post;
	}
	/**
	 * @param post the post to set
	 */
	public void setPost(List<Post> post) {
		this.post = post;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the birthDate
	 */
	public Date getBirthDate() {
		return birthDate;
	}
	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	/**
	 * @param id
	 * @param name
	 * @param birthDate
	 */
	public User(Integer id, String name, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}
	/**
	 * 
	 */
	public User() {
		super();
		//TODO Auto-generated constructor stub
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthDate=" + birthDate + ", post=" + post + "]";
	}
	
	
	
}
