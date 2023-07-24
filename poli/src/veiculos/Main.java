package veiculos;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("Veículo Genérico", 0.0, 4, 50.0);
        System.out.println(veiculo1.exibirDados());

        Carro carro1 = new Carro("Carro Esportivo", 0.0, 2, 40.0, 0);
        System.out.println(carro1.exibirDados());

        veiculo1.acelerar(50.0);
        System.out.println(veiculo1.exibirDados());

        carro1.acelerar(50.0);
        System.out.println(carro1.exibirDados());

        veiculo1.freiar(30.0);
        System.out.println(veiculo1.exibirDados());

        carro1.freiar(30.0);
        System.out.println(carro1.exibirDados());
    }
}
