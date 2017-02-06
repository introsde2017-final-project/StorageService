package introsde.storage.ws;


import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import introsde.adapter.ws.Exercise;
import introsde.adapter.ws.Food;
import introsde.adapter.ws.Recipe;
import introsde.localdatabase.soap.Measure;
import introsde.localdatabase.soap.Person;



@WebService
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL) //optional
public interface Storage {
    
	@WebMethod(operationName="createPerson")
	@WebResult(name="person") 
	public Person createPerson(@WebParam(name="person") Person person);
	
    @WebMethod(operationName="getPeopleList")
    @WebResult(name="people")
    public List<Person> getPeople();
    
    @WebMethod(operationName="readPerson")
    @WebResult(name="person") 
    public Person readPerson(@WebParam(name="idPerson") Long id);
    
    @WebMethod(operationName="updatePerson")
    @WebResult(name="person") 
    public Person updatePerson(@WebParam(name="person") Person person);
    
    @WebMethod(operationName="deletePerson")
    @WebResult(name="success") 
    public int deletePerson(@WebParam(name="idPerson") Long id);
    
    @WebMethod(operationName="getPersonByChatId")
    @WebResult(name="person") 
    public Person getPersonByChatId(@WebParam(name="chatId") Long chatId);
    
    @WebMethod(operationName="readPersonHistory")
    @WebResult(name="measure") 
    public List<Measure> readPersonHistory(@WebParam(name="idPerson") Long id, @WebParam(name="measureType") String measureType);
    
    @WebMethod(operationName="readMeasureTypes")
    @WebResult(name="measure") 
    public List<Measure> readMeasureTypes();
    
    @WebMethod(operationName="readPersonMeasure")
    @WebResult(name="measure") 
    public Measure readPersonMeasure(@WebParam(name="idPerson") Long id, @WebParam(name="measureType") String measureType, @WebParam(name="measureId") Long mid);
    
    @WebMethod(operationName="savePersonMeasure")
    @WebResult(name="measure") 
    public Measure savePersonMeasure(@WebParam(name="idPerson") Long id, @WebParam(name="measure") Measure measure);
   
    @WebMethod(operationName="updatePersonMeasure")
    @WebResult(name="measure") 
    public Measure updatePersonMeasure(@WebParam(name="idPerson") Long id, @WebParam(name="measure") Measure measure);
    
//    @WebMethod(operationName="getAuth_info")
//    public Person get_auth(@WebParam(name="personId") int id);	
    
    @WebMethod(operationName="setInfo")
    @WebResult(name="success") 
    public boolean setInfo(@WebParam(name="user") Person user, @WebParam(name="weight") double weight, @WebParam(name="height") double height, @WebParam(name="weight_goal") double weight_goal);
    
    @WebMethod(operationName="getExercises")
    @WebResult(name="exercises") 
    public List<Exercise> getExercises();
    
    @WebMethod(operationName="getFood")
    @WebResult(name="food") 
    public Food getFood(@WebParam(name="foodId") int id);
    
    @WebMethod(operationName="searchFood")
    @WebResult(name="foods") 
    public List<Food> searchFood(@WebParam(name="text") String s);
    
    //Recipes
    @WebMethod(operationName="getRecipe")
    @WebResult(name="recipe") 
    public Recipe getRecipe(@WebParam(name="recipeId") int id);
    
    @WebMethod(operationName="searchRecipes")
    @WebResult(name="recipes") 
    public List<Recipe> searchRecipes(@WebParam(name="text") String s);
    
    //Exercise Diary
    @WebMethod(operationName="getExerciseEntry")
    public List<Exercise> getExerciseEntry(@WebParam(name="user") Person user, @WebParam(name="date") int date);
    
    @WebMethod(operationName="editExerciseEntry")
    public boolean editExerciseEntry(@WebParam(name="user") Person user, @WebParam(name="id_exercise") int id, @WebParam(name="minutes") int minutes);
    
    @WebMethod(operationName="saveTemplate")
    public boolean saveTemplate(@WebParam(name="user") Person user, @WebParam(name="days") int days);
    
    @WebMethod(operationName="commitDay")
    public boolean commitDay(@WebParam(name="user") Person user);

    
}
