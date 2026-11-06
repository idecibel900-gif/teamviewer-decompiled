package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class m70 extends ft2 {
    public final /* synthetic */ byte n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f1442o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m70(y65 y65Var, of0 of0Var) {
        super(of0Var);
        this.f1442o = y65Var;
    }

    @Override // o.ft2, o.q67
    public final long i0(bf0 bf0Var, long j) throws Exception {
        switch (this.n) {
            case 0:
                try {
                    return super.i0(bf0Var, j);
                } catch (Exception e) {
                    this.f1442o = e;
                    throw e;
                }
            default:
                try {
                    return super.i0(bf0Var, j);
                } catch (IOException e2) {
                    ((y65) this.f1442o).p = e2;
                    throw e2;
                }
        }
    }

    public /* synthetic */ m70(q67 q67Var) {
        super(q67Var);
    }
}
