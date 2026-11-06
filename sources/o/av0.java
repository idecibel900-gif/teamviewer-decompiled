package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class av0 extends IOException {
    public av0(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
