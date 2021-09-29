package com.testium.project.pages;

import com.testium.project.managers.PageManagerSingleton;
import com.testium.project.constants.Constants;


public class LoginPage {
		
	public LoginPage setEmailAddressToTextbox(String text) {
		PageManagerSingleton.getInstance().setTextbox(Constants.SET_EMAIL_ADDRESS_TO_TEXTBOX,text);
		return this;
	}
	
	public LoginPage setPasswordAddressToTextbox(String text) {
		PageManagerSingleton.getInstance().setTextbox(Constants.SET_EMAIL_PASSWORD_TO_TEXTBOX,text);
		return this;
	}
	
	public LoginPage clickLoginButton() {
		PageManagerSingleton.getInstance().click(Constants.CLICK_LOGIN_BUTTON);
		return this;
	}
}
