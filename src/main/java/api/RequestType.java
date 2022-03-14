package api;

public class RequestType {

    private ResponseHandler responseHandler = null;

    public ResponseHandler GET(){return responseHandler;}

    public ResponseHandler POST(Specification specification, RequestBody requestBody){return responseHandler;}
}
