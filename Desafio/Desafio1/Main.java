package Desafio1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Alana", "32",
                "21/03/2025", "débito");
        Funcionario funcionario1 = new Funcionario("Mina", "33", "1165850",
                "advogada", "4.000,00");

        System.out.printf(cliente1.toString());
        System.out.printf(funcionario1.toString());
    }
}