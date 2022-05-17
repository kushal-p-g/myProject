package com.News.module.dto;

public class NewsDto {
	private int id;
//	private long permission;
//	private long srcId;
	private String newsDateTimeStory;
	private String newsVendorSequence;
	private String newsCompanyRefData;
//	private String newsAction;
//	private String newsHedlineInd;
	private String newsHeadline;
//	private String newsStoryTextFormat;
	private String newsStoryText;
//	private String newsVersion;
	private String newsCopyright;
//	private String newsLanguage;
//	private String newsLanguageEnum;
	private String newsDateTime;
//	private String characterCode;
	private String createdat;
	private int subcatid;
	private String updatedat;

	
	public NewsDto(int id, String newsHeadline, int subcatid) {
		super();
		this.id = id;
		this.newsHeadline = newsHeadline;
		this.subcatid = subcatid;
	}
	public int getSubcatid() {
		return subcatid;
	}
	public void setSubcatid(int subcatid) {
		this.subcatid = subcatid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNewsDateTimeStory() {
		return newsDateTimeStory;
	}
	public void setNewsDateTimeStory(String newsDateTimeStory) {
		this.newsDateTimeStory = newsDateTimeStory;
	}
	public String getNewsVendorSequence() {
		return newsVendorSequence;
	}
	public void setNewsVendorSequence(String newsVendorSequence) {
		this.newsVendorSequence = newsVendorSequence;
	}
	public String getNewsCompanyRefData() {
		return newsCompanyRefData;
	}
	public void setNewsCompanyRefData(String newsCompanyRefData) {
		this.newsCompanyRefData = newsCompanyRefData;
	}
	public String getNewsHeadline() {
		return newsHeadline;
	}
	public void setNewsHeadline(String newsHeadline) {
		this.newsHeadline = newsHeadline;
	}
	public String getNewsStoryText() {
		return newsStoryText;
	}
	public void setNewsStoryText(String newsStoryText) {
		this.newsStoryText = newsStoryText;
	}
	public String getNewsCopyright() {
		return newsCopyright;
	}
	public void setNewsCopyright(String newsCopyright) {
		this.newsCopyright = newsCopyright;
	}
	public String getNewsDateTime() {
		return newsDateTime;
	}
	public void setNewsDateTime(String newsDateTime) {
		this.newsDateTime = newsDateTime;
	}
	public String getCreatedat() {
		return createdat;
	}
	public void setCreatedat(String createdat) {
		this.createdat = createdat;
	}
	public String getUpdatedat() {
		return updatedat;
	}
	public void setUpdatedat(String updatedat) {
		this.updatedat = updatedat;
	}
	
	
	

	
	
	
}
