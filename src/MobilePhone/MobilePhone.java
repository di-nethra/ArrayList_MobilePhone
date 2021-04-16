package MobilePhone;

import java.util.ArrayList;

public class MobilePhone {
	private int phoneNum;
	private ArrayList<Contact>myContacts;
	
	public MobilePhone(int phoneNum) {
		this.phoneNum=phoneNum;
		this.myContacts=new ArrayList<Contact>();
	}
	public boolean addContact(Contact contact) {
		if(findContact(contact.getName())>=0) {
			System.out.println("Conatct already Exsists!");
			return false;
		}
		myContacts.add(contact);
		return true;
	}
	public boolean updateContact(Contact oldContact,Contact newContact) {
		
		int index=findContact(oldContact);
		if(index<0) {
			System.out.println(oldContact.getName()+"was not fount");
			return false;
		}
		else {
		    myContacts.set(index,newContact);
		    System.out.println(oldContact.getName()+" is updated to "+newContact.getName());
		    return true;
		}
	}
	
	
	
	private int findContact(Contact contact) {
		return this.myContacts.indexOf(contact);
	}
	private int findContact(String name) {
		for(int i=0;i<myContacts.size();i++) {
			Contact contact=myContacts.get(i);
			if(contact.getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
	
}
