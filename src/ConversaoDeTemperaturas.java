import java.util.Scanner;

public class ConversaoDeTemperaturas {
    public static void main(String[] args) {
        //  crie um programa que converta temperatura Celsius em outras variaveis
        Scanner leitor = new Scanner(System.in);
        double conversao;
        double ceusius;
        byte opcao;
        System.out.println("Digite a temperatura em Graus Celsius");
        ceusius = leitor.nextDouble();
        System.out.println("Escolha a opção de conversão desejada:\n(1) Kelvin\n(2) Réaumur\n(3) Rankine\n(4) Fahrenheit");
         opcao = leitor.nextByte();
        switch (opcao) {
            case 1:
                  conversao = ceusius + 273.15;
                System.out.println("A Conversão de " + ceusius + "°C para Kelvin é:\n" + conversao + "°K");
                break;
            case 2:
                conversao = ceusius * 0.8;
                System.out.println("A Conversão de " + ceusius + "°C para Réaumur é:\n" + conversao + "°RE");
                break;
            case 3:
                conversao = ceusius * 1.8 + 32 + 459.67;
                System.out.println("A Conversão de " + ceusius + "°C para Rankine é:\n" + conversao + "°RA");
                break;
            case 4:
                conversao = ceusius * 1.8 + 32;
                System.out.println("A Conversão de " + ceusius + "°C para Rankine é:\n" + conversao + "°F");
                break;
            default:
                System.out.println("Opção invalida, digite uma das opções acima");

        }



    }
}
