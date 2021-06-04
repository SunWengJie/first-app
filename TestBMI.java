package Question100;

import java.util.Scanner;

//练习题2: BMI 指数测试 BMI = 体重 (kg) / 身高² (m)
//接收用户输入的身高和体重,将判断结果输出
//过轻：低于18.5
//正常：18.5 ~ 22.9
//偏胖：23 ~ 24.9
//肥胖：25 ~ 29.9
//重度肥胖：高于30
//极度肥胖：高于40
public class TestBMI {

	private static final double BMI = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("BMI 指数测试:接收用户输入的身高和体重,将判断结果输出");
				for(int i=0;i<6;i++) {
					if(i==5) {
						System.out.println("超出输入次数请退出");
						break;
					}
						System.out.println("输入的身高cm");
						double high =new Scanner(System.in).nextInt();
						System.out.println("你的身高是cm："+high);
						System.out.println("输入的体重（kg）");
						double weight =new Scanner(System.in).nextInt();
						System.out.println("你的体重（kg）是："+weight);
						
					if((high<=100)||(weight<=30)) {
						System.out.println("输入错误重新输入！");
						continue;
					}
					
						double BMI=weight/high*high;
						if( BMI<=18.5)
							System.out.println("过轻：低于18.5");
						else if((BMI<=18.5)||BMI<22.9)
							System.out.println("正常：18.5 ~ 22.9");
						else if(BMI<=24.9)
							System.out.println("偏胖：23 ~ 24.9");
						else if(BMI<=29.9)
							System.out.println("肥胖：25 ~ 29.9");
						else if(BMI>30)
							System.out.println("重度肥胖：高于30");
						else if(BMI>40)
							System.out.println("极度肥胖：高于40");
						
						break;
				}
				
				
	}
}
