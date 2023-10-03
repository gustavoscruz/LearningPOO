public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String name, int age){
        this.nome = name;
        this.idade = age;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String name){
        this.nome = name;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int age){
        this.idade = age;
    }

}
