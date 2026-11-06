package o;

/* JADX INFO: loaded from: classes.dex */
public enum mf1 {
    None,
    /* JADX INFO: Fake field, exist only in values array */
    WaitingRoom,
    /* JADX INFO: Fake field, exist only in values array */
    Presenter,
    Viewer;

    public final int m;

    mf1() {
        int i = g68.A;
        g68.A = i + 1;
        this.m = i;
    }
}
