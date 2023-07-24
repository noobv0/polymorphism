package veiculos;

public class Veiculo {
    private String modelo;
    private double velocidade;
    private int passageiros;
    private double combustivel;

    public Veiculo(String modelo, double velocidade, int passageiros, double combustivel) {
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.passageiros = passageiros;
        this.combustivel = combustivel;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    public void acelerar(double novaVelocidade) {
        velocidade += novaVelocidade;
        combustivel -= novaVelocidade * 0.05;
    }

    public void freiar(double novaVelocidade) {
        velocidade -= novaVelocidade;
    }

    public String exibirDados() {
        return "Modelo: " + modelo + "\nVelocidade: " + velocidade + " km/h\nPassageiros: " + passageiros + "\nCombustível: " + combustivel + " litros";
    }
}