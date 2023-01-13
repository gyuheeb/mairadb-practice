package bookmall.vo;

public class CategoryVo {
	private Long no;
	private String part;
	
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	@Override
	public String toString() {
		return "CategoryVo [no=" + no + ", part=" + part + "]";
	}
	
	

	
}
