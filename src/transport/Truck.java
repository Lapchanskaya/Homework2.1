package transport;

import java.util.List;
import java.util.Objects;

public class Truck extends Transport<DriverC> {

    private TruckCapacity truckCapacity;
    public enum TruckCapacity {
        N1(null, 3.5f),
        N2(3.5f, 12.0f),
        N3(12.0f, null);

        private final Float minValue;
        private final Float maxValue;

        TruckCapacity(Float minValue, Float maxValue) {
            this.minValue = minValue;
            this.maxValue = maxValue;
        }

        @Override
        public String toString() {
            if (minValue == null) {
                return "Грузоподъемность: до " + maxValue + " тонн";
            } else if (maxValue == null) {
                return "Грузоподъемность: свыше " + minValue + " тонн";
            } else {
                return "Грузоподъемность: от " + minValue + " до " + maxValue + " тонн";
            }
        }
    }



    public Truck(String brand,
                 String model,
                 double engineVolume,
                 DriverC driver,
                 TruckCapacity truckCapacity, List<Mechanic> mechanic ) {
        super(brand, model, engineVolume, driver,mechanic );
        this.truckCapacity = truckCapacity;
    }
// region Getters-Setters
    public TruckCapacity getTruckCapacity() {
        return truckCapacity;
    }

    public void setTruckCapacity(TruckCapacity truckCapacity) {
        this.truckCapacity = truckCapacity;
    }

    // endregion

    @Override
    public String toString() {
        if (truckCapacity == null) {
            return "Грузовой автомобиль " + super.toString() + "\n    Грузоподъемность: не указана";
        } else {
            return "Грузовой автомобиль " + super.toString() + "\n    " + truckCapacity;
        }
    }


    @Override
    public void startMove() {
        System.out.println("Грузовик марки " + getBrand() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Грузовик марки " + getBrand() + " закончил движение");

    }

    @Override
    public void pitStop() {
        System.out.println(" Пит-стоп у грузового автомобиля");
    }

    @Override
    public void bestLapTime() {
        int minBound = 50;
        int maxBound = 120;
        int theBestTime  = (int) (minBound + (maxBound - minBound)*Math.random());
        System.out.println(" Лучшее время круга для грузового автомобиля: " + theBestTime);

    }

    @Override
    public void maxSpeed() {
        int minBound = 70;
        int maxBound = 140;
        int maxSpeed = (int) (minBound + (maxBound - minBound)*Math.random());
        System.out.println(" Максимальная скорость  для  грузового автомобиля: " + maxSpeed);
    }

    @Override
    public void printType() {
        if (truckCapacity == null) {
            System.out.println("Данных по транспортному средству " + getBrand() + " " + getModel() + " недостаточно.");
        } else {
            System.out.println("Тип транспортного средства: грузовой автомобиль " + getBrand() + " " + getModel() + ". " + truckCapacity);
        }
    }

    @Override
    public boolean passDiagnostics() {
        System.out.println("Грузовой автомобиль " + getBrand() + " " + getModel() + " прошел диагностику.");
        return false;
    }



}
