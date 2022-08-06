package week1.day1;

public class TwoWheeler {
	int noOfWheels = 2;
	short noOfMirrors = 6872;
	long chassisNumber = 786455559027252l;
	boolean isPunctured = true;
	String bikeName = "Duke250";
	double runningKM = 894.788;
	
	public static void main(String[] args) {
		
		TwoWheeler Ktm = new TwoWheeler();
		
		System.out.println("No.of.Wheels =" +Ktm.noOfWheels);
		System.out.println(Ktm.noOfMirrors);
		System.out.println(Ktm.chassisNumber);
		System.out.println(Ktm.isPunctured);
		System.out.println(Ktm.bikeName);
		System.out.println(Ktm.runningKM);
		
	}

}
