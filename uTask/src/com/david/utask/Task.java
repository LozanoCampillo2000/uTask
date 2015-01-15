package com.david.utask;

public class Task
{
	private String name;
	private String tag;
	private String description;
	private String startTime;
	private String endTime;
	private int priority;
	
	public Task(String name, String tag, String description, String startTime, String endTime, int priority)
	{
		this.setName(name);
		this.setTag(tag);
		this.setDescription(description);
		this.setStartTime(startTime);
		this.setEndTime(endTime);
		this.setPriority(priority);
	}
	
	public String toString()
	{
		return name + "\t" + startTime + " to " + endTime + "\t" + priority + "\t" + description;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getTag()
	{
		return tag;
	}

	public void setTag(String tag)
	{
		this.tag = tag;
	}

	public String getStartTime()
	{
		return startTime;
	}

	public void setStartTime(String startTime)
	{
		this.startTime = startTime;
	}

	public String getEndTime()
	{
		return endTime;
	}

	public void setEndTime(String endTime)
	{
		this.endTime = endTime;
	}

	public int getPriority()
	{
		return priority;
	}

	public void setPriority(int priority)
	{
		this.priority = priority;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
