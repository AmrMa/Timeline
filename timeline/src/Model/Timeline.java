package Model;
public class Timeline {
	String startTime;
	String endTime;
	String title;
	String description;
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	 public String toString()
	{
		String timeline = "Title: "+getTitle()+"Start Time: "+getStartTime()+
				"End Time"+getEndTime()+"Description: "+getDescription();
		return timeline;
	}
}
