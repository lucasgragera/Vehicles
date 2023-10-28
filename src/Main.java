public class Main {
    public static void main(String[] args) {
        // Instantiate objects of the Person class
        Ford ford1 = new Ford("Fiesta", 2018);
        Honda honda2 = new Honda("CRV", 2015);
        Ford ford3 = new Ford();
        Audi audi1 = new Audi("A1", 2022);
        Bmw bmw1 = new Bmw("M3", 2022);
        Citroen citroen1 = new Citroen("C4", 2021);
        Fiat fiat1 = new Fiat("Mobi", 2023);
        MercedesBenz mercedesBenz1 = new MercedesBenz("AMG GTR", 2023);
        Porsche porsche1 = new Porsche("911 GT3 RS", 2020);
        Toyota toyota1 = new Toyota("Yaris", 2023);

        // Use setters to initialize properties of person1
        ford3.setModel("Focus");
        ford3.setYear(2019);

        // Access and display properties using getters
        System.out.println("Ford 1: Model - " + ford1.getModel() + ", Year - " + ford1.getYear());
        System.out.println("Honda 2: Model - " + honda2.getModel() + ", Year - " + honda2.getYear());
        System.out.println("Ford 3: Model - " + ford3.getModel() + ", Year - " + ford3.getYear());
        System.out.println("Audi 1: Model - " + audi1.getModel() + ", Year - " + audi1.getYear());
        System.out.println("BMW 1: Model - " + bmw1.getModel() + ", Year - " + bmw1.getYear());
        System.out.println("Citroen 1: Model - " + citroen1.getModel() + ", Year - " + citroen1.getYear());
        System.out.println("Fiat 1: Model - " + fiat1.getModel() + ", Year - " + fiat1.getYear());
        System.out.println("MercedesBenz 1: Model - " + mercedesBenz1.getModel() + ", Year - " + mercedesBenz1.getYear());
        System.out.println("Porsche 1: Model - " + porsche1.getModel() + ", Year - " + porsche1.getYear());
        System.out.println("Toyota 1: Model - " + toyota1.getModel() + ", Year - " + toyota1.getYear());

        System.out.println();

    }
}