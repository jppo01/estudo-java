package cofrinho;

import java.text.DecimalFormat;
import java.util.Scanner;

import cofrinho.classes.Cofrinho;

public class Principal {
    public static void main(String[] args) {
        //CONSTANTES
        final int ADICIONAR_MOEDAS = 1;
        final int REMOVER_MOEDAS = 2;
        final int LISTAR_MOEDAS = 3;
        final int TOTAL_NO_COFRINHO = 4;
        final int SAIR = 0;
        //OBJETOS
        Scanner sc = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();
        DecimalFormat ft = new DecimalFormat("#.##");
        // VARIAVEIS
        int opcao;
        boolean addMoedaControleLoop = true; // variável criada para controlar o loop dos menu 
        
        System.out.println("Seja Bem vindo ao Sistema Cofrinho");
        while (true) {
            System.out.println("O que você deseja?\n" +
                    "1 - Adicionar Moedas\n" +
                    "2 - Remover Moeda\n" +
                    "3 - Listar Moedas\n" +
                    "4 - Total no Cofrinho (em BRL)\n" +
                    "0 - Sair\n");
            try {
                opcao = sc.nextInt();
            } catch (Exception e) {
                System.out.println("!!! Valor digitado não é válido !!!");
                System.out.println("Tente Novamente");
                sc.nextLine(); // Consume a entrada inválida
                continue;
            }
            switch (opcao) {
                case SAIR: // Finalizar o programa
                    System.out.println("Saindo do programa...");
                    return;
                case ADICIONAR_MOEDAS: //Menu Escolha da Moeda
                    System.out.println("Escolha a moeda abaixo");
                    while(addMoedaControleLoop){
                        System.out.println("Qual moeda deseja adicionar?\n" +
                            "1 - Real (BRL)\n" +
                            "2 - Dolar (USD)\n" +
                            "3 - Euro (EUR) \n" +
                            "4 - Bitcon (BTC)\n" +
                            "0 - Voltar\n");                         
                            try {
                                opcao = sc.nextInt();
                            } catch (Exception e) {
                                System.out.println("!!! Valor digitado não é válido !!!");
                                System.out.println("Tente Novamente");
                                sc.nextLine(); // Consome a entrada inválida
                                continue;
                            }
                            if(opcao == 0){ // volta e quebra o loop (while)
                                addMoedaControleLoop = false;
                                break;
                            } 
                            cofrinho.adicionar(opcao);
                    }
                    addMoedaControleLoop = true; // para que seja possível entrar na opção 1 novamente
                    break;
                case REMOVER_MOEDAS:
                    System.out.println("Escolha a moeda a ser removida abaixo");
                    while(addMoedaControleLoop){
                        System.out.println("Qual moeda deseja remover?\n" +
                            "1 - Real (BRL)\n" +
                            "2 - Dolar (USD)\n" +
                            "3 - Euro (EUR) \n" +
                            "4 - Bitcon (BTC)\n" +
                            "0 - Voltar\n");
                            try {
                                opcao = sc.nextInt();
                            } catch (Exception e) {
                                System.out.println("!!! Valor digitado não é válido !!!");
                                System.out.println("Tente Novamente");
                                sc.nextLine(); // Consome a entrada inválida
                                continue;
                            }
                            if(opcao == 0){ // quebra o loop (while)
                                addMoedaControleLoop = false;
                                break;
                            } 
                            cofrinho.remover(opcao);
                    }
                    addMoedaControleLoop = true; // para que seja possível entrar na opção 1 novamente
                    break;
                case LISTAR_MOEDAS:
                    cofrinho.listagemMoedas();
                    break;
                case TOTAL_NO_COFRINHO:
                    System.out.println("Valor total em BRL R$ " + ft.format(cofrinho.totalConvertido()));
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
