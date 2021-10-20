package com.thoughtworks.collection;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSupplement {

    public StreamSupplement() {
    }

    public List<Integer> sortFromMaxToMin(List<Integer> numbers) {

        return numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    public double getAverage(List<Integer> numbers) {

        return new Double(numbers.stream().reduce((num1, num2) -> num1 + num2).orElse(0)) / numbers.size();
    }

    public int getMaxValue(List<Integer> numbers) {

        return numbers.stream().reduce(0, (a, b) -> Integer.max(a, b));
    }

}
