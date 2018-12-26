package myBinary;

public class AppTree {
	public static void main (String args[]) {
		
		TreeStudent sample = new TreeStudent();
		
		sample.insert(1023, "Methawee Ch", "NC363", "A");
		sample.insert(1452, "meow meow", "NC363", "D");
		sample.insert(0002, "KORA LEE", "NC313", "B+");
		sample.insert(0265, "NHUNG", "NC312", "B+");
		
		sample.DisplayinOrder(sample.getRoot());
		
		sample.UpdateGrade(1023, "B");
		System.out.println("**********Just Update**********");
		sample.DisplayinOrder(sample.getRoot());
		sample.delete(1023);
		System.out.println("**********Just Delete**********");
		sample.DisplayinOrder(sample.getRoot());
	}

}
