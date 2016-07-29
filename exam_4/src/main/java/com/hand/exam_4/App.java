package com.hand.exam_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App{
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < 50; i++){
			int random =(int)(Math.random()*100);
			list.add(random);
		}
		
		System.out.print("随机生成 50 个小于 100 的数 , 分别为 :");
		for(int i = 0; i < list.size(); i++){
			if(i != list.size()-1){
				System.out.print(list.get(i)+",");
			}else{
				System.out.print(list.get(i));
			}
		}
		
		System.out.println();
		//List<Map<Integer, List<Integer>>> mapList = new ArrayList<Map<Integer, List<Integer>>>();)
		//Map<String,String>map = new HashMap<String,String>();
		
		Map<Integer, List<Integer>> map3 = new HashMap<Integer, List<Integer>>();
		
		//List<Map<Integer,Integer>> list2 = new ArrayList<Map<Integer, Integer>>();
		
		//Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		//得到map
		for(int i = 0; i < list.size(); i++){
			int num = list.get(i);
			int key = num/10;
		
			if(!map.containsKey(key)){
				map.put(key, list.get(i).toString());
			}else{
				String temp = map.get(key);
				temp = list.get(i).toString() + "," + temp;
				map.put(key, temp);
			}
		}
		
		
		
		Map<Integer, String> map2 = new HashMap<Integer, String>();
		
		Set<Integer> set = map.keySet();
		for(int i : set){
			String value = map.get(i);
			map2.put(i, value);
			value = ">["+ value+"]";
			map.put(i, value);
		}
		
		System.out.println("Map中的数据为 : "+map);
		
		//Map<Integer, String> map3
		for(int i : set){
			String value = map2.get(i);
			String[] split = value.split(",");
			int[] array = new int[split.length];
			for(int j=0; j < split.length; j++){
				array[j] = Integer.parseInt(split[j]);
			}
			
			List<Integer> list2 = new ArrayList<Integer>();
			int[] arr = bubbleSort(array);
			for(int z = 0; z < arr.length; z++){
				list2.add(arr[z]);
			}
			/*String res = null;
			for(int j = 0; j < arr.length; i++){
				if(j!= arr.length-1){
					res = res + arr[j]+",";
				}else{
					res = res + arr[j];
				}
				System.out.println(arr[j]);
				
			}*/
			
			map3.put(i, list2);
			/*https://github.com/angelHuan/JavaBaseExam*/
		}
		
		System.out.println("排序后的Map为: "+map3);
		
	}
	
	
	
	
	
	public static int[] bubbleSort(int [] arr){
		
		boolean needNextPass = true;
		for(int i = 1; i < arr.length && needNextPass; i ++){
			needNextPass = false;
			for(int j = 0; j < arr.length-i; j ++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
					needNextPass = true;
				}
			}
		}
		
		return arr;
	}
}
	

