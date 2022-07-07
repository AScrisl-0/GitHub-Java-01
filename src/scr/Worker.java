package scr;

public class Worker {
	private String name;
	private double wage;
	public Worker(String name,double wage){
		this.name = name;
		this.wage = wage;
	}
	public void increase() {this.wage=this.wage+100}
	public void print() {System.out.println("wage:"+wage);}
}
public class Manager extends Worker{
	private double allowance;
	private double wage;
	public Manager(String.name,double wage,double allowance) {
		super(name,wage);
		this.allowance=allowance;
	}

}
	
