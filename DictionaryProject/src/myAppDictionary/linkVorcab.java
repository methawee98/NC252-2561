package myAppDictionary;


public class linkVorcab {
		public static int arraySize;
		public wordaData hasgTable[];
	     
		linkVorcab(){	
		}
		linkVorcab(int arraySize){
		   this.arraySize= arraySize;
		   hasgTable=new wordaData[arraySize];
	   }
	   
	   public void insert(String word,String meaning,String type) {
		        
		        
		        wordaData newLink = new wordaData(word,meaning,type);
			    newLink.next = hasgTable[hashFunc(word)];
			    hasgTable[hashFunc(word)] = newLink;
			    
			
		}
	   
	   
	   public void update(String key,String bfore,String change) {
		   wordaData current  = hasgTable[hashFunc(key)];
			while(!current.word.equals(key)) {
				if(current.next == null ) break ;
				else current = current.next;
			}
			if(current.type==bfore)current.type=change;
			else if(current.word==bfore)current.word=change;
			else if (current.meaning==bfore)current.meaning=change;
	   }
	  
	   
	   
	   public String find(String key) {
		   wordaData current  = hasgTable[hashFunc(key)];
			while(!current.word.equals(key)) {
				if(current.next == null ) return "NOT FOUND";
				else current = current.next;
			}
			
				return ""+current.word+""+" ("+current.type+")"+" : "+current.meaning+"";
				
			
		}
	   
	   public String getWord(String key) {
		   wordaData current  = hasgTable[hashFunc(key)];
			while(!current.word.equals(key)) {
				 current = current.next;
			}
			return current.word;
		   
	   }
	   
	   public String getType(String key) {
		   wordaData current  = hasgTable[hashFunc(key)];
			while(!current.word.equals(key)) {
				 current = current.next;
			}
			return current.type;
		   
	   }
	   
	   public String getMean(String key) {
		   wordaData current  = hasgTable[hashFunc(key)];
			while(!current.word.equals(key)) {
				 current = current.next;
			}
			return current.meaning;
		   
	   }
	   
	   public void delete(String key) {
			
		   wordaData current  = hasgTable[hashFunc(key)];
		   wordaData previous = hasgTable[hashFunc(key)];
			while(!current.word.equals(key)) {
				if(current.next == null ) {
				}
				else {
					previous = current;
					current = current.next;
				}
			}
			   
			   previous.next = current.next;
			   current = null;
			   }
			
		
	   
	   public void displayList(String key) {
			System.out.println("List (first-->last):");
			wordaData current = hasgTable[hashFunc(key)];
			while(current != null) {
				current.displayLink();
				current = current.next;
			}
		}
	   
	   public static int hashFunc(String key) {
			
			int hVal =key.charAt(0)-96;
			for(int i = 1 ;i<key.length();i++) {
				int letterVal =key.charAt(i)-96;
				hVal =  (hVal*27+letterVal);
			}
			
			return (Math.abs(hVal))%(146529)%3;
		}
	  
			
		
	   
	

}
