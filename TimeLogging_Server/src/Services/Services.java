package Services;
import java.sql.Timestamp;
import java.text.ParseException;
import java.util.ArrayList;
import org.hibernate.HibernateException;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import Condivisione.EntityCondivise.EDipendenteCondiviso;
import Condivisione.EntityCondivise.EProgettoCondiviso;
import foundation.EProgetto;
import foundation.ESottoprogetto;
import foundation.ETask;
import foundation.ETimeRecordLavorativo;
import foundation.ETimeRecordNL;
public class Services {
	public static ArrayList<ETimeRecordLavorativo> timerecordLavorativoDipendente(int idprogetto,
			int idsottoprogetto, int idtask, String dal, String al,EDipendenteCondiviso dip){
		
	
		Timestamp inizio=null;
		Timestamp fine=null;
		ArrayList<ETimeRecordLavorativo> tr = null;
		
		String sql="select * from etimerecordlavorativo,edipendente_etask ";
		if(idtask!=0)
		{
			sql=sql+"where edipendente_etask.ETaskID=etimerecordlavorativo.ETaskID and etimerecordlavorativo.ETaskID="+idtask+" and";
		}
		else if(idsottoprogetto!=0)
		{
			sql=sql+",etask where edipendente_etask.ETaskID=etimerecordlavorativo.ETaskID and " +
					"etask.ID=etimerecordlavorativo.ETaskID and etask.ESottoprogettoID="+idsottoprogetto+" and";
		}
		else if(idprogetto!=0)
		{
			sql=sql+",etask,esottoprogetto where edipendente_etask.ETaskID=etimerecordlavorativo.ETaskID and " +
					"esottoprogetto.ID=etask.ESottoprogettoID and " +
					"etask.ID=etimerecordlavorativo.ETaskID and esottoprogetto.EProgettoID="+idprogetto+" and";	
		}
		else
			sql=sql+"where edipendente_etask.ETaskID=etimerecordlavorativo.ETaskID and ";
		try {
			inizio=MyDateTime.stringToTimestamp(dal, "00", "00");
			fine=MyDateTime.stringToTimestamp(al, "23", "59");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			
		}
		
		sql=sql+" etimerecordlavorativo.inizio between '"+inizio.toString()+"' and '"+fine.toString()+ "' " +
				"and edipendente_etask.EDipendenteID="+dip.id+" order by etimerecordlavorativo.inizio desc";
		System.out.println(sql);
		try {
			tr = (ArrayList<ETimeRecordLavorativo>)  foundation.TimeLoggingPersistentManager.instance().getSession().createSQLQuery(sql).addEntity("ETimeRecordLavorativo",ETimeRecordLavorativo.class).list();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return tr;
	}
		
	
	
	public static ArrayList<ETimeRecordNL> timerecordNLDipendente(String dal, String al, String categoria,EDipendenteCondiviso dip){
			
		
		Timestamp inizio=null;
		Timestamp fine=null;
		ArrayList<ETimeRecordNL> tr = null;
		
		String sql="select * from etimerecordnl where";
		if(!categoria.equals("-- Select Categoria --"))
		{
			sql=sql+" Categoria='"+categoria+"' and";
		}
		
		try {
			inizio=MyDateTime.stringToTimestamp(dal, "00", "00");
			fine=MyDateTime.stringToTimestamp(al, "23", "59");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			
		}
		
		sql=sql+" etimerecordnl.inizio between '"+inizio.toString()+"' and '"+fine.toString()+ "' and EDipendenteID="+dip.id+" order by etimerecordnl.inizio desc";
		
		try {
			tr = (ArrayList<ETimeRecordNL>) foundation.TimeLoggingPersistentManager.instance().getSession().createSQLQuery(sql).addEntity("ETimeRecordNL",ETimeRecordNL.class).list();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return tr;
	}
	
	public static ArrayList<ETimeRecordLavorativo> queryTRDipendente(int id_dip, int id_tr){
		
		
		ArrayList<ETimeRecordLavorativo> tr = null;
		String sql;
		
		if (id_tr==0)
			{
			sql="select etimerecordlavorativo.ID, etimerecordlavorativo.ETaskID, etimerecordlavorativo.Inizio, etimerecordlavorativo.Fine, etimerecordlavorativo.Commento " +
						"from etimerecordlavorativo,edipendente_etask,etask,edipendente " +
						"where edipendente_etask.EDipendenteID=edipendente.ID and " +
						"edipendente_etask.ETaskID=etask.ID and " +
						"etimerecordlavorativo.ETaskID=etask.ID and " +
						"edipendente_etask.EDipendenteID="+id_dip;
			}
		else 
			{
			sql="select etimerecordlavorativo.ID, etimerecordlavorativo.ETaskID, etimerecordlavorativo.Inizio, etimerecordlavorativo.Fine, etimerecordlavorativo.Commento " +
					"from etimerecordlavorativo,edipendente_etask,etask,edipendente " +
					"where edipendente_etask.EDipendenteID=edipendente.ID and " +
					"edipendente_etask.ETaskID=etask.ID and " +
					"etimerecordlavorativo.ETaskID=etask.ID and " +
					"edipendente_etask.EDipendenteID="+id_dip+ " and etimerecordlavorativo.ID <> "+id_tr;
					
					
			}
		
		
		try {
			tr = (ArrayList<ETimeRecordLavorativo>) foundation.TimeLoggingPersistentManager.instance().getSession().createSQLQuery(sql).addEntity("ETimeRecordLavorativo",ETimeRecordLavorativo.class).list();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return tr;
		
}
	
	
	public static ArrayList<EProgetto> queryProgettiDipendente(EDipendenteCondiviso dipendente,boolean abilitati)
	{
		String sql="select * from eprogetto";
		if(dipendente.getTag().equals("admin"))
		{
			sql=sql+" where EDipendenteID="+dipendente.id;
		}
		else if(dipendente.getTag().equals("manager"))
		{
			sql=sql+" ,esottoprogetto where eprogetto.ID=esottoprogetto.EProgettoID and esottoprogetto.EDipendenteID="+dipendente.id;
		}
		else
		{
			sql=sql+" ,esottoprogetto,etask,edipendente_etask where edipendente_etask.ETaskID=etask.ID and eprogetto.ID=esottoprogetto.EProgettoID and " +
					" esottoprogetto.ID=etask.ESottoprogettoID and edipendente_etask.EDipendenteID="+dipendente.id;	
		}
		java.util.Date date= new java.util.Date(); 
		Timestamp ora_attuale=new Timestamp(date.getTime());
		if(abilitati)
		{
		sql=sql+" and '"+ora_attuale+"' BETWEEN etask.Inizio AND etask.Scadenza ";
		}	
		sql=sql+" GROUP BY eprogetto.id";
		ArrayList<EProgetto> progetti = null;
		try {
			progetti = (ArrayList<EProgetto>) foundation.TimeLoggingPersistentManager.instance().getSession().createSQLQuery(sql).addEntity("EProgetto",EProgetto.class).list();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return progetti;
	}
	
	public static ArrayList<ESottoprogetto> querySottoprogettiDipendente(int idprogetto,EDipendenteCondiviso dipendente,boolean abilitati)
	{
		String sql="select * from esottoprogetto";
		if(dipendente.getTag().equals("admin"))
		{
			sql=sql+" where EProgettoID="+idprogetto;
		}
		else if(dipendente.getTag().equals("manager"))
		{
			sql=sql+" where EProgettoID="+idprogetto+" and esottoprogetto.EDipendenteID="+dipendente.id;
		}
		else
		{
			sql=sql+",etask,edipendente_etask where edipendente_etask.ETaskID=etask.ID and esottoprogetto.ID=etask.ESottoprogettoID and " +
					"EProgettoID="+idprogetto+" and edipendente_etask.EDipendenteID="+dipendente.id;
		}
		
		java.util.Date date= new java.util.Date(); 
		Timestamp ora_attuale=new Timestamp(date.getTime());
		if(abilitati)
		{
		sql=sql+" and '"+ora_attuale+"' BETWEEN etask.Inizio AND etask.Scadenza ";
		}	
		sql=sql+" GROUP BY esottoprogetto.id";
		ArrayList<ESottoprogetto> sprogetti = null;
		try {
			sprogetti = (ArrayList<ESottoprogetto>) foundation.TimeLoggingPersistentManager.instance().getSession().createSQLQuery(sql).addEntity("ESottoprogetto",ESottoprogetto.class).list();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sprogetti;
	}
	
	public static ArrayList<ETask> queryTaskDipendente(int idsprogetto,boolean abilitati,EDipendenteCondiviso dipendente)
	{
		String sql="select * from etask";
		java.util.Date date= new java.util.Date(); 
		Timestamp ora_attuale=new Timestamp(date.getTime());
		if(dipendente.getTag().equals("consulente"))
		{
			sql=sql+" ,edipendente_etask where edipendente_etask.ETaskID=etask.ID and etask.ESottoprogettoID="+idsprogetto+
					" and edipendente_etask.EDipendenteID="+dipendente.id;
			if(abilitati)
			{
			sql=sql+" and '"+ora_attuale+"' BETWEEN etask.Inizio AND etask.Scadenza";
			}	
		}
		else
		{
			sql=sql+" where ESottoprogettoID="+idsprogetto;
		}
		ArrayList<ETask> task = null;
		try {
			task = (ArrayList<ETask>) foundation.TimeLoggingPersistentManager.instance().getSession().createSQLQuery(sql).addEntity("ETask",ETask.class).list();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return task;
	}
	
	
}
