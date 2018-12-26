package myBinary;

public class TreeStudent {
	private NodeStD root;
	 
	TreeStudent(){
		this.setRoot(null);
	}
	
	public void insert(int idStd, String name, String subject,String grade)
	{
	NodeStD newNode = new NodeStD();
	newNode.iDStd = idStd;
	newNode.name = name;
	newNode.subject = subject;
	newNode.grade = grade;
		if(getRoot() == null)
		setRoot(newNode);
		else
		{
			NodeStD current = getRoot();
			NodeStD parent;
			while(true)
			{
				parent = current;
				if(idStd<current.iDStd)
				{
					current = current.leftChild;
					if(current == null)
					{
						parent.leftChild = newNode;
						return;
					}
				}
				else
				{
					current = current.rightChild;
					if(current == null)
					{
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}
	
	
	public NodeStD find(int key)
	{
	NodeStD current = getRoot();
	  while(current.iDStd != key)
	  {
	   if(key< current.iDStd)
	             current = current.leftChild;
	    else
	         current = current.rightChild;
	   if(current == null)
		return null;
	}
	return current;
	}

   
	public boolean delete(int key)
	{
		NodeStD current = getRoot();
		NodeStD parent = getRoot();
		boolean isLeftChild = true;

		while(current.iDStd != key)
		{
			parent = current;
			if(key< current.iDStd)
			{
				isLeftChild = true;
				current = current.leftChild;
			}
			else
			{
				isLeftChild = false;
				current = current.rightChild;
			}
			if(current == null)
				return false;
		}
		
		if(current.leftChild==null && current.rightChild == null)
		{
			if(current == getRoot())
				setRoot(null) ;
			else if (isLeftChild)
				parent.leftChild = null;
			else 
				parent.rightChild = null;
		}
		else if (current.rightChild==null) {
			if(current==getRoot())
				setRoot(current.leftChild);
			else if (isLeftChild)
				parent.leftChild = current.leftChild;
			else
				parent.rightChild = current.leftChild;
		}
		else if (current.leftChild==null) {
				if(current==getRoot())
					setRoot(current.rightChild);
				else if(isLeftChild)
					parent.leftChild = current.rightChild;
				else
					parent.rightChild = current.rightChild;
			}
		else
		{
			NodeStD successor = getSuccessor(current);
			if(current == getRoot()) 
				setRoot(successor);
			else if(isLeftChild)
			parent.leftChild = successor;
			else {
				parent.rightChild = successor;
			    successor.leftChild = current.leftChild;
			}	
		}
		return true;
		




	}

	private NodeStD getSuccessor(NodeStD delNode)
	{
		NodeStD successorParent = delNode;
		NodeStD successor = delNode;
		NodeStD current = delNode.rightChild;
		while(current != null)
		{
			successorParent = successor;
			successor = current;
			current = current.leftChild;
		}

		if(successor!= delNode.rightChild){
			successorParent.leftChild = successor.rightChild;
			successor.rightChild = delNode.rightChild;
		}
		
		return successor;
		
	}
	
	public void DisplayinOrder(NodeStD  localRoot)
	{
		if(localRoot != null)
		{
			DisplayinOrder(localRoot.leftChild);
	        localRoot.displayNode();
			DisplayinOrder(localRoot.rightChild);
		}
	}
	
	public boolean UpdateName(int key,String name) {

		NodeStD current = getRoot();

		while(current.iDStd != key)
		{
			if(key< current.iDStd)
			{
				current = current.leftChild;
			}
			else
			{
				current = current.rightChild;
			}
			if(current == null)
				return false;
		}
		
		current.name = name;
		return true;
		
		
	}
	
	public boolean UpdateSubject(int key,String subject) {

		NodeStD current = getRoot();

		while(current.iDStd != key)
		{
			if(key< current.iDStd)
			{
				current = current.leftChild;
			}
			else
			{
				current = current.rightChild;
			}
			if(current == null)
				return false;
		}
		
		current.subject = subject;
		return true;
		
		
	}
	
	public boolean UpdateGrade(int key,String grade) {

		NodeStD current = getRoot();

		while(current.iDStd != key)
		{
			if(key< current.iDStd)
			{
				current = current.leftChild;
			}
			else
			{
				current = current.rightChild;
			}
			if(current == null)
				return false;
		}
		
		current.grade = grade;
		return true;
		
		
	}
	
	public boolean UpdateId(int key,int id) {

		NodeStD current = getRoot();

		while(current.iDStd != key)
		{
			if(key< current.iDStd)
			{
				current = current.leftChild;
			}
			else
			{
				current = current.rightChild;
			}
			if(current == null)
				return false;
		}
		
		current.iDStd = id;
		return true;
		
		
	}

	public NodeStD getRoot() {
		return root;
	}

	public void setRoot(NodeStD root) {
		this.root = root;
	}
	
   
	
	
		
	

	

}
