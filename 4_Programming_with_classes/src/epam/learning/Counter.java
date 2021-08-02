package epam.learning;

public class Counter {
    private short minNumber;
    private short maxNumber;
    private short number;

    private  final static short DEFAULT_MIN_NUMBER = 0;
    private  final static short DEFAULT_MAX_NUMBER = 1000;
    private  final static short DEFAULT_NUMBER = 100;

    Counter () {
        minNumber = DEFAULT_MIN_NUMBER;
        maxNumber = DEFAULT_MAX_NUMBER;
        number = DEFAULT_NUMBER;
    }

    Counter (short minNumber, short maxNumber, short number) {
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
        this.number = number;
    }

    public void setMaxNumber(short maxNumber) {
        this.maxNumber = maxNumber;
    }

    public void setMinNumber(short minNumber) {
        this.minNumber = minNumber;
    }

    public void setNumber(short number) {
        this.number = number;
    }

    public short getMaxNumber() {
        return maxNumber;
    }

    public short getMinNumber() {
        return minNumber;
    }

    public short getNumber() {
        return number;
    }

    public void increse (){
        if (this.number < this.maxNumber) {
            this.number++;
        } else {
            System.out.println("Out of limit. Your number = " + number);
        }
    }

    public void decrese () {
        if (this.number > this.minNumber) {
            this.number--;
        } else {
            System.out.println("Out of limit. Your number = " + number);
        }
    }

    public void show () {
        System.out.println("Your number = " + number);
    }
}
