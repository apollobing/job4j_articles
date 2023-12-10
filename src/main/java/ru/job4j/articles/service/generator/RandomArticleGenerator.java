package ru.job4j.articles.service.generator;

import ru.job4j.articles.model.Article;
import ru.job4j.articles.model.Word;

import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

public class RandomArticleGenerator implements ArticleGenerator {
    @Override
    public Article generate(List<Word> words) {
        Collections.shuffle(words);
        StringJoiner content = new StringJoiner(" ");
        for (Word word : words) {
            content.add(word.getValue());
        }
        return new Article(content.toString());
    }
}
