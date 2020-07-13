import java.util.Scanner;
public class IF{
    public static void main(String[] args){
        int a;
        int b;
        int c;
        Scanner sc = new Scanner (System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println(a);
            }else{
                System.out.println(c);
            }
        }else{
            if(c>b){
            System.out.println(c);
            }else{
            System.out.println(b);
            }
        }      
    }   
}
 