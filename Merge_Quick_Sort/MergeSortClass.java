
public class MergeSortClass {

	//merge sort i�in d��ar�dan bu method �a�ir�l�r.
		//sadece arrayi ve merge sortun tipini parametre olarak al�r.
		static void mergeSort(int arr[], String numberOfPartitions) 
	    {  // mergesort tipi TwoPart ise merge_sort2 methoduna gider
			if( numberOfPartitions.equals("TwoParts")) {
				merge_sort2(arr,0,arr.length-1);
			}
			// mergesort tipi ThreePart ise merge_sort3 methoduna gider
			else if(numberOfPartitions.equals("ThreeParts")) {
				merge_sort3(arr,0,arr.length-1);
			}
			// e�er tip yanl�� yaz�ld�ysa hata mesaj� d�ner
			else
				System.out.println("you can choose only \"TwoParts\" or \"ThreeParts\"");
	    }
		
		//2 part recursively merge sort i�in
		//bu method i�in array, ba�lang�� indeksi ve biti� indeksi parametrelerini kullan�yoruz.
		//amac�m�z var olan arraydeki de�erleri k���kten b�y��e s�ral� olacak �ekilde de�i�tirmek.
		static void merge_sort2(int arr[], int l, int r) 
	    { 
			//arrayin ba�lang�� indeksinin her zaman son indeksinden k���k olmas� gerekir
			//recursive i devam ettirme ko�ulumuz , aksi durumda sonland�r�yoruz.
	        if (l < r) 
	        { 
	            //arrayi ikiye b�lebilmek i�in ortadaki indeksi buluyoruz
	        	//ba�lang�� indeksi ile biti� indeksini toplay�p ikiye b�l�yoruz
	            int m = (l+r)/2; 
	  
	            //recursive yap�s� gereklili�inden  ve merge sort da en k���k yap�ya ula�abilmek i�in i�eride yeniden �a��r�yoruz.
	            //orta indeksi bulduktan sonra arrayi ikiye ay�rarak yeniden iki b�l�mde tekrarl�yoruz
	            //buldu�umuz orta de�erle yeni ba�lang�� ve biti� de�erleri at�yoruz
	            merge_sort2(arr, l, m); 
	            merge_sort2(arr , m+1, r); 
	  
	            //yukar�daki i�lemler tamamland���nda yani en k���k yap�lara ula��ld�ktan sonra �al��maya ba�lar
	            // merge methoduna yollayarak orta indeksin sa�� ve solunu  sort ederek birle�tirir.
	            merge2(arr, l, m, r);
	           
	           
	        } 
	        
	    }
		
		// Bu method merge_sort methodu i�inde �a��r�larak iki b�l�me ayr�lm�� arrayi sortlayarak birle�tirir.
		// bu method  array, ba�lang�� indeksi, orta indeks ve biti� indeksi parametrelerini kullan�r.
		static void merge2(int arr[], int l, int m, int r) 
	    {   
			// yeni arraylarin b�y�kl��� hesaplan�r
			// S�f�r�nc� indeks g�z �n�nde bulundurularak 1 eklenir
			//orta indeksten ba�lang�� indeksi ��kar�larak ilk arrayin size � 
			//son indeksten ortanca indeks ��kar�larak ikinci arrayin size � bulunur.
	        int n1 = m - l + 1; 
	        int n2 = r - m; 
	  
	        //left ve right array olacak �ekilde yukar�dan ald�klar� b�y�kl�klerde arrayler olu�turulur.
	        int L[] = new int [n1]; 
	        int R[] = new int [n2]; 
	  
	        //left arraye ba�lang��tan orta indekse kadar olan de�erler atan�r.
	        // right arraye ortanca indeksten ba�layarak son indekse kadar olan de�erler atan�r.
	        for (int i=0; i<n1; ++i) 
	            L[i] = arr[l + i]; 
	        for (int j=0; j<n2; ++j) 
	            R[j] = arr[m + 1+ j]; 
	  
	  
	        //bu de�erler left ve right arraylerin i�inde gezinmek i�in olu�turuldu, indeks olarak kullan�lacak, 0dan ba�l�yor.
	        int i = 0, j = 0; 
	        // ba�lang��ta ald���m�z "as�l" arrayimizin i�inde gezinece�imiz indeks i�in olu�turuldu, ba�lang�� indeksinden ba�l�yor.
	        int k = l; 
	        // left ve right array i�in indeksin array b�y�kl���n� a�mamas� i�in kontrol
	        //indeksler array b�y�kl�klerinden k���k olmaya devam edinceye kadar
	        while (i < n1 && j < n2) 
	        { 
	        	//e�er left array i�inde belirtilen indeksteki de�er right arrayde belirtilen indeksteki de�erden k���kse veya e�itse
	            // kar��la�t�rma sonucunda K���K olan de�eri "as�l" arraye at�yoruz.
	        	if (L[i] <= R[j]) 
	            { 
	            	//"as�l" arrayin bulundu�u indekse Left arrayin bulundu�u indeksteki de�eri at�yoruz.
	            	//left arrayin indeksini bir art�r�yoruz.
	                arr[k] = L[i]; 
	                i++; 
	            } 
	           //e�er left array i�inde belirtilen indeksteki de�er right arrayde belirtilen indeksteki de�erden b�y�kse
	            else
	            {   //"as�l" arrayin bulundu�u indekse Right arrayin bulundu�u indeksteki de�eri at�yoruz.
	            	//right arrayin indeksini bir art�r�yoruz.
	                arr[k] = R[j]; 
	                j++; 
	            } 
	            //her iki durumda da "as�l" arrayin mevcut indeksi ile i�imiz bitti�inden indeksi 1 art�r�yoruz. 
	            k++; 
	        } 
	        // left veya right array indekslerinden birinin  array b�y�kl���n� a�mas� durumunda
	        //left array indeksi hen�z array b�y�kl���n� ge�mediyse,indeks array b�y�kl���nden k���k olmaya devam edinceye kadar
	        while (i < n1) 
	        { 
	        	//"as�l" arrayin bulundu�u indekse Left arrayin bulundu�u indeksteki de�eri at�yoruz.
	        	//left arrayin ve "as�l" arrayin indeksini bir art�r�yoruz.
	            arr[k] = L[i]; 
	            i++; 
	            k++; 
	        } 
	       //right array indeksi hen�z array b�y�kl���n� ge�mediyse,indeks array b�y�kl���nden k���k olmaya devam edinceye kadar
	        while (j < n2) 
	        { 
	        	//"as�l" arrayin bulundu�u indekse right arrayin bulundu�u indeksteki de�eri at�yoruz.
	        	//right arrayin ve "as�l" arrayin indeksini bir art�r�yoruz.
	            arr[k] = R[j]; 
	            j++; 
	            k++; 
	        } 
	        
	        
	    }
		
		//3 part recursively merge sort i�in
		//bu method i�in array, ba�lang�� indeksi ve biti� indeksi parametrelerini kullan�yoruz.
		//amac�m�z var olan arraydeki de�erleri k���kten b�y��e s�ral� olacak �ekilde de�i�tirmek.
		static void merge_sort3(int arr[], int k, int r) 
	    { 
			//arrayin ba�lang�� indeksinin her zaman son indeksinden k���k olmas� gerekir
			//recursive i devam ettirme ko�ulumuz , aksi durumda sonland�r�yoruz.
	        if (k < r ) 
	        { 
	            //son indeksten ba�lang�� indeksini ��kar�p 3 e b�lerek her b�l�m�n b�y�kl���n�n ne kadar olaca��na karar veriyoruz.
	        	//buna aral�k b�y�kl��� diyebiliriz
	            int m3 = (r-k)/3; 
	            
	            // A�a��daki recursive �a��rmalar�nda indekslerin  daha az kafa kar��t�r�c� olmalar� i�in burada de�i�kene atad�m
	            //ba�lang�� indeksi ile aral�k b�y�kl���n� toplay�p ilk b�l�m�n son indeksi yap�yoruz
	            int m1=k+m3;
	            //ikinci b�l�m�n ba�lang�� indeksine yine aral�k b�y�kl���n� ekleyerek bu b�l�m�n  son indeksini olu�turuyoruz.
	            int m2=k+m3+m3+1;
	            
	            //recursive yap�s� gereklili�inden ve merge sort da en k���k yap�ya ula�abilmek i�in i�eride yeniden �a��r�yoruz.
	            //aral�k b�y�kl���n� kullanarak indeksleri bulduktan sonra arrayi 3'e ay�rarak yeniden 3 b�l�mde tekrarl�yoruz
	            //buldu�umuz aral�k b�y�kl��� ve m1 m2 indeksleriyle yeni ba�lang�� ve biti� indeksleri at�yoruz
	            merge_sort3(arr, k, m1); 
	            merge_sort3(arr , m1+1, m2); 
	            merge_sort3(arr ,m2+1, r); 
	           
	            //yukar�daki i�lemler tamamland���nda yani en k���k yap�lara ula��ld�ktan sonra �al��maya ba�lar
	            //merge methoduna yollayarak ba�lang�� orta ve son b�l�mleri sort ederek birle�tirir.
	            merge3(arr, k, m3, r);
	           
	           
	        } 
	        
	    }
		
		// Bu method merge_sort3 methodu i�inde �a��r�larak 3 b�l�me ayr�lm�� arrayi sortlayarak birle�tirir.
		// bu method  array, ba�lang�� indeksi, aral�k b�y�kl��� ve biti� indeksi parametrelerini kullan�r.
		// son indeksten ba�lang�� indeksini ��kar�p 3 e b�lerek aral�k b�y�kl���n� belirliyoruz.
		static void merge3(int arr[], int b, int m, int r) 
	    { 
			// yeni arraylarin b�y�kl��� hesaplan�r
			// S�f�r�nc� indeks g�z �n�nde bulundurularak 1 eklenir
			// son indeksten ilk indeks ��kar�larak yeni array sizelar� hesaplan�r
	        int n1 = m + 1; //ilk b�l�m�n son  indeksi b+m'dir yani aral�k b�y�kl���+ ba�lang�� indeksi. �lk indeksi b dir. Son - ilk = m+b-b+1
	        int n3 = m + 1; // Orta b�l�m�n ba�lang�� indeksi b+m+1'dir. Son indeks b+m+m+1'dir. Son -ilk= b+m+m+1-b-m-1+1
	        int n2 = r-(b+m+m+2)+1; // Son b�l�m�n ba�lang�� indeksi b+m+m+2'dir. Son indeks r'dir. Son -ilk= r-b-m-m-2+1
	         
	        //left  middle ve right array olacak �ekilde yukar�dan ald�klar� b�y�kl�klerde arrayler olu�turulur.
	        int L[] = new int [n1]; 
	        int M[] = new int [n3]; 
	        int R[] = new int [n2]; 
	  
	         //left arraye ba�lang��tan ilk b�l�m sonu indeksine kadar olan de�erler atan�r.
	         //middle arraye ikinci b�l�m ba�� indeksinden sonuna kadar olan  de�erler atan�r.
	         // right arraye ���nc� b�l�m ba�� indeksinden ba�layarak son indekse kadar olan de�erler atan�r.
	        for (int i=0; i<n1; ++i) 
	            L[i] = arr[b + i]; 
	        for (int h=0; h<n3; ++h) 
	            M[h] = arr[b+m + 1+ h]; 
	        for (int j=0; j<n2; ++j) 
	            R[j] = arr[(b+m+m+2) + j]; 
	  
	  
	        // �LK OLARAK left array ve middle arraylerindeki de�erler kar��la�t�r�l�r sortlan�p merge edilir.
	        
	        //bu de�erler left ve middle arraylerin i�inde gezinmek i�in olu�turuldu, indeks olarak kullan�lacak, 0dan ba�l�yor.
	        int i = 0, h = 0; 
	        // ba�lang��ta ald���m�z "as�l" arrayimizin i�inde gezinece�imiz indeks i�in olu�turuldu, ba�lang�� indeksinden ba�l�yor.
	        int k = b; 
	        // left ve middle array i�in indeksin array b�y�kl���n� a�mamas� i�in kontrol
	        //indeksler array b�y�kl�klerinden k���k olmaya devam edinceye kadar
	        while (i < n1 && h<n3 ) 
	        { 
	        	//e�er left array i�inde belirtilen indeksteki de�er middle arrayde belirtilen indeksteki de�erden k���kse veya e�itse
	            // kar��la�t�rma sonucunda K���K olan de�eri "as�l" arraye at�yoruz.
	            if (L[i] <= M[h]) 
	            { 
	            	//"as�l" arrayin bulundu�u indekse Left arrayin bulundu�u indeksteki de�eri at�yoruz.
	            	//left arrayin indeksini bir art�r�yoruz.
	                arr[k] = L[i]; 
	                i++; 
	            } 
	            //e�er left array i�inde belirtilen indeksteki de�er right arrayde belirtilen indeksteki de�erden b�y�kse
	            else
	            { 
	            	//"as�l" arrayin bulundu�u indekse middle arrayin bulundu�u indeksteki de�eri at�yoruz.
	            	//middle arrayin indeksini bir art�r�yoruz.
	                arr[k] = M[h]; 
	                h++; 
	            } 
	            //her iki durumda da "as�l" arrayin mevcut indeksi ile i�imiz bitti�inden indeksi 1 art�r�yoruz. 
	            k++; 
	        } 
	        // left veya middle array indekslerinden birinin  array b�y�kl���n� a�mas� durumunda
	        //left array indeksi hen�z array b�y�kl���n� ge�mediyse,indeks array b�y�kl���nden k���k olmaya devam edinceye kadar
	        while (i < n1) 
	        { 
	        	//"as�l" arrayin bulundu�u indekse Left arrayin bulundu�u indeksteki de�eri at�yoruz.
	        	//left arrayin ve "as�l" arrayin indeksini bir art�r�yoruz.
	            arr[k] = L[i]; 
	            i++; 
	            k++; 
	        } 
	        //middle array indeksi hen�z array b�y�kl���n� ge�mediyse,indeks array b�y�kl���nden k���k olmaya devam edinceye kadar
	        while (h < n1) 
	        {   //"as�l" arrayin bulundu�u indekse middle arrayin bulundu�u indeksteki de�eri at�yoruz.
	        	//middle arrayin ve "as�l" arrayin indeksini bir art�r�yoruz.
	            arr[k] = M[h]; 
	            h++; 
	            k++; 
	        } 
	        
	        //Sortlay�p mergeleme i�lemlerin tamamlad���m�z left ve middle arraylerini yeni bir array i�ine at�yoruz.
	        //iki arrayin b�y�kl��� toplam�nda yeni bir left array a��p ilk b�l�m�n ba��ndan ikinci b�l�m�n sonuna kadar olan de�erleri i�ine at�yoruz.
	        int newL[] = new int [n1+n3]; 
	        for (int f=0; f<(n1+n3); ++f) 
	            newL[f] = arr[b + f];
	        
	         // �K�NC� OLARAK neweft array ve right  arraylerindeki de�erler kar��la�t�r�l�r sortlan�p merge edilir.
	        
	        //bu de�erler newleft ve right arraylerin i�inde gezinmek i�in olu�turuldu, indeks olarak kullan�lacak, 0dan ba�l�yor.
	        int f = 0, j = 0; 
	        // ba�lang��ta ald���m�z "as�l" arrayimizin i�inde gezinece�imiz indeks i�in olu�turuldu, ba�lang�� indeksinden ba�l�yor.
	        int t = b; 
	        // newleft ve right array i�in indeksin array b�y�kl���n� a�mamas� i�in kontrol
	        //indeksler array b�y�kl�klerinden k���k olmaya devam edinceye kadar
	        while (f < (n1+n3) && j < n2) 	
	        {   
	        	//e�er newleft array i�inde belirtilen indeksteki de�er right arrayde belirtilen indeksteki de�erden k���kse veya e�itse
	            // kar��la�t�rma sonucunda K���K olan de�eri "as�l" arraye at�yoruz.
	            if (newL[f] <= R[j]) 
	            {   
	            	//"as�l" arrayin bulundu�u indekse newLeft arrayin bulundu�u indeksteki de�eri at�yoruz.
	            	//newleft arrayin indeksini bir art�r�yoruz.
	                arr[t] = newL[f]; 
	                f++; 
	            } 
	            //e�er left array i�inde belirtilen indeksteki de�er right arrayde belirtilen indeksteki de�erden b�y�kse
	            else
	            { 
	            	//"as�l" arrayin bulundu�u indekse right arrayin bulundu�u indeksteki de�eri at�yoruz.
	            	//right arrayin indeksini bir art�r�yoruz.
	                arr[t] = R[j]; 
	                j++; 
	            } 
	            //her iki durumda da "as�l" arrayin mevcut indeksi ile i�imiz bitti�inden indeksi 1 art�r�yoruz.
	            t++; 
	        } 
	        //  newleft veya right array indekslerinden birinin  array b�y�kl���n� a�mas� durumunda
	        //newleft array indeksi hen�z array b�y�kl���n� ge�mediyse,indeks array b�y�kl���nden k���k olmaya devam edinceye kadar
	        while (f < (n1+n3)) 
	        { 
	        	//"as�l" arrayin bulundu�u indekse newleft arrayin bulundu�u indeksteki de�eri at�yoruz.
	        	//newleft arrayin ve "as�l" arrayin indeksini bir art�r�yoruz.
	            arr[t] = newL[f]; 
	            f++; 
	            t++; 
	        } 
	        //right array indeksi hen�z array b�y�kl���n� ge�mediyse,indeks array b�y�kl���nden k���k olmaya devam edinceye kadar
	        while (j < n2) 
	        { 
	        	//"as�l" arrayin bulundu�u indekse right arrayin bulundu�u indeksteki de�eri at�yoruz.
	        	//right arrayin ve "as�l" arrayin indeksini bir art�r�yoruz.
	            arr[t] = R[j]; 
	            j++; 
	            t++; 
	        } 
	       
	    }
	
}
