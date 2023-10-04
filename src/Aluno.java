public class Aluno {
    private String name;
    private String registration;
    private double grade1, grade2, grade3;

    public String getName(){
        return this.name;
    }
    public String getRegistration(){
        return this.registration;
    }

    public double AveragingCalculation(){
        return (this.grade1 + this.grade2 + this.grade3) / 3;
    }
}
