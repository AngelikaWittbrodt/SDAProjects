package com.sda.academy.timer;

public class MyTime {

	private int hour;
	private int minute;
	private int second;

	public MyTime() {
	}

	public MyTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	// nie tworzy nowego obiektu tylko ustawia te wartoœci
	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = hour;
		this.second = second;
	}

	@Override
	public String toString() {

		String time = "";
		String hourString = addLeadingZeros(this.hour);
		String minuteString = addLeadingZeros(this.minute);
		String secondString = addLeadingZeros(this.second);

		time = hourString + ":" + minuteString + ":" + secondString;

		return time;
	}

	private String addLeadingZeros(int number) {
		String result = "";
		if (number < 10) {
			result = "0" + number + "";
		} else {
			result = Integer.toString(number);
		}
		return result;
	}

	public MyTime nextSecond() {
		this.second++;
		if (this.second == 60) {
			this.second = 0;
			nextMinute();
		}
		return this;
	}

	public MyTime nextMinute() {
		this.minute++;
		if (this.minute == 60) {
			this.minute = 0;
			this.nextHour();
		}
		return this;
	}

	public MyTime nextHour() {
		this.hour++;
		this.hour = hour % 24;
		return this;
	}

	public MyTime previousSecond() {
		if (this.second == 0) {
			this.second--;
			this.second = 59;
			this.previousMinute();
		} else {
			this.second--;
		}
		return this;
	}

	public MyTime previousMinute() {
		if (this.minute == 0) {
			this.minute--;
			this.minute = 59;
			this.previousHour();
		} else {
			this.minute--;
		}
		return this;
	}

	public MyTime previousHour() {
		if (this.hour == 0) {
			this.hour = 23;
		} else {
			this.hour--;
		}
		return this;
	}
}
