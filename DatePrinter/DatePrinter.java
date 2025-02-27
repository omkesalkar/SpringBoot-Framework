package sbeans;

import java.time.LocalDate;

public class DatePrinter 
{
    private LocalDate currentDate;  // Dependency (will be injected by Spring)
    
    // Setter method for Dependency Injection
    public void setCurrentDate(LocalDate currentDate)
    {
        this.currentDate = currentDate;
    }
    
    // Method that returns the injected date
    public LocalDate printDate()
    {
        return currentDate;
    }
    
    // Method to display the date
    public void showDate()
    {
        System.out.println("Current Date: " + printDate());
    }
}
