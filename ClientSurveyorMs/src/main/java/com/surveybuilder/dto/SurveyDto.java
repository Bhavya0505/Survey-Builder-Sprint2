package com.surveybuilder.dto;

import java.io.Serializable;


public class SurveyDto implements Serializable
{
	private long sid;
	private String title;
	private String status;
	private long surveyorId;
	
	public long getSid() {
		return sid;
	}
	public void setSid(long sid) {
		this.sid = sid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "SurveyDto [sid=" + sid + ", title=" + title + ", status=" + status + ", surveyorId=" + surveyorId + "]";
	}

	public SurveyDto(long sid, String title, String status, long surveyorId) {
		super();
		this.sid = sid;
		this.title = title;
		this.status = status;
		this.surveyorId = surveyorId;
	}
	public long getSurveyorId() {
		return surveyorId;
	}
	public void setSurveyorId(long surveyorId) {
		this.surveyorId = surveyorId;
	}
	public SurveyDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
