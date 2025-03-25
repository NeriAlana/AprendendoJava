package Desafio2;

public class Main {
    public static void main(String[] args) {
        Processador processador1 = new Processador("intel", "i9-12900k", "3.2GHz");
        Memoria memoria1 = new Memoria("ADM Ryzen", "9 5950X", "64MG");

        System.out.println(processador1.toString());
        System.out.println(memoria1.toString());
    }
}
