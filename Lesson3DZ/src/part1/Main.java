package part1;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        writeFromConsole();
    }
    public static void writeFromConsole() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        try (BufferedWriter writer = new BufferedWriter( new FileWriter( "test.txt" ))){
            while (!(line = reader.readLine()).isEmpty()){
                writer.write(line + "\n");
            }
        }
    }
}
