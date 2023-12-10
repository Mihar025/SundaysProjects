package Client;

import Mykhailo.Phone;
import java.io.*;


public class Client {
    public static void main(String[] args) {
        try (Phone phone= new Phone("127.0.0.1", 8000)) {
            System.out.println("Connected to server");

            String request = "New-York";
            System.out.println("Request: " + request);
            phone.writeLine(request);

            String responce = phone.readLine();
            System.out.println("Responce: " + responce);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
