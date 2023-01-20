package transport;

import java.time.LocalDate;
import java.util.Objects;
import java.util.regex.Pattern;


import static transport.ValidateUtils.validateBoolean;
import static transport.ValidateUtils.validateString;

public class Car {

  private final String brand;
  private final String model;
  private final int year;
  private final String country;
  private final String bodyType;
  private final int seatCount;
  private double engineVolume;
  private String color;
  private String transmission;
  private String registrationNumber;
  private boolean isSummerRubber;

  private Key key;



    public Car (String brand,
                String model,
                int year,
                String country,
                String color,
                String bodyType,
                boolean isSummerRubber,
                String transmission,
                String registrationNumber,
                int seatCount,
                double engineVolume,
                Key key) {
        this.brand = validateCarParameters(brand);
        this.model = validateCarParameters(model);
        this.year = validateYear ( year);
        this.country = validateCountry(country);
        this.color = validateColor(color);
        this.engineVolume = validateEnginePower(engineVolume);
        this.bodyType = validateCarParameters(bodyType);
        this.isSummerRubber = isSummerRubber;
        this.transmission = validateTransmission(transmission);
        this.registrationNumber = validateCarNumber(registrationNumber);
        this.seatCount = validateSeatCount(seatCount);
        this.key = key;
    }

    public static class Key{
        private final Boolean remoteStart;
        private final Boolean keyLessAccess;

        @Override
        public String toString() {
            return "Key{" +
                    "remoteStart=" + remoteStart +
                    ", keyLessAccess=" + keyLessAccess +
                    '}';
        }

        public Key(Boolean remoteStart, Boolean keyLessAccess)    {
        this.remoteStart = validateBoolean(remoteStart);
        this.keyLessAccess = validateBoolean(keyLessAccess);

    }
    }




    public String validateCarNumber (String registrationNumber){
        if (Pattern.matches("[a-я][0-9]{3}[а-я]{2}[0-9]{3}", registrationNumber)){
            return registrationNumber;
        } else {
            return "неверный номер";
        }
    }

    public int validateSeatCount (int seatCount){
        return seatCount <=0 ? 4 : seatCount;
    }
    public static String validateCountry (String country){
        return validateString(country, "Rus");
    }

    public static double validateEnginePower ( double engineVolume){
        return engineVolume <= 0 ? 1.5 : engineVolume;
    }
    public static Integer validateYear (Integer year){
        return year == null ? 2000 : year;
    }

    public static String validateCarParameters(String value){
        return validateString (value, "default");
    }

    public  static String validateColor ( String color){
        return color == null ? "белый": color;
    }
    public static String validateTransmission (String transmission){
        return validateString( transmission, "автомат");
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

    public String getBodyType() {
        return bodyType;
    }

    public String getColor() {
        return color;
    }

    public boolean isSummerRubber() {
        return isSummerRubber;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = validateTransmission(transmission);
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = validateCarNumber(registrationNumber);
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSummerRubber(boolean summerRubber) {
        isSummerRubber = summerRubber;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = validateEnginePower(engineVolume);
    }

    public void changeRubber(){
        int mounth = LocalDate.now().getDayOfMonth();
        isSummerRubber = mounth < 4 || mounth > 9;
    }


    @Override
    public String toString() {
        return " Марка: " + this.brand +  ", Модель: " + this.model + ", Год выпуска: " + this.year
                + " ,\n Сборка: " + this.country + ",  Цвет кузова: " + this.color + ", Тип кузова: " + this.bodyType
                + ",\n Резина: " + (isSummerRubber ? "Зимняя резина " : "Летняя резина") + ", Коробка передач: "
                + this.transmission + ", Регистрационный номер: "
                + this.registrationNumber + ",\n Количество мест: " + this.seatCount + ",  Объем двигателя: " + this.engineVolume +
                ", Удаленный запуск: " + ( key.remoteStart ? " Нет " : " Да ") +
                ", Доступ без ключа: " + ( key.keyLessAccess ? " Нет " : " Да ");
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
        return year == car.year &&seatCount == car.seatCount && Objects.equals(brand, car.brand) &&
                Objects.equals(model, car.model) && Objects.equals(country, car.country) && Objects.equals(bodyType, car.bodyType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year, country, bodyType, seatCount);
    }




}
