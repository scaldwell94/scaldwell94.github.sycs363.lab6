package howard.edu.sycs363.spring15.lab3;

public class IntegerArrayList {

	int[] arrayList;
	int listIndex;
	
	IntegerArrayList() {
		/**
		 * Main constructor w/ set size
		 */
		arrayList = new int[10];
		listIndex = 0;
	}
	
	IntegerArrayList(int size) {
		/**
		 * Additional constructor w/ optional size set by user
		 */
		arrayList = new int[size];
		listIndex = 0;
	}
	
	void Add(int value) {
		/**
		 * Function that adds a value to list
		 */
		arrayList[listIndex] = value;
		listIndex++;
	}
	
	void Add(int index, int value) {
		/**
		 * Function that adds a value to a user-specified index of list
		 */
		arrayList[index] = value;
	}
	
	int Get(int index) {
		/**
		 * Function that retrieves a value located at user-specified index of list
		 */
		if(isEmpty()) {
			return -1;
		}
		else {
			if(index > listIndex) {
				return -1;
			}
			else 
				return arrayList[index];
		}
	}
	
	int IndexOf(int value) {
		/**
		 * Function that retrieves the index of a user-specified value (if in list)
		 */
		for(int x = 0; x < listIndex; x++) {
			if(arrayList[x] == value) {
				return x;
			}
		}
		return -1;
	}
	
	boolean isEmpty() {
		/**
		 * Function that checks if list is empty or not
		 */
		if(listIndex == 0) {
			return true;
		}
		else
			return false;
	}
	
	int Remove(int index) {
		/**
		 * Function that removes a value located at user-specified index of list
		 */
		int value = 0;
		if(index >= listIndex) {
			return -1;
		}
		else {
			value = arrayList[index];
			arrayList[index] = -1;
			return value;
		}
	}
	
	
	
}
