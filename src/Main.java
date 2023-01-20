import transport.Bus;
import transport.Car;

import java.time.LocalDate;

public class Main {

    public static void printSeparation() {
        System.out.println(" ================== ");
    }

    public static void main(String[] args) {

        Car carLada = new Car( "Lada", "Granta", 2015, "Россия", "желтый",150,"седан",
                false, "МКПП","и015ка199",4,3.0,
                new Car.Key( true, true));

        Car carAudi = new Car("Audi", "50 L TDI quattro",2020, "Германия","черный", 200,
                "седан", false, "Вариатор", "р889ка179",4, 3.0,
                new Car.Key( false, false));

        Car carBMW = new Car( "BMW", "Z8", 2021, "Германия","черный", -250,
                "родстер", true, "АКПП", "и007ос099", 2, 3.0,
                new Car.Key( false, true));

        Car carKia = new Car("Kia", "Sportage 4-го поколения",2020, "Южная Корея", "Красный", 200,
                "кроссовер", false, "АКПП", "а000аа37",5,2.4,
                new Car.Key( true, false));
        Car carHyundai = new Car( "Hyundai", "Avante",2016,"Южная Корея", "Оранжевый", 160,
                "седан", false, "МКПП", "с065мк199", 5, 1.6,
                new Car.Key( true, true));




        System.out.println(carLada );
        printSeparation();
        System.out.println(carAudi);
        printSeparation();
        System.out.println(carBMW);
        printSeparation();
        System.out.println(carKia);
        printSeparation();
        System.out.println(carHyundai);
        printSeparation();


        Bus bus1 = new Bus(
                "ЛиАЗ",
                "5292",
                2004,
                "Россия",
                "Белый",
                90);

        Bus bus2 = new Bus(
                "Volvo",
                "9500",
                2010,
                "Швеция",
                "Серебристый",
                110);

        Bus bus3 = new Bus(
                "Scania",
                "OmniLink",
                1998,
                "Швеция",
                "Черный",
                100);

        System.out.println(bus1);
        printSeparation();
        System.out.println(bus2);
        printSeparation();
        System.out.println(bus3);
    }
}