
/*
This code takes user input for the start date, duration and 
cycle length of a period, creates a PeriodRecord object with that data, adds 
it to the PeriodTracker and then predicts the next period date using the predictionDate
 method of the PeriodTracker class.
*/
import java.util.Scanner; //Importing useful methods
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        PeriodTracker tracker = new PeriodTracker(); //Creating a new PeriodTracker object
        System.out.println("Please enter the start date of your period (YYYY-MM-DD):");
        Scanner input = new Scanner(System.in); //Taking in user input for start date
        String date = input.nextLine();
        LocalDate startDateParsed = LocalDate.parse(date); //Parsing user input as a LocalDate instance

        System.out.println("Please enter the duration of your period (in days):");
        int duration = input.nextInt(); //Taking in Duration

        System.out.println("Please enter the cycle length of your period (in days):");
        int cycleLength = input.nextInt(); //Taking in Cycle Length

        PeriodRecord record = new PeriodRecord(startDateParsed, duration, cycleLength); //Creating new Period Record instance

        tracker.addPeriodRecord(record); //Adding it in the actual records

        LocalDate nextDate = tracker.predictionDate(); //Predicting the next date
        System.out.println("Next predicted period date: " + nextDate);

        input.close(); //Closing the Scanner

    }
}
