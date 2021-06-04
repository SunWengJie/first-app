package Question100;

import java.util.Arrays;
import java.util.Scanner;

//
//练习题3: 手机选号:根据用户输入的手机号来确认用户实际支付的价格
//如果尾数为8，需支付办卡费50元
//如果尾数为4，需支付办卡费用0元
//如果是其他尾号,需支付办卡费用20元
//
//import java.util.Arrays;
//import java.util.Scanner;
// 
//public class ArrayDemo {
//    public static void main(String[] args) {
//        int len = 10;//数组的元素个数
//        int[] ary = new int[len];//定义数组
//        Scanner sc = new Scanner(System.in);//得到一个扫描器,用于读取控制台输入
//        for (int i = 0; i < ary.length; i++) {//循环
//            System.out.print("请输入数组第"+(i+1)+"个整数:");
//            ary[i] = sc.nextInt();//把输入的值存到数组里
//        }
//        System.out.println(Arrays.toString(ary));//打印数组
//    }
//}

//-------------------------------------------------------------------
//java怎么读取数组中的最后一个数
//int[] arr = {1,2,3,4,5};
//int next = arr[arr.length-1];
//System.out.println("最后一个为：" + next);


public class PayCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stubC
		System.out.println("请输入11位电话号码：");
		int Arrys1=11;//数组的元素个数
		int[]NewArry=new int [Arrys1];//定义新数组NewArry数组内11个数
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<NewArry.length;i++) {//遍历
			System.out.println("请输入数组第"+(i+1)+"个整数:");
			NewArry[i]=sc.nextInt();//将输入的数值存在数组中
		}
	
		System.out.println("电话号码是："+Arrays.toString(NewArry));
		
		int NewArry1=NewArry[NewArry.length-1];//获取数组的最后一位 放在NewArry2中
		System.out.println("电话号的最后一位是："+NewArry1);
			if(NewArry1==8) {
				System.out.println("需支付办卡费50元"); 
			}else if(NewArry1==4) {
				System.out.println("需支付办卡费用0元");
			}else if (NewArry1!=4&&NewArry1!=8) {
				System.out.println("需支付办卡费用20元");
			}
	}

}
