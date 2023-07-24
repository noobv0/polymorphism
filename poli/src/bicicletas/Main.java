package bicicletas;

public class Main {
    public static void main(String[] args) {

        Bicicleta bicicleta1 = new Bicicleta(3, 20.0);
        System.out.println(bicicleta1.exibirDados());

        MountainBike mountainBike1 = new MountainBike(6, 25.0, "dupla");
        System.out.println(mountainBike1.exibirDados());

        Ciclismo ciclismo1 = new Ciclismo(1, 10.0, 40);
        System.out.println(ciclismo1.exibirDados());


        bicicleta1.exibirDados();
        mountainBike1.exibirDados();
        ciclismo1.exibirDados();
    }
}
