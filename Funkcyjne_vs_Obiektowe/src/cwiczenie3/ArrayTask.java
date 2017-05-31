package cwiczenie3;

public abstract class ArrayTask {

	private int[] data; // domyslnie jest null

	public void setData(int[] data) {
		this.data = data;
	}

	protected abstract void doTask(int i);

	void runTask() {
		for (int i : data) {
			doTask(i);
		}
	}
}
