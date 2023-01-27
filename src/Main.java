import transport.*;

import java.time.LocalDate;

public class Main {

    public static void printSeparation() {
        System.out.println(" ================== ");
    }

    public static void main(String[] args) {

        DriverB driverB = new DriverB(
                "Иванов Иван Иванович, Категории В",
                true,
                6);

        DriverC driverC = new DriverC(
                "Федоров Федор Федорович, Категории С",
                true,
                5);

        DriverD driverD = new DriverD(
                "Ильин Кирилл Андреевич, Категории D",
                false,
                2);




        Bus bus1 = new Bus(
                "Volvo",
                "9700",
                2.5, driverD);

        Bus bus2 = new Bus(
                "ЛиАЗ",
                "5292",
                6.9, driverD);

        Bus bus3 = new Bus(
                "Hyundai",
                "Universe",
                12.74, driverD);

        Bus bus4 = new Bus(
                "ПАЗ",
                "Вектор Next",
                4.43, driverD);


        Car car1 = new Car (
                "BMW",
                "X6",
                4.4, driverB);

        Car car2 = new Car (
                "HAVAL",
                "Jolion",
                1.4,driverB);

        Car car3 = new Car (
                "Lada",
                "ВАЗ-2106",
                1.6, driverB);

        Car car4 = new Car (
                "Chevrolet",
                "Impala",
                5.4, driverB);


        Truck truck1 = new Truck(
                "IVECO",
                "EuroStar",
                12.8, driverC );

        Truck truck2 = new Truck(
                "Hyundai",
                "Porter",
                2.5, driverC);

        Truck truck3 = new Truck(
                "Scania",
                "S-Series",
                16.0, driverC);

        Truck truck4 = new Truck(
                "VOLVO",
                "FH",
                16.0, driverC);


        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
        System.out.println(bus4);
        printSeparation();
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        printSeparation();
        System.out.println(truck1);
        System.out.println(truck2);
        System.out.println(truck3);
        System.out.println(truck4);

        printSeparation();
        printInfo(car1);
        printInfo(car2);
        printInfo(car3);
        printInfo(car4);
        printSeparation();
        printInfo(bus1);
        printInfo(bus2);
        printInfo(bus3);
        printInfo(bus4);
        printSeparation();
        printInfo(truck1);
        printInfo(truck2);
        printInfo(truck3);
        printInfo(truck4);



    }

  private static void printInfo( Transport<?> transport){
      System.out.println( " Водитель " + transport.getDriver().getFullName() + " управляет автомобилем " + transport.getBrand() + " и будет участвовать в заезде. ");
  }



}
