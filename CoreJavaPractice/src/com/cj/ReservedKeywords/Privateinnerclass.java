package com.cj.ReservedKeywords;

class A2 {
	 
    private class SubA2 {
        // inner class
    }
     
    void bar() {
        SubA2 obj = new SubA2();    // OK
    }
}
 
class B2 {
    void foo() {
       // A2.SubA a = new A2.SubA(); // Oh no! since SubA is private
    }
}
