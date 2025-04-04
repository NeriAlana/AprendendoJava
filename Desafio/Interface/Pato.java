package Interface;

public class Pato implements Animais{
    @Override
    public String emitirSom() {
        return "quaquá";
    }


    public String comer() {
        return "milho moído";
    }

    @Override
    public String toString() {
        return "faz " + this.emitirSom() + " e come " + this.comer();
    }
}
