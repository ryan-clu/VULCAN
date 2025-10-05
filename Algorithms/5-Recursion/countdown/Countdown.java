
public class Countdown {
  
  public static void countdown(int num){
    if (num == 0) {
      System.out.println(0);
      return;
    }
    System.out.println(num);
    countdown(num - 1);
  }
  
  public static void main (String[] args){
    countdown(10);
  }
}
