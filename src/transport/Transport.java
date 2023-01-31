package transport;


import static transport.ValidateUtils.validateString;

public  abstract class Transport<T extends Driver> implements Competing{

    private final String brand;
    private final String model;
    private  double engineVolume;
    private T driver;


    public Transport(String brand,
                     String model,
                     double engineVolume,
                     T driver) {
        this.brand = validateCarParameters(brand);
        this.model = validateCarParameters(model);
        this.engineVolume = validateEnginePower(engineVolume);
        this.driver = driver;

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public static double validateEnginePower ( double engineVolume){
        return engineVolume <= 0 ? 1.6 : engineVolume;
    }
    public static String validateCarParameters(String value){
        return validateString (value, "default");
    }


    public abstract void startMove();
    public abstract void finishMove();
    public abstract void printType();





    @Override
    public String toString() {
        return " Марка: " + this.brand +
                ", Модель: " + this.model + ", " +
                " Объем двигателя: " + this.engineVolume;
    }

}
