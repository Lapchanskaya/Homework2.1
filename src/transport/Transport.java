package transport;

import javax.management.loading.PrivateClassLoader;

import static transport.ValidateUtils.validateString;

public class Transport {

    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private int maxSpeed;


    public Transport(String brand,
                     String model,
                     int year,
                     String country,
                     String color,
                     int maxSpeed) {
        this.brand = validateCarParameters(brand);
        this.model = validateCarParameters(model);
        this.year = validateYear ( year);
        this.country =validateCountry(country);
        this.color = validateColor(color);
        this.maxSpeed = validateMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }


    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public static String validateCarParameters(String value){
        return validateString (value, "default");
    }
    public static Integer validateYear (Integer year){
        return year == null ? 2000 : year;
    }
    public static String validateCountry (String country){
        return validateString(country, "Rus");
    }

    public  static String validateColor ( String color){
        return color == null ? "белый": color;
    }

    public  static Integer validateMaxSpeed ( int maxSpeed){
        return maxSpeed <= 0 ? 120 : maxSpeed;

    }


    @Override
    public String toString() {
        return " Марка: " + this.brand +
                ", Модель: " + this.model + ", " +
                "Год выпуска: " + this.year +
                " ,\n Сборка: " + this.country +
                ",  Цвет кузова: " + this.color +  " ,\n Максимальная скорость : " + this.maxSpeed;
    }

}
