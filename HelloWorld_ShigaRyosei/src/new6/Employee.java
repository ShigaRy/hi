package new6;

public class Employee implements Billable {
		protected String id;
		protected String name;

		public Employee(String id, String name) {
			this.id = id;
			this.name = name;
		}
		
		
		public String getId() {
			return id;
		}
		
		
		public String getName() {
			return name;
		}
		
		
		@Override
		public int costForDay(int hoursWorked) {
			return 0;
		}


		
}
