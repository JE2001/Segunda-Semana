import java.util.Scanner;
public class testeCalCient {
    public static void main(String... args) { //var args
        Scanner leitor = new Scanner (System.in);
        CalculadoraCientifica c = new CalculadoraCientifica();
        System.out.println("1-RaizInteiro\n2-RaizDouble\n3-RaizString\n4-PotenciaçãoByte\n5-PotenciaçãoString\n6-PotenciaçãoIntDouble");
        int opcao = leitor.nextInt();
        double resultado = 0.0;
        //polimorfismo: multiplo, forma
        //
        switch(opcao){
            case 1:
            System.out.println("Qual o número?: ");
            final int operando1 = leitor.nextInt();
            resultado = c.raiz1 (operando1);
            break;
            case 2:
            System.out.println("Qual o número?: ");
            final double operando2 = leitor.nextDouble();
            resultado = c.raiz2 (operando2);
            case 3:
            System.out.println("Qual o número?: ");
            final String operando3 = leitor.next();
            resultado = c.raiz3 (operando3);
            break;
            case 4:
            System.out.println("Qual o primeiro número?: ");
            final byte operando4 = leitor.nextByte();
            System.out.println("Qual o segundo número?: ");
            final byte operando5 = leitor.nextByte();
            resultado = c.pot1 (operando4, operando5);
            break;
            case 5:
            System.out.println("Qual o primeiro número?: ");
            final String operando6 = leitor.next();
            System.out.println("Qual o segundo número?: ");
            final String operando7 = leitor.next();
            resultado = c.pot2 (operando6, operando7);
            break;
            case 6:
            System.out.println("Qual o primeiro número?: ");
            final int operando8 = leitor.nextInt();
            System.out.println("Qual o segundo número?: ");
            final double operando9 = leitor.nextDouble();
            resultado = c.pot3 (operando8, operando9);
            break;
            default:
            System.out.println("Opção Inválida");
            leitor.close();
            return;

        }
        System.out.printf("Resultado: %d\n", resultado);
        leitor.close();
    }
    
}
