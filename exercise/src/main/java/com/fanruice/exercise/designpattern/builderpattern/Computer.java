package com.fanruice.exercise.designpattern.builderpattern;

/**
 * 利用建造者模式创建对象
 */
public class Computer {

    private String cpu;
    private String screen;
    private String memory;
    private String mainboard;

    public String getCpu() {
        return cpu;
    }

    public String getScreen() {
        return screen;
    }

    public String getMemory() {
        return memory;
    }

    public String getMainboard() {
        return mainboard;
    }

    public Computer(String cpu, String screen, String memory, String mainboard) {
        this.cpu = cpu;
        this.screen = screen;
        this.memory = memory;
        this.mainboard = mainboard;
    }

    public Computer(ComputerBuilder computerBuilder) {
        this.cpu = computerBuilder.cpu;
        this.screen = computerBuilder.screen;
        this.memory = computerBuilder.memory;
        this.mainboard = computerBuilder.mainboard;
    }

    public static final class ComputerBuilder {

        private String cpu;
        private String screen;
        private String memory;
        private String mainboard;

        public ComputerBuilder() {
        }

        public ComputerBuilder cpu(String val) {
            cpu = val;
            return this;
        }

        public ComputerBuilder screen(String val) {
            screen = val;
            return this;
        }

        public ComputerBuilder memory(String val) {
            memory = val;
            return this;
        }

        public ComputerBuilder mainboard(String val) {
            mainboard = val;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
