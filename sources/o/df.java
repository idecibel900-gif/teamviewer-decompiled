package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class df implements dk6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ df(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public static int b(df dfVar, int i) {
        Object obj;
        w44 w44Var = (w44) dfVar.c;
        o44 o44VarJ = w44Var.j();
        if (!o44VarJ.l.isEmpty()) {
            int iH = w44Var.h();
            if (i > dfVar.c() || iH > i) {
                return ((i - w44Var.h()) * ct1.d0(o44VarJ)) - w44Var.i();
            }
            List list = o44VarJ.l;
            int size = list.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    obj = null;
                    break;
                }
                obj = list.get(i2);
                if (((p44) obj).a == i) {
                    break;
                }
                i2++;
            }
            p44 p44Var = (p44) obj;
            if (p44Var != null) {
                return p44Var.m;
            }
        }
        return 0;
    }

    @Override // o.dk6
    public final float a(float f) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                gf gfVar = (gf) obj2;
                float fH = gfVar.V.h(f);
                float fZ = fH - ((wf5) gfVar.V.i).z();
                ((mf) obj).a(fH, 0.0f);
                return fZ;
            case 1:
                return ((dk6) obj2).a(f);
            case 2:
                yk6 yk6Var = (yk6) obj2;
                if (Math.abs(f) == 0.0f || ((Boolean) yk6Var.h.a()).booleanValue()) {
                    return yk6Var.e(yk6Var.h(((wk6) obj).a(2, yk6Var.f(yk6Var.i(f)))));
                }
                throw new cn2("The fling animation was cancelled");
            default:
                nf nfVar = ((xy6) obj2).g;
                float fU = ct1.u((Float.isNaN(((wf5) nfVar.i).z()) ? 0.0f : ((wf5) nfVar.i).z()) + f, nfVar.e().e(), nfVar.e().d());
                float fZ2 = fU - ((wf5) nfVar.i).z();
                ((mf) obj).a(fU, 0.0f);
                return fZ2;
        }
    }

    public int c() {
        p44 p44Var = (p44) lv0.w0(((w44) this.c).j().l);
        if (p44Var != null) {
            return p44Var.a;
        }
        return 0;
    }
}
