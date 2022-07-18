package baitap.bai2;

import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime , endTime;

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public void start(){
        this.startTime  = LocalTime.now();

    }
    public void stop(){
        this.endTime  =  LocalTime.now();

    }
}
