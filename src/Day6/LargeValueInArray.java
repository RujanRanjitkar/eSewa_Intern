package Day6;

public class LargeValueInArray {
    public static void main(String[] args) {
        int arr[]={10,20,40,15,30,9};
        int value=arr[0];
        for (int i=1; i<arr.length;i++){
            if(value<arr[i]){
                value=arr[i];
            }
        }
        System.out.println(value);
    }
}
