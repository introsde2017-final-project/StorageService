package introsde.storage.ws;

import javax.jws.WebService;
import javax.xml.ws.Holder;

import introsde.storage.ws.Storage;

//import introsde.storage.model.*;
import introsde.localdatabase.soap.*;
import introsde.localdatabase.soap.Person;
import introsde.adapter.ws.*;

@WebService(endpointInterface = "introsde.storage.ws.Storage",serviceName="StorageService")
public class StorageImpl implements Storage{
	
	AdapterService aService;
	Interface aInterface;
	PeopleService pService;
	People pInterface;
	
	
	public void initialize(){
		aService = new AdapterService();
		aInterface = aService.getImplementationPort();
		pService = new PeopleService();
		pInterface = pService.getPeopleImplPort();
	}


	@Override
	public Person createPerson(Person person) {
		initialize();
		
		introsde.adapter.ws.Person p = aInterface.createPerson();
		person.setAuthSecret(p.getAuthSecret());
		person.setAuthToken(p.getAuthToken());
		Holder<Person> holder=new Holder<Person>(person);
		pInterface.createPerson(holder);
		person = holder.value;
		return person;
	}





	
	

}
