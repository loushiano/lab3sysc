package buddyInfos;

import java.util.*;
public class AddressBook {
	
	//new change
	private ArrayList<BuddyInfo> myList;
	
	public AddressBook(){
		
		
		ArrayList<BuddyInfo> myList = new ArrayList<BuddyInfo>();
		
	}
	
	
	
	public void addBuddy(BuddyInfo temp){
	
		myList.add(temp);
		
	}
	public void removeBuddy(int index ){
		myList.remove(index);
		
		//hello
	}
	
	public static void main (String[] args ){
		
		System.out.println("Address Book");
		BuddyInfo buddy = new BuddyInfo ( 22 ,"Ali");
		AddressBook addressBook = new AddressBook();
		addressBook.addBuddy(buddy);
		addressBook.removeBuddy(0);
		//woo
	}

}
