package bicicletas;

public class Ciclismo extends Bicicleta {
    private int espessuraPneu;

    public Ciclismo(int marcha, double velocidade, int espessuraPneu) {
        super(marcha, velocidade);
        this.espessuraPneu = espessuraPneu;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + "\nEspessura do Pneu: " + espessuraPneu;
    }
}