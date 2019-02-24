package Entiry;


import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.util.Date;

@Document(indexName = "es_article", type = "article", indexStoreType = "fs", shards = 5, replicas = 1)
public class Article implements Serializable {
    @Id
    private Long id;
    private String title;  //标题
    private String abstracts;  //摘要
    private String content;  //内容
    private Date postTime;  //发表时间

    public void setId(long l) {
        this.id = l;
    }

    public Long getId() {
        return this.id;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getContent() {
        return this.content;
    }

    public void setAbstracts(String abstracts) {
        this.abstracts = abstracts;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPostTime(Date postTime) {
        this.postTime = postTime;
    }
}