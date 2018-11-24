package com.sophossolutions.certification.alibaba.models;

/*
 * Store the words to make a search
 */
public class SearchExpressions {

	private String word;

	public SearchExpressions(String word) {
		this.word = word;
	}

	
	/*
	 * To string 
	 */
	public String getWord() {
		return word;
	}

}
