package co.micol.prj.member.serviceImpl;

import java.util.Scanner;

import co.micol.prj.comm.Command;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.service.MemberVO;

public class MemberSelect implements Command {
	private Scanner sc = new Scanner(System.in);
	private MemberService memberService = new MemberServiceImpl();

	@Override
	public void execute() {
		MemberVO vo = new MemberVO();
		System.out.println("=========================");
		System.out.println("검색할 회원 아이디를 입력하세요.");
		System.out.println("=========================");
		vo.setId(sc.nextLine());
		vo = memberService.memberSelect(vo);
		vo.toString();
		System.out.println("====================");
		System.out.println("Enter를 누르세요...");
		sc.nextLine();

	}

}
