public class Audi {
    private String model;
    private int year;

    // Constructor with no parameters
    public Audi() {
        // Default constructor
    }

    // Constructor with parameters
    public Audi(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Getter for name
    public String getModel() {
        return model;
    }

    // Setter for name
    public void setModel(String model) {
        this.model = model;
    }

    // Getter for age
    public int getYear() {
        return year;
    }

    // Setter for age
    public void setYear(int year) {
        this.year = year;
    }
}
