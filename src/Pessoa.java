public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String name, int age){
        this.nome = name;
        this.idade = age;
    }

    public getNome(){
        return this.nome;
    }

    public setNome(String name){
        this.nome = name;
    }

    public getIdade(){
        return this.idade;
    }

    public setIdade(int age){
        this.idade = age;
    }

}
