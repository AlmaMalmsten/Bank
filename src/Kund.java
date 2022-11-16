public class Kund {
    String namn;
    int personNummer;
    int kontoNummer;

    public Kund(String namn, int personNummer, int kontoNummer){
        this.kontoNummer = kontoNummer;
        this.namn = namn;
        this.personNummer = personNummer;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public int getPersonNummer() {
        return personNummer;
    }

    public void setPersonNummer(int personNummer) {
        this.personNummer = personNummer;
    }

    public int getKontoNummer() {
        return kontoNummer;
    }

    public void setKontoNummer(int kontoNummer) {
        this.kontoNummer = kontoNummer;
    }
}
