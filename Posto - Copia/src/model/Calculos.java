package model;



public class Calculos {
	public float D,C,A,E,L500,v1L,A500ml,Quanti1l,b500,tud1litro,CombustivelTotal,Totaloleo;
	public String TV;
	
	public String Diesel(float qL)
	{
		String vTotal=String.valueOf(D*qL);
		CombustivelTotal=Float.valueOf(vTotal);
		return vTotal;
	}
	public String Comum(float qL)
	{
		String vTotal=String.valueOf(C*qL);
		return vTotal;
	}
	public String Aditiv(Float qL)
	{
		String vTotal=String.valueOf(A*qL);
		CombustivelTotal=Float.valueOf(vTotal);
		return vTotal;
	}
	public String Etanol(float qL)
	{
		String vTotal=String.valueOf(E*qL);
		CombustivelTotal=Float.valueOf(vTotal);
		return vTotal;
	}
	public String c500ml()
	{
		String vTotal=String.valueOf(A500ml*L500);
		b500=Float.valueOf(vTotal);
		return vTotal;
	}
	public String c1L()
	{
		String vTotal=String.valueOf(Quanti1l*v1L);
		tud1litro= Float.valueOf(vTotal);
		return vTotal;
	}
	public String totalOleo()
	{
		String vTotal=String.valueOf(b500+tud1litro);
		Totaloleo=Float.valueOf(vTotal);
		return vTotal;
	}
	public String TotalpagarVista()
	{
		String total=String.valueOf((CombustivelTotal+Totaloleo)-((CombustivelTotal+Totaloleo)*0.10));
		TV=total;
		return total;
	}
	public String totalPagarPrazo()
	{
		
		String total=String.valueOf((CombustivelTotal+Totaloleo));
		return total;
	}
	public String totalPagarPrazo30()
	{
		String total=String.valueOf((CombustivelTotal+Totaloleo)+((CombustivelTotal+Totaloleo)*0.10));
		return total;
	}
}
