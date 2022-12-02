package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import service.ContractService;
import service.PaypalService;

public class Main {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	System.out.println("Enter Contract Data: ");
	System.out.print("number: ");
	int number = sc.nextInt();
	sc.nextLine();
	
	System.out.print("Date (dd/MM/yyyy):");
	LocalDate date = LocalDate.parse(sc.next(), fmt);
	
	System.out.print("Contract Value: ");
	double totalValue = sc.nextDouble();
	
	Contract obj = new Contract(number, date, totalValue);
	
	System.out.print("num parcelas: ");
	int n = sc.nextInt();
	ContractService contractService = new ContractService(new PaypalService());
	contractService.processContract(obj, n);
	
	System.out.println("parcelas: ");
	for (Installment inst : obj.getInstallments()) {
		System.out.println(inst);
	}
	
	sc.close();
	}

}
