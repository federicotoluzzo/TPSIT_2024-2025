package files;

import java.io.PrintWriter;

public class Persona {
    enum segniZodiacali{
        ARIETE,
        TORO,
        GEMELLI,
        CANCRO,
        LEONE,
        VERGINE,
        BILANCIA,
        SCORPIONE,
        SAGITTARIO,
        CAPRICORNO,
        ACQUARIO,
        PESCI
    }

    private String cognome;
    private String nome;
    private segniZodiacali segnoZodiacale;

    public void write(PrintWriter writer){
        writer.printf("%s,%s,%s\n", cognome, nome, segnoZodiacale.toString().toLowerCase());
    }

    public void read(String line){
        String[] parts = line.split(",");
        cognome = parts[0];
        nome = parts[1];
        segnoZodiacale = switch(parts[2]){
            case "ariete" -> segniZodiacali.ARIETE;
            case "toro" -> segniZodiacali.TORO;
            case "gemelli" -> segniZodiacali.GEMELLI;
            case "cancro" -> segniZodiacali.CANCRO;
            case "leone" -> segniZodiacali.LEONE;
            case "vergine" -> segniZodiacali.VERGINE;
            case "bilancia" -> segniZodiacali.BILANCIA;
            case "scorpione" -> segniZodiacali.SCORPIONE;
            case "sagittario" -> segniZodiacali.SAGITTARIO;
            case "capricorno" -> segniZodiacali.CAPRICORNO;
            case "acquario" -> segniZodiacali.ACQUARIO;
            case "pesci" -> segniZodiacali.PESCI;
        }
    }

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }

    public segniZodiacali getSegnoZodiacale() {
        return segnoZodiacale;
    }
}

/*
Scrivere un programma a riga di comando, in cui viene definita una classe Persona. La classe Persona ha tre attributi, Cognome, Nome e Segno Zodiacale. Presenta i metodi getter, ma non i setter. Ha due metodi aggiuntivi:
write(PrintWriter writer) che scrive una riga sul flusso con i valori degli attributi separati da virgola.
read(String line) che riceve una riga con i tre valori degli attributi separati da virgola e li imposta nell'oggetto
Il main permette di gestire una collezione di persone (inserimento, rimozione, stampa), di salvarla su un file persone.csv, e di caricarla da un file persone.csv
*/
