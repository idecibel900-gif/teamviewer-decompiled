package o;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xa5 {
    public static final sy4 a;
    public static final sy4 b;
    public static final sy4 c;
    public static final sy4 d;
    public static final sy4 e;
    public static final sy4 f;
    public static final sy4 g;
    public static final sy4 h;
    public static final sy4 i;
    public static final sy4 j;
    public static final sy4 k;
    public static final sy4 l;
    public static final e96 m;
    public static final sy4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final sy4 f2499o;
    public static final sy4 p;
    public static final sy4 q;
    public static final Set r;
    public static final Set s;
    public static final Set t;
    public static final Map u;
    public static final Map v;

    static {
        sy4 sy4VarE = sy4.e("getValue");
        a = sy4VarE;
        sy4 sy4VarE2 = sy4.e("setValue");
        b = sy4VarE2;
        sy4 sy4VarE3 = sy4.e("provideDelegate");
        c = sy4VarE3;
        sy4 sy4VarE4 = sy4.e("equals");
        d = sy4VarE4;
        sy4.e("hashCode");
        sy4 sy4VarE5 = sy4.e("compareTo");
        e = sy4VarE5;
        sy4 sy4VarE6 = sy4.e("contains");
        f = sy4VarE6;
        g = sy4.e("invoke");
        h = sy4.e("iterator");
        i = sy4.e("get");
        sy4 sy4VarE7 = sy4.e("set");
        j = sy4VarE7;
        k = sy4.e("next");
        l = sy4.e("hasNext");
        sy4.e("toString");
        m = new e96("component\\d+");
        sy4 sy4VarE8 = sy4.e("and");
        sy4 sy4VarE9 = sy4.e("or");
        sy4 sy4VarE10 = sy4.e("xor");
        sy4 sy4VarE11 = sy4.e("inv");
        sy4 sy4VarE12 = sy4.e("shl");
        sy4 sy4VarE13 = sy4.e("shr");
        sy4 sy4VarE14 = sy4.e("ushr");
        sy4 sy4VarE15 = sy4.e("inc");
        n = sy4VarE15;
        sy4 sy4VarE16 = sy4.e("dec");
        f2499o = sy4VarE16;
        sy4 sy4VarE17 = sy4.e("plus");
        sy4 sy4VarE18 = sy4.e("minus");
        sy4 sy4VarE19 = sy4.e("not");
        sy4 sy4VarE20 = sy4.e("unaryMinus");
        sy4 sy4VarE21 = sy4.e("unaryPlus");
        sy4 sy4VarE22 = sy4.e("times");
        sy4 sy4VarE23 = sy4.e("div");
        sy4 sy4VarE24 = sy4.e("mod");
        sy4 sy4VarE25 = sy4.e("rem");
        sy4 sy4VarE26 = sy4.e("rangeTo");
        p = sy4VarE26;
        sy4 sy4VarE27 = sy4.e("rangeUntil");
        q = sy4VarE27;
        sy4 sy4VarE28 = sy4.e("timesAssign");
        sy4 sy4VarE29 = sy4.e("divAssign");
        sy4 sy4VarE30 = sy4.e("modAssign");
        sy4 sy4VarE31 = sy4.e("remAssign");
        sy4 sy4VarE32 = sy4.e("plusAssign");
        sy4 sy4VarE33 = sy4.e("minusAssign");
        sy4 sy4VarE34 = sy4.e("toDouble");
        sy4 sy4VarE35 = sy4.e("toFloat");
        sy4 sy4VarE36 = sy4.e("toLong");
        sy4 sy4VarE37 = sy4.e("toInt");
        sy4 sy4VarE38 = sy4.e("toChar");
        sy4 sy4VarE39 = sy4.e("toShort");
        sy4 sy4VarE40 = sy4.e("toByte");
        cx.h1(new sy4[]{sy4VarE15, sy4VarE16, sy4VarE21, sy4VarE20, sy4VarE19, sy4VarE11});
        r = cx.h1(new sy4[]{sy4VarE21, sy4VarE20, sy4VarE19, sy4VarE11});
        Set setH1 = cx.h1(new sy4[]{sy4VarE22, sy4VarE17, sy4VarE18, sy4VarE23, sy4VarE24, sy4VarE25, sy4VarE26, sy4VarE27});
        s = setH1;
        cx.h1(new sy4[]{sy4VarE22, sy4VarE17, sy4VarE18, sy4VarE23, sy4VarE24, sy4VarE25});
        Set setH2 = cx.h1(new sy4[]{sy4VarE8, sy4VarE9, sy4VarE10, sy4VarE11, sy4VarE12, sy4VarE13, sy4VarE14});
        cx.h1(new sy4[]{sy4VarE8, sy4VarE9, sy4VarE10, sy4VarE12, sy4VarE13, sy4VarE14});
        fv6.a0(fv6.a0(setH1, setH2), cx.h1(new sy4[]{sy4VarE4, sy4VarE6, sy4VarE5}));
        Set setH3 = cx.h1(new sy4[]{sy4VarE28, sy4VarE29, sy4VarE30, sy4VarE31, sy4VarE32, sy4VarE33});
        t = setH3;
        cx.h1(new sy4[]{sy4VarE, sy4VarE2, sy4VarE3});
        u = xm4.R(new vd5(sy4VarE24, sy4VarE25), new vd5(sy4VarE30, sy4VarE31));
        fv6.a0(lv1.V(sy4VarE7), setH3);
        cx.h1(new sy4[]{sy4VarE34, sy4VarE35, sy4VarE36, sy4VarE37, sy4VarE39, sy4VarE40, sy4VarE38});
        v = xm4.R(new vd5(sy4VarE15, "++"), new vd5(sy4VarE16, "--"), new vd5(sy4VarE21, "+"), new vd5(sy4VarE20, "-"), new vd5(sy4VarE19, "!"), new vd5(sy4VarE22, "*"), new vd5(sy4VarE17, "+"), new vd5(sy4VarE18, "-"), new vd5(sy4VarE23, "/"), new vd5(sy4VarE25, "%"), new vd5(sy4VarE26, ".."), new vd5(sy4VarE27, "..<"));
    }
}
