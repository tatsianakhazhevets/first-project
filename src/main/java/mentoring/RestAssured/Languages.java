package mentoring.RestAssured;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Languages {
    private String defaultLanguage;
    private List<String> jokeLanguages;
    private List<String> systemLanguages;
    private List<PossibleLanguages> possibleLanguages;
    private long timestamp;

    public String getDefaultLanguage() {
        return defaultLanguage;
    }

    @JsonProperty("defaultLanguage")
    public void setDefaultLanguage(String defaultLanguage) {
        this.defaultLanguage = defaultLanguage;
    }

    public List<String> getJokeLanguages() {
        return jokeLanguages;
    }

    @JsonProperty("jokeLanguages")
    public void setJokeLanguages(List<String> jokeLanguages) {
        this.jokeLanguages = jokeLanguages;
    }

    public List<String> getSystemLanguages() {
        return systemLanguages;
    }

    @JsonProperty("systemLanguages")
    public void setSystemLanguages(List<String> systemLanguages) {
        this.systemLanguages = systemLanguages;
    }

    public List<PossibleLanguages> getPossibleLanguages() {
        return possibleLanguages;
    }

    @JsonProperty("possibleLanguages")
    public void setPossibleLanguages(List<PossibleLanguages> possibleLanguages) {
        this.possibleLanguages = possibleLanguages;
    }

    public long getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Languages{" +
                "defaultLanguage='" + defaultLanguage + '\'' +
                ", jokeLanguages=" + jokeLanguages +
                ", systemLanguages=" + systemLanguages +
                ", possibleLanguages=" + possibleLanguages +
                ", timestamp=" + timestamp +
                '}';
    }
}