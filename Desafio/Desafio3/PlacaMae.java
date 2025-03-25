package Desafio3;

public class PlacaMae extends Produto{
    private String souete;

    public PlacaMae(String marca, String modelo, String souete) {
        super(marca, modelo);
        this.souete = souete;
    }

    public String getSouete() {
        return souete;
    }

    public void setSouete(String souete) {
        this.souete = souete;
    }

    @Override
    public String toString() {
        return "PlacaMae{" +
                "souete='" + souete + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}

