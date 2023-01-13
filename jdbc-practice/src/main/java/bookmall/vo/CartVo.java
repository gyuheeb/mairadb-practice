package bookmall.vo;

public class CartVo {
	
private String title;
private long price;
private Long no;
private Long count;
private Long book_no;
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public long getPrice() {
	return price;
}
public void setPrice(long price) {
	this.price = price;
}
public Long getNo() {
	return no;
}
public void setNo(Long no) {
	this.no = no;
}
public Long getCount() {
	return count;
}
public void setCount(Long count) {
	this.count = count;
}
public Long getBook_no() {
	return book_no;
}
public void setBook_no(Long book_no) {
	this.book_no = book_no;
}
@Override
public String toString() {
	return "CartVo [title=" + title + ", price=" + price + ", count=" + count + "]";
}







}