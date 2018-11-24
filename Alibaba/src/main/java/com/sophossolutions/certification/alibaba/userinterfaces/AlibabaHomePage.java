package com.sophossolutions.certification.alibaba.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

/*
 * Define HomePage URL
 *
 */
@DefaultUrl("https://www.alibaba.com")
public class AlibabaHomePage extends PageObject{
	//Define Targets into the web page
	public static final Target SOURCE_SEARCH_WORD_AREA = Target.the("Source search text area").located(By.name("SearchText"));
	public static final Target SOURCE_BUTTON = Target.the("Source button").located(By.className("ui-searchbar-button-icon"));
	
}
