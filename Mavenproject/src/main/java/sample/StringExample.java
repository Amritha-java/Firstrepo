package sample;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="hii";
String s1=new String("amritha");
System.out.println(s);
System.out.println(s1);
	

char arr[]={'a','b','c','d'};//char converted to string
String s2=new String(arr);

System.out.println(s2);
//length
System.out.println(s.length());
//charAt return character in the string
char f=s.charAt(1);
System.out.println(f);
//concat 
System.out.println(s.concat(" world"));
//contains
String s3="my name is anu";
System.out.println(s3.contains("are"));
String s4="java";
String s5="java";
String s6="Java";
String s7="selenium";
//equals
System.out.println(s4.equals(s5));
System.out.println(s5.equals(s6));
System.out.println(s5.equals(s7));
//equals ignore case
System.out.println(s4.equalsIgnoreCase(s6));
//to uppercase
System.out.println(s4.toUpperCase());
//to lowercase
String s8="APPLE";
System.out.println(s8.toLowerCase());
//is empty
String s9=" ";
System.out.println(s9.isEmpty());
//value of
int h=5;
String s11=String.valueOf(h);
System.out.println(s11);
//==
System.out.println(s4==s5);
String s12=new String("java");
System.out.println(s12==s4);
}
}
