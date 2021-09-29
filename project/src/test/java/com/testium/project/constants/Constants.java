package com.testium.project.constants;

import org.openqa.selenium.By;

public class Constants {
	
	//HomePage
	public static final By OPEN_LOGIN_POPUP = By.xpath("/html/body/div[1]/header/div[3]/div/div/div/div[3]/div/div[1]/div");
	public static final By SET_SEARCHED_EARCH_VALUE_TO_TESTBOX = By.xpath("/html/body/div[1]/header/div[3]/div/div/div/div[2]/form/div/div[1]/div[2]/input");
	public static final By GO_TO_LOGIN_PAGE = By.xpath("/html/body/div[1]/header/div[3]/div/div/div/div[3]/div/div[1]/div[2]/div/div/div/a");

	//LoginPage
	public static final By CLICK_LOGIN_BUTTON = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/div[2]/form/div[2]/div/div[2]/div[1]/input[13]");
	public static final By SET_EMAIL_ADDRESS_TO_TEXTBOX = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/div[2]/form/div[1]/div[1]/div[1]/div[2]/input");
	public static final By SET_EMAIL_PASSWORD_TO_TEXTBOX = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/div[2]/form/div[1]/div[2]/div/div[2]/input");
	 
	//ProductDetailPage
	public static final By ADD_TO_BASKET = By.id("add-to-basket");
	public static final By ADD_TO_BASKET_2 = By.xpath("/html/body/div[1]/div[2]/div/div[1]/form/div/div[2]/div[1]/div[1]/div/div[6]/div[2]/div[2]/div[1]/div[4]/div/div[2]/select/option[2]");
	public static final By CLICK_BASKET_BUTTON = By.xpath("/html/body/div[1]/div[2]/div/div[4]/div[3]/div/a");
	public static final By DELETE_FROM_BASKET = By.xpath("/html/body/div[1]/div[2]/div/div[1]/form/div/div[2]/div[1]/div[1]/div/div[6]/div[2]/div[2]/div[1]/div[3]/div/div[2]/div/a");
	public static final By GET_BASKET_COMPUTER_PRICE = By.xpath("/html/body/div[1]/div[2]/div/div[1]/form/div/div[2]/div[2]/div/div[1]/div/div[5]/div[2]/div[3]/p");
	public static final By GET_PAGE_COMPUTER_BUTTON = By.xpath("/html/body/div[3]/div[2]/div/div[1]/div[1]/div[2]/div[2]/div[1]/div/div[1]/div[2]/div/div/div[2]");
	public static final By GET_BASKET_COMPUTER_NUMBER = By.xpath("/html/body/div[1]/div[2]/div/div[1]/form/div/div[2]/div[1]/div[1]/div/div[6]/div[2]/div[2]/div[1]/div[4]/div/div[2]/select/option[2]");
	public static final By GET_PAGE_COMPUTER_PRICE = By.xpath("//*[@id=\"sp-price-lowPrice\"]");
	
	//SearchPage
	public static final By GO_TO__NEXT_PAGE = By.xpath("//*[@id=\"__next\"]/main/div[2]/div/div/div[2]/div/div[2]/div[4]/nav/ul/li[12]/a");
	public static final By CLICK_SEARCH_BUTTON = By.xpath("/html/body/div[1]/header/div[3]/div/div/div/div[2]/form/div/div[2]/button");
	
	//TestCase
	public static final By IS_BASKET_EMPTY = By.xpath("/html/body/div[1]/div[2]/div/div[1]/form/div/div[2]/div[1]/div[1]/div/div[1]/div[1]/div[1]/div/div[2]/h2");
}	

