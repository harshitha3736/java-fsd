package Phase1_assessment2;


	class Sample{
		synchronized void print(int n) {
		System.out.println("Multiplication Table of "+n+" upto 10 is: ");
		for(int i=1;i<=10;i++) {
		System.out.println(n+" * "+i+" = "+(n*i));
		try {
		Thread.sleep(1000);
		}
		catch(Exception e) {
		}
		}
		}
		}
		class Thread1 extends Thread{
		Sample s;
		Thread1(Sample s){
		this.s=s;
		}
		public void run() {
		s.print(2);
		}
		}
		class Thread2 extends Thread{
		Sample s;
		Thread2(Sample s){
		this.s=s;
		}
		public void run() {
		s.print(6);
		}
		}

		public class PP3_Synchronization {

			public static void main(String[] args) {
				Sample ts=new Sample();
				Thread1 t1=new Thread1(ts);
				Thread2 t2=new Thread2(ts);
				t1.start();
				t2.start();

			}

		}

