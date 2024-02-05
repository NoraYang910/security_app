package application;

public class EncryptionInfo {
	private int id;
	private String name;
	private int caesar_key;
	private byte[] des_key;
	private String algorithm;
	private String text;
	private String code;
	
	public EncryptionInfo(int id, String name, int caesar_key, byte[] des_key, String algorithm, String text,String code) {
		super();
		this.id = id;
		this.name = name;
		this.caesar_key = caesar_key;
		this.des_key = des_key;
		this.algorithm = algorithm;
		this.text = text;
		this.code = code;
	}
	public int getCaesar_key() {
		return caesar_key;
	}
	public void setCaesar_key(int caesar_key) {
		this.caesar_key = caesar_key;
	}
	public byte[] getDes_key() {
		return des_key;
	}
	public void setDes_key(byte[] des_key) {
		this.des_key = des_key;
	}
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
	
	public String getAlgorithm() {
		return algorithm;
	}
	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	
	
	
}
