package co.aram.prj.student.serviceImpl;

import java.util.Scanner;

import co.aram.prj.comm.Command;
import co.aram.prj.comm.GB;
import co.aram.prj.student.service.StudentService;
import co.aram.prj.student.service.StudentVO;

public class StudentInsert implements Command {
	private Scanner sc = new Scanner(System.in);
	private StudentService studentService = new StudentServiceImpl();

	@Override
	public void execute() {
		if (GB.AUHTOR.equals("ADMIN")) {
			StudentVO vo = new StudentVO();
			System.out.println("* * * 학생 등록 * * *");
			boolean b = false;
			while (!b) {
				System.out.println("아이디 입력 >>");
				vo.setId(sc.nextLine());
				vo = studentService.studentSelect(vo);
				if (vo.getName() != null) {
					System.out.println("이미 존재하는 아이디입니다.");
					vo = new StudentVO();
				} else {
					System.out.println("사용 가능한 아이디입니다.");
					b = true;
				}
				System.out.println("패스워드 입력 >>");
				vo.setPassword(sc.nextLine());
				System.out.println("이름 입력 >>");
				vo.setName(sc.nextLine());
				System.out.println("전공 입력 >>");
				vo.setMajor(sc.nextLine());
				System.out.println("권합 입력(ADMIN or USER) >>");
				vo.setAuthor(sc.nextLine());
				int n = studentService.studentInsert(vo);
				if (n != 0) {
					System.out.println("등록 완료!");
				} else {
					System.out.println("등록 실패...");
				}
				System.out.println("Press Enter Key");
				sc.nextLine();

			}

		} else {
			System.out.println("ADMIN 계정만 접근 가능");
		}
	}
}
