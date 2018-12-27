package th.ac.utcc.eng.cpe.nc252;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import th.ac.utcc.eng.cpe.nc252.sorting.BubbleSort;

public class SelectionSort {
	private int [] element;
	private int eSize;
	
	public SelectionSort(int size) {
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
		int out, in, min;
		
		for(out = 0; out < eSize-1; out++) {
			min = out;
			for(in = out+1; in < eSize; in++) {
				if(this.element[in] < this.element[min]) {
					min = in;
				}
			}
			this.swap(out, min);
		}
	}
	
	private void swap(int left, int right) {
		int temp = this.element[left];
		this.element[left] = this.element[right];
		this.element[right] = temp;
	}
	
	public static void main(String[] args) {
		int max = 40000;
		long t1,t2;
		SelectionSort bb = new SelectionSort (max);
		for(int i = 0 ; i<max ; i++){
			bb.insert((int)(Math.random()*max));
		}
		Calendar cal1 = Calendar.getInstance();
		System.out.println(cal1.getTime().getTime());
		t1 = cal1.getTime().getTime();
		bb.sort();
		Calendar cal2 = Calendar.getInstance();
		System.out.println(cal2.getTime().getTime());
		t2 = cal2.getTime().getTime();
		
		System.out.print(" Data amount : "+max+" Get time "+(t2-t1));
		
		
	}
}