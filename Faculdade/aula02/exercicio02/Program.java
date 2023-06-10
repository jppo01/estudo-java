package Faculdade.aula02.exercicio02;
/*
2. Crie uma classe Conta, para administrar contas correntes de um banco com os seguintes atributos:
String correntista; double saldo; double limiteSaque;
E os métodos: void sacar( float valor); void depositar( float valor); void info()
 */
public class Program {
    public static void main (String[] args){
        Conta conta = new Conta("João");

        conta.depositar(10000); // é para retornar o deposito de R$ 10000
        System.out.println("---------------------------------------");
        conta.sacar(30000); // é para retornar Não há saldo suficiente para o saque!
        System.out.println("----------------------------------------");
        conta.sacar(3000); // é para retornar saque superior ao limite
        System.out.println("----------------------------------------");
        conta.sacar(300); // é para realizar o saque de R$ 300
        System.out.println("----------------------------------------");
        conta.info();

    }
}
