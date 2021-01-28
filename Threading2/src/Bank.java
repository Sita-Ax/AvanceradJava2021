public  class Bank {
    int saldo;

    public Bank(){
        this.saldo = 0;
    }

    public synchronized void changeSaldo(int x){
        this.saldo = this.saldo + x;

    }
    public  void showSaldo(){
        System.out.println("Saldo: " + this.saldo);
    }
    public synchronized int getSaldo(){
        return this.saldo;

    }
public synchronized void setSaldo(int x){
        this.saldo = x;


    //System.out.println("new saldo " +this.saldo);
}

    public String toString(){
        return "BankSaldo : "+this.saldo;
}


}
