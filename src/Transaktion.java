public class Transaktion {
    int saldo;
    String date;//används inte? Kanske sen, bra att ha ändå

    public Transaktion(int saldo, String date){
        this.saldo = saldo;
        this.date = date;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
