import java.util.Scanner;
public class PrimeCheck {
    public static void main(String args[]){

        int num;
        System.out.println("Enter any number to check : ");
        Scanner obj = new Scanner(System.in);
        num = obj.nextInt();
        obj.close();
        boolean flag = false;
        for(int i=0;i<=num;i++){
            if(num%i==0){
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a prime number");
        }
    }
}