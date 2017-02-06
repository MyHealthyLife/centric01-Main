
package myhealthylife.sentencegenerator.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the myhealthylife.sentencegenerator.soap package. 
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

    private final static QName _Sentence_QNAME = new QName("http://soap.sentencegenerator.myhealthylife/", "sentence");
    private final static QName _UpdateSentenceResponse_QNAME = new QName("http://soap.sentencegenerator.myhealthylife/", "updateSentenceResponse");
    private final static QName _CreateSentenceType_QNAME = new QName("http://soap.sentencegenerator.myhealthylife/", "createSentenceType");
    private final static QName _UpdateSentence_QNAME = new QName("http://soap.sentencegenerator.myhealthylife/", "updateSentence");
    private final static QName _SentenceTypes_QNAME = new QName("http://soap.sentencegenerator.myhealthylife/", "sentenceTypes");
    private final static QName _SetSentenceTypeResponse_QNAME = new QName("http://soap.sentencegenerator.myhealthylife/", "setSentenceTypeResponse");
    private final static QName _ReadRandomSentenceByTypeResponse_QNAME = new QName("http://soap.sentencegenerator.myhealthylife/", "readRandomSentenceByTypeResponse");
    private final static QName _ReadSentenceResponse_QNAME = new QName("http://soap.sentencegenerator.myhealthylife/", "readSentenceResponse");
    private final static QName _CreateSentence_QNAME = new QName("http://soap.sentencegenerator.myhealthylife/", "createSentence");
    private final static QName _DeleteSentenceTypeResponse_QNAME = new QName("http://soap.sentencegenerator.myhealthylife/", "deleteSentenceTypeResponse");
    private final static QName _SentenceType_QNAME = new QName("http://soap.sentencegenerator.myhealthylife/", "sentenceType");
    private final static QName _DeleteSentenceResponse_QNAME = new QName("http://soap.sentencegenerator.myhealthylife/", "deleteSentenceResponse");
    private final static QName _SetSentenceType_QNAME = new QName("http://soap.sentencegenerator.myhealthylife/", "setSentenceType");
    private final static QName _ReadRandomSentenceResponse_QNAME = new QName("http://soap.sentencegenerator.myhealthylife/", "readRandomSentenceResponse");
    private final static QName _Sentences_QNAME = new QName("http://soap.sentencegenerator.myhealthylife/", "sentences");
    private final static QName _DeleteSentence_QNAME = new QName("http://soap.sentencegenerator.myhealthylife/", "deleteSentence");
    private final static QName _ReadSentenceTypeList_QNAME = new QName("http://soap.sentencegenerator.myhealthylife/", "readSentenceTypeList");
    private final static QName _DeleteSentenceType_QNAME = new QName("http://soap.sentencegenerator.myhealthylife/", "deleteSentenceType");
    private final static QName _ReadSentenceTypeListResponse_QNAME = new QName("http://soap.sentencegenerator.myhealthylife/", "readSentenceTypeListResponse");
    private final static QName _CreateSentenceResponse_QNAME = new QName("http://soap.sentencegenerator.myhealthylife/", "createSentenceResponse");
    private final static QName _ReadRandomSentence_QNAME = new QName("http://soap.sentencegenerator.myhealthylife/", "readRandomSentence");
    private final static QName _ReadSentenceListResponse_QNAME = new QName("http://soap.sentencegenerator.myhealthylife/", "readSentenceListResponse");
    private final static QName _ReadRandomSentenceByType_QNAME = new QName("http://soap.sentencegenerator.myhealthylife/", "readRandomSentenceByType");
    private final static QName _CreateSentenceTypeResponse_QNAME = new QName("http://soap.sentencegenerator.myhealthylife/", "createSentenceTypeResponse");
    private final static QName _ReadSentence_QNAME = new QName("http://soap.sentencegenerator.myhealthylife/", "readSentence");
    private final static QName _ReadSentenceList_QNAME = new QName("http://soap.sentencegenerator.myhealthylife/", "readSentenceList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: myhealthylife.sentencegenerator.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SetSentenceType }
     * 
     */
    public SetSentenceType createSetSentenceType() {
        return new SetSentenceType();
    }

    /**
     * Create an instance of {@link DeleteSentenceResponse }
     * 
     */
    public DeleteSentenceResponse createDeleteSentenceResponse() {
        return new DeleteSentenceResponse();
    }

    /**
     * Create an instance of {@link ReadRandomSentenceResponse }
     * 
     */
    public ReadRandomSentenceResponse createReadRandomSentenceResponse() {
        return new ReadRandomSentenceResponse();
    }

    /**
     * Create an instance of {@link SentenceList }
     * 
     */
    public SentenceList createSentenceList() {
        return new SentenceList();
    }

    /**
     * Create an instance of {@link ReadSentenceTypeList }
     * 
     */
    public ReadSentenceTypeList createReadSentenceTypeList() {
        return new ReadSentenceTypeList();
    }

    /**
     * Create an instance of {@link DeleteSentence }
     * 
     */
    public DeleteSentence createDeleteSentence() {
        return new DeleteSentence();
    }

    /**
     * Create an instance of {@link DeleteSentenceType }
     * 
     */
    public DeleteSentenceType createDeleteSentenceType() {
        return new DeleteSentenceType();
    }

    /**
     * Create an instance of {@link ReadSentenceTypeListResponse }
     * 
     */
    public ReadSentenceTypeListResponse createReadSentenceTypeListResponse() {
        return new ReadSentenceTypeListResponse();
    }

    /**
     * Create an instance of {@link CreateSentenceResponse }
     * 
     */
    public CreateSentenceResponse createCreateSentenceResponse() {
        return new CreateSentenceResponse();
    }

    /**
     * Create an instance of {@link ReadRandomSentence }
     * 
     */
    public ReadRandomSentence createReadRandomSentence() {
        return new ReadRandomSentence();
    }

    /**
     * Create an instance of {@link ReadSentenceListResponse }
     * 
     */
    public ReadSentenceListResponse createReadSentenceListResponse() {
        return new ReadSentenceListResponse();
    }

    /**
     * Create an instance of {@link ReadRandomSentenceByType }
     * 
     */
    public ReadRandomSentenceByType createReadRandomSentenceByType() {
        return new ReadRandomSentenceByType();
    }

    /**
     * Create an instance of {@link CreateSentenceTypeResponse }
     * 
     */
    public CreateSentenceTypeResponse createCreateSentenceTypeResponse() {
        return new CreateSentenceTypeResponse();
    }

    /**
     * Create an instance of {@link ReadSentence }
     * 
     */
    public ReadSentence createReadSentence() {
        return new ReadSentence();
    }

    /**
     * Create an instance of {@link ReadSentenceList }
     * 
     */
    public ReadSentenceList createReadSentenceList() {
        return new ReadSentenceList();
    }

    /**
     * Create an instance of {@link Sentence }
     * 
     */
    public Sentence createSentence() {
        return new Sentence();
    }

    /**
     * Create an instance of {@link CreateSentenceType }
     * 
     */
    public CreateSentenceType createCreateSentenceType() {
        return new CreateSentenceType();
    }

    /**
     * Create an instance of {@link UpdateSentenceResponse }
     * 
     */
    public UpdateSentenceResponse createUpdateSentenceResponse() {
        return new UpdateSentenceResponse();
    }

    /**
     * Create an instance of {@link SentenceTypeList }
     * 
     */
    public SentenceTypeList createSentenceTypeList() {
        return new SentenceTypeList();
    }

    /**
     * Create an instance of {@link UpdateSentence }
     * 
     */
    public UpdateSentence createUpdateSentence() {
        return new UpdateSentence();
    }

    /**
     * Create an instance of {@link SetSentenceTypeResponse }
     * 
     */
    public SetSentenceTypeResponse createSetSentenceTypeResponse() {
        return new SetSentenceTypeResponse();
    }

    /**
     * Create an instance of {@link ReadRandomSentenceByTypeResponse }
     * 
     */
    public ReadRandomSentenceByTypeResponse createReadRandomSentenceByTypeResponse() {
        return new ReadRandomSentenceByTypeResponse();
    }

    /**
     * Create an instance of {@link CreateSentence }
     * 
     */
    public CreateSentence createCreateSentence() {
        return new CreateSentence();
    }

    /**
     * Create an instance of {@link DeleteSentenceTypeResponse }
     * 
     */
    public DeleteSentenceTypeResponse createDeleteSentenceTypeResponse() {
        return new DeleteSentenceTypeResponse();
    }

    /**
     * Create an instance of {@link SentenceType }
     * 
     */
    public SentenceType createSentenceType() {
        return new SentenceType();
    }

    /**
     * Create an instance of {@link ReadSentenceResponse }
     * 
     */
    public ReadSentenceResponse createReadSentenceResponse() {
        return new ReadSentenceResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sentence }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sentencegenerator.myhealthylife/", name = "sentence")
    public JAXBElement<Sentence> createSentence(Sentence value) {
        return new JAXBElement<Sentence>(_Sentence_QNAME, Sentence.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSentenceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sentencegenerator.myhealthylife/", name = "updateSentenceResponse")
    public JAXBElement<UpdateSentenceResponse> createUpdateSentenceResponse(UpdateSentenceResponse value) {
        return new JAXBElement<UpdateSentenceResponse>(_UpdateSentenceResponse_QNAME, UpdateSentenceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSentenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sentencegenerator.myhealthylife/", name = "createSentenceType")
    public JAXBElement<CreateSentenceType> createCreateSentenceType(CreateSentenceType value) {
        return new JAXBElement<CreateSentenceType>(_CreateSentenceType_QNAME, CreateSentenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSentence }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sentencegenerator.myhealthylife/", name = "updateSentence")
    public JAXBElement<UpdateSentence> createUpdateSentence(UpdateSentence value) {
        return new JAXBElement<UpdateSentence>(_UpdateSentence_QNAME, UpdateSentence.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SentenceTypeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sentencegenerator.myhealthylife/", name = "sentenceTypes")
    public JAXBElement<SentenceTypeList> createSentenceTypes(SentenceTypeList value) {
        return new JAXBElement<SentenceTypeList>(_SentenceTypes_QNAME, SentenceTypeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetSentenceTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sentencegenerator.myhealthylife/", name = "setSentenceTypeResponse")
    public JAXBElement<SetSentenceTypeResponse> createSetSentenceTypeResponse(SetSentenceTypeResponse value) {
        return new JAXBElement<SetSentenceTypeResponse>(_SetSentenceTypeResponse_QNAME, SetSentenceTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadRandomSentenceByTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sentencegenerator.myhealthylife/", name = "readRandomSentenceByTypeResponse")
    public JAXBElement<ReadRandomSentenceByTypeResponse> createReadRandomSentenceByTypeResponse(ReadRandomSentenceByTypeResponse value) {
        return new JAXBElement<ReadRandomSentenceByTypeResponse>(_ReadRandomSentenceByTypeResponse_QNAME, ReadRandomSentenceByTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadSentenceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sentencegenerator.myhealthylife/", name = "readSentenceResponse")
    public JAXBElement<ReadSentenceResponse> createReadSentenceResponse(ReadSentenceResponse value) {
        return new JAXBElement<ReadSentenceResponse>(_ReadSentenceResponse_QNAME, ReadSentenceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSentence }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sentencegenerator.myhealthylife/", name = "createSentence")
    public JAXBElement<CreateSentence> createCreateSentence(CreateSentence value) {
        return new JAXBElement<CreateSentence>(_CreateSentence_QNAME, CreateSentence.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSentenceTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sentencegenerator.myhealthylife/", name = "deleteSentenceTypeResponse")
    public JAXBElement<DeleteSentenceTypeResponse> createDeleteSentenceTypeResponse(DeleteSentenceTypeResponse value) {
        return new JAXBElement<DeleteSentenceTypeResponse>(_DeleteSentenceTypeResponse_QNAME, DeleteSentenceTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SentenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sentencegenerator.myhealthylife/", name = "sentenceType")
    public JAXBElement<SentenceType> createSentenceType(SentenceType value) {
        return new JAXBElement<SentenceType>(_SentenceType_QNAME, SentenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSentenceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sentencegenerator.myhealthylife/", name = "deleteSentenceResponse")
    public JAXBElement<DeleteSentenceResponse> createDeleteSentenceResponse(DeleteSentenceResponse value) {
        return new JAXBElement<DeleteSentenceResponse>(_DeleteSentenceResponse_QNAME, DeleteSentenceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetSentenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sentencegenerator.myhealthylife/", name = "setSentenceType")
    public JAXBElement<SetSentenceType> createSetSentenceType(SetSentenceType value) {
        return new JAXBElement<SetSentenceType>(_SetSentenceType_QNAME, SetSentenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadRandomSentenceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sentencegenerator.myhealthylife/", name = "readRandomSentenceResponse")
    public JAXBElement<ReadRandomSentenceResponse> createReadRandomSentenceResponse(ReadRandomSentenceResponse value) {
        return new JAXBElement<ReadRandomSentenceResponse>(_ReadRandomSentenceResponse_QNAME, ReadRandomSentenceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SentenceList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sentencegenerator.myhealthylife/", name = "sentences")
    public JAXBElement<SentenceList> createSentences(SentenceList value) {
        return new JAXBElement<SentenceList>(_Sentences_QNAME, SentenceList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSentence }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sentencegenerator.myhealthylife/", name = "deleteSentence")
    public JAXBElement<DeleteSentence> createDeleteSentence(DeleteSentence value) {
        return new JAXBElement<DeleteSentence>(_DeleteSentence_QNAME, DeleteSentence.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadSentenceTypeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sentencegenerator.myhealthylife/", name = "readSentenceTypeList")
    public JAXBElement<ReadSentenceTypeList> createReadSentenceTypeList(ReadSentenceTypeList value) {
        return new JAXBElement<ReadSentenceTypeList>(_ReadSentenceTypeList_QNAME, ReadSentenceTypeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSentenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sentencegenerator.myhealthylife/", name = "deleteSentenceType")
    public JAXBElement<DeleteSentenceType> createDeleteSentenceType(DeleteSentenceType value) {
        return new JAXBElement<DeleteSentenceType>(_DeleteSentenceType_QNAME, DeleteSentenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadSentenceTypeListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sentencegenerator.myhealthylife/", name = "readSentenceTypeListResponse")
    public JAXBElement<ReadSentenceTypeListResponse> createReadSentenceTypeListResponse(ReadSentenceTypeListResponse value) {
        return new JAXBElement<ReadSentenceTypeListResponse>(_ReadSentenceTypeListResponse_QNAME, ReadSentenceTypeListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSentenceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sentencegenerator.myhealthylife/", name = "createSentenceResponse")
    public JAXBElement<CreateSentenceResponse> createCreateSentenceResponse(CreateSentenceResponse value) {
        return new JAXBElement<CreateSentenceResponse>(_CreateSentenceResponse_QNAME, CreateSentenceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadRandomSentence }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sentencegenerator.myhealthylife/", name = "readRandomSentence")
    public JAXBElement<ReadRandomSentence> createReadRandomSentence(ReadRandomSentence value) {
        return new JAXBElement<ReadRandomSentence>(_ReadRandomSentence_QNAME, ReadRandomSentence.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadSentenceListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sentencegenerator.myhealthylife/", name = "readSentenceListResponse")
    public JAXBElement<ReadSentenceListResponse> createReadSentenceListResponse(ReadSentenceListResponse value) {
        return new JAXBElement<ReadSentenceListResponse>(_ReadSentenceListResponse_QNAME, ReadSentenceListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadRandomSentenceByType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sentencegenerator.myhealthylife/", name = "readRandomSentenceByType")
    public JAXBElement<ReadRandomSentenceByType> createReadRandomSentenceByType(ReadRandomSentenceByType value) {
        return new JAXBElement<ReadRandomSentenceByType>(_ReadRandomSentenceByType_QNAME, ReadRandomSentenceByType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSentenceTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sentencegenerator.myhealthylife/", name = "createSentenceTypeResponse")
    public JAXBElement<CreateSentenceTypeResponse> createCreateSentenceTypeResponse(CreateSentenceTypeResponse value) {
        return new JAXBElement<CreateSentenceTypeResponse>(_CreateSentenceTypeResponse_QNAME, CreateSentenceTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadSentence }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sentencegenerator.myhealthylife/", name = "readSentence")
    public JAXBElement<ReadSentence> createReadSentence(ReadSentence value) {
        return new JAXBElement<ReadSentence>(_ReadSentence_QNAME, ReadSentence.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadSentenceList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sentencegenerator.myhealthylife/", name = "readSentenceList")
    public JAXBElement<ReadSentenceList> createReadSentenceList(ReadSentenceList value) {
        return new JAXBElement<ReadSentenceList>(_ReadSentenceList_QNAME, ReadSentenceList.class, null, value);
    }

}
