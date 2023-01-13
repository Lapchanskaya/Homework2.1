import java.security.PublicKey;

public class Car {

  private String brand;
  private String model;
  private double engineVolume;
  private String color;
  private int year;
  private String country;

    public Car()  {

    }

    public Car (String brand, String model, int year, String country, String color, double engineVolume){
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.country=country;
        this.color=color;
        this.engineVolume=engineVolume;
    }




    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Марка: "+this.brand + ", Модель: " + this.model + ", Год выпуска: " + this.year + " ,  Сборка: " + this.country + ",  Цвет кузова: " + this.color + ",  Объем двигателя: " + this.engineVolume;
    }
}
