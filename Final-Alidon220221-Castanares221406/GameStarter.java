import java.net.*;
import java.io.*;

public class GameStarter {
    private Player player;
    private int id = 0;

    public GameStarter(){
        try{
            Socket s = new Socket("localhost", 49501);
            DataInputStream in = new DataInputStream(s.getInputStream());            
            DataOutputStream out = new DataOutputStream(s.getOutputStream());

            id += 1;
            player = new Player(s, id);

        } catch(IOException ex){
            System.out.println("Client error!");
        }
    }

    public static void main(String[] args){
        GameStarter gs = new GameStarter();
    }
}
