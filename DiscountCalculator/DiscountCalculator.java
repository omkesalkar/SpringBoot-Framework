package sbeans;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DiscountCalculator 
{
	private LocalDate currentDate;
	private double price;

	// Setter for currentDate (Spring will inject this)
	public void setCurrentDate(LocalDate currentDate) {
		this.currentDate = currentDate;
	}

	// Setter for price
	public void setPrice(double price) {
		this.price = price;
	}

	// Print the current date
	public LocalDate printDate()
	{
		return currentDate;
	}

	// Calculate Discount based on the day
	public double calculateDiscount(double price)
	{
		DayOfWeek day = currentDate.getDayOfWeek();
		double discount;

		if (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY)
		{
			discount = price * 0.20; // 20% discount on weekends
			System.out.println("Weekend Discount applied!!");
		} 
		else
		{
			discount = price * 0.10; // 10% discount on weekdays
		}

		return price - discount;
	}
}
