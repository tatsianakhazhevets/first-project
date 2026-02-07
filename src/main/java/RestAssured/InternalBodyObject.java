package RestAssured;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InternalBodyObject {

    private String internalObjectKey;

    public String getInternalObjectKey() {
        return internalObjectKey;
    }

    @JsonProperty("internalObjectKey")
    public void setInternalObjectKey(String internalObjectKey) {
        this.internalObjectKey = internalObjectKey;
    }

    @Override
    public String toString() {
        return "InternalBodyObject{" +
                "internalObjectKey='" + internalObjectKey + '\'' +
                '}';
    }

}