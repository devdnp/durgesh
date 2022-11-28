public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(getFactorial(n));
    }
    static int getFactorial(int m){
        int fact = 1;
        if(m==0 || m==1){
            return 1;
        } else if (m<0) {
            return -1;
        }
        else {
            for(int i=m; m>1; m--){
                fact = fact*(m-1);
            }
        }
    }
}