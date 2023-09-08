package pkgPizzas;

public class PizzaPepperoni extends Pizza {
    public PizzaPepperoni(String name) {
        super(name, new Topping("Pepperoni", 18));
    }

    // Sobrescribir el método prepare para imprimir un mensaje específico
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("\nSe ha agregado pepperoni a la Pizza Pepperoni.");
    }
}