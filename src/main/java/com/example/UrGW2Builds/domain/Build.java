package com.example.UrGW2Builds.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "builds")
public class Build {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public String id;
	private String name;
	private String comment;
	private String charClass;
	private String specialization1;
	private String s1t1;
	private String s1t2;
	private String s1t3;
	private String specialization2;
	private String s2t1;
	private String s2t2;
	private String s2t3;
	private String specialization3;
	private String s3t1;
	private String s3t2;
	private String s3t3;

	public Build() {
	super();
	}
	
	public Build(String name, String comment, String charClass, String specialization1, String s1t1, String s1t2, String s1t3, String specialization2, String s2t1, String s2t2, String s2t3, String specialization3, String s3t1, String s3t2, String s3t3) {
		super();
		this.name = name;
		this.comment = comment;
		this.charClass = charClass;
		this.specialization1 = specialization1;
		this.s1t1 = s1t1;
		this.s1t2 = s1t2;
		this.s1t3 = s1t3;
		this.specialization2 = specialization2;
		this.s2t1 = s2t1;
		this.s2t2 = s2t2;
		this.s2t3 = s2t3;
		this.specialization3 = specialization3;
		this.s3t1 = s3t1;
		this.s3t2 = s3t2;
		this.s3t3 = s3t3;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getCharClass() {
		return charClass;
	}

	public void setCharClass(String charClass) {
		this.charClass = charClass;
	}

	public String getSpecialization1() {
		return specialization1;
	}

	public void setSpecialization1(String specialization1) {
		this.specialization1 = specialization1;
	}

	public String getS1t1() {
		return s1t1;
	}

	public void setS1t1(String s1t1) {
		this.s1t1 = s1t1;
	}

	public String getS1t2() {
		return s1t2;
	}

	public void setS1t2(String s1t2) {
		this.s1t2 = s1t2;
	}

	public String getS1t3() {
		return s1t3;
	}

	public void setS1t3(String s1t3) {
		this.s1t3 = s1t3;
	}

	public String getSpecialization2() {
		return specialization2;
	}

	public void setSpecialization2(String specialization2) {
		this.specialization2 = specialization2;
	}

	public String getS2t1() {
		return s2t1;
	}

	public void setS2t1(String s2t1) {
		this.s2t1 = s2t1;
	}

	public String getS2t2() {
		return s2t2;
	}

	public void setS2t2(String s2t2) {
		this.s2t2 = s2t2;
	}

	public String getS2t3() {
		return s2t3;
	}

	public void setS2t3(String s2t3) {
		this.s2t3 = s2t3;
	}

	public String getSpecialization3() {
		return specialization3;
	}

	public void setSpecialization3(String specialization3) {
		this.specialization3 = specialization3;
	}

	public String getS3t1() {
		return s3t1;
	}

	public void setS3t1(String s3t1) {
		this.s3t1 = s3t1;
	}

	public String getS3t2() {
		return s3t2;
	}

	public void setS3t2(String s3t2) {
		this.s3t2 = s3t2;
	}

	public String getS3t3() {
		return s3t3;
	}

	public void setS3t3(String s3t3) {
		this.s3t3 = s3t3;
	}
	

}

