package pkgPizzas;

public class PizzaHawaiana extends Pizza {
    public PizzaHawaiana(String name) {
        super(name, new Topping("Jamón", 15), new Topping("Piña", 10));
    }

    // Sobrescribir el método prepare para imprimir un mensaje específico
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("\nSe ha agregado jamón y piña a la Pizza Hawaiana.");
    }
}
