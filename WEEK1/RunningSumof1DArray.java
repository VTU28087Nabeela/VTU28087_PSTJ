public class RunningSumof1DArray {
    public int[] runningSum(int[] arr) {
        int n = arr.length;
        for (int i =1; i<n;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        return arr;
    }
}
