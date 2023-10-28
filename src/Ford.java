public class Ford {
    private String model;
    private int year;

    // Constructor with no parameters
    public Ford() {
        // Default constructor
    }

    // Constructor with parameters
    public Ford(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Getter for model
    public String getModel() {
        return model;
    }

    // Setter for model
    public void setModel(String model) {
        this.model = model;
    }

    // Getter for year
    public int getYear() {
        return year;
    }

    // Setter for year
    public void setYear(int year) {
        this.year = year;
    }
}
