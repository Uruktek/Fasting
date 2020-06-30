public class Fasting{
    int startTime = 0;//time will be based on 0-24 hrs
    int endTime = 0;//again time is 0-24
    Fasting() {
    }

    //Getters
    public int getStartingTime() {
        return startTime;
    }
    public int getExpectedEnd() {
        return endTime;
    }

    //Setters
    public void setExpectedEnd(int end) {
        if (endTime > 25) { //Error checking for beyond 24 hrs
            System.out.println("Time is out of bounds!");
            endTime = 0;
        } else {
            endTime = end;
        }
    }
    public void setStartingTime(int start) {
        if (start > 25) {//Error checking for beyond 24 hrs
            System.out.println("Time is out of bounds!");
            startTime = 0;
        } else {
            startTime = start;
        }
    }

    public void PrintInfo(){
        System.out.println("Start: " + startTime + " " + "End: " + endTime);
    }


}