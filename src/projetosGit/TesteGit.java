package projetosGit;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;

public class TesteGit {

	public static void main(String[] args) {
		
	
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL);
		
		Date data1= new Date();
		int horas = data1.getHours();
		int minutos = data1.getMinutes();
		System.out.println("Hoje é "+df4.format(data1)+", e agora são "+ horas +" horas e "+minutos+" minutos" );

	}

}
