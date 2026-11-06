package o;

/* JADX INFO: loaded from: classes.dex */
public enum bc3 {
    Unknown,
    Online,
    Offline,
    Busy,
    Away;

    public final int m;

    bc3() {
        int i = lv1.q;
        lv1.q = i + 1;
        this.m = i;
    }
}
