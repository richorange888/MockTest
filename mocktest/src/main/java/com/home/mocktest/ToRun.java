package com.home.mocktest;

public class ToRun extends ToBeParent {
	
	public int getNo() {
		int myNo = 5;
		int parentNo = this.getParameter1();
		return myNo + parentNo;
	}
	
	private int myPrivateMethod() {
		int myNo = 7;
		int parentNo = this.getParameter1();
		return myNo + parentNo;
	}
}
