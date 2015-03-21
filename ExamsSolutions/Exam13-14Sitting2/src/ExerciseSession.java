public class ExerciseSession {
	String type;
	String place;

	public ExerciseSession(String type, String place) {
		this.type = type;
		this.place = place;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	@Override
	public String toString() {
		return type + " (" + place + ")";
	}

}
