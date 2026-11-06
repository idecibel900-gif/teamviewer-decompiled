package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a32 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f289o;

    public /* synthetic */ a32(float f, long j, byte b) {
        this.m = b;
        this.n = f;
        this.f289o = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        float f = this.n;
        switch (b) {
            case 0:
                u52 u52Var = (u52) obj;
                float fD0 = u52Var.d0(f);
                u52.L(u52Var, this.f289o, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(u52Var.d0(f) / 2.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (u52Var.d() >> 32)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(u52Var.d0(f) / 2.0f))), fD0, 496);
                break;
            default:
                u52 u52Var2 = (u52) obj;
                float fD1 = u52Var2.d0(f);
                u52.L(u52Var2, this.f289o, (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (Float.floatToRawIntBits(u52Var2.d0(f) / 2.0f) << 32), (((long) Float.floatToRawIntBits(u52Var2.d0(f) / 2.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (u52Var2.d() & 4294967295L))))), fD1, 496);
                break;
        }
        return f88Var;
    }
}
