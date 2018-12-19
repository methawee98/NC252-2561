package myAppDictionary;

public class wordaData {
	public String word,meaning,type;
    public wordaData next;
	
	public  wordaData (String word,String meaning ,String type ) {
		this.word = word ;
		this.meaning = meaning ;
		this.type = type;
	}
	
	public void displayLink() {
		System.out.println(this.word+"( "+this.type+") : "+this.meaning);
	}

}
