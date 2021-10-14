package co.aram.prj.student.serviceImpl;

import java.util.Scanner;

import co.aram.prj.comm.Command;
import co.aram.prj.comm.GB;
import co.aram.prj.student.service.StudentService;
import co.aram.prj.student.service.StudentVO;

public class StudentSelect implements Command {
	private Scanner sc = new Scanner(System.in);
	private StudentService studentService = new StudentServiceImpl();

	@Override
	public void execute() {
		if (GB.AUHTOR.equals("ADMIN")) {
			StudentVO vo = new StudentVO();
			System.out.println("* * * 학생 검색 * * *");
			System.out.println("학생 아이디 입력 >>");
			vo.setId(sc.nextLine());
			vo = studentService.studentSelect(vo);
			vo.toString();
			System.out.println("Press Enter Key");
			sc.nextLine();

		} else {
			System.out.println("ADMIN 계정만 접근 가능");
		}

	}
}
