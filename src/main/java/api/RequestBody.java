package api;

import java.io.File;

public interface RequestBody {

    public <T> T requestType(String request);

    public <T> T requestType(File file);

}
