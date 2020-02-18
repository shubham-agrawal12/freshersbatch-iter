abstract class Persistance
	{
		abstract void persist();
		}
		
	class FilePersistance extends Persistance
	{
		void persist()
		{
			System.out.println("data persisted into file");
	}
	}
	class DatabasePersistence extends Persistance
	{
		void persist()
		{
			System.out.println("data is persisted into database");
	}}
	class PersistenceFactory
	{
		public static Persistance getPersistance()
		{
			return new DatabasePersistence();
	}}
	public class Client{
		public static void main(String args[])
		{
			Persistance p1=PersistenceFactory.getPersistance();
			p1.persist();
	
	}}
	
