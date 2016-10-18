package com.cj.ReservedKeywords;

class A1 {
	 
    private int number;
     
    void bar() {
        number = 10;    // OK
    }
}
 
class B1 {
    void foo() {
        A1 a = new A1();
        //a.number = 10. // Oh no! since number is private
    }
}
