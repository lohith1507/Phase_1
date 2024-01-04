package com.to;

import java.util.Scanner;

public class CameraRentalApp {
	
	
	public static Camera getDetails(Scanner sc) {
		System.out.print("Enter the camera Id :");
		int id = Integer.parseInt(sc.nextLine());
		System.out.print("Enter the camera brand :");
		String brand =  sc.nextLine();
		System.out.print("Enter the model :");
		String model = sc.nextLine();
		System.out.print("Enter the price :");
		float price = Float.parseFloat(sc.nextLine());
		String status = " ";

		return new Camera(id,brand, model, price ,status);
	}

	public static void main(String[] args) {
		
		System.out.println("+----------------------------------+");
		System.out.println("|   WELCOME TO CAMERA RENTAL APP   |");
		System.out.println("+----------------------------------+");
		System.out.println("\nPLEASE LOGIN TO CONTINUE ");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Username : ");
		String username = sc.nextLine();
		System.out.print("Enter Password : ");
		String password = sc.nextLine();  
		System.out.println();
		
		CameraApp app=new CameraApp();
		app.loadData();
		WalletBalance WB = new WalletBalance();
		
		 
		while(true) {
			
			System.out.print("1. My Camera \n2. Rent A Camera \n3. View All Cameras \n4. My Wallet \n5. Exit \n\nEnter your option	: ");
			int option=Integer.parseInt(sc.nextLine());
			
			if(option==5)
				break;
			
			switch(option) {
			case 1:
				System.out.print("1. add \n2. remove \n3. view all cameras \n4. Go to perivos menu \n\nEnter your option : ");
				System.out.println();
				int option2=Integer.parseInt(sc.nextLine());
				switch(option2) {
				case 1:
					app.add(getDetails(sc));
					app.display();
					System.out.println("\nYOUR CAMERA HAS BEEN SUCCESSFULLY ADDED TO THE LIST.\n");
					break;
					
				case 2:
					System.out.print("Enter the Camera  Id  to remove : ");
					app.remove(Integer.parseInt(sc.nextLine()));
					app.display();
					System.out.println("\nCAMERA SUCCESSFULLY REMOVED FROM THE LIST.\n");
					System.out.println();
					break;
					
				case 3:
					app.display();
					System.out.println();
					break;
					
				case 4:
					break;
					
				default:
					System.out.println("YOU HAVE MADE AN INVALID CHOICE.");
					break;

				}
				break;
				
			case 2:
				app.rentACam();
				System.out.print("Enter the Camera  Id  you wish to rent : ");
				try{
					app.checkBalance(Integer.parseInt(sc.nextLine()));
				}catch(InSufficientBalanceException e){
					System.out.println(e.getMessage());
				}
	
				break;

			case 3:
				app.display();
				System.out.println();
				break;
				
			case 4:
				WB.addAmount();
				System.out.println();
				break;
				
			case 5:
				break;
				
			default:
				System.out.println("YOU HAVE MADE AN INVALID CHOICE.");
				break;
								
			}
		}
		System.out.println("THANK YOU... APPLICATION CLOSED SUCCESSFULLY! ");

		

	}

}
