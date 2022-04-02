package com.example.handlingformsubmission;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HandlingFormSubmissionApplication {

	public static void main(String[] args) throws IntrospectionException {
		SpringApplication.run(HandlingFormSubmissionApplication.class, args);

		BeanInfo info = Introspector.getBeanInfo(Class.class);
		PropertyDescriptor[] properties =
				info.getPropertyDescriptors();
		for (PropertyDescriptor pd : properties) {
			System.out.println("Property: " + pd.getName());
		}
	}

}
