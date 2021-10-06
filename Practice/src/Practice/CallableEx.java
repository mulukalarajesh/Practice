package Practice;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableEx<V> implements Callable<V> {

	
	
	
	public static void main(String[] args) {
		ExecutorService service=Executors.newFixedThreadPool(5);
		ArrayList<Future<String>>list=new ArrayList<>();
		Callable<String> callable=new CallableEx<>();
		for(int i=0;i<10;i++) {
			Future<String>lists=service.submit(callable);
			list.add(lists);
		}
		
		for(Future<String> str:list) {
			try {
				System.out.println(str.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		service.shutdown();
	}

	@SuppressWarnings("unchecked")
	@Override
	public V call() throws Exception {
		// TODO Auto-generated method stub
System.out.println(Thread.currentThread().getName());
return (V) Thread.currentThread().getName();
	
	}
}
