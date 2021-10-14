package co.aram.prj.student.serviceImpl;

import java.util.Scanner;

import co.aram.prj.comm.Command;
import co.aram.prj.comm.GB;
import co.aram.prj.student.service.StudentService;
import co.aram.prj.student.service.StudentVO;

public class StudentUpdate implements Command {
	private Scanner sc = new Scanner(System.in);
	private StudentService studentService = new StudentServiceImpl();

	@Override
	public void execute() {
		StudentVO vo = new StudentVO();
			System.out.println("* * * ������������ * * *");
			vo.setName(GB.NAME);
			System.out.println("���ο� �н����带 �Է��ϼ���.");
			vo.setPassword(sc.nextLine());
			System.out.println("���ο� �̸��� �Է��ϼ���.");
			vo.setName(sc.nextLine());
			System.out.println("���ο� ������ �Է��ϼ���.");
			vo.setMajor(sc.nextLine());
			
			if(GB.AUHTOR.equals("ADMIN")) {
				System.out.println("���ο� ������ �Է��ϼ���.(ADMIN or USER)");
				vo.setAuthor(sc.nextLine());
			}
			
			int n = studentService.studentUpdate(vo);
			if(n != 0) {
				System.out.println("���� �Ϸ�!");
			}else {
				System.out.println("���� ����...");
			}
			System.out.println("Press Enter Key");
			sc.nextLine();
			}
		
		
	}


