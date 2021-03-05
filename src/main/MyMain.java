package main;

public class MyMain {
    public static void main(String[] args) {
        System.out.println(factorial(20));
        System.out.println(Long.MAX_VALUE + "<--");
    }
    public static long factorial(int n){
        if(n < 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
    public int mul(int a, int b){
        if(b == 1){
            return a;
        }
        else {
            return a + mul(a,b-1);
        }
    }
}
