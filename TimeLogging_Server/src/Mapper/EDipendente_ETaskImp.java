package Mapper;

import java.sql.Timestamp;

import Condivisione.EntityCondivise.EConsulenteCondiviso;
import Condivisione.EntityCondivise.ETaskCondiviso;
import Condivisione.EntityCondivise.EntityCondivisa;

public class EDipendente_ETaskImp extends EntityCondivisa{

	int task;
	int dipendente;
	Timestamp assegnato;
	Timestamp revocato;
	public int getTask() {
		return task;
	}
	public void setTask(int task) {
		this.task = task;
	}
	public int getDipendente() {
		return dipendente;
	}
	public void setDipendente(int dipendente) {
		this.dipendente = dipendente;
	}
	public Timestamp getAssegnato() {
		return assegnato;
	}
	public void setAssegnato(Timestamp assegnato) {
		this.assegnato = assegnato;
	}
	public Timestamp getRevocato() {
		return revocato;
	}
	public void setRevocato(Timestamp revocato) {
		this.revocato = revocato;
	}
	
	
}
