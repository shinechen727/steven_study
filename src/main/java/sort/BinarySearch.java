package sort;

public class BinarySearch {

    public static void main(String[] args){
        int a=101;
        int[] arr= {1,3,4,10,50,100};
        boolean flag = ifExistedKey(arr,a);
        System.out.println(flag);
    }

    private static boolean ifExistedKey(int[] arr, int i) {
        int begin=0;
        int end =arr.length-1;
        while(begin <= end){
            int m =(begin+end)/2;
            if(i < arr[m]){
                end = m-1;
            }else if(i > arr[m]){
                begin = m+1;
            }else{
                return true;
            }

        }
        return  false;
    }


}
