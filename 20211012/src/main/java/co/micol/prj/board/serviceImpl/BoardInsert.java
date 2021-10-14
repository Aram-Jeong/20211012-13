package co.micol.prj.board.serviceImpl;

import java.util.Scanner;

import co.micol.prj.board.service.BoardService;
import co.micol.prj.board.service.BoardVO;
import co.micol.prj.comm.Command;

public class BoardInsert implements Command {
	private Scanner sc = new Scanner(System.in);
	private BoardService boardService = new BoardServiceImpl();

	@Override
	public void execute() {
		BoardVO vo = new BoardVO();
		System.out.println("=================");
		System.out.println("작성자를 입력하세요.");
		vo.setBWriter(sc.nextLine());
		System.out.println("제목을 입력하세요.");
		vo.setBTitle(sc.nextLine());
		System.out.println("내용을 입력하세요.");
		vo.setBContents(sc.nextLine());
		int n = boardService.boardInsert(vo);
		if (n != 0) {
			System.out.println("정상적으로 등록되었습니다.");
		} else {
			System.out.println("등록에 실패했습니다.");
		}
	}

}
