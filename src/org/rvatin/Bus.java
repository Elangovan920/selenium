package org.rvatin;

public class Bus {
	private int busno;
	private boolean ac;
	private int capacity;
	public String seat;
	
public Bus(int busno,boolean ac,int capacity,String sat) {
	this.busno= busno;
	this.ac=ac;
	this.capacity=capacity;
	seat=sat;
	
}

    public String getSeat() {
	return seat;
}

public void setSeat(String seat) {
	this.seat = seat;
}

	public int	getCapaciy(){
		return capacity;
	}
	public void setCapacity(int cap) {
		capacity=cap;
	}
	public boolean getac() {
		return ac;
	}
	public void setac(boolean AC) {
		ac=AC;
	}
	public int getBusNO() {
		return busno;
	}
	public void displayBusInfo(){
	
		System.out.println("busno   "+busno + "   ac     " +ac  +"   capacity   "+capacity+ seat );
	}
}
	


