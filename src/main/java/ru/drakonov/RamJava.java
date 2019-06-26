package ru.drakonov;

public class RamJava {

    public static long getUsesRam() {
        long usesRam = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        usesRam = usesRam / 1048576;
        return usesRam;
    }

    public static long getTotalRam() {
        long totalRam = Runtime.getRuntime().totalMemory();
        totalRam = totalRam / 1048576;
        return totalRam;
    }
}
