
package myhealthylife.nutritionservice.soap;

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
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Foods", targetNamespace = "http://soap.nutritionservice.myhealthylife/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Foods {


    /**
     * 
     * @param foodId
     * @return
     *     returns myhealthylife.nutritionservice.soap.Food
     */
    @WebMethod
    @WebResult(name = "food", targetNamespace = "")
    @RequestWrapper(localName = "readFood", targetNamespace = "http://soap.nutritionservice.myhealthylife/", className = "myhealthylife.nutritionservice.soap.ReadFood")
    @ResponseWrapper(localName = "readFoodResponse", targetNamespace = "http://soap.nutritionservice.myhealthylife/", className = "myhealthylife.nutritionservice.soap.ReadFoodResponse")
    @Action(input = "http://soap.nutritionservice.myhealthylife/Foods/readFoodRequest", output = "http://soap.nutritionservice.myhealthylife/Foods/readFoodResponse")
    public Food readFood(
        @WebParam(name = "foodId", targetNamespace = "")
        long foodId);

    /**
     * 
     * @param food
     */
    @WebMethod
    @RequestWrapper(localName = "createFood", targetNamespace = "http://soap.nutritionservice.myhealthylife/", className = "myhealthylife.nutritionservice.soap.CreateFood")
    @ResponseWrapper(localName = "createFoodResponse", targetNamespace = "http://soap.nutritionservice.myhealthylife/", className = "myhealthylife.nutritionservice.soap.CreateFoodResponse")
    @Action(input = "http://soap.nutritionservice.myhealthylife/Foods/createFoodRequest", output = "http://soap.nutritionservice.myhealthylife/Foods/createFoodResponse")
    public void createFood(
        @WebParam(name = "food", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<Food> food);

    /**
     * 
     * @param foodId
     * @return
     *     returns long
     */
    @WebMethod
    @WebResult(name = "idFood", targetNamespace = "")
    @RequestWrapper(localName = "deleteFood", targetNamespace = "http://soap.nutritionservice.myhealthylife/", className = "myhealthylife.nutritionservice.soap.DeleteFood")
    @ResponseWrapper(localName = "deleteFoodResponse", targetNamespace = "http://soap.nutritionservice.myhealthylife/", className = "myhealthylife.nutritionservice.soap.DeleteFoodResponse")
    @Action(input = "http://soap.nutritionservice.myhealthylife/Foods/deleteFoodRequest", output = "http://soap.nutritionservice.myhealthylife/Foods/deleteFoodResponse")
    public long deleteFood(
        @WebParam(name = "foodId", targetNamespace = "")
        long foodId);

    /**
     * 
     * @param food
     */
    @WebMethod
    @RequestWrapper(localName = "updateFood", targetNamespace = "http://soap.nutritionservice.myhealthylife/", className = "myhealthylife.nutritionservice.soap.UpdateFood")
    @ResponseWrapper(localName = "updateFoodResponse", targetNamespace = "http://soap.nutritionservice.myhealthylife/", className = "myhealthylife.nutritionservice.soap.UpdateFoodResponse")
    @Action(input = "http://soap.nutritionservice.myhealthylife/Foods/updateFoodRequest", output = "http://soap.nutritionservice.myhealthylife/Foods/updateFoodResponse")
    public void updateFood(
        @WebParam(name = "food", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<Food> food);

    /**
     * 
     * @return
     *     returns myhealthylife.nutritionservice.soap.Foods_Type
     */
    @WebMethod
    @WebResult(name = "foodList", targetNamespace = "")
    @RequestWrapper(localName = "readFoodList", targetNamespace = "http://soap.nutritionservice.myhealthylife/", className = "myhealthylife.nutritionservice.soap.ReadFoodList")
    @ResponseWrapper(localName = "readFoodListResponse", targetNamespace = "http://soap.nutritionservice.myhealthylife/", className = "myhealthylife.nutritionservice.soap.ReadFoodListResponse")
    @Action(input = "http://soap.nutritionservice.myhealthylife/Foods/readFoodListRequest", output = "http://soap.nutritionservice.myhealthylife/Foods/readFoodListResponse")
    public Foods_Type readFoodList();

    /**
     * 
     * @param typeName
     * @return
     *     returns myhealthylife.nutritionservice.soap.FoodType
     */
    @WebMethod
    @WebResult(name = "foodType", targetNamespace = "")
    @RequestWrapper(localName = "createFoodType", targetNamespace = "http://soap.nutritionservice.myhealthylife/", className = "myhealthylife.nutritionservice.soap.CreateFoodType")
    @ResponseWrapper(localName = "createFoodTypeResponse", targetNamespace = "http://soap.nutritionservice.myhealthylife/", className = "myhealthylife.nutritionservice.soap.CreateFoodTypeResponse")
    @Action(input = "http://soap.nutritionservice.myhealthylife/Foods/createFoodTypeRequest", output = "http://soap.nutritionservice.myhealthylife/Foods/createFoodTypeResponse")
    public FoodType createFoodType(
        @WebParam(name = "typeName", targetNamespace = "")
        String typeName);

    /**
     * 
     * @param typeId
     * @return
     *     returns long
     */
    @WebMethod
    @WebResult(name = "idFoodType", targetNamespace = "")
    @RequestWrapper(localName = "deleteFoodType", targetNamespace = "http://soap.nutritionservice.myhealthylife/", className = "myhealthylife.nutritionservice.soap.DeleteFoodType")
    @ResponseWrapper(localName = "deleteFoodTypeResponse", targetNamespace = "http://soap.nutritionservice.myhealthylife/", className = "myhealthylife.nutritionservice.soap.DeleteFoodTypeResponse")
    @Action(input = "http://soap.nutritionservice.myhealthylife/Foods/deleteFoodTypeRequest", output = "http://soap.nutritionservice.myhealthylife/Foods/deleteFoodTypeResponse")
    public long deleteFoodType(
        @WebParam(name = "typeId", targetNamespace = "")
        long typeId);

    /**
     * 
     * @param foodType
     */
    @WebMethod
    @RequestWrapper(localName = "updateFoodType", targetNamespace = "http://soap.nutritionservice.myhealthylife/", className = "myhealthylife.nutritionservice.soap.UpdateFoodType")
    @ResponseWrapper(localName = "updateFoodTypeResponse", targetNamespace = "http://soap.nutritionservice.myhealthylife/", className = "myhealthylife.nutritionservice.soap.UpdateFoodTypeResponse")
    @Action(input = "http://soap.nutritionservice.myhealthylife/Foods/updateFoodTypeRequest", output = "http://soap.nutritionservice.myhealthylife/Foods/updateFoodTypeResponse")
    public void updateFoodType(
        @WebParam(name = "foodType", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<FoodType> foodType);

    /**
     * 
     * @return
     *     returns myhealthylife.nutritionservice.soap.FoodTypes
     */
    @WebMethod
    @WebResult(name = "foodTypeList", targetNamespace = "")
    @RequestWrapper(localName = "readFoodTypeList", targetNamespace = "http://soap.nutritionservice.myhealthylife/", className = "myhealthylife.nutritionservice.soap.ReadFoodTypeList")
    @ResponseWrapper(localName = "readFoodTypeListResponse", targetNamespace = "http://soap.nutritionservice.myhealthylife/", className = "myhealthylife.nutritionservice.soap.ReadFoodTypeListResponse")
    @Action(input = "http://soap.nutritionservice.myhealthylife/Foods/readFoodTypeListRequest", output = "http://soap.nutritionservice.myhealthylife/Foods/readFoodTypeListResponse")
    public FoodTypes readFoodTypeList();

    /**
     * 
     * @param foodId
     * @param typeId
     * @return
     *     returns myhealthylife.nutritionservice.soap.Food
     */
    @WebMethod
    @WebResult(name = "food", targetNamespace = "")
    @RequestWrapper(localName = "setFoodType", targetNamespace = "http://soap.nutritionservice.myhealthylife/", className = "myhealthylife.nutritionservice.soap.SetFoodType")
    @ResponseWrapper(localName = "setFoodTypeResponse", targetNamespace = "http://soap.nutritionservice.myhealthylife/", className = "myhealthylife.nutritionservice.soap.SetFoodTypeResponse")
    @Action(input = "http://soap.nutritionservice.myhealthylife/Foods/setFoodTypeRequest", output = "http://soap.nutritionservice.myhealthylife/Foods/setFoodTypeResponse")
    public Food setFoodType(
        @WebParam(name = "foodId", targetNamespace = "")
        long foodId,
        @WebParam(name = "typeId", targetNamespace = "")
        long typeId);

    /**
     * 
     * @param typeName
     * @return
     *     returns myhealthylife.nutritionservice.soap.Foods_Type
     */
    @WebMethod
    @WebResult(name = "foodList", targetNamespace = "")
    @RequestWrapper(localName = "findFoodByType", targetNamespace = "http://soap.nutritionservice.myhealthylife/", className = "myhealthylife.nutritionservice.soap.FindFoodByType")
    @ResponseWrapper(localName = "findFoodByTypeResponse", targetNamespace = "http://soap.nutritionservice.myhealthylife/", className = "myhealthylife.nutritionservice.soap.FindFoodByTypeResponse")
    @Action(input = "http://soap.nutritionservice.myhealthylife/Foods/findFoodByTypeRequest", output = "http://soap.nutritionservice.myhealthylife/Foods/findFoodByTypeResponse")
    public Foods_Type findFoodByType(
        @WebParam(name = "typeName", targetNamespace = "")
        String typeName);

    /**
     * 
     * @param maxCal
     * @param typeName
     * @return
     *     returns myhealthylife.nutritionservice.soap.Foods_Type
     */
    @WebMethod
    @WebResult(name = "foodList", targetNamespace = "")
    @RequestWrapper(localName = "findFoodByTypeFiltered", targetNamespace = "http://soap.nutritionservice.myhealthylife/", className = "myhealthylife.nutritionservice.soap.FindFoodByTypeFiltered")
    @ResponseWrapper(localName = "findFoodByTypeFilteredResponse", targetNamespace = "http://soap.nutritionservice.myhealthylife/", className = "myhealthylife.nutritionservice.soap.FindFoodByTypeFilteredResponse")
    @Action(input = "http://soap.nutritionservice.myhealthylife/Foods/findFoodByTypeFilteredRequest", output = "http://soap.nutritionservice.myhealthylife/Foods/findFoodByTypeFilteredResponse")
    public Foods_Type findFoodByTypeFiltered(
        @WebParam(name = "typeName", targetNamespace = "")
        String typeName,
        @WebParam(name = "maxCal", targetNamespace = "")
        Integer maxCal);

    /**
     * 
     * @param maxCal
     * @return
     *     returns myhealthylife.nutritionservice.soap.Foods_Type
     */
    @WebMethod
    @WebResult(name = "foodList", targetNamespace = "")
    @RequestWrapper(localName = "findFoodByTypeFilteredByCalories", targetNamespace = "http://soap.nutritionservice.myhealthylife/", className = "myhealthylife.nutritionservice.soap.FindFoodByTypeFilteredByCalories")
    @ResponseWrapper(localName = "findFoodByTypeFilteredByCaloriesResponse", targetNamespace = "http://soap.nutritionservice.myhealthylife/", className = "myhealthylife.nutritionservice.soap.FindFoodByTypeFilteredByCaloriesResponse")
    @Action(input = "http://soap.nutritionservice.myhealthylife/Foods/findFoodByTypeFilteredByCaloriesRequest", output = "http://soap.nutritionservice.myhealthylife/Foods/findFoodByTypeFilteredByCaloriesResponse")
    public Foods_Type findFoodByTypeFilteredByCalories(
        @WebParam(name = "maxCal", targetNamespace = "")
        Integer maxCal);

}
