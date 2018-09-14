import java.util.ArrayList;

public class AddressBook {
    
	ArrayList<BuddyInfo> a = new ArrayList<BuddyInfo>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Address book");    
       AddressBook ad= new AddressBook();
       BuddyInfo q= new BuddyInfo("xinyuchen","southgate","101031031");
       ad.addBuddy(q);
       ad.removeBuddy(0);
         
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
