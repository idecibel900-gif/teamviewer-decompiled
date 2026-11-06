package o;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class nv3 implements Function0 {
    public final /* synthetic */ byte m;
    public final pv3 n;

    public /* synthetic */ nv3(pv3 pv3Var, byte b) {
        this.m = b;
        this.n = pv3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        ov3 ov3Var;
        byte b = this.m;
        pv3 pv3Var = this.n;
        switch (b) {
            case 0:
                return pa8.d(pv3Var.a());
            default:
                if5 if5VarA = pv3Var.a();
                int i = pv3Var.n;
                vt3 vt3Var = pv3Var.m;
                if ((if5VarA instanceof v14) && im3.n(pa8.g(vt3Var.w()), if5VarA) && vt3Var.w().k() == 2) {
                    fi1 fi1VarI = vt3Var.w().i();
                    fi1VarI.getClass();
                    Class clsJ = pa8.j((ns4) fi1VarI);
                    if (clsJ != null) {
                        return clsJ;
                    }
                    hk0.q(if5VarA, "Cannot determine receiver Java type of inherited declaration: ");
                    return null;
                }
                mj0 mj0VarT = vt3Var.t();
                if (mj0VarT instanceof ib8) {
                    boolean z = vt3Var.z();
                    Collection collectionP0 = ea2.m;
                    if (z) {
                        ib8 ib8Var = (ib8) mj0VarT;
                        yk3 yk3VarC = ib8Var.c(i + 1);
                        int i2 = ib8Var.c(0).n + 1;
                        List listA = ib8Var.b.a();
                        int i3 = yk3VarC.m - i2;
                        yk3 yk3Var = new yk3(i3, yk3VarC.n - i2, 1);
                        listA.getClass();
                        if (!yk3Var.isEmpty()) {
                            collectionP0 = lv0.P0(listA.subList(i3, yk3Var.n + 1));
                        }
                    } else {
                        ib8 ib8Var2 = (ib8) mj0VarT;
                        yk3 yk3VarC2 = ib8Var2.c(i);
                        List listA2 = ib8Var2.b.a();
                        listA2.getClass();
                        yk3VarC2.getClass();
                        if (!yk3VarC2.isEmpty()) {
                            collectionP0 = lv0.P0(listA2.subList(yk3VarC2.m, yk3VarC2.n + 1));
                        }
                    }
                    Type[] typeArr = (Type[]) collectionP0.toArray(new Type[0]);
                    Type[] typeArr2 = (Type[]) Arrays.copyOf(typeArr, typeArr.length);
                    int length = typeArr2.length;
                    if (length == 0) {
                        throw new lz3("Expected at least 1 type for compound type");
                    }
                    if (length == 1) {
                        return (Type) cx.c1(typeArr2);
                    }
                    ov3Var = new ov3(typeArr2);
                } else {
                    if (!(mj0VarT instanceof hb8)) {
                        return (Type) mj0VarT.a().get(i);
                    }
                    Class[] clsArr = (Class[]) ((Collection) ((hb8) mj0VarT).d.get(i)).toArray(new Class[0]);
                    Type[] typeArr3 = (Type[]) Arrays.copyOf(clsArr, clsArr.length);
                    int length2 = typeArr3.length;
                    if (length2 == 0) {
                        throw new lz3("Expected at least 1 type for compound type");
                    }
                    if (length2 == 1) {
                        return (Type) cx.c1(typeArr3);
                    }
                    ov3Var = new ov3(typeArr3);
                }
                return ov3Var;
        }
    }
}
