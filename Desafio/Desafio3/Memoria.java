package Desafio3;

public class Memoria extends Produto{
    private String capacidadeDeArmazenamento;

    public Memoria(String marca, String modelo, String capacidadeDeArmazenamento) {
        super(marca, modelo);
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    public String getCapacidadeDeArmazenamento() {
        return capacidadeDeArmazenamento;
    }

    public void setCapacidadeDeArmazenamento(String capacidadeDeArmazenamento) {
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    @Override
    public String toString() {
        return "Memoria{" +
                "capacidadeDeArmazenamento='" + capacidadeDeArmazenamento + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
