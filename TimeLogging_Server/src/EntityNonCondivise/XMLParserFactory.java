package EntityNonCondivise;

import java.util.ArrayList;

import Condivisione.EntityCondivise.EDipendenteCondiviso;

public class XMLParserFactory {

	private String fattura_cfg_file="src/xml/fattura_cfg.xml";
	private String network_cfg_file="src/xml/network_cfg.xml";
	private static XMLParserFactory istanza=null;
	
	protected XMLParserFactory()
	{
		
	}
		
	public static XMLParserFactory getIstance()
	{
		if(istanza==null)
		{
			istanza= new XMLParserFactory();
		}
		 return istanza;
	}

	//metodi get e set
	public double getPercentualeGuadagno()
	{
		XMLParser.getIstance().setFileName(fattura_cfg_file);
		return Double.parseDouble((XMLParser.getIstance().getNodeValue("PercentualeGuadagno")));
	}
	
	public double getPercentualeScontoCliente()
	{
		XMLParser.getIstance().setFileName(fattura_cfg_file);
		return Double.parseDouble(XMLParser.getIstance().getNodeValue("PercentualeScontoCliente"));
	}
	
	public double getScontoSoglia()
	{XMLParser.getIstance().setFileName(fattura_cfg_file);
	 return Double.parseDouble(XMLParser.getIstance().getNodeValue("ScontoSoglia"));
	}
	
	public double getSoglia()
	{
		XMLParser.getIstance().setFileName(fattura_cfg_file);
		return Double.parseDouble(XMLParser.getIstance().getNodeValue("Soglia"));
	}
	
	public void setPercentualeGuadagno(double pg){
		XMLParser.getIstance().setFileName(fattura_cfg_file);
		XMLParser.getIstance().setValueNode("PercentualeGuadagno",Double.toString(pg));
	}
	
	public void setPercentualeScontoCliente(double sc){
		XMLParser.getIstance().setFileName(fattura_cfg_file);
		XMLParser.getIstance().setValueNode("PercentualeScontoCliente",Double.toString(sc));
	}
	
	public void setScontoSoglia(double ss){
		
		XMLParser.getIstance().setFileName(fattura_cfg_file);
		XMLParser.getIstance().setValueNode("ScontoSoglia",Double.toString(ss));
		
		
	}
	
	public void setSoglia(double s){
		
		XMLParser.getIstance().setFileName(fattura_cfg_file);
		XMLParser.getIstance().setValueNode("Soglia",Double.toString(s));
	}
	
	public String getHost()
	{
		XMLParser.getIstance().setFileName(network_cfg_file);
		return XMLParser.getIstance().getNodeValue("host");
	}
	
	public String getPort()
	{
		XMLParser.getIstance().setFileName(network_cfg_file);
		return XMLParser.getIstance().getNodeValue("port");
	}
	
	public String getProtocol()
	{
		XMLParser.getIstance().setFileName(network_cfg_file);
		return XMLParser.getIstance().getNodeValue("protocol");
	}
	
	
}
