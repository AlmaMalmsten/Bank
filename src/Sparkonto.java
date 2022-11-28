public class Sparkonto extends Konto //sub till konto
{
    float intrest; //ända skillnaden, kanske lägg till något?

    public Sparkonto(Kund owner, float intrest){
        super(owner);
        this.intrest = intrest;
    }
}
