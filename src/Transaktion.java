public class Transaktion {
    int saldo;
    String date;//används inte? Kanske sen, bra att ha ändå

    private Transaktion(int saldo, String date){
        this.saldo = saldo;
        this.date = date;
    }

    private int getSaldo() {
        return saldo;
    }

    private void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
