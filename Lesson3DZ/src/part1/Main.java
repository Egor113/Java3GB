package part1;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        writeFromConsole();
        printFile();
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

    public static void printFile(){
        try (BufferedReader reader = new BufferedReader( new
                FileReader( "test.txt" ))) {
            String str;
            while ((str = reader.readLine()) != null ) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
