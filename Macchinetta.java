import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Macchinetta {
private String macchinaIP;
private List<String> prodotti;
private ArrayList<Float> prezzi;
private ArrayList<Integer> disponibili;

public Macchinetta(String macchinaIP, List<String> prodotti, ArrayList<Float> prezzi, ArrayList<Integer> disponibili) {
    this.macchinaIP = macchinaIP;
    this.prodotti = new ArrayList<>();
    this.prezzi = new ArrayList<>();
    this.disponibili = new ArrayList<>();
}

public void mostraProdotti(){
    prodotti.add("Kinder Delice");
    prodotti.add("Patatine San Carlo Rustiche");
    prodotti.add("Croccantelle");
    prodotti.add("Barretta KitKat");
    prodotti.add("Lattina Coca-Cola 25cl");
    prodotti.add("Kinder Cereali");
    prezzi.add(1.30f);
    prezzi.add(1.20f);
    prezzi.add(0.60f);
    prezzi.add(1.10f);
    prezzi.add(0.70f);
    prezzi.add(0.80f);
    disponibili.add(12);
    disponibili.add(5);
    disponibili.add(3);
    disponibili.add(7);
    disponibili.add(11);
    disponibili.add(1);
    
    for(int i=0;i<prodotti.size();i++){
        
        if(disponibili.get(i) > 0 ){
            System.out.println(" PRODOTTO: "+ prodotti.get(i) + "|PREZZO: " + prezzi.get(i) + " Euro " + "codice " + (i+1));
        }
    }
}

public int seleziona_prodotti(){
    System.out.println("Selezionare il prodotto che si desidera ");
    Scanner scanner = new Scanner(System.in);
    int scelta = scanner.nextInt();
    return scelta;
}

public void calcola_resto(int scelta){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Inserire " + prezzi.get(scelta -1) + " euro");
    float soldi_inseriti = scanner.nextFloat();
    
    float resto = soldi_inseriti - prezzi.get(scelta-1);
    int flag=1;  
    while(flag == 1){
            if(resto == 0){
                System.out.println("Erogazione in corso");
                disponibili.set(scelta - 1, disponibili.get(scelta - 1) - 1); 
                flag = 0;
            }
            if(resto > 0){
                System.out.println("Erogazione in corso");
                System.out.println("Resto di ["+String.format("%.2f", resto)+"] EURO -> Prodotto erogato");;
                disponibili.set(scelta - 1, disponibili.get(scelta - 1) - 1); 
                flag = 0;
            }
            if(resto < 0){
                while(resto < 0){
                    System.out.println("Mancano " + String.format("%.2f", -1 * resto) + " Euro");
            
                    
                    resto = resto + scanner.nextFloat();
            }
        }
    }
    
}

public String getMacchinaIP() {
    return macchinaIP;
}

public void setMacchinaIP(String macchinaIP) {
    this.macchinaIP = macchinaIP;
}

public List<String> getProdotti() {
    return prodotti;
}

public void setProdotti(List<String> prodotti) {
    this.prodotti = prodotti;
}

public ArrayList<Float> getPrezzi() {
    return prezzi;
}

public void setPrezzi(ArrayList<Float> prezzi) {
    this.prezzi = prezzi;
}

public ArrayList<Integer> getDisponibili() {
    return disponibili;
}

public void setDisponibili(ArrayList<Integer> disponibili) {
    this.disponibili = disponibili;
}
    
}




