package bookshop;

public class Book {
	private int bookNo;
	 String title;
	private String author;
	private int stateCode;
	
		public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title =title;
		this.author = author;
		stateCode=1;
		}
		
		public void rent() {
			this.stateCode = 0;
			System.out.println( title +" 이(가) 대여 됐습니다");
			
	}	

		public void print() {
			
			System.out.print(bookNo + "제목 : " + title +", 작가 : "
		+author+", 대여 유무 : " );
			if(stateCode==0) {
				System.out.println("대여중");
			}
			else {
				System.out.println("재고있음");
			}
			
	}
	
}
