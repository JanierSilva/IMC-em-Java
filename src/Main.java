import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //float peso;
        //float altura;        

        //Objeto
        Pessoa objetoPessoa = new Pessoa();
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        objetoPessoa.peso = leitor.nextFloat();
        System.out.println("Digite sua altura: ");
        objetoPessoa.altura = leitor.nextFloat();

        //imc = peso / (altura * altura); modo estrututal para modo POO
        System.out.println("IMC = "+ objetoPessoa.calcularIMC());
    }
}