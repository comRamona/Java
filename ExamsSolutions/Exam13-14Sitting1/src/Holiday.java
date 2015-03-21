public class Holiday {
	String destination;
	int days;

	public Holiday(String destination, int days) {
		this.destination = destination;
		this.days = days;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	@Override
	public String toString() {
		return destination + " (" + days + ")";
	}

}
