package com.example.DesignPatternDemo.StructuralPattern.FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static Map<TreeType, TreeType> treeTypeCache = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String texture) {
        TreeType treeType = new TreeType(name, color, texture);
        TreeType newTreeType = treeTypeCache.putIfAbsent(treeType, treeType);

        if (newTreeType == null) {
            return treeType;
        }
        return newTreeType;
    }

    public static void printTreeTypeCache() {
        System.out.println("** treeTypeCache : ");
        treeTypeCache.forEach((key, value) -> System.out.print("[" + key + ": " + value + "], "));
        System.out.println("");
    }
}
