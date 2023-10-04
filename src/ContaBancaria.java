public class ContaBancaria {
    private String accountNumber;
    private double balance;

    public ContaBancaria(String number, double saldo){
        this.accountNumber = number;
        this.balance = saldo;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setBalance(double valor){
        this.balance = valor;
    }
}
