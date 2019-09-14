package models;

public class Carro {
    private String modelo;
    private int ano;
    private int qtd_portas;

    public Carro() {

    }

    public Carro(String modelo, int ano, int qtd_portas) {
        this.modelo = modelo;
        this.ano = ano;
        this.qtd_portas = qtd_portas;

    }

    public String get_modelo() {
        return this.modelo;
    }

    public void set_modelo(String modelo) {
        this.modelo = modelo;
    }

    public int get_ano() {
        return this.ano;
    }

    public void set_ano(int ano) {
        this.ano = ano;
    }

    public int get_qtd_portas() {
        return this.qtd_portas;
    }

    public void set_qtd_portas(int qtd_portas) {
        this.qtd_portas = qtd_portas;
    }

    @Override
    public String toString() {
        return String.format("Modelo: %s Ano: %d QtdPortas: %d", this.modelo, this.ano, this.qtd_portas);

    }
}