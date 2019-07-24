import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");

        File file = new File("data/phoneDirectory.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        //Read lines one by one

        String line = bufferedReader.readLine();
        int countLines = 1;
        while (line != null){
            System.out.println("line#" + countLines + " : " + line);
            countLines += 1;
            line = bufferedReader.readLine();

        }
        bufferedReader.close();

    }


}
