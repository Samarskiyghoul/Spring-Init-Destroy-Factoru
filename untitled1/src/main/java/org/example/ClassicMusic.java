package org.example;

public class ClassicMusic  implements Music{
    private ClassicMusic(){}

    public static ClassicMusic getClassicMusic(){
        return new ClassicMusic();
    }
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }

    public String getSong() {
        return "\"The Seasons\" by Vivaldi";
    }
}