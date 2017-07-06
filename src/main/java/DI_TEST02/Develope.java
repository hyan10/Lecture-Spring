package DI_TEST02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Develope {

	
	private Worker worker;

	public Develope() {
		super();
	}
	
	
	// 생성자에 파라미터가 몇개인지 모르기 때문에 Qualifier는 해당 객체 앞에 쓴다
	@Autowired
	public Develope(@Qualifier("developer")Worker worker,
					@Qualifier("developer")Worker worker1) {
		super();
		this.worker = worker;
	}



	public Worker getWorker() {
		return worker;
	}

	/*@Autowired
	@Qualifier("designer")*/
/*	@Resource(name="designer")
	public void setWorker(Worker worker) {
*/
/*	public void setWorker(@Qualifier("designer")Worker worker) {
		this.worker = worker;
	}*/

	public void work() {
		worker.start();
		System.out.println("개발한다.");
		worker.end();
	}

}
