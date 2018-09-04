package th.ac.utcc.eng.cpe.nc252.sorting;



 class Subject {
    
	private String Code , Title ;
    private double Unit ;
    private String Grade ;
    
    Subject (String Code,String Title,double Unit,String Grade ){
    	this.Code = Code;
    	this.Title = Title ;
    	this.Unit = Unit;
    	this.Grade = Grade;
    }
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public double getUnit() {
		return Unit;
	}
	public void setUnit(double unit) {
		Unit = unit;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}

}


public class BubbleSort  {
	private Subject [] element;
	private int eSize;
	
	public BubbleSort(int size) {
		if(size > 0)
			this.element = new Subject[size];
		else
			// default element.length == 10
			this.element = new Subject[10];
		
		eSize = 0;
	}
	
	public void insert(Subject e) {
		this.element[eSize] = e;
		eSize++;
	}
	
	public void show() {
		for(int i=0; i < eSize; i++) {
			System.out.print(this.element[i].getCode() + " "
					        +this.element[i].getTitle()+ " "
					        +this.element[i].getUnit()+ " "
					        +this.element[i].getGrade()+ " \n");
		}
		
		System.out.println("");
	}
	
	public void sort() {
		int out, in;
		
		for(out = eSize - 1; out > 0; out--) {
			for(in = 0; in < out; in++) {
				if(this.element[in].getUnit() > this.element[in + 1].getUnit()) {
					this.swap(in, in+1);
				}
			}
		}
	}
	
	private void swap(int left, int right) {
		Subject temp = this.element[left];
		this.element[left] = this.element[right];
		this.element[right] = temp;
	}
	
	public static void main(String[] args) {
		// 
		int max = 20;
		BubbleSort bubble = new BubbleSort(max);
		Subject s1 = new Subject("NG111","JAVA1",3.0,"A");
		Subject s2 = new Subject("NG222","JAVA2",1.0,"B");
		Subject s3 = new Subject("NG333","JAVA3",1.5,"D+");
		Subject s4 = new Subject("NG444","JAVA4",2.0,"C");
		bubble.insert(s1);
		bubble.insert(s2);
		bubble.insert(s3);
		bubble.insert(s4);

		// show original order
		System.out.print("Original Order: ");
		bubble.show();
		
		// sort and then show the result
		bubble.sort();
				
		System.out.print("Sorted Order: ");
		bubble.show();
	}
}
