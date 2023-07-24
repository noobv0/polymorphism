package bicicletas;

public class MountainBike extends Bicicleta {
    private String suspensao;

    public MountainBike(int marcha, double velocidade, String suspensao) {
        super(marcha, velocidade);
        this.suspensao = suspensao;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + "\nSuspensão: " + suspensao;
    }
}
