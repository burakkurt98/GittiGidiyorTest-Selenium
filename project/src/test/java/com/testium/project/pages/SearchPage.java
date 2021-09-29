package com.testium.project.pages;

import java.util.Random;

import com.testium.project.constants.Constants;
import com.testium.project.managers.PageManagerSingleton;
import org.openqa.selenium.By;

public class SearchPage extends BasePage{
	
	public SearchPage goToNextPage() {
		PageManagerSingleton.getInstance().click(Constants.GO_TO__NEXT_PAGE);
		return this;
	}
	
	public SearchPage selectItem() {
		Random random = new Random();
		int randomValue = random.nextInt(31) + 1;
		PageManagerSingleton.getInstance().click(By.xpath("/html/body/div[2]/main/div[2]/div/div/div[2]/div/div[2]/div[3]/ul/li[" + randomValue + "]/article/div/a"));
		return this;
	}
}
