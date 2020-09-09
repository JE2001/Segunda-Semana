import java.util.Scanner;
public class testeImpressora {
    public static void main(final String... args){
        final Scanner leitor = new Scanner (System.in);

        final String menu = "1-Um único float\n2-Dois Floats\n3-Um Float e Uma String\n4-uma String e um float\n5-três Strings\n6-dois ints e uma String";

        System.out.println(menu);
   
        final int opTipo = leitor.nextInt();

        Impressora imprimir = new Impressora();

        if (opTipo == 1){
           System.out.println("Qual o primeiro número?: ");
           final float exibicao1 = leitor.nextFloat();
           imprimir.Exibir(exibicao1);

        }else if (opTipo == 2){
            System.out.println("Qual o primeiro número?: ");
            final float exibicao1 = leitor.nextFloat();
            System.out.println("Qual o segundo número?: ");
            final float exibicao2 = leitor.nextFloat();
            imprimir.Exibir1(exibicao1, exibicao2);

        }else if (opTipo == 3){
            System.out.println("Qual o primeiro número?: ");
            final float exibicao1 = leitor.nextFloat();
            System.out.println("Qual o segundo número?: ");
            final String exibicao2 = leitor.next();
            imprimir.Exibir2(exibicao1, exibicao2);
        }else if (opTipo == 4){
            System.out.println("Qual o primeiro número?: ");
            final String exibicao1 = leitor.next();
            System.out.println("Qual o segundo número?: ");
            final float exibicao2 = leitor.nextFloat();
            imprimir.Exibir3(exibicao1, exibicao2);
        }
        else if (opTipo == 5){
            System.out.println("Qual o primeiro número?: ");
            final String exibicao1 = leitor.next();
            System.out.println("Qual o primeiro número?: ");
            final String exibicao2 = leitor.next();
            System.out.println("Qual o primeiro número?: ");
            final String exibicao3 = leitor.next();
            imprimir.Exibir4(exibicao1, exibicao2, exibicao3);
        }
        else if (opTipo == 6){
            System.out.println("Qual o primeiro número?: ");
            final int exibicao1 = leitor.nextInt();
            System.out.println("Qual o primeiro número?: ");
            final int exibicao2 = leitor.nextInt();
            System.out.println("Qual o primeiro número?: ");
            final String exibicao3 = leitor.next();
            imprimir.Exibir5(exibicao1, exibicao2, exibicao3);
        }
        leitor.close();
    }
}