
public class Circle{

    private double radius;

    // Para
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        // Creating a circle object with radius 3.0
        Circle circle = new Circle(3.0);

        // Calculating the circumference
        double circumference = circle.calculateCircumference();

        // Printing the circumference of the circle
        System.out.println("Circumference of the circle with radius " + circle.radius + " is: " + circumference);
    }
}
    
