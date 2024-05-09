import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> listaCarros = new ArrayList<>();

        // Adição de carros à lista
        listaCarros.add(new HondaCivic("Honda", "Civic", 2022));
        listaCarros.add(new FordFiesta("Ford", "Fiesta", 2021));
        listaCarros.add(new ChevroletOnix("Chevrolet", "Onix", 2023));
        listaCarros.add(new ToyotaCorolla("Toyota", "Corolla", 2024));

        for (Carro carro : listaCarros) {
            carro.dirigir();
        }
    }
}
