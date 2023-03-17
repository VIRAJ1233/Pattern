import java.util.ArrayList;

public class DuplicateRemove {
public static void main(String[] args) {
	ArrayList<String> al = new ArrayList();
	
	al.add("viraj");
	al.add("akash");
	al.add("prnav");
	al.add("samarth");
	al.add("samarth");
	
	System.out.println("Before " +al);
	for(int i = 0 ; i<al.size();i++) {
	al.remove("samarth");
	
	
}
	System.out.println("New arraylist is "+al);
}
}
