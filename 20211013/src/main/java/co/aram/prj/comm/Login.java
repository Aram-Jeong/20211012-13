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
			System.out.println("* * * �� �� �� * * *");
			System.out.println("���̵� �Է� >>");
			student.setId(GB.sc.nextLine());
			System.out.println("��й�ȣ �Է� >>");
			student.setPassword(GB.sc.nextLine());

			student = studentDao.studentSelect(student);

			if (student != null) {
				GB.NAME = student.getName();
				GB.AUHTOR = student.getAuthor();
				b = true;
			} else {
				System.out.println("�α��� ����...");
				GB.sc.nextLine();
			}

		} while (!b);

	}
}
