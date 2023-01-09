package com.programmers.java.baseball.engine.io;

import com.programmers.java.baseball.engine.model.BallCount;

public interface Output {
    void ballcount(BallCount bc);

    void inputerror();

    void correct();
}

