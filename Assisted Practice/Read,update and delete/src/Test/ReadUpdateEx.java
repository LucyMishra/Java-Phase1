package Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadUpdateEx 
{
	// Write program to read,write and append a file
      public void writeOrAppendDataIntoFile() {
			FileWriter fstream = null;
			try {
				fstream = new FileWriter("C:\\Users\\sures\\Desktop\\Suresh\\newfile.txt", true);
				BufferedWriter fbw = new BufferedWriter(fstream);
				Scanner sc = new Scanner(System.in);
				System.out.println("Please enter the fileData");
				String s = sc.nextLine();
				fbw.write(s);
				fbw.newLine();
				fbw.close();
			} catch (IOException e) 
			{
				e.printStackTrace();
			}

		}

		public void readFileData() {

			try {
				BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\sures\\Desktop\\Suresh\\newfile.txt"));
				String str;

				while ((str = in.readLine()) != null) {
					System.out.println(str);
				}
				System.out.println(str);
			} catch (IOException e) {
			}

		}
		public static void main(String[] args) {
			
			ReadUpdateEx object = new ReadUpdateEx();
			object.writeOrAppendDataIntoFile();
			object.readFileData();
			
		}
	}


