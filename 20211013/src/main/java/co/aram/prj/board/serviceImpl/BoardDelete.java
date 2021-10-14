package co.aram.prj.board.serviceImpl;

import java.util.Scanner;

import co.aram.prj.board.service.BoardService;
import co.aram.prj.board.service.BoardVO;
import co.aram.prj.comm.Command;
import co.aram.prj.comm.GB;

public class BoardDelete implements Command {
	private Scanner sc = new Scanner(System.in);
	private BoardService boardService = new BoardServiceImpl();

	@Override
	public void execute() {
		if (GB.AUHTOR.equals("ADMIN")) {
			BoardVO vo = new BoardVO();
			System.out.println("* * * * * * * * * *");
			System.out.println("삭제할 글 번호 입력 >>");
			vo.setBId(sc.nextInt());
			int n = boardService.boardDelete(vo);
			if (n != 0) {
				System.out.println("삭제 완료!");
			} else {
				System.out.println("삭제 실패...");
			}

		}else {
			System.out.println("ADMIN 계정만 접근 가능");
		}

	}
}
