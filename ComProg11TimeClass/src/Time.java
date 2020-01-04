public class Time {
    private int hour;
    private int minute;
    private int second;
    Time(){
        hour=00;
        minute=00;
        second=00;

    }
    Time(int hour,int minute,int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
        if(this.hour<00||this.hour>23){
            this.hour=00;
        }

        if(this.minute<00||this.minute>59){
            this.minute=00;
        }

        if(this.second<00||this.second>59){
            this.second=00;
        }
    }



    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
        if(this.hour<00||this.hour>23){
            this.hour=00;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
        if(this.minute<00||this.minute>59){
            this.minute=00;
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
        if(this.second<00||this.second>59){
            this.second=00;
        }
    }
    public void setTime(int hour,int minute,int second){
        this.hour = hour;
        if(this.hour<00||this.hour>23){
            this.hour=00;
        }
        this.minute = minute;
        if(this.minute<00||this.minute>59){
            this.minute=00;
        }
        this.second = second;
        if(this.second<00||this.second>59){
            this.second=00;
        }
    }
    public String toString(){
        return "\"0"+this.hour+":0"+this.minute+":0"+this.second+"\"";
    }
    public String nextSecond(){
        this.second++;
        if(this.second==60){
            this.second=00;
            this.minute++;

        }
        if(this.minute==60){
            this.minute=00;
            this.hour++;
        }
        if(this.hour==24){
            this.hour=00;
            this.minute=00;
            this.second=00;
        }
        return "\"0"+this.hour+":0"+this.minute+":0"+this.second+"\"";


    }
    public String previousSecond(){
this.second--;

        if(this.second==-1){
            this.second=59;
            this.minute--;

        }
        if(this.minute==-1){
            this.minute=59;
            this.hour--;
        }
        if(this.hour==-1){
            this.hour=23;
            this.minute=59;
            this.second=59;
        }
        return "\"0"+this.hour+":0"+this.minute+":0"+this.second+"\"";
    }
}
