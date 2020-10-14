package main;

import java.util.*;
import java.util.stream.Collectors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

    public class App<T> {

        public static void main(String[] args) {
//            List<List<T>> list = new ArrayList<>();
//
//            List<Integer> integers = new ArrayList<>();
//            integers.add(1);
//
//            list.add((List<T>) integers);
//
//            App.flattenArray(list);
//
//            for (Object o : list) {
//                System.out.println(o);
//            }

        }


        public <T> List<T> flattenArray(List<List<T>> list) {
            List<T> result = new ArrayList<>();
            for (List<T> listElement : list) {
                for (T element : listElement) {
                    if (element != null) {
                        result.add(element);
                    }
                }
            }
            return result;

//            return list.stream()
//                    .filter(Objects::nonNull)
//                    .flatMap(Collection::stream)
//                    .collect(Collectors.toList());

        }

//        List<T> result = new ArrayList<>();
//
//        for (T l : list) {
//            if (l != null) {
//                result.add(l);
//            }
//        }
//
//        return result;
//    }
    }
