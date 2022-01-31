package metier;

import dao.IDao;

public class MetierImpl implements IMetier{

	private IDao dao = null;
	
	@Override
	public double calcul() {
		// loose coupling (faible)
		double d = dao.getData();
		double res = d * 23;
		return res;
	}
	
	public void setDao(IDao dao) {
		this.dao = dao;
	}
	
}
