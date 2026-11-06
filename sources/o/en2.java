package o;

/* JADX INFO: loaded from: classes.dex */
public interface en2 extends jo {
    @Override // o.jo
    default ec8 a(yn1 yn1Var) {
        return new pn5(this);
    }

    float b(long j, float f, float f2, float f3);

    long c(float f, float f2, float f3);

    default float d(float f, float f2, float f3) {
        return b(c(f, f2, f3), f, f2, f3);
    }

    float e(long j, float f, float f2, float f3);
}
