package com.kgd.epam.solution.task1;

public class ToSeeHowItWorks {

	public static void main(String[] args) {

		List<String> a = new List<>();
			
		a.addBack("1");
		a.addBack("2");
		a.addBack("3");
		a.addBack("4");
		
		a.middleInsert("32");
		
		System.out.println(a.search("987"));
		
		//a.printList();
				
		/*a.addFront("23");
		a.addFront("24");
		a.addBack("End");
		a.del("23");
		a.printList();
		*/
		
		
		/*List<Number> b = new List<>();
		b.addBack(8);
		b.addBack(8.5);
		b.printList();
		Number d =  b.search(8).getData();
		System.out.println(d);*/

	}

}
