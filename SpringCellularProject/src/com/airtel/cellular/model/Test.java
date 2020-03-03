package com.airtel.cellular.model;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.airtel.cellular.service.Service;

/**
 * Purpose : Program to manage cellular services.
 * 
 * @author Sahil Kudake
 *
 */
public class Test {
	public static void main(String[] args) {

		int choice = 0;
		do {
			ApplicationContext context = new ClassPathXmlApplicationContext("airtel.xml");
			System.out.println("1.Missed call alerts\n2.Hello tune\n3.Call waiting\n4.Exit");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				Service service1 = context.getBean("service1", Service.class);
				service1.service();
				break;
			case 2:
				Service service2 = context.getBean("service2", Service.class);
				service2.service();
				break;
			case 3:
				Service service3 = context.getBean("service3", Service.class);
				service3.service();
				break;
			case 4:
				return;

			}
		} while (choice != 4);

	}
}