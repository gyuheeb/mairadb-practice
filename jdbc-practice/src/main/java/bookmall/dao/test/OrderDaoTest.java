package bookmall.dao.test;

import java.util.List;

import bookmall.dao.OrderDao;
import bookmall.vo.OrderVo;


public class OrderDaoTest {
	public static void main(String[] args) {
	//	testInsert();
		testFindAll();
}

	private static void testInsert() {
		OrderVo vo =null;
		OrderDao dao = new OrderDao();
		
		vo = new OrderVo();
		vo.setAddress("남극..뽀로로 집");
		vo.setUser_no(1L);
		dao.insert(vo);
		
		vo = new OrderVo();
		vo.setAddress("남극..루피 집");
		vo.setUser_no(2L);
		dao.insert(vo);
		
	}
	private static void testFindAll() {
		List<OrderVo> list = new OrderDao().findAll();
		for(OrderVo vo : list) {
			System.out.println(vo);
		}
	}
	
}
