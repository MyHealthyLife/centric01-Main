
package myhealthylife.dataservice.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the myhealthylife.dataservice.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetMeasureResponse_QNAME = new QName("http://soap.dataservice.myhealthylife/", "getMeasureResponse");
    private final static QName _ListPeople_QNAME = new QName("http://soap.dataservice.myhealthylife/", "listPeople");
    private final static QName _GetPersonByTelegramUsername_QNAME = new QName("http://soap.dataservice.myhealthylife/", "getPersonByTelegramUsername");
    private final static QName _GetMeasureHistoryResponse_QNAME = new QName("http://soap.dataservice.myhealthylife/", "getMeasureHistoryResponse");
    private final static QName _GetPersonByUsername_QNAME = new QName("http://soap.dataservice.myhealthylife/", "getPersonByUsername");
    private final static QName _DeleteMeasure_QNAME = new QName("http://soap.dataservice.myhealthylife/", "deleteMeasure");
    private final static QName _GetCurrentHealth_QNAME = new QName("http://soap.dataservice.myhealthylife/", "getCurrentHealth");
    private final static QName _MeasureHystory_QNAME = new QName("http://soap.dataservice.myhealthylife/", "measure_hystory");
    private final static QName _GetPersonResponse_QNAME = new QName("http://soap.dataservice.myhealthylife/", "getPersonResponse");
    private final static QName _UpdateMeasure_QNAME = new QName("http://soap.dataservice.myhealthylife/", "updateMeasure");
    private final static QName _GetMeasureHistory_QNAME = new QName("http://soap.dataservice.myhealthylife/", "getMeasureHistory");
    private final static QName _DeletePersonResponse_QNAME = new QName("http://soap.dataservice.myhealthylife/", "deletePersonResponse");
    private final static QName _GetMeasure_QNAME = new QName("http://soap.dataservice.myhealthylife/", "getMeasure");
    private final static QName _GetPersonByUsernameResponse_QNAME = new QName("http://soap.dataservice.myhealthylife/", "getPersonByUsernameResponse");
    private final static QName _DeleteMeasureResponse_QNAME = new QName("http://soap.dataservice.myhealthylife/", "deleteMeasureResponse");
    private final static QName _HealthProfile_QNAME = new QName("http://soap.dataservice.myhealthylife/", "healthProfile");
    private final static QName _GetPersonByTelegramUsernameResponse_QNAME = new QName("http://soap.dataservice.myhealthylife/", "getPersonByTelegramUsernameResponse");
    private final static QName _SaveMeasureResponse_QNAME = new QName("http://soap.dataservice.myhealthylife/", "saveMeasureResponse");
    private final static QName _GetCurrentHealthResponse_QNAME = new QName("http://soap.dataservice.myhealthylife/", "getCurrentHealthResponse");
    private final static QName _CurrentHealth_QNAME = new QName("http://soap.dataservice.myhealthylife/", "currentHealth");
    private final static QName _DeletePerson_QNAME = new QName("http://soap.dataservice.myhealthylife/", "deletePerson");
    private final static QName _ListPeopleResponse_QNAME = new QName("http://soap.dataservice.myhealthylife/", "listPeopleResponse");
    private final static QName _People_QNAME = new QName("http://soap.dataservice.myhealthylife/", "people");
    private final static QName _Person_QNAME = new QName("http://soap.dataservice.myhealthylife/", "person");
    private final static QName _RegisterResponse_QNAME = new QName("http://soap.dataservice.myhealthylife/", "registerResponse");
    private final static QName _GetPerson_QNAME = new QName("http://soap.dataservice.myhealthylife/", "getPerson");
    private final static QName _UpdatePersonResponse_QNAME = new QName("http://soap.dataservice.myhealthylife/", "updatePersonResponse");
    private final static QName _UpdatePerson_QNAME = new QName("http://soap.dataservice.myhealthylife/", "updatePerson");
    private final static QName _Register_QNAME = new QName("http://soap.dataservice.myhealthylife/", "register");
    private final static QName _SaveMeasure_QNAME = new QName("http://soap.dataservice.myhealthylife/", "saveMeasure");
    private final static QName _UpdateMeasureResponse_QNAME = new QName("http://soap.dataservice.myhealthylife/", "updateMeasureResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: myhealthylife.dataservice.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListPeople }
     * 
     */
    public ListPeople createListPeople() {
        return new ListPeople();
    }

    /**
     * Create an instance of {@link GetMeasureResponse }
     * 
     */
    public GetMeasureResponse createGetMeasureResponse() {
        return new GetMeasureResponse();
    }

    /**
     * Create an instance of {@link GetPersonByUsername }
     * 
     */
    public GetPersonByUsername createGetPersonByUsername() {
        return new GetPersonByUsername();
    }

    /**
     * Create an instance of {@link DeleteMeasure }
     * 
     */
    public DeleteMeasure createDeleteMeasure() {
        return new DeleteMeasure();
    }

    /**
     * Create an instance of {@link GetCurrentHealth }
     * 
     */
    public GetCurrentHealth createGetCurrentHealth() {
        return new GetCurrentHealth();
    }

    /**
     * Create an instance of {@link GetMeasureHistoryResponse }
     * 
     */
    public GetMeasureHistoryResponse createGetMeasureHistoryResponse() {
        return new GetMeasureHistoryResponse();
    }

    /**
     * Create an instance of {@link GetPersonByTelegramUsername }
     * 
     */
    public GetPersonByTelegramUsername createGetPersonByTelegramUsername() {
        return new GetPersonByTelegramUsername();
    }

    /**
     * Create an instance of {@link GetMeasureHistory }
     * 
     */
    public GetMeasureHistory createGetMeasureHistory() {
        return new GetMeasureHistory();
    }

    /**
     * Create an instance of {@link DeletePersonResponse }
     * 
     */
    public DeletePersonResponse createDeletePersonResponse() {
        return new DeletePersonResponse();
    }

    /**
     * Create an instance of {@link GetMeasure }
     * 
     */
    public GetMeasure createGetMeasure() {
        return new GetMeasure();
    }

    /**
     * Create an instance of {@link MeasureHistory }
     * 
     */
    public MeasureHistory createMeasureHistory() {
        return new MeasureHistory();
    }

    /**
     * Create an instance of {@link GetPersonResponse }
     * 
     */
    public GetPersonResponse createGetPersonResponse() {
        return new GetPersonResponse();
    }

    /**
     * Create an instance of {@link UpdateMeasure }
     * 
     */
    public UpdateMeasure createUpdateMeasure() {
        return new UpdateMeasure();
    }

    /**
     * Create an instance of {@link HealthProfile }
     * 
     */
    public HealthProfile createHealthProfile() {
        return new HealthProfile();
    }

    /**
     * Create an instance of {@link GetPersonByUsernameResponse }
     * 
     */
    public GetPersonByUsernameResponse createGetPersonByUsernameResponse() {
        return new GetPersonByUsernameResponse();
    }

    /**
     * Create an instance of {@link DeleteMeasureResponse }
     * 
     */
    public DeleteMeasureResponse createDeleteMeasureResponse() {
        return new DeleteMeasureResponse();
    }

    /**
     * Create an instance of {@link CurrentHealth }
     * 
     */
    public CurrentHealth createCurrentHealth() {
        return new CurrentHealth();
    }

    /**
     * Create an instance of {@link DeletePerson }
     * 
     */
    public DeletePerson createDeletePerson() {
        return new DeletePerson();
    }

    /**
     * Create an instance of {@link GetCurrentHealthResponse }
     * 
     */
    public GetCurrentHealthResponse createGetCurrentHealthResponse() {
        return new GetCurrentHealthResponse();
    }

    /**
     * Create an instance of {@link ListPeopleResponse }
     * 
     */
    public ListPeopleResponse createListPeopleResponse() {
        return new ListPeopleResponse();
    }

    /**
     * Create an instance of {@link GetPersonByTelegramUsernameResponse }
     * 
     */
    public GetPersonByTelegramUsernameResponse createGetPersonByTelegramUsernameResponse() {
        return new GetPersonByTelegramUsernameResponse();
    }

    /**
     * Create an instance of {@link SaveMeasureResponse }
     * 
     */
    public SaveMeasureResponse createSaveMeasureResponse() {
        return new SaveMeasureResponse();
    }

    /**
     * Create an instance of {@link People }
     * 
     */
    public People createPeople() {
        return new People();
    }

    /**
     * Create an instance of {@link GetPerson }
     * 
     */
    public GetPerson createGetPerson() {
        return new GetPerson();
    }

    /**
     * Create an instance of {@link UpdatePersonResponse }
     * 
     */
    public UpdatePersonResponse createUpdatePersonResponse() {
        return new UpdatePersonResponse();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link SaveMeasure }
     * 
     */
    public SaveMeasure createSaveMeasure() {
        return new SaveMeasure();
    }

    /**
     * Create an instance of {@link UpdateMeasureResponse }
     * 
     */
    public UpdateMeasureResponse createUpdateMeasureResponse() {
        return new UpdateMeasureResponse();
    }

    /**
     * Create an instance of {@link UpdatePerson }
     * 
     */
    public UpdatePerson createUpdatePerson() {
        return new UpdatePerson();
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link Measure }
     * 
     */
    public Measure createMeasure() {
        return new Measure();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.dataservice.myhealthylife/", name = "getMeasureResponse")
    public JAXBElement<GetMeasureResponse> createGetMeasureResponse(GetMeasureResponse value) {
        return new JAXBElement<GetMeasureResponse>(_GetMeasureResponse_QNAME, GetMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPeople }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.dataservice.myhealthylife/", name = "listPeople")
    public JAXBElement<ListPeople> createListPeople(ListPeople value) {
        return new JAXBElement<ListPeople>(_ListPeople_QNAME, ListPeople.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonByTelegramUsername }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.dataservice.myhealthylife/", name = "getPersonByTelegramUsername")
    public JAXBElement<GetPersonByTelegramUsername> createGetPersonByTelegramUsername(GetPersonByTelegramUsername value) {
        return new JAXBElement<GetPersonByTelegramUsername>(_GetPersonByTelegramUsername_QNAME, GetPersonByTelegramUsername.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeasureHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.dataservice.myhealthylife/", name = "getMeasureHistoryResponse")
    public JAXBElement<GetMeasureHistoryResponse> createGetMeasureHistoryResponse(GetMeasureHistoryResponse value) {
        return new JAXBElement<GetMeasureHistoryResponse>(_GetMeasureHistoryResponse_QNAME, GetMeasureHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonByUsername }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.dataservice.myhealthylife/", name = "getPersonByUsername")
    public JAXBElement<GetPersonByUsername> createGetPersonByUsername(GetPersonByUsername value) {
        return new JAXBElement<GetPersonByUsername>(_GetPersonByUsername_QNAME, GetPersonByUsername.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.dataservice.myhealthylife/", name = "deleteMeasure")
    public JAXBElement<DeleteMeasure> createDeleteMeasure(DeleteMeasure value) {
        return new JAXBElement<DeleteMeasure>(_DeleteMeasure_QNAME, DeleteMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentHealth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.dataservice.myhealthylife/", name = "getCurrentHealth")
    public JAXBElement<GetCurrentHealth> createGetCurrentHealth(GetCurrentHealth value) {
        return new JAXBElement<GetCurrentHealth>(_GetCurrentHealth_QNAME, GetCurrentHealth.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.dataservice.myhealthylife/", name = "measure_hystory")
    public JAXBElement<MeasureHistory> createMeasureHystory(MeasureHistory value) {
        return new JAXBElement<MeasureHistory>(_MeasureHystory_QNAME, MeasureHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.dataservice.myhealthylife/", name = "getPersonResponse")
    public JAXBElement<GetPersonResponse> createGetPersonResponse(GetPersonResponse value) {
        return new JAXBElement<GetPersonResponse>(_GetPersonResponse_QNAME, GetPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.dataservice.myhealthylife/", name = "updateMeasure")
    public JAXBElement<UpdateMeasure> createUpdateMeasure(UpdateMeasure value) {
        return new JAXBElement<UpdateMeasure>(_UpdateMeasure_QNAME, UpdateMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeasureHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.dataservice.myhealthylife/", name = "getMeasureHistory")
    public JAXBElement<GetMeasureHistory> createGetMeasureHistory(GetMeasureHistory value) {
        return new JAXBElement<GetMeasureHistory>(_GetMeasureHistory_QNAME, GetMeasureHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.dataservice.myhealthylife/", name = "deletePersonResponse")
    public JAXBElement<DeletePersonResponse> createDeletePersonResponse(DeletePersonResponse value) {
        return new JAXBElement<DeletePersonResponse>(_DeletePersonResponse_QNAME, DeletePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.dataservice.myhealthylife/", name = "getMeasure")
    public JAXBElement<GetMeasure> createGetMeasure(GetMeasure value) {
        return new JAXBElement<GetMeasure>(_GetMeasure_QNAME, GetMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonByUsernameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.dataservice.myhealthylife/", name = "getPersonByUsernameResponse")
    public JAXBElement<GetPersonByUsernameResponse> createGetPersonByUsernameResponse(GetPersonByUsernameResponse value) {
        return new JAXBElement<GetPersonByUsernameResponse>(_GetPersonByUsernameResponse_QNAME, GetPersonByUsernameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.dataservice.myhealthylife/", name = "deleteMeasureResponse")
    public JAXBElement<DeleteMeasureResponse> createDeleteMeasureResponse(DeleteMeasureResponse value) {
        return new JAXBElement<DeleteMeasureResponse>(_DeleteMeasureResponse_QNAME, DeleteMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HealthProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.dataservice.myhealthylife/", name = "healthProfile")
    public JAXBElement<HealthProfile> createHealthProfile(HealthProfile value) {
        return new JAXBElement<HealthProfile>(_HealthProfile_QNAME, HealthProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonByTelegramUsernameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.dataservice.myhealthylife/", name = "getPersonByTelegramUsernameResponse")
    public JAXBElement<GetPersonByTelegramUsernameResponse> createGetPersonByTelegramUsernameResponse(GetPersonByTelegramUsernameResponse value) {
        return new JAXBElement<GetPersonByTelegramUsernameResponse>(_GetPersonByTelegramUsernameResponse_QNAME, GetPersonByTelegramUsernameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.dataservice.myhealthylife/", name = "saveMeasureResponse")
    public JAXBElement<SaveMeasureResponse> createSaveMeasureResponse(SaveMeasureResponse value) {
        return new JAXBElement<SaveMeasureResponse>(_SaveMeasureResponse_QNAME, SaveMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentHealthResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.dataservice.myhealthylife/", name = "getCurrentHealthResponse")
    public JAXBElement<GetCurrentHealthResponse> createGetCurrentHealthResponse(GetCurrentHealthResponse value) {
        return new JAXBElement<GetCurrentHealthResponse>(_GetCurrentHealthResponse_QNAME, GetCurrentHealthResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrentHealth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.dataservice.myhealthylife/", name = "currentHealth")
    public JAXBElement<CurrentHealth> createCurrentHealth(CurrentHealth value) {
        return new JAXBElement<CurrentHealth>(_CurrentHealth_QNAME, CurrentHealth.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.dataservice.myhealthylife/", name = "deletePerson")
    public JAXBElement<DeletePerson> createDeletePerson(DeletePerson value) {
        return new JAXBElement<DeletePerson>(_DeletePerson_QNAME, DeletePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPeopleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.dataservice.myhealthylife/", name = "listPeopleResponse")
    public JAXBElement<ListPeopleResponse> createListPeopleResponse(ListPeopleResponse value) {
        return new JAXBElement<ListPeopleResponse>(_ListPeopleResponse_QNAME, ListPeopleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link People }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.dataservice.myhealthylife/", name = "people")
    public JAXBElement<People> createPeople(People value) {
        return new JAXBElement<People>(_People_QNAME, People.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.dataservice.myhealthylife/", name = "person")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.dataservice.myhealthylife/", name = "registerResponse")
    public JAXBElement<RegisterResponse> createRegisterResponse(RegisterResponse value) {
        return new JAXBElement<RegisterResponse>(_RegisterResponse_QNAME, RegisterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.dataservice.myhealthylife/", name = "getPerson")
    public JAXBElement<GetPerson> createGetPerson(GetPerson value) {
        return new JAXBElement<GetPerson>(_GetPerson_QNAME, GetPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.dataservice.myhealthylife/", name = "updatePersonResponse")
    public JAXBElement<UpdatePersonResponse> createUpdatePersonResponse(UpdatePersonResponse value) {
        return new JAXBElement<UpdatePersonResponse>(_UpdatePersonResponse_QNAME, UpdatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.dataservice.myhealthylife/", name = "updatePerson")
    public JAXBElement<UpdatePerson> createUpdatePerson(UpdatePerson value) {
        return new JAXBElement<UpdatePerson>(_UpdatePerson_QNAME, UpdatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Register }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.dataservice.myhealthylife/", name = "register")
    public JAXBElement<Register> createRegister(Register value) {
        return new JAXBElement<Register>(_Register_QNAME, Register.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.dataservice.myhealthylife/", name = "saveMeasure")
    public JAXBElement<SaveMeasure> createSaveMeasure(SaveMeasure value) {
        return new JAXBElement<SaveMeasure>(_SaveMeasure_QNAME, SaveMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.dataservice.myhealthylife/", name = "updateMeasureResponse")
    public JAXBElement<UpdateMeasureResponse> createUpdateMeasureResponse(UpdateMeasureResponse value) {
        return new JAXBElement<UpdateMeasureResponse>(_UpdateMeasureResponse_QNAME, UpdateMeasureResponse.class, null, value);
    }

}
