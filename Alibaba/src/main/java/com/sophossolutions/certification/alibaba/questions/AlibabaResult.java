package com.sophossolutions.certification.alibaba.questions;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import com.sophossolutions.certification.alibaba.userinterfaces.AlibabaProductPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

/**
 * Clase Question para vereficar el registro correcto del usuario
 * @author manco.5@hotmail.com
 */

public class AlibabaResult implements Question<Boolean> {

	private static String errorMessage = "wrong register";

	//verifica si el boton Contactar es visible para el actor
	@Override
	public Boolean answeredBy(Actor actor) {
		return the(AlibabaProductPage.PRODUCT_CONTACT).answeredBy(actor).isCurrentlyVisible();

	}

	public static AlibabaResult page() {
		return new AlibabaResult();
	}

	public static String getErrorMessage() {
		return errorMessage;
	}
}
