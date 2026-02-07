package RestAssured;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PossibleLanguages {
    private String code;
    private String name;

    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PossibleLanguages{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}