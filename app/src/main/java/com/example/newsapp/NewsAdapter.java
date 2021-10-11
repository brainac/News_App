package com.example.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter (Context context, List<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_item, parent, false);
        }

        // Find the News at the given position in the list of News
        News currentNews = getItem(position);

        // Find matching TextViews using their associated ID
        TextView newsTitle = listItemView.findViewById(R.id.article_title_textView);
        TextView newsSection = listItemView.findViewById(R.id.article_section_textView);
        TextView newsAuthor = listItemView.findViewById(R.id.article_author_textView);
        TextView newsDate = listItemView.findViewById(R.id.article_date_textView);

        // Display matching Strings in the right TextView
        newsTitle.setText(currentNews.getNewsTitle());
        newsSection.setText(currentNews.getNewsSection());
        newsAuthor.setText(currentNews.getNewsAuthor());
        newsDate.setText(currentNews.getNewsDate());

        return listItemView;
    }
}
