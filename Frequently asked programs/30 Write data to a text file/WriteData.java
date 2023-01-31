import java.io.*;

public class WriteData{
	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter("F:\\Java Practice\\Frequently asked programs\\30 Write data to a text file\\Data.txt");
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write("Ayoogah");

		System.out.println("Finished writing");

		bw.close();
	}
}