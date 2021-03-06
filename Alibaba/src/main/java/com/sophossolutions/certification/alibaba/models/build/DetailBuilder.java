package com.sophossolutions.certification.alibaba.models.build;

import com.sophossolutions.certification.alibaba.models.ContactDetail;

public class DetailBuilder implements Builder<ContactDetail> {
	

	private int quantity;
	private String detail;
	private String email;
	
	public DetailBuilder(String email) {
		this.email = email;
	}

	public static DetailBuilder myEmail(String email) {
		return new DetailBuilder(email);
	}
	
	public DetailBuilder andAskFor(String detail) {
		this.detail = detail;
		return this;
	}
	
	public ContactDetail andAQuantityOf(int quantity) {
		this.quantity = quantity;
		return build();
	}

	@Override
	public ContactDetail build() {
		return new ContactDetail(quantity, detail, email);
	}	

}
