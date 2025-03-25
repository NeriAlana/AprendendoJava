package Desafio5;

public class Main {
    public static void main(String[] args) {
        Endereco enderecoEngenheiro = new Endereco("rua A", "11-E", "", "5468-5", "Salvador");
        Endereco enderecoMedico = new Endereco("rua B", "90", "", "54879-7", "Salvador");


        Engenheiro engenheiro1 = new Engenheiro("Carlos", "carlos2hotmail.com",
                8000.00f, enderecoEngenheiro, "5468-5");
        Medico medico1 = new Medico("Helena", "helena@hotmail.com", 9000.00f, enderecoMedico , "54879-7");

        System.out.println(engenheiro1.toString());
        System.out.println(medico1.toString());
    }
}
