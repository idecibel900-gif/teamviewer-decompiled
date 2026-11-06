package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.stream.Collector;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes2.dex */
public final class ld2 extends td2 {
    public final /* synthetic */ byte a;
    public final String b;

    public ld2(String str, byte b) {
        this.a = b;
        switch (b) {
            case 3:
                this.b = us1.F(str);
                break;
            case 4:
                StringBuilder sbB = lb7.b();
                lb7.a(str, sbB, false);
                this.b = us1.F(lb7.k(sbB));
                break;
            case 5:
                StringBuilder sbB2 = lb7.b();
                lb7.a(str, sbB2, false);
                this.b = us1.F(lb7.k(sbB2));
                break;
            default:
                this.b = us1.F(str);
                break;
        }
    }

    @Override // o.td2
    public int a() {
        switch (this.a) {
            case 0:
                return 2;
            case 1:
                return 6;
            case 2:
                return 8;
            case 3:
            case 4:
            case 6:
            default:
                return super.a();
            case 5:
                return 10;
            case 7:
                return 10;
            case 8:
                return 2;
            case ep1.b /* 9 */:
                return 1;
        }
    }

    @Override // o.td2
    public final boolean b(o82 o82Var, o82 o82Var2) {
        byte b = this.a;
        String str = this.b;
        switch (b) {
            case 0:
                return o82Var2.r(str);
            case 1:
                ly lyVarG = o82Var2.g();
                lyVarG.getClass();
                ArrayList arrayList = new ArrayList(lyVarG.m);
                for (int i = 0; i < lyVarG.m; i++) {
                    String str2 = lyVarG.n[i];
                    if (!ly.n(str2)) {
                        arrayList.add(new jy(str2, (String) lyVarG.f1417o[i], lyVarG));
                    }
                }
                Iterator it = Collections.unmodifiableList(arrayList).iterator();
                while (it.hasNext()) {
                    if (us1.F(((jy) it.next()).m).startsWith(str)) {
                        return true;
                    }
                }
                return false;
            case 2:
                ly lyVar = o82Var2.r;
                if (lyVar != null) {
                    String strI = lyVar.i("class");
                    int length = strI.length();
                    String str3 = this.b;
                    int length2 = str3.length();
                    if (length != 0 && length >= length2) {
                        if (length == length2) {
                            return str3.equalsIgnoreCase(strI);
                        }
                        int i2 = 0;
                        while (i2 < length) {
                            int i3 = i2;
                            while (i3 < length && lb7.i(strI.charAt(i3))) {
                                i3++;
                            }
                            if (i3 != length) {
                                i2 = i3;
                                while (i2 < length && !lb7.i(strI.charAt(i2))) {
                                    i2++;
                                }
                                if (i2 - i3 == length2 && strI.regionMatches(true, i3, str3, 0, length2)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
                return false;
            case 3:
                o82Var2.getClass();
                StringBuilder sbB = lb7.b();
                lq1.P(new ar(sbB, (byte) 7), o82Var2);
                return us1.F(lb7.k(sbB)).contains(str);
            case 4:
                return us1.F(o82Var2.g0()).contains(str);
            case 5:
                return us1.F(o82Var2.h0()).contains(str);
            case 6:
                Stream map = o82Var2.q.stream().map(new k82((byte) 0));
                String[] strArr = lb7.a;
                return ((String) map.collect(Collector.of(new hb7(""), new ib7(), new jb7(), new k82((byte) 3), new Collector.Characteristics[0]))).contains(str);
            case 7:
                o82Var2.getClass();
                Stream map2 = ds1.i0(o82Var2, x35.class).map(new k82((byte) 0));
                String[] strArr2 = lb7.a;
                return ((String) map2.collect(Collector.of(new hb7(""), new ib7(), new jb7(), new k82((byte) 3), new Collector.Characteristics[0]))).contains(str);
            case 8:
                ly lyVar2 = o82Var2.r;
                return str.equals(lyVar2 != null ? lyVar2.i("id") : "");
            case ep1.b /* 9 */:
                return o82Var2.t(str);
            case ep1.c /* 10 */:
                return o82Var2.p.f993o.endsWith(str);
            default:
                return o82Var2.p.f993o.startsWith(str);
        }
    }

    public final String toString() {
        byte b = this.a;
        String str = this.b;
        switch (b) {
            case 0:
                return fx3.g("[", str, "]");
            case 1:
                return fx3.g("[^", str, "]");
            case 2:
                return ua5.m(".", str);
            case 3:
                return fx3.g(":containsData(", str, ")");
            case 4:
                return fx3.g(":containsOwn(", str, ")");
            case 5:
                return fx3.g(":contains(", str, ")");
            case 6:
                return fx3.g(":containsWholeOwnText(", str, ")");
            case 7:
                return fx3.g(":containsWholeText(", str, ")");
            case 8:
                return "#".concat(str);
            case ep1.b /* 9 */:
                return str;
            case ep1.c /* 10 */:
                return "*|".concat(str);
            default:
                return str.concat("|*");
        }
    }

    public /* synthetic */ ld2(String str, boolean z, byte b) {
        this.a = b;
        this.b = str;
    }
}
