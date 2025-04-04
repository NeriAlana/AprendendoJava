package Interface;

public class Gato implements Animais{
    @Override
    public String emitirSom() {
        return "miau";
    }

    @Override
    public String comer() {
        return "peixe";
    }

    @Override
    public String toString() {
        return "faz " + this.emitirSom() + " e come " + this.comer();
    }
}
