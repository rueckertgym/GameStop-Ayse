import utils.*;
public class GamestopServer extends Server {

    private List<Game> ListOrders;

    public GamestopServer(int pPortnummer, List<Game> ListOrders){}

    public void processNewConnection (String pClientIP, int pClientPort){}

    private void processNewMessage (String pClientIP, int pClientPort){}

    public Game findGame (String pMessage){}

    public void showAvailableGames(List<Game> ListOrders){}

    public void processMessage (String pClientIP, int pClientPort, String pMessage){}

    public void processClosingConnection (String pClientIP, int pClientPort){}

    public void processClosedConnection (String pClientIP, int pClientPort){}
}
