package com.asm.tracker.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "api_hit_details_tbl")
public class ApiHitDetails {

	@Id
	@GeneratedValue
	private int id;

	@Column(name = "api_key")
	private String apiKey;

	@Column(name = "api_url")
	private String apiUrl;

	private int hit_count;

	@Column(name = "hit_date")
	private Date hitDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public String getApiUrl() {
		return apiUrl;
	}

	public void setApiUrl(String apiUrl) {
		this.apiUrl = apiUrl;
	}

	public Date getHitDate() {
		return hitDate;
	}

	public void setHitDate(Date hitDate) {
		this.hitDate = hitDate;
	}

	public int getHitCount() {
		return hit_count;
	}

	public void setHitCount(int hitCount) {
		this.hit_count = hitCount;
	}

	@Override
	public String toString() {
		return "ApiHitDetails [id=" + id + ", apiKey=" + apiKey + ", apiUrl=" + apiUrl + ", hitCount=" + hit_count
				+ ", hitDate=" + hitDate + "]";
	}

	

}
