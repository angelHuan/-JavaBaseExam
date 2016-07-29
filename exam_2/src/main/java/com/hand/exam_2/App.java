package com.hand.exam_2;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.print("请输入工资 :");
		int a = cin.nextInt();
		
		int b = a-3500;
		double tax = 0;
		if(b<0){
			tax = 0;
		}else
		if(b>=0 && b<=1500){
			tax = b*0.03;
		}else if(b>1500 && b <= 4500){
			tax = (b-1500)*0.1 + 1500 * 0.03;
		}else if(b>4500 && b<=9000){
			tax = (b-4500)*0.2 + 1500 * 0.03 + 3000*0.1;
		}else if(b>9000 && b<=35000){
			tax = (b-9000)*0.25 + 4500*0.2 + 3000*0.1 + 1500*0.03;
		}else if(b>35000 && b<=55000){
			tax =(b-35000)*0.3 + 26000*0.25 + 4500*0.2 + 3000*0.1 + 1500*0.03;
		}else if(b>55000 && b<80000){
			tax =(b-55000)*0.35 + 20000*0.3 + 26000*0.25 + 4500*0.2 + 3000*0.1 + 1500*0.03;
		}else{
			tax=(b-80000)*0.45 + 25000*0.35 + 20000*0.3 + 26000*0.25 + 4500*0.2 + 3000*0.1 + 1500*0.03;
		}
		
		System.out.println("所需要缴纳的税费为 :"+ tax);
	}
}
