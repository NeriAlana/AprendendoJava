package Desafio4;

public class Main {
    public static void main(String[] args) {
         Fisica fisica = new Fisica("Alana", "71911111111", "12344456874", "1370862944", "19/06/1992");
         Juridica juridica =  new Juridica("Petrobras", "75988796544", "78945612377/0001", "00012-4");

        System.out.println(fisica.toString());
        System.out.println(juridica.toString());
    }
}
