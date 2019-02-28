/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.math.uni.lodz.kalkulator;

/**
 *
 * @author Patryk
 */
public class Kalkulator {

    public static void main(String[] args) {
	
		add(1.0,1.0);
		
	}
	
	public static double add(double num1,double num2)
	{
		double wynik=num1+num2;
		System.out.println(wynik);
		return wynik;
	}
	public static double subtraction(double num1,double num2)
	{
		double wynik=num1-num2;
		System.out.println(wynik);
		return wynik;
	}
	public static double multiplication(double num1, double num2)
	{
		double wynik=num1*num2;
		System.out.println(wynik);
		return wynik;
	}
	public static double division(double num1, double num2)
	{
		if(num2!=0)
		{
		double wynik=num1/num2;
		System.out.println(wynik);
		return wynik;
		}else {
			System.out.println("Nie mozna przez 0");
		}
		return 0;
	}
    
    
}
