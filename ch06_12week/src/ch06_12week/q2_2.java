package ch06_12week;

class Baap {
public int h = 4;
public int getH() {
System.out.println("Baap " + h);
return h;}}

public class q2_2 extends Baap {
public int h = 44;
public int getH() {
System.out.println("q2_2 " + h);
return h;}
public static void main(String[] args) {
Baap b = new q2_2();
q2_2 bb = (q2_2) b; 
System.out.println(bb.h);
System.out.println();
System.out.println(bb.getH());
}}

