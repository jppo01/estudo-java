package Faculdade.trabalho.modules.classes;


public class Real extends Moeda {
    
    public Real(double v) {
        super();
        this.valor = v;
        this.simbolo = "R$";
        this.nome = "Real (BRL)";
    }
    public double converter(){
        return getValor();
    }
    public double getValor(){
        return this.valor;
    }
    public String getSimbolo(){
        return this.simbolo;
    }
    public String getNome(){
        return this.nome;
    }
}
