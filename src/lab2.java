import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lab2 {
	public static String code="";
	public static void main(String [] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		String fileName=sc.nextLine();//ex.fileName ="/Users/liubo/Desktop/lab1_code.txt";
		int level = sc.nextInt();
		sc.close();
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line=bufferedReader.readLine();
        while(line!=null) {
        	code+=line;
        	line=bufferedReader.readLine();
        }
	}

	//check total key word
	public static void level1() {
		String keywords="abstract、assert、boolean、break、byte、case、"
				+ "catch、char、class、continue、default、do、double、else、"
				+ "enum、extends、final、finally、float、for、if、implements、"
				+ "import、int、interface、instanceof、long、native、new、"
				+ "package、private、protected、public、return、short、static、"
				+ "strictfp、super、switch、synchronized、this、throw、throws、"
				+ "transient、try、void、volatile、while";//all keywords
		String []keyArr=keywords.split("、");
		int total_num=0;
		for(int i=0;i<keyArr.length;i++) {
			Pattern p=Pattern.compile("[^a-z]"+keyArr[i]+"[^a-z]");
			Matcher matcher=p.matcher(code);
			while(matcher.find()) {
				total_num++;
			}
		}
		System.out.println("total num is "+total_num);
	}
}
