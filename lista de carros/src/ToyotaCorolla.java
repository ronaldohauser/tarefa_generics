public class ToyotaCorolla extends Carro {
    public ToyotaCorolla(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void dirigir() {
        System.out.println("Toyota Corolla");
    }
}
