package iyileþtirilmiþ.builder;

public class Client {

	public static void main(String[] args){
		
		//Director'ý kuruyoruz

		QueryBuildDirector director = new QueryBuildDirector();
		String from="client table";
		String where="client name = ...";
		
		
		//kullanacaðýmýz sql query'i hazýrlýyoruz
		
		QueryBuilder builder = new SqlQueryBuilder();
		Query query = director.buildQuery(from, where, builder);
		query.execute();
		
		
		builder = new MongoDbQueryBuilder();
	    query = director.buildQuery(from, where, builder);
		query.execute();
	}
	
}
