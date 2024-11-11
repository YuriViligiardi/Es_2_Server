package it.viligiardi;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        ServerSocket ss1 = new ServerSocket(5200);
        Operation o = new Operation();

        try {
            Socket s = ss1.accept();
            System.out.println("Qualcuno si è collegato");

            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            DataOutputStream out = new DataOutputStream(s.getOutputStream());

            String sIn = in.readLine();
            int oIn = in.read();
            System.out.println("Stringa ricevuta: " + sIn);
            System.out.println("Operazione ricevuta: " + oIn);

            String sOut = o.scelta(oIn, sIn);
            out.writeBytes(sOut + "\n");
            System.out.println("Stringa inviata: " + sOut);

        } catch (Exception e) {
            System.out.println("Errore, comunicazione fallita");
        }
    }
}
