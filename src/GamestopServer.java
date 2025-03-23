import utils.*;
public class GamestopServer extends Server {

    private List<Game> ListOrders;

    public GamestopServer(int pPortnummer, List<Game> ListOrders){
        super(38);
        System.out.println("Server gestartet.");
    }

    public void processNewConnection (String pClientIP, int pClientPort){
        String beginn = "Herzlich Willkommen beim Gamestop. ";
        send(pClientIP,pClientPort,beginn);
    }

    //private void processNewMessage (String pClientIP, int pClientPort){}

    public Game findGame (String pMessage){
        Game l = null;
        ListOrders.toFirst();
        while(ListOrders.hasAccess()){
            if(ListOrders.getContent().equals(pMessage)){
               l = ListOrders.getContent();
               ListOrders.toLast();
            }
            ListOrders.next();
        }
        return l;
    }

    public void showAvailableGames(List<Game> ListOrders){

    }

    public void processMessage (String pClientIP, int pClientPort, String pMessage){
        pMessage = "Gib einen RequestGame an.";
        send(pClientIP,pClientPort,pMessage);
    }

    public void processClosingConnection (String pClientIP, int pClientPort){
        String end = "Vielen Dank für Ihren Besuch.";
        send(pClientIP,pClientPort,end);
    }

    //public void processClosedConnection (String pClientIP, int pClientPort){}
}
