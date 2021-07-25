//test the ThreeStacks class
public class main {

	public static void main(String[] args) {
	ThreeStacks array = new ThreeStacks(12);
			
			array.push1(5);
			array.push1(51);
			array.push2(25);
			array.push2(2);
			array.push3(52);
			array.push3(12);
			array.show();
		
			System.out.println();
			array.pop1();
			array.pop2();
			array.pop3();
		
			System.out.print("Updated array: ");
			array.show();

	}

}
