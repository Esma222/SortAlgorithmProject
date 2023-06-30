
public class QuickSortClass {

	//d��ar�dan �a��r�lacak olan quicksort methodu  budur
		//parametre olarak sadece arrayi ve quick sortun  pivot tipini al�r.
		public static void quickSort(int[] arr, String pivotType) {
			//tip f ise yani first element pivot ise ya da r ise yani random element pivot ise quickSortFandR methoduna gider
			if(pivotType.equals("f")||pivotType.equals("r"))
				quickSortFandR(arr, 0, arr.length - 1,pivotType);
			//tip m ise yani MidOfFirstMidLastElement  pivot durumu ger�ekle�ecekse quickSelect methoduna gider.
			else if(pivotType.equals("m"))
			    quickSelect(arr, 0, arr.length - 1);
				
			//Pivot tipi bu ���n�n d���ndabir �ey olarak girildiyse hata mesaj� d�ner
			else
				System.out.println("you can choose only f,r or m for type ");
			
		}
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//first element pivot ve random element pivot i�in
		//ilk eleman� pivot alarak sortlama i�lemi yapar ya da random elemen pivot olarak se�ilir sonra first elemanla swap edilirerek sortlama yap�l�r
		//bu method array, ve i�lemleri ger�ekle�tiece�i aral�ktaki en k���k indeks ve en b�y�k indeksi ve quicksortun tipini parametre olarak al�yor.
		//low ve high ayn� zamnad aba�lama biti� indeksleri
	     static void quickSortFandR(int arr[], int low, int high,String type)
		    {
		        //recursive bir yap�ya sahip. Bitirme ko�ulu parametreden al�nan en b�y�k indeksin en k���k indeksten k���k olmas� durumudur
		        if (low < high) {
		            //bu de�er kendisinden k���kleri ve b�y�kleri ay�ran pivot de�erin son atand��� indeksi g�steriyor
		        	//ayr�ca bu indeksteki de�er daha sonra da de�i�tirilmez.Yani indeksteki de�er sortland���nda olmas� gereken yerdedir.
		        	//ilk ataman�n bo� kalmamas� i�in
		        	int idx=0;
		        	//e�er first element pivot ise
		        	if(type.equals("f"))
		             idx = partition(arr, low, high);
		        	//e�er random element pivot ise
		        	else if(type.equals("r"))
		        		idx = partition_r(arr, low, high);
		 
		            // idx indeksi ile s�rekli k���len aral�kla low high indeksleri belirlenir
		            // idx indeksinden k���k olanlar�n bulundu�u taraf i�in ayn� i�lemler tekrarlan�r 
		            quickSortFandR(arr, low, idx - 1, type);
		            // idx indeksinden b�y�k olanlar�n bulundu�u taraf i�in ayn� i�lemler tekrarlan�r 
		            quickSortFandR(arr, idx + 1, high, type);
		           
		        }
		    }
		 //bu fonsiyonda first element pivot i�in kar��la�t�rmalarla swap yap�l�r
		 // Bu fonksiyon array, ve i�lemleri ger�ekle�tiece�i aral�ktaki en k���k indeks ve en b�y�k indeksi parametre olarak al�yor.
		 static int partition(int arr[], int low, int high)
		    {
		        //Sort i�lemimimiz first element pivot olarak �al��t���ndan parametreden ald���m�z en d���k indeksteki de�eri pivot kabul ediyoruz.
		        int pivot = arr[low];
		        //k de�eri parametreden al�nan en b�y�k indeksteki de�erden ba�layarak 
		        //kar��la�t�rma ve swaplar sonucunda pivottan b�y�k olan de�erlerle k���k olan de�erler aras�ndaki indeks g�revi g�recek
		        int k = high;
		        //i de�eri array i�inde parametrede verilen en b�y�k indeksten en k���k indekse kadar gezmesini sa�lar
		        for (int i = high; i > low; i--) {
		        	//e�er kar��la�t�r�lan de�er pivottan b�y�kse 
		        	// burada pivottan b�y�k olan de�er, arrayde k indeksindeki de�er ile swap methodu ile yer de�i�tirir.
		        	// b�y�k de�ilse k de�i�mez swap ger�ekle�mez. i bir azalarak kar��la�t�rmaya devam eder.
		        	if (arr[i] > pivot)
		            	//swap i�lemi bittikten sonra k de�eri 1 azal�r
		                swap(arr, i, k--);
		        }
		        //i de�eri en k���k indekse ula�t�ktan sonra pivotumuzu k indeksindeki, pivottan b�y�k olmad���n� bildi�imiz de�er ile swaplay�p de�i�tiriyoruz.
		        swap(arr, low, k);
		     
		        //kendinden k���k indekslere pivottan k���k de�erler, kendinden b�y�k indekslerde pivottan b�y�k e�erler bulunur.
		        //son durumda pivotumuzun bulundu�u indeks quick sortta yeni low high indeks  belirlemeleri i�in d�nd�r�l�r
		        return k;
		    }
		 //bu method array ,kar��la�t�r�lan de�erin indeksi ve  pivottan k���k ve b�y�kleri ay�ran indeksi parametre olarak al�r.
		 // i ve j de�erleri i�in i' nin j ye e�it olabilece�i ama hi�bir zaman daha b�y�k olamayaca��n� s�yleyebiliriz.
		 public static void swap(int[] arr, int i, int j)
		    {  
			    //tempe kar��la�t�rmadan gelen  pivottan b�y�k olan de�er atan�r.
		        int temp = arr[i];
		        //arr[j] pivottan b�y�kler ile k���kleri ay�ran indekstedir 
		        //j "kar��la�t�rma yap�lanlar i�in" b�y�k olanlar�n  bulundu�u indeksten bir derece k���k indekste bulunur
		        //yani j indeksinden b�y�k indekslerdeki de�erlerin pivottan b�y�k oldu�unu biliyoruz ama j indeksindeki de�er hakk�nda kesin bilgimiz yok
		        //pivottan b�y�kse i=j durumu ger�ekle�ece�inden zaten yerinde kalacak olan arr[j] e�it ya da k���kse daha k���k indeks olan i indeksine atan�r.
		        arr[i] = arr[j];
		        //pivottan b�y�k oldu�unu bildi�imiz temp de�erini pivottan b�y�klerin oldu�u tarafa yani j indeksine at�yoruz
		        // b�ylelikle de�erlerin indekslerini de�i�tirerek swap i�lemini tamaml�yoruz.
		        arr[j] = temp;
		    }
		 // bu fonksiyon pivotun random olarak se�ilmesi durumunda �al���r.
		 //Bu fonksiyon array, ve i�lemleri ger�ekle�tiece�i aral�ktaki en k���k indeks ve en b�y�k indeksi parametre olarak al�yor.
		 static int partition_r(int arr[], int low, int high)
		    { 
			    //en k����� low en b�y��� high olmak �zere low ve high aral���ndaki indekslerden biri rastgele rIndexe atan�r.
			    //rIndex pivot olur.
		    	int rIndex = (low) + (int)(Math.random() * (high - low + 1));
		    	//pivot ile low indeksteki de�er swaplan�r.
		    	swap(arr, low, rIndex);
		    	//yani yeni pivot first element olur. Partition fonksiyonu d�nd�r�lerek i�lemler first element pivot gibi devam eder.
		    	return partition(arr, low, high);
		    	
		    }
		 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		 
		//tip m ise yani MidOfFirstMidLastElement  pivot durumu ger�ekle�ecekse quickSelect 
		//bu method array, ve i�lemleri ger�ekle�tiece�i aral�ktaki en k���k indeks ve en b�y�k indeksi parametre olarak al�yor. 
		 //low ve high ayn� zamnad aba�lama biti� indeksleri
		 public static  void quickSelect(int[] arr, int low, int high) {
			 //recursive yap�da �al���r
			 //bu recursive yap�n�n durdurma ko�ulu da high indeksin low indeksten k���k olma durumudur.
				if (low >= high)
					return;
				
				//low de�eri for ile array i�inde ba�tan sona do�ru  gezinmek i�in i de�erine atand�.
				int i = low;
				//MidOfFirstMidLastElement  pivotu se�mek i�in getpivot fonksiyonuna gerekli de�erleri yollad�k
				//sonu�ta low high ve middle indeksten aralar�nda ortanca de�ere sahip olan�n de�eri d�nd�r�ld� ve pivota atand�.
				int pivot = getPivot(arr, low, high);
				
				//for ile i  j den k���k olduk�a tekrar edecek bir d�ng� yap�l�r
				//high de�eri for ile array i�inde sondan ba�a do�ru gezinmek i�in  j de�erine atand�
				for (int j = high; i <= j;) {
					//ba�taki de�er  pivottan k���k olduk�a i art�r�larak s�recek bir d�ng�
					for (; arr[i] < pivot; i++);
					//sondakiki de�er  pivottan b�y�k olduk�a j azalt�larak s�recek bir d�ng�
					for (; arr[j] > pivot; j--);
					//yukar�daki 2 d�ng� bitti�inde 
					//yani i indeksi pivottan k���k olmayan bir de�er ve j indeksi pivottan b�y�k olmayan bir de�er g�sterdi�inde
					//e�er hala i j den b�y�k de�ilse 
					if (i <= j)
					{	
						//i indeksindeki de�erle j indeksindeki de�er  swaplan�p yer de�i�tirir.
						//swap i�lemi bittikten sonra i 1 art�r�l�r ve j 1 azalt�l�r.
						swap(arr, i++, j--);
					}
				}
				
				// for d�ng�leri tamamen bitti�inde  i indeksinden  k���k olan indekslerde pivottan k���k olan de�erler bulunur.
				// bu recursive yap� da i den k���kler ile
				//i ye e�it ve  b�y�kler �eklinde yeniden �al���r.
				quickSelect(arr, low, i - 1);
				quickSelect(arr, i, high);
			}

			// median of three olara da ge�en bu fonksiyon bizim i�in MidOfFirstMidLastElement ad�yla  pivotu belirleyip d�nd�r�yoruz
		    //bu fonksiyon array, ve i�lemleri ger�ekle�tiece�i aral�ktaki en k���k indeks ve en b�y�k indeksi parametre olarak al�yor. 
			public static  int getPivot(int[] arr, int low, int high) {
				
				//middle d�nd�r�len de�er olacak ilk de�er olarak s�f�r atand�
				//pivot olarak indeks de�il indeksteki de�eri d�nd�recek
				int middle=0;
				//mIndex e ba�lang�� ve biti� indekslerini toplay�p 2 ye b�lerek ortanca indeks atand�.
		    	int mIndex= (low + high)/2;
		    	// max ve min de�erleri math k�t�phanesinin max min fonksiyonlar� kullan�larak bulundu
		    	//�nce low indeksteki de�erle mIndexteki de�erden b�y�k olan de�er  maxa atand�.
		    	int max=Math.max(arr[low], arr[mIndex]);
		    	//sonra maxtaki de�erle high indeksteki de�erden b�y�k oln max de�erine at�larak max de�er bulundu.
		    	max=Math.max(max, arr[high]);
		    	//�nce low indeksteki de�erle mIndexteki de�erden k���k olan de�er min e atand�.
		    	int min=Math.min(arr[low], arr[mIndex]);
		    	//sonra min deki de�erle high indeksteki de�erden daha k���k oln min de�erine at�larak min de�er bulundu.
		    	min=Math.min(min, arr[high]);
		    	 
		    	//min ve max belliolduktan sonra ikisi de olmayan middle de�erdir diyerek ifler ile midlle buunur ve d�nd�r�l�r
		    	
		        //e�er max  high indeksindeki de�erken minde low indeksindeki de�erse ya da bunun tam tersiyse
		    	if((max==arr[low]&&min==arr[high])||(max==arr[high]&&min==arr[low])) {
		    		//middle mIndeksteki de�ere e�it olur.
		    		middle=arr[mIndex];
		    	}
		    	 //e�er max  low  indeksindeki de�erken minde mIndex indeksindeki de�erse ya da bunun tam tersiyse
		    	else if((max==arr[low]&&min==arr[mIndex])||(max==arr[mIndex]&&min==arr[low])) {//high middle ise last pivot
		    		//middle high indekteki de�ere e�it olur.
		    		middle=arr[high];
		    	}
		    	//e�er max  high  indeksindeki de�erken minde mIndex indeksindeki de�erse ya da bunun tam tersiyse
		    	else if((max==arr[high]&&min==arr[mIndex])||(max==arr[mIndex]&&min==arr[high])) {//low middle ise first pivot olmal�
		    		//middle low indekteki de�ere e�it olur.
		    		middle=arr[low];
		    		
		    	}
		    	//�� indeksin i�inden arrayde  ortanca de�ere sahip olan de�er d�nd�r�l�r.
				return middle;
			}
		 
	
}
