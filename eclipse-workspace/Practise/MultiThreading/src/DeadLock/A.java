package DeadLock;

public class A {

	public synchronized void d1(B b) {
		System.out.println(  Thread.currentThread().getName()+" Starts execution od D1()");

		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {}
		System.out.println(Thread.currentThread().getName()+"  trying to Call Bs lAST MEHTOD");
		b.last();

	}

	public  synchronized void last() {
		System.out.println("Inside A This is Last Method");
	}

}

