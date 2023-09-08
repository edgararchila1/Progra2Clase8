package pkgPizzas;

public class PizzaCarnivora extends Pizza {
    public PizzaCarnivora(String name) {
        super(name, new Topping("Jamón", 15), new Topping("Tocino", 20));
    }

    // Sobrescribir el método prepare para imprimir un mensaje específico
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("\n ha agregado jamón y tocino a la Pizza Carnivora.");
    }
}
