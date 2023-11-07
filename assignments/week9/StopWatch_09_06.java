package week9;

public class StopWatch_09_06 {
    long startTime;
    long endTime;
    StopWatch_09_06(){
        this.startTime=System.currentTimeMillis();
    }
    void start(){
        this.startTime=System.currentTimeMillis();
    }
    void end(){
        this.endTime=System.currentTimeMillis();
    }
    long getElapsedTime(){
        return endTime-startTime;
    }
}
