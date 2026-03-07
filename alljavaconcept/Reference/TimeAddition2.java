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
	Time add(Time t2) 
	{
        Time t3 = new Time();

        t3.second = this.second + t2.second;
        t3.minute = this.minute + t2.minute + (t3.second / 60);
        t3.second = t3.second % 60;

        t3.hour = this.hour + t2.hour + (t3.minute / 60);
        t3.minute = t3.minute % 60;

        return t3;
    }
}
class TimeAddition2
{
	public static void main(String args[])
	{
		Time t1=new Time(5,40,55);
		Time t2=new Time(3,45,10);
		Time t3 = t1.add(t2);
		t1.show();
		t2.show();
		System.out.println("Addition of time :- ");
		t3.show();
	}
}