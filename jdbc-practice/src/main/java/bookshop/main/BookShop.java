package bookshop.main;

import java.util.List;
import java.util.Scanner;

import bookshop.dao.test.BookDao;
import bookshop.vo.BookVo;

public class BookShop {

	public static void main(String[] args) {
		displayBookInfo();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("대여 하고 싶은 책의 번호를 입력하세요:");
		Long no = scanner.nextLong();
		scanner.close();
		BookVo vo = new BookVo();
		vo.setNo(no);
		vo.setRent("Y");
		
		new BookDao().update(vo);
	
		displayBookInfo();
		
	}

	private static void displayBookInfo() {
		List<BookVo> list = new BookDao().findAll();
		for(BookVo vo : list) {
			String info = String.format("[%d] 제목: %s, 작가: %s, 대여유무: %s", vo.getNo(), vo.getTitle(), vo.getAuthorname(), "Y".equals(vo.getRent()) ? "대여중" : "재고있음");
			System.out.println(info);
		}
	}
}