package com.programmers.java.baseball.engine.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.function.BiConsumer;

@AllArgsConstructor
@Getter
@ToString
public class Numbers {
    private Integer[] nums;

    public void indexedForeach(BiConsumer<Integer, Integer> consumer) {
        for (int i = 0; i < nums.length; i++) {
            consumer.accept(nums[i], i);
        }
    }
}
