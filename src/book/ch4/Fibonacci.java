package book.ch4;

import javax.swing.JOptionPane;

public class Fibonacci {

	public static void main(String[] args) {
		int a=1,b=1,c,d=1;
		System.out.print(a+" "+b+" ");
		for(int i=0;i<18;i++) {
			//JOptionPane.showMessageDialog(null, "before a:"+a+", b:"+b);
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			
			JOptionPane.showMessageDialog(null, "a"+d+" : a:"+a+", b:"+b);
			d++;
			}
			
		}

	}
//a b c