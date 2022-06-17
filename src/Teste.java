import java.util.Scanner;
public class Teste {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Ingresso ingresso = new Ingresso();

        String filme;
        do{
            System.out.println("Informe o título de filme: ");
            filme = sc.nextLine();
            if(!(filme.equals(""))){
                ingresso.setFilme(filme);
            }
            else{
                System.out.println("Título inválido! Tente novamente.");
            }
        }
        while((filme.equals("")));
        
        int qtde;
        do{
            System.out.println("Informe a quantidade de ingressos: ");
            qtde = sc.nextInt();
            if(qtde > 0){
                ingresso.setQtde(qtde);
            }
            else{
                System.out.println("Quantidade inválida! Tente novamente.");
            }
        }
        while(qtde <= 0);

        double valor;
        do{
            System.out.println("Informe o valor unitário do ingresso");
            valor = sc.nextDouble();
            if(valor > 0){
                ingresso.setValor(valor);
            }
            else{
                System.out.println("Valor inválido! Tente novamente.");
            }
        }
        while(valor <= 0);
        

        ingresso.show();
        sc.close();
    }
}
