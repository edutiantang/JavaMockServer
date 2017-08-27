package wang.condon.mockserver;

public class ResponseModel {

    private String pathVariable;
    private String name;
    private String accessToken;

    public String getPathVariable() {
        return pathVariable;
    }

    public void setPathVariable(String pathVariable) {
        this.pathVariable = pathVariable;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ResponseModel(String pathVariable, String name, String accessToken) {
        this.pathVariable = pathVariable;
        this.name = name;
        this.accessToken = accessToken;
    }

    //This default constructor method muss't be deleted.
    public ResponseModel() {
    }
}
