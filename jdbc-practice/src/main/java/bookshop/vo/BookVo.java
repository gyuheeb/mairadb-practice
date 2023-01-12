package bookshop.vo;

public class BookVo {
	private Long no;
	private String title;
	private String rent;
	private Long authorNo;
	private String authorname;

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


	public String getRent() {
		return rent;
	}


	public void setRent(String rent) {
		this.rent = rent;
	}


	public Long getAuthorNo() {
		return authorNo;
	}


	public void setAuthorNo(Long authorNo) {
		this.authorNo = authorNo;
	}


	public String getAuthorname() {
		return authorname;
	}


	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}


	@Override
	public String toString() {
		return "BookVo [no=" + no + ", title=" + title + ", rent=" + rent + ", authorNo=" + authorNo + ", authorname="
				+ authorname + "]";
	} 


	
	
	
}
