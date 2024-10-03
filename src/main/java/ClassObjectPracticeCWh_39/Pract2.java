package ClassObjectPracticeCWh_39;

class CellPhone{
	void Ring() {
		System.out.println("Ringing.....");
	}
	
	void Vibrate() {
		System.out.println("Vibrating......");
	}
	
	void CallFriend() {
		System.out.println("Friend Calling Arvind......");
	}
}

public class Pract2 {

	public static void main(String[] args) {
		
		CellPhone onePlus= new CellPhone();
		onePlus.CallFriend();
		onePlus.Vibrate();
		onePlus.Ring();

	}

}
