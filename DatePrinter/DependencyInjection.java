package main;

import org.springframework.context.support.FileSystemXmlApplicationContext;
import sbeans.DatePrinter;

public class DependencyInjection 
{
    public static void main(String[] args) 
    {
        // Load Spring Container
        FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/cfgs/applicationContext.xml");

        // Get the DatePrinter bean
        DatePrinter dp = ctx.getBean("datePrinter", DatePrinter.class);
        
        // Call method to print the date
        dp.showDate();
        
        // Close context
        ctx.close();
    }
}
