package curriculum1_27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		System.out.println("コンソールに文字を入力してください");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		List<String> list1 = new ArrayList<>();
		String input = "ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50";
		
		//文字列imputを「,」で分割し、配列animalsに格納
		String[] animals = input.split(",");
		Collections.addAll(list1,animals);
		for(String animal:animals) {
			System.out.println(animal);
		}
		
		animal data = new animal();
		
		String n = 
		
		
		data.setName(n);
		
		
	}
}