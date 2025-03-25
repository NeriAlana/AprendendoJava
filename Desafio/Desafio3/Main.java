package Desafio3;

public class Main {
    public static void main(String[] args) {
        Processador processador3 = new Processador("intel", "I-9000", "3,2GHz");
        Memoria memoria3 = new Memoria("ryzen", "5-5500U", "8GB");
        PlacaMae placaMae3 = new PlacaMae("I7", "12-9000X", "3");
        DispositivoDeArmazenamento armazenamento = new DispositivoDeArmazenamento("ryzen",
        "8000X", "8GB","XXX");

        System.out.println(processador3.toString());
        System.out.println(memoria3.toString());
        System.out.println(placaMae3.toString());
        System.out.println(armazenamento.toString());
    }
}
