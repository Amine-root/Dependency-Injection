package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component("dao")
@Repository
public class DaoImpl implements IDao{

	@Override
	public double getData() {
		// Connecting to the DB
		double data = 98;
		return data;
	}
	
	public void init() {
		System.out.println("Instance DaoImpl");
	}

}
