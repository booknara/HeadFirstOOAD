package com.github.booknara.dogdoor;

public class DogDoorSimulator {

    public static void main(String[] args) throws Exception {
        DogDoor door = new DogDoor();
        door.addAllowedBark(new Bark("rowlf"));
        door.addAllowedBark(new Bark("rooowlf"));
        door.addAllowedBark(new Bark("rawlf"));
        door.addAllowedBark(new Bark("woof"));

        BarkRecognizer recognizer = new BarkRecognizer(door);
        Remote remote = new Remote(door);

        System.out.println("Bruce starts barking.");
        recognizer.recognize(new Bark("rowlf"));

        System.out.println("Bruce has gone outside...");

        Thread.sleep(10 * 1000);

        System.out.println("Bruce's all done");
        System.out.println("...but he's stuck outside!");

        Bark smallDogBark = new Bark("yip");
        System.out.println("A small dog starts barking");
        recognizer.recognize(smallDogBark);

        Thread.sleep(5 * 1000);

        door.setOpenTime(5);

        System.out.println("Bruce starts barking...");
        recognizer.recognize(new Bark("roowlf"));

        System.out.println("Bruce's back inside...");

    }
}
