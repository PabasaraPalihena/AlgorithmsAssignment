import java.util.Arrays;

public class Sum {
    public static Integer find_total( Integer[] my_numbers ) {

        int sum =0;

        //calculate the summation
        for(int i=0;i<my_numbers.length;i++){
            if(my_numbers[i]%2 == 0){
                sum+=1;
            }else{
                if(my_numbers[i] == 5){
                    sum+=5;
                }else{
                    sum+=3;
                }
            }
        }
        return sum;
//        System.out.println("modified array :"+ Arrays.toString(my_numbers));
    }
    public static void main(String args[]){

        Integer my_numbers[] ={1,2,3,4,5};
        System.out.println("Input :"+ Arrays.toString(my_numbers));
        System.out.println("Output : "+find_total(my_numbers));
    }
}
