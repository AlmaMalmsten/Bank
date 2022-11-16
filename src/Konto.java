public class Konto {
    int balans;
    Kund owner;
    Transaktion lastTransaction;
    public Konto(Kund owner){
        this.owner = owner;
    }


    public int getSaldo() {
        return balans;
    }

    public void setSaldo(int balans) {
        this.balans = balans;
    }

    public Transaktion getLastTransaction() {
        return lastTransaction;
    }

    public void setLastTransaction(Transaktion lastTransaction) {
        this.lastTransaction = lastTransaction;
    }
}