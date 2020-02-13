package iyile�tirilmi�.builder;

public class SqlQuery implements Query{

	private String from;
	
	private String where;
	
	@Override
	public void execute() {
		System.out.println("SqlQuery �al��t�r�ld� from: "+from+" where "+where);
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public void setWhere(String where) {
		this.where = where;
	}
	
	

}
