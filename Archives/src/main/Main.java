package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.entities.Archive;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List <Archive> prod = new ArrayList<>();
		
		
		System.out.println("Enter file path: ");
		String sourceFileStr = sc.nextLine();

		File sourceFile = new File(sourceFileStr);
		String sourceFolderStr = sourceFile.getParent();
		
		
		boolean success = new File(sourceFolderStr +"\\out").mkdir();
		String targetFileStr = sourceFolderStr + "\\out\\summary.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
			
			String Item = br.readLine();
			while (Item != null) {
				
			String[] parts = Item.split(",");
			String name = parts[0];
			String price = parts[1];
			String quantity = parts[2];
			
			prod.add(new Archive(name, Double.parseDouble(price), Integer.parseInt(quantity)));
			Item = br.readLine();
			}
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
				for (Archive item : prod) {
					bw.write(item.getName() + "," + String.format("%.2f", item.total()));
					bw.newLine();
				}

				System.out.println(targetFileStr + " CREATED!");
				
			}
			catch(IOException e){
				System.out.println("Erro reading File: "+e.getMessage());
			}
			
		}
		catch (IOException e) {
		System.out.println("Erro writing File: "+e.getMessage());

	}
	sc.close();

}
}
