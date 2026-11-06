package o;

/* JADX INFO: loaded from: classes.dex */
public final class tt6 extends mb5 {
    public static final /* synthetic */ int i = 0;
    public final String f;
    public final String g;
    public final String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt6(String str, String str2, String str3, String str4) {
        super(str, str2);
        str2.getClass();
        this.f = str2;
        this.g = str3;
        this.h = str4;
    }

    @Override // o.mb5
    public final boolean a() {
        return true;
    }

    @Override // o.mb5
    public final boolean c() {
        return super.c() && this.f.length() > 0;
    }
}
