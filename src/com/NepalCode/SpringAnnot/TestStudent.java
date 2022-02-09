package com.NepalCode.SpringAnnot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfigFile.class);
		Student s = context.getBean("studentBean", Student.class);
		s.ReadBook();

	}

}
