package new7;
		
class Employee implements CalclateSalary {	
		protected String type;	
		protected String name;
			
	public Employee(String type, String name) {		
		this.type = type;	
		this.name = name;
	}	
		
	public String getType() { 
		return type; 
		}
	public String getName() { 
		return name; 
		}
	
	@Override
	public int CalculateSalary(int workTime) {
		return 0;
	}
	
	
}	