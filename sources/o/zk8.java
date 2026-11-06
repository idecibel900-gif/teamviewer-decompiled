package o;

/* JADX INFO: loaded from: classes.dex */
public final class zk8 implements yk8 {
    public final String b;
    public final ui3 c;
    public final ui3 d;

    public zk8(String str) {
        this.b = str;
        this.c = new ui3(str);
        this.d = new ui3(str.concat(" maximum"));
    }

    public final String toString() {
        return this.b;
    }
}
