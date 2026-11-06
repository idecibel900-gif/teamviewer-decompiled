package o;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pj implements jw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    public /* synthetic */ pj(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    @Override // o.jw2
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj5 = this.n;
        switch (b) {
            case 0:
                qj qjVar = (qj) obj5;
                c68 c68VarB = ((or2) qjVar.q).b((nr2) obj, (ms2) obj2, ((ks2) obj3).a, ((ls2) obj4).a);
                if (c68VarB instanceof c68) {
                    Object obj6 = c68VarB.m;
                    obj6.getClass();
                    return (Typeface) obj6;
                }
                y58 y58Var = new y58(c68VarB, qjVar.v);
                qjVar.v = y58Var;
                Object obj7 = y58Var.p;
                obj7.getClass();
                return (Typeface) obj7;
            case 1:
                SQLiteCursorDriver sQLiteCursorDriver = (SQLiteCursorDriver) obj2;
                String str = (String) obj3;
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                sQLiteQuery.getClass();
                pv2 pv2Var = new pv2(sQLiteQuery);
                hf7 hf7Var = (hf7) ((l07) obj5).n;
                int length = hf7Var.p.length;
                for (int i = 1; i < length; i++) {
                    int i2 = hf7Var.p[i];
                    if (i2 == 1) {
                        pv2Var.k(i, hf7Var.q[i]);
                    } else if (i2 == 2) {
                        pv2Var.B(i, hf7Var.r[i]);
                    } else if (i2 == 3) {
                        String str2 = hf7Var.s[i];
                        str2.getClass();
                        pv2Var.t(i, str2);
                    } else if (i2 == 4) {
                        byte[] bArr = hf7Var.t[i];
                        bArr.getClass();
                        pv2Var.l(bArr, i);
                    } else if (i2 == 5) {
                        pv2Var.m(i);
                    }
                }
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            case 2:
                yy0 yy0Var = (yy0) obj5;
                w14 w14Var = (w14) obj;
                ((Integer) obj2).getClass();
                ux2 ux2Var = (ux2) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ux2Var.f(w14Var) ? 4 : 2;
                }
                if (ux2Var.N(iIntValue & 1, (iIntValue & 131) != 130)) {
                    yy0Var.d(w14Var, ux2Var, Integer.valueOf(iIntValue & 14));
                } else {
                    ux2Var.Q();
                }
                return f88Var;
            default:
                qk1 qk1Var = (qk1) obj5;
                j74 j74Var = (j74) obj;
                fs4 fs4Var = (fs4) obj2;
                ux2 ux2Var2 = (ux2) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                j74Var.getClass();
                fs4Var.getClass();
                int i3 = (iIntValue2 & 6) == 0 ? iIntValue2 | (ux2Var2.f(j74Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i3 |= ux2Var2.f(fs4Var) ? 32 : 16;
                }
                if (ux2Var2.N(i3 & 1, (i3 & 147) != 146)) {
                    us1.f(j74Var, qk1Var, fs4Var, ux2Var2, (i3 & 14) | ((i3 << 3) & 896));
                } else {
                    ux2Var2.Q();
                }
                return f88Var;
        }
    }
}
