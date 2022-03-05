import java.util.*;
class binarysearch
{  

  public static void main(String args[])
  {  
        Scanner ob = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("how many elements");
        int n = ob.nextInt();
        System.out.println("enter the elements in the sorted order");
        for(int i=0;i<n;i++)
         {
            a[i]= ob.nextInt();
         }  
           System.out.println("enter the elements to be searched");
           int ele = ob.nextInt();
           
        bs(a,0,n-1,ele);     
 }  
  public static void bs(int arr[], int first, int last, int ele)
  {  
   int mid = (first + last)/2;  
   while( first <= last )
   {  
     if ( arr[mid] < ele )
      {  
        first = mid + 1;     
      }
     else if ( arr[mid] == ele )
     {  
        System.out.println("Element is found at index: " + mid);  
        break;  
      }
      else
      {  
         last = mid - 1;  
      }  
      mid = (first + last)/2;  
   }  
   if ( first > last ){  
      System.out.println("Element is not found!");  
   }  
 }  
 
}  
