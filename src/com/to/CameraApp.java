package com.to;

import java.util.ArrayList;
import java.util.List;

public class CameraApp{
	List<Camera> items;
	
	WalletBalance wb = new WalletBalance();
	
	public CameraApp() {
		items=new ArrayList<Camera>();
	}
	
	
	
	public void add( Camera cam) {
		items.add(cam);
	}
	
	public void remove(int id) {
		
		for(Camera item:items) {
			if (item.getId()==id) {
				items.remove(item);
				return;
			}
		}
		
		 System.out.println(" ID NOT FOUND...  ");
		
	}
	
	
	public Camera loadData() {
		items.add(new Camera(1, "Samsung", "DS123", 500, "Available"));
    	items.add(new Camera(2, "Sony", "HD124", 500, "Available"));
    	items.add(new Camera(3, "Panason", "XC", 5000, "Available"));
        items.add(new Camera(4, "Canon", "XLR", 2000, "Rented"));
        items.add(new Camera(5, "Fujitsu", "J5", 50000, "Available"));
        items.add(new Camera(6, "Sony", "HD223", 2500, "Available"));
        items.add(new Camera(7, "LG", "L123", 500, "Available"));
        items.add(new Camera(8, "Canon", "XPL", 1500, "Rented"));
        items.add(new Camera(9, "Chroma", "CT", 500, "Available"));
        items.add(new Camera(10, "Canon", "Didital", 1250, "Available"));
        items.add(new Camera(11, "Nikon", "DSD7500", 500, "Rented"));
        items.add(new Camera(12, "Sony", "DSLR12", 200, "Available"));
        items.add(new Camera(13, "Sony", "SONY123", 123, "Available"));
        items.add(new Camera(14, "Canon", "5050", 25000, "Available"));
        items.add(new Camera(15, "Nikon", "2030", 500, "Available"));
		return null;
    	 
	}
	
	public void  display() {
		System.out.printf("=================================================================\n");
        System.out.printf("Id" + "\t" + "Brand" + "\t\t" + "Model" + "\t\t" + "Price" + "\t\t" + "Status"+"\n" );
        System.out.printf("=================================================================\n");

          
        for (Camera obj : items) {
       	 System.out.printf( obj.getId()+ "\t"+ obj.getBrand() + "\t\t" + obj.getModel()+ "\t\t" + obj.getPrice() + "\t\t" +obj.getStatus());
       			 System.out.print("\n");
        
        }
	}
	
	public void rentACam() {
		
		for(Camera item : items) {
			if(item.getStatus() == "Available")
				System.out.printf( item.getId()+ "\t"+ item.getBrand() + "\t\t" + item.getModel()+ "\t\t" + item.getPrice() + "\t\t" +item.getStatus() + "\n");
		}	
		System.out.println('\n');
	}
	
	
	public void checkBalance(int id) throws InSufficientBalanceException{
		for(Camera item : items) {
			if(item.getId() == id && "Available".equals(item.getStatus())) {
				if(item.getPrice() > wb.balance) {
					throw new InSufficientBalanceException("ERROR: TRANSACTION FAILED DUE TO INSUFFICIENT WALLET BALANCE. PLEASE DEPOSIT THE AMOUNT INTO YOUR WALLET.\n");
				}
				else {
					System.out.println("YOUR TRANSACTION FOR CAMERA - " +item.getModel()+" with rent INR." +item.getPrice()+ " HAS SUCCESSFULLY COMPLETED.\n");
					break;
				}
			}
			
		}
	}
		
}
