import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Not: milisaniye cinsinden 0 çýkanlar nanosaniyeye çevirildi daha sonra büyütülmüþ size da yüksek deðerler içerdiklerinden yeniden milisaniye olarak yazýldý
		//tüm arraylerin size ý buradan kontrol edilir.
		 int size=100;
		 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		 //EQUAL INTEGERS ARRAY
		 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		 //burada size 1000, 10000,  100000 yapýlarak mergesort 2 part iken equal integers array run time ý bulunabilir 
		 int[] arrayToSort= equalArray(size);
		 long startTime = System. currentTimeMillis();
		 MergeSortClass.mergeSort(arrayToSort,"TwoParts");
		 long estimatedTime = System. currentTimeMillis() - startTime;
		 System.out.println("Estimated Time For equalArray when size "+ arrayToSort.length+" and sort type is mergeSort two parts : "+ estimatedTime);
		 //printArray(arrayToSort,arrayToSort.length);
		
		//yukarýdan size 1000, 10000,  100000 yapýlarak mergesort 3 part iken equal integers array run time ý bulunabilir  
		 startTime = System. currentTimeMillis();
		 MergeSortClass.mergeSort(arrayToSort,"ThreeParts");
		 estimatedTime = System. currentTimeMillis() - startTime;
		 System.out.println("Estimated Time For equalArray when size "+ arrayToSort.length+" and sort type is mergeSort three parts : "+ estimatedTime);
		 //printArray(arrayToSort,arrayToSort.length);
		 
		//yukarýdan size 1000, 10000,  100000 yapýlarak quicksort first element pivot  iken equal integers array run time ý bulunabilir 
		 startTime = System. currentTimeMillis();
		 QuickSortClass.quickSort(arrayToSort,"f");
		 estimatedTime = System. currentTimeMillis() - startTime;
		 System.out.println("Estimated Time For equalArray when size "+ arrayToSort.length+" and sort type is quickSort first element pivot : "+ estimatedTime);
		 //printArray(arrayToSort,arrayToSort.length);
		 
		//yukarýdan size 1000, 10000,  100000 yapýlarak quicksort random element pivot  iken equal integers array run time ý bulunabilir 
		 startTime = System. currentTimeMillis();
		 QuickSortClass.quickSort(arrayToSort,"r");
		 estimatedTime = System. currentTimeMillis() - startTime;
		 System.out.println("Estimated Time For equalArray when size "+ arrayToSort.length+" and sort type is quickSort random element pivot : "+ estimatedTime);
		 //printArray(arrayToSort,arrayToSort.length);
		 
		//yukarýdan size 1000, 10000,  100000 yapýlarak quicksort MidOfFirstMidLastElement  pivot  iken equal integers array run time ý bulunabilir 
		 startTime = System. currentTimeMillis();
		 QuickSortClass.quickSort(arrayToSort,"m");
		 estimatedTime = System. currentTimeMillis() - startTime;
		 System.out.println("Estimated Time For equalArray when size "+ arrayToSort.length+" and sort type is quickSort MidOfFirstMidLastElement pivot: "+ estimatedTime);
		 //printArray(arrayToSort,arrayToSort.length);
		 
		 System.out.println();
		 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		 //RANDOM INTEGERS ARRAY
		 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		 
		 //yukarýdan size 1000, 10000,  100000 yapýlarak mergesort 2 part iken random integers array run time ý bulunabilir 
		 int[] arrayToSort2= randomArray(size);
		 startTime = System. currentTimeMillis();
		 MergeSortClass.mergeSort(arrayToSort2,"TwoParts");
		 estimatedTime = System. currentTimeMillis() - startTime;
		 System.out.println("Estimated Time For randomArray when size "+ arrayToSort2.length+" and sort type is mergeSort two parts : "+ estimatedTime);
		 //printArray(arrayToSort2,arrayToSort.length);
		
		//yukarýdan size 1000, 10000,  100000 yapýlarak mergesort 3 part iken random integers array run time ý bulunabilir  
		 startTime = System. currentTimeMillis();
		 MergeSortClass.mergeSort(arrayToSort2,"ThreeParts");
		 estimatedTime = System. currentTimeMillis() - startTime;
		 System.out.println("Estimated Time For randomArray when size "+ arrayToSort2.length+" and sort type is mergeSort three parts : "+ estimatedTime);
		 //printArray(arrayToSort2,arrayToSort.length);
		 
		//yukarýdan size 1000, 10000,  100000 yapýlarak quicksort first element pivot  iken random integers array run time ý bulunabilir 
		 startTime = System. currentTimeMillis();
		 QuickSortClass.quickSort(arrayToSort2,"f");
		 estimatedTime = System. currentTimeMillis() - startTime;
		 System.out.println("Estimated Time For randomArray when size "+ arrayToSort2.length+" and sort type is quickSort first element pivot : "+ estimatedTime);
		 //printArray(arrayToSort2,arrayToSort.length);
		 
		//yukarýdan size 1000, 10000,  100000 yapýlarak quicksort random element pivot  iken random integers array run time ý bulunabilir 
		 startTime = System. currentTimeMillis();
		 QuickSortClass.quickSort(arrayToSort2,"r");
		 estimatedTime = System. currentTimeMillis() - startTime;
		 System.out.println("Estimated Time For randomArray when size "+ arrayToSort2.length+" and sort type is quickSort random element pivot : "+ estimatedTime);
		 printArray(arrayToSort2,arrayToSort.length);
		 
		//yukarýdan size 1000, 10000,  100000 yapýlarak quicksort MidOfFirstMidLastElement  pivot  iken random integers array run time ý bulunabilir 
		 startTime = System. currentTimeMillis();
		 QuickSortClass.quickSort(arrayToSort2,"m");
		 estimatedTime = System. currentTimeMillis() - startTime;
		 System.out.println("Estimated Time For randomArray when size "+ arrayToSort2.length+" and sort type is quickSort MidOfFirstMidLastElement pivot: "+ estimatedTime);
		 //printArray(arrayToSort2,arrayToSort.length);
		 
		 System.out.println();
		 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		 //INCREASING INTEGERS ARRAY
		 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		 
		 //burada size 1000, 10000,  100000 yapýlarak mergesort 2 part iken increasing integers array run time ý bulunabilir 
		 int[] arrayToSort3= increasingArray(size);
		 startTime = System. currentTimeMillis();
		 MergeSortClass.mergeSort(arrayToSort3,"TwoParts");
		 estimatedTime = System. currentTimeMillis() - startTime;
		 System.out.println("Estimated Time For increasingArray when size "+ arrayToSort3.length+" and sort type is mergeSort two parts : "+ estimatedTime);
		 //printArray(arrayToSort3,arrayToSort.length);
		
		// size 1000, 10000,  100000 yapýlarak mergesort 3 part iken increasing integers array run time ý bulunabilir  
		 startTime = System. currentTimeMillis();
		 MergeSortClass.mergeSort(arrayToSort3,"ThreeParts");
		 estimatedTime = System. currentTimeMillis() - startTime;
		 System.out.println("Estimated Time For increasingArray when size "+ arrayToSort3.length+" and sort type is mergeSort three parts : "+ estimatedTime);
		 //printArray(arrayToSort3,arrayToSort.length);
		 
		//size 1000, 10000,  100000 yapýlarak quicksort first element pivot  iken increasing integers array run time ý bulunabilir 
		 startTime = System. currentTimeMillis();
		 QuickSortClass.quickSort(arrayToSort3,"f");
		 estimatedTime = System. currentTimeMillis() - startTime;
		 System.out.println("Estimated Time For increasingArray when size "+ arrayToSort3.length+" and sort type is quickSort first element pivot : "+ estimatedTime);
		 //printArray(arrayToSort3,arrayToSort.length);
		 
		//size 1000, 10000,  100000 yapýlarak quicksort random element pivot  iken increasing integers array run time ý bulunabilir 
		 startTime = System. currentTimeMillis();
		 QuickSortClass.quickSort(arrayToSort3,"r");
		 estimatedTime = System. currentTimeMillis() - startTime;
		 System.out.println("Estimated Time For increasingArray when size "+ arrayToSort3.length+" and sort type is quickSort random element pivot : "+ estimatedTime);
		 //printArray(arrayToSort3,arrayToSort.length);
		 
		//size 1000, 10000,  100000 yapýlarak quicksort MidOfFirstMidLastElement  pivot  iken increasing integers array run time ý bulunabilir 
		 startTime =System. currentTimeMillis();
		 QuickSortClass.quickSort(arrayToSort3,"m");
		 estimatedTime = System. currentTimeMillis() - startTime;
		 System.out.println("Estimated Time For increasingArray when size "+ arrayToSort3.length+" and sort type is quickSort MidOfFirstMidLastElement pivot: "+ estimatedTime);
		 //printArray(arrayToSort3,arrayToSort.length);
		 
		 
		 System.out.println();
		 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		 //DECREASING INTEGERS ARRAY
		 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		 
		 //burada size 1000, 10000,  100000 yapýlarak mergesort 2 part iken decreasing integers array run time ý bulunabilir 
		 int[] arrayToSort4= decreasingArray(size);
		 startTime = System. currentTimeMillis();
		 MergeSortClass.mergeSort(arrayToSort4,"TwoParts");
		 estimatedTime = System. currentTimeMillis() - startTime;
		 System.out.println("Estimated Time For decreasingArray when size "+ arrayToSort4.length+" and sort type is mergeSort two parts : "+ estimatedTime);
		 //printArray(arrayToSort4,arrayToSort.length);
		
		// size 1000, 10000,  100000 yapýlarak mergesort 3 part iken decreasing integers array run time ý bulunabilir  
		 startTime = System. currentTimeMillis();
		 MergeSortClass.mergeSort(arrayToSort4,"ThreeParts");
		 estimatedTime = System. currentTimeMillis() - startTime;
		 System.out.println("Estimated Time For decreasingArray when size "+ arrayToSort4.length+" and sort type is mergeSort three parts : "+ estimatedTime);
		 //printArray(arrayToSort4,arrayToSort.length);
		 
		//size 1000, 10000,  100000 yapýlarak quicksort first element pivot  iken decreasing integers array run time ý bulunabilir 
		 startTime = System. currentTimeMillis();
		 QuickSortClass.quickSort(arrayToSort4,"f");
		 estimatedTime = System. currentTimeMillis() - startTime;
		 System.out.println("Estimated Time For decreasingArray when size "+ arrayToSort4.length+" and sort type is quickSort first element pivot : "+ estimatedTime);
		 //printArray(arrayToSort4,arrayToSort.length);
		 
		//size 1000, 10000,  100000 yapýlarak quicksort random element pivot  iken decreasing integers array run time ý bulunabilir 
		 startTime = System. currentTimeMillis();
		 QuickSortClass.quickSort(arrayToSort4,"r");
		 estimatedTime = System. currentTimeMillis() - startTime;
		 System.out.println("Estimated Time For decreasingArray when size "+ arrayToSort4.length+" and sort type is quickSort random element pivot : "+ estimatedTime);
		 //printArray(arrayToSort4,arrayToSort.length);
		 
		//size 1000, 10000,  100000 yapýlarak quicksort MidOfFirstMidLastElement  pivot  iken decreasing integers array run time ý bulunabilir 
		 startTime = System. currentTimeMillis();
		 QuickSortClass.quickSort(arrayToSort4,"m");
		 estimatedTime = System. currentTimeMillis() - startTime;
		 System.out.println("Estimated Time For decreasingArray when size "+ arrayToSort4.length+" and sort type is quickSort MidOfFirstMidLastElement pivot: "+ estimatedTime);
		 //printArray(arrayToSort4,arrayToSort.length);
		 
		 
		 
	}
	 static void printArray(int arr[], int size)
	    {
	        int i;
	        for (i = 0; i < size; i++)
	            System.out.println(arr[i] + " ");
	        System.out.println();
	    }
	
	public static int[] decreasingArray(int size) {
		//arrayin büyüklüðü
		int n= size;
		int[] arr= new int[size];
		 for(int i = 0 ; i < arr.length ; i++)
		 {  
		   //arrayin her indeksine size büyüklüðünden baþlanarak  0 a kadarki deðerler birer azalarak atandý
			 arr[i] = n;
		      n--;
		 }
		 return arr;
		
	}
	
	public static int[] increasingArray(int size) {
		//arrayin büyüklüðü atandý
		int[] arr= new int[size];
		 for(int i = 0 ; i < arr.length ; i++)
		 {  
		   //arrayin her indeksine 0 dan  baþlanarak  size büyüklüðüne kadarki deðerler birer artýrýlarak atandý
			 arr[i] = i;
		    
		 }
		 return arr;
		
	}
	public  static int[] equalArray(int size) {
		//arrayin büyüklüðü atandý
		int[] arr= new int[size];
		 for(int i = 0 ; i < arr.length ; i++)
		 {  
		   //arrayin her indeksine 1 atandý, böylelikle tüm indekslerdeki deðerler eþit atandý
			 arr[i] = 1;
		    
		 }
		 return arr;
		
	}
	public  static int[] randomArray(int size) {
		
		Random r=new Random(); //random sýnýfý
		//arrayin büyüklüðü atandý
		int[] arr= new int[size];
		 for(int i = 0 ; i < arr.length ; i++)
		 {  // size büyüklüðü içinde 0 dan baþlayýp size -1 e kadarki deðerler içinden rastgele biri atandý
			 int rnd =r.nextInt(size); 
		   //arrayin her indeksine rastgele atanan rnd deðeri atandý, 
			 arr[i] = rnd;
		    
		 }
		 return arr;
		
	}

}
