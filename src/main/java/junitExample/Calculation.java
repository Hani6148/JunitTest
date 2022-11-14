package junitExample;

public class Calculation {
 public int add(int x, int y) {
	 return x+y;
 }
 public int sub(int x, int y) {
	 return x-y;
 }
 public int multi(int x, int y) {
	 return x*y;
 }
 
 public int div(int x, int y) {
	 return x/y;
 }
 
 public boolean check(int x, int y) {
	 if(x>y) {
		 return true;
	 }
	 else {
		 return false;
	 }
 }
}
