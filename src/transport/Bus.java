package transport;

import java.util.List;
import java.util.Objects;

public class Bus extends Transport<DriverD>{

    private Capacity capacity;

    public enum Capacity {
        EXTRA_SMALL(0, 10),
        SMALL(11, 25),
        MIDDLE(40, 50),
        LARGE(60, 80),
        EXTRA_LARGE(100, 120);

        private int downCapacity;
        private int upCapacity;

        Capacity(int downCapacity, int upCapacity) {
            this.downCapacity = downCapacity;
            this.upCapacity = upCapacity;
        }


        //region Getters-Setters
        public int getDownCapacity() {
            return downCapacity;
        }

        public void setDownCapacity(int downCapacity) {
            this.downCapacity = downCapacity;
        }

        public int getUpCapacity() {
            return upCapacity;
        }

        public void setUpCapacity(int upCapacity) {
            this.upCapacity = upCapacity;
        }

        //endregion

        @Override
        public String toString() {
            return "Вместимость: " + getDownCapacity() + " - " + getUpCapacity() + " мест";
        }
    }

    public Bus(String brand,
               String model,
               double engineVolume,
               DriverD driver,
               Capacity capacity, List<Mechanic> mechanic) {
        super(brand, model, engineVolume, driver, mechanic);
        this.capacity=capacity;

    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        if (capacity == null) {
            return "Автобус " + super.toString() + "\n    Вместимость: не указана";
        } else {
            return "Автобус " + super.toString() + "\n    " + capacity;
        }
    }

    @Override
    public void startMove() {
        System.out.println("Автобус марки " + getBrand() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Автобус марки " + getBrand() + " закончил движение");

    }

    @Override
    public void pitStop() {
        System.out.println(" Пит-стоп у автобуса");
    }

    @Override
    public void bestLapTime() {
        int minBound = 100;
        int maxBound = 160;
        int theBestTime  = (int) (minBound + (maxBound - minBound)*Math.random());
        System.out.println(" Лучшее время круга для автобуса: " + theBestTime);

    }

    @Override
    public void maxSpeed() {
        int minBound = 60;
        int maxBound = 140;
        int maxSpeed = (int) (minBound + (maxBound - minBound)*Math.random());
        System.out.println(" Максимальная скорость  для автобуса: " + maxSpeed);

    }

    @Override
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по транспортному средству" + getBrand() + " " + getModel() + " недостаточно.");
        } else {
            System.out.println("Тип транспортного средства: автобус " + getBrand() + " " + getModel() + ". " + capacity);
        }
    }

    @Override
    public boolean passDiagnostics() {
        throw new TransportTypeException("Автобусы не проходят диагностику.");
    }



}

