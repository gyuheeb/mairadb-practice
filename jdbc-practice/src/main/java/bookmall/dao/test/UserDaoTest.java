package bookmall.dao.test;

import java.util.List;


import bookmall.dao.UserDao;
import bookmall.vo.UserVo;

public class UserDaoTest {
	public static void main(String[] args) {
//		testInsert();
	    testFindAll();
	}

	private static void testInsert() {
		UserVo vo =null;
		UserDao dao = new UserDao();
		vo = new UserVo();
		vo.setName("뽀로로");
		vo.setEmail("Pororo@gamil.com");
		vo.setCellphone("010-9999-9999");
		vo.setPassword("0101");
		vo.setCart_no(1L);
		dao.insert(vo);
		
		vo = new UserVo();
		vo.setName("루피");
		vo.setEmail("zanmang_loopy@gamil.com");
		vo.setCellphone("010-9999-9999");
		vo.setPassword("0101");
		vo.setCart_no(2L);
		dao.insert(vo);
		
		
	}
	private static void testFindAll() {
		List<UserVo> list = new UserDao().findAll();
		for(UserVo vo : list) {
			System.out.println(vo);
		}
	}
}
