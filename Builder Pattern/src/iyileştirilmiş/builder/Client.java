package iyile�tirilmi�.builder;

public class Client {

	public static void main(String[] args){
		
		//Director'� kuruyoruz

		QueryBuildDirector director = new QueryBuildDirector();
		String from="client table";
		String where="client name = ...";
		
		
		//kullanaca��m�z sql query'i haz�rl�yoruz
		
		QueryBuilder builder = new SqlQueryBuilder();
		Query query = director.buildQuery(from, where, builder);
		query.execute();
		
		
		builder = new MongoDbQueryBuilder();
	    query = director.buildQuery(from, where, builder);
		query.execute();
	}
	
}
