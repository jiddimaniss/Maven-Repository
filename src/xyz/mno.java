package xyz;

public class mno {

	public static void main(String[] args) {
		

		String name="SolApur Gfsk";
		
		int bb=name.length();
		for(int i=bb-1;i>=0;i--) {
			char ch=name.charAt(i);
			if(ch>=65&&ch<=96) {
				System.out.print(ch);
			}
		}
		

	}

}
