public class Aluno {
    private String name;
    private String registration;
    private double grade1, grade2, grade3;

    public Aluno(String nome, String matricula, double n1, double n2, double n3){
        this.name = nome;
        this.registration = matricula;
        this.grade1 = n1;
        this.grade2 = n2;
        this.grade3 = n3;
    }

    public String getName(){
        return this.name;
    }
    public String getRegistration(){
        return this.registration;
    }

    public double AveragingCalculation(){
        return (this.grade1 + this.grade2 + this.grade3) / 3;
    }

    public String toString(){
        return "Nome: " + this.name + "\nMatrícula: " + this.registration + "\nMédia: " + this.AveragingCalculation();
    }
}
