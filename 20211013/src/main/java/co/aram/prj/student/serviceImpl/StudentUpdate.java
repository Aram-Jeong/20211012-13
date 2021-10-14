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
			System.out.println("* * * 본인정보수정 * * *");
			vo.setName(GB.NAME);
			System.out.println("새로운 패스워드를 입력하세요.");
			vo.setPassword(sc.nextLine());
			System.out.println("새로운 이름을 입력하세요.");
			vo.setName(sc.nextLine());
			System.out.println("새로운 전공을 입력하세요.");
			vo.setMajor(sc.nextLine());
			
			if(GB.AUHTOR.equals("ADMIN")) {
				System.out.println("새로운 권한을 입력하세요.(ADMIN or USER)");
				vo.setAuthor(sc.nextLine());
			}
			
			int n = studentService.studentUpdate(vo);
			if(n != 0) {
				System.out.println("수정 완료!");
			}else {
				System.out.println("수정 실패...");
			}
			System.out.println("Press Enter Key");
			sc.nextLine();
			}
		
		
	}


