package com.sophossolutions.certification.alibaba.questions;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import com.sophossolutions.certification.alibaba.userinterfaces.AlibabaHomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

/**
 * Clase Question para verificar la conexion de internet, comparando con un elemento de la pagina principal
 * @author manco.5@hotmail.com
 */

public class AlibabaPageVisible implements Question<Boolean>  {
	
	//Verify the visibility of search bar
	@Override
	public Boolean answeredBy(Actor actor) {
		return the(AlibabaHomePage.SOURCE_SEARCH_WORD_AREA).answeredBy(actor).isCurrentlyVisible();
	}

	public static Question<Boolean> isVisible() {
		return new AlibabaPageVisible();
	}

}