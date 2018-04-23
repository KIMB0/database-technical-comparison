package com.company.data;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Calculate {
    public double calculateAverage(List<Double> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        double average = sum / list.size();
        return average;
    }

    public double calculateMedian(List<Double> list) {
        double median;
        int middle = list.size()/2;
        if (list.size() % 2 == 1) {
            median = list.get(middle);
            return median;
        } else {
            median = (list.get(middle-1) + list.get(middle)) / 2.0;
            return median;
        }
    }
}
