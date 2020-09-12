package com.feici02.springboottutorial;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Slf4j
@RestController
@RequestMapping("/articles")
public class ArticleController {

    @GetMapping("/{id}")
    public ResponseEntity<String> getArticles(@PathVariable Long id) {
        Article article = Article.builder()
                .id(1L)
                .title("My first article")
                .author("Jason")
                .content("This is the content")
                .createTime(new Date())
                .build();

        log.info("get article id {}: {}", id, article);
        return new ResponseEntity<>("success", HttpStatus.OK);
    }

}
