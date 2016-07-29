package com.hand.exam_1;

import java.util.ArrayList;
import java.util.List;

public class App{
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 101; i <= 200; i++){
			for(int j=2; j < i; j++){
				if(i%j == 0){
					break;
				}
				
				else if(j==i-1){
					list.add(i);
				}
			}
		}
		
		System.out.print("101-200 间总共有 "+list.size()+"个素数。分别是：");
		for(int i = 0; i < list.size(); i++){
			if(i != list.size()-1){
				System.out.print(list.get(i)+",");
			}else{
				System.out.println(list.get(i));
			}
		};
	}
}