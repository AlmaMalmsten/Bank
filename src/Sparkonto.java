public class Sparkonto extends Konto{
    float intrest;

    public Sparkonto(Kund owner, float intrest){
        super(owner);
        this.intrest = intrest;
    }
}
