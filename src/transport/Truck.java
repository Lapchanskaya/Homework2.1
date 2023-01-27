package transport;

public class Truck extends Transport<DriverC> {

    public Truck(String brand,
                 String model,
                 double engineVolume,
                 DriverC driver) {
        super(brand, model, engineVolume, driver);
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
}
