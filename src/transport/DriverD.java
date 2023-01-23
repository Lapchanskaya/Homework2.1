package transport;

public class DriverD extends Driver {

    public DriverD(String fullName,
                   boolean driverLicense,
                   int experience) {
        super(fullName, driverLicense, experience);
    }

    @Override
    public void startMove() {
        System.out.println(" Водитель категории D " + getFullName() + " начал движение.");

    }

    @Override
    public void finishMove() {
        System.out.println(" Водитель категории D " + getFullName() + " закончил движение.");

    }

    @Override
    public void RefuelTheCar() {
        System.out.println(" Водитель категории D " + getFullName() + " заправляет авто.");
    }
}

