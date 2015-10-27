/**
 * Die Klasse MessApp steuert einen Messablauf, um die Performance des
 * Zufallszahlengenerators zu messen.
 */
public class MessApp {
  private Messkonduktor messkonduktor;
  private int[][] ergebnis;

  /**
   * Fuehrt eine Messung durch.
   */
  public void messen() {
    initialisieren();
    analyseDurchfuehren();
    berechneUndDruckeMittelwerteMessreihe();
    berechneUndDruckeMittelwerteMessung();
  }

  private void initialisieren() {
    messkonduktor = new Messkonduktor(400000);
    ergebnis = new int[10][20];
  }

  private void analyseDurchfuehren() {
    for(int[] reihe : ergebnis)
    {
        messkonduktor.messungenDurchfuehren(reihe);
    }
  }

  private void berechneUndDruckeMittelwerteMessreihe() {
      System.out.println("Reihen");
      for(int[] reihe : ergebnis)
    {
        int wert = 0;
        for(int messung : reihe)
        {
            wert += messung;
        }
        System.out.println((wert/reihe.length)+"ms");
    }
  }

  private void berechneUndDruckeMittelwerteMessung() {
            System.out.println("Spalten");
      for(int i=0; i<ergebnis[0].length; i++)
      {
          int wert = 0;
          for(int j=0; j<ergebnis.length; j++)
          {
              wert += ergebnis[j][i];
          }
          System.out.println("Messung "+i+" : "+(wert/ergebnis.length)+"ms");
      }
  }
}