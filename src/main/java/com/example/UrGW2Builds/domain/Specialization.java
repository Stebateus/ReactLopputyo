package com.example.UrGW2Builds.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "specializations")
public class Specialization {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public String id;
	private String name;
	private String charClass;
	private String talent1;
	private String talent2;
	private String talent3;
	private String talent4;
	private String talent5;
	private String talent6;
	private String talent7;
	private String talent8;
	private String talent9;
	
	public Specialization() {
	super();
	this.name = name;
	this.charClass = charClass;
	this.talent1 = talent1;
	this.talent2 = talent2;
	this.talent3 = talent3;
	this.talent4 = talent4;
	this.talent5 = talent5;
	this.talent6 = talent6;
	this.talent7 = talent7;
	this.talent8 = talent8;
	this.talent9 = talent9;
	}
	public Specialization(String name, String charClass, String talent1, String talent2, String talent3, String talent4, String talent5, String talent6, String talent7, String talent8, String talent9) {
	super();
	this.name = name;
	this.charClass = charClass;
	this.talent1 = talent1;
	this.talent2 = talent2;
	this.talent3 = talent3;
	this.talent4 = talent4;
	this.talent5 = talent5;
	this.talent6 = talent6;
	this.talent7 = talent7;
	this.talent8 = talent8;
	this.talent9 = talent9;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getcharClass() {
		return charClass;
	}
	public void setCharClass(String charClass) {
		this.charClass = charClass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTalent1() {
		return talent1;
	}
	public void setTalent1(String talent1) {
		this.talent1 = talent1;
	}
	public String getTalent2() {
		return talent2;
	}
	public void setTalent2(String talent2) {
		this.talent2 = talent2;
	}
	public String getTalent3() {
		return talent3;
	}
	public void setTalent3(String talent3) {
		this.talent3 = talent3;
	}
	public String getTalent4() {
		return talent4;
	}
	public void setTalent4(String talent4) {
		this.talent4 = talent4;
	}
	public String getTalent5() {
		return talent5;
	}
	public void setTalent5(String talent5) {
		this.talent5 = talent5;
	}
	public String getTalent6() {
		return talent6;
	}
	public void setTalent6(String talent6) {
		this.talent6 = talent6;
	}
	public String getTalent7() {
		return talent7;
	}
	public void setTalent7(String talent7) {
		this.talent7 = talent7;
	}
	public String getTalent8() {
		return talent8;
	}
	public void setTalent8(String talent8) {
		this.talent8 = talent8;
	}
	public String getTalent9() {
		return talent9;
	}
	public void setTalent9(String talent9) {
		this.talent9 = talent9;
	}
	@Override
	public String toString() {
	return "Specialization id=" + id + " charClass=" + charClass + ", talent1=" + talent1 + ", talent2=" + talent2 + ", talent3=" + talent3 + ", talent4=" + talent4 + ", talent5=" + talent5 + ", talent6=" + talent6 + ", talent7=" + talent7 + ", talent8=" + talent8 + ", talent9=" + talent9; 
	}
}
