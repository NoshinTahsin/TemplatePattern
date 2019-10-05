package TemplatePattern;

public abstract class MobileOperator {
	abstract void calcCallRate(double time);
	
	public final void calculate(double time){

	      calcCallRate(time);
	}


}
