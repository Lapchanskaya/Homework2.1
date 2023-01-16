import transport.Car;

public class Main {

    public static void printSeparation() {
        System.out.println(" ================== ");
    }

    public static void main(String[] args) {

        Car carLada = new Car(" Lada ", "Granta", 2015,  " Россия ", " Желтый ", 0);
        Car carAudi = new Car(" Audi ", " A8 50 L TDI quattro ", 2020, " Германия ", " Черный ",3.0);
        Car carBMW = new Car(" BMW ", " Z8 ", 2021, " Германия ", "",3.0);
        Car carKia = new Car(" Kia ", " Sportage 4-го поколения ", 2020, " Южная Корея ", " Красный ",2.4);
        Car carHyundai = new Car(" Hyundai ", " Avante ", 2016, " Южная Корея ", " Оранжевый ",0);


        System.out.println(carLada);
        printSeparation();
        System.out.println(carAudi);
        printSeparation();
        System.out.println(carBMW);
        printSeparation();
        System.out.println(carKia);
        printSeparation();
        System.out.println(carHyundai);



    }
}