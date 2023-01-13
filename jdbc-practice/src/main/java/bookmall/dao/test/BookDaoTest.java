package bookmall.dao.test;

import java.util.List;

import bookmall.dao.BookDao;
import bookmall.vo.BookVo;

public class BookDaoTest {
	public static void main(String[] args) {
		testInsert();
		testFindAll();
	}

	private static void testInsert() {
		BookVo vo =null;
		BookDao dao = new BookDao();
		
		vo = new BookVo();
		vo.setTitle("트랜드코리아");
		vo.setPrice(17100L);
		vo.setCategory_no(1L);
		dao.insert(vo);
		
		vo = new BookVo();
		vo.setTitle("모던 자바스크립트 Deep Dive");
		vo.setCategory_no(2L);
		vo.setPrice(40500L);
		dao.insert(vo);
		
		vo = new BookVo();
		vo.setTitle("2023 수제비 정보처리기사 필기 1권+2권");
		vo.setCategory_no(3L);
		vo.setPrice(31500L);
		dao.insert(vo);
	}
	
	//PRINT 
	
	private static void testFindAll() {
		List<BookVo> list = new BookDao().findAll();
		for(BookVo vo : list) {
			System.out.println(vo);
		}
	}

}
