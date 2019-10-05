package TemplatePattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double time=2.00;
		
		MobileOperator mobileoperator=new Grameenphone();
		mobileoperator.calculate(time);
		
		mobileoperator=new Robi();
		mobileoperator.calculate(time);
		
		mobileoperator=new Banglalink();
		mobileoperator.calculate(time);
		

	}

}
