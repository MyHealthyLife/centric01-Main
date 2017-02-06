
package myhealtylife.optimalparamters.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the myhealtylife.optimalparamters.soap package. 
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

    private final static QName _ReadOptimalParametersByNameAgeAndSex_QNAME = new QName("http://soap.optimalparamters.myhealtylife/", "readOptimalParametersByNameAgeAndSex");
    private final static QName _ParametersList_QNAME = new QName("http://soap.optimalparamters.myhealtylife/", "parametersList");
    private final static QName _DeleteParameterResponse_QNAME = new QName("http://soap.optimalparamters.myhealtylife/", "deleteParameterResponse");
    private final static QName _UpdateAgeRange_QNAME = new QName("http://soap.optimalparamters.myhealtylife/", "updateAgeRange");
    private final static QName _ReadOptimalParametersResponse_QNAME = new QName("http://soap.optimalparamters.myhealtylife/", "readOptimalParametersResponse");
    private final static QName _UpdateParameter_QNAME = new QName("http://soap.optimalparamters.myhealtylife/", "updateParameter");
    private final static QName _ReadAgeRangesResponse_QNAME = new QName("http://soap.optimalparamters.myhealtylife/", "readAgeRangesResponse");
    private final static QName _Parameter_QNAME = new QName("http://soap.optimalparamters.myhealtylife/", "parameter");
    private final static QName _ReadOptimalParameters_QNAME = new QName("http://soap.optimalparamters.myhealtylife/", "readOptimalParameters");
    private final static QName _ReadAgeRanges_QNAME = new QName("http://soap.optimalparamters.myhealtylife/", "readAgeRanges");
    private final static QName _ReadOptimalParametersByNameAgeAndSexResponse_QNAME = new QName("http://soap.optimalparamters.myhealtylife/", "readOptimalParametersByNameAgeAndSexResponse");
    private final static QName _ReadOptimalParametersByAgeAndSex_QNAME = new QName("http://soap.optimalparamters.myhealtylife/", "readOptimalParametersByAgeAndSex");
    private final static QName _AgeRange_QNAME = new QName("http://soap.optimalparamters.myhealtylife/", "age_range");
    private final static QName _CreateParameterResponse_QNAME = new QName("http://soap.optimalparamters.myhealtylife/", "createParameterResponse");
    private final static QName _DeleteAgeRange_QNAME = new QName("http://soap.optimalparamters.myhealtylife/", "deleteAgeRange");
    private final static QName _AgeRangeList_QNAME = new QName("http://soap.optimalparamters.myhealtylife/", "AgeRangeList");
    private final static QName _CreateParameter_QNAME = new QName("http://soap.optimalparamters.myhealtylife/", "createParameter");
    private final static QName _DeleteAgeRangeResponse_QNAME = new QName("http://soap.optimalparamters.myhealtylife/", "deleteAgeRangeResponse");
    private final static QName _CreateAgeRangeResponse_QNAME = new QName("http://soap.optimalparamters.myhealtylife/", "createAgeRangeResponse");
    private final static QName _UpdateAgeRangeResponse_QNAME = new QName("http://soap.optimalparamters.myhealtylife/", "updateAgeRangeResponse");
    private final static QName _DeleteParameter_QNAME = new QName("http://soap.optimalparamters.myhealtylife/", "deleteParameter");
    private final static QName _CreateAgeRange_QNAME = new QName("http://soap.optimalparamters.myhealtylife/", "createAgeRange");
    private final static QName _ReadOptimalParametersByAgeAndSexResponse_QNAME = new QName("http://soap.optimalparamters.myhealtylife/", "readOptimalParametersByAgeAndSexResponse");
    private final static QName _UpdateParameterResponse_QNAME = new QName("http://soap.optimalparamters.myhealtylife/", "updateParameterResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: myhealtylife.optimalparamters.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteParameter }
     * 
     */
    public DeleteParameter createDeleteParameter() {
        return new DeleteParameter();
    }

    /**
     * Create an instance of {@link CreateAgeRange }
     * 
     */
    public CreateAgeRange createCreateAgeRange() {
        return new CreateAgeRange();
    }

    /**
     * Create an instance of {@link ReadOptimalParametersByAgeAndSexResponse }
     * 
     */
    public ReadOptimalParametersByAgeAndSexResponse createReadOptimalParametersByAgeAndSexResponse() {
        return new ReadOptimalParametersByAgeAndSexResponse();
    }

    /**
     * Create an instance of {@link UpdateParameterResponse }
     * 
     */
    public UpdateParameterResponse createUpdateParameterResponse() {
        return new UpdateParameterResponse();
    }

    /**
     * Create an instance of {@link CreateAgeRangeResponse }
     * 
     */
    public CreateAgeRangeResponse createCreateAgeRangeResponse() {
        return new CreateAgeRangeResponse();
    }

    /**
     * Create an instance of {@link UpdateAgeRangeResponse }
     * 
     */
    public UpdateAgeRangeResponse createUpdateAgeRangeResponse() {
        return new UpdateAgeRangeResponse();
    }

    /**
     * Create an instance of {@link DeleteAgeRangeResponse }
     * 
     */
    public DeleteAgeRangeResponse createDeleteAgeRangeResponse() {
        return new DeleteAgeRangeResponse();
    }

    /**
     * Create an instance of {@link AgeRangeList }
     * 
     */
    public AgeRangeList createAgeRangeList() {
        return new AgeRangeList();
    }

    /**
     * Create an instance of {@link CreateParameter }
     * 
     */
    public CreateParameter createCreateParameter() {
        return new CreateParameter();
    }

    /**
     * Create an instance of {@link CreateParameterResponse }
     * 
     */
    public CreateParameterResponse createCreateParameterResponse() {
        return new CreateParameterResponse();
    }

    /**
     * Create an instance of {@link DeleteAgeRange }
     * 
     */
    public DeleteAgeRange createDeleteAgeRange() {
        return new DeleteAgeRange();
    }

    /**
     * Create an instance of {@link AgeRange }
     * 
     */
    public AgeRange createAgeRange() {
        return new AgeRange();
    }

    /**
     * Create an instance of {@link ReadAgeRanges }
     * 
     */
    public ReadAgeRanges createReadAgeRanges() {
        return new ReadAgeRanges();
    }

    /**
     * Create an instance of {@link ReadOptimalParametersByNameAgeAndSexResponse }
     * 
     */
    public ReadOptimalParametersByNameAgeAndSexResponse createReadOptimalParametersByNameAgeAndSexResponse() {
        return new ReadOptimalParametersByNameAgeAndSexResponse();
    }

    /**
     * Create an instance of {@link ReadOptimalParametersByAgeAndSex }
     * 
     */
    public ReadOptimalParametersByAgeAndSex createReadOptimalParametersByAgeAndSex() {
        return new ReadOptimalParametersByAgeAndSex();
    }

    /**
     * Create an instance of {@link ReadAgeRangesResponse }
     * 
     */
    public ReadAgeRangesResponse createReadAgeRangesResponse() {
        return new ReadAgeRangesResponse();
    }

    /**
     * Create an instance of {@link Parameter }
     * 
     */
    public Parameter createParameter() {
        return new Parameter();
    }

    /**
     * Create an instance of {@link ReadOptimalParameters }
     * 
     */
    public ReadOptimalParameters createReadOptimalParameters() {
        return new ReadOptimalParameters();
    }

    /**
     * Create an instance of {@link ReadOptimalParametersResponse }
     * 
     */
    public ReadOptimalParametersResponse createReadOptimalParametersResponse() {
        return new ReadOptimalParametersResponse();
    }

    /**
     * Create an instance of {@link UpdateParameter }
     * 
     */
    public UpdateParameter createUpdateParameter() {
        return new UpdateParameter();
    }

    /**
     * Create an instance of {@link DeleteParameterResponse }
     * 
     */
    public DeleteParameterResponse createDeleteParameterResponse() {
        return new DeleteParameterResponse();
    }

    /**
     * Create an instance of {@link UpdateAgeRange }
     * 
     */
    public UpdateAgeRange createUpdateAgeRange() {
        return new UpdateAgeRange();
    }

    /**
     * Create an instance of {@link ParametersList }
     * 
     */
    public ParametersList createParametersList() {
        return new ParametersList();
    }

    /**
     * Create an instance of {@link ReadOptimalParametersByNameAgeAndSex }
     * 
     */
    public ReadOptimalParametersByNameAgeAndSex createReadOptimalParametersByNameAgeAndSex() {
        return new ReadOptimalParametersByNameAgeAndSex();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadOptimalParametersByNameAgeAndSex }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.optimalparamters.myhealtylife/", name = "readOptimalParametersByNameAgeAndSex")
    public JAXBElement<ReadOptimalParametersByNameAgeAndSex> createReadOptimalParametersByNameAgeAndSex(ReadOptimalParametersByNameAgeAndSex value) {
        return new JAXBElement<ReadOptimalParametersByNameAgeAndSex>(_ReadOptimalParametersByNameAgeAndSex_QNAME, ReadOptimalParametersByNameAgeAndSex.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParametersList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.optimalparamters.myhealtylife/", name = "parametersList")
    public JAXBElement<ParametersList> createParametersList(ParametersList value) {
        return new JAXBElement<ParametersList>(_ParametersList_QNAME, ParametersList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteParameterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.optimalparamters.myhealtylife/", name = "deleteParameterResponse")
    public JAXBElement<DeleteParameterResponse> createDeleteParameterResponse(DeleteParameterResponse value) {
        return new JAXBElement<DeleteParameterResponse>(_DeleteParameterResponse_QNAME, DeleteParameterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAgeRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.optimalparamters.myhealtylife/", name = "updateAgeRange")
    public JAXBElement<UpdateAgeRange> createUpdateAgeRange(UpdateAgeRange value) {
        return new JAXBElement<UpdateAgeRange>(_UpdateAgeRange_QNAME, UpdateAgeRange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadOptimalParametersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.optimalparamters.myhealtylife/", name = "readOptimalParametersResponse")
    public JAXBElement<ReadOptimalParametersResponse> createReadOptimalParametersResponse(ReadOptimalParametersResponse value) {
        return new JAXBElement<ReadOptimalParametersResponse>(_ReadOptimalParametersResponse_QNAME, ReadOptimalParametersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.optimalparamters.myhealtylife/", name = "updateParameter")
    public JAXBElement<UpdateParameter> createUpdateParameter(UpdateParameter value) {
        return new JAXBElement<UpdateParameter>(_UpdateParameter_QNAME, UpdateParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadAgeRangesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.optimalparamters.myhealtylife/", name = "readAgeRangesResponse")
    public JAXBElement<ReadAgeRangesResponse> createReadAgeRangesResponse(ReadAgeRangesResponse value) {
        return new JAXBElement<ReadAgeRangesResponse>(_ReadAgeRangesResponse_QNAME, ReadAgeRangesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.optimalparamters.myhealtylife/", name = "parameter")
    public JAXBElement<Parameter> createParameter(Parameter value) {
        return new JAXBElement<Parameter>(_Parameter_QNAME, Parameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadOptimalParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.optimalparamters.myhealtylife/", name = "readOptimalParameters")
    public JAXBElement<ReadOptimalParameters> createReadOptimalParameters(ReadOptimalParameters value) {
        return new JAXBElement<ReadOptimalParameters>(_ReadOptimalParameters_QNAME, ReadOptimalParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadAgeRanges }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.optimalparamters.myhealtylife/", name = "readAgeRanges")
    public JAXBElement<ReadAgeRanges> createReadAgeRanges(ReadAgeRanges value) {
        return new JAXBElement<ReadAgeRanges>(_ReadAgeRanges_QNAME, ReadAgeRanges.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadOptimalParametersByNameAgeAndSexResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.optimalparamters.myhealtylife/", name = "readOptimalParametersByNameAgeAndSexResponse")
    public JAXBElement<ReadOptimalParametersByNameAgeAndSexResponse> createReadOptimalParametersByNameAgeAndSexResponse(ReadOptimalParametersByNameAgeAndSexResponse value) {
        return new JAXBElement<ReadOptimalParametersByNameAgeAndSexResponse>(_ReadOptimalParametersByNameAgeAndSexResponse_QNAME, ReadOptimalParametersByNameAgeAndSexResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadOptimalParametersByAgeAndSex }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.optimalparamters.myhealtylife/", name = "readOptimalParametersByAgeAndSex")
    public JAXBElement<ReadOptimalParametersByAgeAndSex> createReadOptimalParametersByAgeAndSex(ReadOptimalParametersByAgeAndSex value) {
        return new JAXBElement<ReadOptimalParametersByAgeAndSex>(_ReadOptimalParametersByAgeAndSex_QNAME, ReadOptimalParametersByAgeAndSex.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgeRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.optimalparamters.myhealtylife/", name = "age_range")
    public JAXBElement<AgeRange> createAgeRange(AgeRange value) {
        return new JAXBElement<AgeRange>(_AgeRange_QNAME, AgeRange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateParameterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.optimalparamters.myhealtylife/", name = "createParameterResponse")
    public JAXBElement<CreateParameterResponse> createCreateParameterResponse(CreateParameterResponse value) {
        return new JAXBElement<CreateParameterResponse>(_CreateParameterResponse_QNAME, CreateParameterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAgeRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.optimalparamters.myhealtylife/", name = "deleteAgeRange")
    public JAXBElement<DeleteAgeRange> createDeleteAgeRange(DeleteAgeRange value) {
        return new JAXBElement<DeleteAgeRange>(_DeleteAgeRange_QNAME, DeleteAgeRange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgeRangeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.optimalparamters.myhealtylife/", name = "AgeRangeList")
    public JAXBElement<AgeRangeList> createAgeRangeList(AgeRangeList value) {
        return new JAXBElement<AgeRangeList>(_AgeRangeList_QNAME, AgeRangeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.optimalparamters.myhealtylife/", name = "createParameter")
    public JAXBElement<CreateParameter> createCreateParameter(CreateParameter value) {
        return new JAXBElement<CreateParameter>(_CreateParameter_QNAME, CreateParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAgeRangeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.optimalparamters.myhealtylife/", name = "deleteAgeRangeResponse")
    public JAXBElement<DeleteAgeRangeResponse> createDeleteAgeRangeResponse(DeleteAgeRangeResponse value) {
        return new JAXBElement<DeleteAgeRangeResponse>(_DeleteAgeRangeResponse_QNAME, DeleteAgeRangeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAgeRangeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.optimalparamters.myhealtylife/", name = "createAgeRangeResponse")
    public JAXBElement<CreateAgeRangeResponse> createCreateAgeRangeResponse(CreateAgeRangeResponse value) {
        return new JAXBElement<CreateAgeRangeResponse>(_CreateAgeRangeResponse_QNAME, CreateAgeRangeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAgeRangeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.optimalparamters.myhealtylife/", name = "updateAgeRangeResponse")
    public JAXBElement<UpdateAgeRangeResponse> createUpdateAgeRangeResponse(UpdateAgeRangeResponse value) {
        return new JAXBElement<UpdateAgeRangeResponse>(_UpdateAgeRangeResponse_QNAME, UpdateAgeRangeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.optimalparamters.myhealtylife/", name = "deleteParameter")
    public JAXBElement<DeleteParameter> createDeleteParameter(DeleteParameter value) {
        return new JAXBElement<DeleteParameter>(_DeleteParameter_QNAME, DeleteParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAgeRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.optimalparamters.myhealtylife/", name = "createAgeRange")
    public JAXBElement<CreateAgeRange> createCreateAgeRange(CreateAgeRange value) {
        return new JAXBElement<CreateAgeRange>(_CreateAgeRange_QNAME, CreateAgeRange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadOptimalParametersByAgeAndSexResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.optimalparamters.myhealtylife/", name = "readOptimalParametersByAgeAndSexResponse")
    public JAXBElement<ReadOptimalParametersByAgeAndSexResponse> createReadOptimalParametersByAgeAndSexResponse(ReadOptimalParametersByAgeAndSexResponse value) {
        return new JAXBElement<ReadOptimalParametersByAgeAndSexResponse>(_ReadOptimalParametersByAgeAndSexResponse_QNAME, ReadOptimalParametersByAgeAndSexResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateParameterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.optimalparamters.myhealtylife/", name = "updateParameterResponse")
    public JAXBElement<UpdateParameterResponse> createUpdateParameterResponse(UpdateParameterResponse value) {
        return new JAXBElement<UpdateParameterResponse>(_UpdateParameterResponse_QNAME, UpdateParameterResponse.class, null, value);
    }

}
