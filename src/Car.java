/**
 * Representa la información de un coche con su fabricante, modelo, año y precio.
 */
public class Car {
    /**
     * Fabricante del coche.
     */
    private String make;
    /**
     * Modelo del coche.
     */
    private String model;
    /**
     * Año de fabricación del coche.
     */
    private int year;
    /**
     * Precio del coche.
     */
    private double price;

    /**
     * Constructor para la creación del coche
     * 
     * @param make Cadena de texto con el nombre del fabricante.
     * @param model Cadena de texto con el modelo del coche.
     * @param year Número entero que representa el año de fabricación del coche.
     * @param price Número decimal que representa el precio del coche.
     */
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Utiliza la información del coche para crear una cadena de texto descriptiva sobre el mismo.
     * 
     * <h3>Ejemplo de uso:</h3>
     * <p>A continuación se muestra un ejemplo de entrada y su salida esperada:</p>
     * 
     * <pre>{@code
     * Car car = new Car("Toyota", "Corolla", 2025, 26800);
     * car.carDescription();
     * // Devuelve "The car is a 2025 Toyota Corolla priced at $26800"
     * }</pre>
     * 
     * 
     * @return breve descripción sobre el coche.
     */
    public String carDescription() {
        return "The car is a " + year + " " + make + " " + model + " priced at $" + price;
    }

    /**
     * Convierte la descripción del coche en una cadena de texto legible.
     */
    @Override
    public String toString() {
        return carDescription();
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2025, 26800);
        System.out.println(car);
    }
}