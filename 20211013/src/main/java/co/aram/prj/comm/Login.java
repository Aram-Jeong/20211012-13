package co.aram.prj.comm;

import java.util.Scanner;

import co.aram.prj.student.service.StudentService;
import co.aram.prj.student.service.StudentVO;
import co.aram.prj.student.serviceImpl.StudentServiceImpl;

public class Login {
	public void run() {
		boolean b = false;
		StudentService studentDao = new StudentServiceImpl();
		StudentVO student;

		do {
			student = new StudentVO();
			System.out.println("* * * 로 그 인 * * *");
			System.out.println("아이디 입력 >>");
			student.setId(GB.sc.nextLine());
			System.out.println("비밀번호 입력 >>");
			student.setPassword(GB.sc.nextLine());

			student = studentDao.studentSelect(student);

			if (student != null) {
				GB.NAME = student.getName();
				GB.AUHTOR = student.getAuthor();
				b = true;
			} else {
				System.out.println("로그인 실패...");
				GB.sc.nextLine();
			}

		} while (!b);

	}
}
