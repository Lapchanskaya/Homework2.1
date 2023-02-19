package transport;

import java.util.Objects;

public abstract  class Driver {

    private String fullName;
    private boolean driverLicense;
    private int experience;

    public Driver(String fullName,
                  boolean driverLicense,
                  int experience) {
        this.fullName = fullName;
        this.driverLicense = driverLicense;
        this.experience = experience;
    }

    public abstract void startMove();
    public abstract void finishMove();
    public abstract void RefuelTheCar ();

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "ФИО водителя : " + fullName + '\'' +
                ", Водительское удостоверение : " + driverLicense +
                ", Опыт вождения: " + experience +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return driverLicense == driver.driverLicense && experience == driver.experience && Objects.equals(fullName, driver.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, driverLicense, experience);
    }
}
