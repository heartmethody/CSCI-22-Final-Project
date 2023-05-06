import java.net.*;
import java.io.*;

public class Player implements Runnable {
    private Socket client;
    private int playerID;
    private DataInputStream in;
    private DataOutputStream out;

    public Player(Socket clientSocket, int id){
        try{
            this.client = clientSocket;
            this.playerID = id;
            in = new DataInputStream(client.getInputStream());            
            out = new DataOutputStream(client.getOutputStream());

        } catch(IOException ex){
            System.out.println("Client error!");
        }
    }

    @Override
    public void run() {
        
    }

    public int getPlayerID(){
        return playerID;
    }

}
