import java.net.*;
import java.io.*;

public class GameServer implements Runnable {
    private int id = 0; 
    public GameServer() {
        try{
            ServerSocket server = new ServerSocket(49501);
            System.out.println("[SERVER] Waiting for client connection...");

            for(int i = 0; i < 2; i++){
                id += 1;
                Socket client = server.accept();
                CThread main = new CThread();
                main.start();
            }
        }catch(IOException ex){
            System.out.println("Server error!");
        }
    }

    @Override
    public void run() {
        System.out.println("Client " + id + " has connected to the Server.");
    }

    public static void main(String[] args){
        GameServer gs = new GameServer();
    }
}