public class Main {
    public static void main(String[] args) {

        // Instantiate objects of the Person class
        Honda honda2 = new Honda("CRV", 2015);
        Ford fordFiesta = new Ford();
        Audi audi1 = new Audi("A1", 2022);
        Bmw bmw1 = new Bmw("M3", 2022);
        Citroen citroen1 = new Citroen("C4", 2021);
        Fiat fiat1 = new Fiat("Mobi", 2023);
        MercedesBenz mercedesBenz1 = new MercedesBenz("AMG GTR", 2023);
        Porsche porsche1 = new Porsche("911 GT3 RS", 2020);
        Toyota toyota1 = new Toyota("Yaris", 2023);

        // Use setters to initialize properties of fordFiesta
        fordFiesta.setModel("Focus");
        fordFiesta.setYear(2019);

        // Printing objects
        System.out.println("Honda: Model - " + honda2.getModel() + ", Year - " + honda2.getYear());
        System.out.println("Ford: Model - " + fordFiesta.getModel() + ", Year - " + fordFiesta.getYear());
        System.out.println("Audi: Model - " + audi1.getModel() + ", Year - " + audi1.getYear());
        System.out.println("BMW: Model - " + bmw1.getModel() + ", Year - " + bmw1.getYear());
        System.out.println("Citroen: Model - " + citroen1.getModel() + ", Year - " + citroen1.getYear());
        System.out.println("Fiat: Model - " + fiat1.getModel() + ", Year - " + fiat1.getYear());
        System.out.println("MercedesBenz: Model - " + mercedesBenz1.getModel() + ", Year - " + mercedesBenz1.getYear());
        System.out.println("Porsche: Model - " + porsche1.getModel() + ", Year - " + porsche1.getYear());
        System.out.println("Toyota: Model - " + toyota1.getModel() + ", Year - " + toyota1.getYear());

        System.out.println();

    }
}