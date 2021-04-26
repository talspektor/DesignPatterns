package examples;

public class MySingleton {
	
    private static MySingleton instance = null;
    
    private int random = (int)(Math.random()*100);
    
    private MySingleton() {
    	System.out.println("Creating MySingleton...");
    }
    
//    public synchronized static MySingleton getInstance() {
//    	if (instance == null) {
//    		instance = new MySingleton();
//    	}
//    	return instance;
//    }
    
    public static MySingleton getInstance() {
    	if (instance == null) {
          //synchronized block to remove overhead
          synchronized (MySingleton.class) {
            if(instance == null) {
              // if instance is null, initialize
              instance = new MySingleton();
            }
            
          }
        }
    	return instance;
    }
    
    public static synchronized void doWork() {
		System.out.println("Working...");
	}

	@Override
	public String toString() {
		return "MySingleton [random=" + random + "]";
	}
    
    
}
