package cwiczenie3;

public class ArrayObjectMain {

	public static void main(String[] args) {
		int[] data = { 1, 2, 2, 29, 2 };
		
		System.out.println("Array");
		ArrayTask array = new ArrayPrinter();
		array.setData(data);
		array.runTask();
		System.out.println("New annonymousArray");

		ArrayTask annonymousArray = new ArrayTask() {
			@Override
			protected void doTask(int i) {
				System.out.println(i * i);
			}
		};
		annonymousArray.doTask(5);
		annonymousArray.setData(data);
		annonymousArray.runTask();
	}
}
