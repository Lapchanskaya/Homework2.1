package transport;


import java.util.*;


public class Main {

    public static void printSeparation() {
        System.out.println(" ================== ");
    }

    public static void main(String[] args) {


        for (int i = 4; i <= 4; i++) {
            Mechanic mechanic1 = new Mechanic("Никитин Сергей", "ПроСТО");
            Mechanic mechanic2 = new Mechanic("Жигулин Дмитрий", "Техносус");
            Mechanic mechanic3 = new Mechanic("Ивлев Антон", "Рон-дон-дон");
            Mechanic mechanic4 = new Mechanic("Линьков Максим ", "АвтопромТО");


            List<Mechanic> mechanics = new ArrayList<>();
            mechanics.add(mechanic1);
            mechanics.add(mechanic2);
            mechanics.add(mechanic3);
            mechanics.add(mechanic4);

            DriverB driverB = new DriverB(
                    " Водитель категории B" + i,
                    true,
                    6 + i);

            Car car = new Car(
                    " Авто марки № " + i,
                    ", Модели № " + i,
                    1.6 + i,
                    driverB, Car.BodyType.TYPE1, mechanics);


            DriverC driverC = new DriverC(
                    "Водитель категории  С" + i,
                    true,
                    5 + i);


            Truck truck = new Truck(
                    " Грузовик  марки № " + i,
                    ", Модели № " + i,
                    12.8 + i, driverC,
                    Truck.TruckCapacity.N1,
                    mechanics);


            DriverD driverD = new DriverD(
                    "Водитель категории D" + i,
                    true,
                    6 + i);


            Bus bus = new Bus(
                    " Автобус марки № " + i,
                    ", Модели № " + i,
                    6.9 + i,
                    driverD,
                    Bus.Capacity.LARGE,
                    mechanics);

            printInfo(car);
            printInfo(truck);
            printInfo(bus);
            car.toString();
            try {
                car.passDiagnostics();
                bus.passDiagnostics();
                truck.passDiagnostics();
            } catch (TransportTypeException e) {
                System.err.println(e.getMessage());
            }


        }


        DriverB driverB1 = new DriverB("Филимонова Алёна Максимовна, Категории В", true, 6);

        DriverB driverB2 = new DriverB("Попов Алексей Артёмович, Категории В", true, 2);

        DriverC driverC1 = new DriverC("Давыдова Екатерина Тимофеевна, Категории С", true, 5);

        DriverC driverC2 = new DriverC("Крылов Олег Михайлович, Категории С", true, 5);

        DriverD driverD1 = new DriverD("Архипов Фёдор Максимович, Категории D", true, 6);

        DriverD driverD2 = new DriverD("Соколов Лука Александрович, Категории D", false, 2);


        Mechanic mechanic1 = new Mechanic(" Лебедев Александр ", "Автолюб");
        Mechanic mechanic2 = new Mechanic(" Чернышев Алексей ", "ШинаМашина");
        Mechanic mechanic3 = new Mechanic(" Максимов Иван ", "ДорТорт");
        Mechanic mechanic4 = new Mechanic(" Игнатьев Денис ", "МосТО");

        List<Mechanic> mechanics = new ArrayList<>();
        mechanics.add(mechanic1);
        mechanics.add(mechanic2);
        mechanics.add(mechanic3);
        mechanics.add(mechanic4);
        for (Mechanic mechanic : mechanics) {
            System.out.println(mechanic);
        }


        Transport car1  = new Car("Авто №1 ", " Модель №1", 1.6, driverB1, Car.BodyType.TYPE1, mechanics);
        Transport car2 = new Car("Авто №2 ", " Модель №2", 2.0, driverB2, Car.BodyType.TYPE2, mechanics);
        Transport bus1 = new Bus("Автобус №1 ", " Модель №1", 19.0, driverD2, Bus.Capacity.LARGE, mechanics);
        Transport bus2 = new Bus("Автобус №2 ", " Модель №2", 11.0, driverD1, Bus.Capacity.EXTRA_LARGE, mechanics);
        Transport truck1 = new Truck("Грузовик  №1", " Модель №1", 16.0, driverC1, Truck.TruckCapacity.N1, mechanics);
        Transport truck2 = new Truck("Грузовик №2 ", " Модель №2", 10.0, driverC2, Truck.TruckCapacity.N3, mechanics);


        List<Transport> racers = new ArrayList<>();
        racers.add(car1);
        racers.add(car2);
        racers.add(bus1);
        racers.add(bus2);
        racers.add(truck1);
        racers.add(truck2);
        for (Transport transport : racers) {
            System.out.println(transport + " " + transport.getDriver() + " " + transport.getMechanic());
        }

        mechanic1.maintenance();
        mechanic2.fixTheCar();

        Queue<Object> vehicle = new LinkedList<>();
        vehicle.add(car1);
        vehicle.add(car2);
        vehicle.add(bus1);
        vehicle.add(bus2);
        vehicle.add(truck1);
        vehicle.add(truck2);
        System.out.println(vehicle);

    }

    private static void printInfo(Transport<?> transport){
        System.out.println( " Водитель " + transport.getDriver().getFullName() + " упарвляет автомобилем " + transport.getBrand() + " и будет участвовать в заезде. ");
    }
}





//        DriverB driverB3 = new DriverB(
//                "Попов Степан Ильич, Категории В",
//                true,
//                10);
//
//        DriverB driverB4 = new DriverB(
//                "Иванова Нина Максимовна, Категории В",
//                false,
//                8);
//
//
//
//        DriverC driverC1 = new DriverC(
//                "Давыдова Екатерина Тимофеевна, Категории С",
//                true,
//                5);
//
//        DriverC driverC2 = new DriverC(
//                "Крылов Олег Михайлович, Категории С",
//                true,
//                5);
//
//        DriverC driverC3 = new DriverC(
//                "Коротков Григорий Дмитриевич, Категории С",
//                true,
//                8);
//
//        DriverC driverC4 = new DriverC(
//                "Воронина Екатерина Данииловна, Категории С",
//                true,
//                17);
//
//        DriverD driverD1 = new DriverD(
//                "Архипов Фёдор Максимович, Категории D",
//                true,
//                6);
//
//        DriverD driverD2 = new DriverD(
//                "Соколов Лука Александрович, Категории D",
//                false,
//                2);
//
//        DriverD driverD3 = new DriverD(
//                "Скворцов Платон Михайлович, Категории D",
//                true,
//                4);
//
//        DriverD driverD4 = new DriverD(
//                "Кочетов Антон Михайлович, Категории D",
//                true,
//                20);
//
//
//        Bus bus1 = new Bus( "Volvo",
//                "9700",
//                2.5, driverD1, Bus.Capacity.EXTRA_SMALL);
//
//        Bus bus2 = new Bus(
//                "ЛиАЗ",
//                "5292",
//                6.9, driverD2, Bus.Capacity.LARGE);
//
//        Bus bus3 = new Bus(
//                "Hyundai",
//                "Universe",
//                12.74, driverD3, Bus.Capacity.EXTRA_LARGE);
//
//        Bus bus4 = new Bus(
//                "ПАЗ",
//                "Вектор Next",
//                4.43, driverD4, Bus.Capacity.MIDDLE);
//
//
//        Car car1 = new Car (
//                "BMW",
//                "X6",
//                4.4, driverB1, Car.BodyType.TYPE6);
//
//        Car car2 = new Car (
//                "HAVAL",
//                "Jolion",
//                1.4,driverB2, Car.BodyType.TYPE1);
//
//        Car car3 = new Car (
//                "Lada",
//                "ВАЗ-2106",
//                1.6, driverB3,Car.BodyType.TYPE9 );
//
//        Car car4 = new Car (
//                "Chevrolet",
//                "Impala",
//                5.4, driverB4, Car.BodyType.TYPE5);
//
//
//        Truck truck1 = new Truck(
//                "IVECO",
//                "EuroStar",
//                12.8, driverC1, Truck.TruckCapacity.N1 );
//
//        Truck truck2 = new Truck(
//                "Hyundai",
//                "Porter",
//                2.5, driverC2, Truck.TruckCapacity.N3);
//
//        Truck truck3 = new Truck(
//                "Scania",
//                "S-Series",
//                16.0, driverC3,Truck.TruckCapacity.N2);
//
//        Truck truck4 = new Truck(
//                "VOLVO",
//                "FH",
//                16.0, driverC4, Truck.TruckCapacity.N3);
//
////
//        System.out.println(bus1);
//        System.out.println(bus2);
//        System.out.println(bus3);
//        System.out.println(bus4);
//        printSeparation();
//        System.out.println(car1);
//        System.out.println(car2);
//        System.out.println(car3);
//        System.out.println(car4);
//        printSeparation();
//        System.out.println(truck1);
//        System.out.println(truck2);
//        System.out.println(truck3);
//        System.out.println(truck4);
//
//        printSeparation();
//        printInfo(car1);
//        printInfo(car2);
//        printInfo(car3);
//        printInfo(car4);
//        printSeparation();
//        printInfo(bus1);
//        printInfo(bus2);
//        printInfo(bus3);
//        printInfo(bus4);
//        printSeparation();
//        printInfo(truck1);
//        printInfo(truck2);
//        printInfo(truck3);
//        printInfo(truck4);
//
//
//        printSeparation();
//
//
//
//        car1.printType();
//        car2.printType();
//        car3.printType();
//        car4.printType();
//        truck1.printType();
//        truck2.printType();
//        truck3.printType();
//        truck4.printType();
//        bus1.printType();
//        bus2.printType();
//        bus3.printType();
//        bus4.printType();
//
//
//
//        printSeparation();
//
//        printInfoAboutDiagnostics(car2);
//        printInfoAboutDiagnostics(car1);
//        printInfoAboutDiagnostics(car3);
//        printInfoAboutDiagnostics(car4);
//        printInfoAboutDiagnostics(truck1);
//        printInfoAboutDiagnostics(truck2);
//        printInfoAboutDiagnostics(truck3);
//        printInfoAboutDiagnostics(truck4);
//        printInfoAboutDiagnostics(bus1);
//        printInfoAboutDiagnostics(bus4);
//
//
//    }
//
//

//    private static void printInfo( Transport<?> transport){
//        System.out.println( " Водитель " + transport.getDriver().getFullName() + " управляет автомобилем " + transport.getBrand() + " и будет участвовать в заезде. ");
//    }
//
//    public static void printInfoAboutDiagnostics(Transport<?> transport) {
//        try {
//            transport.passDiagnostics();
//        } catch (TransportTypeException e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
//    }









