public class Bank {
    int saldo;

    public Bank(){
        this.saldo = 0;
    }

    public void showSaldo(){
        System.out.println("Saldo: " + this.saldo);
    }
    public   int getSaldo(){
        return this.saldo;

    }
public  void setSaldo(int x){
        this.saldo = x;

    //System.out.println("new saldo " +this.saldo);
}

    public String toString(){

        return "BankSaldo : "+this.saldo;
}


}
