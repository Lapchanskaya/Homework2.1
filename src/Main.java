import transport.*;




public class Main {

    public static void printSeparation() {
        System.out.println(" ================== ");
    }

    public static void main(String[] args) {

        DriverB driverB1 = new DriverB(
                "Филимонова Алёна Максимовна, Категории В",
                true,
                6);

        DriverB driverB2 = new DriverB(
                "Попов Алексей Артёмович, Категории В",
                true,
                2);

        DriverB driverB3 = new DriverB(
                "Попов Степан Ильич, Категории В",
                true,
                10);

        DriverB driverB4 = new DriverB(
                "Иванова Нина Максимовна, Категории В",
                false,
                8);



        DriverC driverC1 = new DriverC(
                "Давыдова Екатерина Тимофеевна, Категории С",
                true,
                5);

        DriverC driverC2 = new DriverC(
                "Крылов Олег Михайлович, Категории С",
                true,
                5);

        DriverC driverC3 = new DriverC(
                "Коротков Григорий Дмитриевич, Категории С",
                true,
                8);

        DriverC driverC4 = new DriverC(
                "Воронина Екатерина Данииловна, Категории С",
                true,
                17);

        DriverD driverD1 = new DriverD(
                "Архипов Фёдор Максимович, Категории D",
                true,
                6);

        DriverD driverD2 = new DriverD(
                "Соколов Лука Александрович, Категории D",
                false,
                2);

        DriverD driverD3 = new DriverD(
                "Скворцов Платон Михайлович, Категории D",
                true,
                4);

        DriverD driverD4 = new DriverD(
                "Кочетов Антон Михайлович, Категории D",
                true,
                20);


        Bus bus1 = new Bus( "Volvo",
                "9700",
                2.5, driverD1, Bus.Capacity.EXTRA_SMALL);

        Bus bus2 = new Bus(
                "ЛиАЗ",
                "5292",
                6.9, driverD2, Bus.Capacity.LARGE);

        Bus bus3 = new Bus(
                "Hyundai",
                "Universe",
                12.74, driverD3, Bus.Capacity.EXTRA_LARGE);

        Bus bus4 = new Bus(
                "ПАЗ",
                "Вектор Next",
                4.43, driverD4, Bus.Capacity.MIDDLE);


        Car car1 = new Car (
                "BMW",
                "X6",
                4.4, driverB1, Car.BodyType.TYPE6);

        Car car2 = new Car (
                "HAVAL",
                "Jolion",
                1.4,driverB2, Car.BodyType.TYPE1);

        Car car3 = new Car (
                "Lada",
                "ВАЗ-2106",
                1.6, driverB3,Car.BodyType.TYPE9 );

        Car car4 = new Car (
                "Chevrolet",
                "Impala",
                5.4, driverB4, Car.BodyType.TYPE5);


        Truck truck1 = new Truck(
                "IVECO",
                "EuroStar",
                12.8, driverC1, Truck.TruckCapacity.N1 );

        Truck truck2 = new Truck(
                "Hyundai",
                "Porter",
                2.5, driverC2, Truck.TruckCapacity.N3);

        Truck truck3 = new Truck(
                "Scania",
                "S-Series",
                16.0, driverC3,Truck.TruckCapacity.N2);

        Truck truck4 = new Truck(
                "VOLVO",
                "FH",
                16.0, driverC4, Truck.TruckCapacity.N3);


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


        printSeparation();



        car1.printType();
        car2.printType();
        car3.printType();
        car4.printType();
        truck1.printType();
        truck2.printType();
        truck3.printType();
        truck4.printType();
        bus1.printType();
        bus2.printType();
        bus3.printType();
        bus4.printType();


        printSeparation();
        testTransport( car1, car2, car3, car4,truck1,truck2,truck3,truck4, bus2);


    }



    private static void printInfo( Transport<?> transport){
        System.out.println( " Водитель " + transport.getDriver().getFullName() + " управляет автомобилем " + transport.getBrand() + " и будет участвовать в заезде. ");
    }




    public static void testTransport( Transport... transports) {
        int count = 0;
        for (Transport transport : transports)
            if (!transport.passDiagnostics()) {
                try {
                    throw new RuntimeException(transport.getBrand() + " " + transport.getModel() + " Не прошел диагностику! ");
                } catch (RuntimeException e) {
                    e.printStackTrace();
                }
            } else {
                count++;
            }
        System.out.println(" Диагностику прошли " + count + " из " + transports.length + " автомобилей") ;
    }


    }


