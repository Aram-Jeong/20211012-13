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
				System.out.println("프로그램을 종료합니다.");
				GB.sc.close();
				return;
			default:
				System.out.println("잘못된 키를 입력하였습니다.");
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
				System.out.println("메뉴화면으로 돌아갑니다.");
				b = true;
				break;
			default:
				System.out.println("잘못된 키를 입력하였습니다.");
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
				System.out.println("메뉴화면으로 돌아갑니다.");
				b = true;
				break;
			default:
				System.out.println("잘못된 키를 입력하였습니다.");
			}
		} while (!b);

	}

	private void mainMenu() {
		
		System.out.println("* * * 1. 공지 관리 * * *");
		System.out.println("* * * 2. 학생 관리 * * *");
		System.out.println("* * * 3. 메뉴 종료 * * *");
		System.out.println("메뉴 번호 입력 >>");
	}

	private void boardTitle() {
		System.out.println("* * 1. 공지사항 목록 * *");
		System.out.println("* * 2. 공지사항 조회 * *");
		System.out.println("* * 3. 공지사항 등록 * *");
		System.out.println("* * 4. 공지사항 수정 * *");
		System.out.println("* * 5. 공지사항 삭제 * *");
		System.out.println("* * 6. 메인메뉴 이동 * *");
		System.out.println("메뉴 번호 입력 >>");
	}

	private void studentTitle() {
		System.out.println("* * 1. 학생 목록 * *");
		System.out.println("* * 2. 학생 조회 * *");
		System.out.println("* * 3. 학생 등록 * *");
		System.out.println("* * 4. 학생 수정 * *");
		System.out.println("* * 5. 학생 삭제 * *");
		System.out.println("* * 6. 메인 이동 * *");
		System.out.println("메뉴 번호 입력 >>");
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
