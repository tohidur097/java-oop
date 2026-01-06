package entity;
public class Passport{
	private String passportNo;
	private String expireDate;
	private int pages;
	
	public Passport(){ 

	}
	public Passport(String passportNo, String expireDate, int pages){
		setPassportNo(passportNo);
		setExpireDate(expireDate);
		setPages(pages);
	}
	
	public void setPassportNo(String passportNo){
		this.passportNo = passportNo;
	}
	
	 public String getPassportNo(){
    	return passportNo;
    }
	
    public void setExpireDate(String expireDate){
    	this.expireDate = expireDate;
    }
	
	public String getExpireDate(){
    	return expireDate;
    }
	
    public void setPages(int pages){
    	this.pages = pages;
    }

    public int getPages(){
    	return pages;
    }
    public void showPassportInfo(){
		System.out.println("---------------Passport Info----------------");
    	System.out.println("Passport NO :"+passportNo);
        System.out.println("Passport Expire Date :"+expireDate);
        System.out.println("Pages :"+pages);
		//System.out.println("------------------------------");

    }


}