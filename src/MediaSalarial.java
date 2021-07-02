import java.util.Scanner;

public class MediaSalarial {
    public static void main(String[] args) {
        /*Criar um programa que calcule a média de salários de uma empresa,
        pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.
         */
        Scanner leitor = new Scanner(System.in);
        double salario;
        int qtde=0;
        double totalSal=0;
        double mediaSal;


        while (qtde < 5) {
            System.out.println("Digite o nome do funcionário:");
            leitor.next();
            System.out.println("Digite o salário do funcionário" );
            salario = leitor.nextDouble();
            totalSal = totalSal + salario;
            qtde = qtde + 1;
        }
        mediaSal = totalSal / 5;
        System.out.println("A média salárial de todos os funcionários é : " + mediaSal);
        leitor.close();
    }
}
