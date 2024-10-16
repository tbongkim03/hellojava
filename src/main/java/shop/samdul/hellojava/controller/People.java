package shop.samdul.hellojava.controller;

public class People {
    int num;
    String name;
    String upname;
    
    public String upper(String name) {
        if (name == null || name.isEmpty()) {
            return ""; // 이름이 null이거나 비어있을 경우 처리
        }

        String firstChar = name.substring(0, 1);
        String etcChar = name.substring(1);

        firstChar = firstChar.toUpperCase();
        upname = firstChar + etcChar;
        return upname;
    }
}
