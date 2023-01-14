import java.security.PublicKey;
import java.util.Objects;

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
        this.brand = (brand == null || brand == "" ? "default" : brand);
        this.model = (model == null || model == "" ? "default" : model);
        this.year = (year < 0 || year == 0 ? 2000 : year);
        this.country = (country == null || country == "" ? "default" : country);
        this.color = (color == null || color == "" ? "белый" : color);
        this.engineVolume = (engineVolume < 0 || engineVolume == 0 ? 1.5 : engineVolume);
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

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Car car = (Car) other;
        return Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model);
    }
}
