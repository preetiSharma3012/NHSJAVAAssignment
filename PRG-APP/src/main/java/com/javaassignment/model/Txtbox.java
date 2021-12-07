package com.javaassignment.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Txtbox {
	
	@NotBlank(message ="Text Box Can't be Empty")
	@Size(max = 10, message ="Size Can't exceed 10 characters")
	private String txtbox;

	public String getTxtbox() {
		return txtbox;
	}

	public void setTxtbox(String txtbox) {
		this.txtbox = txtbox;
	}
}
