package myProject;

public class StdLink {
	public String IDstd ,nameStd,subject;
	public StdLink next,prev;
	
	public StdLink (String IDstd,String nameStd,String subject) {
		this.IDstd = IDstd ;
		this.nameStd = nameStd;
		this.subject = subject;
	}
	
	public void displayLink() {
		System.out.println("ID : "+this.IDstd+"\n NAME : "
							+this.nameStd+"\n SUBJECT : "+this.subject  );
	}
}


                       