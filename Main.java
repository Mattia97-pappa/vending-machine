import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Macchinetta macchinetta= new Macchinetta("B4AR453213", null, null, null);
   



macchinetta.setMacchinaIP("IP MACCHINETTA: B4AR453213 | MACCHINETTA IN FUNZIONE");
System.out.println(macchinetta.getMacchinaIP());
System.out.println("");
macchinetta.mostraProdotti();

int scelta = macchinetta.seleziona_prodotti();

macchinetta.calcola_resto(scelta);


}
}