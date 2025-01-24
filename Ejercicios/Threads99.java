  package Ejercicios;

  public class Threads99 implements Runnable {
		        private String DesignerName; // Name of the designer
		        private int DesignTime; // The time it takes to do the design

		        // Constructor
		        public Threads99(String DesignerName, int DesignTime) {
		            this.DesignerName = DesignerName;
		            this.DesignTime = DesignTime;
		        }

		        @Override
		        public void run() {
		            System.out.println(DesignerName + " started designing");

		            try {
		            	//Simulate designing time
		                Thread.sleep(DesignTime * 1000L);//Convert seconds to miliseconds
		            } catch (InterruptedException e) {
		                System.out.println(DesignerName + " was interrupted while designing");
		            }
		            System.out.println(DesignerName + " finished the design");
		        }
		    

   public static void main(String[] args) {
		//Create Runnable instances for Designers
		Threads99 Designer1 = new Threads99 ("Hugo", 5);
		int contador=0;
		
		for (int i=0; i<=99; i++) {	
			Thread thread1 = new Thread(Designer1);
			thread1.start();
			contador++;
			System.out.println(Designer1 + " is Designing");
			System.out.println("Contador: "+contador);
		}


		}
   }
