import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int x;

        Scanner input = new Scanner(System.in);
        System.out.print("enter a number: ");
        x = input.nextInt();

        for(int i=1; i<=x; i++){
            if((i%3 == 0 ) && (i%4 ==0)){
                System.out.print(i+ "\n");
            }
        }
    }
}
