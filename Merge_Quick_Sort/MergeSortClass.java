
public class MergeSortClass {

	//merge sort için dýþarýdan bu method çaðirýlýr.
		//sadece arrayi ve merge sortun tipini parametre olarak alýr.
		static void mergeSort(int arr[], String numberOfPartitions) 
	    {  // mergesort tipi TwoPart ise merge_sort2 methoduna gider
			if( numberOfPartitions.equals("TwoParts")) {
				merge_sort2(arr,0,arr.length-1);
			}
			// mergesort tipi ThreePart ise merge_sort3 methoduna gider
			else if(numberOfPartitions.equals("ThreeParts")) {
				merge_sort3(arr,0,arr.length-1);
			}
			// eðer tip yanlýþ yazýldýysa hata mesajý döner
			else
				System.out.println("you can choose only \"TwoParts\" or \"ThreeParts\"");
	    }
		
		//2 part recursively merge sort için
		//bu method için array, baþlangýç indeksi ve bitiþ indeksi parametrelerini kullanýyoruz.
		//amacýmýz var olan arraydeki deðerleri küçükten büyüðe sýralý olacak þekilde deðiþtirmek.
		static void merge_sort2(int arr[], int l, int r) 
	    { 
			//arrayin baþlangýç indeksinin her zaman son indeksinden küçük olmasý gerekir
			//recursive i devam ettirme koþulumuz , aksi durumda sonlandýrýyoruz.
	        if (l < r) 
	        { 
	            //arrayi ikiye bölebilmek için ortadaki indeksi buluyoruz
	        	//baþlangýç indeksi ile bitiþ indeksini toplayýp ikiye bölüyoruz
	            int m = (l+r)/2; 
	  
	            //recursive yapýsý gerekliliðinden  ve merge sort da en küçük yapýya ulaþabilmek için içeride yeniden çaðýrýyoruz.
	            //orta indeksi bulduktan sonra arrayi ikiye ayýrarak yeniden iki bölümde tekrarlýyoruz
	            //bulduðumuz orta deðerle yeni baþlangýç ve bitiþ deðerleri atýyoruz
	            merge_sort2(arr, l, m); 
	            merge_sort2(arr , m+1, r); 
	  
	            //yukarýdaki iþlemler tamamlandýðýnda yani en küçük yapýlara ulaþýldýktan sonra çalýþmaya baþlar
	            // merge methoduna yollayarak orta indeksin saðý ve solunu  sort ederek birleþtirir.
	            merge2(arr, l, m, r);
	           
	           
	        } 
	        
	    }
		
		// Bu method merge_sort methodu içinde çaðýrýlarak iki bölüme ayrýlmýþ arrayi sortlayarak birleþtirir.
		// bu method  array, baþlangýç indeksi, orta indeks ve bitiþ indeksi parametrelerini kullanýr.
		static void merge2(int arr[], int l, int m, int r) 
	    {   
			// yeni arraylarin büyüklüðü hesaplanýr
			// Sýfýrýncý indeks göz önünde bulundurularak 1 eklenir
			//orta indeksten baþlangýç indeksi çýkarýlarak ilk arrayin size ý 
			//son indeksten ortanca indeks çýkarýlarak ikinci arrayin size ý bulunur.
	        int n1 = m - l + 1; 
	        int n2 = r - m; 
	  
	        //left ve right array olacak þekilde yukarýdan aldýklarý büyüklüklerde arrayler oluþturulur.
	        int L[] = new int [n1]; 
	        int R[] = new int [n2]; 
	  
	        //left arraye baþlangýçtan orta indekse kadar olan deðerler atanýr.
	        // right arraye ortanca indeksten baþlayarak son indekse kadar olan deðerler atanýr.
	        for (int i=0; i<n1; ++i) 
	            L[i] = arr[l + i]; 
	        for (int j=0; j<n2; ++j) 
	            R[j] = arr[m + 1+ j]; 
	  
	  
	        //bu deðerler left ve right arraylerin içinde gezinmek için oluþturuldu, indeks olarak kullanýlacak, 0dan baþlýyor.
	        int i = 0, j = 0; 
	        // baþlangýçta aldýðýmýz "asýl" arrayimizin içinde gezineceðimiz indeks için oluþturuldu, baþlangýç indeksinden baþlýyor.
	        int k = l; 
	        // left ve right array için indeksin array büyüklüðünü aþmamasý için kontrol
	        //indeksler array büyüklüklerinden küçük olmaya devam edinceye kadar
	        while (i < n1 && j < n2) 
	        { 
	        	//eðer left array içinde belirtilen indeksteki deðer right arrayde belirtilen indeksteki deðerden küçükse veya eþitse
	            // karþýlaþtýrma sonucunda KÜÇÜK olan deðeri "asýl" arraye atýyoruz.
	        	if (L[i] <= R[j]) 
	            { 
	            	//"asýl" arrayin bulunduðu indekse Left arrayin bulunduðu indeksteki deðeri atýyoruz.
	            	//left arrayin indeksini bir artýrýyoruz.
	                arr[k] = L[i]; 
	                i++; 
	            } 
	           //eðer left array içinde belirtilen indeksteki deðer right arrayde belirtilen indeksteki deðerden büyükse
	            else
	            {   //"asýl" arrayin bulunduðu indekse Right arrayin bulunduðu indeksteki deðeri atýyoruz.
	            	//right arrayin indeksini bir artýrýyoruz.
	                arr[k] = R[j]; 
	                j++; 
	            } 
	            //her iki durumda da "asýl" arrayin mevcut indeksi ile iþimiz bittiðinden indeksi 1 artýrýyoruz. 
	            k++; 
	        } 
	        // left veya right array indekslerinden birinin  array büyüklüðünü aþmasý durumunda
	        //left array indeksi henüz array büyüklüðünü geçmediyse,indeks array büyüklüðünden küçük olmaya devam edinceye kadar
	        while (i < n1) 
	        { 
	        	//"asýl" arrayin bulunduðu indekse Left arrayin bulunduðu indeksteki deðeri atýyoruz.
	        	//left arrayin ve "asýl" arrayin indeksini bir artýrýyoruz.
	            arr[k] = L[i]; 
	            i++; 
	            k++; 
	        } 
	       //right array indeksi henüz array büyüklüðünü geçmediyse,indeks array büyüklüðünden küçük olmaya devam edinceye kadar
	        while (j < n2) 
	        { 
	        	//"asýl" arrayin bulunduðu indekse right arrayin bulunduðu indeksteki deðeri atýyoruz.
	        	//right arrayin ve "asýl" arrayin indeksini bir artýrýyoruz.
	            arr[k] = R[j]; 
	            j++; 
	            k++; 
	        } 
	        
	        
	    }
		
		//3 part recursively merge sort için
		//bu method için array, baþlangýç indeksi ve bitiþ indeksi parametrelerini kullanýyoruz.
		//amacýmýz var olan arraydeki deðerleri küçükten büyüðe sýralý olacak þekilde deðiþtirmek.
		static void merge_sort3(int arr[], int k, int r) 
	    { 
			//arrayin baþlangýç indeksinin her zaman son indeksinden küçük olmasý gerekir
			//recursive i devam ettirme koþulumuz , aksi durumda sonlandýrýyoruz.
	        if (k < r ) 
	        { 
	            //son indeksten baþlangýç indeksini çýkarýp 3 e bölerek her bölümün büyüklüðünün ne kadar olacaðýna karar veriyoruz.
	        	//buna aralýk büyüklüðü diyebiliriz
	            int m3 = (r-k)/3; 
	            
	            // Aþaðýdaki recursive çaðýrmalarýnda indekslerin  daha az kafa karýþtýrýcý olmalarý için burada deðiþkene atadým
	            //baþlangýç indeksi ile aralýk büyüklüðünü toplayýp ilk bölümün son indeksi yapýyoruz
	            int m1=k+m3;
	            //ikinci bölümün baþlangýç indeksine yine aralýk büyüklüðünü ekleyerek bu bölümün  son indeksini oluþturuyoruz.
	            int m2=k+m3+m3+1;
	            
	            //recursive yapýsý gerekliliðinden ve merge sort da en küçük yapýya ulaþabilmek için içeride yeniden çaðýrýyoruz.
	            //aralýk büyüklüðünü kullanarak indeksleri bulduktan sonra arrayi 3'e ayýrarak yeniden 3 bölümde tekrarlýyoruz
	            //bulduðumuz aralýk büyüklüðü ve m1 m2 indeksleriyle yeni baþlangýç ve bitiþ indeksleri atýyoruz
	            merge_sort3(arr, k, m1); 
	            merge_sort3(arr , m1+1, m2); 
	            merge_sort3(arr ,m2+1, r); 
	           
	            //yukarýdaki iþlemler tamamlandýðýnda yani en küçük yapýlara ulaþýldýktan sonra çalýþmaya baþlar
	            //merge methoduna yollayarak baþlangýç orta ve son bölümleri sort ederek birleþtirir.
	            merge3(arr, k, m3, r);
	           
	           
	        } 
	        
	    }
		
		// Bu method merge_sort3 methodu içinde çaðýrýlarak 3 bölüme ayrýlmýþ arrayi sortlayarak birleþtirir.
		// bu method  array, baþlangýç indeksi, aralýk büyüklüðü ve bitiþ indeksi parametrelerini kullanýr.
		// son indeksten baþlangýç indeksini çýkarýp 3 e bölerek aralýk büyüklüðünü belirliyoruz.
		static void merge3(int arr[], int b, int m, int r) 
	    { 
			// yeni arraylarin büyüklüðü hesaplanýr
			// Sýfýrýncý indeks göz önünde bulundurularak 1 eklenir
			// son indeksten ilk indeks çýkarýlarak yeni array sizelarý hesaplanýr
	        int n1 = m + 1; //ilk bölümün son  indeksi b+m'dir yani aralýk büyüklüðü+ baþlangýç indeksi. Ýlk indeksi b dir. Son - ilk = m+b-b+1
	        int n3 = m + 1; // Orta bölümün baþlangýç indeksi b+m+1'dir. Son indeks b+m+m+1'dir. Son -ilk= b+m+m+1-b-m-1+1
	        int n2 = r-(b+m+m+2)+1; // Son bölümün baþlangýç indeksi b+m+m+2'dir. Son indeks r'dir. Son -ilk= r-b-m-m-2+1
	         
	        //left  middle ve right array olacak þekilde yukarýdan aldýklarý büyüklüklerde arrayler oluþturulur.
	        int L[] = new int [n1]; 
	        int M[] = new int [n3]; 
	        int R[] = new int [n2]; 
	  
	         //left arraye baþlangýçtan ilk bölüm sonu indeksine kadar olan deðerler atanýr.
	         //middle arraye ikinci bölüm baþý indeksinden sonuna kadar olan  deðerler atanýr.
	         // right arraye üçüncü bölüm baþý indeksinden baþlayarak son indekse kadar olan deðerler atanýr.
	        for (int i=0; i<n1; ++i) 
	            L[i] = arr[b + i]; 
	        for (int h=0; h<n3; ++h) 
	            M[h] = arr[b+m + 1+ h]; 
	        for (int j=0; j<n2; ++j) 
	            R[j] = arr[(b+m+m+2) + j]; 
	  
	  
	        // ÝLK OLARAK left array ve middle arraylerindeki deðerler karþýlaþtýrýlýr sortlanýp merge edilir.
	        
	        //bu deðerler left ve middle arraylerin içinde gezinmek için oluþturuldu, indeks olarak kullanýlacak, 0dan baþlýyor.
	        int i = 0, h = 0; 
	        // baþlangýçta aldýðýmýz "asýl" arrayimizin içinde gezineceðimiz indeks için oluþturuldu, baþlangýç indeksinden baþlýyor.
	        int k = b; 
	        // left ve middle array için indeksin array büyüklüðünü aþmamasý için kontrol
	        //indeksler array büyüklüklerinden küçük olmaya devam edinceye kadar
	        while (i < n1 && h<n3 ) 
	        { 
	        	//eðer left array içinde belirtilen indeksteki deðer middle arrayde belirtilen indeksteki deðerden küçükse veya eþitse
	            // karþýlaþtýrma sonucunda KÜÇÜK olan deðeri "asýl" arraye atýyoruz.
	            if (L[i] <= M[h]) 
	            { 
	            	//"asýl" arrayin bulunduðu indekse Left arrayin bulunduðu indeksteki deðeri atýyoruz.
	            	//left arrayin indeksini bir artýrýyoruz.
	                arr[k] = L[i]; 
	                i++; 
	            } 
	            //eðer left array içinde belirtilen indeksteki deðer right arrayde belirtilen indeksteki deðerden büyükse
	            else
	            { 
	            	//"asýl" arrayin bulunduðu indekse middle arrayin bulunduðu indeksteki deðeri atýyoruz.
	            	//middle arrayin indeksini bir artýrýyoruz.
	                arr[k] = M[h]; 
	                h++; 
	            } 
	            //her iki durumda da "asýl" arrayin mevcut indeksi ile iþimiz bittiðinden indeksi 1 artýrýyoruz. 
	            k++; 
	        } 
	        // left veya middle array indekslerinden birinin  array büyüklüðünü aþmasý durumunda
	        //left array indeksi henüz array büyüklüðünü geçmediyse,indeks array büyüklüðünden küçük olmaya devam edinceye kadar
	        while (i < n1) 
	        { 
	        	//"asýl" arrayin bulunduðu indekse Left arrayin bulunduðu indeksteki deðeri atýyoruz.
	        	//left arrayin ve "asýl" arrayin indeksini bir artýrýyoruz.
	            arr[k] = L[i]; 
	            i++; 
	            k++; 
	        } 
	        //middle array indeksi henüz array büyüklüðünü geçmediyse,indeks array büyüklüðünden küçük olmaya devam edinceye kadar
	        while (h < n1) 
	        {   //"asýl" arrayin bulunduðu indekse middle arrayin bulunduðu indeksteki deðeri atýyoruz.
	        	//middle arrayin ve "asýl" arrayin indeksini bir artýrýyoruz.
	            arr[k] = M[h]; 
	            h++; 
	            k++; 
	        } 
	        
	        //Sortlayýp mergeleme iþlemlerin tamamladýðýmýz left ve middle arraylerini yeni bir array içine atýyoruz.
	        //iki arrayin büyüklüðü toplamýnda yeni bir left array açýp ilk bölümün baþýndan ikinci bölümün sonuna kadar olan deðerleri içine atýyoruz.
	        int newL[] = new int [n1+n3]; 
	        for (int f=0; f<(n1+n3); ++f) 
	            newL[f] = arr[b + f];
	        
	         // ÝKÝNCÝ OLARAK neweft array ve right  arraylerindeki deðerler karþýlaþtýrýlýr sortlanýp merge edilir.
	        
	        //bu deðerler newleft ve right arraylerin içinde gezinmek için oluþturuldu, indeks olarak kullanýlacak, 0dan baþlýyor.
	        int f = 0, j = 0; 
	        // baþlangýçta aldýðýmýz "asýl" arrayimizin içinde gezineceðimiz indeks için oluþturuldu, baþlangýç indeksinden baþlýyor.
	        int t = b; 
	        // newleft ve right array için indeksin array büyüklüðünü aþmamasý için kontrol
	        //indeksler array büyüklüklerinden küçük olmaya devam edinceye kadar
	        while (f < (n1+n3) && j < n2) 	
	        {   
	        	//eðer newleft array içinde belirtilen indeksteki deðer right arrayde belirtilen indeksteki deðerden küçükse veya eþitse
	            // karþýlaþtýrma sonucunda KÜÇÜK olan deðeri "asýl" arraye atýyoruz.
	            if (newL[f] <= R[j]) 
	            {   
	            	//"asýl" arrayin bulunduðu indekse newLeft arrayin bulunduðu indeksteki deðeri atýyoruz.
	            	//newleft arrayin indeksini bir artýrýyoruz.
	                arr[t] = newL[f]; 
	                f++; 
	            } 
	            //eðer left array içinde belirtilen indeksteki deðer right arrayde belirtilen indeksteki deðerden büyükse
	            else
	            { 
	            	//"asýl" arrayin bulunduðu indekse right arrayin bulunduðu indeksteki deðeri atýyoruz.
	            	//right arrayin indeksini bir artýrýyoruz.
	                arr[t] = R[j]; 
	                j++; 
	            } 
	            //her iki durumda da "asýl" arrayin mevcut indeksi ile iþimiz bittiðinden indeksi 1 artýrýyoruz.
	            t++; 
	        } 
	        //  newleft veya right array indekslerinden birinin  array büyüklüðünü aþmasý durumunda
	        //newleft array indeksi henüz array büyüklüðünü geçmediyse,indeks array büyüklüðünden küçük olmaya devam edinceye kadar
	        while (f < (n1+n3)) 
	        { 
	        	//"asýl" arrayin bulunduðu indekse newleft arrayin bulunduðu indeksteki deðeri atýyoruz.
	        	//newleft arrayin ve "asýl" arrayin indeksini bir artýrýyoruz.
	            arr[t] = newL[f]; 
	            f++; 
	            t++; 
	        } 
	        //right array indeksi henüz array büyüklüðünü geçmediyse,indeks array büyüklüðünden küçük olmaya devam edinceye kadar
	        while (j < n2) 
	        { 
	        	//"asýl" arrayin bulunduðu indekse right arrayin bulunduðu indeksteki deðeri atýyoruz.
	        	//right arrayin ve "asýl" arrayin indeksini bir artýrýyoruz.
	            arr[t] = R[j]; 
	            j++; 
	            t++; 
	        } 
	       
	    }
	
}
