import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Scegli il numero di lanci da effettuare nella partita:");

        while(!sc.hasNextInt()){
            System.out.println("Hai inserito un carattere non valido. Scegli il numero di lanci da effettuare nella partita:");
            sc.next();
        }

        Partita partita = new Partita(sc.nextInt());
        Simbolo simbolo = new Simbolo();

        while (!partita.partitaFinita()){

            System.out.println("Scegli il tuo simbolo:");
            System.out.print("Sasso - Carta - Forbice: ");
            String giocatore = sc.next();
            int computer = simbolo.lancioComputer();
            switch (giocatore) {
                case "sasso":
                case "Sasso":
                case "s":
                    if (computer == Simbolo.CARTA){
                        System.out.println( "Vince computer");
                        partita.aggiornaComputer();
                    } else if (computer == Simbolo.FORBICI){
                        System.out.println("Vince giocatore");
                        partita.aggiornaGiocatore();
                    } else if (computer == Simbolo.SASSO) {
                        System.out.println("Pareggio");
                    }
                    break;
                case "carta":
                case "Carta":
                case "c":
                    if (computer == Simbolo.FORBICI){
                        System.out.println( "Vince computer");
                        partita.aggiornaComputer();
                    } else if (computer == Simbolo.SASSO){
                        System.out.println("Vince giocatore");
                        partita.aggiornaGiocatore();
                    } else if (computer == Simbolo.CARTA) {
                        System.out.println("Pareggio");
                    }
                    break;
                case "forbice":
                case "Forbice":
                case "f":
                    if (computer == Simbolo.SASSO){
                        System.out.println( "Vince computer");
                        partita.aggiornaComputer();
                    } else if (computer == Simbolo.CARTA){
                        System.out.println("Vince giocatore");
                        partita.aggiornaGiocatore();
                    } else if (computer == Simbolo.FORBICI) {
                        System.out.println("Pareggio");
                    }
                    break;
                default:
                    break;
            }
            System.out.println("Computer " + partita.getPunteggioComputer() + " - Giocatore " + partita.getPunteggioGiocatore()+"\n");
            partita.numLanci();
        }
        partita.vittoriaFinale();
    }
}
