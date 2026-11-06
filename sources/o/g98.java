package o;

/* JADX INFO: loaded from: classes2.dex */
public enum g98 {
    /* JADX INFO: Fake field, exist only in values array */
    UBYTE(im3.D("kotlin/UByte", false)),
    /* JADX INFO: Fake field, exist only in values array */
    USHORT(im3.D("kotlin/UShort", false)),
    /* JADX INFO: Fake field, exist only in values array */
    UINT(im3.D("kotlin/UInt", false)),
    /* JADX INFO: Fake field, exist only in values array */
    ULONG(im3.D("kotlin/ULong", false));

    public final js0 m;
    public final sy4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final js0 f874o;

    g98(js0 js0Var) {
        this.m = js0Var;
        sy4 sy4VarF = js0Var.f();
        this.n = sy4VarF;
        this.f874o = new js0(js0Var.a, sy4.e(sy4VarF.b() + "Array"));
    }
}
