package java_core_3_homework;

public class Job {

	int salary;
	String jobname;

	public Job(int salary, String jobname) {
		super();
		this.salary = salary;
		this.jobname = jobname;
	}

	public Job(int salary) {
		super();
		this.salary = salary;
		
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	//
	
	@Override
	public String toString() {
		return "Job [salary=" + salary + "]";
	}
	
	
	
	
	
}



