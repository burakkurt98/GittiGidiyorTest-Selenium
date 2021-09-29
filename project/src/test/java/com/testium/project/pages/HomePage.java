package com.testium.project.pages;

import com.testium.project.constants.Constants;
import com.testium.project.managers.PageManagerSingleton;

public class HomePage {
	
	public void goToHomePage() {
		PageManagerSingleton.getInstance().goToUrl();
	}
	
	public HomePage openLoginPopUp() {
		PageManagerSingleton.getInstance().click(Constants.OPEN_LOGIN_POPUP);
		return this;
	}
	
	public HomePage setSearchedValueToTextbox() {
		PageManagerSingleton.getInstance().setTextbox(Constants.SET_SEARCHED_EARCH_VALUE_TO_TESTBOX,"bilgisayar");
		return this;
	}
	
	public HomePage goToLoginPage() {
		PageManagerSingleton.getInstance().click(Constants.GO_TO_LOGIN_PAGE);
		return this;
	}
	
	public HomePage clickSearchButton() {
		PageManagerSingleton.getInstance().click(Constants.CLICK_SEARCH_BUTTON);
		return this;
	}
}
