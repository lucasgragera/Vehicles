public class Honda {
    private String model;
    private int year;

    // Constructor with no parameters
    public Honda() {
        // Default constructor
    }

    // Constructor with parameters
    public Honda(String model, int year) {
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