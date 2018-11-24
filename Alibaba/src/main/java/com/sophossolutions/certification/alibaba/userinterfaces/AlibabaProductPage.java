package com.sophossolutions.certification.alibaba.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class AlibabaProductPage {
	//Define Target Buttons
	public static final Target PRODUCT_CONTACT = Target.the("Product Contact").located(By.className("ma-button-contact-supplier"));
	public static final Target START_ORDER = Target.the("Start Order").located(By.className("ma-button-start-order"));
}
