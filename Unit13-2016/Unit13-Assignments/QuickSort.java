	//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import static java.lang.System.*;
import java.util.Arrays;		//use Arrays.toString() to help print out the array

public class QuickSort
{
	private static int passCount;

	public static void quickSort(Comparable[] list)
	{
		quickSort(list, 0, list.length-1);
	}


	private static void quickSort(Comparable[] list, int low, int high)
	{
		if(low<high){
			int i = partition(list,low,high);
			quickSort(list,low,i);
			System.out.println(Arrays.toString(list));
			quickSort(list,i+1,high);
		}
	}


	private static int partition(Comparable[] list, int low, int high)
	{
		Comparable pivot = list[low];
		int j = low-1;
		int k = high+1;
		while(j<k){
			while(list[--k].compareTo(pivot)>0);
			while(list[++j].compareTo(pivot)<0);
			if(j>=k)
				return k;
			Comparable temp = list[j];
			list[j] = list[k];
			list[k] = temp;
		}
		return k;
	}
}