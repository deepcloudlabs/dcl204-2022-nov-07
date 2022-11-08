package com.example.banking;

public final class Account { 

}

/**
    // Error: you cannot subclass Account
	class SavingsAccount extends Account {
		
	}
 */

class A {
	public void fun() {}
	final public void gun() {} // you cannot override final method
}

class B extends A {

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		super.fun();
	}

//	@Override // you cannot override final method
//	public void gun() {
//		// TODO Auto-generated method stub
//		super.gun();
//	}
	
}

class C {
	public final int x; // constant, read-only attribute 

	public C(int x) {
		this.x = x;
	}
	
	@SuppressWarnings("unused")
	public void fun(final int m/* read-only parameter*/,int n) {
		n++;
		// m++;
		final int p = 42; // constant, read-only variable
		// p++;
	}
	
}