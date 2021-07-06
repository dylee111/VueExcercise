import java.util.*;

class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();
    int y = sc.nextInt();
    int arr[] = new int[x];

    for(int i = 0; i < x; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();

    for(int i = 0; i < x; i++) {
      if(x<arr[i]) {
        System.out.println(arr[i]+"");
      }
    }

  }
}
