import java.util.Scanner;

public class DadosDePessoas {
    public static void main(String[] args) {
        /*Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino)
         de 10 pessoas. Fazer um algoritmo que calcule e escreva:
         a. a maior e a menor altura do grupo;
         b. média de altura dos homens;
         c. o número de mulheres.
         */
        Scanner leitor = new Scanner(System.in);
        int sexo;
        int sexoM=0;
        int sexoF=0;
        int pessoas=0;
        double altura=0;
        double alturaMin=10000;
        double alturaMax=0;
        double somaAltura=0;
        double mediaAltura;


        while (pessoas < 10) {
            System.out.println("Digite o número do seu sexo: (1) Masculino e (2) Feminino");
            sexo = leitor.nextByte();
            if (sexo == 1) {
                somaAltura = somaAltura + altura;
                sexoM = sexoM + 1;

            }else if (sexo == 2) {
                sexoF = sexoF + 1;
            }
            System.out.println("Digite a sua altura:");
            altura = leitor.nextDouble();
            if (altura > alturaMax)   {
                alturaMax =  altura;
            }
            if (altura < alturaMin) {
                alturaMin = altura;
            }
            pessoas = pessoas + 1;
        }
        mediaAltura = alturaMax / 10;
        System.out.println("A quantidades de homens são: " + sexoM );
        System.out.println("A quantidades de mulheres são: " + sexoF);
        System.out.println("A pessoa que tem a maior altura tem: " + alturaMax);
        System.out.println("A pessoa que tem a maior altura tem: " + alturaMin);
        System.out.println("A soma de todas as pessoas masculinas são: " + somaAltura);
        System.out.println("A média de altura dos homens são: " + mediaAltura);
        leitor.close();
    }

}
