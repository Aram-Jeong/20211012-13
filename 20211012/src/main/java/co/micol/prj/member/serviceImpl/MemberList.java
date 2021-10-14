package co.micol.prj.member.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import co.micol.prj.board.service.BoardVO;
import co.micol.prj.comm.Command;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.service.MemberVO;

public class MemberList implements Command {
	private MemberService memberService = new MemberServiceImpl();

	@Override
	public void execute() {
		List<MemberVO> members = new ArrayList<MemberVO>();
		members = memberService.memberSelectList();

		System.out.println("====회원 목록======");
		for (MemberVO vo : members) {
			System.out.print(vo.getId() + ": ");
			System.out.print(vo.getName() + ": ");
			System.out.print(vo.getPassword() + ": ");
			System.out.print(vo.getTel() + ": ");
			System.out.println(vo.getAddress() + ": ");
			System.out.println(vo.getAuthor() + ": ");
			System.out.println("======================");

		}
	}
}
