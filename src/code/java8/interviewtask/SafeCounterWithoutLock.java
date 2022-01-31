package code.java8.interviewtask;
import java.util.concurrent.atomic.AtomicInteger;

public class SafeCounterWithoutLock {

	private final AtomicInteger counter = new AtomicInteger(0);

	public int getValue() {
		return counter.get();
	}

	public void increment() {
		while (true) {
			int existingValue = getValue();
			int newValue = existingValue + 1;
			System.out.println("existingValue::"+existingValue);
			System.out.println("newValue::"+newValue);
			if (counter.compareAndSet(existingValue, newValue)) {
				System.out.println("counter::"+counter.get());
				return;
			}
		}
	}
	
	public static void main(String z[]) {
		
		SafeCounterWithoutLock safeCounterWithoutLock = new SafeCounterWithoutLock();
		
		safeCounterWithoutLock.increment();
		safeCounterWithoutLock.increment();
	}
	
}
