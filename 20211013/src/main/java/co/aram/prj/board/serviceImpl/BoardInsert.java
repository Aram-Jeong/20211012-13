package co.aram.prj.board.serviceImpl;

import java.util.Scanner;

import co.aram.prj.board.service.BoardService;
import co.aram.prj.board.service.BoardVO;
import co.aram.prj.comm.Command;
import co.aram.prj.comm.GB;

public class BoardInsert implements Command {
	private Scanner sc = new Scanner(System.in);
	private BoardService boardService = new BoardServiceImpl();
	
	@Override
	public void execute() {
		
		BoardVO vo = new BoardVO();
		System.out.println("* * * * * * * * *");
		vo.setBWriter(GB.NAME);
		System.out.println("���� �Է� >>");
		vo.setBTitle(sc.nextLine());
		System.out.println("���� �Է� >>");
		vo.setBContents(sc.nextLine());
		int n = boardService.boardInsert(vo);
		if (n != 0) {
			System.out.println("��� �Ϸ�!");
		} else {
			System.out.println("��� ����...");
		}

	}

}
