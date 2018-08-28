package th.ac.utcc.eng.cpe.nc252;

public class StudentRecordApp {

	public static void main(String[] args) {
		SubjectRecord a = new SubjectRecord();
		a.setCode("NC252");
		a.setName("Data Structure");
		a.setUnit(3);
		a.setGrade("A");
		
		SubjectRecord b = new SubjectRecord();
		b.setCode("NC253");
		b.setName("Electric Circuit");
		b.setUnit(3);
		b.setGrade("B+");
		
		SubjectRecord c = new SubjectRecord();
		c.setCode("NC255");
		c.setName("Digital");
		c.setUnit(3);
		c.setGrade("B");
		
		SubjectRecordArray arr = new SubjectRecordArray(10);
		arr.insert(a);
		arr.insert(b);
		arr.insert(c);
		
		arr.display();
		
		arr.delete("NC253");
		System.out.println("\nAfter deletion of NC253");
		arr.display();
	}

}
