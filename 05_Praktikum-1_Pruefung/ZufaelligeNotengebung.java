import java.util.Random;

/**
 * Simuliert Pruefungsergebnisse zum Testen der Pruefungsverwaltung.
 */
public class ZufaelligeNotengebung {

  /**
   * Fuehrt die Simulation aus.
   */
  public void fuehreAus() {
    Pruefungsverwaltung pruefungsverwaltung = new Pruefungsverwaltung();

    for (int i = 0; i < 3; i++) {
      String name = "Max Muster " + i;
      double note = generiereZufaelligePruefungsnote();
      Pruefungsergebnis pruefungsergebnis = new Pruefungsergebnis(name, note);
      pruefungsverwaltung.speichereErgebnis(pruefungsergebnis);
    }

    pruefungsverwaltung.druckeAntworttexte();
  }

  private double generiereZufaelligePruefungsnote() {
    return 1.0+Math.random()*5.0;
  }
}
