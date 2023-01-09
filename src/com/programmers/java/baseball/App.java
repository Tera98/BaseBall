package com.programmers.java.baseball;

import com.programmers.java.baseball.engine.Baseball;
import com.programmers.java.baseball.engine.io.Input;
import com.programmers.java.baseball.engine.io.NumberGenerator;
import com.programmers.java.baseball.engine.io.Output;

public class App {
    public static void main(String[] args) {

        NumberGenerator generator = new HackFakerNumberGenerator();
        Console console = new Console();

        new Baseball(generator, console, console).run();
    }
}
