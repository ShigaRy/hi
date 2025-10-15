package new6;

public class Employee implements Billable {
		protected String id;
		protected String name;
		
		//id,nameフィールド
		public Employee(String id, String name) {
			this.id = id;
			this.name = name;
		}
		
		//idのgetter
		public String getId() {
			return id;
		}
		
		//nameのgetter
		public String getName() {
			return name;
		}
		
		
		//インタフェース
		@Override
		public int costForDay(int hoursWorked) {
			return 0;
		}


		
}
