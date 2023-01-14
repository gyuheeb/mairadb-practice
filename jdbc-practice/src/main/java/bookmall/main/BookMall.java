package bookmall.main;

import java.util.List;

import bookmall.dao.BookDao;
import bookmall.dao.CartDao;
import bookmall.dao.CategoryDao;
import bookmall.dao.OrderDao;
import bookmall.dao.Order_bookDao;
import bookmall.dao.UserDao;
import bookmall.vo.BookVo;
import bookmall.vo.CartVo;
import bookmall.vo.CategoryVo;
import bookmall.vo.OrderVo;
import bookmall.vo.Order_bookVo;
import bookmall.vo.UserVo;

public class BookMall {

	public static void main(String[] args) {
		
		System.out.println("******회원리스트******");
		UsertestFindAll();
		System.out.println("******카테고리******");
		CategorytestFindAll();
		System.out.println("******상품리스트******");
		BooktestFindAll();
		System.out.println("******카트담기******");
		CarttestFindAll(); 
		System.out.println("******주문******");
		OrdertestFindAll(); 
		System.out.println("*****주문도서리스트*****");
		Order_booktestFindAll();
	}
	private static void UsertestFindAll() {
		List<UserVo> list = new UserDao().findAll();
		for(UserVo vo : list) {
			System.out.println(vo);
		}	
	}
	private static void CategorytestFindAll() {
		List<CategoryVo> list = new CategoryDao().findAll();
		for(CategoryVo vo : list) {
			System.out.println(vo);
		}
	}
	private static void BooktestFindAll() {
		List<BookVo> list = new BookDao().findAll();
		for(BookVo vo : list) {
			System.out.println(vo);
		}
	}
	private static void CarttestFindAll() {
		List<CartVo> list = new CartDao().findAll();
		for(CartVo vo : list) {
			System.out.println(vo);
		}
	}
	private static void OrdertestFindAll() {
		List<OrderVo> list = new OrderDao().findAll();
		for(OrderVo vo : list) {
			System.out.println(vo);
		}
	}
	private static void Order_booktestFindAll() {
		List<Order_bookVo> list = new Order_bookDao().findAll();
		for(Order_bookVo vo : list) {
			System.out.println(vo);
		}
	}



}
