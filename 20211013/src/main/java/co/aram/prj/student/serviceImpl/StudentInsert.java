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
			System.out.println("* * * �л� ��� * * *");
			boolean b = false;
			while (!b) {
				System.out.println("���̵� �Է� >>");
				vo.setId(sc.nextLine());
				vo = studentService.studentSelect(vo);
				if (vo.getName() != null) {
					System.out.println("�̹� �����ϴ� ���̵��Դϴ�.");
					vo = new StudentVO();
				} else {
					System.out.println("��� ������ ���̵��Դϴ�.");
					b = true;
				}
				System.out.println("�н����� �Է� >>");
				vo.setPassword(sc.nextLine());
				System.out.println("�̸� �Է� >>");
				vo.setName(sc.nextLine());
				System.out.println("���� �Է� >>");
				vo.setMajor(sc.nextLine());
				System.out.println("���� �Է�(ADMIN or USER) >>");
				vo.setAuthor(sc.nextLine());
				int n = studentService.studentInsert(vo);
				if (n != 0) {
					System.out.println("��� �Ϸ�!");
				} else {
					System.out.println("��� ����...");
				}
				System.out.println("Press Enter Key");
				sc.nextLine();

			}

		} else {
			System.out.println("ADMIN ������ ���� ����");
		}
	}
}
