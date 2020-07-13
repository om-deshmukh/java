import java.util.Scanner;
public class even{
    public static void main(String[] args){
        int a;
        int b;
        int c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = 3;
        c = 5;
        if(a%c==0){ // divisible by 5
            if(a%b==0){ // divisible by 3
                System.out.println("is divisible by both 3 & 5");
            }else{
                System.out.println("is divisible by only 5");
            }
        }else{
            if(a%b!=0){ //not divisible by 3
                System.out.println("is not divisible either 3 or 5");
            } else {
                System.out.println("is divisible by 3");
            }
        }  
    }
}