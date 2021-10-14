package co.micol.prj.board.serviceImpl;

import java.util.Scanner;

import co.micol.prj.board.service.BoardService;
import co.micol.prj.board.service.BoardVO;
import co.micol.prj.comm.Command;

public class BoardDelete implements Command {
	private Scanner sc = new Scanner(System.in);
	private BoardService boardService = new BoardServiceImpl();
	

	@Override
	public void execute() {
		BoardVO vo=new BoardVO();
		System.out.println("======================");
		System.out.println("삭제할 글 번호를 입력하세요.");
		vo.setBId(sc.nextInt());
		int n = boardService.boardDelete(vo);
		if(n != 0) {
			System.out.println("정상적으로 삭제되었습니다.");
		}else {
			System.out.println("게시글 삭제에 실패하였습니다.");
		}
	}

}
