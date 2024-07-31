package com.example.test;

import com.example.builder.Computer;

public class BuilderPatternTest {
    public static void main(String[] args) {
        Computer basicComputer = new Computer.ComputerBuilder("Intel i7", "12GB")
                .build();

        Computer gamingComputer = new Computer.ComputerBuilder("Intel i9", "32GB")
                .setStorage("3TB SSD")
                .setGraphicsCardEnabled(true)
                .setBluetoothEnabled(true)
                .build();

        System.out.println("Basic Computer: " + basicComputer);
        System.out.println("Gaming Computer: " + gamingComputer);
    }
}
