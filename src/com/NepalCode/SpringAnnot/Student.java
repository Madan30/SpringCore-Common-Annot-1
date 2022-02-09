package com.NepalCode.SpringAnnot;

import org.springframework.stereotype.Component;

@Component("studentBean")
public class Student {
	
	public void ReadBook() {
		System.out.println("I am reading a book");
	}

}
