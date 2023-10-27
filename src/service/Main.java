package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		BanqueService ser =new BanqueService();
		
		Scanner scan =new Scanner(System.in);
		System.out.println("donner un MOntant:\n");
		double TND =scan.nextDouble();
		System.out.println("le montant avant le conversion ="+TND);
		
		double  Euro =ser.conversion(TND);
	
		System.out.println("\nle montant aprés le conversion ="+Euro);
		
		Compte C1 =ser.getCompte(103);
		
		ArrayList<Compte> comptes1= ser.getComptes();
		for(int i=0;i<comptes1.size();i++)
		{
			System.out.println("Le Compte "+i+":\nCode:"+ comptes1.get(i).getCode()+"\nSolde:"+comptes1.get(i).getSolde()+
					"\nDate de Creation:"+comptes1.get(i).getDateCreation()+"\n");
		}
		
	
		

	}

}