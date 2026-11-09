/**
 * Un conto bancario ha un saldo che può essere modificato tramite i metodi 
 */
public class BankAccount {
    /**
     * Variabile che contiene il saldo del conto bancario
     */
    private double balance;
    /**
     Costruttore senza parametri 
     */
    public BankAccount() {
        balance = 0;
    }
    /**
     Costruttore che definisce la classe con un saldo inziale 
     * @param initialBalance saldo iniziale del conto corrente 
     */
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }
    /** 
     Deposita denaro sul conto bancario 
     @param amount l'importo da depositare 
     */
    public void deposit(double amount) {
        // code here 
    }
    /** 
     Preleva denaro dal conto bancario 
     @param amount l'importo da prelevare  
     */
    public void withdraw(double amount) {
        // code here 
    }
    /**
     Restituisce il saldo del conto corrente bancario 
     @return il saldo corrente 
     */
    public double getBalance() {
        // code here 
        return 0;
    }
}
