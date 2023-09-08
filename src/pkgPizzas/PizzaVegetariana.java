package pkgPizzas;

public class PizzaVegetariana extends Pizza {
    public PizzaVegetariana(String name) {
        super(name, new Topping("Pimientos", 12), new Topping("Cebolla", 8));
    }

    // Sobrescribir el método prepare para imprimir un mensaje específico
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("\nSe han agregado pimientos y cebolla a la Pizza Vegetariana.");
    }
}