package sweeper;

import java.nio.file.Path;

public enum Box {
    ZERO,
    NUM1,
    NUM2,
    NUM3,
    NUM4,
    NUM5,
    NUM6,
    NUM7,
    NUM8,
    BOMB,
    OPENED,
    CLOSED,
    FLAGED,
    BOMBED,
    NOBOMB;

    public Object image;

    Box getNextNumBox () {
        return Box.values()[this.ordinal() + 1];
    }
}
