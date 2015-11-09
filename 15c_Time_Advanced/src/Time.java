class Time
{
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public Time(int hour, int minute, int second)
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time(int hour)
    {
        this(hour, 0, 0); //This line is calling the constructor Time(int hour, int minute, int second)
    }

    //This method is private because we don't want to use it from the main program
    //It is only used to solve our internal problems
    //Normally we call this kind of the an "implementation detail"
    //The most important code is the public API
    //The details of implementation are not that important
    private String addZero(int num)
    {
        String numAsString = String.valueOf(num);
		if (num <= 9)
        {
            return "0" + numAsString;
        }
        return numAsString;
    }

    public String toHumanString()
    {
        return addZero(hour) + ":" + addZero(minute) + ":" + addZero(second);
    }
    
    private final int MINUTES_IN_HOUR = 60;
    private final int SECONDS_IN_MINUTE = 60;
    private int allToSeconds()
    {
        return hour*MINUTES_IN_HOUR*SECONDS_IN_MINUTE+minute*SECONDS_IN_MINUTE+second;
    }

	public boolean isBefore(Time anotherTime) {		
		//Wait, wait, wait...
		//anotherTime.allToSeconds() is private, how can you call it?		
		return allToSeconds()<anotherTime.allToSeconds();
	}
}
