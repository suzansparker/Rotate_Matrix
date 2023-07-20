import java.util.*;

public class Rotate_Matrix {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                arr[i][j]=sc.nextInt();
            }
        }

        rotates(arr,n);
        reverse(arr, n);
        for(int[] value : arr) {
            System.out.println(Arrays.toString(value));
        }

    }
    public static void rotates(int arr[][],int n){
        int temp=0;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {

                temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;

            }
        }

    }
    public static void reverse(int[][] arr1, int n){
        int size=arr1.length;
        int size1=arr1[0].length-1;

        for(int x=0;x<size;x++) {
            int i=0;
            int j=size1;
            while(i<j) {
                int temp=arr1[x][i];
                arr1[x][i]=arr1[x][j];
                arr1[x][j]=temp;
                i++;
                j--;
            }}}
}