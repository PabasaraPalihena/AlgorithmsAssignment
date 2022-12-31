import java.util.Scanner;

public class Main {
    public static Integer findsum(){

        int arr[] = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter the elements of the array one by one ");
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Output: "
                + findsum());

    }
}