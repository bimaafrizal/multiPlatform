package innerClassInterface;

import java.util.Scanner;

public class suhu implements transformasiSuhu{
	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		double inputSuhu = input.nextDouble();
		
		suhu Suhu = new suhu();
		System.out.println("suhu anda dari Celcius ke Farennheit adalah " + Suhu.CelsiustoFarenheit(inputSuhu));
		System.out.println("suhu anda dari Celcius ke Reamur adalah " + Suhu.CelsiustoReamur(inputSuhu));
		System.out.println("suhu anda dari Farennheit ke Celcius adalah " + Suhu.FarenheittoCelsius(inputSuhu));
		System.out.println("suhu anda dari Farennheit ke Reamur adalah " + Suhu.FarenheittoReamur(inputSuhu));
		System.out.println("suhu anda dari Reamur ke Celcius adalah " + Suhu.ReamurtoCelsius(inputSuhu));
		System.out.println("suhu anda dari Reamur ke Farennheit adalah " + Suhu.ReamurtoFarenheit(inputSuhu));
		
	}

	@Override
	public double CelsiustoFarenheit(double celcius) {
		// TODO Auto-generated method stub
		double hasil = 9 * celcius/5 + FARENHEIT;
		
		return hasil;
	}

	@Override
	public double CelsiustoReamur(double celcius) {
		// TODO Auto-generated method stub
		double hasil= 5 * celcius /4;
		return hasil;
	}

	@Override
	public double FarenheittoCelsius(double farenheit) {
		// TODO Auto-generated method stub
		double hasil= 5 * (farenheit-FARENHEIT)/9;
		return hasil;
	}

	@Override
	public double FarenheittoReamur(double farenheit) {
		// TODO Auto-generated method stub
		double hasil= 4 * (farenheit-FARENHEIT)/9;
		return hasil;
	}

	@Override
	public double ReamurtoCelsius(double reamur) {
		// TODO Auto-generated method stub
		double hasil= 4 * reamur/5;
		return hasil;
	}

	@Override
	public double ReamurtoFarenheit(double reamur) {
		// TODO Auto-generated method stub
		double hasil=(9*reamur/4)+FARENHEIT;
		return hasil;
	}
	
	

}
