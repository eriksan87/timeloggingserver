package Services;


import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class MyDateTime {
	
	public static Time StringToTime(String time) 
	{
		
		DateFormat formatter = new SimpleDateFormat("HH:mm");
		java.sql.Time timeValue = null;
		try {
			timeValue = new java.sql.Time(formatter.parse(time).getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return timeValue;
	}
	
	public static Date StringToDate(String date)
	{
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
	    Date startDate = null;
		try {
			startDate = (Date) df.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return startDate;
	    
	}
	
	public static Timestamp stringToTimestamp(String data, String ora, String minuti) throws ParseException{
		   
		String s_giorno = data.substring(0, 2);
		String s_mese = data.substring(3, 5);
		String s_anno = data.substring(6, 10);
		
		int giorno = Integer.parseInt(s_giorno);
		int mese = Integer.parseInt(s_mese);
		int anno = Integer.parseInt(s_anno);
		int hours = Integer.parseInt(ora);
		int minutes = Integer.parseInt(minuti);
		
		
		Timestamp timestamp = Timestamp.valueOf(anno+"-"+mese+"-"+giorno+" "+hours+":"+minutes+":0.0");
		return timestamp; 

	}
	
	public static String[] getOraAttuale() {
		String[] tempo=new String[2];
		java.util.Date date= new java.util.Date(); 
		Timestamp ora_attuale=new Timestamp(date.getTime());
		String ora=String.valueOf(ora_attuale.getHours());
		String minuti=String.valueOf(ora_attuale.getMinutes());
	
		if (ora.length()==1)
			ora="0"+ora;
		if (minuti.length()==1)
			minuti="0"+minuti;
		tempo[0]=ora;
		tempo[1]=minuti;
		return tempo;
	}
	
	public static String checkOra(String s) {
		
		String t=s;
		
		if (s.length()==1)
			t="0"+s;
		return t;
	}
	

	public static boolean checkBetweensDates(String d1,String d2)
	{
		if(StringToDate(d1).after(StringToDate(d2)))
		
			return false;
		
		else return true;
	}
	
	public static boolean checkTextIsEmpty(String text)
	{
		if(text.isEmpty())
		{
			return true;
		}
		else return false;
	}
	
	public static boolean checkBetweensTimes(String d1, String d2, String h1,String h2)
	{
		if(StringToDate(d1).equals(StringToDate(d2)))
		{
			if(StringToTime(h1).after(StringToTime(h2)) || StringToTime(h1).equals(StringToTime(h2)))
				return false;
			else return true;
		}
		else return true;//cioè d1 viene prima di d2 e quindi va bene qualsiasi orario
	}
	
	public static boolean checkTime(String hour,String minute)
	{
		if(!minute.equals("") && !hour.equals(""))
		{
			int mm=-1; //inizializzo n a zero
			int hh=-1;
			
			try{
			   mm=Integer.parseInt(minute);
			   hh=Integer.parseInt(hour);
			                
			}catch(NumberFormatException e){}
			
			if(hh==-1 || mm==-1){}
			      
			else{
				if(mm>=0 && mm<60 && hh>=0 && hh<24)
					return true;
				else
					return false;
				}
		}	
			
	  return false;
	  }
	
	public static String timestampToString(Timestamp t){
		
		String time = t.toString();
		
		String anno=time.substring(0,4);
		String mese=time.substring(5,7);
		String giorno=time.substring(8,10);
		
		time = "<html>"+giorno+"/"+mese+"/"+anno+"<br>&nbsp;&nbsp;"+time.substring(11,19);
		
		return time;
	}
	

}

