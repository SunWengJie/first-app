package Question100;

import java.util.Scanner;

//��ϰ��1:�����û������3������,�������ǵ����ֵ��Ϊ������
public class GetMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("�����������д�������û������3������,�������ǵ����ֵ��Ϊ������");
      System.out.println("�������һ������");
      int a =new Scanner(System.in).nextInt();
      System.out.println("��һ������"+a);
     
      System.out.println("������ڶ�������");
      int b =new Scanner(System.in).nextInt();
      System.out.println("��һ������"+b);
		
      System.out.println("���������������");
      int c =new Scanner(System.in).nextInt();
      System.out.println("��һ������"+c);
      
      int MAX=a>b?a:b;//���a>b���b ������b���a a��ֵ��MAX b�����ֵ��MAX
      
      MAX=MAX>c?MAX:c;//���Max>c ���MAX��ֵ��MAX cͬ��
      System.out.println("�����ֵ�ǣ�"+MAX);
		
	}

}
