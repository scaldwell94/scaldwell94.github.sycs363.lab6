package howard.edu.sycs363.spring15.lab3;

public class Driver {
	IntegerArrayList list1;
	IntegerArrayList list2;
	
	public static void main(String[] args) {
		IntegerArrayList list1 = new IntegerArrayList();
		IntegerArrayList list2 = new IntegerArrayList(5);
		list1.Add(7);
		list1.Add(13);
		list1.Add(3);
		int value1 = list1.Get(1);
		System.out.println("Value of 1st element=" + value1);
		int value2 = list1.Get(7);
		System.out.println("Value of 7th element=" + value2);
		
		boolean value = list2.isEmpty();
		System.out.println("Is List2 empty? Survey says: " + value);
		list2.Add(0);
		list2.Add(0);
		list2.Add(0);
		list2.Add(0);
		list2.Add(0);
		list2.Add(0, 7);
		list2.Add(1, 14);
		list2.Add(2, 13);
		list2.Add(3, 12);
		list2.Add(4, 100);
		boolean value0 = list2.isEmpty();
		System.out.println("What about now?: " + value0);
		int index1 = list2.IndexOf(100);
		System.out.println("The integer 100 lies at index " + index1);
		int index2 = list2.IndexOf(3);
		System.out.println("The integer 3 lies at index " + index2);
		int remove1 = list2.Remove(0);
		System.out.println("The value removed from index 0 is: " + remove1);
	}
}
