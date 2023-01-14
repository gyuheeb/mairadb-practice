package bookmall.vo;

public class OrderVo {
	private Long no;
	private String name;
	private String email;
	private Long price;
	private String address;
	private Long user_no;
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
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Long getUser_no() {
		return user_no;
	}
	public void setUser_no(Long user_no) {
		this.user_no = user_no;
	}
	@Override
	public String toString() {
		return "OrderVo [no=" + no + ", name=" + name + ", email=" + email + "price="+ price +", address=" + address
				+ "]";
	}

	
	
	
	

}
