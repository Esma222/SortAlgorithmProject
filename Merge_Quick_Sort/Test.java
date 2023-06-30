import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Not: milisaniye cinsinden 0 ��kanlar nanosaniyeye �evirildi daha sonra b�y�t�lm�� size da y�ksek de�erler i�erdiklerinden yeniden milisaniye olarak yaz�ld�
		//t�m arraylerin size � buradan kontrol edilir.
		 int size=100;
		 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		 //EQUAL INTEGERS ARRAY
		 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		 //burada size 1000, 10000,  100000 yap�larak mergesort 2 part iken equal integers array run time � bulunabilir 
		 int[] arrayToSort= equalArray(size);
		 long startTime = System. currentTimeMillis();
		 MergeSortClass.mergeSort(arrayToSort,"TwoParts");
		 long estimatedTime = System. currentTimeMillis() - startTime;
		 System.out.println("Estimated Time For equalArray when size "+ arrayToSort.length+" and sort type is mergeSort two parts : "+ estimatedTime);
		 //printArray(arrayToSort,arrayToSort.length);
		
		//yukar�dan size 1000, 10000,  100000 yap�larak mergesort 3 part iken equal integers array run time � bulunabilir  
		 startTime = System. currentTimeMillis();
		 MergeSortClass.mergeSort(arrayToSort,"ThreeParts");
		 estimatedTime = System. currentTimeMillis() - startTime;
		 System.out.println("Estimated Time For equalArray when size "+ arrayToSort.length+" and sort type is mergeSort three parts : "+ estimatedTime);
		 //printArray(arrayToSort,arrayToSort.length);
		 
		//yukar�dan size 1000, 10000,  100000 yap�larak quicksort first element pivot  iken equal integers array run time � bulunabilir 
		 startTime = System. currentTimeMillis();
		 QuickSortClass.quickSort(arrayToSort,"f");
		 estimatedTime = System. currentTimeMillis() - startTime;
		 System.out.println("Estimated Time For equalArray when size "+ arrayToSort.length+" and sort type is quickSort first element pivot : "+ estimatedTime);
		 //printArray(arrayToSort,arrayToSort.length);
		 
		//yukar�dan size 1000, 10000,  100000 yap�larak quicksort random element pivot  iken equal integers array run time � bulunabilir 
		 startTime = System. currentTimeMillis();
		 QuickSortClass.quickSort(arrayToSort,"r");
		 estimatedTime = System. currentTimeMillis() - startTime;
		 System.out.println("Estimated Time For equalArray when size "+ arrayToSort.length+" and sort type is quickSort random element pivot : "+ estimatedTime);
		 //printArray(arrayToSort,arrayToSort.length);
		 
		//yukar�dan size 1000, 10000,  100000 yap�larak quicksort MidOfFirstMidLastElement  pivot  iken equal integers array run time � bulunabilir 
		 startTime = System. currentTimeMillis();
		 QuickSortClass.quickSort(arrayToSort,"m");
		 estimatedTime = System. currentTimeMillis() - startTime;
		 System.out.println("Estimated Time For equalArray when size "+ arrayToSort.length+" and sort type is quickSort MidOfFirstMidLastElement pivot: "+ estimatedTime);
		 //printArray(arrayToSort,arrayToSort.length);
		 
		 System.out.println();
		 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		 //RANDOM INTEGERS ARRAY
		 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		 
		 //yukar�dan size 1000, 10000,  100000 yap�larak mergesort 2 part iken random integers array run time � bulunabilir 
		 int[] arrayToSort2= randomArray(size);
		 startTime = System. currentTimeMillis();
		 MergeSortClass.mergeSort(arrayToSort2,"TwoParts");
		 estimatedTime = System. currentTimeMillis() - startTime;
		 System.out.println("Estimated Time For randomArray when size "+ arrayToSort2.length+" and sort type is mergeSort two parts : "+ estimatedTime);
		 //printArray(arrayToSort2,arrayToSort.length);
		
		//yukar�dan size 1000, 10000,  100000 yap�larak mergesort 3 part iken random integers array run time � bulunabilir  
		 startTime = System. currentTimeMillis();
		 MergeSortClass.mergeSort(arrayToSort2,"ThreeParts");
		 estimatedTime = System. currentTimeMillis() - startTime;
		 System.out.println("Estimated Time For randomArray when size "+ arrayToSort2.length+" and sort type is mergeSort three parts : "+ estimatedTime);
		 //printArray(arrayToSort2,arrayToSort.length);
		 
		//yukar�dan size 1000, 10000,  100000 yap�larak quicksort first element pivot  iken random integers array run time � bulunabilir 
		 startTime = System. currentTimeMillis();
		 QuickSortClass.quickSort(arrayToSort2,"f");
		 estimatedTime = System. currentTimeMillis() - startTime;
		 System.out.println("Estimated Time For randomArray when size "+ arrayToSort2.length+" and sort type is quickSort first element pivot : "+ estimatedTime);
		 //printArray(arrayToSort2,arrayToSort.length);
		 
		//yukar�dan size 1000, 10000,  100000 yap�larak quicksort random element pivot  iken random integers array run time � bulunabilir 
		 startTime = System. currentTimeMillis();
		 QuickSortClass.quickSort(arrayToSort2,"r");
		 estimatedTime = System. currentTimeMillis() - startTime;
		 System.out.println("Estimated Time For randomArray when size "+ arrayToSort2.length+" and sort type is quickSort random element pivot : "+ estimatedTime);
		 printArray(arrayToSort2,arrayToSort.length);
		 
		//yukar�dan size 1000, 10000,  100000 yap�larak quicksort MidOfFirstMidLastElement  pivot  iken random integers array run time � bulunabilir 
		 startTime = System. currentTimeMillis();
		 QuickSortClass.quickSort(arrayToSort2,"m");
		 estimatedTime = System. currentTimeMillis() - startTime;
		 System.out.println("Estimated Time For randomArray when size "+ arrayToSort2.length+" and sort type is quickSort MidOfFirstMidLastElement pivot: "+ estimatedTime);
		 //printArray(arrayToSort2,arrayToSort.length);
		 
		 System.out.println();
		 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		 //INCREASING INTEGERS ARRAY
		 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		 
		 //burada size 1000, 10000,  100000 yap�larak mergesort 2 part iken increasing integers array run time � bulunabilir 
		 int[] arrayToSort3= increasingArray(size);
		 startTime = System. currentTimeMillis();
		 MergeSortClass.mergeSort(arrayToSort3,"TwoParts");
		 estimatedTime = System. currentTimeMillis() - startTime;
		 System.out.println("Estimated Time For increasingArray when size "+ arrayToSort3.length+" and sort type is mergeSort two parts : "+ estimatedTime);
		 //printArray(arrayToSort3,arrayToSort.length);
		
		// size 1000, 10000,  100000 yap�larak mergesort 3 part iken increasing integers array run time � bulunabilir  
		 startTime = System. currentTimeMillis();
		 MergeSortClass.mergeSort(arrayToSort3,"ThreeParts");
		 estimatedTime = System. currentTimeMillis() - startTime;
		 System.out.println("Estimated Time For increasingArray when size "+ arrayToSort3.length+" and sort type is mergeSort three parts : "+ estimatedTime);
		 //printArray(arrayToSort3,arrayToSort.length);
		 
		//size 1000, 10000,  100000 yap�larak quicksort first element pivot  iken increasing integers array run time � bulunabilir 
		 startTime = System. currentTimeMillis();
		 QuickSortClass.quickSort(arrayToSort3,"f");
		 estimatedTime = System. currentTimeMillis() - startTime;
		 System.out.println("Estimated Time For increasingArray when size "+ arrayToSort3.length+" and sort type is quickSort first element pivot : "+ estimatedTime);
		 //printArray(arrayToSort3,arrayToSort.length);
		 
		//size 1000, 10000,  100000 yap�larak quicksort random element pivot  iken increasing integers array run time � bulunabilir 
		 startTime = System. currentTimeMillis();
		 QuickSortClass.quickSort(arrayToSort3,"r");
		 estimatedTime = System. currentTimeMillis() - startTime;
		 System.out.println("Estimated Time For increasingArray when size "+ arrayToSort3.length+" and sort type is quickSort random element pivot : "+ estimatedTime);
		 //printArray(arrayToSort3,arrayToSort.length);
		 
		//size 1000, 10000,  100000 yap�larak quicksort MidOfFirstMidLastElement  pivot  iken increasing integers array run time � bulunabilir 
		 startTime =System. currentTimeMillis();
		 QuickSortClass.quickSort(arrayToSort3,"m");
		 estimatedTime = System. currentTimeMillis() - startTime;
		 System.out.println("Estimated Time For increasingArray when size "+ arrayToSort3.length+" and sort type is quickSort MidOfFirstMidLastElement pivot: "+ estimatedTime);
		 //printArray(arrayToSort3,arrayToSort.length);
		 
		 
		 System.out.println();
		 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		 //DECREASING INTEGERS ARRAY
		 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		 
		 //burada size 1000, 10000,  100000 yap�larak mergesort 2 part iken decreasing integers array run time � bulunabilir 
		 int[] arrayToSort4= decreasingArray(size);
		 startTime = System. currentTimeMillis();
		 MergeSortClass.mergeSort(arrayToSort4,"TwoParts");
		 estimatedTime = System. currentTimeMillis() - startTime;
		 System.out.println("Estimated Time For decreasingArray when size "+ arrayToSort4.length+" and sort type is mergeSort two parts : "+ estimatedTime);
		 //printArray(arrayToSort4,arrayToSort.length);
		
		// size 1000, 10000,  100000 yap�larak mergesort 3 part iken decreasing integers array run time � bulunabilir  
		 startTime = System. currentTimeMillis();
		 MergeSortClass.mergeSort(arrayToSort4,"ThreeParts");
		 estimatedTime = System. currentTimeMillis() - startTime;
		 System.out.println("Estimated Time For decreasingArray when size "+ arrayToSort4.length+" and sort type is mergeSort three parts : "+ estimatedTime);
		 //printArray(arrayToSort4,arrayToSort.length);
		 
		//size 1000, 10000,  100000 yap�larak quicksort first element pivot  iken decreasing integers array run time � bulunabilir 
		 startTime = System. currentTimeMillis();
		 QuickSortClass.quickSort(arrayToSort4,"f");
		 estimatedTime = System. currentTimeMillis() - startTime;
		 System.out.println("Estimated Time For decreasingArray when size "+ arrayToSort4.length+" and sort type is quickSort first element pivot : "+ estimatedTime);
		 //printArray(arrayToSort4,arrayToSort.length);
		 
		//size 1000, 10000,  100000 yap�larak quicksort random element pivot  iken decreasing integers array run time � bulunabilir 
		 startTime = System. currentTimeMillis();
		 QuickSortClass.quickSort(arrayToSort4,"r");
		 estimatedTime = System. currentTimeMillis() - startTime;
		 System.out.println("Estimated Time For decreasingArray when size "+ arrayToSort4.length+" and sort type is quickSort random element pivot : "+ estimatedTime);
		 //printArray(arrayToSort4,arrayToSort.length);
		 
		//size 1000, 10000,  100000 yap�larak quicksort MidOfFirstMidLastElement  pivot  iken decreasing integers array run time � bulunabilir 
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
		//arrayin b�y�kl���
		int n= size;
		int[] arr= new int[size];
		 for(int i = 0 ; i < arr.length ; i++)
		 {  
		   //arrayin her indeksine size b�y�kl���nden ba�lanarak  0 a kadarki de�erler birer azalarak atand�
			 arr[i] = n;
		      n--;
		 }
		 return arr;
		
	}
	
	public static int[] increasingArray(int size) {
		//arrayin b�y�kl��� atand�
		int[] arr= new int[size];
		 for(int i = 0 ; i < arr.length ; i++)
		 {  
		   //arrayin her indeksine 0 dan  ba�lanarak  size b�y�kl���ne kadarki de�erler birer art�r�larak atand�
			 arr[i] = i;
		    
		 }
		 return arr;
		
	}
	public  static int[] equalArray(int size) {
		//arrayin b�y�kl��� atand�
		int[] arr= new int[size];
		 for(int i = 0 ; i < arr.length ; i++)
		 {  
		   //arrayin her indeksine 1 atand�, b�ylelikle t�m indekslerdeki de�erler e�it atand�
			 arr[i] = 1;
		    
		 }
		 return arr;
		
	}
	public  static int[] randomArray(int size) {
		
		Random r=new Random(); //random s�n�f�
		//arrayin b�y�kl��� atand�
		int[] arr= new int[size];
		 for(int i = 0 ; i < arr.length ; i++)
		 {  // size b�y�kl��� i�inde 0 dan ba�lay�p size -1 e kadarki de�erler i�inden rastgele biri atand�
			 int rnd =r.nextInt(size); 
		   //arrayin her indeksine rastgele atanan rnd de�eri atand�, 
			 arr[i] = rnd;
		    
		 }
		 return arr;
		
	}

}
