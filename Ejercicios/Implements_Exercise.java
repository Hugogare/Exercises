   package Ejercicios;

   public class Implements_Exercise {

    class Designer implements Runnable {
        private String DesignerName; // Name of the designer
        private int DesignTime; // The time it takes to do the design

        // Constructor
        public Designer(String DesignerName, int DesignTime) {
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
    }

    public static void main(String[] args) {
        Implements_Exercise exercise = new Implements_Exercise(); // Instancia de la clase externa
        
        Designer Designer1 = exercise.new Designer("Hugo ", 3);
        Designer Designer2 = exercise.new Designer("Javi ", 2);
        Designer Designer3 = exercise.new Designer("Geoffrey ", 1);

        Thread thread1 = new Thread(Designer1);
        Thread thread2 = new Thread(Designer2);
        Thread thread3 = new Thread(Designer3);

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("All Designers are Designing...");
    }
}
