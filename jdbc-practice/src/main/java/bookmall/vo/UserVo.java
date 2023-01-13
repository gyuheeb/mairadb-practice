package bookmall.vo;

public class UserVo {
	private Long no;
	private String name;
	private String email;
	private String cellphone;
	private String password;
	private Long cart_no;
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getCart_no() {
		return cart_no;
	}
	public void setCart_no(Long cart_no) {
		this.cart_no = cart_no;
	}
	@Override
	public String toString() {
		return "UserVo [name=" + name + ", email=" + email + ", cellphone=" + cellphone + ", password="
				+ password + "]";
	}
	
	
	
	

}
