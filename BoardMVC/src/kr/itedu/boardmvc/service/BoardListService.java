package kr.itedu.boardmvc.service;

import java.util.ArrayList;

import kr.itedu.boardmvc.BoardVO;
import kr.itedu.boardmvc.common.BoardDAO;

public class BoardListService {
	
	public int getBoardPageCount(int btype) {
		int result = 0;
		BoardDAO dao = BoardDAO.getInstance();
		result = dao.getBoardPageCount(btype);
		return result;
	}
	
	public ArrayList<BoardVO> getBoardList(int btype, int page) {
		ArrayList<BoardVO> result = null;
		BoardDAO dao = BoardDAO.getInstance();
		result = dao.getBoardList(btype, page);
		
		return result; 
	}

}
