package transport;

public class DriverC extends Driver {

    public DriverC(String fullName,
                   boolean driverLicense,
                   int experience) {
        super(fullName, driverLicense, experience);
    }

    @Override
    public void startMove() {
        System.out.println(" Водитель категории C " + getFullName() + " начал движение.");

    }

    @Override
    public void finishMove() {
        System.out.println(" Водитель категории C " + getFullName() + " закончил движение.");

    }

    @Override
    public void RefuelTheCar() {
        System.out.println(" Водитель категории C " + getFullName() + " заправляет авто.");
    }

}
