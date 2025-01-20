   package Ejercicios;

   class Designer extends Thread {
       private String DesignerName; // Name of the designer
	   private int DesignTime; //The time it takes to do the design


	//Constructor
	public Designer(String DesignerName, int DesignTime) {
		this.DesignerName=DesignerName;
		this.DesignTime=DesignTime;
	}

	@Override
	public void run() {
		System.out.println(DesignerName + "started designing");

		try {
			Thread.sleep(DesignTime*1000L);
		} catch(InterruptedException e) {
			System.out.println(DesignerName+"was interrupted while designing");
		}
		System.out.println(DesignerName+"Finished the design");
	}

}
   public class Extends_Exercise{
	public static void main(String[] args) {
		Designer Designer1 = new Designer("Hugo ",3);
		Designer Designer2 = new Designer("Javi ",2);
		Designer Designer3 = new Designer("Geoffrey ",1);

		Designer1.start();
		Designer2.start();
		Designer3.start();

		System.out.println("All Designers are Designing...");

	}
}