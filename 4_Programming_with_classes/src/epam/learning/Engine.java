package epam.learning;

public class Engine {
    private short power;
    boolean switchOn;

    // isBool

    public void setPower(short power) {
        this.power = power;
    }

    public void setSwitchOn(boolean switchOn) {
        this.switchOn = switchOn;
    }

    public short getPower() {
        return power;
    }

    public boolean switchOn () {
        return switchOn;
    }

    public void engineOn () {
        switchOn = true;
    }
}