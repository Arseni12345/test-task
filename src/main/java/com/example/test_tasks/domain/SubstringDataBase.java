package com.example.test_tasks.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class SubstringDataBase {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="id_seq")
    @SequenceGenerator(name = "id_seq", sequenceName = "id_seq")
    private long id;

    @Column(name = "substrings")
    @NonNull
    private String substrings;

    @Column(name = "source_strings")
    @NonNull
    private String sourceStrings;

    @Column(name = "result")
    @NonNull
    private String result;
}
