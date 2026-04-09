/*
This class represents a record of a menstruration period,
including start date, duration and cycle length.
*/

import java.time.LocalDate;

public class PeriodRecord {
    private LocalDate startDate; //Start date
    private int duration; //Duration
    private int cycleLength; //cycle length

    public PeriodRecord(LocalDate startDate, int duration, int cycleLength) { //Constructor for the period record
        this.startDate = startDate;
        this.duration = duration;
        this.cycleLength = cycleLength;
    }

    public LocalDate getStartDate(){ //Getter for start date of the period
        return startDate;
    }

    public int getDuration(){ //getter for duration of the period
        return duration;
    }

    public int getCycleLength(){ //getter for cycle length of the period
        return cycleLength;
    }
    
}
