import java.util.*;

// An exploration of basic input and output.
class BasicIO {

   // Reads and processes string input.
   public static void main(String[] args) {

      Scanner stdin = new Scanner(System.in);

      // get first input
      System.out.print("Enter your name: ");
     
      String name = stdin.nextLine();
      
      // display output on console
      System.out.println("your name is " + name);
     
      System.out.print("Enter your age: ");
      int years = stdin.nextInt();
      System.out.println("your age is "+ years);
      System.out.println("나이를 날짜수로 변환하여 보여주는 문 : "+years*365);
      System.out.print("Enter your height: ");
      int height = stdin.nextInt();
      System.out.println("your height is "+height);
      System.out.printf("%d년 %d%d월 %d%d일 현재 %s(%d)의 키는 %d cm 입니다. ", 2020,0,9,0,6, name, years, height);
      stdin.close();
   }  // method main

}  // class BasicIO
