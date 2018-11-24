package com.sophossolutions.certification.alibaba.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.sophossolutions.certification.alibaba.userinterfaces.AlibabaHomePage;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

/*
 * Task to Open the Browser
 */
public class OpenTheBrowser implements Task{
	
	private PageObject page = new AlibabaHomePage();
	
	//Argument Page
	public OpenTheBrowser(PageObject page){
		this.page=page;	
	}

	/*
	 * (non-Javadoc)
	 * @see net.serenitybdd.screenplay.Performable#performAs(net.serenitybdd.screenplay.Actor)
	 */
	@Override
	public <T extends Actor> void performAs(T actor) {
		//Open Browser in the page
		actor.attemptsTo(Open.browserOn().the(page));	
	}
	
	public static OpenTheBrowser on(AlibabaHomePage page) {
		return instrumented(OpenTheBrowser.class,page);
	}


}
