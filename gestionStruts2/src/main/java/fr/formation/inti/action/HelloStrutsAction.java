package fr.formation.inti.action;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.ActionSupport;

import fr.formation.inti.model.MessageStore;

public class HelloStrutsAction extends ActionSupport{
	private final static Log log = LogFactory.getLog(HelloStrutsAction.class);
	private MessageStore messageStore;
	private String name;
	private Personne personne;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String execute() throws Exception{
		log.debug("----- Personne :"+ personne);
		log.debug("----- messageStore :" + messageStore);
		log.debug("----- name :"+ name);
		if(messageStore == null)
			messageStore = new MessageStore();
		
		return "success";
	}

	public MessageStore getMessageStore() {
		return messageStore;
	}

	public void setMessageStore(MessageStore messageStore) {
		this.messageStore = messageStore;
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}


	public void validate(){
	    if (personne.getFirstName().length() == 0) {
	        addFieldError("personne.firstName", "First name is required.");
	    }
	    if (personne.getLastName().length() == 0) {
	        addFieldError("personne.lastName", "Last name is required.");
	    }
	    if (personne.getTitle().length() == 0) {
	        addFieldError("personne.title", "title is required.");
	    }
	    
	    if (personne.getAge() == null) {
	  	        addFieldError("personne.age", "Age is required and must be 18 or older");
	  	    }
	   if (personne.getEmail().length() == 0) {
	       addFieldError("personne.email", "Email is required.");
	   }
	   if (personne.getStartDate() == null) {
			       addFieldError("personne.startDate", "start date is required ");
			    }
	
	  if (personne.getGender() == null) {
	       addFieldError("personne.gender", "Gender  is required.");
	   }
	   if (personne.getPlace() == null) {
	       addFieldError("personne.place", "Place is required.");
	  }
	}
	
	
}
