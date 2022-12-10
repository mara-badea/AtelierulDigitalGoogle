package patterns.builder;

import patterns.builder.Computer;

public class Main {
    public static void main(String[] args) {
        //Computer computer = new Computer("16GB", true, "1TB", "RTX2060" , "I7" , "Dolby");
        //System.out.println();
        Computer.Builder builder= new Computer.Builder("16GB");
        builder.setAudio("AudioDevice")
                .setBluetooth(true)
                .setCPU("I7")
                .setGPU("RTX")
                .setStorage("1TB");
        Computer computer= builder.build();
        builder.setStorage("512GB");
        Computer computer2=builder.build();

        System.out.println("Computer: " +computer);
        System.out.println("Computer: " +computer2);
    }
}
