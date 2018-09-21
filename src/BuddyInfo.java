
public class BuddyInfo {

	String name;
    String address;
    String phone;
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	BuddyInfo b= new BuddyInfo("xinyuchen","southagte","101");
    	String a ="xinyuchen";
    	b.setName(a);
    System.out.println("Hello World");
    System.out.println("Hello "+  b.getName());
      
    }
    
    public BuddyInfo(String name, String address, String phone) {
    
    	this.name=name;
    	this.address=address;
    	this.phone=phone;
    }
    
    public String getName() {
    
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public  String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public  String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

    
	
	
    
}