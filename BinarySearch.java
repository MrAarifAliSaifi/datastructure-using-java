public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key =9;
        int start = 0;
        int last = arr.length;
        int mid = (start + last) / 2;
        while (start<=last){
            if(arr[mid]==key){
                System.out.println("this element +"  +key+   "is available");
                break;
            } else if(key>arr[mid]) {
                start=mid+1;
            }
            else {
                last=mid-1;

            }
            mid=(start+last)/2;


        }


}}
