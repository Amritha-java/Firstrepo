package sample;

public class Stringbufferexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer obj=new StringBuffer("hii");
				System.out.println(obj);
		StringBuilder obj1=new StringBuilder("heloo");
				System.out.println(obj1);
				//append add the new string at last
				obj.append("hiii liya");
				System.out.println(obj);
				//insert insert an new element based on index
				obj.insert(2,"meenu");
				System.out.println(obj);
				//replace replace the value at starting and ending position
				obj.replace(1,4,"apple");
				System.out.println(obj);
				//reverse to reverse the string
				obj.reverse();
System.out.println(obj);
//delete to delete a specific part
obj.delete(1, 4);
System.out.println(obj);

	}

}
