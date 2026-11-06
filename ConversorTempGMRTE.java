import java.util.Scanner;

public class ConversorTempGMRTE {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Qual tipo de temperatura quer converter?%nDigite C para Celsius%nDigite F para Fahrenheit%nDigite K para Kelvin%nDigite S para sair do programa%n");
        String escalatemp1 = teclado.next();
        if (escalatemp1.equalsIgnoreCase("S")) {
            System.out.printf("%nEncerrando programa...");
        }
        else if (escalatemp1.equalsIgnoreCase("C")) {
            System.out.printf("%nQuer converter a temperatura de Celsius para qual escala?%nDigite F para Fahrenheit%nDigite K para Kelvin%n");
                String escalatemp2 = teclado.next();
                if (escalatemp2.equalsIgnoreCase("F")) {
                    System.out.printf("Certo, de Celsius para Fahrenheit%n%nDigite o valor em Celsius para converter%n");
                    float valor = teclado.nextFloat();
                    System.out.printf("%n%.1f°C = %.1f°F%n", valor, (valor*1.8+32));
                }
                else if (escalatemp2.equalsIgnoreCase("K")) {
                    System.out.printf("Certo, de Celsius para Kelvin%n%nDigite o valor em Celsius para converter%n");
                    float valor = teclado.nextFloat();
                    System.out.printf("%n%.1f°C = %.1f°K%n", valor, (valor+273));

                }
                else {
                    System.out.println("Erro, encerrando programa...");

                }
        }
        else if (escalatemp1.equalsIgnoreCase("F")) {
            System.out.printf("%nQuer converter a temperatura de Fahrenheit para qual escala?%nDigite C para Celsius%nDigite K para Kelvin%n");
                String escalatemp2 = teclado.next();
                if (escalatemp2.equalsIgnoreCase("C")) {
                    System.out.printf("Certo, de Fahrenheit para Celsius%n%nDigite o valor em Fahrenheit para converter%n");
                    float valor = teclado.nextFloat();
                    System.out.printf("%n%.1f°F = %.1f°C%n", valor, ((valor-32)/1.8));
                }
                else if (escalatemp2.equalsIgnoreCase("K")) {
                    System.out.printf("Certo, de Fahrenheit para Kelvin%n%nDigite o valor em Fahrenheit para converter%n");
                    float valor = teclado.nextFloat();
                    System.out.printf("%n%.1f°F = %.1f°K%n", valor, ((valor-32)/1.8+273));

                }
                else {
                    System.out.println("Erro, encerrando programa...");

                }
        }
        else if (escalatemp1.equalsIgnoreCase("K")) {
            System.out.printf("%nQuer converter a temperatura de Kelvin para qual escala?%nDigite C para Celsius%nDigite K para Kelvin%n");
                String escalatemp2 = teclado.next();
                if (escalatemp2.equalsIgnoreCase("C")) {
                    System.out.printf("Certo, de Kelvin para Celsius%n%nDigite o valor em Kelvin para converter%n");
                    float valor = teclado.nextFloat();
                    System.out.printf("%n%.1f°K = %.1f°C%n", valor, (valor-273));
                }
                else if (escalatemp2.equalsIgnoreCase("F")) {
                    System.out.printf("Certo, de Kelvin para Fahrenheit%n%nDigite o valor em Kelvin para converter%n");
                    float valor = teclado.nextFloat();
                    System.out.printf("%n%.1f°K = %.1f°F%n", valor, ((valor-273)*1.8+32));

                }
                else {
                    System.out.println("Erro, encerrando programa...");

                }
            }
            else {
                System.out.println("Erro, encerrando programa...");

            }

        teclado.close();
    }
}
