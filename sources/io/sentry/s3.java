package io.sentry;

/* JADX INFO: loaded from: classes.dex */
public final class s3 implements w1 {
    public static final s3 b = new s3(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ s3(byte b2) {
        this.a = b2;
    }

    @Override // io.sentry.w1
    public final x1 a(e8 e8Var, v4 v4Var, f8 f8Var, p pVar) {
        switch (this.a) {
            case 0:
                return t3.a;
            default:
                return new s7(e8Var, v4Var, f8Var, pVar);
        }
    }
}
