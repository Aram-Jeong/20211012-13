package co.micol.prj.member.serviceImpl;

import java.util.Scanner;

import co.micol.prj.comm.Command;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.service.MemberVO;

public class MemberDelete implements Command {
	private Scanner sc = new Scanner(System.in);
	private MemberService memberService = new MemberServiceImpl();

	@Override
	public void execute() {
		MemberVO vo = new MemberVO();
		System.out.println("=========================");
		System.out.println("삭제할 회원 아이디를 입력하세요.");
		System.out.println("=========================");
		vo.setId(sc.nextLine());
		int n = memberService.memberDelete(vo);
		if (n != 0) {
			System.out.println("=====================");
			System.out.println("정상적으로 삭제되었습니다.");
			System.out.println("아무 키나 입력하세요...");
		} else {
			System.out.println("==================");
			System.out.println("삭제를 실패하였습니다.");
			System.out.println("아무 키나 입력하세요...");
		}
		sc.nextLine();

	}

}
