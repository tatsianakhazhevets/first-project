package mentoring.RestAssured;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CategoriesResponse {
    private boolean error;
    private List<String> categories;
    private List<CategoryAliases> categoryAliases;
    private long timestamp;

    public boolean isError() {
        return error;
    }

    @JsonProperty("error")
    public void setError(boolean error) {
        this.error = error;
    }

    public List<String> getCategories() {
        return categories;
    }

    @JsonProperty("categories")
    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public List<CategoryAliases> getCategoryAliases() {
        return categoryAliases;
    }

    @JsonProperty("categoryAliases")
    public void setCategoryAliases(List<CategoryAliases> categoryAliases) {
        this.categoryAliases = categoryAliases;
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
        return "CategoriesResponse{" +
                "error='" + error + '\'' +
                ", categories=" + categories +
                ", categoryAliases=" + categoryAliases +
                ", timestamp=" + timestamp +
                '}';
    }
}