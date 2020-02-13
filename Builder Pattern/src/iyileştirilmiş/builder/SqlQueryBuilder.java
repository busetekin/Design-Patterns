package iyileþtirilmiþ.builder;

public class SqlQueryBuilder implements QueryBuilder{
	
	SqlQuery query = new SqlQuery();

	@Override
	public void from(String from) {
		query.setFrom(from);
		
	}

	@Override
	public void where(String where) {
		query.setWhere(where);
	}

	@Override
	public Query getQuery() {
		
		return query;
	}

}
