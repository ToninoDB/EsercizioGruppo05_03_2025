public class Libro{
    private String titolo;
    private String aut;
    private int cop_disp;
    private int cop_prest;

    public Libro(String titolo, String aut, int cop_disp, int cop_prest){
        this.titolo = titolo;
        this.aut = aut;
        this.cop_disp = cop_disp;
        this.cop_prest = cop_prest;
    }
    public String getTitolo(){
        return titolo;
    }
    public String getAutore(){
        return aut;
    }
    public int getCopie_disp(){
        return cop_disp;
    }
    public int getCopie_prest(){
        return cop_prest;
    }
    public boolean prestito(){
        if(cop_disp > 0){
            cop_disp--;
            cop_prest++;
            return true;
        }
        return false;
    }
    public boolean consegna(){
        if(cop_disp > 0){
            cop_disp++;
            cop_prest--;
            return true;
        }
        return false;
    }
    @Override
    public String toString(){
        return "- "+ titolo + " dell\' autore " + aut  + ", Copie Disponibili: " + cop_disp;
    }
}