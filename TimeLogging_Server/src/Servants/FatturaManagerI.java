package Servants;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.io.File;
import java.io.IOException;

import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;

import org.xml.sax.*;
import Condivisione.EntityCondivise.EClienteCondiviso;
import Condivisione.InterfacceCondivise._FatturaManagerDisp;
import EntityNonCondivise.XMLParserFactory;
import Ice.Current;

public class FatturaManagerI extends _FatturaManagerDisp {

	private String filepath = "fattura_cfg.xml";
	
	
	
	@Override
	public double getPercentualeGuadagno(Current __current) {
		// TODO Auto-generated method stub
		
		return XMLParserFactory.getIstance().getPercentualeGuadagno();
	}

	@Override
	public double getPercentualeScontoCliente(Current __current) {
		// TODO Auto-generated method stub
		return XMLParserFactory.getIstance().getPercentualeScontoCliente();
	}

	@Override
	public double getScontoSoglia(Current __current) {
		// TODO Auto-generated method stub
		
		return XMLParserFactory.getIstance().getScontoSoglia();
	}

	@Override
	public void setPercentualeGuadagno(double percentuale, Current __current) {
		// TODO Auto-generated method stub
		XMLParserFactory.getIstance().setPercentualeGuadagno(percentuale);
	}

	@Override
	public void setPercentualeScontoCliente(double percentuale,
			Current __current) {
		// TODO Auto-generated method stub
		
		XMLParserFactory.getIstance().setPercentualeScontoCliente(percentuale);
	}

	@Override
	public void setScontoSoglia(double soglia, Current __current) {
		// TODO Auto-generated method stub
		
		XMLParserFactory.getIstance().setScontoSoglia(soglia);
	}
	@Override
	public boolean nuovoCliente(EClienteCondiviso cliente, Current __current) {
		// TODO Auto-generated method stub
		try{
			foundation.EProgetto[] foundationEProgetto = foundation.EProgettoDAO.listEProgettoByQuery("EClienteID="+cliente.id, null);
			if (foundationEProgetto.length==1)
				return true;
			}
			catch (Exception e) {
			e.printStackTrace();
			}	
		return false;
	}
	@Override
	public double getSoglia(Current __current) {
		// TODO Auto-generated method stub
		return XMLParserFactory.getIstance().getSoglia();
	}

	@Override
	public void setSoglia(double soglia, Current __current) {
		// TODO Auto-generated method stub
		XMLParserFactory.getIstance().setSoglia(soglia);
	}
	
	

}
