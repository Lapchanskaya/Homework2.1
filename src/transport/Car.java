package transport;

import java.util.List;

public class Car  extends Transport<DriverB> {

    private BodyType bodyType;

    public enum BodyType {
        TYPE1("Седан"),
        TYPE2("Хетчбек"),
        TYPE3("Купе"),
        TYPE4("Универсал"),
        TYPE5("Внедорожник"),
        TYPE6("Кроссовер"),
        TYPE7("Пикап"),
        TYPE8("Фургон"),
        TYPE9("Минивэн");

        private String name;

        BodyType(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
        @Override
        public String toString() {
            return "Тип кузова " + name;
        }


    }


    public Car(String brand,
               String model,
               double engineVolume,
               DriverB driver, BodyType bodyType, List<Mechanic> mechanic) {
        super(brand, model, engineVolume, driver,mechanic);
        this.bodyType=bodyType;

    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        if (bodyType == null) {
            return "Легковой автомобиль " + super.toString() + "\n    Тип кузова: не указан";
        } else {
            return " Легковой автомобиль " + super.toString() + "\n    " + bodyType;
        }
    }

    @Override
    public void startMove() {
        System.out.println("Автомобиль марки " + getBrand() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Автомобиль марки " + getBrand() + " закончил движение");

    }

    @Override
    public void pitStop() {
        System.out.println(" Пит-стоп у автомобиля");
    }

    @Override
    public void bestLapTime() {
        int minBound = 80;
        int maxBound = 180;
        int theBestTime = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println(" Лучшее время круга для автомобиля: " + theBestTime);

    }

    @Override
    public void maxSpeed() {
        int minBound = 100;
        int maxBound = 150;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println(" Максимальная скорость  для автомобиля: " + maxSpeed);
    }

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных по транспортному средству " + getBrand() + " " + getModel() + " недостаточно.");
        } else {
            System.out.println("Тип транспортного средства: легковой автомобиль " + getBrand() +
                    " " + getModel() + ". " + bodyType);
        }
    }

    @Override
    public boolean passDiagnostics() {
        System.out.println("Легковой автомобиль " + getBrand() + " " + getModel() + " прошел диагностику.");
        return false;
    }
}



