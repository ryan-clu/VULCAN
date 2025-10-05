
public class Factorial {
  public static long factorial(long num){
    if (num == 0){
      return 1;
    }
    return num * factorial(num - 1);
  }
  public static void main(String[] args){
    System.out.println(factorial(6));
    System.out.println(factorial(18));
    System.out.println(factorial(13));
    System.out.println(factorial(0));
  }
}
