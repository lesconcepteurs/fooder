package les.concepteurs.fooder.metier;

public class Preparation {
	
	private String nomTypePrepa;
	private int duree;
	private String nomUniteDuree;
	private int dureeSecond;
	
	/**
	 * @param nomTypePrepa
	 * @param duree
	 * @param nomUniteDuree
	 * @param dureeSecond
	 */
	public Preparation(String nomTypePrepa, int duree, String nomUniteDuree, int dureeSecond) {
		super();
		this.nomTypePrepa = nomTypePrepa;
		this.duree = duree;
		this.nomUniteDuree = nomUniteDuree;
		this.dureeSecond = dureeSecond;
	}
	
	public Preparation() {}
	
	
	/*
	 * Utilities
	 */
	
	public String getNomTypePrepa() {
		return nomTypePrepa;
	}
	public int getDuree() {
		return duree;
	}
	public String getNomUniteDuree() {
		return nomUniteDuree;
	}
	public int getDureeSecond() {
		return dureeSecond;
	}
	public void setNomTypePrepa(String nomTypePrepa) {
		this.nomTypePrepa = nomTypePrepa;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public void setNomUniteDuree(String nomUniteDuree) {
		this.nomUniteDuree = nomUniteDuree;
	}
	public void setDureeSecond(int dureeSecond) {
		this.dureeSecond = dureeSecond;
	}

	@Override
	public String toString() {
		return "Preparation [nomTypePrepa=" + nomTypePrepa 
				+ ", duree=" + duree 
				+ ", nomUniteDuree=" + nomUniteDuree
				+ ", dureeSecond=" + dureeSecond + "]";
	}

}
