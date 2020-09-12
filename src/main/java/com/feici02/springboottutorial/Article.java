package com.feici02.springboottutorial;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class Article {
    Long id;
    String title;
    String author;
    String content;
    Date createTime;
}
