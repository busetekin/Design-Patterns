package builder;

public class MongoDbQuery implements Query {

	private String from;

	private String where;

	@Override
	public void execute() {
		System.out.println("MongoDBQuery çalýþtýrýldý : " + from + " where " + where);
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public void setWhere(String where) {
		this.where = where;
	}

}
