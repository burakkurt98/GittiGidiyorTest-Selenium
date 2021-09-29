package com.testium.project.pages;

import com.testium.project.constants.Constants;
import com.testium.project.managers.PageManagerSingleton;

public class ProductDetailsPage extends BasePage{
	
	public ProductDetailsPage addToBasket() {
		PageManagerSingleton.getInstance().click(Constants.ADD_TO_BASKET);
		return this;
	}
	
	public ProductDetailsPage addToBasket2() {
		PageManagerSingleton.getInstance().click(Constants.ADD_TO_BASKET_2);
		return this;
	}
	
	public ProductDetailsPage deleteFromBasket() {
		PageManagerSingleton.getInstance().click(Constants.DELETE_FROM_BASKET);
		return this;
	}
	
	public ProductDetailsPage clickBasketButton() {
		PageManagerSingleton.getInstance().click(Constants.CLICK_BASKET_BUTTON);
		return this;
	}
	
	public String getBasketComputerPrice() {
		return PageManagerSingleton.getInstance().getText(Constants.GET_BASKET_COMPUTER_PRICE);
	}

	public String getPageComputerPrice() {
		return PageManagerSingleton.getInstance().getText(Constants.GET_PAGE_COMPUTER_PRICE);
	}
	
	public String getBasketComputerNumber() {
		return PageManagerSingleton.getInstance().getText(Constants.GET_BASKET_COMPUTER_NUMBER);
	}
	
	public String isBasketEmpty() {
		return PageManagerSingleton.getInstance().getText(Constants.IS_BASKET_EMPTY);
	}
}
