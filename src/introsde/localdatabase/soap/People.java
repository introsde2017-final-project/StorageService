
package introsde.localdatabase.soap;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "People", targetNamespace = "http://soap.localdatabase.introsde/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface People {


    /**
     * 
     * @param personId
     * @return
     *     returns introsde.localdatabase.soap.Person
     */
    @WebMethod
    @WebResult(name = "person", targetNamespace = "")
    @RequestWrapper(localName = "readPerson", targetNamespace = "http://soap.localdatabase.introsde/", className = "introsde.localdatabase.soap.ReadPerson")
    @ResponseWrapper(localName = "readPersonResponse", targetNamespace = "http://soap.localdatabase.introsde/", className = "introsde.localdatabase.soap.ReadPersonResponse")
    @Action(input = "http://soap.localdatabase.introsde/People/readPersonRequest", output = "http://soap.localdatabase.introsde/People/readPersonResponse")
    public Person readPerson(
        @WebParam(name = "personId", targetNamespace = "")
        Long personId);

    /**
     * 
     * @return
     *     returns java.util.List<introsde.localdatabase.soap.Person>
     */
    @WebMethod
    @WebResult(name = "people", targetNamespace = "")
    @RequestWrapper(localName = "getPeopleList", targetNamespace = "http://soap.localdatabase.introsde/", className = "introsde.localdatabase.soap.GetPeopleList")
    @ResponseWrapper(localName = "getPeopleListResponse", targetNamespace = "http://soap.localdatabase.introsde/", className = "introsde.localdatabase.soap.GetPeopleListResponse")
    @Action(input = "http://soap.localdatabase.introsde/People/getPeopleListRequest", output = "http://soap.localdatabase.introsde/People/getPeopleListResponse")
    public List<Person> getPeopleList();

    /**
     * 
     * @param person
     */
    @WebMethod
    @RequestWrapper(localName = "createPerson", targetNamespace = "http://soap.localdatabase.introsde/", className = "introsde.localdatabase.soap.CreatePerson")
    @ResponseWrapper(localName = "createPersonResponse", targetNamespace = "http://soap.localdatabase.introsde/", className = "introsde.localdatabase.soap.CreatePersonResponse")
    @Action(input = "http://soap.localdatabase.introsde/People/createPersonRequest", output = "http://soap.localdatabase.introsde/People/createPersonResponse")
    public void createPerson(
        @WebParam(name = "person", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<Person> person);

    /**
     * 
     * @param person
     */
    @WebMethod
    @RequestWrapper(localName = "updatePerson", targetNamespace = "http://soap.localdatabase.introsde/", className = "introsde.localdatabase.soap.UpdatePerson")
    @ResponseWrapper(localName = "updatePersonResponse", targetNamespace = "http://soap.localdatabase.introsde/", className = "introsde.localdatabase.soap.UpdatePersonResponse")
    @Action(input = "http://soap.localdatabase.introsde/People/updatePersonRequest", output = "http://soap.localdatabase.introsde/People/updatePersonResponse")
    public void updatePerson(
        @WebParam(name = "person", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<Person> person);

    /**
     * 
     * @param personId
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "success", targetNamespace = "")
    @RequestWrapper(localName = "deletePerson", targetNamespace = "http://soap.localdatabase.introsde/", className = "introsde.localdatabase.soap.DeletePerson")
    @ResponseWrapper(localName = "deletePersonResponse", targetNamespace = "http://soap.localdatabase.introsde/", className = "introsde.localdatabase.soap.DeletePersonResponse")
    @Action(input = "http://soap.localdatabase.introsde/People/deletePersonRequest", output = "http://soap.localdatabase.introsde/People/deletePersonResponse")
    public int deletePerson(
        @WebParam(name = "personId", targetNamespace = "")
        Long personId);

    /**
     * 
     * @param personId
     * @param measureType
     * @return
     *     returns java.util.List<introsde.localdatabase.soap.Measure>
     */
    @WebMethod
    @WebResult(name = "measure", targetNamespace = "")
    @RequestWrapper(localName = "readPersonHistory", targetNamespace = "http://soap.localdatabase.introsde/", className = "introsde.localdatabase.soap.ReadPersonHistory")
    @ResponseWrapper(localName = "readPersonHistoryResponse", targetNamespace = "http://soap.localdatabase.introsde/", className = "introsde.localdatabase.soap.ReadPersonHistoryResponse")
    @Action(input = "http://soap.localdatabase.introsde/People/readPersonHistoryRequest", output = "http://soap.localdatabase.introsde/People/readPersonHistoryResponse")
    public List<Measure> readPersonHistory(
        @WebParam(name = "personId", targetNamespace = "")
        Long personId,
        @WebParam(name = "measureType", targetNamespace = "")
        String measureType);

    /**
     * 
     * @return
     *     returns java.util.List<introsde.localdatabase.soap.Measure>
     */
    @WebMethod
    @WebResult(name = "measure", targetNamespace = "")
    @RequestWrapper(localName = "readMeasureTypes", targetNamespace = "http://soap.localdatabase.introsde/", className = "introsde.localdatabase.soap.ReadMeasureTypes")
    @ResponseWrapper(localName = "readMeasureTypesResponse", targetNamespace = "http://soap.localdatabase.introsde/", className = "introsde.localdatabase.soap.ReadMeasureTypesResponse")
    @Action(input = "http://soap.localdatabase.introsde/People/readMeasureTypesRequest", output = "http://soap.localdatabase.introsde/People/readMeasureTypesResponse")
    public List<Measure> readMeasureTypes();

    /**
     * 
     * @param measureId
     * @param personId
     * @param measureType
     * @return
     *     returns introsde.localdatabase.soap.Measure
     */
    @WebMethod
    @WebResult(name = "measure", targetNamespace = "")
    @RequestWrapper(localName = "readPersonMeasure", targetNamespace = "http://soap.localdatabase.introsde/", className = "introsde.localdatabase.soap.ReadPersonMeasure")
    @ResponseWrapper(localName = "readPersonMeasureResponse", targetNamespace = "http://soap.localdatabase.introsde/", className = "introsde.localdatabase.soap.ReadPersonMeasureResponse")
    @Action(input = "http://soap.localdatabase.introsde/People/readPersonMeasureRequest", output = "http://soap.localdatabase.introsde/People/readPersonMeasureResponse")
    public Measure readPersonMeasure(
        @WebParam(name = "personId", targetNamespace = "")
        Long personId,
        @WebParam(name = "measureType", targetNamespace = "")
        String measureType,
        @WebParam(name = "measureId", targetNamespace = "")
        Long measureId);

    /**
     * 
     * @param measure
     * @param personId
     */
    @WebMethod
    @RequestWrapper(localName = "savePersonMeasure", targetNamespace = "http://soap.localdatabase.introsde/", className = "introsde.localdatabase.soap.SavePersonMeasure")
    @ResponseWrapper(localName = "savePersonMeasureResponse", targetNamespace = "http://soap.localdatabase.introsde/", className = "introsde.localdatabase.soap.SavePersonMeasureResponse")
    @Action(input = "http://soap.localdatabase.introsde/People/savePersonMeasureRequest", output = "http://soap.localdatabase.introsde/People/savePersonMeasureResponse")
    public void savePersonMeasure(
        @WebParam(name = "personId", targetNamespace = "")
        Long personId,
        @WebParam(name = "measure", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<Measure> measure);

    /**
     * 
     * @param measure
     * @param personId
     */
    @WebMethod
    @RequestWrapper(localName = "updatePersonMeasure", targetNamespace = "http://soap.localdatabase.introsde/", className = "introsde.localdatabase.soap.UpdatePersonMeasure")
    @ResponseWrapper(localName = "updatePersonMeasureResponse", targetNamespace = "http://soap.localdatabase.introsde/", className = "introsde.localdatabase.soap.UpdatePersonMeasureResponse")
    @Action(input = "http://soap.localdatabase.introsde/People/updatePersonMeasureRequest", output = "http://soap.localdatabase.introsde/People/updatePersonMeasureResponse")
    public void updatePersonMeasure(
        @WebParam(name = "personId", targetNamespace = "")
        Long personId,
        @WebParam(name = "measure", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<Measure> measure);

}