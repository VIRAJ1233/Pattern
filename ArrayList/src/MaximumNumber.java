import java.util.ArrayList;


public class MaximumNumber {
public static void main(String[] args) {
	
	ArrayList al = new ArrayList();
	al.add(1);
	al.add(2);
	al.add(3);
	al.add(5);
	
	
	ArrayList al1 = new ArrayList();
	
	al1.add("hii");
	al1.add("bye");
	al1.add("my");
	al1.add("lie");
	al1.add("tie");
	
	ArrayList al2 = new ArrayList();
	al2.add("hii");
	al2.add("bye");
	al2.add("mine");
	al2.add("wine");
	al2.add("line");
	
	al1.retainAll(al2);
	
	System.out.println(al1);
	
	//System.out.println(al);
	
}
}
