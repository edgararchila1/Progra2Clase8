package pkgPizzas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pizza {
    private String name;
    private String size; // Propiedad de tamaño
    private List<Topping> toppings = new ArrayList<>();

    public Pizza(String name, Topping... toppings) {
        this.name = name;

        for (Topping topping : toppings) {
            this.toppings.add(topping);
        }
    }

    // Método para obtener el precio de la pizza
    public double getPizzaPrice() {
        double price = 0;
        for (Topping topping : toppings) {
            price += topping.getPrecio();
        }
        return price;
    }

    // Método para agregar un ingrediente (Topping) a la pizza
    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    // Método para quitar un ingrediente de la pizza por índice
    public void removeTopping(int index) {
        this.toppings.remove(index);
    }

    // Método para obtener la lista de ingredientes de la pizza
    public List<Topping> getToppings() {
        return Collections.unmodifiableList(new ArrayList<>(toppings));
    }

    // Método para obtener el nombre de la pizza
    public String getName() {
        return name;
    }

    // Método para establecer el tamaño de la pizza
    public void setSize(String size) {
        this.size = size;
    }

    // Método para preparar la pizza
    public void prepare() {
        System.out.println("\nPreparing..... " + name);
        System.out.println("Size: " + size); // Mostrar el tamaño
        System.out.println("Adding toppings:");
        for (Topping topping : toppings) {
            System.out.println("- " + topping.getNombre());
            // Simular tiempo de preparación
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n*** TU PIZZA ESTA LISTA! ***");

    }
}