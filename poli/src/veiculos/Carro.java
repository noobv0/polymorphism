package veiculos;

public class Carro extends Veiculo {
    private int marcha;

    public Carro(String modelo, double velocidade, int passageiros, double combustivel, int marcha) {
        super(modelo, velocidade, passageiros, combustivel);
        this.marcha = marcha;
    }

    public void setVelocidade(double velocidade) {
        super.setVelocidade(velocidade);
        this.marcha = (int) Math.round(velocidade / 20.0); // atualiza a marcha conforme a velocidade
    }

    @Override
    public void acelerar(double novaVelocidade) {
        super.acelerar(novaVelocidade);
        this.marcha = (int) Math.round(getVelocidade() / 20.0); // atualiza a marcha conforme a nova velocidade
    }

    @Override
    public void freiar(double novaVelocidade) {
        super.freiar(novaVelocidade);
        this.marcha = (int) Math.round(getVelocidade() / 20.0); // atualiza a marcha conforme a nova velocidade
    }

    public String exibirDados() {
        return super.exibirDados() + "\nMarcha: " + marcha;
    }
}

