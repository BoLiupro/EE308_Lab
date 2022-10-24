import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class lab2_commit {
    public static String code = "";

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();//ex.fileName ="/Users/liubo/Desktop/lab1_code.txt";
        int level = sc.nextInt();
        sc.close();
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = bufferedReader.readLine();
        while (line != null) {
            code += line;
            line = bufferedReader.readLine();
        }
    }
}