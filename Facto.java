import java.util.Scanner;

public class Facto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getFact(n));
    }
    static int getFact(int f){
        int fact = 1;
        if (f==0)
            return fact;
        else if (f<0) {
            return -1;
        }
        else {
            for (int i=1; i<=m; i++){
                fact = fact*i;
            }
        }
    }
}