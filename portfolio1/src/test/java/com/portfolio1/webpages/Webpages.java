package com.portfolio1.webpages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Webpages {
WebDriver driver;

//constructors
public Webpages(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

//Locators
@FindBy(id="comp-ifwo3akw0bg")
public WebElement home;

@FindBy(id="comp-ifwo3akw3label")
public WebElement contact;

@FindBy(id="comp-jaddqnbp0imageimageimage")
public WebElement fb;

public WebElement clickfb() {
	return fb;

}
public WebElement typehome(){
	return home;
}
public WebElement typecontact(){
	return contact;
}
	@FindBy(id="field1")
	public WebElement name;
	public WebElement typename(){
		return name;
	}
	
	@FindBy(name="Email")
	public WebElement email;
	public WebElement typeemail(){
		return email;
	}
	@FindBy(name="Subject")
	public WebElement subject;
	public WebElement typesubject(){
		return subject;
	}
	@FindBy(name="Message")
	public WebElement message;
	public WebElement typemessage(){
		return message;
	}
@FindBy(id="comp-ig0hw8wd2submit")	
	public WebElement send;
public WebElement typesend(){
	return send;
}
public void verifyText(String expected){
	//value = "Success! Message Sent";
	driver.getPageSource().contains(expected);
}
	public void input(String entername,String enteremail,String sub,String msg) {
		name.sendKeys(entername);
		email.sendKeys(enteremail);
		subject.sendKeys(sub);
		message.sendKeys(msg);
	
	}
}


