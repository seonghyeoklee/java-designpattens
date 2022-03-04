package me.study.designpatterns._04_builder._01_before;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class DetailPlan {

    private int day;

    private String plan;

}
