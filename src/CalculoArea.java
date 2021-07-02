import java.util.Scanner;

public class CalculoArea {
    public static void main(String[] args) {
        /*Uma parede em formato retangular, cuja altura é hp (altura da parede)
         e a largura lp (largura da parede) precisa ser coberta por azulejos
         também retangulares. O azulejo retangular tem dimensões ha (altura do azulejo)
          e la (largura do azulejo). Escreva um programa que leia as quatro medidas
           hp, lp, ha e la, calcule e imprima quanto azulejos com as medidas dadas
           são necessários para cobrir a parede dada.
         */
        Scanner leitor = new Scanner(System.in);
        double hp;
        double lp;
        double ha;
        double la;
        double areaP;
        double areA;
        double qtdeA;
        System.out.println("Digite a altura da parede :");
        hp = leitor.nextDouble();
        System.out.println("Digite a largura da parede :");
        lp = leitor.nextDouble();
        System.out.println("Agora..........");
        System.out.println("Digite a altura do azulejo :");
        ha = leitor.nextDouble();
        System.out.println("Digite a largura do azulejo");
        la = leitor.nextDouble();

        areaP = hp * lp;
        areA = ha * la;

        qtdeA = areaP / areA;
        System.out.println("A quantidade necessaria de azulejo para a sua parede é : " + qtdeA);
        leitor.close();
    }
}
