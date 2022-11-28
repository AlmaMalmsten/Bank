public class Kund {
    String namn;
    int personNummer; //svengelska nice, remember to change, english only

    public Kund(String namn, int personNummer)//möjligen ändra till kontonummer = konto
    {
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
}
