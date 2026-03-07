class Time
{
	private int hour, minute, second; 
	Time()
	{
		hour = 0;
        minute = 0;
        second = 0;
	}
	Time(int hour, int minute, int second)
	{
		this.hour = hour;
        this.minute = minute;
        this.second = second;
	}
	void show()
	{
		System.out.println(hour + " " + minute + " " + second + " ");
	}
	void add(Time t1, Time t2) 
	{
		this.second = t1.second + t2.second;
        this.minute = t1.minute + t2.minute + (this.second / 60);
        this.second = this.second % 60;

        this.hour = t1.hour + t2.hour + (this.minute / 60);
        this.minute = this.minute % 60; 
	}
}
class TimeAddition1
{
	public static void main(String args[])
	{
		Time t1=new Time(5,40,55);
		Time t2=new Time(3,45,10);
		Time t3=new Time();
		t3.add(t1,t2); 
		t1.show();
		t2.show();
		System.out.println("Addition of time :- ");
		t3.show();
	}
}