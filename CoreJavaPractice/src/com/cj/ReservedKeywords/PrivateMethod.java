package com.cj.ReservedKeywords;

class A {
	 
    private void foo() { }
     
    void bar() {
        foo();    // okay, no problem!
    }
}
 
class B {
	
    void woo() {
        A a = new A();
        //a.foo(); // Oh no! since foo() is private
    }
}
