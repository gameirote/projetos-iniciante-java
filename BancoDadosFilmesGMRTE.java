import java.util.Scanner;

class BancoDadosFilmesGMRTE{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        String filmes[] = new String[100];
        boolean rodando = true;
        int totalfilmes = 0;
            System.out.printf("Bem vindo ao gerenciador de filmes!%n");

            while (rodando==true) {
                System.out.printf("Qual opção deseja?%nDigite 1 para adicionar um filme%nDigite 2 para remover um filme%nDigite 0 para encerrar o programa%n");
                int opcao = teclado.nextInt();
                    if (opcao==1){
                        System.out.printf("Certo, qual filme deseja adicionar a lista?%n%n");
                        filmes[totalfilmes] = teclado.nextLine();
                            for    
                            System.out.println(filmes);
                        totalfilmes = totalfilmes+1;
                    }

            }
                teclado.close();

    }
}