package create;

public class BinarySearch {
	public static  void main(String[] args)
    {
        int[] arr = {13,6,58,19,1};
        int key = 12;
        int arrlength = arr.length;
        binarySearch(arr,0,key,arrlength);
    }

public static void binarySearch(int[] arr, int start, int key, int length)
{
        int centerValue = (start+length)/2;
        while(start<=length)
        {

            if(arr[centerValue]<key)
            {
                start = centerValue + 1;
            } 
            else if(arr[centerValue]==key)
            {
                System.out.println("Element is found at index :"+centerValue);
                break;
            }
            else 
            {
                length=centerValue-1;
            }
            centerValue = (start+length)/2;
        }
            if(start>length)
            {

                System.out.println("Element is not found");
            }
}
}


