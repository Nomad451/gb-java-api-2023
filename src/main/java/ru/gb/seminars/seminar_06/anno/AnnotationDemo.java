package ru.gb.seminars.seminar_06.anno;

public class AnnotationDemo {

    public static void main(String[] args) {
        Container container = new Container();

        RandomIntAnnotationProcessor.process(container);

        System.out.println(container.getFirst());
        System.out.println(container.getSecond());
        System.out.println(container.getThird());

    }

}
