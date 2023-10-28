public class Main {
    public static void main(String[] args) {

        // Instantiate objects of the Person class
        Honda hondaCrv = new Honda("CRV", 2015);
        Ford fordFiesta = new Ford();
        Audi audiA1 = new Audi("A1", 2022);
        Bmw bmwM3 = new Bmw("M3", 2022);
        Citroen citroenC4 = new Citroen("C4", 2021);
        Fiat fiatMobi = new Fiat("Mobi", 2023);
        MercedesBenz mercedesBenzAmgGtr = new MercedesBenz("AMG GTR", 2023);
        Porsche porsche911Gt3Rs = new Porsche("911 GT3 RS", 2020);
        Toyota toyotaYaris = new Toyota("Yaris", 2023);

        // Use setters to initialize properties of fordFiesta
        fordFiesta.setModel("Focus");
        fordFiesta.setYear(2019);

        // Printing objects
        System.out.println("Honda: Model - " + hondaCrv.getModel() + ", Year - " + hondaCrv.getYear());
        System.out.println("Ford: Model - " + fordFiesta.getModel() + ", Year - " + fordFiesta.getYear());
        System.out.println("Audi: Model - " + audiA1.getModel() + ", Year - " + audiA1.getYear());
        System.out.println("BMW: Model - " + bmwM3.getModel() + ", Year - " + bmwM3.getYear());
        System.out.println("Citroen: Model - " + citroenC4.getModel() + ", Year - " + citroenC4.getYear());
        System.out.println("Fiat: Model - " + fiatMobi.getModel() + ", Year - " + fiatMobi.getYear());
        System.out.println("MercedesBenz: Model - " + mercedesBenzAmgGtr.getModel() + ", Year - " + mercedesBenzAmgGtr.getYear());
        System.out.println("Porsche: Model - " + porsche911Gt3Rs.getModel() + ", Year - " + porsche911Gt3Rs.getYear());
        System.out.println("Toyota: Model - " + toyotaYaris.getModel() + ", Year - " + toyotaYaris.getYear());

        System.out.println();

    }
}