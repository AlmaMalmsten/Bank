import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Bank {

    ArrayList<Kund> kunder = new ArrayList<Kund>();//arraylist av kundklassen
    ArrayList<Konto> konton = new ArrayList<Konto>(); //både vanliga och spar


    private void creatKund(String name, int personNummer){
        kunder.add(new Kund(name, personNummer));
    }
    private void creatKonto(Kund owner){
        konton.add(new Konto(owner));
    }
    private void creatSparKonto(Kund owner, float intrest){//sparkonto också i kontoarrayn
        konton.add(new Sparkonto(owner, intrest));
    }

    private void allKund(){//beräknar antal kunder + slriver ut dem
        int numberOf = kunder.size();
        kunder.forEach(kund -> {
            System.out.println(kund.getNamn());
            System.out.println(kund.getPersonNummer());
            System.out.println("Number of costumers is: " + numberOf);
        });
    }

    private void allBalans(){ //same but balans
        int allTheMoney = 0;
        for (Konto konto : konton){
            allTheMoney += konto.getSaldo();
        }
    }

    private void signIn(String name){ //signina duh
        for (Kund kund : kunder) {
            if (kund.getNamn() == name) {

            }
        }
    }

    public void run(){
        String name = "";
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        while (flag) { //håller på tills avslutad
            boolean flag1 = true;
            boolean flag2 = true;
            String haveAcount = "Y"; //för både acount och kund
            System.out.println("Are you a costumer?");
            while (flag1) {
                try {
                    haveAcount = scanner.nextLine();
                    flag1 = false;
                } catch (Exception e) {
                    System.out.println("Must be Y or N");
                }
                switch (haveAcount) {//switch för logga in/ skapa kund
                    case "N":
                        while (flag2) {
                            try {
                                System.out.println("Name: ");
                                name = scanner.nextLine();
                                System.out.println("Personnummer: ");
                                int personnummer = scanner.nextInt();
                                creatKund(name, personnummer);//skapar kund
                                for (Kund kund : kunder) {//går säkert att optimera. Skapar konto till ny kund
                                    if (kund.getPersonNummer() == personnummer) {
                                        creatKonto(kund);
                                        signIn(name);
                                    }
                                }
                                flag2 = false; // breakar while runt try catch
                            } catch (Exception e) {
                                System.out.println("Pleace don't");
                            }
                            break;
                        }
                    case "Y":
                        System.out.println("name: "); //needs try catch but not today
                        name = scanner.nextLine();
                        signIn(name);
                }
                System.out.println("Creat acount?"); //frågar alla oavsätt om de är kunder eller inte
                haveAcount = scanner.nextLine();//haveAcount declarad utanför så inte samma som höre upp
                switch (haveAcount) {
                    case "Y":
                        for (Kund kund : kunder) {
                            if (kund.getNamn() == name) {
                                creatKonto(kund);
                            }
                        }
                    case "N":
                        flag = false; //breakar hela. Varför jag ville det vet jag inte.
                }
            }
        }
        }
    }
