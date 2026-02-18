package mentoring.RestAssured;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CategoryAliases {
    private String alias;
    private String resolved;

    public String getAlias() {
        return alias;
    }

    @JsonProperty("alias")
    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getResolved() {
        return resolved;
    }

    @JsonProperty("resolved")
    public void setResolved(String resolved) {
        this.resolved = resolved;
    }

    @Override
    public String toString() {
        return "CategoryAliases{" +
                "alias='" + alias + '\'' +
                ", resolved='" + resolved + '\'' +
                '}';
    }
}