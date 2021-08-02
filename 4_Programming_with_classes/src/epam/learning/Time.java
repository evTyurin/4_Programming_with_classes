package epam.learning;

public class Time {
    private short second;
    private short minute;
    private short hour;

    public void setSecond(short second) {
        if (second <= 60 && second >= 0) {
            this.second = second;
        } else {
            this.second = 0;
        }
    }

    public void setMinute(short minute) {
        if (minute <= 60 && minute >= 0) {
            this.minute = minute;
        } else {
            this.minute = 0;
        }
    }

    public void setHour(short hour) {
        if (hour <= 23 && hour >= 0) {
            this.hour = hour;
        } else {
            this.hour = 0;
        }
    }

    public short getHour() {
        return hour;
    }

    public short getMinute() {
        return minute;
    }

    public short getSecond() {
        return second;
    }

    public void addSecond (short second) {
        this.second += second;
        if (this.second / 60 != 0) {
            minute += (this.second / 60);
            this.second -= (this.second / 60)*60;
            System.out.println(this.second);
            if (minute / 60 != 0) {
                hour += (minute / 60);
                minute -= (minute / 60)*60;
                if (hour / 24 != 0) {
                    hour -= (hour / 24)*24;
                }
            }
        }
    }

    public void addMinute (short minute) {
        this.minute += minute;
        if (this.minute / 60 != 0) {
            hour += (this.minute / 60);
            this.minute -= (this.minute / 60)*60;
            if (hour / 24 != 0) {
                hour -= (hour / 24)*24;
            }
        }
    }

    public void addHour (short hour) {
        this.hour += hour;
        if (this.hour / 24 != 0) {
            this.hour -= (this.hour / 24)*24;
        }
    }

    public void show () {
        System.out.println("hour = " + hour);
        System.out.println("minute = " + minute);
        System.out.println("second = " + second);
    }


}
