package Interface;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Galo galo = new Galo();
        Pato pato = new Pato();

        System.out.printf("O cachorro %s\n ", cachorro.toString());
        System.out.printf("O gato %s\n ", gato.toString());
        System.out.printf("O galo %s \n ", galo.toString());
        System.out.printf("O pato %s \n ", pato.toString());
    }
}
