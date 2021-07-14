import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int count = 0;
    String result = "";

    while(N==result) {
      int result = (parseInt((N%10)+((N/10)+(N%10))%10)); // 연산결과 끝자리
        if(N!==result) {
          count++;
        } else {
          break;
        }
    }
      System.out.println(count);
  }
}
