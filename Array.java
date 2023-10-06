import java.util.Scanner;

public class Array {
   public static void main(String[] args) {
      int[] arrayObj= new int[10];
      int limit=0;
      Scanner scanner=new Scanner(System.in);
      System.out.println("Enter limit for fibonacci series");
      limit= scanner.nextInt();
      arrayObj[0]=1;
      arrayObj[1]=1;
      for(int i=2;i<limit;i++){
arrayObj[i]=arrayObj[i-1]+arrayObj[i-2];

      }
      for(int i=0;i<limit;i++){
         System.out.println(arrayObj[i]);
      }
      System.out.println("******");
      for(int i:arrayObj){
         System.out.println(i);
      }
    scanner.close();
   }
}
