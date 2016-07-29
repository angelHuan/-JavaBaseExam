package com.hand.exam_3;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.print("请输入日期  :");
		String date = cin.next();
		
		//总天数
		int total = 0;
		
		
		String[] strs = date.split("-");
		int[] days = {31,0,31,30,31,30,31,31,30,31,30,31};
		
		//判断是否为闰年
		int year = Integer.parseInt(strs[0]);
		if((year%4 != 0) || (year%100==0 && year%400!=0)){
			days[1]=28;
		}else{
			days[1]=29;
		}
		
		int month = Integer.parseInt(strs[1]);
		for(int i = 0; i < month-1; i++){
			total += days[i];
		}
		
		int day = Integer.parseInt(strs[2]);
		total += day;
		
		
		System.out.println("你输入的日期为当年的第 "+total +"天");
	}
}
