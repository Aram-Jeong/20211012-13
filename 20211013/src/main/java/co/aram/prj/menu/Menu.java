package co.aram.prj.menu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import co.aram.prj.board.serviceImpl.BoardDelete;
import co.aram.prj.board.serviceImpl.BoardInsert;
import co.aram.prj.board.serviceImpl.BoardList;
import co.aram.prj.board.serviceImpl.BoardSelect;
import co.aram.prj.board.serviceImpl.BoardUpdate;
import co.aram.prj.comm.Command;
import co.aram.prj.comm.GB;
import co.aram.prj.comm.Login;
import co.aram.prj.student.serviceImpl.StudentDelete;
import co.aram.prj.student.serviceImpl.StudentInsert;
import co.aram.prj.student.serviceImpl.StudentList;
import co.aram.prj.student.serviceImpl.StudentSelect;
import co.aram.prj.student.serviceImpl.StudentUpdate;

public class Menu {
	private Scanner sc = new Scanner(System.in);
	private Map<String, Command> map = new HashMap<String, Command>();

	public Menu() {
		map.put("boardList", new BoardList());
		map.put("boardSelect", new BoardSelect());
		map.put("boardInsert", new BoardInsert());
		map.put("boardUpdate", new BoardUpdate());
		map.put("boardDelete", new BoardDelete());
		map.put("studentList", new StudentList());
		map.put("studentSelect", new StudentSelect());
		map.put("studentInsert", new StudentInsert());
		map.put("studentUpdate", new StudentUpdate());
		map.put("studentDelete", new StudentDelete());

	}

	private void menu() {
		while (true) {
			mainMenu();
			int jobNo = GB.sc.nextInt();
			switch (jobNo) {
			case 1:
				boardManagement();
				break;
			case 2:
				studentManagement();
				break;
			case 3:
				System.out.println("���α׷��� �����մϴ�.");
				GB.sc.close();
				return;
			default:
				System.out.println("�߸��� Ű�� �Է��Ͽ����ϴ�.");
			}
		}
	}

	private void boardManagement() {
		boolean b = false;
		do {
			boardTitle();
			int jobNo = GB.sc.nextInt();
			switch (jobNo) {
			case 1:
				executeRun("boardList");
				break;
			case 2:
				executeRun("boardSelect");
				break;
			case 3:
				executeRun("boardInsert");
				break;
			case 4:
				executeRun("boardUpdate");
				break;
			case 5:
				executeRun("boardDelete");
				break;
			case 6:
				System.out.println("�޴�ȭ������ ���ư��ϴ�.");
				b = true;
				break;
			default:
				System.out.println("�߸��� Ű�� �Է��Ͽ����ϴ�.");
			}
		} while (!b);
	}

	private void studentManagement() {
		boolean b = false;
		do {
			studentTitle();
			int jobNo = GB.sc.nextInt();
			switch (jobNo) {
			case 1:
				executeRun("studentList");
				break;
			case 2:
				executeRun("studentSelect");
				break;
			case 3:
				executeRun("studentInsert");
				break;
			case 4:
				executeRun("studentUpdate");
				break;
			case 5:
				executeRun("studentDelete");
				break;
			case 6:
				System.out.println("�޴�ȭ������ ���ư��ϴ�.");
				b = true;
				break;
			default:
				System.out.println("�߸��� Ű�� �Է��Ͽ����ϴ�.");
			}
		} while (!b);

	}

	private void mainMenu() {
		
		System.out.println("* * * 1. ���� ���� * * *");
		System.out.println("* * * 2. �л� ���� * * *");
		System.out.println("* * * 3. �޴� ���� * * *");
		System.out.println("�޴� ��ȣ �Է� >>");
	}

	private void boardTitle() {
		System.out.println("* * 1. �������� ��� * *");
		System.out.println("* * 2. �������� ��ȸ * *");
		System.out.println("* * 3. �������� ��� * *");
		System.out.println("* * 4. �������� ���� * *");
		System.out.println("* * 5. �������� ���� * *");
		System.out.println("* * 6. ���θ޴� �̵� * *");
		System.out.println("�޴� ��ȣ �Է� >>");
	}

	private void studentTitle() {
		System.out.println("* * 1. �л� ��� * *");
		System.out.println("* * 2. �л� ��ȸ * *");
		System.out.println("* * 3. �л� ��� * *");
		System.out.println("* * 4. �л� ���� * *");
		System.out.println("* * 5. �л� ���� * *");
		System.out.println("* * 6. ���� �̵� * *");
		System.out.println("�޴� ��ȣ �Է� >>");
	}
	
	private void executeRun(String str) {
		Command command = map.get(str);
		command.execute();
	}
	public void run() {
		Login login = new Login();
		login.run();
		menu();
		
	}
}
