import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Kund> kunder = new ArrayList<>();

        Kund hederligeHarry = new Kund();
        hederligeHarry.setNamn("Hederlige Harrys Bilar: ");
        hederligeHarry.setMeddelande("En bra bilaffär (för Harry)");
        hederligeHarry.setBellop(5000);
        kunder.add(hederligeHarry);

        Kund farmorAnka = new Kund();
        farmorAnka.setNamn("Farmor Ankas Pajer AB: ");
        farmorAnka.setMeddelande("Skynda innan Mårten äter allt!");
        farmorAnka.setBellop(2000);
        kunder.add(farmorAnka);

        Kund svartaPetter = new Kund();
        svartaPetter.setNamn("Svarta Petters Svartbyggen ");
        svartaPetter.setMeddelande("Bygga svart? Ring Petter");
        svartaPetter.setBellop(1500);
        kunder.add(svartaPetter);

        Kund långBens = new Kund();
        långBens.setNamn("Långbens detektivbyrå");
        långBens.setMeddelande("Mysterier? Ring Långben");
        långBens.setBellop(4000);
        kunder.add(långBens);

        while (true) {
            for(Kund lista : kunder){
                System.out.println(lista.getNamn() + " " + lista.getMeddelande() + " " + lista.getBellop()); 
                TimeUnit.SECONDS.sleep(lista.getBellop()/1250);
                System.out.println();
            }
            
        }

        // for(Kund i : kunder){
        //     System.out.println("KUND\n" + i.getNamn() + "\nMEDDELANDE\n" + i.getMeddelande() + "\nBETALT\n" + i.getBellop() + "kr");
        //     System.out.println();

        }
            
        }
    

