package calculator;

public class Calculadora {

	public Calculadora() {}
	
	public String acumulado(String acumulado,String boton)
	{
		if (boton.equals("=") && !acumulado.equals(""))
		{
			acumulado=acumulado.replace("+","s").replace("-","r").replace("/","d").replace("*","m");

			if(acumulado.indexOf("s")!=-1)
				return ""+suma(Integer.parseInt(acumulado.split("s")[0]),Integer.parseInt(acumulado.split("s")[1]));
			else if(acumulado.indexOf("r")!=-1)
				return ""+resta(Integer.parseInt(acumulado.split("r")[0]),Integer.parseInt(acumulado.split("r")[1]));
			else if(acumulado.indexOf("m")!=-1)
				return ""+multiplica(Integer.parseInt(acumulado.split("m")[0]),Integer.parseInt(acumulado.split("m")[1]));
			else if(acumulado.indexOf("d")!=-1)
				return ""+divide(Integer.parseInt(acumulado.split("d")[0]),Integer.parseInt(acumulado.split("d")[1]));
		}
		return acumulado;
	}

	public int suma(int operando1,int operando2)
	{
		return operando1+operando2;
	}
	
	public int resta(int operando1,int operando2)
	{
		return operando1-operando2;
	}
	
	public int multiplica(int operando1,int operando2)
	{
		return operando1*operando2;
	}
	
	public int divide(int operando1,int operando2)
	{
		return operando1/operando2;
	}

}

