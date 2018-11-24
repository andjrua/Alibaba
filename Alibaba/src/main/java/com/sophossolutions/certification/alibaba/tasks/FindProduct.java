package com.sophossolutions.certification.alibaba.tasks;

import com.sophossolutions.certification.alibaba.userinterfaces.AlibabaSearchPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

/*
 * Task to select a product in screen
 */
public class FindProduct implements Task{

	public FindProduct() {
	}
	/*
	 * (non-Javadoc)
	 * @see net.serenitybdd.screenplay.Performable#performAs(net.serenitybdd.screenplay.Actor)
	 */
	@Override
	public <T extends Actor> void performAs(T actor) {
		//Make click on a product in the screen list
		actor.attemptsTo(Click.on(AlibabaSearchPage.PRODUCT));
	}

	public static Performable with() {
		// TODO Auto-generated method stub
		return Tasks.instrumented(FindProduct.class);
	}
}
