package com.sophossolutions.certification.alibaba.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class AlibabaContactPage {

	public static final Target QUANTITY_AREA = Target.the("Quantity").located(By.className("quantity-input"));
	public static final Target DETAIL_AREA = Target.the("Details").located(By.className("ui2-textfield-multiple"));
	public static final Target EMAIL_AREA = Target.the("Email").located(By.name("email"));
	
}
