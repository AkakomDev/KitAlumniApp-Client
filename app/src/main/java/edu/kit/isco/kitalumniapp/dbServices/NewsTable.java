package edu.kit.isco.kitalumniapp.dbServices;

/**
 * Created by Andre on 02.02.2015.
 */
public class NewsTable {

    public static final String ID = "id";
    public static final String TITLE = "title";
    public static final String SHORT_INFO = "short_info";
    public static final String TEXT = "text";
    public static final String URL = "url";
    public static final String IMAGE_URL = "image_url";
    public static final String DATE = "date";

    public static String createSQL() {
        return "CREATE TABLE news(" + ID + " INTEGER PRIMARY KEY," + TITLE + " TEXT," + SHORT_INFO +
                " TEXT," + TEXT + " TEXT," + URL + " TEXT," + IMAGE_URL + " TEXT," + DATE + " DATETIME)";
    }

    public static String dropSQL() {
        return "DROP TABLE IF EXISTS news";
    }
}
