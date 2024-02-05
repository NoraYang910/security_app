package application;

public class ConfigSetting {
	private int id;
	private String name;
	private String defaultAl;
	private String strColor;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDefaultAl() {
		return defaultAl;
	}
	public void setDefaultAl(String defaultAl) {
		this.defaultAl = defaultAl;
	}
	public String getStrColor() {
		return strColor;
	}
	public void setStrColor(String strColor) {
		this.strColor = strColor;
	}
	@Override
	public String toString() {
		return "ConfigSetting [id=" + id + ", name=" + name + ", defaultAl=" + defaultAl + ", strColor=" + strColor
				+ "]";
	}
	
}
