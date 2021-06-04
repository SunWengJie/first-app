package Question100;

import java.util.Scanner;

//练习题1:接收用户输入的3个整数,并将它们的最大值作为结果输出
public class GetMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("这个方法用来写：接收用户输入的3个整数,并将它们的最大值作为结果输出");
      System.out.println("请输入第一个数：");
      int a =new Scanner(System.in).nextInt();
      System.out.println("第一个数是"+a);
     
      System.out.println("请输入第二个数：");
      int b =new Scanner(System.in).nextInt();
      System.out.println("第一个数是"+b);
		
      System.out.println("请输入第三个数：");
      int c =new Scanner(System.in).nextInt();
      System.out.println("第一个数是"+c);
      
      int MAX=a>b?a:b;//如果a>b输出b 不大于b输出a a赋值给MAX b输出赋值给MAX
      
      MAX=MAX>c?MAX:c;//如果Max>c 输出MAX赋值给MAX c同理
      System.out.println("最大数值是："+MAX);
		
	}

}
