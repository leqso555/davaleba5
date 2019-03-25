public class Car {
    private String Model;
    private String category;
    private String wheel;
    private String color;

    public Car(String model, String transmission, String wheel,  String interiorColor) {
        Model = model;
        this.category = transmission;
        this.wheel = wheel;

        this.color = interiorColor;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return  this.getModel() + " "+ this.getCategory()+ " "+ this.getWheel()+ " "+ this.getColor();
    }
}
