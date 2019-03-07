package les.concepteurs.fooder.metier;

public class ThemeRecette {
	
	private int idTheme;
	private String nomTheme;
	
	
	/**
	 * @param idTheme (int)
	 * @param nomTheme (String)
	 */
	public ThemeRecette(int idTheme, String nomTheme) {
		this.idTheme = idTheme;
		this.nomTheme = nomTheme;
	}
	
	public ThemeRecette() {}


	public int getIdTheme() {
		return idTheme;
	}
	public String getNomTheme() {
		return nomTheme;
	}
	public void setIdTheme(int idTheme) {
		this.idTheme = idTheme;
	}
	public void setNomTheme(String nomTheme) {
		this.nomTheme = nomTheme;
	}


	@Override
	public String toString() {
		return "ThemeRecette [idTheme=" + idTheme + ", nomTheme=" + nomTheme + "]";
	}

}
