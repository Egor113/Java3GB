package part1;

import java.io.*;

public class WriterAndReaderDemoApp {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter( new
                FileWriter( "demo.txt" ))) {
            for ( int i = 0 ; i < 20 ; i++) {
                writer.write( "Java\n" );
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader reader = new BufferedReader( new
                FileReader( "demo.txt" ))) {
            String str;
            while ((str = reader.readLine()) != null ) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
