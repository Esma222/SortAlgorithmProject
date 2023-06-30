
public class QuickSortClass {

	//dýþarýdan çaðýrýlacak olan quicksort methodu  budur
		//parametre olarak sadece arrayi ve quick sortun  pivot tipini alýr.
		public static void quickSort(int[] arr, String pivotType) {
			//tip f ise yani first element pivot ise ya da r ise yani random element pivot ise quickSortFandR methoduna gider
			if(pivotType.equals("f")||pivotType.equals("r"))
				quickSortFandR(arr, 0, arr.length - 1,pivotType);
			//tip m ise yani MidOfFirstMidLastElement  pivot durumu gerçekleþecekse quickSelect methoduna gider.
			else if(pivotType.equals("m"))
			    quickSelect(arr, 0, arr.length - 1);
				
			//Pivot tipi bu üçünün dýþýndabir þey olarak girildiyse hata mesajý döner
			else
				System.out.println("you can choose only f,r or m for type ");
			
		}
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//first element pivot ve random element pivot için
		//ilk elemaný pivot alarak sortlama iþlemi yapar ya da random elemen pivot olarak seçilir sonra first elemanla swap edilirerek sortlama yapýlýr
		//bu method array, ve iþlemleri gerçekleþtieceði aralýktaki en küçük indeks ve en büyük indeksi ve quicksortun tipini parametre olarak alýyor.
		//low ve high ayný zamnad abaþlama bitiþ indeksleri
	     static void quickSortFandR(int arr[], int low, int high,String type)
		    {
		        //recursive bir yapýya sahip. Bitirme koþulu parametreden alýnan en büyük indeksin en küçük indeksten küçük olmasý durumudur
		        if (low < high) {
		            //bu deðer kendisinden küçükleri ve büyükleri ayýran pivot deðerin son atandýðý indeksi gösteriyor
		        	//ayrýca bu indeksteki deðer daha sonra da deðiþtirilmez.Yani indeksteki deðer sortlandýðýnda olmasý gereken yerdedir.
		        	//ilk atamanýn boþ kalmamasý için
		        	int idx=0;
		        	//eðer first element pivot ise
		        	if(type.equals("f"))
		             idx = partition(arr, low, high);
		        	//eðer random element pivot ise
		        	else if(type.equals("r"))
		        		idx = partition_r(arr, low, high);
		 
		            // idx indeksi ile sürekli küçülen aralýkla low high indeksleri belirlenir
		            // idx indeksinden küçük olanlarýn bulunduðu taraf için ayný iþlemler tekrarlanýr 
		            quickSortFandR(arr, low, idx - 1, type);
		            // idx indeksinden büyük olanlarýn bulunduðu taraf için ayný iþlemler tekrarlanýr 
		            quickSortFandR(arr, idx + 1, high, type);
		           
		        }
		    }
		 //bu fonsiyonda first element pivot için karþýlaþtýrmalarla swap yapýlýr
		 // Bu fonksiyon array, ve iþlemleri gerçekleþtieceði aralýktaki en küçük indeks ve en büyük indeksi parametre olarak alýyor.
		 static int partition(int arr[], int low, int high)
		    {
		        //Sort iþlemimimiz first element pivot olarak çalýþtýðýndan parametreden aldýðýmýz en düþük indeksteki deðeri pivot kabul ediyoruz.
		        int pivot = arr[low];
		        //k deðeri parametreden alýnan en büyük indeksteki deðerden baþlayarak 
		        //karþýlaþtýrma ve swaplar sonucunda pivottan büyük olan deðerlerle küçük olan deðerler arasýndaki indeks görevi görecek
		        int k = high;
		        //i deðeri array içinde parametrede verilen en büyük indeksten en küçük indekse kadar gezmesini saðlar
		        for (int i = high; i > low; i--) {
		        	//eðer karþýlaþtýrýlan deðer pivottan büyükse 
		        	// burada pivottan büyük olan deðer, arrayde k indeksindeki deðer ile swap methodu ile yer deðiþtirir.
		        	// büyük deðilse k deðiþmez swap gerçekleþmez. i bir azalarak karþýlaþtýrmaya devam eder.
		        	if (arr[i] > pivot)
		            	//swap iþlemi bittikten sonra k deðeri 1 azalýr
		                swap(arr, i, k--);
		        }
		        //i deðeri en küçük indekse ulaþtýktan sonra pivotumuzu k indeksindeki, pivottan büyük olmadýðýný bildiðimiz deðer ile swaplayýp deðiþtiriyoruz.
		        swap(arr, low, k);
		     
		        //kendinden küçük indekslere pivottan küçük deðerler, kendinden büyük indekslerde pivottan büyük eðerler bulunur.
		        //son durumda pivotumuzun bulunduðu indeks quick sortta yeni low high indeks  belirlemeleri için döndürülür
		        return k;
		    }
		 //bu method array ,karþýlaþtýrýlan deðerin indeksi ve  pivottan küçük ve büyükleri ayýran indeksi parametre olarak alýr.
		 // i ve j deðerleri için i' nin j ye eþit olabileceði ama hiçbir zaman daha büyük olamayacaðýný söyleyebiliriz.
		 public static void swap(int[] arr, int i, int j)
		    {  
			    //tempe karþýlaþtýrmadan gelen  pivottan büyük olan deðer atanýr.
		        int temp = arr[i];
		        //arr[j] pivottan büyükler ile küçükleri ayýran indekstedir 
		        //j "karþýlaþtýrma yapýlanlar için" büyük olanlarýn  bulunduðu indeksten bir derece küçük indekste bulunur
		        //yani j indeksinden büyük indekslerdeki deðerlerin pivottan büyük olduðunu biliyoruz ama j indeksindeki deðer hakkýnda kesin bilgimiz yok
		        //pivottan büyükse i=j durumu gerçekleþeceðinden zaten yerinde kalacak olan arr[j] eþit ya da küçükse daha küçük indeks olan i indeksine atanýr.
		        arr[i] = arr[j];
		        //pivottan büyük olduðunu bildiðimiz temp deðerini pivottan büyüklerin olduðu tarafa yani j indeksine atýyoruz
		        // böylelikle deðerlerin indekslerini deðiþtirerek swap iþlemini tamamlýyoruz.
		        arr[j] = temp;
		    }
		 // bu fonksiyon pivotun random olarak seçilmesi durumunda çalýþýr.
		 //Bu fonksiyon array, ve iþlemleri gerçekleþtieceði aralýktaki en küçük indeks ve en büyük indeksi parametre olarak alýyor.
		 static int partition_r(int arr[], int low, int high)
		    { 
			    //en küçüðü low en büyüðü high olmak üzere low ve high aralýðýndaki indekslerden biri rastgele rIndexe atanýr.
			    //rIndex pivot olur.
		    	int rIndex = (low) + (int)(Math.random() * (high - low + 1));
		    	//pivot ile low indeksteki deðer swaplanýr.
		    	swap(arr, low, rIndex);
		    	//yani yeni pivot first element olur. Partition fonksiyonu döndürülerek iþlemler first element pivot gibi devam eder.
		    	return partition(arr, low, high);
		    	
		    }
		 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		 
		//tip m ise yani MidOfFirstMidLastElement  pivot durumu gerçekleþecekse quickSelect 
		//bu method array, ve iþlemleri gerçekleþtieceði aralýktaki en küçük indeks ve en büyük indeksi parametre olarak alýyor. 
		 //low ve high ayný zamnad abaþlama bitiþ indeksleri
		 public static  void quickSelect(int[] arr, int low, int high) {
			 //recursive yapýda çalýþýr
			 //bu recursive yapýnýn durdurma koþulu da high indeksin low indeksten küçük olma durumudur.
				if (low >= high)
					return;
				
				//low deðeri for ile array içinde baþtan sona doðru  gezinmek için i deðerine atandý.
				int i = low;
				//MidOfFirstMidLastElement  pivotu seçmek için getpivot fonksiyonuna gerekli deðerleri yolladýk
				//sonuçta low high ve middle indeksten aralarýnda ortanca deðere sahip olanýn deðeri döndürüldü ve pivota atandý.
				int pivot = getPivot(arr, low, high);
				
				//for ile i  j den küçük oldukça tekrar edecek bir döngü yapýlýr
				//high deðeri for ile array içinde sondan baþa doðru gezinmek için  j deðerine atandý
				for (int j = high; i <= j;) {
					//baþtaki deðer  pivottan küçük oldukça i artýrýlarak sürecek bir döngü
					for (; arr[i] < pivot; i++);
					//sondakiki deðer  pivottan büyük oldukça j azaltýlarak sürecek bir döngü
					for (; arr[j] > pivot; j--);
					//yukarýdaki 2 döngü bittiðinde 
					//yani i indeksi pivottan küçük olmayan bir deðer ve j indeksi pivottan büyük olmayan bir deðer gösterdiðinde
					//eðer hala i j den büyük deðilse 
					if (i <= j)
					{	
						//i indeksindeki deðerle j indeksindeki deðer  swaplanýp yer deðiþtirir.
						//swap iþlemi bittikten sonra i 1 artýrýlýr ve j 1 azaltýlýr.
						swap(arr, i++, j--);
					}
				}
				
				// for döngüleri tamamen bittiðinde  i indeksinden  küçük olan indekslerde pivottan küçük olan deðerler bulunur.
				// bu recursive yapý da i den küçükler ile
				//i ye eþit ve  büyükler þeklinde yeniden çalýþýr.
				quickSelect(arr, low, i - 1);
				quickSelect(arr, i, high);
			}

			// median of three olara da geçen bu fonksiyon bizim için MidOfFirstMidLastElement adýyla  pivotu belirleyip döndürüyoruz
		    //bu fonksiyon array, ve iþlemleri gerçekleþtieceði aralýktaki en küçük indeks ve en büyük indeksi parametre olarak alýyor. 
			public static  int getPivot(int[] arr, int low, int high) {
				
				//middle döndürülen deðer olacak ilk deðer olarak sýfýr atandý
				//pivot olarak indeks deðil indeksteki deðeri döndürecek
				int middle=0;
				//mIndex e baþlangýç ve bitiþ indekslerini toplayýp 2 ye bölerek ortanca indeks atandý.
		    	int mIndex= (low + high)/2;
		    	// max ve min deðerleri math kütüphanesinin max min fonksiyonlarý kullanýlarak bulundu
		    	//önce low indeksteki deðerle mIndexteki deðerden büyük olan deðer  maxa atandý.
		    	int max=Math.max(arr[low], arr[mIndex]);
		    	//sonra maxtaki deðerle high indeksteki deðerden büyük oln max deðerine atýlarak max deðer bulundu.
		    	max=Math.max(max, arr[high]);
		    	//önce low indeksteki deðerle mIndexteki deðerden küçük olan deðer min e atandý.
		    	int min=Math.min(arr[low], arr[mIndex]);
		    	//sonra min deki deðerle high indeksteki deðerden daha küçük oln min deðerine atýlarak min deðer bulundu.
		    	min=Math.min(min, arr[high]);
		    	 
		    	//min ve max belliolduktan sonra ikisi de olmayan middle deðerdir diyerek ifler ile midlle buunur ve döndürülür
		    	
		        //eðer max  high indeksindeki deðerken minde low indeksindeki deðerse ya da bunun tam tersiyse
		    	if((max==arr[low]&&min==arr[high])||(max==arr[high]&&min==arr[low])) {
		    		//middle mIndeksteki deðere eþit olur.
		    		middle=arr[mIndex];
		    	}
		    	 //eðer max  low  indeksindeki deðerken minde mIndex indeksindeki deðerse ya da bunun tam tersiyse
		    	else if((max==arr[low]&&min==arr[mIndex])||(max==arr[mIndex]&&min==arr[low])) {//high middle ise last pivot
		    		//middle high indekteki deðere eþit olur.
		    		middle=arr[high];
		    	}
		    	//eðer max  high  indeksindeki deðerken minde mIndex indeksindeki deðerse ya da bunun tam tersiyse
		    	else if((max==arr[high]&&min==arr[mIndex])||(max==arr[mIndex]&&min==arr[high])) {//low middle ise first pivot olmalý
		    		//middle low indekteki deðere eþit olur.
		    		middle=arr[low];
		    		
		    	}
		    	//üç indeksin içinden arrayde  ortanca deðere sahip olan deðer döndürülür.
				return middle;
			}
		 
	
}
