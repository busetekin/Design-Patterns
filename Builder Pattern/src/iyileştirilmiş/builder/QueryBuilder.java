package iyile�tirilmi�.builder;

public interface QueryBuilder {

	void from(String from);
	
	void where(String where);
	
	Query getQuery();
	
}
