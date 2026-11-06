package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class pm3 extends IOException {
    public boolean m;

    public static class a extends pm3 {
    }

    public static pm3 a() {
        return new pm3("Protocol message had invalid UTF-8.");
    }

    public static a b() {
        return new a("Protocol message tag had invalid wire type.");
    }

    public static pm3 c() {
        return new pm3("CodedInputStream encountered a malformed varint.");
    }

    public static pm3 d() {
        return new pm3("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static pm3 e() {
        return new pm3("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
