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
        DriverB driverB3 = new DriverB("Алешин Максим Сергеевич, Категории В", true, 11);


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


        Transport car1 = new Car("Авто №1 ", " Модель №1", 1.6, driverB1, Car.BodyType.TYPE1, mechanics);
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




        Map<Transport<?>, List<Mechanic>> transportAndMechanics = new HashMap<>();


        transportAndMechanics.put(car2,mechanics);
        transportAndMechanics.put(car1,mechanics);
        transportAndMechanics.put(truck1,mechanics);
        System.out.println(transportAndMechanics);

       for (Map.Entry<Transport<?>,List<Mechanic>> entry : transportAndMechanics.entrySet()){
            System.out.println("Ключ : " + entry.getKey() + " Значение : " + entry.getValue());
       }


       Set < Object> drivers = new HashSet<>();
       drivers.add(driverB1);
       drivers.add(driverB2);
       drivers.add(driverC1);
       drivers.add(driverC2);
       drivers.add(driverD1);
       drivers.add(driverD2);
        drivers.add(driverB3);

        System.out.println(drivers);
        if (drivers.contains(driverC1) || drivers.contains(driverC2) ||drivers.contains(driverB1) || drivers.contains(driverB2) ||
                drivers.contains(driverD1) || drivers.contains(driverD2)){
            System.out.println( " Такой водитель уже есть!");
        }
        drivers.add(driverB3);




        Iterator<Object> iterDrivers = drivers.iterator();
        while (iterDrivers.hasNext()){
            System.out.println(iterDrivers.next());
        }

        }


    private static void printInfo(Transport<?> transport) {
        System.out.println(" Водитель " + transport.getDriver().getFullName() + " упарвляет автомобилем " + transport.getBrand() + " и будет участвовать в заезде. ");
    }




}







