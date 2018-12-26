package myBinary;

public class NodeStD {
	int iDStd;
	String name,subject,grade;
	NodeStD leftChild;
	NodeStD rightChild;
	
	public void displayNode()
	{
     System.out.println("ID Student :"+this.iDStd+"\n Name : "+this.name
    		 +"\n Subject : "+this.subject+"\n Grade : "+this.grade);
	}


}
