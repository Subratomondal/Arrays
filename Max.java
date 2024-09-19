public class Max {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        System.out.print(max(arr));

    }

    static int max(int[] arr){
        int maxVal=arr[0];
        for(int i=0; i<arr.length;i++){
            if(maxVal<arr[i]){
                maxVal=arr[i];
            }
        
        }
        return maxVal;
    }
    
}
