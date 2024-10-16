package shop.samdul.hellojava.controller;

public class People {
    private int num;
    private String name;

    public int getNum() {
        return num;
    }    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setNum(int num) {
        this.num = num;
    }

    public void upper(String name) {
        if (name == null || name.isEmpty()) {
            return;
        }

        String firstChar = name.substring(0, 1);
        String etcChar = name.substring(1);

        firstChar = firstChar.toUpperCase();
        setName(firstChar + etcChar);
    }
}
