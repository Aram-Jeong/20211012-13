package co.micol.prj.member.serviceImpl;

import java.util.Scanner;

import co.micol.prj.comm.Command;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.service.MemberVO;

public class MemberUpdate implements Command {
	private Scanner sc = new Scanner(System.in);
	private MemberService memberService = new MemberServiceImpl();

	@Override
	public void execute() {
		MemberVO vo = new MemberVO();
		boolean b = false;
		while (!b) {
			System.out.println("===========================");
			System.out.println("변경할 회원의 아이디를 입력하세요.");
			System.out.println("===========================");
			vo.setId(sc.nextLine());
			// 회원 존재 여부 확인하기
			vo = memberService.memberSelect(vo);
			if (vo.getName() != null) {
				b = true;
			} else {
				System.out.println("존재하지 않는 아이디입니다.");
			}
		}

		System.out.println("새로운 이름을 입력하세요.");
		vo.setName(sc.nextLine());
		System.out.println("새로운 패스워드를 입력하세요.");
		vo.setPassword(sc.nextLine());
		System.out.println("새로운 연락처를 입력하세요.");
		vo.setTel(sc.nextLine());
		System.out.println("새로운 주소를 입력하세요.");
		vo.setAddress(sc.nextLine());
		System.out.println("새로운 권한을 입력하세요(ADMIN or USER)");
		vo.setAuthor(sc.nextLine());
		int n = memberService.memberUpdate(vo);
		if (n != 0) {
			System.out.println("정상적으로 수정되었습니다.");
		} else {
			System.out.println("데이터 변경에 실패하였습니다.");
		}
		System.out.println("Press Enter Key...");
		sc.nextLine();
	}
}