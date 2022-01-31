package ext;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import dao.IDao;

//@Component
@Repository
public class DaoImplV2 implements IDao{

	/*
	 * Version WS
	 */
	
	@Override
	public double getData() {

		double a = 89;
		System.out.println("Version web service");
		
		return a * 89;
	}
	
}
