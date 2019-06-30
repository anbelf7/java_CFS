public class Partita {

    private int lanci;
    private int punteggioGiocatore;
    private int punteggioComputer;

    public Partita(int lanci) {
        this.lanci = lanci;
        this.punteggioGiocatore = 0;
        this.punteggioComputer = 0;
    }

    public int getPunteggioGiocatore() {
        return this.punteggioGiocatore;
    }

    public int getPunteggioComputer() {
        return this.punteggioComputer;
    }

    public int aggiornaGiocatore() {
        return this.punteggioGiocatore++;
    }

    public int aggiornaComputer() {
        return this.punteggioComputer++;
    }

    public int numLanci() {
        return this.lanci--;
    }

    public boolean partitaFinita() {
        boolean fine = false;
        if(lanci <= 0){
            fine = true;
            return fine;
        }
        return fine;
    }

    public void vittoriaFinale(){
        if (getPunteggioComputer()>getPunteggioGiocatore()){
            System.out.println("Vince la partita il computer");
        } else if (getPunteggioGiocatore()>getPunteggioComputer()) {
            System.out.println("Vince la partita il giocatore");
        } else {
            System.out.println("La partita è finita in pareggio");
        }
    }

}
