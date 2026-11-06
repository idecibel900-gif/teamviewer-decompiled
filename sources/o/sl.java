package o;

import android.os.Parcelable;
import android.util.SparseArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sl implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ ge8 n;

    public /* synthetic */ sl(ge8 ge8Var, byte b) {
        this.m = b;
        this.n = ge8Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        ge8 ge8Var = this.n;
        switch (b) {
            case 0:
                xl.l(ge8Var);
                return f88Var;
            case 1:
                ge8Var.L.P();
                return f88Var;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                ge8Var.N.saveHierarchyState(sparseArray);
                return sparseArray;
            case 3:
                ge8.m(ge8Var);
                return f88Var;
            case 4:
                ge8Var.R.invoke(ge8Var.N);
                return f88Var;
            default:
                ge8Var.Q.invoke(ge8Var.N);
                return f88Var;
        }
    }
}
