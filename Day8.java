/*merge sort
import java.util.*;
public class Day8
{
    private static int[] merge(int[] a1,int[] a2)
    {
        int a1_size=a1.length;
        int a2_size=a2.length;
        int[] result=new int[a1_size+a2_size];
        int i=0,j=0,k=0;
        while(i<a1_size && j<a2_size)
        {
            if(a1[i]<=a2[j])
            {
                result[k++]=a1[i++];
            }
            else
            {
                result[k++]=a2[j++];
            }
        
        }
        while(i<a1_size)
        {
             result[k++]=a1[i++];
        }
        while(j<a2_size)
        {
            result[k++]=a2[j++];
        }
        return result;
    }
    public static void main(String args[])
    {
        int[] M={1,3,9},N={4,5,6,7,8};
        int[] sol=merge(M,N);
        for(int ele:sol)
        {
            System.out.print(ele+" ");
        }
    }
}*/
/*mergesort of the mid
import java.util.*;
class Day8
{
    public static int count_inversion(int[] arr, int low, int high)
    {
         int ans=0;
        if(low < high)
        {
           
            int mid = (low + high) / 2;
            ans+=count_inversion(arr, low, mid);
            ans+=count_inversion(arr, mid + 1, high);
            ans+=mergeSort(arr, low, mid, high);
        }
        return ans;
    }
    public static int mergeSort(int[] arr, int low , int mid, int high)
    {
        int size = high - low + 1;
        int[] dummy = new int[size];
        int i = low, j = mid + 1, k = 0,count=0;
        while(i <= mid && j <= high)
        {
            if(arr[i] <= arr[j])
            {
                dummy[k++] = arr[i++];
            }
            else
            {
                count+=(mid-i+1);
                dummy[k++] = arr[j++];
            }
        }
        while(i <= mid)
        {
            dummy[k++] = arr[i++];
        }
        while(j <= high)
        {
            dummy[k++] = arr[j++];
        }
        for(int ind = 0; ind < size; ind++)
        {
            arr[low + ind] = dummy[ind];
        }
        return count;
    }
    public static void main(String[] args)
    {
        int[] arr = {5,6,8,1,2,7};
        int sol=count_inversion(arr, 0, arr.length - 1);
        System.out.print(sol);
    
    }
}*/
/*quicksort
import java.util.*;
class Day8
{
    private static void partition(int[]arr,int pivot)
    {
        int low=0;
        int high=arr.length-1;
        while(low<high)
        {
            while(low<high && arr[low]<=pivot)
            {
                low++;
            }
            while(high>low && arr[high]>pivot)
            {
                high--;
            }
            if(low<high)
            {
                int safe=arr[low];
                arr[low]=arr[high];
                arr[high]=safe;
            }
        }
    }
    public static void main(String args[])
    {
        int[] arr={5,6,71,86,96,75,95,38,30,100};
        int pivot=54;
        partition(arr,pivot);
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
    }
}*/
/*quick sort
import java.util.*;
class Day8
{
    private static int partition(int[]arr,int lower,int upper)
    {
        int pivot=arr[lower],low=lower,high=upper;
        while(low<=high)
        {
            while(low<=upper && arr[low]<=pivot)
            {
                low++;
            }
            while(high>=lower && arr[high]>pivot)
            {
                high--;
            }
            if(low<high)
            {
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
            }
        }
        int temp=arr[high];
        arr[high]=arr[lower];
        arr[lower]=temp;
        return high;
    }
    public static void Quick_sort(int[] arr,int lower,int upper)
    {
        if(lower<upper)
        {
            int pivot=partition(arr,lower,upper);
            Quick_sort(arr,lower,pivot-1);
            Quick_sort(arr,pivot+1,upper);

        }
    }
    public static void main(String args[])
    {
        int[] arr={5,6,71,86,96,75,95,38,30,100};
        int pivot=54;
        Quick_sort(arr,0,arr.length-1);
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
    }
}*/
/*quick selection
class Day8
{
    private static int partition(int[]arr,int lower,int upper)
    {
        int pivot=arr[lower],low=lower,high=upper;
        while(low<=high)
        {
            while(low<=upper && arr[low]<=pivot)
            {
                low++;
            }
            while(high>=lower && arr[high]>pivot)
            {
                high--;
            }
            if(low<high)
            {
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
            }
        }
        int temp=arr[high];
        arr[high]=arr[lower];
        arr[lower]=temp;
        return high;
    }
    public static int Quick_select(int[] arr,int lower,int upper,int target)
    
    {
        if(lower<=upper)
        {
            int pivot=partition(arr,lower,upper);
            if(pivot==target)
            {
                return arr[pivot];
            }
            else if(target<pivot)
            {
               return  Quick_select(arr,lower,pivot-1,target);
            }
            else
            {
               return Quick_select(arr,pivot+1,upper,target);
            }

        }
        return -1;
    }
    public static void main(String args[])
    {
        int[] arr={5,6,71,86,96,75,95,38,30,100};
        int target=4;
        int sol=Quick_select(arr,0,arr.length-1,target-1);
        
            System.out.print(sol);
    }
}*/
/*import java.util.*;

class Day8 {

    private static void count(int[] arr) {
        int zero = 0;
        int one = 0;
        int two = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zero++;
            } else if (arr[i] == 1) {
                one++;
            } else if (arr[i] == 2) {
                two++;
            }
        }
        System.out.println("Count of 0s: " + zero);
        System.out.println("Count of 1s: " + one);
        System.out.println("Count of 2s: " + two);
    }

    public static void main(String args[]) {
        int[] arr = {0,1,2,2,1,0,1,2,0,0,2,1,1,2,0,1,0,2};
         count(arr);
    }
}*/
/*public class Day8 {
    private static void count(int[] arr){
        int freq0=0, freq1=0 ,freq2=0;
        for(int ind =0; ind <arr.length; ind++)
        {
            if(arr[ind]==0)
                freq0++;
            else if(arr[ind]==1)
                freq1++;
            else
                freq2++;
        }
        for(int ind = 0; ind < freq0 ; ind++){
            arr[ind] = 0;
        }
        for(int ind = freq0; ind < (freq1+freq1) ; ind++){
            arr[ind] = 1;
        }
        for(int ind = freq0+freq1; ind < (freq0+freq1+ freq2) ; ind++){
            arr[ind] = 2;
        }
    }
    public static void main(String[] args) {
        int[] arr= {0,1,2,2,1,0,1,2,0,0,2,1,1,2,0,1,0,2};
        count(arr);
        for(int num: arr){
            System.out.print(num+ " ");
        }
    }
}*/
/*ditch flag
public class Day8{
    private static void swap(int[] array, int first, int second){
        int safe = array[first];
        array[first] = array[second];
        array[second] = safe;
    }
    private static void count(int[] arr){
        int low=0,mid = 0, high = arr.length-1;
        while(mid<= high){
            if(arr[mid] == 0){
                swap(arr, low, mid);
                low++;
                mid++;
            }else if(arr[mid] == 1){
                mid ++;
            }else{
                swap(arr, mid, high);
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr= {0,1,2,2,1,0,1,2,0,0,2,1,1,2,0,1,0,2};
        count(arr);
        for(int num: arr){
            System.out.print(num+ " ");
        }
    }
}*/