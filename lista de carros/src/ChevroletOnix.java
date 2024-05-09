public class ChevroletOnix extends Carro {
    public ChevroletOnix(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void dirigir() {
        System.out.println("Chevrolet Onix");
    }
}
