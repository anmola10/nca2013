public class date {
	private int year;
	private int month;
	private int day;
 
	public date(int yr, int mnt, int dy) {
		year = yr;
		month = mnt;
		day = dy;
	}
 
	public void setYear(int yr){
		year = yr;
	}
 
	public void setMonth(int mnt){
		month = mnt;
	}
 
	public void setDay(int dy){
		day = dy;
	}
 
	public int getYear(){
		return year;
	}
 
	public int getMonth(){
		return month;
	}
 
	public int getDay(){
		return day;
	}
 
	public void displayDate(){
		System.out.println("Today's date is: " +month+ "/" +day+ "/" +year+".");
	}
 
}