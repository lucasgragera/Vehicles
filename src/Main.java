public class Main {
    public static void main(String[] args) {
        // Instantiate objects of the Person class
        Ford ford1 = new Ford("Fiesta", 2018);
        Honda honda2 = new Honda("CRV", 2015);
        Ford ford3 = new Ford();
        Audi audi1 = new Audi("A1", 2022);

        // Use setters to initialize properties of person1
        ford3.setModel("Focus");
        ford3.setYear(2019);

        // Access and display properties using getters
        System.out.println("Ford 1: Model - " + ford1.getModel() + ", Year - " + ford1.getYear());
        System.out.println("Honda 2: Model - " + honda2.getModel() + ", Year - " + honda2.getYear());
        System.out.println("Ford 3: Model - " + ford3.getModel() + ", Year - " + ford3.getYear());
        System.out.println("Audi 1: Model - " + audi1.getModel() + ", Year - " + audi1.getYear());

        System.out.println();

    }
}