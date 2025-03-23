import utils.Client;
import javax.swing.JOptionPane;

public class GamestopClient extends Client {

    public GamestopClient(String pServerIP, int pServerPort){
        super("127.0.0.1", 38);
    }

    public void requestGame (String gameName){
        send("RequestedGame: " + gameName);
    }

    public void abmelden (){
        send("ABMELDEN");
    }

    public void processMessage (String pMessage) {
        JOptionPane.showMessageDialog(null,"Server sendet:\n" + pMessage);
        if (pMessage.toUpperCase().startsWith("HERZLICH")){

        } else if (pMessage.toUpperCase().startsWith("Gib")){
            String h = "";
            requestGame(h);
        } else if (pMessage.toUpperCase().startsWith("Gib")){
            String h = "";
            requestGame(h);
        } else if (pMessage.toUpperCase().startsWith("Gib")){
            String h = "";
            requestGame(h);
        }
        abmelden();
    }
}
