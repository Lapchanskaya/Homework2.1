package transport;

import java.time.LocalDate;
import java.util.Objects;
import java.util.regex.Pattern;


import static transport.ValidateUtils.validateBoolean;
import static transport.ValidateUtils.validateString;

public class Car  extends Transport{



  private final String bodyType;
  private final int seatCount;
  private double engineVolume;

  private String transmission;
  private String registrationNumber;
  private boolean isSummerRubber;

  private Key key;



    public Car (String brand,
                String model,
                int year,
                String country,
                String color,
                int maxSpeed,
                String bodyType,
                boolean isSummerRubber,
                String transmission,
                String registrationNumber,
                int seatCount,
                double engineVolume,
                Key key) {
        super(brand,model,year,country,color,maxSpeed);
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


    public static double validateEnginePower ( double engineVolume){
        return engineVolume <= 0 ? 1.5 : engineVolume;
    }

    public static String validateCarParameters(String value){
        return validateString (value, "default");
    }


    public static String validateTransmission (String transmission){
        return validateString( transmission, "автомат");
    }



    public String getBodyType() {
        return bodyType;
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
        return super.toString() + ", " + ", Тип кузова: " + this.bodyType
                + ",\n Резина: " + (isSummerRubber ? "Зимняя резина " : "Летняя резина") + ", Коробка передач: "
                + this.transmission + ", Регистрационный номер: "
                + this.registrationNumber + ",\n Количество мест: " + this.seatCount + ",  Объем двигателя: " + this.engineVolume +
                ", Удаленный запуск: " + ( key.remoteStart ? " Нет " : " Да ") +
                ", Доступ без ключа: " + ( key.keyLessAccess ? " Нет " : " Да ");
    }


    }







