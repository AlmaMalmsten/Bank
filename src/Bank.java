import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Bank {

    ArrayList<Kund> kunder = new ArrayList<Kund>();//arraylist av kundklassen
    ArrayList<Konto> konton = new ArrayList<Konto>(); //både vanliga och spar


    public void creatKund(String name, int personNummer){
        kunder.add(new Kund(name, personNummer));
    }
    public void creatKonto(Kund owner){
        konton.add(new Konto(owner));
    }
    public void creatSparKonto(Kund owner, float intrest){//sparkonto också i kontoarrayn
        konton.add(new Sparkonto(owner, intrest));
    }

    public void allKund(){//beräknar antal kunder + slriver ut dem
        int numberOf = kunder.size();
        kunder.forEach(kund -> {
            System.out.println(kund.getNamn());
            System.out.println(kund.getPersonNummer());
            System.out.println("Number of costumers is: " + numberOf);
        });
    }

    public void allBalans(){ //same but balans
        int allTheMoney = 0;
        for (Konto konto : konton){
            allTheMoney += konto.getSaldo();
        }
    }

    public void signIn(String name){
        for (Kund kund : kunder) {
            if (kund.getNamn() == name) {

            }
        }
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            boolean flag = true;
            boolean flag2 = true;
            String haveAcount = "Y";
            System.out.println("Do you have an acuont?");
            while (flag)
            try {
                haveAcount = scanner.nextLine();
                flag = false;
            } catch (Exception e){
                System.out.println("Must be Y or N");
            }
            switch (haveAcount){
                case "N":
                    while (flag2) {
                        try {
                            System.out.println("Name: ");
                            String name = scanner.nextLine();
                            System.out.println("Personnummer: ");
                            int personnummer = scanner.nextInt();
                            creatKund(name, personnummer);
                            for (Kund kund : kunder) {
                                if (kund.getPersonNummer() == personnummer) {
                                    creatKonto(kund);
                                }
                            }
                            flag2 = false;
                        } catch (Exception e) {
                            System.out.println("Pleace don't");
                        }
                        break;
                    }
                case "Y":
                    System.out.println("name: ");
                    String name = scanner.nextLine();


                }
            }
        }
    }
