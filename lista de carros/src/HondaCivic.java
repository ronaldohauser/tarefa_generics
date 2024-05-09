public class HondaCivic extends Carro {
    public HondaCivic(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void dirigir() {
        System.out.println("Honda Civic");
    }
}
