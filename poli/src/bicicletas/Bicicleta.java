package bicicletas;

public class Bicicleta {
    private int marcha;
    private double velocidade;

    public Bicicleta(int marcha, double velocidade) {
        this.marcha = marcha;
        this.velocidade = velocidade;
    }

    public String exibirDados() {
        return "Marcha: " + marcha + "\nVelocidade: " + velocidade;
    }
}
