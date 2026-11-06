package o;

/* JADX INFO: loaded from: classes.dex */
public enum ah2 implements pk3 {
    Upload(65280),
    /* JADX INFO: Fake field, exist only in values array */
    CreateDir(511),
    /* JADX INFO: Fake field, exist only in values array */
    Rename(767),
    /* JADX INFO: Fake field, exist only in values array */
    Move(1023),
    /* JADX INFO: Fake field, exist only in values array */
    Delete(1279),
    Download(256);

    public final char m;

    /* JADX WARN: Multi-variable type inference failed */
    ah2(int i) {
        this.m = i;
    }

    @Override // o.pk3
    public final int a() {
        return this.m;
    }
}
