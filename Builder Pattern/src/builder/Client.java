package builder;

public class Client {

	public static void main(String[] args){
		
		String from="client table ";
		String where="client name = ***";
	
		SqlQuery sqlQuery = new SqlQuery();
        sqlQuery.setFrom(from);
        sqlQuery.setWhere(where);
        sqlQuery.execute();
		
        
        MongoDbQuery mongoDbQuery = new MongoDbQuery();
        mongoDbQuery.setFrom(from);
        mongoDbQuery.setWhere(where);
        mongoDbQuery.execute();


    }
	
}
