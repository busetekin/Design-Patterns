package iyileştirilmiş.builder;

public class Client {

	public static void main(String[] args){
		
		//Director'ı kuruyoruz

		QueryBuildDirector director = new QueryBuildDirector();
		String from="client table";
		String where="client name = ...";
		
		
		//kullanacağımız sql query'i hazırlıyoruz
		
		QueryBuilder builder = new SqlQueryBuilder();
		Query query = director.buildQuery(from, where, builder);
		query.execute();
		
		
		builder = new MongoDbQueryBuilder();
	    query = director.buildQuery(from, where, builder);
		query.execute();
	}
	
}
