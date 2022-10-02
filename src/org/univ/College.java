package org.univ;

public class College extends University{
@Override
public void ug() {
	System.out.println("UG is 3 years");
}
@Override
	public void pg() {
		System.out.println("PG is 2 years");
	}
public static void main(String[] args) {
	University u=new College();
	u.ug();
	u.pg();
}
}
