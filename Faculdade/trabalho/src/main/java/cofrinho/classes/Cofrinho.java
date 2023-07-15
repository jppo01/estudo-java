package cofrinho.classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Cofrinho {
    // CONSTANTES 
    final int ADD_REAL_BRL = 1 , REMOVER_REAL_BRL = 1;
    final int ADD_DOLAR_USD = 2, REMOVER_DOLAR_USD = 2;
    final int ADD_EURO_EUR = 3, REMOVER_EURO_EUR = 3;
    final int ADD_BITCOIN_BTC = 4 , REMOVER_BITCOIN_BTC = 4;
    final int VOLTAR = 0;  
    //usarei a estrutura de dados lista para guardar os objetos filho de moeda (EUR, USD, BRL e BTC)
    private ArrayList<Moeda> listaMoedas;
    public Cofrinho() {
        listaMoedas = new ArrayList<>();
    }
    public void adicionar(int opcao){ //receberei um objeto que herda moeda e adicionarei ele na minha listaMoedas
        Scanner sc = new Scanner(System.in);
        double valor;
        switch(opcao){
            case ADD_REAL_BRL:
                System.out.println("Valor em Real (BRL):");
                try {
                    valor = sc.nextDouble();
                    Real real = new Real(valor);
                    adicionarMoedas(real);
                    System.out.println("R$ " + real.getValor());
                } catch (Exception e) {
                    System.out.println("Valor inválido!");
                    sc.nextLine();
                }
                break;
            case ADD_DOLAR_USD:
                System.out.println("Valor em Dolar (USD):");
                try {
                    valor = sc.nextDouble();
                    Dolar dolar = new Dolar(valor);
                    adicionarMoedas(dolar);
                    System.out.println("$ " + dolar.getValor());
                } catch (Exception e) {
                    System.out.println("Valor inválido!");
                    sc.nextLine();
                }
                break;
            case ADD_EURO_EUR:
                System.out.println("Valor em Euro (EUR):");
                try {
                    valor = sc.nextDouble();
                    Euro euro = new Euro(valor);
                    adicionarMoedas(euro);
                    System.out.println("\u20AC " + euro.getValor());
                } catch (Exception e) {
                    System.out.println("Valor inválido!");
                    sc.nextLine();
                }
                break;
            case ADD_BITCOIN_BTC:
                System.out.println("Valor em Bitcoin (BTC):");
                try {
                    valor = sc.nextDouble();
                    Bitcoin bitcoin = new Bitcoin(valor);
                    adicionarMoedas(bitcoin);
                    System.out.println("\u20BF " + bitcoin.getValor());
                } catch (Exception e) {
                    System.out.println("Valor inválido!");
                    sc.nextLine();
                }
                break;
            default:
                System.out.println("Opção inválida!");
                break;
         }
    } 
    public void listagemMoedas(){
        for (Moeda moeda : listaMoedas) {
            moeda.info();
            System.out.println("------------------------");
        }
    }
    public void adicionarMoedas(Moeda moeda){
        this.listaMoedas.add(moeda);
    }
    public double totalConvertido(){
        double valorConvertido = 0;
        for(Moeda moeda : listaMoedas){
            valorConvertido += moeda.converter();
        }
        return valorConvertido;
    }
    public void remover(int opcao){
        Scanner sc = new Scanner(System.in);
        double valor;
        boolean moedaExiste = false;
        switch(opcao){
            case REMOVER_REAL_BRL:
                System.out.println("Valor em Real (BRL):");
                try {
                    valor = sc.nextDouble();
                    for( Moeda moeda : listaMoedas){
                        if(valor == moeda.getValor() && moeda.getNome() == "Real (BRL)"){
                            moeda.info();
                            this.listaMoedas.remove(moeda);
                            System.out.println("Foi removida com sucesso.");
                            moedaExiste = true;
                            break;
                        }
                    }
                    if(!moedaExiste){
                        System.out.println("Não existe moeda com esse valor");
                    }
                } catch (Exception e) {
                    System.out.println("Valor inválido!");
                    sc.nextLine();
                }
                break;
            case REMOVER_DOLAR_USD:
                System.out.println("Valor em Dolar (USD):");
                try {
                    valor = sc.nextDouble();
                    for( Moeda moeda : listaMoedas){
                        if(valor == moeda.getValor() && moeda.getNome() == "Dolar (USD)"){
                            moeda.info();
                            this.listaMoedas.remove(moeda);
                            System.out.println("Foi removida com sucesso.");
                            moedaExiste = true;
                            break;
                        }
                    }
                    if(!moedaExiste){
                        System.out.println("Não existe moeda com esse valor");
                    }
                } catch (Exception e) {
                    System.out.println("Valor inválido!");
                    sc.nextLine();
                }
                break;
            case REMOVER_EURO_EUR:
                System.out.println("Valor em Euro (EUR):");
                try {
                    valor = sc.nextDouble();
                    for( Moeda moeda : listaMoedas){
                        if(valor == moeda.getValor() && moeda.getNome() == "Euro (EUR)"){
                            moeda.info();
                            this.listaMoedas.remove(moeda);
                            System.out.println("Foi removida com sucesso.");
                            moedaExiste = true;
                            break;
                        }
                    }
                    if(!moedaExiste){
                        System.out.println("Não existe moeda com esse valor");
                    }
                } catch (Exception e) {
                    System.out.println("Valor inválido!");
                    sc.nextLine();
                }
                break;
            case REMOVER_BITCOIN_BTC:
                System.out.println("Valor em Bitcoin (BTC):");
                try {
                    valor = sc.nextDouble();
                    for( Moeda moeda : listaMoedas){
                        if(valor == moeda.getValor() && moeda.getNome() == "Bitcoin (BTC)"){
                            moeda.info();
                            this.listaMoedas.remove(moeda);
                            System.out.println("Foi removida com sucesso.");
                            moedaExiste = true;
                            break;
                        }
                    }
                    if(!moedaExiste){
                        System.out.println("Não existe moeda com esse valor");
                    }
                } catch (Exception e) {
                    System.out.println("Valor inválido!");
                    sc.nextLine();
                }
                break;
            default:
                System.out.println("Não há essa moeda!");
                break;
        }
    } 
}
