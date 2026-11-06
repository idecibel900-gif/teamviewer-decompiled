package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class rm3 extends IOException {
    public t1 m;

    public rm3(String str) {
        super(str);
        this.m = null;
    }

    public static rm3 a() {
        return new rm3("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }
}
