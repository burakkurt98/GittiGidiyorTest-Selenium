package com.testium.project.managers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PageManagerSingleton {
	
	private static PageManagerSingleton instance;
	private static final String WEB_SITE = "https://www.gittigidiyor.com/";
	private static WebDriver webDriver = null;
	private JavascriptExecutor js = null;
	
	private PageManagerSingleton() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\burak\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-notifications");
        options.addArguments("disable-popup-blocking");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        webDriver = new ChromeDriver(options);
        js = (JavascriptExecutor) webDriver;
		webDriver.manage().window().maximize();	
	} 
	 
	public static PageManagerSingleton getInstance(){
        if (instance == null) {
    	    instance = new PageManagerSingleton();
        }
        return  instance;	
	}
	
	public String getWebsite() {	
		return WEB_SITE;
	}
	
	public WebDriver getWebDriver() {	
		return webDriver;
	}
	
	public void goToUrl() {
		webDriver.navigate().to(WEB_SITE);
	}
	
	public String webDriverGetTitle() {
		return webDriver.getCurrentUrl();
	}
	
	public WebElement findElement(By byElement) {
		return webDriver.findElement(byElement);	
	}
	
	public void setTextbox(By byElement,String text) {
		WebDriverWait wait = new WebDriverWait(webDriver, 2 , 5000);
		wait.until(ExpectedConditions.elementToBeClickable(byElement)).sendKeys(text);
	}
	
	public void click(By byElement) {
		WebDriverWait wait = new WebDriverWait(webDriver, 2 , 5000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(byElement)).click();
	}
	
	public String getText(By byElement) {
		return findElement(byElement).getText();	
	}
	
	public void scrollPage(int scrollValue) {
		js.executeScript("window.scrollBy(0," + scrollValue + ")");	
	}
}
