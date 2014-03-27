package Servants;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;

import org.xml.sax.*;
import org.w3c.dom.*;
import Condivisione.EntityCondivise.EClienteCondiviso;
import Condivisione.InterfacceCondivise._FatturaManagerDisp;
import Ice.Current;
import Mapper.EntityMappersFactory;

public class FatturaManagerI extends _FatturaManagerDisp {

	private String filepath = "fattura_cfg.xml";
	
	private String getTextValue(String def, Element doc, String tag) {
	    String value = def;
	    NodeList nl;
	    nl = doc.getElementsByTagName(tag);
	    if (nl.getLength() > 0 && nl.item(0).hasChildNodes()) {
	        value = nl.item(0).getFirstChild().getNodeValue();
	    }
	    return value;
	}
	
	@Override
	public double getPercentualeGuadagno(Current __current) {
		// TODO Auto-generated method stub
		String role1=null;
        Document dom;
        // Make an  instance of the DocumentBuilderFactory
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            // use the factory to take an instance of the document builder
            DocumentBuilder db = dbf.newDocumentBuilder();
            // parse using the builder to get the DOM mapping of the    
            // XML file
            dom = db.parse(filepath);    
            Element doc = dom.getDocumentElement();
            role1 = getTextValue(role1, doc, "PercentualeGuadagno");
            return Double.parseDouble(role1);
           
        } catch (ParserConfigurationException pce) {
            System.out.println(pce.getMessage());
        } catch (SAXException se) {
            System.out.println(se.getMessage());
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
	
		return 0;
	}

	@Override
	public double getPercentualeScontoCliente(Current __current) {
		// TODO Auto-generated method stub
		
		String role1=null;
        Document dom;
        // Make an  instance of the DocumentBuilderFactory
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            // use the factory to take an instance of the document builder
            DocumentBuilder db = dbf.newDocumentBuilder();
            // parse using the builder to get the DOM mapping of the    
            // XML file
            dom = db.parse(filepath);    
            Element doc = dom.getDocumentElement();
            role1 = getTextValue(role1, doc, "PercentualeScontoCliente");
            return Double.parseDouble(role1);
           
        } catch (ParserConfigurationException pce) {
            System.out.println(pce.getMessage());
        } catch (SAXException se) {
            System.out.println(se.getMessage());
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
	
		return 0;
	}

	@Override
	public double getScontoSoglia(Current __current) {
		// TODO Auto-generated method stub
		String role1=null;
        Document dom;
        // Make an  instance of the DocumentBuilderFactory
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            // use the factory to take an instance of the document builder
            DocumentBuilder db = dbf.newDocumentBuilder();
            // parse using the builder to get the DOM mapping of the    
            // XML file
            dom = db.parse(filepath);    
            Element doc = dom.getDocumentElement();
            role1 = getTextValue(role1, doc, "ScontoSoglia");
            return Double.parseDouble(role1);
           
        } catch (ParserConfigurationException pce) {
            System.out.println(pce.getMessage());
        } catch (SAXException se) {
            System.out.println(se.getMessage());
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
	
		return 0;
	}

	@Override
	public void setPercentualeGuadagno(double percentuale, Current __current) {
		// TODO Auto-generated method stub
		try {
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(filepath);
			Node role = doc.getElementsByTagName("PercentualeGuadagno").item(0);
			role.setTextContent(Double.toString(percentuale));
			
			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File(filepath));
			transformer.transform(source, result);
	 
		   } catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		   } catch (TransformerException tfe) {
			tfe.printStackTrace();
		   } catch (IOException ioe) {
			ioe.printStackTrace();
		   } catch (SAXException sae) {
			sae.printStackTrace();
		   }
	}

	@Override
	public void setPercentualeScontoCliente(double percentuale,
			Current __current) {
		// TODO Auto-generated method stub
		
		try {
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(filepath);
			
			Node role = doc.getElementsByTagName("PercentualeScontoCliente").item(0);
			role.setTextContent(Double.toString(percentuale));
			
			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File(filepath));
			transformer.transform(source, result);
	 
		   } catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		   } catch (TransformerException tfe) {
			tfe.printStackTrace();
		   } catch (IOException ioe) {
			ioe.printStackTrace();
		   } catch (SAXException sae) {
			sae.printStackTrace();
		   }
		
	}

	@Override
	public void setScontoSoglia(double soglia, Current __current) {
		// TODO Auto-generated method stub
		
		try {
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(filepath);
			
			Node role = doc.getElementsByTagName("ScontoSoglia").item(0);
			role.setTextContent(Double.toString(soglia));
			
			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File(filepath));
			transformer.transform(source, result);
			
		   } catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		   } catch (TransformerException tfe) {
			tfe.printStackTrace();
		   } catch (IOException ioe) {
			ioe.printStackTrace();
		   } catch (SAXException sae) {
			sae.printStackTrace();
		   }
		
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
		
		String role1=null;
        Document dom;
        // Make an  instance of the DocumentBuilderFactory
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            // use the factory to take an instance of the document builder
            DocumentBuilder db = dbf.newDocumentBuilder();
            // parse using the builder to get the DOM mapping of the    
            // XML file
            dom = db.parse(filepath);    
            Element doc = dom.getDocumentElement();
            role1 = getTextValue(role1, doc, "Soglia");
            return Double.parseDouble(role1);
           
        } catch (ParserConfigurationException pce) {
            System.out.println(pce.getMessage());
        } catch (SAXException se) {
            System.out.println(se.getMessage());
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
	
		return 0;
	}

	@Override
	public void setSoglia(double soglia, Current __current) {
		// TODO Auto-generated method stub
		try {
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(filepath);
			Node role = doc.getElementsByTagName("Soglia").item(0);
			role.setTextContent(Double.toString(soglia));
			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File(filepath));
			transformer.transform(source, result);
		   } catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		   } catch (TransformerException tfe) {
			tfe.printStackTrace();
		   } catch (IOException ioe) {
			ioe.printStackTrace();
		   } catch (SAXException sae) {
			sae.printStackTrace();
		   }
		
	}
	
	

}
