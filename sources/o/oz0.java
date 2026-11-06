package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lo/oz0;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class oz0 extends RuntimeException {
    public final zw4 m;
    public final zw4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final jw4 f1690o;
    public final int p;

    public oz0(zw4 zw4Var, zw4 zw4Var2, jw4 jw4Var, int i, Exception exc) {
        super(exc);
        this.m = zw4Var;
        this.n = zw4Var2;
        this.f1690o = jw4Var;
        this.p = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        List listK;
        aq6 aq6VarM = ct1.M(new nz0(this, null));
        if (aq6VarM.hasNext()) {
            Object next = aq6VarM.next();
            if (aq6VarM.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (aq6VarM.hasNext()) {
                    arrayList.add(aq6VarM.next());
                }
                listK = arrayList;
            } else {
                listK = qf0.K(next);
            }
        } else {
            listK = ea2.m;
        }
        return vb7.D("\n            |Failed to execute op number " + this.p + ":\n            |" + lv0.t0(lv0.L0(50, listK), "\n", null, null, null, 62) + "\n            ");
    }
}
