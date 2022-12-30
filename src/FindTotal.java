import java.util.Arrays;
import java.util.Scanner;

public class FindTotal {
    public static void main (String args[]){

    System.out.println("Enter the required size of the array :: ");
    Scanner s = new Scanner(System.in);
    int size = s.nextInt();
    int myArray[] = new int [size];
    int sum = 0;
    System.out.println("Enter the elements of the array one by one ");

        for(int i=0;i<myArray.length;i++){
            myArray[i] = s.nextInt();
//            sum+=myArray[i];
        }
        System.out.println("Input: "+ Arrays.toString(myArray));
        //modify the according to the given rules
        for(int i=0;i<myArray.length;i++){
            //even num
            if(myArray[i]%2 == 0){
                myArray[i]+=1;
            } else{
                if(myArray[i] == 5){
                    myArray[i]+=5;
                }else{
                    myArray[i]+=3;
                }
            }
        }
        System.out.println("modified array :"+Arrays.toString(myArray));
        //calculate the summation of the modified array
        for(int i=0;i<myArray.length;i++){
            sum+=myArray[i];
        }
        System.out.println("Output :"+sum);
}}

