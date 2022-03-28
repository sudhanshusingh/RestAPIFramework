package api;

public class RequestHandler implements CallType {

    private RequestType requestType;

    public RequestHandler(RequestType requestType) {
        this.requestType = requestType;
    }

    public RequestType getRequest(Specification specification,  RequestBody body){
        return new RequestType( specification, body);
    }

    @Override
    public RequestHandler GET() {
        return null;
    }

    @Override
    public ResponseHandler POST() {
        return null;
    }

    @Override
    public ResponseHandler PUT() {
        return null;
    }

    @Override
    public ResponseHandler DELETE() {
        return null;
    }
}
