package secondProblem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> array = new ArrayList<Employee>();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������ �̸�, �μ�, ���, ��å, ���� ������ �Է��Ͻÿ�.");
		
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
			System.out.println("�̸�: " + array.get(i).getName());
			System.out.println("�μ�: " + array.get(i).getDepartment());
			System.out.println("���: " + array.get(i).getId());
			System.out.println("��å: " + array.get(i).getPosition());
			System.out.println("���� ����: " + array.get(i).getScore());
		}
		
		System.out.println("=========================");
		System.out.print("���� �̸��̳� ��� �Է� >>");
		
		String input = scan.next();
		
		while (!input.equals("quit")) {
			for (int i = 0; i < array.size(); i++) {
				if (input.equals(array.get(i).getName())) {
					System.out.println(array.get(i).getName() + "�� ���� ����: " + array.get(i).getScore());
				}
				else if (input.equals(array.get(i).getId())) {
					System.out.println("�̸�: " + array.get(i).getName());
					System.out.println("�μ�: " + array.get(i).getDepartment());
					System.out.println("���: " + array.get(i).getId());
					System.out.println("��å: " + array.get(i).getPosition());
					System.out.println("���� ����: " + array.get(i).getScore());
				}
			}
			System.out.println("=========================");
			System.out.print("���� �̸��̳� ��� �Է� >>");
			
			input = scan.next();
		}
		
		scan.close();
	}

}
