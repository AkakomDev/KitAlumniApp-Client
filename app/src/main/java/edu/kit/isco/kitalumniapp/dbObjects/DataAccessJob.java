package edu.kit.isco.kitalumniapp.dbObjects;

import java.util.List;

/**
 * Created by Andre on 04.02.2015.
 */
public class DataAccessJob implements DataAccessObject {

    private long id;
    private String title;
    private String shortInfo;
    private String allText;
    private String url;
    private List<DataAccessTag> tags;
    private String date;
    private boolean star = false;

    public DataAccessJob() {
    }

    public DataAccessJob(long id, String title, String shortDescription, String allText, String url, List<DataAccessTag> tags, String date) {
        this.id = id;
        this.title = title;
        this.shortInfo = shortDescription;
        this.allText = allText;
        this.url = url;
        this.tags = tags;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getShortInfo() {
        return shortInfo;
    }

    public String getAllText() {
        return allText;
    }

    public String getUrl() {
        return url;
    }

    public List<DataAccessTag> getTags() {
        return tags;
    }

    public String getDate() {
        return date;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setShortDescription(String short_info) {
        this.shortInfo = short_info;
    }

    public void setAllText(String allText) {
        this.allText = allText;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setTags(List<DataAccessTag> tags) {
        this.tags = tags;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isStar() {
        return star;
    }

    public void setStar(boolean star) {
        this.star = star;
    }

    @Override
    public String toString() {
        return new StringBuffer(" ID : ").append(this.getId())
                .append(" Title : ").append(this.getTitle())
                .append(" shortDescription: ").append(this.getShortInfo())
                .append(" fullText : ").append(this.getAllText())
                .append(" url : ").append(this.getUrl())
                .toString();
    }

}
