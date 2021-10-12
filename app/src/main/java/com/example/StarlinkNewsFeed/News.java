package com.example.StarlinkNewsFeed;


// A {@link News} object contains information related to a single News.

public class News {

private String newsTitle, newsSection, newsAuthor, newsDate, newsUrl;

    /**
     * @param title is the title of the news article
     * @param section is the section the news article is grouped under
     * @param author is the author of the news article
     * @param date is the date of the news article was published
     * @param url is the website URL to find more details about the news article
     */

public News (String title, String section, String author, String date, String url) {
    this.newsTitle=title;
    this.newsSection=section;
    this.newsAuthor=author;
    this.newsDate=date;
    this.newsUrl=url;
}

    // Returns the title of the news article
    public String getNewsTitle() {
        return newsTitle;
    }

    // Returns the section of the news article
    public String getNewsSection() {return newsSection;}

    // Returns the author of the news article
    public String getNewsAuthor() {return newsAuthor;}

    // Returns the date of the news article
    public String getNewsDate() {return newsDate;}

    // Returns the url of the news article
    public String getNewsUrl() {return newsUrl;}

}
