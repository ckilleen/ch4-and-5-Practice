import java.time.*;
import java.util.Scanner;

public class DaysTillNextMonth
{
  public static void main(String[] args)
  {
    // Gets Date
    LocalDate today = LocalDate.now();

    //variables
  	int day;
    int daysTill;

    // today's Date
    System.out.println("Today's date is " + today);

    day = today.getDayOfMonth();

    daysTill = today.lengthOfMonth() - day;

    System.out.println(today.plusMonths(1).getMonth() + " is " + daysTill + " days away.");
  }
}