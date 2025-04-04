package Interface;

public class Cachorro implements Animais {
    @Override
    public String emitirSom() {
        return "auau";
    }

    public String comer() {
        return "ração";
    }

    @Override
    public String toString() {
        return "faz " + this.emitirSom() + " e come " + this.comer();
    }
}
