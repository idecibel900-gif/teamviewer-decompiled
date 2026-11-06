package o;

import java.io.Reader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class do8 extends o28 {
    public final cj3 m = new cj3((byte) 3);

    @Override // o.o28
    public final String e() {
        return "http://www.w3.org/XML/1998/namespace";
    }

    @Override // o.o28
    public final ig5 f() {
        return ig5.d;
    }

    @Override // o.o28
    public final jn7 g() {
        return new jn7(null, null);
    }

    @Override // o.o28
    public final void j(Reader reader, String str, kg5 kg5Var) {
        super.j(reader, str, kg5Var);
        h32 h32Var = this.d.v;
        h32Var.p = 2;
        h32Var.m = cc2.xhtml;
        h32Var.f945o = false;
        cj3 cj3Var = this.m;
        ((HashMap) cj3Var.n).clear();
        ((ArrayDeque) cj3Var.f531o).clear();
        cj3Var.U("xml", "http://www.w3.org/XML/1998/namespace");
        cj3Var.U("", "http://www.w3.org/XML/1998/namespace");
    }

    @Override // o.o28
    public final o28 l() {
        return new do8();
    }

    @Override // o.o28
    public final o82 m() {
        while (true) {
            cj3 cj3Var = this.m;
            xy4 xy4Var = (xy4) ((ArrayDeque) cj3Var.f531o).pop();
            if (xy4Var == cj3.r) {
                return super.m();
            }
            HashMap map = (HashMap) cj3Var.n;
            String str = xy4Var.b;
            String str2 = xy4Var.a;
            if (str == null) {
                map.remove(str2);
            } else {
                map.put(str2, str);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x010c  */
    @Override // o.o28
    public final boolean n(sj5 sj5Var) {
        boolean z;
        String str;
        String str2;
        int size;
        this.f = sj5Var;
        int iB = ua5.B(sj5Var.a);
        ArrayList arrayList = this.e;
        boolean z2 = true;
        o82 o82Var = null;
        switch (iB) {
            case 0:
                bw7 bw7Var = (bw7) sj5Var;
                ig5 ig5Var = this.g;
                String strF = bw7Var.d.F();
                ig5Var.getClass();
                String strTrim = strF.trim();
                if (!ig5Var.a) {
                    strTrim = us1.F(strTrim);
                }
                l32 l32Var = new l32(strTrim, bw7Var.f.F(), bw7Var.g.F());
                String str3 = bw7Var.e;
                if (str3 != null) {
                    l32Var.d("pubSysKey", str3);
                }
                if (bw7Var.i) {
                    String strF2 = bw7Var.h.F();
                    ly lyVarG = l32Var.g();
                    String str4 = l32.q;
                    lyVarG.o("/doctypeInternalSubset", strF2);
                }
                b().Q(l32Var);
                return true;
            case 1:
                ew7 ew7Var = (ew7) sj5Var;
                ly lyVar = ew7Var.g;
                if (lyVar != null) {
                    this.g.a(lyVar);
                    lyVar.g(this.g);
                }
                this.a.getClass();
                while (arrayList.size() >= 512) {
                    m();
                }
                cj3 cj3Var = this.m;
                ArrayDeque arrayDeque = (ArrayDeque) cj3Var.f531o;
                HashMap map = (HashMap) cj3Var.n;
                arrayDeque.push(cj3.r);
                if (lyVar != null) {
                    lyVar.getClass();
                    ky kyVar = new ky(lyVar);
                    while (true) {
                        int i = 6;
                        if (kyVar.hasNext()) {
                            jy jyVar = (jy) kyVar.next();
                            boolean z3 = z2;
                            String str5 = jyVar.m;
                            String strSubstring = str5.equals("xmlns") ? "" : str5.startsWith("xmlns:") ? str5.substring(6) : null;
                            if (strSubstring != null) {
                                cj3Var.U(strSubstring, ly.c(jyVar.n));
                            }
                            z2 = z3;
                        } else {
                            z = z2;
                            HashMap map2 = new HashMap();
                            ky kyVar2 = new ky(lyVar);
                            while (kyVar2.hasNext()) {
                                String str6 = ((jy) kyVar2.next()).m;
                                if ((str6.equals("xmlns") ? "" : str6.startsWith("xmlns:") ? str6.substring(i) : null) == null) {
                                    int iIndexOf = str6.indexOf(58);
                                    String strSubstring2 = iIndexOf == -1 ? "" : str6.substring(0, iIndexOf);
                                    if (!strSubstring2.isEmpty() && (str2 = (String) map.get(strSubstring2)) != null) {
                                        map2.put("jsoup.xmlns-".concat(strSubstring2), str2);
                                    }
                                    i = 6;
                                }
                            }
                            for (Map.Entry entry : map2.entrySet()) {
                                String str7 = (String) entry.getKey();
                                Object value = entry.getValue();
                                db8.o0(str7);
                                if (value != null || lyVar.l("/jsoup.userdata") != -1) {
                                    Map mapS = lyVar.s();
                                    if (value == null) {
                                        mapS.remove(str7);
                                    } else {
                                        mapS.put(str7, value);
                                    }
                                }
                            }
                            ew7Var.j(this.g);
                        }
                    }
                } else {
                    z = true;
                }
                String strF3 = ew7Var.d.F();
                String str8 = (String) map.get("");
                int iIndexOf2 = strF3.indexOf(58);
                if (iIndexOf2 > 0 && (str = (String) map.get(strF3.substring(0, iIndexOf2))) != null) {
                    str8 = str;
                }
                hn7 hn7VarD = this.h.d(strF3, ew7Var.e, str8, this.g.a);
                o82 o82Var2 = new o82(hn7VarD, null, lyVar);
                b().Q(o82Var2);
                arrayList.add(o82Var2);
                if (ew7Var.f) {
                    hn7VarD.p |= 32;
                    m();
                    return z;
                }
                if (hn7VarD.d()) {
                    m();
                    return z;
                }
                cz7 cz7VarI = hn7VarD.i();
                if (cz7VarI == null) {
                    return z;
                }
                this.c.m(cz7VarI);
                return z;
            case 2:
                ig5 ig5Var2 = this.g;
                String strF4 = ((dw7) sj5Var).d.F();
                ig5Var2.getClass();
                String strTrim2 = strF4.trim();
                if (!ig5Var2.a) {
                    strTrim2 = us1.F(strTrim2);
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    o82 o82Var3 = (o82) arrayList.get(size2);
                    if (o82Var3.x().equals(strTrim2)) {
                        o82Var = o82Var3;
                        if (o82Var != null) {
                            for (size = arrayList.size() - 1; size >= 0 && m() != o82Var; size--) {
                            }
                        }
                    }
                    break;
                }
                if (o82Var != null) {
                    while (size >= 0) {
                    }
                }
                break;
            case 3:
                b().Q(new zw0(((aw7) sj5Var).d.F()));
                return true;
            case 4:
                zv7 zv7Var = (zv7) sj5Var;
                String strF5 = zv7Var.d.F();
                b().Q(zv7Var instanceof yv7 ? new di0(strF5) : b().p.c(256) ? new xg1(strF5) : new et7(strF5));
                return true;
            case 5:
                gw7 gw7Var = (gw7) sj5Var;
                co8 co8Var = new co8(gw7Var.d.F(), gw7Var.m);
                if (gw7Var.g != null) {
                    ly lyVarG2 = co8Var.g();
                    ly lyVar2 = gw7Var.g;
                    lyVarG2.getClass();
                    int size3 = lyVar2.size();
                    if (size3 != 0) {
                        lyVarG2.b(lyVarG2.m + size3);
                        boolean z4 = lyVarG2.m != 0;
                        ky kyVar3 = new ky(lyVar2);
                        while (kyVar3.hasNext()) {
                            jy jyVar2 = (jy) kyVar3.next();
                            String str9 = jyVar2.m;
                            if (z4) {
                                lyVarG2.o(str9, ly.c(jyVar2.n));
                                jyVar2.f1210o = lyVarG2;
                            } else {
                                lyVarG2.a(ly.c(jyVar2.n), str9);
                            }
                        }
                    }
                }
                b().Q(co8Var);
                return true;
            case 6:
                break;
            default:
                throw new fb8("Unexpected token type: ".concat(to7.r(sj5Var.a)));
        }
        return true;
    }
}
