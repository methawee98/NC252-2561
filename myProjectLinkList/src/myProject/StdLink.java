package myProject;

public class StdLink {
	public String IDstd ,nameStd,subject,grade;
	public StdLink next,prev;
	
	public StdLink (String IDstd,String nameStd,String subject,String grade) {
		this.IDstd = IDstd ;
		this.nameStd = nameStd;
		this.subject = subject;
		this.grade = grade;
	}
	
	public void displayLink() {
		System.out.println("ID : "+this.IDstd+"\n NAME : "
							+this.nameStd+"\n SUBJECT : "+this.subject+"\n grade : "+this.grade    );
	}
}


                       