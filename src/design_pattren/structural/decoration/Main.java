package design_pattren.structural.decoration;

import design_pattren.structural.decorator.berverage.Coffee;
import design_pattren.structural.decorator.berverage.Cola;
import design_pattren.structural.decorator.berverage.Cool;
import design_pattren.structural.decorator.berverage.IBeverage;
import design_pattren.structural.decorator.berverage.LCup;
import design_pattren.structural.decorator.berverage.SCup;

public class Main {

	public static void main(String[] args) {
		System.out.println("Decoration pattren");
		System.out.println("------------------");
		IChristmasTree christmasTree = new BubbleLights(new TreeTopper(new ChristmasTreeImpl()));
		System.out.println(christmasTree.decorate());
		System.out.println("------------------");
		System.out.println("Beverage");
		IBeverage menu1 = new SCup(new Cool(new Cola()));
		System.out.println("Menu 1 desc : " + menu1.desc());
		System.out.println("Menu 1 cost : " + menu1.cost());
		IBeverage menu2 = new LCup(new Cool(new Coffee()));
		System.out.println("menu 2  desc : " + menu2.desc());
		System.out.println("menu 2  cost : " + menu2.cost());
	}

}
