package Notes.jan132026;

public class BinarySearch {
    public static void main(String[] args){

        int[] arr = {10, 14, 17, 19, 22, 33, 65, 72, 88, 91};

        bubbleSort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println(binSearch(arr,17));
    }

    // simple swap sort method
    public static void bubbleSort(int[] a){
        for(int i = 0; i < a.length-1; i++){
            for(int j = 0; j < a.length-i-1; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }

    public static boolean binSearch(int[] a, int target){
        int lo = 0, hi = a.length -1, mid = 0;

        while(lo <= hi){
            mid = (lo+hi) / 2;

            if(a[mid] == target){
                return true;
            }else if(a[mid] < target) {
                lo = mid+1;
            }else{
                hi = mid-1;
            }
        }
        return false;
    }
}
