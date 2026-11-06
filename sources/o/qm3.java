package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class qm3 extends IOException {

    public static class a extends qm3 {
    }

    public static qm3 a() {
        return new qm3("Protocol message had invalid UTF-8.");
    }

    public static a b() {
        return new a("Protocol message tag had invalid wire type.");
    }

    public static qm3 c() {
        return new qm3("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static qm3 d() {
        return new qm3("Failed to parse the message.");
    }

    public static qm3 e() {
        return new qm3("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
