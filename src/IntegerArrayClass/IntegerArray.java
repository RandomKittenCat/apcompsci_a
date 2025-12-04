package IntegerArrayClass;

public class IntegerArray {
    private int[] arr;
    private int[] secondarr;

    public IntegerArray(){
        arr = new int[0];
    }

    public IntegerArray(int len){
        arr = new int[len];
    }

    public IntegerArray(int[] a){
        arr = new int[a.length];
        for (int i = 0; i < arr.length; i++){
            arr[i] = a[i];
        }
    }

    public void fillArray(int min, int max){
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)((max-min+1) * Math.random()) + min;
        }
    }

    public String toString(){
        String result = "";
        for(int a : arr){
            result+=(a + " ");
        }
        return result;
    }

    public int indexOf(int key){
        int index = 0;
        for (int a : arr){
            if(a == key){
                return index;
            }
            index++;
        }
        return -1;
    }

    public boolean isDecreasing(int index){
        for (int i = index; i < arr.length - 1; i++){
            if (arr[i+1] > arr[i]){
                return false;
            }
        }
        return true;
    }

    public boolean isIncreasing(int index){
        for (int i = 0; i < index; i++){
            if (arr[i+1] < arr[i]){
                return false;
            }
        }
        return true;
    }

    public boolean isPeak(int index){
        if(index == 0 || index == arr.length-1){
            return false;
        }
        if (arr[index] < arr[index-1] || arr[index] < arr[index+1]){
            return false;
        }
        return true;
    }

    public boolean isDiverse(){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    return false;
                }
            }
        }
        return true;
    }

    public void append(int value){
        secondarr = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++){
            secondarr[i] = arr[i];
        }
        secondarr[secondarr.length-1] = value;
        arr=secondarr;
    }
}