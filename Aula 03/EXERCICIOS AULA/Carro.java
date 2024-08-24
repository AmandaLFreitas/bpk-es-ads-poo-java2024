public class Carro {
    public String modelo;
    public String marca;
    public int ano;
    public String cor;
    public int potencia;
    public double valor;
    public int vMaxima;

    public Carro(String modelo, String marca, int ano, String cor, int potencia, double valor, int vMaxima) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
        this.potencia = potencia;
        this.valor = valor;
        this.vMaxima = vMaxima;
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " (" + ano + "), " + cor.toUpperCase() +
                ", Potência: " + potencia + " cv, Valor: R$" + valor +
                ", Velocidade Máxima: " + vMaxima + " Km/h";

    }

    public void acelerar (int incremento) {
        System.out.println(marca + " " + modelo + " acelerando " + incremento + " Km/h.");
    }
    public void frear (int decremento) {
        System.out.println(marca + " " + modelo + "freando " + decremento + " Km/h.");
    }
}

