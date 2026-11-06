import java.util.Scanner;

public class CalculadoraGMRTE {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean rodando = true;
        while (rodando == true) {
            int operacao;
            System.out.printf("Operações matemáticas disponíveis: %nDigite 1 para adição%nDigite 2 para subtração%nDigite 3 para multiplicação%nDigite 4 para divisão%nDigite 0 para encerrar o programa%n");
            operacao = teclado.nextInt();

            if (operacao==0) {
                rodando = false;
                System.out.printf("Encerrando programa...%n");
                
            }

            else if (operacao==1) {
                System.out.println("Certo, adição. Qual o primeiro valor da soma? ");
                float valor1 = teclado.nextFloat();
                System.out.println("Qual o segundo valor? ");
                float valor2 = teclado.nextFloat();
                System.out.printf("%n%.1f + %.1f = %.1f %n%nVoltando ao início...%n%n", valor1, valor2, (valor1+valor2));

            }

            else if (operacao==2) {
                System.out.println("Certo, subtração. Qual o primeiro valor? ");
                float valor1 = teclado.nextFloat();
                System.out.println("Qual o segundo valor? ");
                float valor2 = teclado.nextFloat();
                System.out.printf("%n%.1f - %.1f = %.1f %n%nVoltando ao início...%n%n", valor1, valor2, (valor1-valor2));

            }

            else if (operacao==3) {
                System.out.println("Certo, multiplicação. Qual o primeiro fator? ");
                float fator1 = teclado.nextFloat();
                System.out.println("Qual o segundo fator? ");
                float fator2 = teclado.nextFloat();
                System.out.printf("%n%.1f x %.1f = %.1f %n%nVoltando ao início...%n%n", fator1, fator2, (fator1*fator2));
            }

            else if (operacao==4) {
                System.out.println("Certo, divisão. Qual o dividendo? ");
                float dividendo = teclado.nextFloat();
                System.out.println("Qual o divisor? ");
                float divisor = teclado.nextFloat();
                    if (divisor==0) {
                        System.out.printf("%nImpossível dividir por 0%n%nVoltando ao início...%n%n");
                    }
                    else {
                        System.out.printf("%n%.1f : %.1f = %.1f (Com resto %.1f) %n%nVoltando ao início...%n%n", dividendo, divisor, (dividendo/divisor), (dividendo%divisor));
                    }
                    
            }
        }
        teclado.close();
    }
}