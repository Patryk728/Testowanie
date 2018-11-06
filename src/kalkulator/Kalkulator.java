package kalkulator;

public class Kalkulator {

	public static void main(String[] args) {
		
		Kalkulator.dzielenie(4,0);
		
	}
	
	public static float dodawanie(float num1,float num2)
	{
		float wynik=num1+num2;
		System.out.println(wynik);
		return wynik;
	}
	public static float odejmowanie(float num1,float num2)
	{
		float wynik=num1-num2;
		System.out.println(wynik);
		return wynik;
	}
	public static float mnozenie(float num1, float num2)
	{
		float wynik=num1*num2;
		System.out.println(wynik);
		return wynik;
	}
	public static float dzielenie(float num1, float num2)
	{
		if(num2!=0)
		{
		float wynik=num1/num2;
		System.out.println(wynik);
		return wynik;
		}else {
			System.out.println("Nie mozna przez 0");
		}
		return 0;
	}
		
}

