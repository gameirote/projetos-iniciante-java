import java.util.Scanner;

public class AdivinhaçãoGMRTE {
    public static void main(String[] args) {    
        Scanner teclado = new Scanner(System.in);
        boolean rodando = true;
                //Nota: Sinceramente não sei como esse código abaixo de limpar o terminal funciona, vou dar uma pesquisada melhor depois
                //mas foi o melhor jeito que encontrei pra isso
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
        System.out.printf("Bem vindo ao jogo da adivinhação!%n");
        while (rodando==true){
                    System.out.printf("Qual modo de jogo você deseja?%n%nDigite 1 para jogador x jogador%nDigite 2 para computador x jogador%nDigite 0 para encerrar o jogo%n");
                    int modojogo = teclado.nextInt();
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    if (modojogo==0) {
                        rodando=false;
                        System.out.println("Encerrando programa...");
                    }
                else if (modojogo==1) {
                System.out.printf("Certo, o primeiro jogador deve escolher um número:%n");
                int resposta = teclado.nextInt();
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.printf("Certo, agora o jogador 2 deve inserir seu palpite:%n");
                int palpite = teclado.nextInt();
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                while (palpite!=resposta) {
                    if (palpite<resposta) {
                    System.out.printf("Errado, %d é menor que o número do jogador 2. %n%nChute outro número:%n", palpite);
                        palpite = teclado.nextInt();
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                    }
                    else if (palpite>resposta) {
                        System.out.printf("Errado, %d é maior que o número do jogador 2. %n%nChute outro número:%n", palpite);
                        palpite = teclado.nextInt();
                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                    }
                    else {
                        System.out.printf("Erro, encerrando programa...");
                        break;
                    }
                }
                System.out.printf("Parabéns, %d foi o número pensado pelo jogador 2!%n", palpite);
                } 
            else if (modojogo==2) {
                System.out.printf("Certo, o computador irá gerar um número entre 0-100...%n");
                int resposta = (int)(Math.random()*100);
                System.out.printf("%nNúmero gerado! Dê seu palpite:%n");
                int palpite = teclado.nextInt();
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                 while (palpite!=resposta) {
                    if (palpite<resposta) {
                    System.out.printf("Errado, %d é menor que o número do computador. %n%nChute outro número:%n", palpite);
                        palpite = teclado.nextInt();
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                    }
                    else if (palpite>resposta) {
                        System.out.printf("Errado, %d é maior que o número do computador. %n%nChute outro número:%n", palpite);
                        palpite = teclado.nextInt();
                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                    }
                }
                System.out.printf("Parabéns, %d foi o número gerado pela máquina!%n", palpite);
                }
            else {
                System.out.printf("%nErro, encerrando programa...");
            }
        }
    teclado.close();
            }                         
} 
