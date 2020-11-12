package leapYear;

public class LeapYear {
	
	private boolean lYear = false;
	
	public boolean isLeapYear(int year) {
		if ((year%4==0) && (year%100!=0)) {
				lYear = true;
			}
			else if (year%400==0){
				lYear = true;
			}
		else {
			lYear = false;
		}
		return lYear;
	}
}
