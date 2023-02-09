package transport;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static transport.ValidateUtils.validateString;

public  abstract class Transport<T extends Driver> implements Competing {

    private final String brand;
    private final String model;
    private double engineVolume;
    private T driver;

    private List < Mechanic> mechanic;


    public Transport(String brand,
                     String model,
                     double engineVolume,
                     T driver, List <Mechanic> mechanic) {
        this.brand = validateCarParameters(brand);
        this.model = validateCarParameters(model);
        this.engineVolume = validateEnginePower(engineVolume);
        this.driver = driver;
        this.mechanic = new ArrayList<>(mechanic);

    }

    // region Getters-Setters
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

    public List<Mechanic> getMechanic() {
        return mechanic;
    }

    public void setMechanic(List<Mechanic> mechanic) {
        this.mechanic = mechanic;
    }

    // endregion


    // region validate

    public static double validateEnginePower(double engineVolume) {
        return engineVolume <= 0 ? 1.6 : engineVolume;
    }

    public static String validateCarParameters(String value) {
        return validateString(value, "default");
    }

// endregion
    public abstract void startMove();

    public abstract void finishMove();

    public abstract void printType();


    public abstract boolean passDiagnostics() throws TransportTypeException;


    @Override
    public String toString() {
        return " Марка: " + this.brand +
                ", Модель: " + this.model + ", " +
                " Объем двигателя: " + this.engineVolume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transport)) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.getEngineVolume(), getEngineVolume()) == 0 && getBrand().equals(transport.getBrand()) &&
                getModel().equals(transport.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(),getModel(),getEngineVolume());
    }
}



