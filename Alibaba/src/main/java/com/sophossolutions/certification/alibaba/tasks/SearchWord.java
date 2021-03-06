package com.sophossolutions.certification.alibaba.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import com.sophossolutions.certification.alibaba.models.SearchExpressions;
import com.sophossolutions.certification.alibaba.userinterfaces.AlibabaHomePage;
/*
 * Task to insert expressions on a web search-bar
 */
public class SearchWord implements Task{

	private SearchExpressions searchExpressions;
	
	/*
	 * Expression to search
	 */
	public SearchWord(SearchExpressions searchExpressions) {

		this.searchExpressions = searchExpressions;
	}

	/*
	 * (non-Javadoc)
	 * @see net.serenitybdd.screenplay.Performable#performAs(net.serenitybdd.screenplay.Actor)
	 */
	@Override
	public <T extends Actor> void performAs(T actor) {
		//Enter the expression and make a submit
		actor.attemptsTo(Enter.theValue(searchExpressions.getWord()).into(AlibabaHomePage.SOURCE_SEARCH_WORD_AREA));
		actor.attemptsTo(Click.on(AlibabaHomePage.SOURCE_BUTTON));
	}

	public static Performable the(SearchExpressions searchExpressions) {
		// TODO Auto-generated method stub
		return Tasks.instrumented(SearchWord.class, searchExpressions);
	}

}
