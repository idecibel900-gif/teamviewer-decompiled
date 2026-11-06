package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class hv3 implements Function0 {
    public final /* synthetic */ byte m;
    public final jv3 n;

    public /* synthetic */ hv3(jv3 jv3Var, byte b) {
        this.m = b;
        this.n = jv3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        ?? K;
        List listAsList;
        byte b = this.m;
        jv3 jv3Var = this.n;
        switch (b) {
            case 0:
                u86 u86Var = jv3Var.c;
                fw3 fw3Var = jv3.g[0];
                r86 r86Var = (r86) u86Var.a();
                if (r86Var == null) {
                    return yo4.b;
                }
                u86 u86Var2 = jv3Var.a;
                fw3 fw3Var2 = lu3.b[0];
                Object objA = u86Var2.a();
                objA.getClass();
                ep3 ep3Var = ((mg6) objA).b;
                tp1 tp1Var = (tp1) ep3Var.n;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ep3Var.p;
                Class cls = r86Var.a;
                js0 js0VarA = p76.a(cls);
                Object obj = concurrentHashMap.get(js0VarA);
                if (obj == null) {
                    ht2 ht2Var = p76.a(cls).a;
                    yy3 yy3Var = r86Var.b;
                    xy3 xy3Var = yy3Var.a;
                    xy3 xy3Var2 = xy3.MULTIFILE_CLASS;
                    if (xy3Var == xy3Var2) {
                        String[] strArr = yy3Var.c;
                        if (xy3Var != xy3Var2) {
                            strArr = null;
                        }
                        if (strArr != null) {
                            listAsList = Arrays.asList(strArr);
                            listAsList.getClass();
                        } else {
                            listAsList = null;
                        }
                        if (listAsList == null) {
                            listAsList = ea2.m;
                        }
                        K = new ArrayList();
                        Iterator it = listAsList.iterator();
                        while (it.hasNext()) {
                            ht2 ht2Var2 = new ht2(fs3.c((String) it.next()).a.replace('/', '.'));
                            ht2 ht2VarE = ht2Var2.e();
                            sy4 sy4VarF = ht2Var2.f();
                            sy4VarF.getClass();
                            ht2 ht2VarJ = ht2.j(sy4VarF);
                            ht2VarJ.d();
                            f71 f71Var = (f71) ep3Var.f733o;
                            ((jk0) tp1Var.c().c).getClass();
                            ps3.g.getClass();
                            String strReplace = ht2VarJ.b().replace('.', '$');
                            strReplace.getClass();
                            if (!ht2VarE.d()) {
                                strReplace = ht2VarE + '.' + strReplace;
                            }
                            nx3 nx3VarB = f71Var.b(strReplace);
                            r86 r86Var2 = nx3VarB != null ? (r86) nx3VarB.n : null;
                            if (r86Var2 != null) {
                                K.add(r86Var2);
                            }
                        }
                    } else {
                        K = qf0.K(r86Var);
                    }
                    ha2 ha2Var = new ha2((ps4) tp1Var.c().b, ht2Var, (byte) 0);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = K.iterator();
                    while (it2.hasNext()) {
                        bq1 bq1VarA = tp1Var.a(ha2Var, (r86) it2.next());
                        if (bq1VarA != null) {
                            arrayList.add(bq1VarA);
                        }
                    }
                    zo4 zo4VarP = kh.p("package " + ht2Var + " (" + r86Var + ')', lv0.P0(arrayList));
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(js0VarA, zo4VarP);
                    obj = objPutIfAbsent == null ? zo4VarP : objPutIfAbsent;
                }
                obj.getClass();
                return (zo4) obj;
            default:
                u86 u86Var3 = jv3Var.c;
                fw3 fw3Var3 = jv3.g[0];
                r86 r86Var3 = (r86) u86Var3.a();
                if (r86Var3 == null) {
                    return null;
                }
                yy3 yy3Var2 = r86Var3.b;
                String[] strArr2 = yy3Var2.c;
                String[] strArr3 = yy3Var2.e;
                if (strArr2 == null || strArr3 == null) {
                    return null;
                }
                vd5 vd5VarH = kt3.h(strArr2, strArr3);
                return new g38((qs3) vd5VarH.m, (mv5) vd5VarH.n, yy3Var2.b);
        }
    }
}
