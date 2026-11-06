package o;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class ow extends kv0 {
    public final /* synthetic */ byte b;
    public final vb4 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow(nw3 nw3Var, byte b) {
        super(nw3Var);
        this.b = b;
        switch (b) {
            case 1:
                super(nw3Var);
                fq6 fq6VarD = nw3Var.d();
                fq6VarD.getClass();
                this.c = new iw(fq6VarD, (byte) 2);
                break;
            default:
                nw3Var.getClass();
                fq6 fq6VarD2 = nw3Var.d();
                fq6VarD2.getClass();
                this.c = new iw(fq6VarD2, (byte) 1);
                break;
        }
    }

    @Override // o.nw3
    public final fq6 d() {
        byte b = this.b;
        vb4 vb4Var = this.c;
        switch (b) {
            case 0:
                break;
        }
        return (iw) vb4Var;
    }

    @Override // o.s0
    public final Object e() {
        switch (this.b) {
            case 0:
                return new ArrayList();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // o.s0
    public final int f(Object obj) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                return arrayList.size();
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                return linkedHashSet.size();
        }
    }

    @Override // o.s0
    public final Object k(Object obj) {
        switch (this.b) {
            case 0:
                throw null;
            default:
                throw null;
        }
    }

    @Override // o.s0
    public final Object l(Object obj) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                return arrayList;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                return linkedHashSet;
        }
    }

    @Override // o.kv0
    public final void m(int i, Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                arrayList.add(i, obj2);
                break;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                linkedHashSet.add(obj2);
                break;
        }
    }
}
