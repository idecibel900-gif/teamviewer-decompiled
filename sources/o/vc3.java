package o;

/* JADX INFO: loaded from: classes.dex */
public enum vc3 {
    Unknown,
    /* JADX INFO: Fake field, exist only in values array */
    OSVersion_Windows,
    OSVersion_OSX,
    /* JADX INFO: Fake field, exist only in values array */
    OSVersion_Android,
    OSVersion_Linux,
    /* JADX INFO: Fake field, exist only in values array */
    OSVersion_FreeBSD,
    /* JADX INFO: Fake field, exist only in values array */
    OSVersion_Chrome,
    /* JADX INFO: Fake field, exist only in values array */
    OSVersion_WebAssembly;

    public final int m;

    vc3() {
        int i = wo1.d;
        wo1.d = i + 1;
        this.m = i;
    }

    vc3() {
        this.m = 0;
        wo1.d = 1;
    }
}
