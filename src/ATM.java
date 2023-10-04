public class ATM {
    public void deposit(ContaBancaria x, double valor){
        x.setBalance(x.getBalance() + valor);
    }
    public void withdraw(ContaBancaria x, double valor){
        x.setBalance(x.getBalance() - valor);
    }


}
