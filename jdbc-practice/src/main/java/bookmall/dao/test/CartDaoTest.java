package bookmall.dao.test;

import java.util.List;

import bookmall.dao.CartDao;
import bookmall.vo.CartVo;


public class CartDaoTest {
	public static void main(String[] args) {
		testInsert();
		testFindAll();
}

	private static void testInsert() {
		CartVo vo =null;
		CartDao dao = new CartDao();
		vo = new CartVo();
		vo.setCount(1L);
		vo.setBook_no(1L);
		dao.insert(vo);
		
		vo = new CartVo();
		vo.setCount(2L);
		vo.setBook_no(2L);
		dao.insert(vo);
		
		
	}
	
	private static void testFindAll() {
		List<CartVo> list = new CartDao().findAll();
		for(CartVo vo : list) {
			System.out.println(vo);
		}
	}
	
	
	}
