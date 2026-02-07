package RestAssured;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class JokeResponse {
     private boolean error;
     private int amount;
     private List<Joke> jokes;

    public boolean isError() {
        return error;
    }

    @JsonProperty("error")
    public void setError(boolean error) {
        this.error = error;
    }

    public int getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public List<Joke> getJokes() {
        return jokes;
    }

    @JsonProperty("jokes")
    public void setJokes(List<Joke> jokes) {
        this.jokes = jokes;
    }

    @Override
    public String toString() {
        return "JokeResponse{" +
                "error=" + error +
                ", amount=" + amount +
                ", jokes=" + jokes +
                '}';
    }
}