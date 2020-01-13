package marcos.classes;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Sec {
	
	private String senha;
	private byte[] messageDigest;
	
	public Sec(String senha) throws NoSuchAlgorithmException, UnsupportedEncodingException{
		this.setSenha(senha);
	}
	
	public byte[] getMessageDigest() {
		return this.messageDigest;
	}
	
	private MessageDigest algorithm;
	
	private byte[] setHash(String senha) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		this.algorithm = MessageDigest.getInstance("SHA-256");
		this.messageDigest = algorithm.digest(senha.getBytes("UTF-8"));
		return this.messageDigest;
	}
	
	public void setSenha(String senha) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		this.setHash(senha);
	}
	
}
