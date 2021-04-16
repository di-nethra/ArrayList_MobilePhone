package MobilePhone;

public class Contact {
private static String name;
private static int contactNum;

public Contact(String name,int contactNum) {
	this.name=name;
	this.contactNum=contactNum;	
}

public static String getName() {
	return name;
}
public int getContactNum() {
	return contactNum;
}

public static Contact createContact(String name,int contactNum) {
	return new Contact(name,contactNum);
}


}
