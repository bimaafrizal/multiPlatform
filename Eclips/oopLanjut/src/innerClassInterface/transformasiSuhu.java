package innerClassInterface;

public interface transformasiSuhu {
	final int  FARENHEIT=32;
	
	public abstract double CelsiustoFarenheit(double celcius);
	public abstract double CelsiustoReamur(double celcius);
	
	
	public abstract double FarenheittoCelsius(double farenheit);
	public abstract double FarenheittoReamur(double farenheit);
	
	public abstract double ReamurtoCelsius(double reamur);
	public abstract double ReamurtoFarenheit(double reamur);

}
