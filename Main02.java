import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int count = 0;

    for(int i=B, j=C; i++, j++) {
      if(A+B > C) {
        count++;
      } else {
        System.out.println(count);
        break;
      }
    }
  }
}
