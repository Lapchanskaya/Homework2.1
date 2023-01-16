package transport;

import static transport.ValidateUtils.validateString;

public class Car {

  private String brand;
  private String model;
  private double engineVolume;
  private String color;
  private int year;
  private String country;



    public Car (String brand, String model, int year, String country, String color, double engineVolume){
        this.brand = validateCarParameters(brand);
        this.model = validateCarParameters(model);
        this.year = validateYear ( year);
        this.country = validateCarParameters(country);
        this.color = validateColor(color);
        this.engineVolume = validateEnginePower(engineVolume);
    }



    @Override
    public String toString() {
        return "Марка: "+this.brand + ", Модель: " + this.model + ", Год выпуска: " + this.year + " ,  Сборка: " + this.country + ",  Цвет кузова: " + this.color + ",  Объем двигателя: " + this.engineVolume;
    }



    public static double validateEnginePower ( double engineVolume){
        return engineVolume <= 0 ? 1.5 : engineVolume;
    }
    public static int validateYear ( int year){
        return year <= 0 ? year : 2000;
    }

    public static String validateCarParameters(String value){
        return validateString (value, "default");
    }

    public  static String validateColor ( String value){
        return value == null ? "белый": value;
    }

}
