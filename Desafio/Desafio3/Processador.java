package Desafio3;

public class Processador extends Produto {
    private String freuencia;

    public Processador(String marca, String modelo, String freuencia) {
        super(marca, modelo);
        this.freuencia = freuencia;
    }

    public String getFreuencia() {
        return freuencia;
    }

    public void setFreuencia(String freuencia) {
        this.freuencia = freuencia;
    }

    @Override
    public String toString() {
        return "Processador{" +
                "freuencia='" + freuencia + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
