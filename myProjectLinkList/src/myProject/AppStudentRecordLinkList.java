package myProject;

public class AppStudentRecordLinkList{
	public static void main (String args[]) {
		LinkList StdRecord = new LinkList();
		
		StdRecord.insertFirst("A001","Somsri jaidee", "NC123","A");
		StdRecord.insertFirst("A002","Somsuk rukrian", "NC120","C");
		StdRecord.insertFirst("A004","Sompong wongree", "NC103","D");
		
		StdRecord.displayList();
		
		StdRecord.insertAfter("A004", "A003", "sudsuey aodaom","NC360","D");
		StdRecord.displayList();
		
		StdRecord.insertLast("A000","meetung banruey","NC310","B+");
		StdRecord.displayList();
		
		StdLink a = StdRecord.find("A001");
		if(a != null) { System.out.println("Found Link Data is :" );
		a.displayLink();}
		else System.out.println("Link not Found");
		
		 StdRecord.delete("A000");
		StdRecord.displayList();
		
		
		
		
		
		
		
		
	}
	
}