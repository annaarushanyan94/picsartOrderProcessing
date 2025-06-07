package lessons;

public class Factor{
public static void main(String[] args) {
    System.out.println(fact(4));
    System.out.println(fib(5));
}
public static int fib (int n){
    if (n==1 || n==2)
        return 1;
    return fib(n-1) + fib((n-2));
}

public static int facR(int n) {
    if (n == 0 || n==1)
        return  1;
    return n*fact(n - 1);

}
    public static int fact(int n){
    int r =1;
        for (int i = 1; i <=n; i++) {
            r = r * i;
        }
        return r;

        }
    public  void  register (String login, String pass){

    }

    }
