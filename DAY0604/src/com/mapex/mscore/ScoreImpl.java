package com.mapex.mscore;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

class MyComparator <T>implements Comparator<T>{

	@Override
	public int compare(T o1, T o2) {
	
		ScoreVO s1 = (ScoreVO)o1; 
		ScoreVO s2 = (ScoreVO)o2; 
			
		int n = s1.getTot()-s2.getTot();
		//1 오름차순/   -1 내림차순 / 0 같다 
		if(n>1) {
			return 1 ; // 오름차순
		}else if(n<1) {
			return -1 ;
		}else {
			return 0 ;
		}
		
	}
	
}





public class ScoreImpl implements Score {
	private Map<String,ScoreVO> map ;
	
	
	public ScoreImpl() {
		map = new HashMap<String,ScoreVO>();
	}
	
	
	@Override
	public int insert() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String hak ;
		System.out.print("\n학번 입력:");
		hak = br.readLine();
		
		if(map.containsKey(hak)) {
			System.out.println("이미 존재하는 학번입니다");
			return 0 ;
		}
		
		ScoreVO vo = new ScoreVO();
		vo.setHak(hak);
		
		System.out.print("이름 입력:");
		//String name = br.readLine();
		vo.setName(br.readLine());

		System.out.print("국어점수:");
		vo.setKor(Integer.parseInt(br.readLine()));
		
		System.out.print("영어점수:");
		vo.setEng(Integer.parseInt(br.readLine()));

		System.out.print("수학점수:");
		vo.setMat(Integer.parseInt(br.readLine()));

		map.put(hak, vo);//map에 추가
		
		return 1;
	}

	@Override
	public int update() throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String hak ;
		System.out.print("\n수정할 학번 입력:");
		hak = br.readLine();
		
		if(!map.containsKey(hak)) {
			System.out.println("존재하지 않는 학번입니다.");
			return 0 ;
		}
		
		ScoreVO vo = new ScoreVO();
		vo.setHak(hak);
		
		System.out.print("이름 입력:");
		//String name = br.readLine();
		vo.setName(br.readLine());

		System.out.print("국어점수:");
		vo.setKor(Integer.parseInt(br.readLine()));
		
		System.out.print("영어점수:");
		vo.setEng(Integer.parseInt(br.readLine()));

		System.out.print("수학점수:");
		vo.setMat(Integer.parseInt(br.readLine()));

		map.put(hak, vo);//map에 추가
		
		return 1;
	}
	
	
	
	
	

	@Override
	public void search() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		String name ;
		System.out.print("\n검색할 이름 입력:");
		name = br.readLine();
		
		Set<String> set = map.keySet();
		Iterator<String> it  = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			ScoreVO data = map.get(key);
			if(data.getName().equals(name))
				System.out.println(data.toString());
		}
		
	System.out.println();
	/*
	String hak;
	System.out.println("\n검색할 학번 입력:");
	hak = br.readLine();
	
	if(map.containsKey(hak)) {
		System.out.println(map.get(hak).toString());
	}
	*/
	
	}

	@Override
	public int delete() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String hak;
		System.out.print("\n 삭제할 학번:");
		 hak = br.readLine();
		 if(!map.containsKey(hak)) {
			 System.out.println("존재하지 않는 자료 입니다.");
			 return 0 ; 
		 }
		 map.remove(hak);
		 System.out.println("삭제가 완료되었습니다.");

		 return 1 ;
	}
		


	@Override
	public void writeAll() {
		Set<String>set = map.keySet();
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			ScoreVO data = map.get(key);
			System.out.println(data.toString());
		}
	}

	//객체와 객체 비교하여 같으면 0 / 작으면 -1 / 크면 +1
	@Override
	public void writeSort() {
		
		List<ScoreVO> lists = new ArrayList<>();
		Set<String> set = map.keySet();
		Iterator<String>it1 = set.iterator();
		while(it1.hasNext()) {
			String key =it1.next();
			lists.add(map.get(key));
		}
		
		//오름차순 정렬
		Collections.sort(lists,new MyComparator<ScoreVO>());
		
		
		//내림차순 정렬
		Collections.sort(lists,Collections.reverseOrder(new MyComparator<ScoreVO>()));
		System.out.println("\n[총점순 정렬]");
		Iterator<ScoreVO> it2 = lists.iterator();
		while(it2.hasNext()) {
			ScoreVO data = it2.next();
			System.out.println(data.toString());
		}	
	}
}
