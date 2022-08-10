package com.bugtraking.api.dto;

import com.bugtraking.api.entity.Project;
import com.bugtraking.api.entity.User;

public class BugDTO {

	private Long id;
	
	private String bug_desc;
	
	private String status;
	
	private User testerId;
	
	private Project projectId;
	
	private User devloperId;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the bug_desc
	 */
	public String getBug_desc() {
		return bug_desc;
	}

	/**
	 * @param bug_desc the bug_desc to set
	 */
	public void setBug_desc(String bug_desc) {
		this.bug_desc = bug_desc;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the testerId
	 */
	public User getTesterId() {
		return testerId;
	}

	/**
	 * @param testerId the testerId to set
	 */
	public void setTesterId(User testerId) {
		this.testerId = testerId;
	}

	/**
	 * @return the projectId
	 */
	public Project getProjectId() {
		return projectId;
	}

	/**
	 * @param projectId the projectId to set
	 */
	public void setProjectId(Project projectId) {
		this.projectId = projectId;
	}

	/**
	 * @return the devloperId
	 */
	public User getDevloperId() {
		return devloperId;
	}

	/**
	 * @param devloperId the devloperId to set
	 */
	public void setDevloperId(User devloperId) {
		this.devloperId = devloperId;
	}

	/**
	 * @param id
	 * @param bug_desc
	 * @param status
	 * @param testerId
	 * @param projectId
	 * @param devloperId
	 */
	public BugDTO(Long id, String bug_desc, String status, User testerId, Project projectId, User devloperId) {
		super();
		this.id = id;
		this.bug_desc = bug_desc;
		this.status = status;
		this.testerId = testerId;
		this.projectId = projectId;
		this.devloperId = devloperId;
	}

	/**
	 * 
	 */
	public BugDTO() {
		super();
		//TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	@Override
	public String toString() {
		return "BugDTO [id=" + id + ", bug_desc=" + bug_desc + ", status=" + status + ", testerId=" + testerId
				+ ", projectId=" + projectId + ", devloperId=" + devloperId + "]";
	}
	
	
}
