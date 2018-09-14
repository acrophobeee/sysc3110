import java.util.ArrayList;

public class AddressBook {
    
	ArrayList<BuddyInfo> a;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Address book");     
	}
    public void addBuddy(BuddyInfo aa) {
    	if(aa != null) {
    		a.add(aa);
    	}
    }
    
    public void removeBuddy(int index) {
    	if (index >=0 && index <a.size()) {
    		a.remove(index);
    	}
    }
}
