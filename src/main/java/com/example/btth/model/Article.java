package com.example.btth.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "baiviet")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_bviet")
    private int articleID;
    @Column(name = "tieude")
    private String title;
    @Column(name = "ten_bhat")
    private String songName;
    @Column(name = "tomtat")
    private String summary;
    @Column(name = "ngayviet")
    private String date;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "ma_tloai", referencedColumnName = "ma_tloai")
    private Genre genre;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "ma_tgia", referencedColumnName = "ma_tgia")
    private Author author;
}
