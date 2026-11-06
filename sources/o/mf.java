package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class mf {
    public Object a;
    public Object b;
    public float c = Float.NaN;
    public final /* synthetic */ nf d;

    public mf(nf nfVar) {
        this.d = nfVar;
    }

    public final void a(float f, float f2) {
        nf nfVar = this.d;
        bg5 bg5Var = (bg5) nfVar.d;
        wf5 wf5Var = (wf5) nfVar.i;
        float fZ = wf5Var.z();
        wf5Var.A(f);
        ((wf5) nfVar.j).A(f2);
        if (Float.isNaN(fZ)) {
            return;
        }
        boolean z = f >= fZ;
        if (wf5Var.z() == nfVar.e().f(bg5Var.getValue())) {
            Object objB = nfVar.e().b(wf5Var.z() + (z ? 1.0f : -1.0f), z);
            if (objB == null) {
                objB = bg5Var.getValue();
            }
            if (z) {
                this.a = bg5Var.getValue();
                this.b = objB;
            } else {
                this.a = objB;
                this.b = bg5Var.getValue();
            }
        } else {
            Object objB2 = nfVar.e().b(wf5Var.z(), false);
            if (objB2 == null) {
                objB2 = bg5Var.getValue();
            }
            Object objB3 = nfVar.e().b(wf5Var.z(), true);
            if (objB3 == null) {
                objB3 = bg5Var.getValue();
            }
            this.a = objB2;
            this.b = objB3;
        }
        uj1 uj1VarE = nfVar.e();
        Object obj = this.a;
        obj.getClass();
        float f3 = uj1VarE.f(obj);
        uj1 uj1VarE2 = nfVar.e();
        Object obj2 = this.b;
        obj2.getClass();
        this.c = Math.abs(f3 - uj1VarE2.f(obj2));
        if (Math.abs(wf5Var.z() - nfVar.e().f(bg5Var.getValue())) >= this.c / 2.0f) {
            Object value = z ? this.b : this.a;
            if (value == null) {
                value = bg5Var.getValue();
            }
            if (((Boolean) ((Function1) nfVar.b).invoke(value)).booleanValue()) {
                bg5Var.setValue(value);
            }
        }
    }
}
