public class Main {

    public static void printSeparation() {
        System.out.println(" ================== ");
    }

    public static void printSeparation1() {
        System.out.println("          *****Задание № 1 *****          ");
    }

    public static void printSeparation2() {
        System.out.println("          *****Задание № 2 и № 3 *****          ");
    }

    public static void main(String[] args) {
        printSeparation1();

        Car car1 = new Car();
        car1.setBrand("Lada");
        car1.setModel("Granta");
        car1.setEngineVolume(1.7);
        car1.setColor("Желтый");
        car1.setYear(2015);
        car1.setCountry("Россия");
        System.out.println(car1);

        printSeparation();

        Car car2 = new Car();
        car2.setBrand("Audi");
        car2.setModel("A8 50 L TDI quattro");
        car2.setEngineVolume(3.0);
        car2.setColor("Черный");
        car2.setYear(2020);
        car2.setCountry("Германия");
        System.out.println(car2);


        printSeparation();

        Car car3 = new Car();
        car3.setBrand("BMW");
        car3.setModel("Z8");
        car3.setEngineVolume(3.0);
        car3.setColor("Черный");
        car3.setYear(2021);
        car3.setCountry("Германия");
        System.out.println(car3);

        printSeparation();

        Car car4 = new Car();
        car4.setBrand("Kia");
        car4.setModel("Sportage 4-го поколения");
        car4.setEngineVolume(2.4);
        car4.setColor("Красный");
        car4.setYear(2018);
        car4.setCountry("Южная Корея");
        System.out.println(car4);


        printSeparation();

        Car car5 = new Car();
        car5.setBrand("Hyundai");
        car5.setModel("Avante");
        car5.setEngineVolume(1.6);
        car5.setColor("Оранжевый");
        car5.setYear(2016);
        car5.setCountry("Южная Корея");
        System.out.println(car5);

        printSeparation2();

        Car carLada = new Car(" Lada ", null, 2015,  " Россия ", " Желтый ", 0);
        Car carAudi = new Car(" Audi ", " A8 50 L TDI quattro ", 2020, " Германия ", " Черный ",3.0);
        Car carBMW = new Car(" BMW ", " Z8 ", 2021, " Германия ", "",3.0);
        Car carKia = new Car(" Kia ", " Sportage 4-го поколения ", 0, " Южная Корея ", " Красный ",2.4);
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