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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="my_seq")
    @SequenceGenerator(name="my_seq",sequenceName="MY_SEQ1", allocationSize=1)
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
