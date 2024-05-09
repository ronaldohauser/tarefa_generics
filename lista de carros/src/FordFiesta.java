public class FordFiesta extends Carro {
    public FordFiesta(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void dirigir() {
        System.out.println("Ford Fiesta");
    }
}
