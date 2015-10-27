import java.util.*;
/**
 * Bietet Funktionalitaeten zum Speichern von Pruefungsergebnissen von einer
 * Vielzahl von Studenten. Aus den gespeicherten Ergebnissen lassen sich
 * personalisierte Antworttext generieren.
 */
public class Pruefungsverwaltung {
    private ArrayList<Pruefungsergebnis> ergebnisse = new ArrayList<Pruefungsergebnis>();
  /**
   * Speichert ein Pruefungsergebnis.
   * 
   * @param ergebnis Das Pruefungsergebnis.
   */
  public void speichereErgebnis(Pruefungsergebnis ergebnis) {
      ergebnisse.add(ergebnis);
  }

  /**
   * Gibt pro gespeichert Ergebnis einen Text auf die Konsole aus.
   * Je nachdem ob der Kandidate die Pruefung bestanden (>= 4.0) oder nicht
   * bestanden (< 4.0) hat, wird ein Text in folgendem Format ausgegeben:
   * 
   * Sie haben an der Pruefung eine 3.0 erzielt und 
   * sind somit durchgefallen!
   * 
   * Herzliche Gratulation Max Muster! Sie haben an der Pruefung eine 4.5
   * erzielt und somit bestanden!
   */
  public void druckeAntworttexte() {
      for(Pruefungsergebnis ergebnis : ergebnisse)
      {
          String text = "";
          double note = rundeAufHalbeNote(ergebnis.getNote());
          if(note>=4.0)
          {
              text = "Herzliche Gratulation "+ergebnis.getStudent()+"! Sie haben an der Pruefung eine "+note+" erzielt und somit bestanden!";
            }
            else
            {
                text = ergebnis.getStudent()+", Sie haben an der Pruefung eine "+note+" erzielt und sind somit durchgefallen!";
            }
            
            System.out.println(text);
          
      }
  }

  private double rundeAufHalbeNote(double note) {
    return Math.round(note * 2) / 2.0;
  }
}
