package com;

import java.util.Scanner;

public class CameraRentalApp {

	public static void main(String[] args) {

		System.out.println("+----------------------------------+");
		System.out.println("|   WELCOME TO CAMERA RENTAL APP   |");
		System.out.println("+----------------------------------+");
		
		Scanner sc = new Scanner(System.in);
		
		String userName = "abc123@gmail.com";
		String password = "abc123";
		
		System.out.println("PLEASE LOGIN TO CONTINUE ");
		String user_enteredusername = sc.next();
		String user_enteredpassword = sc.next();
		
		
		if(checkLoginCredentials(userName, password, user_enteredusername, user_enteredpassword)) {
			optionsSelection() ;	
			
		}else {
            System.out.println("LOGIN FAILED!!! PLEASE ENTER VALID USERNAME AND PASSWORD.");
		}
		sc.close();
	}

	 private static void optionsSelection() {
	        String[] arr = {"1. My Camera",
	                "2. Rent A Camera",
	                "3. View All Cameras",
	                "4. My Wallet",
	                "5. Exit"
	        };
	        
	        int[] arr1 = {1,2,3,4,5};
	        for(int i=0; i < arr1.length; i++) {
	        	System.out.println(arr[i]);
	        }
	        
	        System.out.println("\nEnter your choice:\t");
	        Scanner sc = new Scanner(System.in);
	        int  options =  sc.nextInt();
	        for(int j=1;j<=arr1.length;j++){
	            if(options==j){
	                switch (options){
	                    case 1:
	                        System.out.println("Your saved expenses are listed below: \n");
	                        
	                        String[] mycamera = {"1.Add",
	    	                					"2. Remove",
	    	                					"3. View My Cameras",
	    	                					"4. Go to Previous Menu",					
	                        };
	    	        
	    	        		int[] arr2 = {1,2,3,4};
	    	        		for(int i=0; i < arr2.length; i++) {
	    	        		System.out.println(arr[i]);
	    	        		}
	    	        		
	                        break;
	                    case 2:
	                        System.out.println("Enter the value to add your Expense: \n");
	                        int value = sc.nextInt();
//	                        expenses.add(value);
	                        System.out.println("Your value is updated\n");
//	                        expenses.addAll(arrlist);
//	                        System.out.println(expenses+"\n");
	                        optionsSelection();

	                        break;
	                    case 3:
	                        System.out.println("You are about the delete all your expenses! \nConfirm again by selecting the same option...\n");
	                        int con_choice = sc.nextInt();
	                        if(con_choice==options){
//	                               expenses.clear();
//	                            System.out.println(expenses+"\n");
	                            System.out.println("All your expenses are erased!\n");
	                        } else {
	                            System.out.println("Oops... try again!");
	                        }
	                        optionsSelection();
	                        break;
	                    case 4:
//	                        sortExpenses(expenses);
//	                        System.out.println("Sorted expenses: " + expenses + "\n");
	                        optionsSelection();
	                        break;
	                    case 5:
//	                        searchExpenses(expenses);
	                        optionsSelection();
	                        break;
	                    case 6:
//	                        closeApp();
	                        break;
	                    default:
	                        System.out.println("You have made an invalid choice!");
	                        break;
	                }
	            }
	        }
	        
	 }
	 
	 
	 
	 
	 
	 
	 

	private static boolean checkLoginCredentials(String userName, String password, String user_enteredusername,
			String user_enteredpassword) {
		// TODO Auto-generated method stub
		return user_enteredusername.equals(userName) && user_enteredpassword.equals(password);
	}

}
