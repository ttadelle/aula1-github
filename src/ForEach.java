
public class ForEach {

	public static void main(String[] args) {

		String[] vect = new String [] {"Thiago", "Isabella", "Conceição", "Carlos"};
		
		/*for (int i=0; i <vect.length; i ++) {
			System.out.println(vect[i]);
		}*/
		
		for (String string : vect) {
			System.out.println(string);
		}
	}

}