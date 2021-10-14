package co.micol.prj.member.serviceImpl;

import co.micol.prj.comm.Command;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.service.MemberVO;

public class MemberLogin implements Command {

	@Override
	public void execute() {
		MemberService memberService = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		vo.setId("aram");
		vo.setPassword("1234");
		
		vo = memberService.loginCheck(vo);
		System.out.println(vo.getName() + ": " + vo.getAuthor());
		System.out.println(vo.getId() + ": " + vo.getPassword());

	}

}

