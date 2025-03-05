/**
 * La classe Libro rappresenta un libro con un titolo, un autore e un numero di
 * copie disponibili e in prestito.
 */
public class Libro {

    /**
     * Il titolo del libro.
     */
    private String titolo;

    /**
     * L'autore del libro.
     */
    private String aut;

    /**
     * Il numero di copie disponibili del libro.
     */
    private int cop_disp;

    /**
     * Il numero di copie del libro attualmente in prestito.
     */
    private int cop_prest;

    /**
     * Costruisce un nuovo libro con il titolo, l'autore e il numero di copie
     * disponibili specificati.
     *
     * @param titolo   Il titolo del libro.
     * @param aut      L'autore del libro.
     * @param cop_disp Il numero di copie disponibili del libro.
     */
    public Libro(String titolo, String aut, int cop_disp) {
        this.titolo = titolo;
        this.aut = aut;
        this.cop_disp = cop_disp;
        this.cop_prest = 0;
    }

    /**
     * Restituisce il titolo del libro.
     *
     * @return Il titolo del libro.
     */
    public String getTitolo() {
        return titolo;
    }

    /**
     * Restituisce l'autore del libro.
     *
     * @return L'autore del libro.
     */
    public String getAutore() {
        return aut;
    }

    /**
     * Restituisce il numero di copie disponibili del libro.
     *
     * @return Il numero di copie disponibili del libro.
     */
    public int getCopie_disp() {
        return cop_disp;
    }

    /**
     * Restituisce il numero di copie del libro attualmente in prestito.
     *
     * @return Il numero di copie del libro attualmente in prestito.
     */
    public int getCopie_prest() {
        return cop_prest;
    }

    /**
     * Aggiunge un numero specificato di copie disponibili al libro.
     *
     * @param copie Il numero di copie da aggiungere.
     */
    public void aggiungiCopie(int copie) {
        this.cop_disp += copie;
    }

    /**
     * Effettua il prestito di una copia del libro, se disponibile.
     *
     * @return true se il prestito è stato effettuato con successo, false
     *         altrimenti.
     */
    public boolean prestito() {
        if (cop_disp > 0) {
            cop_disp--;
            cop_prest++;
            return true;
        }
        return false;
    }

    /**
     * Effettua la consegna di una copia del libro in prestito.
     *
     * @return true se la consegna è stata effettuata con successo, false
     *         altrimenti.
     */
    public boolean consegna() {
        if (cop_prest > 0) {
            cop_disp++;
            cop_prest--;
            return true;
        }
        return false;
    }

    /**
     * Restituisce una rappresentazione in formato stringa del libro.
     *
     * @return Una stringa che rappresenta il libro.
     */
    @Override
    public String toString() {
        return "- " + titolo + " dell\' autore " + aut + ", Copie Disponibili: " + cop_disp;
    }
}