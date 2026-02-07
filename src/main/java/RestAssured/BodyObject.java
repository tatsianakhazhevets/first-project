package RestAssured;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class BodyObject {
    private String testKeyBody;
    private List<InternalBodyObject> multipleObjectKey;

    public String getTestKeyBody() {
        return testKeyBody;
    }

    @JsonProperty("testKeyBody")
    public void setTestKeyBody(String testKeyBody) {
        this.testKeyBody = testKeyBody;
    }

    public List<InternalBodyObject> getMultipleObjectKey() {
        return multipleObjectKey;
    }

    @JsonProperty("multipleObjectKey")
    public void setMultipleObjectKey(List<InternalBodyObject> multipleObjectKey) {
        this.multipleObjectKey = multipleObjectKey;
    }

    @Override
    public String toString() {
        return "BodyObject{" +
                "testKeyBody='" + testKeyBody + '\'' +
                ", multipleObjectKey=" + multipleObjectKey +
                '}';
    }
}