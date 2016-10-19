//Animal.java
/*This program has 4 attributes*/

public class Animal{
	private String type;
	private String continents[];
	private double weight;
	private int age;
	
	public void setType(String type){
		this.type = type;	
	}
	
	public void setContinents(String continents[]){
		this.continents = continents;
	}
	
	public void setWeight(double weight){
		this.weight = weight;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public Animal(String type, String continents[]){
		setType(type);
		continents=new String[7];
		setWeight(0.0);
		setAge(0);
	}
	
	public Animal(){
		type = "No Type Specified";
		continents = null;
		weight = 0.0;
		age = 0;
	}
	
	public String getType(){
		return type;
	}
	
	public String[] getContinents(){
		return continents;
	}
	
	public double getWeight(){
		return weight;
	}
	
	public int getAge(){
		return age;
	}
	
	public Animal(String type, String[] continents, double weight, int age){
		setType(type);
		setContinents(continents);
		setWeight(weight);
		setAge(age);
	}
	
    public String toString(){
    	
    	
    	String output="";
    	
    	for(int i=0;i<continents.length;i++)
    	{
    		output+=continents[i] + " ";
    	}
    	
     return "Type: " + type + "\nContinents: " + output + "\nWeight:" + weight + "\nAge:" + age;	
    }
	
	
}