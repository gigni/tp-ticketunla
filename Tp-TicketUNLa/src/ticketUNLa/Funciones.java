package ticketUNLa;

import java.util.Calendar;
import  java.util.GregorianCalendar;

public class Funciones {
	public static boolean esBisiesto(GregorianCalendar f) {
		int bis;
		bis=f.get(Calendar.YEAR)%4;
		if(bis==0) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public static int traerAnio(GregorianCalendar f) {
		return f.get(Calendar.YEAR);
	}
	public static int traerDia(GregorianCalendar f) {
		return f.get(Calendar.DAY_OF_MONTH);
	}
	public static int traerMes(GregorianCalendar f) {
		return f.get(Calendar.MONTH)+1;
	}
	public static String convertirAString(int n) {
		return String.valueOf(n);
	}
	public static int traerHora(GregorianCalendar f) {
		return f.get(Calendar.HOUR);
	}
	public static int traerMin(GregorianCalendar f) {
		return f.get(Calendar.MINUTE);
	}
	public static int traerSegundos(GregorianCalendar f) {
		return f.get(Calendar.SECOND);
	}
	public static String traerFechaCorta(GregorianCalendar f) {
		return traerDia(f)+"/"+traerMes(f)+"/"+traerAnio(f)+" "+traerHora(f)+":"+traerMin(f)+":"+traerSegundos(f);
	}	
	public static String traerFecha(GregorianCalendar f) {
		return traerDia(f)+"/"+traerMes(f)+"/"+traerAnio(f);
	}


/*	public static String elDiaEs(esDiaHabil boolean) {
		if(esDiaHabil=true) {
			
		}
	}*/
	

//public static String traerDiaSemana(GregorianCalendar f) {
	

//Fecha Valida
	public static boolean esFechaValida(GregorianCalendar f) {
		boolean valido= false;
		int diamax=0;
		if (traerAnio(f)>0) {
			if (traerMes(f)>0&&traerMes(f)<=12) {
					switch (traerMes(f)) {
					case 1: diamax=31;
					break;
					case 2: if (esBisiesto(f)==true&&traerMes(f)==2) {
						if (traerDia(f)>0&&traerDia(f)<=29) {
							valido=true;
					}	
					else  {
						if (esBisiesto(f)== false&& traerMes(f)==2){
							if  (traerDia(f)>0&&traerDia(f)<=28) {
								valido=true;
							}
						}
					}
					}
					case 3: diamax=31;
					break;
					case 4: diamax=30;
					break;
					case 5: diamax=31;
					break;
					case 6: diamax=30;
					break;
					case 7: diamax=31;
					break;
					case 8: diamax =31;
					break;
					case 9: diamax =30;
					break;
					case 10: diamax=31;
					break;
					case 11: diamax=30;
					break;
					case 12: diamax=31;
					break;
					
		
}	
}if (diamax>0 && diamax<31) {
	valido=true;
}
		}
		
		return valido;
	}

	
	

public static GregorianCalendar traerFechaProximo (GregorianCalendar f, int diasplus) {
	GregorianCalendar proximo= new GregorianCalendar(traerAnio(f),traerMes(f)-1,traerDia(f));
	proximo.add(Calendar.DAY_OF_MONTH, diasplus);
	return proximo;
}
public static int traerDiaNumSem(GregorianCalendar f) {
	return f.get(Calendar.DAY_OF_WEEK);
}
public static String traerDiaSemana(GregorianCalendar f) {
	int numdia= traerDiaNumSem(f);
	String Dia;
	Dia=null;
		switch (numdia){
		case 1: Dia="Domingo";
		break;
		case 2: Dia="Lunes";
		break;
		case 3: Dia="Martes";
		break;
		case 4: Dia="Miercoles";
		break;
		case 5: Dia="Jueves";
		break;
		case 6: Dia="Viernes";
		break;
		case 7: Dia="Sabado";
		break;
		
		}
	 return Dia;
}
public static boolean esDiaHabil(GregorianCalendar f) {
	int numDia= traerDiaNumSem(f);
	boolean loEs=true;
	if (numDia==0 || numDia==7) {
		loEs=true;
	}
	return loEs;
}
public static String traerMesDelAño(GregorianCalendar f) {
	int mes;
	String nomMes;
	nomMes=null;
	mes=traerMes(f);
	switch (mes) {
	case 1: nomMes="Enero";
	break;
	case 2: nomMes="Febrero";
	break;
	case 3: nomMes="Marzo";
	break;
	case 4: nomMes="Abril";
	break;
	case 5: nomMes="Mayo";
	break;
	case 6: nomMes="Junio";
	break;
	case 7: nomMes="Julio";
	break;
	case 8: nomMes="Agosto";
	break;
	case 9: nomMes="Septiembre";
	break;
	case 10: nomMes="Octubre";
	break;
	case 11: nomMes="Noviembre";
	break;
	case 12: nomMes="Diciembre";
	break;
	}
	return nomMes;
	
}


}
	
