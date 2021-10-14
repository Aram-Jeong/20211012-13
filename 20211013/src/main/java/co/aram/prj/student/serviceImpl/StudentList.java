package co.aram.prj.student.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import co.aram.prj.comm.Command;
import co.aram.prj.comm.GB;
import co.aram.prj.student.service.StudentService;
import co.aram.prj.student.service.StudentVO;

public class StudentList implements Command {
	private StudentService studentService = new StudentServiceImpl();

	@Override
	public void execute() {
		if (GB.AUHTOR.equals("ADMIN")) {
			StudentService studentDao = new StudentServiceImpl();

			List<StudentVO> students = new ArrayList<StudentVO>();
			students = studentDao.studentSelectList();

			if (students != null) {
				for (StudentVO student : students) {
					System.out.println("* * *  �л� ��� * * *");
					for (StudentVO vo : students) {
						System.out.print(vo.getId() + " | ");
						System.out.print(vo.getPassword() + " | ");
						System.out.print(vo.getName() + " | ");
						System.out.print(vo.getMajor() + " | ");
						System.out.println(vo.getAuthor());
						//System.out.println("* * * * * * * * * * *");
						
					}
					
					break;
				}

			} else {
				System.out.println("��ϵ� �л� ������ �����ϴ�.");

			}
		} else {
			System.out.println("ADMIN ������ ���� ����");
		}
	}
}
