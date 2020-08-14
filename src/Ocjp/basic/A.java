package Ocjp.basic;

public class A {

private int counter = 0;

public static int getInstanceCount() {
return counter;
}

public A() {
 counter++;
 }

 }
Given this code from Class B:
 A a1 =new A();
 A a2 =new A();
 A a3 =new A();
 System.out.printIn(A.getInstanceCount() );