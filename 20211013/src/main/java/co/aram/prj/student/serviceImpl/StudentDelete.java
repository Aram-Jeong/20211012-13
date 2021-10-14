package co.aram.prj.student.serviceImpl;

import java.util.Scanner;

import co.aram.prj.comm.Command;
import co.aram.prj.comm.GB;
import co.aram.prj.student.service.StudentService;
import co.aram.prj.student.service.StudentVO;

public class StudentDelete implements Command {
	private Scanner sc = new Scanner(System.in);
	private StudentService studentService = new StudentServiceImpl();

	@Override
	public void execute() {
		if (GB.AUHTOR.equals("ADMIN")) {
			StudentVO vo = new StudentVO();
			System.out.println("* * * �л��������� * * *");
			System.out.println("�л� ���̵� �Է� >>");
			vo.setId(sc.nextLine());
			int n = studentService.studentDelete(vo);
			if (n != 0) {

				System.out.println("���� �Ϸ�!");
				System.out.println("Press Enter key");
			} else {
				System.out.println("���� ����...");
				System.out.println("Press Enter key");
			}
			sc.nextLine();
		} else {
			System.out.println("ADMIN ������ ���� ����");

		}
	}

}
