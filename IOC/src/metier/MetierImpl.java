package metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dao.IDao;

//@Component("metier")
@Service
public class MetierImpl implements IMetier{

	// loose coupling (faible)
	
	@Autowired
	private IDao dao = null;
	
	@Override
	public double calcul() {
		double d = dao.getData();
		double res = d * 23;
		return res;
	}
	
	public void setDao(IDao dao) {
		this.dao = dao;
		System.out.println("Dependency Injection");
	}
	
	public void init() {
		System.out.println("Instance MetierImpl");
	}
	
}
