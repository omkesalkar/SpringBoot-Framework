package main;

import java.util.Scanner;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import sbeans.DiscountCalculator;

public class DependencyInjection
{
	public static void main(String[] args) 
	{

		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/cfgs/applicationContext.xml");

		// Retrieve the bean
		DiscountCalculator dc = ctx.getBean("discountCal", DiscountCalculator.class);

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Product Price: ");
		double price = sc.nextDouble();

		// Calculate discount
		double discountPrice = dc.calculateDiscount(price);
		System.out.println("Total Amount after discount: Rs." + discountPrice);

		// Close resources
		sc.close();
		ctx.close();
	}
}
