package com.News.module.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class News {
	@Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "news_id",nullable = false)
   private int id;
   
//   @OneToMany(mappedBy = "news",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//   private List<News> news;
	
	@Column
	private long permission;
	
	@Column(name="enum_src_id")
	private long srcId;
	
	@Column(name = "news_date_time_story")
	private String newsDateTimeStory;
	
	@Column(name= "news_vendor_Sequence")
	private String newsVendorSequence;
	
	@Column(name = "news_company_ref_data")
	private String newsCompanyRefData;
	
	@Column(name = "news_action",length = 5)
	private String newsAction;
	
	@Column(name = "news_headline_ind",length = 5)
	private String newsHedlineInd;

	@Column(name = "news_headline")
	private String newsHeadline;
	
	@Column(name = "news_story_text_format",length = 5)
	private String newsStoryTextFormat;
    
	@Column(name = "news_story_text")
	private String newsStoryText;
	
	@Column(name="news_version")
	private String newsVersion;
	
	@Column(name="news_copyright")
	private String newsCopyright;
	
	@Column(name="news_language")
	private String newsLanguage;
	
	@Column(name="news_language_enum",length = 5)
	private String newsLanguageEnum;
	
	@Column(name = "news_datetime")
	private String newsDateTime;
	
	@Column(name = "Character_code")
	private String characterCode;
	
	@CreatedDate
	@Column(name="created_at")
	private String createdat;
	
	@LastModifiedDate
	@Column(name="updated_at")
	private String updatedat;
	

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getPermission() {
		return permission;
	}

	public void setPermission(long permission) {
		this.permission = permission;
	}

	public long getSrcId() {
		return srcId;
	}

	public void setSrcId(long srcId) {
		this.srcId = srcId;
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

	public String getNewsAction() {
		return newsAction;
	}

	public void setNewsAction(String newsAction) {
		this.newsAction = newsAction;
	}

	public String getNewsHedlineInd() {
		return newsHedlineInd;
	}

	public void setNewsHedlineInd(String newsHedlineInd) {
		this.newsHedlineInd = newsHedlineInd;
	}

	public String getNewsHeadline() {
		return newsHeadline;
	}

	public void setNewsHeadline(String newsHeadline) {
		this.newsHeadline = newsHeadline;
	}

	public String getNewsStoryTextFormat() {
		return newsStoryTextFormat;
	}

	public void setNewsStoryTextFormat(String newsStoryTextFormat) {
		this.newsStoryTextFormat = newsStoryTextFormat;
	}

	public String getNewsStoryText() {
		return newsStoryText;
	}

	public void setNewsStoryText(String newsStoryText) {
		this.newsStoryText = newsStoryText;
	}

	public String getNewsVersion() {
		return newsVersion;
	}

	public void setNewsVersion(String newsVersion) {
		this.newsVersion = newsVersion;
	}

	public String getNewsCopyright() {
		return newsCopyright;
	}

	public void setNewsCopyright(String newsCopyright) {
		this.newsCopyright = newsCopyright;
	}

	public String getNewsLanguage() {
		return newsLanguage;
	}

	public void setNewsLanguage(String newsLanguage) {
		this.newsLanguage = newsLanguage;
	}

	public String getNewsLanguageEnum() {
		return newsLanguageEnum;
	}

	public void setNewsLanguageEnum(String newsLanguageEnum) {
		this.newsLanguageEnum = newsLanguageEnum;
	}

	public String getNewsDateTime() {
		return newsDateTime;
	}

	public void setNewsDateTime(String newsDateTime) {
		this.newsDateTime = newsDateTime;
	}

	public String getCharacterCode() {
		return characterCode;
	}

	public void setCharacterCode(String characterCode) {
		this.characterCode = characterCode;
	}

	@Override
	public String toString() {
		return "News [id=" + id + ", permission=" + permission + ", srcId=" + srcId + ", newsDateTimeStory="
				+ newsDateTimeStory + ", newsVendorSequence=" + newsVendorSequence + ", newsCompanyRefData="
				+ newsCompanyRefData + ", newsAction=" + newsAction + ", newsHedlineInd=" + newsHedlineInd
				+ ", newsHeadline=" + newsHeadline + ", newsStoryTextFormat=" + newsStoryTextFormat + ", newsStoryText="
				+ newsStoryText + ", newsVersion=" + newsVersion + ", newsCopyright=" + newsCopyright
				+ ", newsLanguage=" + newsLanguage + ", newsLanguageEnum=" + newsLanguageEnum + ", newsDateTime="
				+ newsDateTime + ", characterCode=" + characterCode + ", createdat=" + createdat + ", updatedat="
				+ updatedat + "]";
	}
	
	
}
