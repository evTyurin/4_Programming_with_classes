package epam.learning;

public class Student {
    private String surname;
    private String name;
    private String patronimicName;
    private short group;
    private  final static int DEFAULT_SIZE_OF_ARRAY = 5;
    private byte [] mark = new byte[DEFAULT_SIZE_OF_ARRAY];

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronimicName (String patronimicName) {
        this.patronimicName = patronimicName;
    }

    public void setGroup (short group) {
        this.group = group;
    }

    public void setMark(byte[] mark) {
        this.mark = mark;
    }

    public byte[] getMark() {
        return mark;
    }

    public short getGroup() {
        return group;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronimicName() {
        return patronimicName;
    }

}

