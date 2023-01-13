package bookmall.vo;

public class Order_bookVo {
	private Long no;
	private String title;
	private Long Count;
	private Long order_no;
	private Long book_no;
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Long getCount() {
		return Count;
	}
	public void setCount(Long count) {
		Count = count;
	}
	public Long getOrder_no() {
		return order_no;
	}
	public void setOrder_no(Long order_no) {
		this.order_no = order_no;
	}
	public Long getBook_no() {
		return book_no;
	}
	public void setBook_no(Long book_no) {
		this.book_no = book_no;
	}
	@Override
	public String toString() {
		return "Order_bookVo [no=" + no + ", title=" + title + ", Count=" + Count + ", order_no=" + order_no
				+ ", book_no=" + book_no + "]";
	}
	
	

}
