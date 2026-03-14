import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        PeriodTracker tracker = new PeriodTracker();
        System.out.println("Please enter the start date of your period (YYYY-MM-DD):");
        Scanner input = new Scanner(System.in);
        String date = input.nextLine();
        LocalDate startDateParsed = LocalDate.parse(date);

        System.out.println("Please enter the duration of your period (in days):");
        int duration = input.nextInt();

        System.out.println("Please enter the cycle length of your period (in days):");
        int cycleLength = input.nextInt();

        PeriodRecord record = new PeriodRecord(startDateParsed, duration, cycleLength);

        tracker.addPeriodRecord(record);

        LocalDate nextDate = tracker.predictionDate();
        System.out.println("Next predicted period date: " + nextDate);

        input.close();

    }
}
