
/*
This class is responsible for tracking the period records and predicting the startdate of the next period
*/

import java.time.LocalDate;
import java.util.ArrayList;

public class PeriodTracker {
    private ArrayList<PeriodRecord> records; //Creating the list for records of periods

    public PeriodTracker() { //Constructing the records as array list
        records = new ArrayList<>();
    }

    public void addPeriodRecord(PeriodRecord record){ //adding the input record into the list
        records.add(record);
    }

    public LocalDate predictionDate(){ //Predicting next period start date
        LocalDate prediction; 
        
        if (records.size()==0){ //returning null if there is no data
            return null;
        }

        int currentLength = records.size();
        PeriodRecord lastOne = records.get(currentLength - 1);
        LocalDate lastDate = lastOne.getStartDate();
        int lastCycle = lastOne.getCycleLength();
        int lastDuration = lastOne.getDuration();
        prediction = lastDate.plusDays(lastCycle+lastDuration); //Predicting using the last period record data

        return prediction;
    }
}

