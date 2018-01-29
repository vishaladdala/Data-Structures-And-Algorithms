import java.util.Random;

public class RevisingPartition {

	 public static void main(String args[])
	  { int arr[] = {4,2,11,32,5,33,176,886,1335,5069,16,12,111,42,8,65,486,20,90,1000};
	  qsort(arr,0,arr.length-1);
	  for(int x:arr)
	    System.out.print(x+" ");
	 }


	static void qsort(int arr[],int p,int r){
	    if(p<r){
	      int q = partition(arr,p,r);
	      qsort(arr,p,q-1);
	      qsort(arr,q+1,r);
	    }
	  }

	static int partition(int arr[],int p,int r){
		Random random = new Random();
		int pivot = random.nextInt(r - p + 1) + p;
		int temp = arr[pivot];
		arr[pivot] = arr[r];
		arr[r] =temp;
		
	    int i;
	    i = p-1;
	    
	    for(int j =p;j < r; j++){
	      if(arr[j] <= arr[r]){
	        i++;
	        //exch ai aj
	        int mp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = mp;
	      }
	    }
	    //exh ai+1 ar
	    int mp = arr[i+1];
	    arr[i+1] = arr[r];
	    arr[r] = mp;
	    return i+1;
	  }
	}
