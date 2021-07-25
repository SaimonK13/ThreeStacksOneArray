//class to implement three stacks in one array
public class ThreeStacks {
	int[] array;
	int n;
	//variables to hold index value of each stack
	int s1;
	int s2;
	int s3;
	//top of each stack
	int top1;
	int top2;
	int top3;
	
	//constructor
	ThreeStacks(int i) {
		array = new int[i];
		n = array.length;
		s1 = (n/3) - 1;
		s2 = ((2*n)/3) - 1;
		s3 = n - 1;
		top1 = 0;
		top2 = n/3;
		top3 = (2 * n)/3;
	}
	
	//method to push data into first stack
	public void push1(int data) {
		if(top1 <= s1) {
			array[top1] = data;
			top1++;
		}
		else {
			System.out.println("First stack is full!");
		}
	}
	
	//method to push data into first stack
		public void push2(int data) {
			if(top1 <= s2) {
				array[top2] = data;
				top2++;
			}
			else {
				System.out.println("Second stack is full!");
			}
		}
		
		//method to push data into first stack
		public void push3(int data) {
			if(top1 <= s3) {
				array[top3] = data;
				top3++;
			}
			else {
				
				System.out.println("Third stack is full!");
				
			}
		}
		
		//method to pop from first stack
		public void pop1(){
			top1--;
			System.out.println("Data removed from first stack: " + array[top1]);
			array[top1] = 0;
		}
		
		//method to pop from first stack
		public void pop2(){
			top2--;
			System.out.println("Data removed from first stack: " + array[top2]);
			array[top2] = 0;
		}
		
		//method to pop from first stack
		public void pop3() {
			top3--;
			System.out.println("Data removed from third stack: " + array[top3]);
			array[top3] = 0;
		}
		
		//method to print the array
		public void show() {
			
			for(int j : array) {
				System.out.print(j + " ");
			}
		}
}
