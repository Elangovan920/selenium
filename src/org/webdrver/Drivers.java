package org.webdrver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drivers {
	private int stdId;
	private String stdName;
	private long stdPhone;
	private String address;
	private String dOb;
	private String eMail;
	private String gender;
		
	
	
	public Drivers(int stdId , String stdName,long stdPhone, String address, String dOb, String eMai, String gender ) {
		this. stdId = stdId;
	    this. stdName= stdName;
		this.stdPhone= stdPhone;
		this. address= address;
		 this.dOb=dOb;
		 eMail=eMai;
		 this.gender= gender;
		
		
	}



	public int getStdId() {
		return stdId;
	}



	public String getStdName() {
		return stdName;
	}



	public long getStdPhone() {
		return stdPhone;
	}



	public String getAddress() {
		return address;
	}



	public String getdOb() {
		return dOb;
	}



	public String geteMail() {
		return eMail;
	}



	public String getGender() {
		return gender;
	}



	public void setStdId(int stdId) {
		this.stdId = stdId;
	}



	public void setStdName(String stdName) {
		this.stdName = stdName;
	}



	public void setStdPhone(int stdPhone) {
		this.stdPhone = stdPhone;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public void setdOb(String dOb) {
		this.dOb = dOb;
	}



	public void seteMail(String eMai) {
	eMail = eMai;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}
	public void Student() {
		System.out.println("STDID IS "+stdId +"\n"+ "STDNAME IS "+stdName+"\n"+"STDPHNO IS "+stdPhone+"\n"+"STD ADDRESS IS "+address+"\n"+"STD DOB IS "+dOb+"\n"+"STD EMAIL IS "+eMail+"\n"+"STD GENDER IS"+gender+"\n"+"***********");
	}
		
	}


