package com.minarchenko.taskFive.partThree;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public  class DataSource {
        public static Map<String, String> input() {
                Map<String, String> map = new HashMap<>();

                map.put("She", "она");
                map.put("go", "идет");
                map.put("to", "в");
                map.put("school", "школу");
                return map;
        }
}