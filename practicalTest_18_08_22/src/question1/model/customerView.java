package question1.model;
import question1.model.customer;

public class customerView {

	public static void main(String[] args) {
		customer csobj=new customer();
		
		csobj.setId(111);
		System.out.println(csobj.getId());
		
		csobj.setName("nandu");
		System.out.println(csobj.getName());
		
		csobj.setAge(21);
		System.out.println(csobj.getAge());
		
	}

}
