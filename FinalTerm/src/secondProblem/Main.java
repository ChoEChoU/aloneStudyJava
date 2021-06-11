package secondProblem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> array = new ArrayList<Employee>();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("직원의 이름, 부서, 사번, 직책, 업무 성적을 입력하시오.");
		
		for (int i = 0; i < 1; i++) {
			System.out.print(">> ");
			String name = scan.next();
			String department = scan.next();
			String id = scan.next();
			String position = scan.next();
			int score = scan.nextInt();
			
			Employee employee = new Employee(name, department, id, position, score);
			
			array.add(employee);
		}
		
		for (int i = 0; i < array.size(); i++) {
			System.out.println("=========================");
			System.out.println("이름: " + array.get(i).getName());
			System.out.println("부서: " + array.get(i).getDepartment());
			System.out.println("사번: " + array.get(i).getId());
			System.out.println("직책: " + array.get(i).getPosition());
			System.out.println("업무 성적: " + array.get(i).getScore());
		}
		
		scan.close();
	}

}
