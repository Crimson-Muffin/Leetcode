public class ReplaceElementswithGreatestElementonRightSide1299 {
    // Brute force approach
    public int[] replaceElements(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            int max = 0;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j] > max){
                    max = arr[j];
                }
            }
            arr[i] = max;
            if(i == arr.length-2){
                arr[arr.length-1] = -1;
            }
        }
        return arr;
    }

    // Optimal approach
    public int[] replaceElementsOptimal(int[] arr){
        int max = -1;
        for(int i = arr.length-1; i>=0; i--){
            int temp = arr[i];
            arr[i] = max;
            if(temp > max){
                max = temp;
            }
        }
        return arr;
    }
}
