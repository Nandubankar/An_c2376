package question1.model;

public class customer {
	int id;
	String name;
	int age;
	
	public void add (int i_id , String n_name ,int a_age) {
		id=i_id;
	    name=n_name;
		age=a_age;
		
	}
	public void add () {
		
	}
	
	 //seter  //getter
    
    public void setId(int i) {
   	 id=i;
    }
    public int getId() {
   	 return id; 
    }
    public String getName() {
   	 return name;
    }
    
    public void setName(String n) {
   	 name=n;
    }
    
    public void setAge(int a) {
   	 age=a;
    }
    public int getAge() {
   	 return age;
    }
    
    

}
