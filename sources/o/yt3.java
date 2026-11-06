package o;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class yt3 implements Function0 {
    public final /* synthetic */ byte m;
    public final au3 n;

    public /* synthetic */ yt3(au3 au3Var, byte b) {
        this.m = b;
        this.n = au3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        au3 au3Var = this.n;
        switch (b) {
            case 0:
                u86 u86Var = au3Var.h;
                fw3[] fw3VarArr = au3.n;
                fw3 fw3Var = fw3VarArr[9];
                Object objA = u86Var.a();
                objA.getClass();
                u86 u86Var2 = au3Var.j;
                fw3 fw3Var2 = fw3VarArr[11];
                Object objA2 = u86Var2.a();
                objA2.getClass();
                return lv0.A0((Collection) objA, (Collection) objA2);
            case 1:
                u86 u86Var3 = au3Var.i;
                fw3[] fw3VarArr2 = au3.n;
                fw3 fw3Var3 = fw3VarArr2[10];
                Object objA3 = u86Var3.a();
                objA3.getClass();
                u86 u86Var4 = au3Var.k;
                fw3 fw3Var4 = fw3VarArr2[12];
                Object objA4 = u86Var4.a();
                objA4.getClass();
                return lv0.A0((Collection) objA3, (Collection) objA4);
            case 2:
                u86 u86Var5 = au3Var.h;
                fw3[] fw3VarArr3 = au3.n;
                fw3 fw3Var5 = fw3VarArr3[9];
                Object objA5 = u86Var5.a();
                objA5.getClass();
                u86 u86Var6 = au3Var.i;
                fw3 fw3Var6 = fw3VarArr3[10];
                Object objA6 = u86Var6.a();
                objA6.getClass();
                return lv0.A0((Collection) objA5, (Collection) objA6);
            case 3:
                u86 u86Var7 = au3Var.l;
                fw3[] fw3VarArr4 = au3.n;
                fw3 fw3Var7 = fw3VarArr4[13];
                Object objA7 = u86Var7.a();
                objA7.getClass();
                u86 u86Var8 = au3Var.m;
                fw3 fw3Var8 = fw3VarArr4[14];
                Object objA8 = u86Var8.a();
                objA8.getClass();
                return lv0.A0((Collection) objA7, (Collection) objA8);
            case 4:
                return pa8.d(au3Var.a());
            case 5:
                Collection collectionN = qs1.N(au3Var.a().r0(), null, 3);
                ArrayList<fi1> arrayList = new ArrayList();
                for (Object obj : collectionN) {
                    if (!zo1.m((fi1) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (fi1 fi1Var : arrayList) {
                    ns4 ns4Var = fi1Var instanceof ns4 ? (ns4) fi1Var : null;
                    Class clsJ = ns4Var != null ? pa8.j(ns4Var) : null;
                    eu3 eu3Var = clsJ != null ? new eu3(clsJ) : null;
                    if (eu3Var != null) {
                        arrayList2.add(eu3Var);
                    }
                }
                return arrayList2;
            default:
                Collection<ns4> collectionO0 = au3Var.a().o0();
                collectionO0.getClass();
                ArrayList arrayList3 = new ArrayList();
                for (ns4 ns4Var2 : collectionO0) {
                    ns4Var2.getClass();
                    Class clsJ2 = pa8.j(ns4Var2);
                    eu3 eu3Var2 = clsJ2 != null ? new eu3(clsJ2) : null;
                    if (eu3Var2 != null) {
                        arrayList3.add(eu3Var2);
                    }
                }
                return arrayList3;
        }
    }
}
