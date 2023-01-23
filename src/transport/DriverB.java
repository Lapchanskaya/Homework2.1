package transport;

public class DriverB extends Driver{

    public DriverB(String fullName,
                   boolean driverLicense,
                   int experience) {
        super(fullName, driverLicense, experience);
    }

    @Override
    public void startMove() {
        System.out.println(" Водитель категории В " + getFullName() + " начал движение.");

    }

    @Override
    public void finishMove() {
        System.out.println(" Водитель категории В " + getFullName() + " закончил движение.");

    }

    @Override
    public void RefuelTheCar() {
        System.out.println(" Водитель категории В " + getFullName() + " заправляет авто.");

    }
}
