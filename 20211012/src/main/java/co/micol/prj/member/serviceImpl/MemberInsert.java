package co.micol.prj.member.serviceImpl;

import java.util.Scanner;

import co.micol.prj.comm.Command;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.service.MemberVO;

public class MemberInsert implements Command {
	private Scanner sc = new Scanner(System.in);
	private MemberService memberService = new MemberServiceImpl();

	@Override
	public void execute() {
		MemberVO vo = new MemberVO();
		System.out.println("=========================");
		System.out.println("회원정보를 등록하는 메뉴입니다.");
		System.out.println("=========================");
		boolean b = false;
		while (!b) {
			System.out.println("아이디를 입력하세요.");
			vo.setId(sc.nextLine());
			vo = memberService.memberSelect(vo);
			if (vo.getName() != null) {
				System.out.println("이미 존재하는 아이디입니다.");
				vo = new MemberVO();
			} else {
				System.out.println("사용 가능한 아이디입니다.");
				b = true;

			}

		}
		System.out.println("이름을 입력하세요.");
		vo.setName(sc.nextLine());
		System.out.println("패스워드를 입력하세요.");
		vo.setPassword(sc.nextLine());
		System.out.println("연락처를 입력하세요.");
		vo.setTel(sc.nextLine());
		System.out.println("주소를 입력하세요.");
		vo.setAddress(sc.nextLine());
		System.out.println("권한을 입력하세요(ADMIN or USER)");
		vo.setAuthor(sc.nextLine());
		int n = memberService.memberInsert(vo);
		if (n != 0) {
			System.out.println("정상적으로 등록되었습니다.");
		} else {
			System.out.println("등록에 실패하였습니다.");
		}
		System.out.println("Press Enter Key...");
		sc.nextLine();
	}
}
