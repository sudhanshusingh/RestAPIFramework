package api;

public class RequestType {

    private ResponseHandler responseHandler;
    private Specification specification;
    private RequestBody requestBody;

    public RequestType(Specification specification, RequestBody requestBody){
        this.specification = specification;
        this.requestBody = requestBody;
    }

    public RequestType(Specification specification){
        this.specification = specification;
    }
}
