package ru.konst.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println("=====" + player.getName() + "=====");
        System.out.println("===== Volume: " + player.getVolume() + "=====");
        player.playMusic();

        context.close();
    }
}
