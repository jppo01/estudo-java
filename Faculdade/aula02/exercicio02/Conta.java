package Faculdade.aula02.exercicio02;

public class Conta {
    //attribute
    private String correntista; 
    private double saldo; 
    private double limiteSaque;

    // constructor
    public Conta( String correntista) {
        this.correntista = correntista;
        this.saldo = 0;
        this.limiteSaque = 1000;
    }

    //methods
    public void depositar(double valor){
        if(valor > 0) {
            this.saldo = this.saldo + valor;
            System.out.printf("Deposito no valor de R$ %.2f realizado com sucesso!\n", valor);
        } else{
            System.out.println("Valor inválido para deposito!");
        }
    }
    public void sacar(double valor){
        if(valor<this.saldo && valor <= this.limiteSaque){
            this.saldo = this.saldo - valor;
            System.out.println("Saque realizado no valor de R$ " + valor);
        }
        else if(valor > this.limiteSaque && valor < this.saldo) {
            System.out.println("O valor solicitado ultrapassa o limite de saque!");
            System.out.println("Seu limite de saque atualmente é de: R$ " + this.limiteSaque);
        }  else {
            System.out.println("Não há saldo suficiente para o saque!");
        }
        
    }
    public void info(){
        System.out.println("Nome Correntista: " + this.correntista);
        System.out.println("Saldo: R$ " + this.saldo);
        System.out.println("Limite disponível para saques: R$ " + this.limiteSaque);
    }
}
