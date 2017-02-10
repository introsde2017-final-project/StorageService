package introsde.storage.ws;

import java.util.List;

import javax.jws.WebService;
import javax.xml.ws.Holder;

import introsde.storage.ws.Storage;

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


	@Override
	public List<Person> getPeople() {
		initialize();
		return pInterface.getPeopleList();
	}


	@Override
	public Person readPerson(Long id) {
		initialize();
		return pInterface.readPerson(id);
	}


	@Override
	public Person updatePerson(Person person) {
		initialize();
		Holder<Person> holder=new Holder<Person>(person);
		pInterface.updatePerson(holder);
		return holder.value;
	}


	@Override
	public int deletePerson(Long id) {
		initialize();
		return pInterface.deletePerson(id);
	}

	@Override
	public Person getPersonByChatId(Long chatId) {
		initialize();
		return pInterface.getPersonByChatId(chatId);
	}

	@Override
	public List<Measure> readPersonHistory(Long id, String measureType) {
		initialize();
		return pInterface.readPersonHistory(id, measureType);
	}


	@Override
	public List<Measure> readMeasureTypes() {
		initialize();
		return pInterface.readMeasureTypes();
	}


	@Override
	public Measure readPersonMeasure(Long id, String measureType, Long mid) {
		initialize();
		return pInterface.readPersonMeasure(id, measureType, mid);
	}


	@Override
	public Measure savePersonMeasure(Long id, Measure measure) {
		initialize();
		if(measure.getMeasureType().equals("weight")){
			Person p = pInterface.readPerson(id);
			introsde.adapter.ws.Person person = new introsde.adapter.ws.Person();
			person.setAuthSecret(p.getAuthSecret());
			person.setAuthToken(p.getAuthToken());
			System.out.println(Double.parseDouble(measure.getMeasureValue()));
			aInterface.weightUpdate(person, Double.parseDouble(measure.getMeasureValue()));
		}
		Holder<Measure> holder=new Holder<Measure>(measure);
		pInterface.savePersonMeasure(id, holder);
		return holder.value;
	}


	@Override
	public Measure updatePersonMeasure(Long id, Measure measure) {
		return null;
	}


	@Override
	public List<Exercise> getExercises() {
		initialize();
		return aInterface.getExercises();
	}


	@Override
	public Food getFood(int id) {
		initialize();
		return aInterface.getFood(id);
	}


	@Override
	public List<Food> searchFood(String s) {
		initialize();
		return aInterface.searchFood(s);
	}


	@Override
	public boolean setInfo(Person user, double weight, double height, double weight_goal) {
		initialize();
		introsde.adapter.ws.Person person = new introsde.adapter.ws.Person();
		person.setAuthSecret(user.getAuthSecret());
		person.setAuthToken(user.getAuthToken());
		return aInterface.setInfo(person, weight, height, weight_goal);
	}


	@Override
	public List<Exercise> getExerciseEntry(Person user, int date) {
		initialize();
		introsde.adapter.ws.Person person = new introsde.adapter.ws.Person();
		person.setAuthSecret(user.getAuthSecret());
		person.setAuthToken(user.getAuthToken());
		return aInterface.getExerciseEntry(person, date);
	}


	@Override
	public boolean editExerciseEntry(Person user, int id, int minutes) {
		initialize();
		introsde.adapter.ws.Person person = new introsde.adapter.ws.Person();
		person.setAuthSecret(user.getAuthSecret());
		person.setAuthToken(user.getAuthToken());
		return aInterface.editExerciseEntry(person, id, minutes,false);
	}
	
	@Override
	public boolean removeSleepTime(Person user, int minutes) {
		initialize();
		introsde.adapter.ws.Person person = new introsde.adapter.ws.Person();
		person.setAuthSecret(user.getAuthSecret());
		person.setAuthToken(user.getAuthToken());
		
		// Add the minutes to the Resting (id=2) exercise
		return aInterface.editExerciseEntry(person, 2, minutes,true);
	}


	@Override
	public boolean saveTemplate(Person user, int days) {
		initialize();
		introsde.adapter.ws.Person person = new introsde.adapter.ws.Person();
		person.setAuthSecret(user.getAuthSecret());
		person.setAuthToken(user.getAuthToken());
		return aInterface.saveTemplate(person, days);
	}


	@Override
	public boolean commitDay(Person user) {
		initialize();
		introsde.adapter.ws.Person person = new introsde.adapter.ws.Person();
		person.setAuthSecret(user.getAuthSecret());
		person.setAuthToken(user.getAuthToken());
		return aInterface.commitDay(person);
	}


	@Override
	public Recipe getRecipe(int id) {
		initialize();
		return aInterface.getRecipe(id);
	}


	@Override
	public List<Recipe> searchRecipes(String s) {
		initialize();
		return aInterface.searchRecipes(s);
	}


}
