package api;

public interface CallType {

    public RequestHandler GET();

    public ResponseHandler POST();

    public ResponseHandler PUT();

    public ResponseHandler DELETE();

}
