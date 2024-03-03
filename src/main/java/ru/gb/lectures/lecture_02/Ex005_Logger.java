package ru.gb.lectures.lecture_02;

import java.io.IOException;
import java.util.logging.*;

public class Ex005_Logger {
    public static void main(String[] args) throws IOException {
    
        Logger logger = Logger.getLogger(Ex005_Logger.class.getName());
        //ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("C:\\Users\\Predator\\IdeaProjects\\GB\\gb-java-api-2023\\" +
                "src\\main\\java\\ru\\gb\\lectures\\lecture_02\\log.txt");
        //logger.addHandler(ch);
        logger.addHandler(fh);
        
        SimpleFormatter sFormat = new SimpleFormatter();
        //XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(sFormat);
        //fh.setFormatter(xml);
        
        //logger.setLevel(Level.INFO);
        logger.log(Level.WARNING, "Тестовое логирование 1");
        logger.info("Тестовое логирование 2");

    }
}







