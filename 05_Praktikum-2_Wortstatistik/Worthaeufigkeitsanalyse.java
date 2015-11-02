/**
 * Zaehlt die Anzahl Vorkommnisse von Woertern ueber mehrere Zeichenketten.
 * Es lassen sich eine beliebige Anzahl an Zeichenketten uebergeben. Die
 * Statistik wird fortlaufend gefuehrt. Die Wortzaehlung laesst sich jederzeit
 * ausgeben. Die Satzeichen . , ? ! " : ; werden entfernt. Alle Buchstaben
 * werden in Kleinbuchstaben umgewandelt um beispielsweise das Wort 'die'
 * inmitten eines Satzes und das Wort 'Die' am Anfang eines Satzes als gleiches
 * Wort werten zu koennen.
 * 
 * @version (02.11.2015)
 * @author (raffaluc, wemlmax)
 */
import java.util.*;
public class Worthaeufigkeitsanalyse {
    
    private final String pattern = "[\\Q!:;?.,\"\\E]";
    private HashMap<String, Integer> result;

     /**
     * Erzeugt eine Instanz mit einem neuen result HashMap
     */
    public Worthaeufigkeitsanalyse()
    {
        result = new HashMap<>();
    }
     /**
     * Erzeugt den zu verarbeitenden Text
     */
    public void setTestdata()
    {
        verarbeiteText("Fritz sagt: \"Die Softwareentwicklung ist meine Leidenschaft!\"");
        verarbeiteText("Hans meint, er teile die Leidenschaft mit Fritz.");
        verarbeiteText("John fuegt hinzu, dass die Softwareentwicklung nicht nur aus Programmieren bestehe,sondern es sich dabei um einen komplexen Prozess, bestehend aus vielen kleinen Komponenten, handelt.\"");
    }
       /**
     * Verarbeitet den eingegebenen Text
	   @param text den zu verarbeitenden Text
     */
    public void verarbeiteText(String text)
    {
        text = text.replaceAll(pattern, " ");
        String[] words = text.split(" ");
        
        for(String word : words)
        {
            if("".equals(word)) continue;
            word = word.toLowerCase();
            Integer amount = 1;
            if(result.containsKey(word))
            {
               amount = result.get(word);
               amount++;
            }
            result.put(word, amount);
        }
    }
    /**
	Gibt die im Text vorkommenden Wörter und ihre Anzahl aus
    */
    public void ausgeben()
    {
        Iterator it = result.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + "\t" + pair.getValue());
        }
    }
 	/**
	Löscht den bis jetzt eingegebenen Text
    */
    public void loescheText()
    {
        result.clear();
    }
}
