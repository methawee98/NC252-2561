package th.ac.utcc.eng.cpe.nc252.sorting;

import java.util.Calendar;

public class InsertionSort {
	private int [] element;
	private int eSize;
	
	public InsertionSort(int size) {
		if(size > 0)
			this.element = new int[size];
		else
			// default element.length == 10
			this.element = new int[10];
		
		eSize = 0;
	}
	
	public void insert(int e) {
		this.element[eSize] = e;
		eSize++;
	}
	
	public void show() {
		for(int i=0; i < eSize; i++) {
			System.out.print(this.element[i] + " ");
		}
		
		System.out.println("");
	}
	
	public void sort() {
		int out, in, temp;
		
		for(out = 1; out < eSize; out++) {
			temp = this.element[out];
			for(in = out; in > 0 && this.element[in-1] >= temp; in--) {
				this.element[in] = this.element[in - 1];
			}
			this.element[in] = temp;
		}
	}
	
/*	private void swap(int left, int right) {
		int temp = this.element[left];
		this.element[left] = this.element[right];
		this.element[right] = temp;
	}*/
	
	public static void main(String[] args) {
		// 
		int max = 40000;
		long t1,t2;
		InsertionSort ist = new InsertionSort(max);
		
		
		for(int i = 0 ; i<max ; i++){
			ist.insert((int)(Math.random()*max));
		
		}
		
		
		// sort and then show the result
		Calendar cal1 = Calendar.getInstance();
		System.out.println(cal1.getTime().getTime());
		t1 = cal1.getTime().getTime();
		ist.sort();
		Calendar cal2 = Calendar.getInstance();
		System.out.println(cal2.getTime().getTime());
		t2 = cal2.getTime().getTime();
		
		System.out.print(" Data amount : "+max+" Get time "+(t2-t1));
		
	}
}
