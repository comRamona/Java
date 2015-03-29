public class ProjectDate {
	private int weekNo, dayNo;

	public ProjectDate() {
		weekNo = 0;
		dayNo = 1;
	}

	public void setDay(int dayNo) {
		if (dayNo >= 1 && dayNo <= 5)
			this.dayNo = dayNo;
	}

	public void setWeek(int weekNo) {
		this.weekNo = weekNo;
	}

	public void advance(int n) {
		if (n > 0) {
			if (n + dayNo <= 5) {
				dayNo = dayNo + n;
			} else

			{
				weekNo++;
				int remaining = n - (5 - dayNo);
				dayNo = remaining % 5;
				if (dayNo == 0)
					dayNo = 5;
				weekNo = weekNo + remaining / 5;
				if (remaining % 5 == 0) // hacking the solution done right!
					weekNo--;
			}
		}
	}

	public String toString() {
		String s = "Week: " + weekNo + " Day: " + dayNo;
		return s;
	}

	public static void main(String[] args) {
		ProjectDate p = new ProjectDate();
		p.setDay(3);
		p.setWeek(7);
		System.out.println(p); // Week:7 Day:3
		p.advance(23);
		System.out.println(p); // Week:10 ,Day:4
	}
}
