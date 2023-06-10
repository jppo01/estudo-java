package Faculdade.aula02;

public class Aluno {
    private int registration;
    private String name;
    private String cpf;

    // Construtor 
    public Aluno (int registration, String name, String cpf){
        this.name = name;
        this.registration = registration;
        this.cpf = cpf;
    }

    // Getters e Setters
    public void info(){
        System.out.printf("Nome: %s\n", this.name);
        System.out.printf("Matrícula: %s\n", this.registration);
        System.out.printf("CPF: %s\n", this.cpf);
    }
    public int getRegistration(){
        return this.registration;
    }
    public String getName(){
        return this.name;
    }
    public String getCpf(){
        return this.cpf;
    }
}
