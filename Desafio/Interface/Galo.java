package Interface;

public class Galo implements Animais {
    @Override
    public String emitirSom() {
        return "cocoricó";
    }


    public String comer() {
        return "milho";
    }

    @Override
    public String toString() {
        return "faz " + this.emitirSom() + " e come " + this.comer();
    }
}
