package co.aram.prj.board.serviceImpl;

import co.aram.prj.board.service.BoardService;
import co.aram.prj.board.service.BoardVO;
import co.aram.prj.comm.Command;

public class BoardSelect implements Command {
	private BoardService boardService = new BoardServiceImpl();
	
	@Override
	public void execute() {
		BoardVO vo = new BoardVO();
		vo.setBId(6);
		vo = boardService.boardSelect(vo);
		System.out.println(vo.getBId() + ": " + vo.getBTitle()+": "+vo.getBHit());

	}

}
