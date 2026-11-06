package o;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class zt3 implements Function0 {
    public final /* synthetic */ byte m;
    public final au3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final eu3 f2733o;

    public /* synthetic */ zt3(au3 au3Var, eu3 eu3Var, byte b) {
        this.m = b;
        this.n = au3Var;
        this.f2733o = eu3Var;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0106  */
    @Override // kotlin.jvm.functions.Function0
    public final Object a() throws IllegalAccessException, NoSuchFieldException {
        Field declaredField;
        byte b = this.m;
        eu3 eu3Var = this.f2733o;
        au3 au3Var = this.n;
        switch (b) {
            case 0:
                Class cls = eu3Var.n;
                ns4 ns4VarA = au3Var.a();
                if (ns4VarA.i0() != ms0.r) {
                    return null;
                }
                if (ns4VarA.w0()) {
                    LinkedHashSet linkedHashSet = nx0.a;
                    if (g68.u(ns4VarA)) {
                        declaredField = cls.getDeclaredField("INSTANCE");
                    } else {
                        declaredField = cls.getEnclosingClass().getDeclaredField(ns4VarA.getName().b());
                    }
                } else {
                    declaredField = cls.getDeclaredField("INSTANCE");
                }
                Object obj = declaredField.get(null);
                obj.getClass();
                return obj;
            case 1:
                List<d58> listK0 = au3Var.a().k0();
                listK0.getClass();
                ArrayList arrayList = new ArrayList(mv0.Z(listK0, 10));
                for (d58 d58Var : listK0) {
                    d58Var.getClass();
                    arrayList.add(new rw3(eu3Var, d58Var));
                }
                return arrayList;
            default:
                Collection<oz3> collectionB = au3Var.a().q().b();
                collectionB.getClass();
                ArrayList arrayList2 = new ArrayList(collectionB.size());
                for (oz3 oz3Var : collectionB) {
                    oz3Var.getClass();
                    arrayList2.add(new qw3(oz3Var, new yp1(oz3Var, au3Var, eu3Var, (byte) 1)));
                }
                ns4 ns4VarA2 = au3Var.a();
                sy4 sy4Var = wy3.e;
                if (!wy3.b(ns4VarA2, s87.a) && !wy3.b(ns4VarA2, s87.b)) {
                    if (arrayList2.isEmpty()) {
                        arrayList2.add(new qw3(bp1.e(au3Var.a()).e(), x00.v));
                    } else {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            ms0 ms0VarI0 = zo1.c(((qw3) it.next()).m).i0();
                            ms0VarI0.getClass();
                            if (ms0VarI0 == ms0.n || ms0VarI0 == ms0.q) {
                            }
                        }
                        arrayList2.add(new qw3(bp1.e(au3Var.a()).e(), x00.v));
                    }
                }
                return ka0.s(arrayList2);
        }
    }
}
