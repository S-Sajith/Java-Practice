import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;



public class ReadData{

	public static void main(String[] args) throws IOException{
		
		// Aproach 1: FileReader BufferedReader

		FileReader fr = new FileReader("F:\\Java Practice\\Frequently asked programs\\29 Read data from a text file\\Data.txt");
		BufferedReader br = new BufferedReader(fr);

		String str;

		while( (str = br.readLine())!=null){
			System.out.println(str);
		}

		br.close();

	}

}