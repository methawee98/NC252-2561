package myProject;

public class LinkList {
	private StdLink first,last;
	
	public LinkList()
	{
		this.first = null;
		this.last = null;
	}
	
	public void insertFirst(String ID,String name,String subject) {
		StdLink newLink = new StdLink(ID,name,subject);
		newLink.next = this.first;
	     if(newLink.next == null) last = newLink;
	     else first.prev = newLink ;
		
		first = newLink;
		
	}
	public void insertAfter(String key,String ID,String name,String subject) {
		StdLink current  = this.first;
		while(!current.IDstd.equals(key)) {
			if(current.next == null ) System.out.println("NO FOUND DATA TO INSERTAFTER");
			else current = current.next;
		}
		StdLink newLink = new StdLink(ID,name,subject);
		newLink.next = current.next;
		current.next.prev = newLink;
		newLink.prev = current;
		current.next = newLink;
		System.out.println("Just Insert Studentdata ID :"+newLink.IDstd+"After ID :"+current.IDstd);
	}
	
	public void insertLast(String ID,String name,String subject) {
		StdLink newLink = new StdLink(ID,name,subject);
      newLink.next = last.next;
      newLink.prev = last;
      last.next = newLink;
      this.last = newLink;    
      System.out.println("Just InsertLast Studentdata ID :"+newLink.IDstd);
	}
	
	
	
	public StdLink find(String key) {
		
		StdLink current  = this.first;
		while(!current.IDstd.equals(key)) {
			if(current.next == null ) return null;
			else current = current.next;
		}
		return current;
	}
	
	public StdLink delete(String key) {
		
		StdLink current  = this.first;
		while(!current.IDstd.equals(key)) {
			if(current.next == null ) return null;
			else {
				current = current.next;
			}
		}
		if(current == this.first) {
			this.first = first.next;
			//this.last = last.prev;
		}
		else  {
			System.out.println("Just Delete Studentdata ID :"+current.IDstd);
			current.prev.next = current.next;
		    if(current.next != null)current.next.prev = current.prev;
			current = current.next;
			}
		return current;
		
	}
	
	public void displayList() {
		System.out.println("List (first-->last):");
		StdLink current = first;
		while(current != null) {
			current.displayLink();
			current = current.next;
		}
	}

	
		
	}
	


