package com.sophossolutions.certification.alibaba.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class AlibabaSearchPage {
	//Define Product to select
	public static final Target PRODUCT = Target.the("Product").located(By.className("offer-image-box"));
	public static final Target DIAMONDS = Target.the("Diamonts").located(By.className("diamond-level-group"));
}
