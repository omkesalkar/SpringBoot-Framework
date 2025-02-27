package main;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import sbeans.WishMessageGenerator;

public class DependencyInjection
{

	public static void main(String[] args)
	{
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/cfgs/applicationContext.xml");
		WishMessageGenerator generator = ctx.getBean("wmg",WishMessageGenerator.class);
		String result = generator.showWishMessage("Om");
		
		System.out.println("Result is ::( "+ result +" )");
		ctx.close();
	}
}
