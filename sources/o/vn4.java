package o;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vn4 implements aj1, k01 {
    public static final String[] A;
    public static final String[] B;
    public static final String[] C;
    public static final String[] D;
    public static final String[] E;
    public static final String[] F;
    public static final String[] G;
    public static final String[] H;
    public static final String[] I;
    public static final String[] J;
    public static final String[] K;
    public static final String[] L;
    public static final String[] M;
    public static final String[] N;
    public static final String[] O;
    public static final String[] P;
    public static final String[] Q;
    public static final String[] R;
    public static final String[] S;
    public static final String[] T;
    public static final String[] U;
    public static final String[] V;
    public static final String[] W;
    public static final String[] X;
    public static final String[] Y;
    public static final String[] Z;
    public static final String[] a0;
    public static final String[] b0;
    public static final yy0 c;
    public static final String[] c0;
    public static final yy0 d;
    public static final String[] d0;
    public static final yy0 e;
    public static final String[] e0;
    public static final yy0 f;
    public static final String[] f0;
    public static final yy0 g;
    public static final ti4 g0;
    public static final yy0 h;
    public static final nw3[] h0;
    public static final hr2 i0;
    public static final yn1 j0;
    public static final yy0 k;
    public static final yn1 k0;
    public static final yy0 l;
    public static final yn1 l0;
    public static final yn1 m0;
    public static final yn1 n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final yy0 f2331o;
    public static final yn1 o0;
    public static final char[] p;
    public static final yn1 p0;
    public static final char[] q;
    public static final yn1 q0;
    public static final char[] r;
    public static final yn1 r0;
    public static final char[] s;
    public static final char[] t;
    public static final hr2 u;
    public static final hr2 v;
    public static final String[] w;
    public static final String[] x;
    public static final String[] y;
    public static final String[] z;
    public static final yy0 a = new yy0(976215936, false, new p20(6));
    public static final yy0 b = new yy0(-113418757, false, new g9((byte) 15));
    public static final yy0 i = new yy0(613695874, false, new p20(7));
    public static final yy0 j = new yy0(-1406127079, false, new zy0(24));
    public static final yy0 m = new yy0(-97539050, false, new fz0(1));
    public static final yy0 n = new yy0(260345878, false, new gz0(4));

    static {
        byte b2 = 16;
        c = new yy0(-1358187855, false, new g9(b2));
        byte b3 = 17;
        d = new yy0(604073818, false, new g9(b3));
        byte b4 = 18;
        e = new yy0(300027244, false, new g9(b4));
        byte b5 = 19;
        f = new yy0(532362004, false, new g9(b5));
        byte b6 = 20;
        g = new yy0(-439663145, false, new g9(b6));
        byte b7 = 21;
        h = new yy0(282056771, false, new g9(b7));
        k = new yy0(-1040527663, false, new az0(b2));
        l = new yy0(-1941867062, false, new az0(b3));
        new yy0(537245626, false, new fz0((byte) 26));
        f2331o = new yy0(641200809, false, new iz0((byte) 10));
        p = new char[]{'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] cArr = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_'};
        q = cArr;
        r = new char[]{'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        s = cArr;
        t = new char[]{'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', 127};
        byte b8 = 14;
        u = new hr2("REMOVED_TASK", b8);
        v = new hr2("CLOSED_EMPTY", b8);
        w = new String[]{"base", "basefont", "bgsound", "command", "link"};
        x = new String[]{"noframes", "style"};
        y = new String[]{"body", "br", "html"};
        z = new String[]{"body", "br", "html"};
        A = new String[]{"body", "br", "head", "html"};
        B = new String[]{"base", "basefont", "bgsound", "command", "link", "meta", "noframes", "script", "style", "template", "title"};
        C = new String[]{"address", "article", "aside", "blockquote", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "menu", "nav", "ol", "p", "section", "summary", "ul"};
        D = new String[]{"h1", "h2", "h3", "h4", "h5", "h6"};
        E = new String[]{"address", "div", "p"};
        F = new String[]{"dd", "dt"};
        G = new String[]{"applet", "marquee", "object"};
        H = new String[]{"param", "source", "track"};
        I = new String[]{"caption", "col", "colgroup", "frame", "head", "tbody", "td", "tfoot", "th", "thead", "tr"};
        J = new String[]{"address", "article", "aside", "blockquote", "button", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "listing", "menu", "nav", "ol", "pre", "section", "summary", "ul"};
        K = new String[]{"body", "dd", "dt", "html", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};
        L = new String[]{"a", "b", "big", "code", "em", "font", "i", "nobr", "s", "small", "strike", "strong", "tt", "u"};
        M = new String[]{"tbody", "tfoot", "thead"};
        N = new String[]{"td", "th", "tr"};
        O = new String[]{"script", "style", "template"};
        P = new String[]{"td", "th"};
        Q = new String[]{"body", "caption", "col", "colgroup", "html"};
        R = new String[]{"table", "tbody", "tfoot", "thead", "tr"};
        S = new String[]{"caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr"};
        T = new String[]{"body", "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
        U = new String[]{"table", "tbody", "tfoot", "thead", "tr"};
        V = new String[]{"caption", "col", "colgroup", "tbody", "tfoot", "thead"};
        W = new String[]{"body", "caption", "col", "colgroup", "html", "td", "th", "tr"};
        X = new String[]{"caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr"};
        Y = new String[]{"body", "caption", "col", "colgroup", "html", "td", "th"};
        Z = new String[]{"input", "keygen", "textarea"};
        a0 = new String[]{"caption", "table", "tbody", "td", "tfoot", "th", "thead", "tr"};
        b0 = new String[]{"tbody", "tfoot", "thead"};
        c0 = new String[]{"body", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
        d0 = new String[]{"base", "basefont", "bgsound", "link", "meta", "noframes", "script", "style", "template", "title"};
        e0 = new String[]{"caption", "colgroup", "tbody", "tfoot", "thead"};
        f0 = new String[]{"b", "big", "blockquote", "body", "br", "center", "code", "dd", "div", "dl", "dt", "em", "embed", "h1", "h2", "h3", "h4", "h5", "h6", "head", "hr", "i", "img", "li", "listing", "menu", "meta", "nobr", "ol", "p", "pre", "ruby", "s", "small", "span", "strike", "strong", "sub", "sup", "table", "tt", "u", "ul", "var"};
        g0 = new ti4((byte) 13);
        h0 = new nw3[0];
        i0 = new hr2("StdlibClassFinder", (byte) 11);
        j0 = new yn1(new yr7(b4), new yb8((byte) 5));
        k0 = new yn1(new yr7(b5), new yr7(b6));
        l0 = new yn1(new yr7(b7), new yr7((byte) 22));
        m0 = new yn1(new yr7((byte) 23), new yr7((byte) 24));
        n0 = new yn1(new yr7((byte) 25), new yr7((byte) 26));
        o0 = new yn1(new yr7((byte) 27), new yr7((byte) 28));
        p0 = new yn1(new yr7((byte) 29), new yb8((byte) 0));
        q0 = new yn1(new yb8((byte) 1), new yb8((byte) 2));
        r0 = new yn1(new yb8((byte) 3), new yb8((byte) 4));
    }

    public static final void D(int i2, String str, Function0 function0, Function1 function1, ux2 ux2Var, fs4 fs4Var, xy6 xy6Var) {
        xy6 xy6Var2;
        Function0 function2;
        me1 me1Var;
        ux2 ux2Var2 = ux2Var;
        str.getClass();
        function1.getClass();
        function0.getClass();
        xy6Var.getClass();
        ux2Var2.Y(2007944628);
        int i3 = i2 | (ux2Var2.f(str) ? 4 : 2) | (ux2Var2.h(function1) ? 32 : 16) | (ux2Var2.h(function0) ? 256 : 128) | (ux2Var2.f(xy6Var) ? 2048 : 1024);
        if (ux2Var2.N(i3 & 1, (i3 & 9363) != 9362)) {
            Object objK = ux2Var2.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = ck3.w(ux2Var2);
                ux2Var2.g0(objK);
            }
            me1 me1Var2 = (me1) objK;
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var2, 0);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4Var);
            yz0.c.getClass();
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(LayoutNode.e0);
            } else {
                ux2Var2.j0();
            }
            o67.n(kw0VarA, d82.v, ux2Var2);
            o67.n(yj5VarL, d82.u, ux2Var2);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
            o67.l(ux2Var2);
            o67.n(fs4VarS, d82.t, ux2Var2);
            cs4 cs4Var = cs4.b;
            fs4 fs4VarF = ka0.F(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 0.0f, 0.0f, 0.0f, 8.0f, 7);
            int i4 = i3 & 7168;
            int i5 = i3 & 896;
            boolean zH = ((i3 & 14) == 4) | ux2Var2.h(me1Var2) | (i4 == 2048) | (i5 == 256) | ((i3 & 112) == 32);
            Object objK2 = ux2Var2.K();
            if (zH || objK2 == awVar) {
                me1Var = me1Var2;
                bk bkVar = new bk(me1Var, xy6Var, function0, function1, str);
                ux2Var2.g0(bkVar);
                objK2 = bkVar;
            } else {
                me1Var = me1Var2;
            }
            me1 me1Var3 = me1Var;
            m77.g((Function0) objK2, fs4VarF, null, false, "TVTA-settings-quality-continueButton", null, di1.f, ux2Var, 1597488, 44);
            fs4 fs4VarF2 = ka0.F(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 0.0f, 0.0f, 0.0f, 8.0f, 7);
            boolean zH2 = ux2Var.h(me1Var3) | (i4 == 2048) | (i5 == 256);
            Object objK3 = ux2Var.K();
            if (zH2 || objK3 == awVar) {
                function2 = function0;
                xy6Var2 = xy6Var;
                objK3 = new f70(me1Var3, xy6Var2, function2, (byte) 3);
                ux2Var.g0(objK3);
            } else {
                function2 = function0;
                xy6Var2 = xy6Var;
            }
            ux2Var2 = ux2Var;
            v67.d((Function0) objK3, fs4VarF2, null, false, "TVTA-settings-quality-cancelButton", di1.g, ux2Var2, 221232, 12);
            ux2Var2.p(true);
        } else {
            xy6Var2 = xy6Var;
            function2 = function0;
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new fx0(str, function1, function2, xy6Var2, fs4Var, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:123:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:135:0x020f  */
    /* JADX WARN: Code duplicated, block: B:138:0x0224  */
    /* JADX WARN: Code duplicated, block: B:139:0x0228  */
    /* JADX WARN: Code duplicated, block: B:142:0x0238  */
    /* JADX WARN: Code duplicated, block: B:144:0x0246  */
    /* JADX WARN: Code duplicated, block: B:145:0x0252  */
    /* JADX WARN: Code duplicated, block: B:152:0x0287  */
    /* JADX WARN: Code duplicated, block: B:155:0x028d  */
    /* JADX WARN: Code duplicated, block: B:158:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:161:0x02b8 A[LOOP:0: B:160:0x02b6->B:161:0x02b8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:163:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:167:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:176:0x0316  */
    /* JADX WARN: Code duplicated, block: B:178:0x031c  */
    /* JADX WARN: Code duplicated, block: B:182:0x033f  */
    /* JADX WARN: Code duplicated, block: B:191:0x0376  */
    /* JADX WARN: Code duplicated, block: B:193:0x037c  */
    /* JADX WARN: Code duplicated, block: B:195:0x038e  */
    /* JADX WARN: Code duplicated, block: B:196:0x0398  */
    /* JADX WARN: Code duplicated, block: B:199:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:200:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:203:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:204:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:206:0x03db  */
    /* JADX WARN: Code duplicated, block: B:210:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:211:0x0407  */
    /* JADX WARN: Code duplicated, block: B:213:0x0413  */
    /* JADX WARN: Code duplicated, block: B:216:0x0451  */
    /* JADX WARN: Code duplicated, block: B:222:0x0485  */
    /* JADX WARN: Code duplicated, block: B:231:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:233:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:234:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:237:0x04cf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:238:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:241:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:244:0x050e  */
    /* JADX WARN: Code duplicated, block: B:245:0x0510  */
    /* JADX WARN: Code duplicated, block: B:248:0x051e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:251:0x0523  */
    /* JADX WARN: Code duplicated, block: B:254:0x0546  */
    /* JADX WARN: Code duplicated, block: B:260:0x055c  */
    /* JADX WARN: Code duplicated, block: B:263:0x0564 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:266:0x0569  */
    /* JADX WARN: Code duplicated, block: B:269:0x056e  */
    /* JADX WARN: Code duplicated, block: B:271:0x057c  */
    /* JADX WARN: Code duplicated, block: B:273:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:275:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:277:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:279:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:281:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:283:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:285:0x060d  */
    /* JADX WARN: Code duplicated, block: B:287:0x061a  */
    /* JADX WARN: Code duplicated, block: B:290:0x061f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:299:0x0631  */
    /* JADX WARN: Code duplicated, block: B:301:0x064a  */
    /* JADX WARN: Code duplicated, block: B:303:0x0668  */
    /* JADX WARN: Code duplicated, block: B:306:0x067b  */
    /* JADX WARN: Code duplicated, block: B:311:0x068a  */
    /* JADX WARN: Code duplicated, block: B:315:0x0690  */
    /* JADX WARN: Code duplicated, block: B:321:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:324:0x06a6  */
    /* JADX WARN: Code duplicated, block: B:326:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:328:0x06d3  */
    /* JADX WARN: Code duplicated, block: B:330:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:332:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:334:0x070d  */
    /* JADX WARN: Code duplicated, block: B:336:0x071c  */
    /* JADX WARN: Code duplicated, block: B:337:0x0735  */
    /* JADX WARN: Code duplicated, block: B:340:0x076b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:343:0x0774  */
    /* JADX WARN: Code duplicated, block: B:346:0x07a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:347:0x07a4  */
    /* JADX WARN: Code duplicated, block: B:350:0x07c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:351:0x07c8  */
    /* JADX WARN: Code duplicated, block: B:354:0x0814  */
    /* JADX WARN: Code duplicated, block: B:355:0x081f  */
    /* JADX WARN: Code duplicated, block: B:358:0x083d  */
    /* JADX WARN: Code duplicated, block: B:359:0x0843  */
    /* JADX WARN: Code duplicated, block: B:362:0x085a  */
    public static final void E(u18 u18Var, Function1 function1, fs4 fs4Var, bc2 bc2Var, hf2 hf2Var, hw2 hw2Var, yy0 yy0Var, ux2 ux2Var, int i2) {
        ux2 ux2Var2;
        yy0 yy0Var2;
        Object obj;
        int i3;
        boolean z2;
        Object obj2;
        u18 u18Var2;
        boolean zF;
        Object obj3;
        boolean zF2;
        Object obj4;
        px4 px4Var;
        bg5 bg5Var;
        Object objP0;
        Object value;
        mb2 mb2Var;
        mb2 mb2Var2;
        bc2 bc2Var2;
        bg5 bg5Var2;
        g2 g2Var;
        boolean zF3;
        Object obj5;
        px4 px4Var2;
        ih2 ih2Var;
        ih2 ih2Var2;
        pi6 pi6Var;
        pi6 pi6Var2;
        f17 f17Var;
        Object objK;
        Object obj6;
        boolean z3;
        f17 f17Var2;
        um0 um0Var;
        Object objK2;
        Object obj7;
        um0 um0Var2;
        hf2 hf2Var2;
        px4 px4VarT;
        boolean zF4;
        Object obj8;
        boolean z4;
        Object obj9;
        co coVar;
        dy6 dy6Var;
        Object objK3;
        Object obj10;
        Function0 function0;
        boolean z5;
        boolean zH;
        Object obj11;
        t18 t18Var;
        t18 t18Var2;
        um0 um0Var3;
        boolean zA;
        f17 f17Var3;
        um0 um0Var4;
        dy6 dy6Var2;
        bc2 bc2Var3;
        t18 t18Var3;
        boolean z6;
        boolean z7;
        yn1 yn1Var;
        um0 um0Var5;
        yn1 yn1Var2;
        boolean z8;
        ux2 ux2Var3;
        n18 n18Var;
        ux2 ux2Var4;
        n18 n18Var2;
        n18 n18Var3;
        boolean z9;
        td6 td6Var;
        cs4 cs4Var;
        fs4 kc8Var;
        cs4 cs4Var2;
        boolean z10;
        boolean z11;
        dy6 dy6Var3;
        yn1 yn1Var3;
        cs4 cs4Var3;
        n18 n18Var4;
        n18 n18Var5;
        n18 n18VarY;
        boolean zH2;
        Object objK4;
        dy6 dy6Var4;
        bc2 bc2Var4;
        hf2 hf2Var3;
        boolean zH3;
        Object obj12;
        boolean zG;
        Object obj13;
        Object objK5;
        co coVar2;
        Object obj14;
        Integer numValueOf;
        iz0 iz0Var;
        Object objK6;
        Object obj15;
        Object objK7;
        Object obj16;
        Object objK8;
        Object obj17;
        Object objK9;
        Object obj18;
        Object objK10;
        Object obj19;
        Object objK11;
        ux2 ux2Var5;
        yy0 yy0Var3;
        Object value2;
        mb2 mb2VarX0;
        g2 g2Var2;
        bg5 bg5Var3;
        Object value3;
        boolean z12;
        j57 j57Var;
        int size;
        int i4;
        fs4 fs4Var2 = fs4Var;
        yy0 yy0Var4 = yy0Var;
        ux2 ux2Var6 = ux2Var;
        ux2Var6.Y(-1310802509);
        int i5 = (i2 & 6) == 0 ? (ux2Var6.f(u18Var) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i5 |= ux2Var6.h(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= ux2Var6.f(fs4Var2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= ux2Var6.f(bc2Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= ux2Var6.f(hf2Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i5 |= ux2Var6.h(hw2Var) ? 131072 : 65536;
        }
        int i6 = i5 | 1572864;
        if ((12582912 & i2) == 0) {
            i6 |= ux2Var6.h(null) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i6 |= ux2Var6.h(yy0Var4) ? 67108864 : 33554432;
        }
        int i7 = i6;
        if (ux2Var6.N(i7 & 1, (38347923 & i7) != 38347922)) {
            bg5 bg5Var4 = u18Var.e;
            bg5 bg5Var5 = u18Var.d;
            g2 g2Var3 = u18Var.a;
            Object value4 = bg5Var4.getValue();
            Object objK12 = ux2Var6.K();
            aw awVar = e01.a;
            if (objK12 == awVar) {
                obj = objK12;
                bg5 bg5VarP = h57.p(Boolean.FALSE);
                ux2Var6.g0(bg5VarP);
                obj = bg5VarP;
            }
            obj = objK12;
            px4 px4Var3 = (px4) obj;
            Object objK13 = ux2Var6.K();
            byte b2 = 6;
            Object obj20 = objK13;
            if (objK13 == awVar) {
                io.sentry.android.replay.a0 a0Var = new io.sentry.android.replay.a0(px4Var3, b2);
                ux2Var6.g0(a0Var);
                obj20 = a0Var;
            }
            int i8 = i7 & 14;
            int i9 = i8 | 48;
            wb2.a(u18Var, (Function0) obj20, ux2Var6, i9);
            if (value4 != null && ((Boolean) function1.invoke(value4)).booleanValue()) {
                px4Var3.setValue(Boolean.TRUE);
            }
            if (((Boolean) function1.invoke(bg5Var5.getValue())).booleanValue() || ((Boolean) function1.invoke(g2Var3.p0())).booleanValue() || ((value4 != null && ((Boolean) function1.invoke(value4)).booleanValue()) || ((((Boolean) px4Var3.getValue()).booleanValue() && !im3.n(g2Var3.p0(), bg5Var5.getValue())) || u18Var.g() || u18Var.d()))) {
                ux2Var6.W(-273709037);
                int i10 = i9 & 14;
                boolean z13 = ((i10 ^ 6) > 4 && ux2Var6.f(u18Var)) || (i9 & 6) == 4;
                Object objK14 = ux2Var6.K();
                if (z13 || objK14 == awVar) {
                    objK14 = g2Var3.p0();
                    ux2Var6.g0(objK14);
                }
                if (u18Var.g()) {
                    objK14 = g2Var3.p0();
                }
                ux2Var6.W(2016262395);
                mb2 mb2VarX1 = x0(u18Var, function1, objK14, ux2Var6);
                ux2Var6.p(false);
                Object value5 = bg5Var5.getValue();
                ux2Var6.W(2016262395);
                mb2 mb2VarX2 = x0(u18Var, function1, value5, ux2Var6);
                ux2Var6.p(false);
                int i11 = i10 | 3072;
                int i12 = (i11 & 14) ^ 6;
                if (i12 <= 4 || !ux2Var6.f(u18Var)) {
                    i3 = i11;
                    if ((i3 & 6) != 4) {
                        z2 = false;
                    }
                    Object objK15 = ux2Var6.K();
                    if (!z2 || objK15 == awVar) {
                        u18 u18Var3 = new u18(new wx4(mb2VarX1), u18Var, ua5.z(u18Var.c, " > EnterExitTransition"));
                        ux2Var6.g0(u18Var3);
                        obj2 = u18Var3;
                    } else {
                        obj2 = objK15;
                    }
                    u18Var2 = (u18) obj2;
                    zF = ((i12 <= 4 && ux2Var6.f(u18Var)) || (i3 & 6) == 4) | ux2Var6.f(u18Var2);
                    Object objK16 = ux2Var6.K();
                    obj3 = objK16;
                    if (zF || objK16 == awVar) {
                        py5 py5Var = new py5((Object) u18Var, (Object) u18Var2, (byte) 29);
                        ux2Var6.g0(py5Var);
                        obj3 = py5Var;
                    }
                    ck3.e(u18Var2, (Function1) obj3, ux2Var6);
                    if (u18Var.g()) {
                        u18Var2.j(mb2VarX1, mb2VarX2);
                    } else {
                        u18Var2.o(mb2VarX2);
                        u18Var2.l.setValue(Boolean.FALSE);
                    }
                    if (u18Var.g()) {
                        ux2Var6.W(782538635);
                        ux2Var6.p(false);
                    } else {
                        ux2Var6.W(782386797);
                        value2 = u18Var.e.getValue();
                        if (value2 == null) {
                            ux2Var6.W(782437481);
                            ux2Var6.p(false);
                            mb2VarX0 = null;
                        } else {
                            ux2Var6.W(782437482);
                            ux2Var6.W(2016262395);
                            mb2VarX0 = x0(u18Var, function1, value2, ux2Var6);
                            ux2Var6.p(false);
                            ux2Var6.p(false);
                        }
                        g2Var2 = u18Var2.a;
                        bg5Var3 = u18Var2.d;
                        bg5 bg5Var6 = u18Var2.e;
                        value3 = bg5Var6.getValue();
                        if (value3 == null && mb2VarX0 == null && im3.n(bg5Var3.getValue(), g2Var2.p0())) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        bg5Var6.setValue(mb2VarX0);
                        if (z12) {
                            u18Var2.f.setValue(new p18(value3, bg5Var3.getValue()));
                            g2Var2.y0(value3);
                            if (u18Var2.h.z() == Long.MIN_VALUE) {
                                u18Var2.m(true);
                            }
                            j57Var = u18Var2.j;
                            size = j57Var.size();
                            for (i4 = 0; i4 < size; i4++) {
                                ((q18) j57Var.get(i4)).t.A(-2.0f);
                            }
                        }
                        ux2Var6.p(false);
                    }
                    zF2 = ux2Var6.f(u18Var2);
                    Object objK17 = ux2Var6.K();
                    obj4 = objK17;
                    if (zF2 || objK17 == awVar) {
                        bg5 bg5VarP2 = h57.p(bc2Var);
                        ux2Var6.g0(bg5VarP2);
                        obj4 = bg5VarP2;
                    }
                    px4Var = (px4) obj4;
                    g2 g2Var4 = u18Var2.a;
                    bg5Var = u18Var2.d;
                    objP0 = g2Var4.p0();
                    value = bg5Var.getValue();
                    mb2Var = mb2.f1456o;
                    mb2Var2 = mb2.n;
                    if (objP0 == value || u18Var2.a.p0() != mb2Var2) {
                        if (bg5Var.getValue() != mb2Var) {
                            px4Var.setValue(((bc2) px4Var.getValue()).a(bc2Var));
                        }
                    } else if (u18Var2.g()) {
                        px4Var.setValue(bc2Var);
                    } else {
                        px4Var.setValue(bc2.b);
                    }
                    bc2Var2 = (bc2) px4Var.getValue();
                    bg5Var2 = u18Var2.d;
                    g2Var = u18Var2.a;
                    zF3 = ux2Var6.f(u18Var2);
                    Object objK18 = ux2Var6.K();
                    obj5 = objK18;
                    if (zF3 || objK18 == awVar) {
                        bg5 bg5VarP3 = h57.p(hf2Var);
                        ux2Var6.g0(bg5VarP3);
                        obj5 = bg5VarP3;
                    }
                    px4Var2 = (px4) obj5;
                    if (g2Var.p0() != bg5Var2.getValue() && g2Var.p0() == mb2Var2) {
                        ux2Var6.W(-505142498);
                        ux2Var6.p(false);
                        if (u18Var2.g()) {
                            px4Var2.setValue(hf2Var);
                        } else {
                            px4Var2.setValue(hf2.b);
                        }
                    } else if (bg5Var2.getValue() != mb2Var2) {
                        ux2Var6.W(-504838512);
                        ih2Var = ((hf2) px4Var2.getValue()).a.a;
                        if (ih2Var != null) {
                            ih2Var2 = new ih2(1.0f, ih2Var.b);
                        } else {
                            ih2Var2 = null;
                        }
                        pi6Var = ((hf2) px4Var2.getValue()).a.d;
                        if (pi6Var != null) {
                            pi6Var2 = new pi6(1.0f, pi6Var.b, pi6Var.c);
                        } else {
                            pi6Var2 = null;
                        }
                        f17Var = ((hf2) px4Var2.getValue()).a.b;
                        if (f17Var == null) {
                            ux2Var6.W(-504119809);
                            z3 = false;
                            ux2Var6.p(false);
                            f17Var2 = null;
                        } else {
                            ux2Var6.W(-708998590);
                            objK = ux2Var6.K();
                            if (objK == awVar) {
                                obj6 = objK;
                                zm zmVar = zm.x;
                                ux2Var6.g0(zmVar);
                                obj6 = zmVar;
                            }
                            obj6 = objK;
                            f17 f17Var4 = new f17((Function1) obj6, f17Var.b);
                            z3 = false;
                            ux2Var6.p(false);
                            f17Var2 = f17Var4;
                        }
                        um0Var = ((hf2) px4Var2.getValue()).a.c;
                        if (um0Var == null) {
                            ux2Var6.W(-504024174);
                            ux2Var6.p(z3);
                            um0Var2 = null;
                        } else {
                            ux2Var6.W(-708995505);
                            objK2 = ux2Var6.K();
                            if (objK2 == awVar) {
                                obj7 = objK2;
                                zm zmVar2 = zm.y;
                                ux2Var6.g0(zmVar2);
                                obj7 = zmVar2;
                            }
                            obj7 = objK2;
                            um0 um0Var6 = new um0(um0Var.a, (Function1) obj7, um0Var.c, um0Var.d);
                            ux2Var6.p(false);
                            um0Var2 = um0Var6;
                        }
                        t18 t18Var4 = ((hf2) px4Var2.getValue()).a;
                        px4Var2.setValue(new hf2(new t18(ih2Var2, f17Var2, um0Var2, pi6Var2, (LinkedHashMap) null, 96)).a(hf2Var));
                        ux2Var6.p(false);
                    } else {
                        ux2Var6.W(-503833306);
                        ux2Var6.p(false);
                    }
                    hf2Var2 = (hf2) px4Var2.getValue();
                    px4VarT = h57.t(hw2Var, ux2Var6);
                    Object objInvoke = hw2Var.invoke(g2Var.p0(), bg5Var2.getValue());
                    zF4 = ux2Var6.f(u18Var2) | ux2Var6.f(px4VarT);
                    Object objK19 = ux2Var6.K();
                    if (!zF4 || objK19 == awVar) {
                        j0 j0Var = new j0(u18Var2, px4VarT, null, (byte) 8);
                        ux2Var6.g0(j0Var);
                        obj8 = j0Var;
                    } else {
                        obj8 = objK19;
                    }
                    px4 px4VarO = f57.o(objInvoke, (hw2) obj8, ux2Var6);
                    if (g2Var.p0() != mb2Var && bg5Var2.getValue() == mb2Var && ((Boolean) px4VarO.getValue()).booleanValue()) {
                        ux2Var6.W(-270520625);
                        z8 = false;
                        ux2Var6.p(false);
                        yy0Var3 = yy0Var;
                        ux2Var5 = ux2Var6;
                    } else {
                        ux2Var6.W(-272022668);
                        if (i8 == 4) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        Object objK20 = ux2Var6.K();
                        obj9 = objK20;
                        if (z4 || objK20 == awVar) {
                            co coVar3 = new co();
                            ux2Var6.g0(coVar3);
                            obj9 = coVar3;
                        }
                        coVar = (co) obj9;
                        dy6Var = coVar.b;
                        objK3 = ux2Var6.K();
                        obj10 = objK3;
                        if (objK3 == awVar) {
                            hm1 hm1Var = hm1.p;
                            ux2Var6.g0(hm1Var);
                            obj10 = hm1Var;
                        }
                        function0 = (Function0) obj10;
                        ux2Var6.W(-1491182875);
                        ux2Var6.p(false);
                        ux2Var6.W(-1491180092);
                        ux2Var6.p(false);
                        ux2Var6.W(-31257052);
                        ux2Var6.p(false);
                        if (u18Var2.e.getValue() != null) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        dy6Var.c(z5);
                        zH = ux2Var6.h(dy6Var);
                        Object objK21 = ux2Var6.K();
                        if (!zH || objK21 == awVar) {
                            tb2 tb2Var = new tb2(dy6Var, (byte) 1);
                            ux2Var6.g0(tb2Var);
                            obj11 = tb2Var;
                        } else {
                            obj11 = objK21;
                        }
                        wb2.a(u18Var2, (Function0) obj11, ux2Var6, 0);
                        t18Var = bc2Var2.a;
                        t18Var2 = hf2Var2.a;
                        um0Var3 = t18Var2.c;
                        zA = z68.a(dy6Var.e, rv0.g);
                        f17Var3 = t18Var.b;
                        um0Var4 = t18Var.c;
                        if (f17Var3 == null || t18Var2.b != null) {
                            dy6Var2 = dy6Var;
                            bc2Var3 = bc2Var2;
                            t18Var3 = t18Var2;
                        } else {
                            t18Var3 = t18Var2;
                            dy6Var2 = dy6Var;
                            bc2Var3 = bc2Var2;
                            if (vk3.a(dy6Var.i, 0L)) {
                                z6 = false;
                            }
                            if (um0Var4 == null || um0Var3 != null) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            yn1Var = p0;
                            if (z6) {
                                ux2Var.W(1018653691);
                                objK11 = ux2Var.K();
                                if (objK11 == awVar) {
                                    objK11 = "Built-in slide";
                                    ux2Var.g0("Built-in slide");
                                }
                                String str = (String) objK11;
                                um0Var5 = um0Var4;
                                z8 = false;
                                ux2 ux2Var7 = ux2Var;
                                n18 n18VarY2 = ck3.y(u18Var2, yn1Var, str, ux2Var7, 384, 0);
                                yn1Var2 = yn1Var;
                                ux2Var7.p(false);
                                n18Var = n18VarY2;
                                ux2Var4 = ux2Var7;
                            } else {
                                um0Var5 = um0Var4;
                                yn1Var2 = yn1Var;
                                z8 = false;
                                ux2Var3 = ux2Var;
                                ux2Var3.W(1018759494);
                                ux2Var3.p(false);
                                n18Var = null;
                            }
                            if (z7 != 0) {
                                ux2Var4 = ux2Var3;
                                ux2Var4.W(1018851285);
                                objK10 = ux2Var4.K();
                                if (objK10 == awVar) {
                                    obj19 = objK10;
                                    ux2Var4.g0("Built-in shrink/expand");
                                    obj19 = "Built-in shrink/expand";
                                }
                                obj19 = objK10;
                                n18 n18VarY3 = ck3.y(u18Var2, q0, (String) obj19, ux2Var4, 384, 0);
                                ux2Var4.p(z8);
                                n18Var2 = n18VarY3;
                            } else {
                                ux2Var4 = ux2Var3;
                                ux2Var4.W(1018962109);
                                ux2Var4.p(z8);
                                n18Var2 = null;
                            }
                            if (z7 != 0) {
                                ux2Var4.W(1019035735);
                                objK9 = ux2Var4.K();
                                if (objK9 == awVar) {
                                    obj18 = objK9;
                                    ux2Var4.g0("Built-in InterruptionHandlingOffset");
                                    obj18 = "Built-in InterruptionHandlingOffset";
                                }
                                obj18 = objK9;
                                n18 n18VarY4 = ck3.y(u18Var2, yn1Var2, (String) obj18, ux2Var4, 384, 0);
                                ux2Var4.p(z8);
                                n18Var3 = n18VarY4;
                            } else {
                                ux2Var4.W(1019206141);
                                ux2Var4.p(z8);
                                n18Var3 = null;
                            }
                            z9 = ((um0Var5 != null || um0Var5.d) && (um0Var3 == 0 || um0Var3.d) && z7) ? z8 ? 1 : 0 : true;
                            td6Var = ew0.e;
                            cs4Var = cs4.b;
                            if (zA) {
                                ux2Var4.W(1020031362);
                                ux2Var4.p(z8);
                                kc8Var = cs4Var;
                            } else {
                                ux2Var4.W(1019733235);
                                yn1 yn1Var4 = new yn1(zm.t, new io.sentry.okhttp.b(td6Var, (byte) 5));
                                objK8 = ux2Var4.K();
                                if (objK8 == awVar) {
                                    obj17 = objK8;
                                    ux2Var4.g0("Built-in veil");
                                    obj17 = "Built-in veil";
                                }
                                obj17 = objK8;
                                kc8Var = new kc8(u18Var2, ck3.y(u18Var2, yn1Var4, (String) obj17, ux2Var4, 384, 0), bc2Var3, hf2Var2, dy6Var2);
                                ux2Var4.p(z8);
                            }
                            if (t18Var.a == null || t18Var3.a != null) {
                                cs4Var2 = cs4Var;
                            } else {
                                cs4Var2 = cs4Var;
                                z10 = dy6Var2.f == 1.0f ? z8 ? 1 : 0 : true;
                                if (t18Var.d != null && t18Var3.d == null && dy6Var2.g == 1.0f) {
                                    z11 = z8 ? 1 : 0;
                                } else {
                                    z11 = true;
                                }
                                dy6Var3 = dy6Var2;
                                yn1Var3 = j0;
                                if (z10) {
                                    ux2Var4.W(-1511865571);
                                    objK7 = ux2Var4.K();
                                    if (objK7 == awVar) {
                                        obj16 = objK7;
                                        ux2Var4.g0("Built-in alpha");
                                        obj16 = "Built-in alpha";
                                    }
                                    obj16 = objK7;
                                    cs4Var3 = cs4Var2;
                                    n18 n18VarY5 = ck3.y(u18Var2, yn1Var3, (String) obj16, ux2Var4, 384, 0);
                                    ux2Var4.p(z8);
                                    n18Var4 = n18VarY5;
                                } else {
                                    cs4Var3 = cs4Var2;
                                    ux2Var4.W(-1511696126);
                                    ux2Var4.p(z8);
                                    n18Var4 = null;
                                }
                                if (z11 != 0) {
                                    ux2Var4.W(-1511628483);
                                    objK6 = ux2Var4.K();
                                    if (objK6 == awVar) {
                                        obj15 = objK6;
                                        ux2Var4.g0("Built-in scale");
                                        obj15 = "Built-in scale";
                                    }
                                    obj15 = objK6;
                                    n18 n18VarY6 = ck3.y(u18Var2, yn1Var3, (String) obj15, ux2Var4, 384, 0);
                                    ux2Var4.p(z8);
                                    n18Var5 = n18VarY6;
                                } else {
                                    ux2Var4.W(-1511459038);
                                    ux2Var4.p(z8);
                                    n18Var5 = null;
                                }
                                if (z11) {
                                    ux2Var4.W(-1511381382);
                                    n18VarY = ck3.y(u18Var2, wb2.a, "TransformOriginInterruptionHandling", ux2Var4, 384, 0);
                                    ux2Var4.p(z8);
                                } else {
                                    ux2Var4.W(-1511209054);
                                    ux2Var4.p(z8);
                                    n18VarY = null;
                                }
                                zH2 = ux2Var4.h(n18Var4) | ux2Var4.f(bc2Var3) | ux2Var4.f(hf2Var2) | ux2Var4.h(dy6Var3) | ux2Var4.h(n18Var5) | ux2Var4.f(u18Var2) | ux2Var4.h(n18VarY);
                                objK4 = ux2Var4.K();
                                if (!zH2 || objK4 == awVar) {
                                    bc2 bc2Var5 = bc2Var3;
                                    objK4 = new ob2(n18Var4, dy6Var3, n18Var5, u18Var2, bc2Var5, hf2Var2, n18VarY);
                                    dy6Var4 = dy6Var3;
                                    bc2Var4 = bc2Var5;
                                    hf2Var3 = hf2Var2;
                                    ux2Var4.g0(objK4);
                                } else {
                                    bc2Var4 = bc2Var3;
                                    hf2Var3 = hf2Var2;
                                    dy6Var4 = dy6Var3;
                                }
                                ob2 ob2Var = (ob2) objK4;
                                ax5 ax5Var = im1.a;
                                zH3 = ux2Var4.h(dy6Var4);
                                Object objK22 = ux2Var4.K();
                                obj12 = objK22;
                                if (zH3 || objK22 == awVar) {
                                    tb2 tb2Var2 = new tb2(dy6Var4, z8 ? (byte) 1 : (byte) 0);
                                    ux2Var4.g0(tb2Var2);
                                    obj12 = tb2Var2;
                                }
                                fs4 fs4VarF = new js4((Function0) obj12).f(cs4Var3);
                                zG = ux2Var4.g(z9) | ux2Var4.f(function0);
                                Object objK23 = ux2Var4.K();
                                obj13 = objK23;
                                if (zG || objK23 == awVar) {
                                    ub2 ub2Var = new ub2(z9, function0);
                                    ux2Var4.g0(ub2Var);
                                    obj13 = ub2Var;
                                }
                                fs4 fs4VarF2 = fs4VarF.f(di1.t(cs4Var3, (Function1) obj13)).f(new nb2(u18Var2, n18Var2, n18Var3, n18Var, bc2Var4, hf2Var3, dy6Var4, function0, ob2Var)).f(kc8Var);
                                ux2Var4.W(-1255657861);
                                ux2Var4.p(z8);
                                fs4Var2 = fs4Var;
                                fs4 fs4VarF3 = fs4Var2.f(fs4VarF2.f(cs4Var3));
                                objK5 = ux2Var4.K();
                                if (objK5 == awVar) {
                                    coVar2 = coVar;
                                    qn qnVar = new qn(coVar2);
                                    ux2Var4.g0(qnVar);
                                    obj14 = qnVar;
                                } else {
                                    coVar2 = coVar;
                                    obj14 = objK5;
                                }
                                qn qnVar2 = (qn) obj14;
                                int iHashCode = Long.hashCode(ux2Var4.T);
                                yj5 yj5VarL = ux2Var4.l();
                                fs4 fs4VarS = uf0.s(ux2Var4, fs4VarF3);
                                yz0.c.getClass();
                                ux2Var4.a0();
                                if (ux2Var4.S) {
                                    ux2Var4.k(LayoutNode.e0);
                                } else {
                                    ux2Var4.j0();
                                }
                                o67.n(qnVar2, d82.v, ux2Var4);
                                o67.n(yj5VarL, d82.u, ux2Var4);
                                numValueOf = Integer.valueOf(iHashCode);
                                iz0Var = d82.w;
                                if (ux2Var4.S) {
                                    ux2Var4.b(numValueOf, iz0Var);
                                }
                                o67.l(ux2Var4);
                                o67.n(fs4VarS, d82.t, ux2Var4);
                                yy0 yy0Var5 = yy0Var;
                                yy0Var5.d(coVar2, ux2Var4, Integer.valueOf((i7 >> 21) & 112));
                                ux2Var4.p(true);
                                ux2Var4.p(z8);
                                yy0Var3 = yy0Var5;
                                ux2Var5 = ux2Var4;
                            }
                            if (t18Var.d != null) {
                                z11 = true;
                            } else {
                                z11 = true;
                            }
                            dy6Var3 = dy6Var2;
                            yn1Var3 = j0;
                            if (z10) {
                                ux2Var4.W(-1511865571);
                                objK7 = ux2Var4.K();
                                if (objK7 == awVar) {
                                    obj16 = objK7;
                                    ux2Var4.g0("Built-in alpha");
                                    obj16 = "Built-in alpha";
                                }
                                obj16 = objK7;
                                cs4Var3 = cs4Var2;
                                n18 n18VarY7 = ck3.y(u18Var2, yn1Var3, (String) obj16, ux2Var4, 384, 0);
                                ux2Var4.p(z8);
                                n18Var4 = n18VarY7;
                            } else {
                                cs4Var3 = cs4Var2;
                                ux2Var4.W(-1511696126);
                                ux2Var4.p(z8);
                                n18Var4 = null;
                            }
                            if (z11 != 0) {
                                ux2Var4.W(-1511628483);
                                objK6 = ux2Var4.K();
                                if (objK6 == awVar) {
                                    obj15 = objK6;
                                    ux2Var4.g0("Built-in scale");
                                    obj15 = "Built-in scale";
                                }
                                obj15 = objK6;
                                n18 n18VarY8 = ck3.y(u18Var2, yn1Var3, (String) obj15, ux2Var4, 384, 0);
                                ux2Var4.p(z8);
                                n18Var5 = n18VarY8;
                            } else {
                                ux2Var4.W(-1511459038);
                                ux2Var4.p(z8);
                                n18Var5 = null;
                            }
                            if (z11) {
                                ux2Var4.W(-1511381382);
                                n18VarY = ck3.y(u18Var2, wb2.a, "TransformOriginInterruptionHandling", ux2Var4, 384, 0);
                                ux2Var4.p(z8);
                            } else {
                                ux2Var4.W(-1511209054);
                                ux2Var4.p(z8);
                                n18VarY = null;
                            }
                            zH2 = ux2Var4.h(n18Var4) | ux2Var4.f(bc2Var3) | ux2Var4.f(hf2Var2) | ux2Var4.h(dy6Var3) | ux2Var4.h(n18Var5) | ux2Var4.f(u18Var2) | ux2Var4.h(n18VarY);
                            objK4 = ux2Var4.K();
                            if (zH2) {
                                bc2 bc2Var6 = bc2Var3;
                                objK4 = new ob2(n18Var4, dy6Var3, n18Var5, u18Var2, bc2Var6, hf2Var2, n18VarY);
                                dy6Var4 = dy6Var3;
                                bc2Var4 = bc2Var6;
                                hf2Var3 = hf2Var2;
                                ux2Var4.g0(objK4);
                            } else {
                                bc2 bc2Var7 = bc2Var3;
                                objK4 = new ob2(n18Var4, dy6Var3, n18Var5, u18Var2, bc2Var7, hf2Var2, n18VarY);
                                dy6Var4 = dy6Var3;
                                bc2Var4 = bc2Var7;
                                hf2Var3 = hf2Var2;
                                ux2Var4.g0(objK4);
                            }
                            ob2 ob2Var2 = (ob2) objK4;
                            ax5 ax5Var2 = im1.a;
                            zH3 = ux2Var4.h(dy6Var4);
                            Object objK24 = ux2Var4.K();
                            obj12 = objK24;
                            if (zH3) {
                                tb2 tb2Var3 = new tb2(dy6Var4, z8 ? (byte) 1 : (byte) 0);
                                ux2Var4.g0(tb2Var3);
                                obj12 = tb2Var3;
                            } else {
                                tb2 tb2Var4 = new tb2(dy6Var4, z8 ? (byte) 1 : (byte) 0);
                                ux2Var4.g0(tb2Var4);
                                obj12 = tb2Var4;
                            }
                            fs4 fs4VarF4 = new js4((Function0) obj12).f(cs4Var3);
                            zG = ux2Var4.g(z9) | ux2Var4.f(function0);
                            Object objK25 = ux2Var4.K();
                            obj13 = objK25;
                            if (zG) {
                                ub2 ub2Var2 = new ub2(z9, function0);
                                ux2Var4.g0(ub2Var2);
                                obj13 = ub2Var2;
                            } else {
                                ub2 ub2Var3 = new ub2(z9, function0);
                                ux2Var4.g0(ub2Var3);
                                obj13 = ub2Var3;
                            }
                            fs4 fs4VarF5 = fs4VarF4.f(di1.t(cs4Var3, (Function1) obj13)).f(new nb2(u18Var2, n18Var2, n18Var3, n18Var, bc2Var4, hf2Var3, dy6Var4, function0, ob2Var2)).f(kc8Var);
                            ux2Var4.W(-1255657861);
                            ux2Var4.p(z8);
                            fs4Var2 = fs4Var;
                            fs4 fs4VarF6 = fs4Var2.f(fs4VarF5.f(cs4Var3));
                            objK5 = ux2Var4.K();
                            if (objK5 == awVar) {
                                coVar2 = coVar;
                                qn qnVar3 = new qn(coVar2);
                                ux2Var4.g0(qnVar3);
                                obj14 = qnVar3;
                            } else {
                                coVar2 = coVar;
                                obj14 = objK5;
                            }
                            qn qnVar4 = (qn) obj14;
                            int iHashCode2 = Long.hashCode(ux2Var4.T);
                            yj5 yj5VarL2 = ux2Var4.l();
                            fs4 fs4VarS2 = uf0.s(ux2Var4, fs4VarF6);
                            yz0.c.getClass();
                            ux2Var4.a0();
                            if (ux2Var4.S) {
                                ux2Var4.k(LayoutNode.e0);
                            } else {
                                ux2Var4.j0();
                            }
                            o67.n(qnVar4, d82.v, ux2Var4);
                            o67.n(yj5VarL2, d82.u, ux2Var4);
                            numValueOf = Integer.valueOf(iHashCode2);
                            iz0Var = d82.w;
                            if (ux2Var4.S) {
                                ux2Var4.b(numValueOf, iz0Var);
                            }
                            o67.l(ux2Var4);
                            o67.n(fs4VarS2, d82.t, ux2Var4);
                            yy0 yy0Var6 = yy0Var;
                            yy0Var6.d(coVar2, ux2Var4, Integer.valueOf((i7 >> 21) & 112));
                            ux2Var4.p(true);
                            ux2Var4.p(z8);
                            yy0Var3 = yy0Var6;
                            ux2Var5 = ux2Var4;
                        }
                        z6 = true;
                        if (um0Var4 == null) {
                            z7 = true;
                        } else {
                            z7 = true;
                        }
                        yn1Var = p0;
                        if (z6) {
                            ux2Var.W(1018653691);
                            objK11 = ux2Var.K();
                            if (objK11 == awVar) {
                                objK11 = "Built-in slide";
                                ux2Var.g0("Built-in slide");
                            }
                            String str2 = (String) objK11;
                            um0Var5 = um0Var4;
                            z8 = false;
                            ux2 ux2Var8 = ux2Var;
                            n18 n18VarY9 = ck3.y(u18Var2, yn1Var, str2, ux2Var8, 384, 0);
                            yn1Var2 = yn1Var;
                            ux2Var8.p(false);
                            n18Var = n18VarY9;
                            ux2Var4 = ux2Var8;
                        } else {
                            um0Var5 = um0Var4;
                            yn1Var2 = yn1Var;
                            z8 = false;
                            ux2Var3 = ux2Var;
                            ux2Var3.W(1018759494);
                            ux2Var3.p(false);
                            n18Var = null;
                        }
                        if (z7 != 0) {
                            ux2Var4 = ux2Var3;
                            ux2Var4.W(1018851285);
                            objK10 = ux2Var4.K();
                            if (objK10 == awVar) {
                                obj19 = objK10;
                                ux2Var4.g0("Built-in shrink/expand");
                                obj19 = "Built-in shrink/expand";
                            }
                            obj19 = objK10;
                            n18 n18VarY10 = ck3.y(u18Var2, q0, (String) obj19, ux2Var4, 384, 0);
                            ux2Var4.p(z8);
                            n18Var2 = n18VarY10;
                        } else {
                            ux2Var4 = ux2Var3;
                            ux2Var4.W(1018962109);
                            ux2Var4.p(z8);
                            n18Var2 = null;
                        }
                        if (z7 != 0) {
                            ux2Var4.W(1019035735);
                            objK9 = ux2Var4.K();
                            if (objK9 == awVar) {
                                obj18 = objK9;
                                ux2Var4.g0("Built-in InterruptionHandlingOffset");
                                obj18 = "Built-in InterruptionHandlingOffset";
                            }
                            obj18 = objK9;
                            n18 n18VarY11 = ck3.y(u18Var2, yn1Var2, (String) obj18, ux2Var4, 384, 0);
                            ux2Var4.p(z8);
                            n18Var3 = n18VarY11;
                        } else {
                            ux2Var4.W(1019206141);
                            ux2Var4.p(z8);
                            n18Var3 = null;
                        }
                        if (um0Var5 != null) {
                        }
                        td6Var = ew0.e;
                        cs4Var = cs4.b;
                        if (zA) {
                            ux2Var4.W(1019733235);
                            yn1 yn1Var5 = new yn1(zm.t, new io.sentry.okhttp.b(td6Var, (byte) 5));
                            objK8 = ux2Var4.K();
                            if (objK8 == awVar) {
                                obj17 = objK8;
                                ux2Var4.g0("Built-in veil");
                                obj17 = "Built-in veil";
                            }
                            obj17 = objK8;
                            kc8Var = new kc8(u18Var2, ck3.y(u18Var2, yn1Var5, (String) obj17, ux2Var4, 384, 0), bc2Var3, hf2Var2, dy6Var2);
                            ux2Var4.p(z8);
                        } else {
                            ux2Var4.W(1020031362);
                            ux2Var4.p(z8);
                            kc8Var = cs4Var;
                        }
                        if (t18Var.a == null) {
                            cs4Var2 = cs4Var;
                        } else {
                            cs4Var2 = cs4Var;
                        }
                        if (t18Var.d != null) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        dy6Var3 = dy6Var2;
                        yn1Var3 = j0;
                        if (z10) {
                            ux2Var4.W(-1511865571);
                            objK7 = ux2Var4.K();
                            if (objK7 == awVar) {
                                obj16 = objK7;
                                ux2Var4.g0("Built-in alpha");
                                obj16 = "Built-in alpha";
                            }
                            obj16 = objK7;
                            cs4Var3 = cs4Var2;
                            n18 n18VarY12 = ck3.y(u18Var2, yn1Var3, (String) obj16, ux2Var4, 384, 0);
                            ux2Var4.p(z8);
                            n18Var4 = n18VarY12;
                        } else {
                            cs4Var3 = cs4Var2;
                            ux2Var4.W(-1511696126);
                            ux2Var4.p(z8);
                            n18Var4 = null;
                        }
                        if (z11 != 0) {
                            ux2Var4.W(-1511628483);
                            objK6 = ux2Var4.K();
                            if (objK6 == awVar) {
                                obj15 = objK6;
                                ux2Var4.g0("Built-in scale");
                                obj15 = "Built-in scale";
                            }
                            obj15 = objK6;
                            n18 n18VarY13 = ck3.y(u18Var2, yn1Var3, (String) obj15, ux2Var4, 384, 0);
                            ux2Var4.p(z8);
                            n18Var5 = n18VarY13;
                        } else {
                            ux2Var4.W(-1511459038);
                            ux2Var4.p(z8);
                            n18Var5 = null;
                        }
                        if (z11) {
                            ux2Var4.W(-1511381382);
                            n18VarY = ck3.y(u18Var2, wb2.a, "TransformOriginInterruptionHandling", ux2Var4, 384, 0);
                            ux2Var4.p(z8);
                        } else {
                            ux2Var4.W(-1511209054);
                            ux2Var4.p(z8);
                            n18VarY = null;
                        }
                        zH2 = ux2Var4.h(n18Var4) | ux2Var4.f(bc2Var3) | ux2Var4.f(hf2Var2) | ux2Var4.h(dy6Var3) | ux2Var4.h(n18Var5) | ux2Var4.f(u18Var2) | ux2Var4.h(n18VarY);
                        objK4 = ux2Var4.K();
                        if (zH2) {
                            bc2 bc2Var8 = bc2Var3;
                            objK4 = new ob2(n18Var4, dy6Var3, n18Var5, u18Var2, bc2Var8, hf2Var2, n18VarY);
                            dy6Var4 = dy6Var3;
                            bc2Var4 = bc2Var8;
                            hf2Var3 = hf2Var2;
                            ux2Var4.g0(objK4);
                        } else {
                            bc2 bc2Var9 = bc2Var3;
                            objK4 = new ob2(n18Var4, dy6Var3, n18Var5, u18Var2, bc2Var9, hf2Var2, n18VarY);
                            dy6Var4 = dy6Var3;
                            bc2Var4 = bc2Var9;
                            hf2Var3 = hf2Var2;
                            ux2Var4.g0(objK4);
                        }
                        ob2 ob2Var3 = (ob2) objK4;
                        ax5 ax5Var3 = im1.a;
                        zH3 = ux2Var4.h(dy6Var4);
                        Object objK26 = ux2Var4.K();
                        obj12 = objK26;
                        if (zH3) {
                            tb2 tb2Var5 = new tb2(dy6Var4, z8 ? (byte) 1 : (byte) 0);
                            ux2Var4.g0(tb2Var5);
                            obj12 = tb2Var5;
                        } else {
                            tb2 tb2Var6 = new tb2(dy6Var4, z8 ? (byte) 1 : (byte) 0);
                            ux2Var4.g0(tb2Var6);
                            obj12 = tb2Var6;
                        }
                        fs4 fs4VarF7 = new js4((Function0) obj12).f(cs4Var3);
                        zG = ux2Var4.g(z9) | ux2Var4.f(function0);
                        Object objK27 = ux2Var4.K();
                        obj13 = objK27;
                        if (zG) {
                            ub2 ub2Var4 = new ub2(z9, function0);
                            ux2Var4.g0(ub2Var4);
                            obj13 = ub2Var4;
                        } else {
                            ub2 ub2Var5 = new ub2(z9, function0);
                            ux2Var4.g0(ub2Var5);
                            obj13 = ub2Var5;
                        }
                        fs4 fs4VarF8 = fs4VarF7.f(di1.t(cs4Var3, (Function1) obj13)).f(new nb2(u18Var2, n18Var2, n18Var3, n18Var, bc2Var4, hf2Var3, dy6Var4, function0, ob2Var3)).f(kc8Var);
                        ux2Var4.W(-1255657861);
                        ux2Var4.p(z8);
                        fs4Var2 = fs4Var;
                        fs4 fs4VarF9 = fs4Var2.f(fs4VarF8.f(cs4Var3));
                        objK5 = ux2Var4.K();
                        if (objK5 == awVar) {
                            coVar2 = coVar;
                            qn qnVar5 = new qn(coVar2);
                            ux2Var4.g0(qnVar5);
                            obj14 = qnVar5;
                        } else {
                            coVar2 = coVar;
                            obj14 = objK5;
                        }
                        qn qnVar6 = (qn) obj14;
                        int iHashCode3 = Long.hashCode(ux2Var4.T);
                        yj5 yj5VarL3 = ux2Var4.l();
                        fs4 fs4VarS3 = uf0.s(ux2Var4, fs4VarF9);
                        yz0.c.getClass();
                        ux2Var4.a0();
                        if (ux2Var4.S) {
                            ux2Var4.k(LayoutNode.e0);
                        } else {
                            ux2Var4.j0();
                        }
                        o67.n(qnVar6, d82.v, ux2Var4);
                        o67.n(yj5VarL3, d82.u, ux2Var4);
                        numValueOf = Integer.valueOf(iHashCode3);
                        iz0Var = d82.w;
                        if (ux2Var4.S) {
                            ux2Var4.b(numValueOf, iz0Var);
                        }
                        o67.l(ux2Var4);
                        o67.n(fs4VarS3, d82.t, ux2Var4);
                        yy0 yy0Var7 = yy0Var;
                        yy0Var7.d(coVar2, ux2Var4, Integer.valueOf((i7 >> 21) & 112));
                        ux2Var4.p(true);
                        ux2Var4.p(z8);
                        yy0Var3 = yy0Var7;
                        ux2Var5 = ux2Var4;
                    }
                    ux2Var5.p(z8);
                    yy0Var2 = yy0Var3;
                    ux2Var2 = ux2Var5;
                } else {
                    i3 = i11;
                }
                z2 = true;
                Object objK110 = ux2Var6.K();
                if (z2) {
                    u18 u18Var4 = new u18(new wx4(mb2VarX1), u18Var, ua5.z(u18Var.c, " > EnterExitTransition"));
                    ux2Var6.g0(u18Var4);
                    obj2 = u18Var4;
                } else {
                    u18 u18Var5 = new u18(new wx4(mb2VarX1), u18Var, ua5.z(u18Var.c, " > EnterExitTransition"));
                    ux2Var6.g0(u18Var5);
                    obj2 = u18Var5;
                }
                u18Var2 = (u18) obj2;
                zF = ((i12 <= 4 && ux2Var6.f(u18Var)) || (i3 & 6) == 4) | ux2Var6.f(u18Var2);
                Object objK111 = ux2Var6.K();
                obj3 = objK111;
                if (zF) {
                    py5 py5Var2 = new py5((Object) u18Var, (Object) u18Var2, (byte) 29);
                    ux2Var6.g0(py5Var2);
                    obj3 = py5Var2;
                } else {
                    py5 py5Var3 = new py5((Object) u18Var, (Object) u18Var2, (byte) 29);
                    ux2Var6.g0(py5Var3);
                    obj3 = py5Var3;
                }
                ck3.e(u18Var2, (Function1) obj3, ux2Var6);
                if (u18Var.g()) {
                    u18Var2.j(mb2VarX1, mb2VarX2);
                } else {
                    u18Var2.o(mb2VarX2);
                    u18Var2.l.setValue(Boolean.FALSE);
                }
                if (u18Var.g()) {
                    ux2Var6.W(782386797);
                    value2 = u18Var.e.getValue();
                    if (value2 == null) {
                        ux2Var6.W(782437481);
                        ux2Var6.p(false);
                        mb2VarX0 = null;
                    } else {
                        ux2Var6.W(782437482);
                        ux2Var6.W(2016262395);
                        mb2VarX0 = x0(u18Var, function1, value2, ux2Var6);
                        ux2Var6.p(false);
                        ux2Var6.p(false);
                    }
                    g2Var2 = u18Var2.a;
                    bg5Var3 = u18Var2.d;
                    bg5 bg5Var7 = u18Var2.e;
                    value3 = bg5Var7.getValue();
                    if (value3 == null) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    bg5Var7.setValue(mb2VarX0);
                    if (z12) {
                        u18Var2.f.setValue(new p18(value3, bg5Var3.getValue()));
                        g2Var2.y0(value3);
                        if (u18Var2.h.z() == Long.MIN_VALUE) {
                            u18Var2.m(true);
                        }
                        j57Var = u18Var2.j;
                        size = j57Var.size();
                        while (i4 < size) {
                            ((q18) j57Var.get(i4)).t.A(-2.0f);
                        }
                    }
                    ux2Var6.p(false);
                } else {
                    ux2Var6.W(782538635);
                    ux2Var6.p(false);
                }
                zF2 = ux2Var6.f(u18Var2);
                Object objK112 = ux2Var6.K();
                obj4 = objK112;
                if (zF2) {
                    bg5 bg5VarP4 = h57.p(bc2Var);
                    ux2Var6.g0(bg5VarP4);
                    obj4 = bg5VarP4;
                } else {
                    bg5 bg5VarP5 = h57.p(bc2Var);
                    ux2Var6.g0(bg5VarP5);
                    obj4 = bg5VarP5;
                }
                px4Var = (px4) obj4;
                g2 g2Var5 = u18Var2.a;
                bg5Var = u18Var2.d;
                objP0 = g2Var5.p0();
                value = bg5Var.getValue();
                mb2Var = mb2.f1456o;
                mb2Var2 = mb2.n;
                if (objP0 == value) {
                    if (bg5Var.getValue() != mb2Var) {
                        px4Var.setValue(((bc2) px4Var.getValue()).a(bc2Var));
                    }
                } else if (bg5Var.getValue() != mb2Var) {
                    px4Var.setValue(((bc2) px4Var.getValue()).a(bc2Var));
                }
                bc2Var2 = (bc2) px4Var.getValue();
                bg5Var2 = u18Var2.d;
                g2Var = u18Var2.a;
                zF3 = ux2Var6.f(u18Var2);
                Object objK113 = ux2Var6.K();
                obj5 = objK113;
                if (zF3) {
                    bg5 bg5VarP6 = h57.p(hf2Var);
                    ux2Var6.g0(bg5VarP6);
                    obj5 = bg5VarP6;
                } else {
                    bg5 bg5VarP7 = h57.p(hf2Var);
                    ux2Var6.g0(bg5VarP7);
                    obj5 = bg5VarP7;
                }
                px4Var2 = (px4) obj5;
                if (g2Var.p0() != bg5Var2.getValue()) {
                    if (bg5Var2.getValue() != mb2Var2) {
                        ux2Var6.W(-504838512);
                        ih2Var = ((hf2) px4Var2.getValue()).a.a;
                        if (ih2Var != null) {
                            ih2Var2 = new ih2(1.0f, ih2Var.b);
                        } else {
                            ih2Var2 = null;
                        }
                        pi6Var = ((hf2) px4Var2.getValue()).a.d;
                        if (pi6Var != null) {
                            pi6Var2 = new pi6(1.0f, pi6Var.b, pi6Var.c);
                        } else {
                            pi6Var2 = null;
                        }
                        f17Var = ((hf2) px4Var2.getValue()).a.b;
                        if (f17Var == null) {
                            ux2Var6.W(-504119809);
                            z3 = false;
                            ux2Var6.p(false);
                            f17Var2 = null;
                        } else {
                            ux2Var6.W(-708998590);
                            objK = ux2Var6.K();
                            if (objK == awVar) {
                                obj6 = objK;
                                zm zmVar3 = zm.x;
                                ux2Var6.g0(zmVar3);
                                obj6 = zmVar3;
                            }
                            obj6 = objK;
                            f17 f17Var5 = new f17((Function1) obj6, f17Var.b);
                            z3 = false;
                            ux2Var6.p(false);
                            f17Var2 = f17Var5;
                        }
                        um0Var = ((hf2) px4Var2.getValue()).a.c;
                        if (um0Var == null) {
                            ux2Var6.W(-504024174);
                            ux2Var6.p(z3);
                            um0Var2 = null;
                        } else {
                            ux2Var6.W(-708995505);
                            objK2 = ux2Var6.K();
                            if (objK2 == awVar) {
                                obj7 = objK2;
                                zm zmVar4 = zm.y;
                                ux2Var6.g0(zmVar4);
                                obj7 = zmVar4;
                            }
                            obj7 = objK2;
                            um0 um0Var7 = new um0(um0Var.a, (Function1) obj7, um0Var.c, um0Var.d);
                            ux2Var6.p(false);
                            um0Var2 = um0Var7;
                        }
                        t18 t18Var5 = ((hf2) px4Var2.getValue()).a;
                        px4Var2.setValue(new hf2(new t18(ih2Var2, f17Var2, um0Var2, pi6Var2, (LinkedHashMap) null, 96)).a(hf2Var));
                        ux2Var6.p(false);
                    } else {
                        ux2Var6.W(-503833306);
                        ux2Var6.p(false);
                    }
                } else if (bg5Var2.getValue() != mb2Var2) {
                    ux2Var6.W(-504838512);
                    ih2Var = ((hf2) px4Var2.getValue()).a.a;
                    if (ih2Var != null) {
                        ih2Var2 = new ih2(1.0f, ih2Var.b);
                    } else {
                        ih2Var2 = null;
                    }
                    pi6Var = ((hf2) px4Var2.getValue()).a.d;
                    if (pi6Var != null) {
                        pi6Var2 = new pi6(1.0f, pi6Var.b, pi6Var.c);
                    } else {
                        pi6Var2 = null;
                    }
                    f17Var = ((hf2) px4Var2.getValue()).a.b;
                    if (f17Var == null) {
                        ux2Var6.W(-504119809);
                        z3 = false;
                        ux2Var6.p(false);
                        f17Var2 = null;
                    } else {
                        ux2Var6.W(-708998590);
                        objK = ux2Var6.K();
                        if (objK == awVar) {
                            obj6 = objK;
                            zm zmVar5 = zm.x;
                            ux2Var6.g0(zmVar5);
                            obj6 = zmVar5;
                        }
                        obj6 = objK;
                        f17 f17Var6 = new f17((Function1) obj6, f17Var.b);
                        z3 = false;
                        ux2Var6.p(false);
                        f17Var2 = f17Var6;
                    }
                    um0Var = ((hf2) px4Var2.getValue()).a.c;
                    if (um0Var == null) {
                        ux2Var6.W(-504024174);
                        ux2Var6.p(z3);
                        um0Var2 = null;
                    } else {
                        ux2Var6.W(-708995505);
                        objK2 = ux2Var6.K();
                        if (objK2 == awVar) {
                            obj7 = objK2;
                            zm zmVar6 = zm.y;
                            ux2Var6.g0(zmVar6);
                            obj7 = zmVar6;
                        }
                        obj7 = objK2;
                        um0 um0Var8 = new um0(um0Var.a, (Function1) obj7, um0Var.c, um0Var.d);
                        ux2Var6.p(false);
                        um0Var2 = um0Var8;
                    }
                    t18 t18Var6 = ((hf2) px4Var2.getValue()).a;
                    px4Var2.setValue(new hf2(new t18(ih2Var2, f17Var2, um0Var2, pi6Var2, (LinkedHashMap) null, 96)).a(hf2Var));
                    ux2Var6.p(false);
                } else {
                    ux2Var6.W(-503833306);
                    ux2Var6.p(false);
                }
                hf2Var2 = (hf2) px4Var2.getValue();
                px4VarT = h57.t(hw2Var, ux2Var6);
                Object objInvoke2 = hw2Var.invoke(g2Var.p0(), bg5Var2.getValue());
                zF4 = ux2Var6.f(u18Var2) | ux2Var6.f(px4VarT);
                Object objK114 = ux2Var6.K();
                if (zF4) {
                    j0 j0Var2 = new j0(u18Var2, px4VarT, null, (byte) 8);
                    ux2Var6.g0(j0Var2);
                    obj8 = j0Var2;
                } else {
                    j0 j0Var3 = new j0(u18Var2, px4VarT, null, (byte) 8);
                    ux2Var6.g0(j0Var3);
                    obj8 = j0Var3;
                }
                px4 px4VarO2 = f57.o(objInvoke2, (hw2) obj8, ux2Var6);
                if (g2Var.p0() != mb2Var) {
                    ux2Var6.W(-272022668);
                    if (i8 == 4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    Object objK28 = ux2Var6.K();
                    obj9 = objK28;
                    if (z4) {
                        co coVar4 = new co();
                        ux2Var6.g0(coVar4);
                        obj9 = coVar4;
                    } else {
                        co coVar5 = new co();
                        ux2Var6.g0(coVar5);
                        obj9 = coVar5;
                    }
                    coVar = (co) obj9;
                    dy6Var = coVar.b;
                    objK3 = ux2Var6.K();
                    obj10 = objK3;
                    if (objK3 == awVar) {
                        hm1 hm1Var2 = hm1.p;
                        ux2Var6.g0(hm1Var2);
                        obj10 = hm1Var2;
                    }
                    function0 = (Function0) obj10;
                    ux2Var6.W(-1491182875);
                    ux2Var6.p(false);
                    ux2Var6.W(-1491180092);
                    ux2Var6.p(false);
                    ux2Var6.W(-31257052);
                    ux2Var6.p(false);
                    if (u18Var2.e.getValue() != null) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    dy6Var.c(z5);
                    zH = ux2Var6.h(dy6Var);
                    Object objK29 = ux2Var6.K();
                    if (zH) {
                        tb2 tb2Var7 = new tb2(dy6Var, (byte) 1);
                        ux2Var6.g0(tb2Var7);
                        obj11 = tb2Var7;
                    } else {
                        tb2 tb2Var8 = new tb2(dy6Var, (byte) 1);
                        ux2Var6.g0(tb2Var8);
                        obj11 = tb2Var8;
                    }
                    wb2.a(u18Var2, (Function0) obj11, ux2Var6, 0);
                    t18Var = bc2Var2.a;
                    t18Var2 = hf2Var2.a;
                    um0Var3 = t18Var2.c;
                    zA = z68.a(dy6Var.e, rv0.g);
                    f17Var3 = t18Var.b;
                    um0Var4 = t18Var.c;
                    if (f17Var3 == null) {
                        dy6Var2 = dy6Var;
                        bc2Var3 = bc2Var2;
                        t18Var3 = t18Var2;
                        z6 = true;
                    } else {
                        dy6Var2 = dy6Var;
                        bc2Var3 = bc2Var2;
                        t18Var3 = t18Var2;
                        z6 = true;
                    }
                    if (um0Var4 == null) {
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                    yn1Var = p0;
                    if (z6) {
                        ux2Var.W(1018653691);
                        objK11 = ux2Var.K();
                        if (objK11 == awVar) {
                            objK11 = "Built-in slide";
                            ux2Var.g0("Built-in slide");
                        }
                        String str3 = (String) objK11;
                        um0Var5 = um0Var4;
                        z8 = false;
                        ux2 ux2Var9 = ux2Var;
                        n18 n18VarY14 = ck3.y(u18Var2, yn1Var, str3, ux2Var9, 384, 0);
                        yn1Var2 = yn1Var;
                        ux2Var9.p(false);
                        n18Var = n18VarY14;
                        ux2Var4 = ux2Var9;
                    } else {
                        um0Var5 = um0Var4;
                        yn1Var2 = yn1Var;
                        z8 = false;
                        ux2Var3 = ux2Var;
                        ux2Var3.W(1018759494);
                        ux2Var3.p(false);
                        n18Var = null;
                    }
                    if (z7 != 0) {
                        ux2Var4 = ux2Var3;
                        ux2Var4.W(1018851285);
                        objK10 = ux2Var4.K();
                        if (objK10 == awVar) {
                            obj19 = objK10;
                            ux2Var4.g0("Built-in shrink/expand");
                            obj19 = "Built-in shrink/expand";
                        }
                        obj19 = objK10;
                        n18 n18VarY15 = ck3.y(u18Var2, q0, (String) obj19, ux2Var4, 384, 0);
                        ux2Var4.p(z8);
                        n18Var2 = n18VarY15;
                    } else {
                        ux2Var4 = ux2Var3;
                        ux2Var4.W(1018962109);
                        ux2Var4.p(z8);
                        n18Var2 = null;
                    }
                    if (z7 != 0) {
                        ux2Var4.W(1019035735);
                        objK9 = ux2Var4.K();
                        if (objK9 == awVar) {
                            obj18 = objK9;
                            ux2Var4.g0("Built-in InterruptionHandlingOffset");
                            obj18 = "Built-in InterruptionHandlingOffset";
                        }
                        obj18 = objK9;
                        n18 n18VarY16 = ck3.y(u18Var2, yn1Var2, (String) obj18, ux2Var4, 384, 0);
                        ux2Var4.p(z8);
                        n18Var3 = n18VarY16;
                    } else {
                        ux2Var4.W(1019206141);
                        ux2Var4.p(z8);
                        n18Var3 = null;
                    }
                    if (um0Var5 != null) {
                    }
                    td6Var = ew0.e;
                    cs4Var = cs4.b;
                    if (zA) {
                        ux2Var4.W(1019733235);
                        yn1 yn1Var6 = new yn1(zm.t, new io.sentry.okhttp.b(td6Var, (byte) 5));
                        objK8 = ux2Var4.K();
                        if (objK8 == awVar) {
                            obj17 = objK8;
                            ux2Var4.g0("Built-in veil");
                            obj17 = "Built-in veil";
                        }
                        obj17 = objK8;
                        kc8Var = new kc8(u18Var2, ck3.y(u18Var2, yn1Var6, (String) obj17, ux2Var4, 384, 0), bc2Var3, hf2Var2, dy6Var2);
                        ux2Var4.p(z8);
                    } else {
                        ux2Var4.W(1020031362);
                        ux2Var4.p(z8);
                        kc8Var = cs4Var;
                    }
                    if (t18Var.a == null) {
                        cs4Var2 = cs4Var;
                    } else {
                        cs4Var2 = cs4Var;
                    }
                    if (t18Var.d != null) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    dy6Var3 = dy6Var2;
                    yn1Var3 = j0;
                    if (z10) {
                        ux2Var4.W(-1511865571);
                        objK7 = ux2Var4.K();
                        if (objK7 == awVar) {
                            obj16 = objK7;
                            ux2Var4.g0("Built-in alpha");
                            obj16 = "Built-in alpha";
                        }
                        obj16 = objK7;
                        cs4Var3 = cs4Var2;
                        n18 n18VarY17 = ck3.y(u18Var2, yn1Var3, (String) obj16, ux2Var4, 384, 0);
                        ux2Var4.p(z8);
                        n18Var4 = n18VarY17;
                    } else {
                        cs4Var3 = cs4Var2;
                        ux2Var4.W(-1511696126);
                        ux2Var4.p(z8);
                        n18Var4 = null;
                    }
                    if (z11 != 0) {
                        ux2Var4.W(-1511628483);
                        objK6 = ux2Var4.K();
                        if (objK6 == awVar) {
                            obj15 = objK6;
                            ux2Var4.g0("Built-in scale");
                            obj15 = "Built-in scale";
                        }
                        obj15 = objK6;
                        n18 n18VarY18 = ck3.y(u18Var2, yn1Var3, (String) obj15, ux2Var4, 384, 0);
                        ux2Var4.p(z8);
                        n18Var5 = n18VarY18;
                    } else {
                        ux2Var4.W(-1511459038);
                        ux2Var4.p(z8);
                        n18Var5 = null;
                    }
                    if (z11) {
                        ux2Var4.W(-1511381382);
                        n18VarY = ck3.y(u18Var2, wb2.a, "TransformOriginInterruptionHandling", ux2Var4, 384, 0);
                        ux2Var4.p(z8);
                    } else {
                        ux2Var4.W(-1511209054);
                        ux2Var4.p(z8);
                        n18VarY = null;
                    }
                    zH2 = ux2Var4.h(n18Var4) | ux2Var4.f(bc2Var3) | ux2Var4.f(hf2Var2) | ux2Var4.h(dy6Var3) | ux2Var4.h(n18Var5) | ux2Var4.f(u18Var2) | ux2Var4.h(n18VarY);
                    objK4 = ux2Var4.K();
                    if (zH2) {
                        bc2 bc2Var10 = bc2Var3;
                        objK4 = new ob2(n18Var4, dy6Var3, n18Var5, u18Var2, bc2Var10, hf2Var2, n18VarY);
                        dy6Var4 = dy6Var3;
                        bc2Var4 = bc2Var10;
                        hf2Var3 = hf2Var2;
                        ux2Var4.g0(objK4);
                    } else {
                        bc2 bc2Var11 = bc2Var3;
                        objK4 = new ob2(n18Var4, dy6Var3, n18Var5, u18Var2, bc2Var11, hf2Var2, n18VarY);
                        dy6Var4 = dy6Var3;
                        bc2Var4 = bc2Var11;
                        hf2Var3 = hf2Var2;
                        ux2Var4.g0(objK4);
                    }
                    ob2 ob2Var4 = (ob2) objK4;
                    ax5 ax5Var4 = im1.a;
                    zH3 = ux2Var4.h(dy6Var4);
                    Object objK210 = ux2Var4.K();
                    obj12 = objK210;
                    if (zH3) {
                        tb2 tb2Var9 = new tb2(dy6Var4, z8 ? (byte) 1 : (byte) 0);
                        ux2Var4.g0(tb2Var9);
                        obj12 = tb2Var9;
                    } else {
                        tb2 tb2Var10 = new tb2(dy6Var4, z8 ? (byte) 1 : (byte) 0);
                        ux2Var4.g0(tb2Var10);
                        obj12 = tb2Var10;
                    }
                    fs4 fs4VarF10 = new js4((Function0) obj12).f(cs4Var3);
                    zG = ux2Var4.g(z9) | ux2Var4.f(function0);
                    Object objK211 = ux2Var4.K();
                    obj13 = objK211;
                    if (zG) {
                        ub2 ub2Var6 = new ub2(z9, function0);
                        ux2Var4.g0(ub2Var6);
                        obj13 = ub2Var6;
                    } else {
                        ub2 ub2Var7 = new ub2(z9, function0);
                        ux2Var4.g0(ub2Var7);
                        obj13 = ub2Var7;
                    }
                    fs4 fs4VarF11 = fs4VarF10.f(di1.t(cs4Var3, (Function1) obj13)).f(new nb2(u18Var2, n18Var2, n18Var3, n18Var, bc2Var4, hf2Var3, dy6Var4, function0, ob2Var4)).f(kc8Var);
                    ux2Var4.W(-1255657861);
                    ux2Var4.p(z8);
                    fs4Var2 = fs4Var;
                    fs4 fs4VarF12 = fs4Var2.f(fs4VarF11.f(cs4Var3));
                    objK5 = ux2Var4.K();
                    if (objK5 == awVar) {
                        coVar2 = coVar;
                        qn qnVar7 = new qn(coVar2);
                        ux2Var4.g0(qnVar7);
                        obj14 = qnVar7;
                    } else {
                        coVar2 = coVar;
                        obj14 = objK5;
                    }
                    qn qnVar8 = (qn) obj14;
                    int iHashCode4 = Long.hashCode(ux2Var4.T);
                    yj5 yj5VarL4 = ux2Var4.l();
                    fs4 fs4VarS4 = uf0.s(ux2Var4, fs4VarF12);
                    yz0.c.getClass();
                    ux2Var4.a0();
                    if (ux2Var4.S) {
                        ux2Var4.k(LayoutNode.e0);
                    } else {
                        ux2Var4.j0();
                    }
                    o67.n(qnVar8, d82.v, ux2Var4);
                    o67.n(yj5VarL4, d82.u, ux2Var4);
                    numValueOf = Integer.valueOf(iHashCode4);
                    iz0Var = d82.w;
                    if (ux2Var4.S) {
                        ux2Var4.b(numValueOf, iz0Var);
                    }
                    o67.l(ux2Var4);
                    o67.n(fs4VarS4, d82.t, ux2Var4);
                    yy0 yy0Var8 = yy0Var;
                    yy0Var8.d(coVar2, ux2Var4, Integer.valueOf((i7 >> 21) & 112));
                    ux2Var4.p(true);
                    ux2Var4.p(z8);
                    yy0Var3 = yy0Var8;
                    ux2Var5 = ux2Var4;
                } else {
                    ux2Var6.W(-272022668);
                    if (i8 == 4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    Object objK212 = ux2Var6.K();
                    obj9 = objK212;
                    if (z4) {
                        co coVar6 = new co();
                        ux2Var6.g0(coVar6);
                        obj9 = coVar6;
                    } else {
                        co coVar7 = new co();
                        ux2Var6.g0(coVar7);
                        obj9 = coVar7;
                    }
                    coVar = (co) obj9;
                    dy6Var = coVar.b;
                    objK3 = ux2Var6.K();
                    obj10 = objK3;
                    if (objK3 == awVar) {
                        hm1 hm1Var3 = hm1.p;
                        ux2Var6.g0(hm1Var3);
                        obj10 = hm1Var3;
                    }
                    function0 = (Function0) obj10;
                    ux2Var6.W(-1491182875);
                    ux2Var6.p(false);
                    ux2Var6.W(-1491180092);
                    ux2Var6.p(false);
                    ux2Var6.W(-31257052);
                    ux2Var6.p(false);
                    if (u18Var2.e.getValue() != null) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    dy6Var.c(z5);
                    zH = ux2Var6.h(dy6Var);
                    Object objK213 = ux2Var6.K();
                    if (zH) {
                        tb2 tb2Var11 = new tb2(dy6Var, (byte) 1);
                        ux2Var6.g0(tb2Var11);
                        obj11 = tb2Var11;
                    } else {
                        tb2 tb2Var12 = new tb2(dy6Var, (byte) 1);
                        ux2Var6.g0(tb2Var12);
                        obj11 = tb2Var12;
                    }
                    wb2.a(u18Var2, (Function0) obj11, ux2Var6, 0);
                    t18Var = bc2Var2.a;
                    t18Var2 = hf2Var2.a;
                    um0Var3 = t18Var2.c;
                    zA = z68.a(dy6Var.e, rv0.g);
                    f17Var3 = t18Var.b;
                    um0Var4 = t18Var.c;
                    if (f17Var3 == null) {
                        dy6Var2 = dy6Var;
                        bc2Var3 = bc2Var2;
                        t18Var3 = t18Var2;
                        z6 = true;
                    } else {
                        dy6Var2 = dy6Var;
                        bc2Var3 = bc2Var2;
                        t18Var3 = t18Var2;
                        z6 = true;
                    }
                    if (um0Var4 == null) {
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                    yn1Var = p0;
                    if (z6) {
                        ux2Var.W(1018653691);
                        objK11 = ux2Var.K();
                        if (objK11 == awVar) {
                            objK11 = "Built-in slide";
                            ux2Var.g0("Built-in slide");
                        }
                        String str4 = (String) objK11;
                        um0Var5 = um0Var4;
                        z8 = false;
                        ux2 ux2Var10 = ux2Var;
                        n18 n18VarY19 = ck3.y(u18Var2, yn1Var, str4, ux2Var10, 384, 0);
                        yn1Var2 = yn1Var;
                        ux2Var10.p(false);
                        n18Var = n18VarY19;
                        ux2Var4 = ux2Var10;
                    } else {
                        um0Var5 = um0Var4;
                        yn1Var2 = yn1Var;
                        z8 = false;
                        ux2Var3 = ux2Var;
                        ux2Var3.W(1018759494);
                        ux2Var3.p(false);
                        n18Var = null;
                    }
                    if (z7 != 0) {
                        ux2Var4 = ux2Var3;
                        ux2Var4.W(1018851285);
                        objK10 = ux2Var4.K();
                        if (objK10 == awVar) {
                            obj19 = objK10;
                            ux2Var4.g0("Built-in shrink/expand");
                            obj19 = "Built-in shrink/expand";
                        }
                        obj19 = objK10;
                        n18 n18VarY110 = ck3.y(u18Var2, q0, (String) obj19, ux2Var4, 384, 0);
                        ux2Var4.p(z8);
                        n18Var2 = n18VarY110;
                    } else {
                        ux2Var4 = ux2Var3;
                        ux2Var4.W(1018962109);
                        ux2Var4.p(z8);
                        n18Var2 = null;
                    }
                    if (z7 != 0) {
                        ux2Var4.W(1019035735);
                        objK9 = ux2Var4.K();
                        if (objK9 == awVar) {
                            obj18 = objK9;
                            ux2Var4.g0("Built-in InterruptionHandlingOffset");
                            obj18 = "Built-in InterruptionHandlingOffset";
                        }
                        obj18 = objK9;
                        n18 n18VarY111 = ck3.y(u18Var2, yn1Var2, (String) obj18, ux2Var4, 384, 0);
                        ux2Var4.p(z8);
                        n18Var3 = n18VarY111;
                    } else {
                        ux2Var4.W(1019206141);
                        ux2Var4.p(z8);
                        n18Var3 = null;
                    }
                    if (um0Var5 != null) {
                    }
                    td6Var = ew0.e;
                    cs4Var = cs4.b;
                    if (zA) {
                        ux2Var4.W(1019733235);
                        yn1 yn1Var7 = new yn1(zm.t, new io.sentry.okhttp.b(td6Var, (byte) 5));
                        objK8 = ux2Var4.K();
                        if (objK8 == awVar) {
                            obj17 = objK8;
                            ux2Var4.g0("Built-in veil");
                            obj17 = "Built-in veil";
                        }
                        obj17 = objK8;
                        kc8Var = new kc8(u18Var2, ck3.y(u18Var2, yn1Var7, (String) obj17, ux2Var4, 384, 0), bc2Var3, hf2Var2, dy6Var2);
                        ux2Var4.p(z8);
                    } else {
                        ux2Var4.W(1020031362);
                        ux2Var4.p(z8);
                        kc8Var = cs4Var;
                    }
                    if (t18Var.a == null) {
                        cs4Var2 = cs4Var;
                    } else {
                        cs4Var2 = cs4Var;
                    }
                    if (t18Var.d != null) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    dy6Var3 = dy6Var2;
                    yn1Var3 = j0;
                    if (z10) {
                        ux2Var4.W(-1511865571);
                        objK7 = ux2Var4.K();
                        if (objK7 == awVar) {
                            obj16 = objK7;
                            ux2Var4.g0("Built-in alpha");
                            obj16 = "Built-in alpha";
                        }
                        obj16 = objK7;
                        cs4Var3 = cs4Var2;
                        n18 n18VarY112 = ck3.y(u18Var2, yn1Var3, (String) obj16, ux2Var4, 384, 0);
                        ux2Var4.p(z8);
                        n18Var4 = n18VarY112;
                    } else {
                        cs4Var3 = cs4Var2;
                        ux2Var4.W(-1511696126);
                        ux2Var4.p(z8);
                        n18Var4 = null;
                    }
                    if (z11 != 0) {
                        ux2Var4.W(-1511628483);
                        objK6 = ux2Var4.K();
                        if (objK6 == awVar) {
                            obj15 = objK6;
                            ux2Var4.g0("Built-in scale");
                            obj15 = "Built-in scale";
                        }
                        obj15 = objK6;
                        n18 n18VarY113 = ck3.y(u18Var2, yn1Var3, (String) obj15, ux2Var4, 384, 0);
                        ux2Var4.p(z8);
                        n18Var5 = n18VarY113;
                    } else {
                        ux2Var4.W(-1511459038);
                        ux2Var4.p(z8);
                        n18Var5 = null;
                    }
                    if (z11) {
                        ux2Var4.W(-1511381382);
                        n18VarY = ck3.y(u18Var2, wb2.a, "TransformOriginInterruptionHandling", ux2Var4, 384, 0);
                        ux2Var4.p(z8);
                    } else {
                        ux2Var4.W(-1511209054);
                        ux2Var4.p(z8);
                        n18VarY = null;
                    }
                    zH2 = ux2Var4.h(n18Var4) | ux2Var4.f(bc2Var3) | ux2Var4.f(hf2Var2) | ux2Var4.h(dy6Var3) | ux2Var4.h(n18Var5) | ux2Var4.f(u18Var2) | ux2Var4.h(n18VarY);
                    objK4 = ux2Var4.K();
                    if (zH2) {
                        bc2 bc2Var12 = bc2Var3;
                        objK4 = new ob2(n18Var4, dy6Var3, n18Var5, u18Var2, bc2Var12, hf2Var2, n18VarY);
                        dy6Var4 = dy6Var3;
                        bc2Var4 = bc2Var12;
                        hf2Var3 = hf2Var2;
                        ux2Var4.g0(objK4);
                    } else {
                        bc2 bc2Var13 = bc2Var3;
                        objK4 = new ob2(n18Var4, dy6Var3, n18Var5, u18Var2, bc2Var13, hf2Var2, n18VarY);
                        dy6Var4 = dy6Var3;
                        bc2Var4 = bc2Var13;
                        hf2Var3 = hf2Var2;
                        ux2Var4.g0(objK4);
                    }
                    ob2 ob2Var5 = (ob2) objK4;
                    ax5 ax5Var5 = im1.a;
                    zH3 = ux2Var4.h(dy6Var4);
                    Object objK214 = ux2Var4.K();
                    obj12 = objK214;
                    if (zH3) {
                        tb2 tb2Var13 = new tb2(dy6Var4, z8 ? (byte) 1 : (byte) 0);
                        ux2Var4.g0(tb2Var13);
                        obj12 = tb2Var13;
                    } else {
                        tb2 tb2Var14 = new tb2(dy6Var4, z8 ? (byte) 1 : (byte) 0);
                        ux2Var4.g0(tb2Var14);
                        obj12 = tb2Var14;
                    }
                    fs4 fs4VarF13 = new js4((Function0) obj12).f(cs4Var3);
                    zG = ux2Var4.g(z9) | ux2Var4.f(function0);
                    Object objK215 = ux2Var4.K();
                    obj13 = objK215;
                    if (zG) {
                        ub2 ub2Var8 = new ub2(z9, function0);
                        ux2Var4.g0(ub2Var8);
                        obj13 = ub2Var8;
                    } else {
                        ub2 ub2Var9 = new ub2(z9, function0);
                        ux2Var4.g0(ub2Var9);
                        obj13 = ub2Var9;
                    }
                    fs4 fs4VarF14 = fs4VarF13.f(di1.t(cs4Var3, (Function1) obj13)).f(new nb2(u18Var2, n18Var2, n18Var3, n18Var, bc2Var4, hf2Var3, dy6Var4, function0, ob2Var5)).f(kc8Var);
                    ux2Var4.W(-1255657861);
                    ux2Var4.p(z8);
                    fs4Var2 = fs4Var;
                    fs4 fs4VarF15 = fs4Var2.f(fs4VarF14.f(cs4Var3));
                    objK5 = ux2Var4.K();
                    if (objK5 == awVar) {
                        coVar2 = coVar;
                        qn qnVar9 = new qn(coVar2);
                        ux2Var4.g0(qnVar9);
                        obj14 = qnVar9;
                    } else {
                        coVar2 = coVar;
                        obj14 = objK5;
                    }
                    qn qnVar10 = (qn) obj14;
                    int iHashCode5 = Long.hashCode(ux2Var4.T);
                    yj5 yj5VarL5 = ux2Var4.l();
                    fs4 fs4VarS5 = uf0.s(ux2Var4, fs4VarF15);
                    yz0.c.getClass();
                    ux2Var4.a0();
                    if (ux2Var4.S) {
                        ux2Var4.k(LayoutNode.e0);
                    } else {
                        ux2Var4.j0();
                    }
                    o67.n(qnVar10, d82.v, ux2Var4);
                    o67.n(yj5VarL5, d82.u, ux2Var4);
                    numValueOf = Integer.valueOf(iHashCode5);
                    iz0Var = d82.w;
                    if (ux2Var4.S) {
                        ux2Var4.b(numValueOf, iz0Var);
                    }
                    o67.l(ux2Var4);
                    o67.n(fs4VarS5, d82.t, ux2Var4);
                    yy0 yy0Var9 = yy0Var;
                    yy0Var9.d(coVar2, ux2Var4, Integer.valueOf((i7 >> 21) & 112));
                    ux2Var4.p(true);
                    ux2Var4.p(z8);
                    yy0Var3 = yy0Var9;
                    ux2Var5 = ux2Var4;
                }
                ux2Var5.p(z8);
                yy0Var2 = yy0Var3;
                ux2Var2 = ux2Var5;
            } else {
                ux2Var6.W(-270514673);
                ux2Var6.p(false);
                yy0Var2 = yy0Var4;
                ux2Var2 = ux2Var6;
            }
        } else {
            ux2Var6.Q();
            yy0Var2 = yy0Var4;
            ux2Var2 = ux2Var6;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new an(u18Var, function1, fs4Var2, bc2Var, hf2Var, hw2Var, yy0Var2, i2);
        }
    }

    public static final void F(u18 u18Var, Function1 function1, fs4 fs4Var, bc2 bc2Var, hf2 hf2Var, yy0 yy0Var, ux2 ux2Var, int i2, int i3) {
        int i4;
        fs4 fs4Var2;
        ux2Var.Y(-1699747442);
        int i5 = i2 | (ux2Var.f(u18Var) ? 4 : 2) | (ux2Var.h(function1) ? 32 : 16);
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 = i5 | 384;
        } else {
            i4 = i5 | (ux2Var.f(fs4Var) ? 256 : 128);
        }
        int i7 = i4 | (ux2Var.f(bc2Var) ? 2048 : 1024) | (ux2Var.f(hf2Var) ? 16384 : 8192);
        if (ux2Var.N(i7 & 1, (74899 & i7) != 74898)) {
            fs4 fs4Var3 = i6 != 0 ? cs4.b : fs4Var;
            J(u18Var, function1, fs4Var3, bc2Var, hf2Var, yy0Var, ux2Var, (i7 & 57344) | (i7 & 14) | 196608 | (i7 & 112) | (i7 & 896) | (i7 & 7168) | 1572864, 0);
            fs4Var2 = fs4Var3;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new un(u18Var, function1, fs4Var2, bc2Var, hf2Var, yy0Var, i2, i3);
        }
    }

    public static final void G(boolean z2, fs4 fs4Var, bc2 bc2Var, hf2 hf2Var, String str, yy0 yy0Var, ux2 ux2Var, int i2) {
        String str2;
        ux2Var.Y(-1448730565);
        int i3 = i2 | (ux2Var.g(z2) ? 4 : 2) | (ux2Var.f(fs4Var) ? 32 : 16) | 24576;
        if (ux2Var.N(i3 & 1, (74899 & i3) != 74898)) {
            u18 u18VarY0 = ck3.y0(Boolean.valueOf(z2), "AnimatedVisibility", ux2Var, (i3 & 14) | 48, 0);
            Object objK = ux2Var.K();
            if (objK == e01.a) {
                objK = zm.q;
                ux2Var.g0(objK);
            }
            J(u18VarY0, (Function1) objK, fs4Var, bc2Var, hf2Var, yy0Var, ux2Var, ((i3 << 3) & 896) | 1600560, 32);
            str2 = "AnimatedVisibility";
        } else {
            ux2Var.Q();
            str2 = str;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new vn(z2, fs4Var, bc2Var, hf2Var, str2, yy0Var, i2, (byte) 0);
        }
    }

    public static final void H(boolean z2, fs4 fs4Var, bc2 bc2Var, hf2 hf2Var, String str, yy0 yy0Var, ux2 ux2Var, int i2, int i3) {
        int i4;
        fs4 fs4Var2;
        bc2 bc2Var2;
        hf2 hf2VarA;
        String str2;
        ux2Var.Y(1799879339);
        if ((i2 & 48) == 0) {
            i4 = (ux2Var.g(z2) ? 32 : 16) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i4 | 384;
        int i6 = i3 & 4;
        if (i6 != 0) {
            i5 = i4 | 3456;
        } else if ((i2 & 3072) == 0) {
            i5 |= ux2Var.f(bc2Var) ? 2048 : 1024;
        }
        int i7 = i3 & 8;
        if (i7 != 0) {
            i5 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i5 |= ux2Var.f(hf2Var) ? 16384 : 8192;
        }
        int i8 = i5 | 196608;
        if ((1572864 & i2) == 0) {
            i8 |= ux2Var.h(yy0Var) ? 1048576 : 524288;
        }
        if (ux2Var.N(i8 & 1, (599185 & i8) != 599184)) {
            if (i6 != 0) {
                bc2Var = wb2.e(null, 3).a(wb2.d(null, 15));
            }
            hf2VarA = i7 != 0 ? wb2.f(null, 3).a(wb2.j(null, 15)) : hf2Var;
            u18 u18VarY0 = ck3.y0(Boolean.valueOf(z2), "AnimatedVisibility", ux2Var, ((i8 >> 3) & 14) | ((i8 >> 12) & 112), 0);
            Object objK = ux2Var.K();
            if (objK == e01.a) {
                objK = zm.s;
                ux2Var.g0(objK);
            }
            fs4Var2 = cs4.b;
            bc2Var2 = bc2Var;
            J(u18VarY0, (Function1) objK, fs4Var2, bc2Var2, hf2VarA, yy0Var, ux2Var, (i8 & 896) | 48 | (i8 & 7168) | (57344 & i8) | (i8 & 3670016), 32);
            str2 = "AnimatedVisibility";
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
            bc2Var2 = bc2Var;
            hf2VarA = hf2Var;
            str2 = str;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new wn(z2, fs4Var2, bc2Var2, hf2VarA, str2, yy0Var, i2, i3);
        }
    }

    public static final void I(boolean z2, fs4 fs4Var, bc2 bc2Var, hf2 hf2Var, String str, yy0 yy0Var, ux2 ux2Var, int i2) {
        fs4 fs4Var2;
        String str2;
        ux2Var.Y(234057107);
        int i3 = i2 | (ux2Var.g(z2) ? 32 : 16) | 384 | (ux2Var.f(bc2Var) ? 2048 : 1024) | (ux2Var.f(hf2Var) ? 16384 : 8192) | 196608;
        if (ux2Var.N(i3 & 1, (599185 & i3) != 599184)) {
            u18 u18VarY0 = ck3.y0(Boolean.valueOf(z2), "AnimatedVisibility", ux2Var, ((i3 >> 3) & 14) | 48, 0);
            Object objK = ux2Var.K();
            if (objK == e01.a) {
                objK = zm.r;
                ux2Var.g0(objK);
            }
            cs4 cs4Var = cs4.b;
            J(u18VarY0, (Function1) objK, cs4Var, bc2Var, hf2Var, yy0Var, ux2Var, (i3 & 57344) | (i3 & 7168) | 432 | 1572864, 32);
            fs4Var2 = cs4Var;
            str2 = "AnimatedVisibility";
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
            str2 = str;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new vn(z2, fs4Var2, bc2Var, hf2Var, str2, yy0Var, i2, (byte) 1);
        }
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1043)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:997)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    public static final void J(u18 u18Var, Function1 function1, fs4 fs4Var, bc2 bc2Var, hf2 hf2Var, yy0 yy0Var, ux2 ux2Var, int i2, int i3) {
        int i4;
        bc2 bc2Var2;
        hf2 hf2Var2;
        yy0 yy0Var2;
        ux2Var.Y(-497872534);
        if ((i2 & 6) == 0) {
            i4 = (ux2Var.f(u18Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ux2Var.h(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= ux2Var.f(fs4Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            bc2Var2 = bc2Var;
            i4 |= ux2Var.f(bc2Var2) ? 2048 : 1024;
        } else {
            bc2Var2 = bc2Var;
        }
        if ((i2 & 24576) == 0) {
            hf2Var2 = hf2Var;
            i4 |= ux2Var.f(hf2Var2) ? 16384 : 8192;
        } else {
            hf2Var2 = hf2Var;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i4 |= ux2Var.h(null) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            yy0Var2 = yy0Var;
            i4 |= ux2Var.h(yy0Var2) ? 1048576 : 524288;
        } else {
            yy0Var2 = yy0Var;
        }
        if (ux2Var.N(i4 & 1, (599187 & i4) != 599186)) {
            int i5 = i4 & 112;
            int i6 = i4 & 14;
            boolean z2 = (i5 == 32) | (i6 == 4);
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (z2 || objK == awVar) {
                objK = new yn(function1, u18Var);
                ux2Var.g0(objK);
            }
            fs4 fs4VarJ0 = j0(fs4Var, (iw2) objK);
            Object objK2 = ux2Var.K();
            if (objK2 == awVar) {
                objK2 = zn.n;
                ux2Var.g0(objK2);
            }
            int i7 = 196608 | i6 | i5 | (i4 & 7168) | (57344 & i4);
            int i8 = i4 << 6;
            bc2 bc2Var3 = bc2Var2;
            hf2 hf2Var3 = hf2Var2;
            E(u18Var, function1, fs4VarJ0, bc2Var3, hf2Var3, (hw2) objK2, yy0Var2, ux2Var, (i8 & 234881024) | i7 | (29360128 & i8));
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new ao(u18Var, function1, fs4Var, bc2Var, hf2Var, yy0Var, i2, i3);
        }
    }

    public static final void K(int i2, Function1 function1, ux2 ux2Var, fs4 fs4Var) {
        int i3;
        ux2Var.Y(-932836462);
        if ((i2 & 6) == 0) {
            i3 = (ux2Var.f(fs4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | (ux2Var.h(function1) ? 32 : 16);
        byte b2 = 0;
        if (ux2Var.N(i4 & 1, (i4 & 19) != 18)) {
            b77.a(ux2Var, j51.B(fs4Var, function1));
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new pl0(fs4Var, function1, i2, b2);
        }
    }

    public static final void L(int i2, int i3, Function0 function0, ux2 ux2Var, fs4 fs4Var) {
        int i4;
        Function0 function1;
        int i5;
        fs4 fs4Var2;
        Function0 function2;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(-677407096);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = i2 | (ux2Var.f(fs4Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        int i7 = i3 & 2;
        if (i7 != 0) {
            i5 = i4 | 48;
            function1 = function0;
        } else {
            function1 = function0;
            i5 = i4 | (ux2Var2.h(function1) ? 32 : 16);
        }
        if (ux2Var2.N(i5 & 1, (i5 & 19) != 18)) {
            cs4 cs4Var = cs4.b;
            fs4 fs4Var3 = i6 != 0 ? cs4Var : fs4Var;
            aw awVar = e01.a;
            if (i7 != 0) {
                Object objK = ux2Var2.K();
                if (objK == awVar) {
                    objK = new y01((byte) 14);
                    ux2Var2.g0(objK);
                }
                function2 = (Function0) objK;
            } else {
                function2 = function1;
            }
            fs4 fs4VarC = androidx.compose.foundation.layout.b.c(fs4Var3, 1.0f);
            h72 h72Var = un4.a;
            int i8 = i5;
            fs4 fs4VarJ = iq8.j(uf0.i(fs4VarC, 1.0f, ((rn4) ux2Var2.j(h72Var)).a.A, sf6.a(8.0f)), sf6.a(8.0f));
            boolean z2 = (i8 & 112) == 32;
            Object objK2 = ux2Var2.K();
            if (z2 || objK2 == awVar) {
                objK2 = new a9(function2, (byte) 11);
                ux2Var2.g0(objK2);
            }
            fs4 fs4VarD = ka0.D(androidx.compose.foundation.b.b(fs4VarJ, false, null, null, (Function0) objK2, 15), 0.0f, 8.0f, 1);
            dg6 dg6VarA = cg6.a(iq8.a, xz2.y, ux2Var2, 48);
            Function0 function3 = function2;
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4VarD);
            yz0.c.getClass();
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(LayoutNode.e0);
            } else {
                ux2Var2.j0();
            }
            o67.n(dg6VarA, d82.v, ux2Var2);
            o67.n(yj5VarL, d82.u, ux2Var2);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
            o67.l(ux2Var2);
            o67.n(fs4VarS, d82.t, ux2Var2);
            fs4 fs4VarD2 = ka0.D(new s14(1.0f, true), 16.0f, 0.0f, 2);
            qs7.b(m77.z(R.string.connect_id_field_place_holder, ux2Var2), fs4VarD2, ((rn4) ux2Var2.j(h72Var)).a.s, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ((rn4) ux2Var2.j(h72Var)).b.j, ux2Var, 0, 24960, 110584);
            ux2Var2 = ux2Var;
            td3.b(lv1.T(R.drawable.ic_connect, ux2Var2, 0), m77.z(R.string.connect_content_description, ux2Var2), androidx.compose.foundation.layout.b.l(ka0.B(ka0.D(cs4Var, 8.0f, 0.0f, 2), 8.0f), 24.0f), ((rn4) ux2Var2.j(h72Var)).a.s, ux2Var2, 392, 0);
            ux2Var2.p(true);
            fs4Var2 = fs4Var3;
            function1 = function3;
        } else {
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new j31(fs4Var2, function1, i2, i3);
        }
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1043)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:997)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [boolean, int] */
    public static final void M(a06 a06Var, p31 p31Var, i31 i31Var, fs4 fs4Var, ux2 ux2Var, int i2) {
        int i3;
        p31 p31Var2;
        i31 i31Var2;
        fs4 fs4Var2;
        ?? r14;
        byte b2;
        p31Var.getClass();
        ux2Var.Y(-1775421973);
        if ((i2 & 6) == 0) {
            i3 = (ux2Var.f(a06Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ux2Var.f(p31Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ux2Var.f(i31Var) ? 256 : 128;
        }
        int i4 = i3 | 3072;
        if (ux2Var.N(i4 & 1, (i4 & 1171) != 1170)) {
            Object[] objArr = new Object[0];
            Object objK = ux2Var.K();
            Object obj = e01.a;
            if (objK == obj) {
                objK = new y01((byte) 12);
                ux2Var.g0(objK);
            }
            yf5 yf5Var = (yf5) zu1.L(objArr, (Function0) objK, ux2Var, 48);
            float fO = p31Var.k ? ((in1) ux2Var.j(b11.h)).O(yf5Var.z()) + 24.0f : 0.0f;
            FillElement fillElement = androidx.compose.foundation.layout.b.c;
            y50 y50Var = xz2.p;
            do4 do4VarC = ua0.c(y50Var, false);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fillElement);
            yz0.c.getClass();
            ux2Var.a0();
            boolean z2 = ux2Var.S;
            tg3 tg3Var = LayoutNode.e0;
            if (z2) {
                ux2Var.k(tg3Var);
            } else {
                ux2Var.j0();
            }
            iz0 iz0Var = d82.v;
            o67.n(do4VarC, iz0Var, ux2Var);
            iz0 iz0Var2 = d82.u;
            o67.n(yj5VarL, iz0Var2, ux2Var);
            Integer numValueOf = Integer.valueOf(iHashCode);
            iz0 iz0Var3 = d82.w;
            o67.n(numValueOf, iz0Var3, ux2Var);
            o67.l(ux2Var);
            iz0 iz0Var4 = d82.t;
            o67.n(fs4VarS, iz0Var4, ux2Var);
            cs4 cs4Var = cs4.b;
            fs4 fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
            hk6 hk6VarW = im3.W(ux2Var);
            Object objK2 = ux2Var.K();
            if (objK2 == obj) {
                objK2 = ck3.w(ux2Var);
                ux2Var.g0(objK2);
            }
            fs4 fs4VarT = o77.t(fs4VarC, hk6VarW, (me1) objK2);
            do4 do4VarC2 = ua0.c(y50Var, false);
            int iHashCode2 = Long.hashCode(ux2Var.T);
            yj5 yj5VarL2 = ux2Var.l();
            fs4 fs4VarS2 = uf0.s(ux2Var, fs4VarT);
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(tg3Var);
            } else {
                ux2Var.j0();
            }
            o67.n(do4VarC2, iz0Var, ux2Var);
            o67.n(yj5VarL2, iz0Var2, ux2Var);
            e41.r(iHashCode2, ux2Var, iz0Var3, ux2Var);
            o67.n(fs4VarS2, iz0Var4, ux2Var);
            fs4 fs4VarF = ka0.F(ka0.B(cs4Var, 24.0f), 0.0f, 0.0f, 0.0f, fO, 7).f(a06Var.a() ? androidx.compose.foundation.layout.b.q(cs4Var, 768.0f, 1) : cs4Var);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var, 0);
            int iHashCode3 = Long.hashCode(ux2Var.T);
            yj5 yj5VarL3 = ux2Var.l();
            fs4 fs4VarS3 = uf0.s(ux2Var, fs4VarF);
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(tg3Var);
            } else {
                ux2Var.j0();
            }
            o67.n(kw0VarA, iz0Var, ux2Var);
            o67.n(yj5VarL3, iz0Var2, ux2Var);
            e41.r(iHashCode3, ux2Var, iz0Var3, ux2Var);
            o67.n(fs4VarS3, iz0Var4, ux2Var);
            if (!a06Var.c || a06Var.a()) {
                r14 = 0;
                ux2Var.W(-1752077119);
                U(a06Var.a(), null, ux2Var, 0);
            } else {
                ux2Var.W(1520207225);
                r14 = 0;
            }
            ux2Var.p(r14);
            if (a06Var.d) {
                ux2Var.W(1520282617);
            } else {
                ux2Var.W(-1752074842);
                Q(a06Var.a(), null, ux2Var, r14);
            }
            ux2Var.p(r14);
            fs4 fs4VarF2 = ka0.F(cs4Var, 0.0f, 0.0f, 0.0f, 24.0f, 7);
            boolean z3 = (i4 & 896) == 256;
            Object objK3 = ux2Var.K();
            if (z3 || objK3 == obj) {
                i31Var2 = i31Var;
                b2 = 0;
                objK3 = new n31(i31Var2, b2);
                ux2Var.g0(objK3);
            } else {
                i31Var2 = i31Var;
                b2 = 0;
            }
            L(6, b2, (Function0) objK3, ux2Var, fs4VarF2);
            byte b3 = 3;
            p31Var2 = p31Var;
            N(p31Var2, i31Var2, null, ux2Var, (i4 >> 3) & 126);
            ux2Var.p(true);
            ux2Var.p(true);
            fs4 fs4VarB = ka0.B(ya0.a.a(cs4Var, xz2.v), 24.0f);
            boolean zF = ux2Var.f(yf5Var);
            Object objK4 = ux2Var.K();
            if (zF || objK4 == obj) {
                objK4 = new ma(yf5Var, b3);
                ux2Var.g0(objK4);
            }
            G(p31Var2.k, db8.r0(fs4VarB, (Function1) objK4), wb2.e(null, 3).a(wb2.g(null, 0.8f, 5)), wb2.f(null, 3).a(new hf2(new t18((ih2) null, (f17) null, (um0) null, new pi6(0.8f, d18.b, db8.A0(0.0f, 400.0f, null, 5)), (LinkedHashMap) null, 119))), null, au8.O(-557512371, new sd(p31Var2, i31Var2, (byte) 1), ux2Var), ux2Var, 200064);
            ux2Var.p(true);
            fs4Var2 = cs4Var;
        } else {
            p31Var2 = p31Var;
            i31Var2 = i31Var;
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new p5((Object) a06Var, (Object) p31Var2, (Object) i31Var2, fs4Var2, i2, (byte) 7);
        }
    }

    public static final void N(final p31 p31Var, final i31 i31Var, fs4 fs4Var, ux2 ux2Var, final int i2) {
        int i3;
        p31 p31Var2;
        i31 i31Var2;
        final fs4 fs4Var2;
        j56 j56VarR;
        hw2 hw2Var;
        ux2Var.Y(-951398746);
        int i4 = ux2Var.S ? -ux2Var.I.v : ux2Var.G.i;
        if ((i2 & 6) == 0) {
            i3 = i2 | (ux2Var.f(p31Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ux2Var.f(i31Var) ? 32 : 16;
        }
        int i5 = i3 | 384;
        final byte b2 = 1;
        final byte b3 = 0;
        if (ux2Var.N(i5 & 1, (i5 & 147) != 146)) {
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var, 0);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            final cs4 cs4Var = cs4.b;
            fs4 fs4VarS = uf0.s(ux2Var, cs4Var);
            yz0.c.getClass();
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            o67.n(kw0VarA, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS, d82.t, ux2Var);
            ux2Var.W(-737050687);
            if (p31Var.g && p31Var.h) {
                ux2Var.W(-737020246);
                O(p31Var.i, p31Var.j, null, ux2Var, 0);
                if (i4 >= 0) {
                    if (ux2Var.S) {
                        k17 k17Var = ux2Var.I;
                        while (ux2Var.S) {
                            ux2Var.p(k17Var.x(k17Var.v));
                        }
                    }
                    g17 g17Var = ux2Var.G;
                    while (true) {
                        int i6 = g17Var.i;
                        if (i6 <= i4) {
                            break;
                        } else {
                            ux2Var.p(g17Var.l(i6));
                        }
                    }
                } else {
                    int i7 = -i4;
                    k17 k17Var2 = ux2Var.I;
                    while (true) {
                        int i8 = k17Var2.v;
                        if (i8 <= i7) {
                            break;
                        } else {
                            ux2Var.p(k17Var2.x(i8));
                        }
                    }
                }
                j56VarR = ux2Var.r();
                if (j56VarR == null) {
                    return;
                }
                final byte b4 = 0;
                hw2Var = new hw2() { // from class: o.l31
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b5 = b4;
                        f88 f88Var = f88.a;
                        int i9 = i2;
                        fs4 fs4Var3 = cs4Var;
                        i31 i31Var3 = i31Var;
                        p31 p31Var3 = p31Var;
                        ux2 ux2Var2 = (ux2) obj;
                        ((Integer) obj2).getClass();
                        switch (b5) {
                            case 0:
                                vn4.N(p31Var3, i31Var3, fs4Var3, ux2Var2, yo1.Y(i9 | 1));
                                break;
                            default:
                                vn4.N(p31Var3, i31Var3, fs4Var3, ux2Var2, yo1.Y(i9 | 1));
                                break;
                        }
                        return f88Var;
                    }
                };
            } else {
                p31Var2 = p31Var;
                ux2Var.W(-736766542);
                ux2Var.p(false);
                if (p31Var2.f1699o.isEmpty()) {
                    i31Var2 = i31Var;
                    ux2Var.W(-736126702);
                    ux2Var.p(false);
                } else {
                    ux2Var.W(-736679587);
                    fs4 fs4VarF = ka0.F(cs4Var, 0.0f, 0.0f, 0.0f, 16.0f, 7);
                    List list = p31Var2.f1699o;
                    boolean z2 = p31Var2.i;
                    Function0 function0 = i31Var.b;
                    int i9 = i5 & 112;
                    boolean z3 = i9 == 32;
                    Object objK = ux2Var.K();
                    aw awVar = e01.a;
                    if (z3 || objK == awVar) {
                        objK = new Function1() { // from class: o.m31
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                byte b5 = b3;
                                f88 f88Var = f88.a;
                                i31 i31Var3 = i31Var;
                                SupportSession supportSession = (SupportSession) obj;
                                switch (b5) {
                                    case 0:
                                        supportSession.getClass();
                                        i31Var3.h.invoke(supportSession);
                                        break;
                                    default:
                                        supportSession.getClass();
                                        i31Var3.i.invoke(supportSession);
                                        break;
                                }
                                return f88Var;
                            }
                        };
                        ux2Var.g0(objK);
                    }
                    Function1 function1 = (Function1) objK;
                    boolean z4 = i9 == 32;
                    Object objK2 = ux2Var.K();
                    if (z4 || objK2 == awVar) {
                        objK2 = new Function1() { // from class: o.m31
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                byte b5 = b2;
                                f88 f88Var = f88.a;
                                i31 i31Var3 = i31Var;
                                SupportSession supportSession = (SupportSession) obj;
                                switch (b5) {
                                    case 0:
                                        supportSession.getClass();
                                        i31Var3.h.invoke(supportSession);
                                        break;
                                    default:
                                        supportSession.getClass();
                                        i31Var3.i.invoke(supportSession);
                                        break;
                                }
                                return f88Var;
                            }
                        };
                        ux2Var.g0(objK2);
                    }
                    i31Var2 = i31Var;
                    h67.b(384, list, function0, function1, (Function1) objK2, ux2Var, fs4VarF, z2);
                    ux2Var.p(false);
                }
                if (p31Var2.n.isEmpty()) {
                    ux2Var.W(-735618798);
                    ux2Var.p(false);
                } else {
                    ux2Var.W(-736048365);
                    wo1.n(0, p31Var2.n, i31Var2.c, i31Var2.f, i31Var2.g, ux2Var, null, p31Var2.j);
                    ux2Var.p(false);
                }
                ux2Var.p(false);
                ux2Var.p(true);
                fs4Var2 = cs4Var;
            }
            j56VarR.d = hw2Var;
        }
        p31Var2 = p31Var;
        i31Var2 = i31Var;
        ux2Var.Q();
        fs4Var2 = fs4Var;
        j56VarR = ux2Var.r();
        if (j56VarR != null) {
            final byte b5 = 1;
            final p31 p31Var3 = p31Var2;
            final i31 i31Var3 = i31Var2;
            hw2Var = new hw2() { // from class: o.l31
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    byte b6 = b5;
                    f88 f88Var = f88.a;
                    int i10 = i2;
                    fs4 fs4Var3 = fs4Var2;
                    i31 i31Var4 = i31Var3;
                    p31 p31Var4 = p31Var3;
                    ux2 ux2Var2 = (ux2) obj;
                    ((Integer) obj2).getClass();
                    switch (b6) {
                        case 0:
                            vn4.N(p31Var4, i31Var4, fs4Var3, ux2Var2, yo1.Y(i10 | 1));
                            break;
                        default:
                            vn4.N(p31Var4, i31Var4, fs4Var3, ux2Var2, yo1.Y(i10 | 1));
                            break;
                    }
                    return f88Var;
                }
            };
            j56VarR.d = hw2Var;
        }
    }

    public static final void O(boolean z2, boolean z3, fs4 fs4Var, ux2 ux2Var, int i2) {
        ux2Var.Y(2128383551);
        int i3 = (ux2Var.g(z2) ? 4 : 2) | i2 | (ux2Var.g(z3) ? 32 : 16) | 384;
        if (ux2Var.N(i3 & 1, (i3 & 147) != 146)) {
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var, 0);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            cs4 cs4Var = cs4.b;
            fs4 fs4VarS = uf0.s(ux2Var, cs4Var);
            yz0.c.getClass();
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            o67.n(kw0VarA, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS, d82.t, ux2Var);
            au8.f(z2, cs4Var, ux2Var, (i3 & 14) | 48, 0);
            b77.a(ux2Var, androidx.compose.foundation.layout.b.d(cs4Var, 16.0f));
            au8.f(z3, null, ux2Var, (i3 >> 3) & 14, 2);
            ux2Var.p(true);
            fs4Var = cs4Var;
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new y9(z2, z3, fs4Var, i2);
        }
    }

    public static final void P(fs4 fs4Var, xy6 xy6Var, Function1 function1, Function0 function0, a91 a91Var, ux2 ux2Var, int i2) {
        fs4 fs4Var2;
        xy6 xy6VarR;
        int i3;
        a91Var.getClass();
        ux2Var.Y(742792950);
        int i4 = i2 | 22 | (ux2Var.h(function1) ? 256 : 128) | (ux2Var.h(function0) ? 2048 : 1024) | (ux2Var.d(a91Var.ordinal()) ? 16384 : 8192);
        if (ux2Var.N(i4 & 1, (i4 & 9363) != 9362)) {
            ux2Var.S();
            byte b2 = 2;
            if ((i2 & 1) == 0 || ux2Var.x()) {
                xy6VarR = yo1.R(null, ux2Var, 6, 2);
                i3 = i4 & (-113);
                fs4Var2 = cs4.b;
            } else {
                ux2Var.Q();
                xy6VarR = xy6Var;
                i3 = i4 & (-113);
                fs4Var2 = fs4Var;
            }
            ux2Var.q();
            Object objK = ux2Var.K();
            if (objK == e01.a) {
                objK = new h31((byte) 10);
                ux2Var.g0(objK);
            }
            yo1.k(function0, cp6.a(fs4Var2, false, (Function1) objK), xy6VarR, 0.0f, false, null, 0L, 0L, 0L, null, null, null, au8.O(1975947988, new sd(a91Var, function1, b2), ux2Var), ux2Var, (i3 >> 9) & 14, 3072, 8184);
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
            xy6VarR = xy6Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new o31(fs4Var2, xy6VarR, function1, function0, (Enum) a91Var, i2, (byte) 2);
        }
    }

    public static final void Q(boolean z2, fs4 fs4Var, ux2 ux2Var, int i2) {
        fs4 fs4Var2;
        ux2Var.Y(-737338394);
        int i3 = (ux2Var.g(z2) ? 4 : 2) | i2 | 48;
        byte b2 = 0;
        if (ux2Var.N(i3 & 1, (i3 & 19) != 18)) {
            float f2 = z2 ? 220.0f : 170.0f;
            xh4 xh4VarH = vt1.H(new yh4(R.raw.lottie_animation_login), ux2Var);
            kh4 kh4VarG = g68.g((qh4) xh4VarH.getValue(), 3, ux2Var, 958);
            cs4 cs4Var = cs4.b;
            fs4 fs4VarJ = iq8.j(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(ka0.F(cs4Var, 0.0f, 0.0f, 0.0f, 16.0f, 7), 1.0f), f2), sf6.a(16.0f));
            do4 do4VarC = ua0.c(xz2.f2564o, false);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarJ);
            yz0.c.getClass();
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            o67.n(do4VarC, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS, d82.t, ux2Var);
            qs1.l(lv1.T(R.drawable.connect_tab_card_background, ux2Var, 0), m77.z(R.string.animation_background_content_description, ux2Var), androidx.compose.foundation.layout.b.c, null, rb1.a, 0.0f, null, ux2Var, 24968, 104);
            qh4 qh4Var = (qh4) xh4VarH.getValue();
            boolean zF = ux2Var.f(kh4VarG);
            Object objK = ux2Var.K();
            if (zF || objK == e01.a) {
                objK = new k31(kh4VarG, b2);
                ux2Var.g0(objK);
            }
            fs4Var2 = cs4Var;
            ct1.f(qh4Var, (Function0) objK, ya0.a.a(androidx.compose.foundation.layout.b.c(fs4Var2, 1.0f), xz2.s), ux2Var, 0);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new vh(z2, fs4Var2, i2, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0332  */
    /* JADX WARN: Code duplicated, block: B:102:0x033f  */
    /* JADX WARN: Code duplicated, block: B:107:0x036a  */
    /* JADX WARN: Code duplicated, block: B:111:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:114:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x006e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0071  */
    /* JADX WARN: Code duplicated, block: B:35:0x007f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0081  */
    /* JADX WARN: Code duplicated, block: B:39:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x008c  */
    /* JADX WARN: Code duplicated, block: B:41:0x008e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0091  */
    /* JADX WARN: Code duplicated, block: B:44:0x0098  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:51:0x0110  */
    /* JADX WARN: Code duplicated, block: B:52:0x0121  */
    /* JADX WARN: Code duplicated, block: B:56:0x0192  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:66:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:69:0x0205  */
    /* JADX WARN: Code duplicated, block: B:70:0x0207  */
    /* JADX WARN: Code duplicated, block: B:76:0x021c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0249  */
    /* JADX WARN: Code duplicated, block: B:86:0x026c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0270  */
    /* JADX WARN: Code duplicated, block: B:90:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:91:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:97:0x02f9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r10v45 */
    public static final void R(List list, String str, fs4 fs4Var, String str2, nd5 nd5Var, pd5 pd5Var, Function1 function1, ux2 ux2Var, int i2, int i3) {
        String str3;
        int i4;
        nd5 nd5Var2;
        int i5;
        int i6;
        boolean z2;
        nd5 nd5Var3;
        String str4;
        j56 j56VarR;
        String str5;
        nd5 pd5Var2;
        h72 h72Var;
        nd5 nd5Var4;
        String str6;
        bw bwVar;
        k06 k06VarZ;
        boolean z3;
        tg3 tg3Var;
        cs4 cs4Var;
        tg3 tg3Var2;
        cs4 cs4Var2;
        String str7;
        boolean z4;
        Iterator it;
        int i7;
        vv6 vv6Var;
        Object objK;
        aw awVar;
        yf5 yf5Var;
        Object objK2;
        yf5 yf5Var2;
        String str8;
        fs4 fs4VarA;
        boolean z5;
        boolean zH;
        Object objK3;
        x50 x50Var;
        h72 h72Var2;
        boolean zF;
        Object objK4;
        String str9;
        boolean zF2;
        Object objK5;
        boolean z6;
        ux2 ux2Var2 = ux2Var;
        iz0 iz0Var = d82.t;
        iz0 iz0Var2 = d82.w;
        iz0 iz0Var3 = d82.u;
        iz0 iz0Var4 = d82.v;
        w50 w50Var = xz2.A;
        bw bwVar2 = iq8.c;
        list.getClass();
        ux2Var2.Y(-1899941422);
        int i8 = (ux2Var2.f(list) ? 4 : 2) | i2 | (ux2Var2.f(str) ? 32 : 16);
        int i9 = i3 & 8;
        if (i9 != 0) {
            i4 = i8 | 3072;
            str3 = str2;
        } else {
            str3 = str2;
            i4 = i8 | (ux2Var2.f(str3) ? 2048 : 1024);
        }
        int i10 = i3 & 16;
        if (i10 == 0) {
            if ((i2 & 24576) == 0) {
                nd5Var2 = nd5Var;
                i4 |= ux2Var2.f(nd5Var2) ? 16384 : 8192;
            }
            if (ux2Var2.h(function1)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i6 = i4 | i5;
            if ((i6 & 599187) != 599186) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (ux2Var2.N(i6 & 1, z2)) {
                if (i9 != 0) {
                    str5 = null;
                } else {
                    str5 = str3;
                }
                if (i10 != 0) {
                    pd5Var2 = new pd5(0.0f, 0.0f, 0.0f, 0.0f);
                } else {
                    pd5Var2 = nd5Var2;
                }
                h72Var = un4.a;
                long j2 = ((rn4) ux2Var2.j(h72Var)).a.a;
                long j3 = ((rn4) ux2Var2.j(h72Var)).a.a;
                nd5Var4 = pd5Var2;
                long j4 = rv0.h;
                str6 = str5;
                bwVar = bwVar2;
                k06VarZ = xs1.z(j2, j3, j4, j4, ux2Var);
                ux2Var2 = ux2Var;
                fs4 fs4VarA2 = cp6.a(fs4Var, false, new fk6((byte) 6));
                kw0 kw0VarA = iw0.a(bwVar, w50Var, ux2Var2, 0);
                int iHashCode = Long.hashCode(ux2Var2.T);
                yj5 yj5VarL = ux2Var2.l();
                fs4 fs4VarS = uf0.s(ux2Var2, fs4VarA2);
                yz0.c.getClass();
                ux2Var2.a0();
                z3 = ux2Var2.S;
                tg3Var = LayoutNode.e0;
                if (z3) {
                    ux2Var2.k(tg3Var);
                } else {
                    ux2Var2.j0();
                }
                o67.n(kw0VarA, iz0Var4, ux2Var2);
                o67.n(yj5VarL, iz0Var3, ux2Var2);
                e41.r(iHashCode, ux2Var2, iz0Var2, ux2Var2);
                o67.n(fs4VarS, iz0Var, ux2Var2);
                cs4Var = cs4.b;
                if (str6 == null) {
                    ux2Var2.W(2112865337);
                    z4 = false;
                    ux2Var2.p(false);
                    str7 = str6;
                    cs4Var2 = cs4Var;
                    tg3Var2 = tg3Var;
                } else {
                    ux2Var2.W(2112865338);
                    tg3Var2 = tg3Var;
                    cs4Var2 = cs4Var;
                    qs7.b(str6, ka0.A(cs4Var, nd5Var4), ((rn4) ux2Var2.j(h72Var)).a.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(h72Var)).b.k, ux2Var, 0, 0, 131064);
                    str7 = str6;
                    ux2Var2 = ux2Var;
                    z4 = false;
                    ux2Var2.p(false);
                }
                ux2Var2.W(1869283228);
                it = list.iterator();
                i7 = z4;
                while (it.hasNext()) {
                    vv6Var = (vv6) it.next();
                    Object[] objArr = new Object[i7];
                    objK = ux2Var2.K();
                    awVar = e01.a;
                    if (objK == awVar) {
                        objK = new zq((byte) 22);
                        ux2Var2.g0(objK);
                    }
                    yf5Var = (yf5) zu1.L(objArr, (Function0) objK, ux2Var2, 48);
                    Object[] objArr2 = new Object[0];
                    objK2 = ux2Var2.K();
                    if (objK2 == awVar) {
                        objK2 = new zq((byte) 23);
                        ux2Var2.g0(objK2);
                    }
                    yf5Var2 = (yf5) zu1.L(objArr2, (Function0) objK2, ux2Var2, 48);
                    fs4 fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var2, 1.0f);
                    str8 = vv6Var.d;
                    String str10 = vv6Var.a;
                    if (str8 != null || (fs4VarA = androidx.compose.ui.platform.a.a(cs4Var2, str8)) == null) {
                        fs4VarA = cs4Var2;
                    }
                    fs4 fs4VarF = fs4VarC.f(fs4VarA);
                    boolean zN = im3.n(str10, str);
                    w50 w50Var2 = w50Var;
                    pe6 pe6Var = new pe6(3);
                    bw bwVar3 = bwVar;
                    if ((i6 & 3670016) == 1048576) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    zH = z5 | ux2Var2.h(vv6Var);
                    objK3 = ux2Var2.K();
                    if (zH || objK3 == awVar) {
                        objK3 = new x8(function1, vv6Var, (byte) 17);
                        ux2Var2.g0(objK3);
                    }
                    fs4 fs4VarC2 = ka0.C(g68.A(fs4VarF, zN, pe6Var, (Function0) objK3), 16.0f, 12.0f);
                    if (yf5Var2.z() <= 1 || yf5Var2.z() > 1) {
                        x50Var = xz2.x;
                    } else {
                        x50Var = xz2.y;
                    }
                    dg6 dg6VarA = cg6.a(iq8.a, x50Var, ux2Var2, 0);
                    int iHashCode2 = Long.hashCode(ux2Var2.T);
                    yj5 yj5VarL2 = ux2Var2.l();
                    fs4 fs4VarS2 = uf0.s(ux2Var2, fs4VarC2);
                    yz0.c.getClass();
                    ux2Var2.a0();
                    if (ux2Var2.S) {
                        ux2Var2.k(tg3Var2);
                    } else {
                        ux2Var2.j0();
                    }
                    o67.n(dg6VarA, iz0Var4, ux2Var2);
                    o67.n(yj5VarL2, iz0Var3, ux2Var2);
                    e41.r(iHashCode2, ux2Var2, iz0Var2, ux2Var2);
                    o67.n(fs4VarS2, iz0Var, ux2Var2);
                    k06 k06Var = k06VarZ;
                    bt1.j(im3.n(str10, str), ka0.A(cs4Var2, pd5Var), false, k06Var, ux2Var2, 48, 40);
                    kw0 kw0VarA2 = iw0.a(bwVar3, w50Var2, ux2Var2, 0);
                    int iHashCode3 = Long.hashCode(ux2Var2.T);
                    yj5 yj5VarL3 = ux2Var2.l();
                    fs4 fs4VarS3 = uf0.s(ux2Var2, cs4Var2);
                    ux2Var2.a0();
                    cs4 cs4Var3 = cs4Var2;
                    if (ux2Var2.S) {
                        ux2Var2.k(tg3Var2);
                    } else {
                        ux2Var2.j0();
                    }
                    o67.n(kw0VarA2, iz0Var4, ux2Var2);
                    o67.n(yj5VarL3, iz0Var3, ux2Var2);
                    e41.r(iHashCode3, ux2Var2, iz0Var2, ux2Var2);
                    o67.n(fs4VarS3, iz0Var, ux2Var2);
                    String str11 = vv6Var.a;
                    h72Var2 = un4.a;
                    long j5 = ((rn4) ux2Var2.j(h72Var2)).a.q;
                    ot7 ot7Var = ((rn4) ux2Var2.j(h72Var2)).b.j;
                    zF = ux2Var2.f(yf5Var);
                    tg3 tg3Var3 = tg3Var2;
                    objK4 = ux2Var2.K();
                    if (zF || objK4 == awVar) {
                        objK4 = new ma(yf5Var, (byte) 1);
                        ux2Var2.g0(objK4);
                    }
                    bwVar = bwVar3;
                    qs7.b(str11, null, j5, 0L, null, 0L, null, 0L, 0, false, 0, 0, (Function1) objK4, ot7Var, ux2Var, 0, 0, 65530);
                    ux2Var2 = ux2Var;
                    str9 = vv6Var.b;
                    if (str9 == null) {
                        ux2Var2.W(-1771074562);
                        z6 = false;
                        ux2Var2.p(false);
                    } else {
                        ux2Var2.W(-1771074561);
                        long j6 = ((rn4) ux2Var2.j(h72Var2)).a.s;
                        ot7 ot7Var2 = ((rn4) ux2Var2.j(h72Var2)).b.k;
                        zF2 = ux2Var2.f(yf5Var2);
                        objK5 = ux2Var2.K();
                        if (zF2 || objK5 == awVar) {
                            objK5 = new ma(yf5Var2, (byte) 2);
                            ux2Var2.g0(objK5);
                        }
                        qs7.b(str9, null, j6, 0L, null, 0L, null, 0L, 0, false, 0, 0, (Function1) objK5, ot7Var2, ux2Var, 0, 0, 65530);
                        ux2Var2 = ux2Var;
                        z6 = false;
                        ux2Var2.p(false);
                    }
                    ux2Var2.p(true);
                    ux2Var2.p(true);
                    tg3Var2 = tg3Var3;
                    w50Var = w50Var2;
                    k06VarZ = k06Var;
                    cs4Var2 = cs4Var3;
                    iz0Var = iz0Var;
                    i7 = z6;
                }
                ux2Var2.p(i7);
                ux2Var2.p(true);
                nd5Var3 = nd5Var4;
                str4 = str7;
            } else {
                ux2Var2.Q();
                nd5Var3 = nd5Var2;
                str4 = str3;
            }
            j56VarR = ux2Var2.r();
            if (j56VarR != null) {
                j56VarR.d = new ex0(list, str, fs4Var, str4, nd5Var3, pd5Var, function1, i2, i3);
            }
        }
        i4 |= 24576;
        nd5Var2 = nd5Var;
        if (ux2Var2.h(function1)) {
            i5 = 1048576;
        } else {
            i5 = 524288;
        }
        i6 = i4 | i5;
        if ((i6 & 599187) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (ux2Var2.N(i6 & 1, z2)) {
            if (i9 != 0) {
                str5 = null;
            } else {
                str5 = str3;
            }
            if (i10 != 0) {
                pd5Var2 = new pd5(0.0f, 0.0f, 0.0f, 0.0f);
            } else {
                pd5Var2 = nd5Var2;
            }
            h72Var = un4.a;
            long j7 = ((rn4) ux2Var2.j(h72Var)).a.a;
            long j8 = ((rn4) ux2Var2.j(h72Var)).a.a;
            nd5Var4 = pd5Var2;
            long j9 = rv0.h;
            str6 = str5;
            bwVar = bwVar2;
            k06VarZ = xs1.z(j7, j8, j9, j9, ux2Var);
            ux2Var2 = ux2Var;
            fs4 fs4VarA3 = cp6.a(fs4Var, false, new fk6((byte) 6));
            kw0 kw0VarA3 = iw0.a(bwVar, w50Var, ux2Var2, 0);
            int iHashCode4 = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL4 = ux2Var2.l();
            fs4 fs4VarS4 = uf0.s(ux2Var2, fs4VarA3);
            yz0.c.getClass();
            ux2Var2.a0();
            z3 = ux2Var2.S;
            tg3Var = LayoutNode.e0;
            if (z3) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            o67.n(kw0VarA3, iz0Var4, ux2Var2);
            o67.n(yj5VarL4, iz0Var3, ux2Var2);
            e41.r(iHashCode4, ux2Var2, iz0Var2, ux2Var2);
            o67.n(fs4VarS4, iz0Var, ux2Var2);
            cs4Var = cs4.b;
            if (str6 == null) {
                ux2Var2.W(2112865337);
                z4 = false;
                ux2Var2.p(false);
                str7 = str6;
                cs4Var2 = cs4Var;
                tg3Var2 = tg3Var;
            } else {
                ux2Var2.W(2112865338);
                tg3Var2 = tg3Var;
                cs4Var2 = cs4Var;
                qs7.b(str6, ka0.A(cs4Var, nd5Var4), ((rn4) ux2Var2.j(h72Var)).a.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(h72Var)).b.k, ux2Var, 0, 0, 131064);
                str7 = str6;
                ux2Var2 = ux2Var;
                z4 = false;
                ux2Var2.p(false);
            }
            ux2Var2.W(1869283228);
            it = list.iterator();
            i7 = z4;
            while (it.hasNext()) {
                vv6Var = (vv6) it.next();
                Object[] objArr3 = new Object[i7];
                objK = ux2Var2.K();
                awVar = e01.a;
                if (objK == awVar) {
                    objK = new zq((byte) 22);
                    ux2Var2.g0(objK);
                }
                yf5Var = (yf5) zu1.L(objArr3, (Function0) objK, ux2Var2, 48);
                Object[] objArr4 = new Object[0];
                objK2 = ux2Var2.K();
                if (objK2 == awVar) {
                    objK2 = new zq((byte) 23);
                    ux2Var2.g0(objK2);
                }
                yf5Var2 = (yf5) zu1.L(objArr4, (Function0) objK2, ux2Var2, 48);
                fs4 fs4VarC3 = androidx.compose.foundation.layout.b.c(cs4Var2, 1.0f);
                str8 = vv6Var.d;
                String str12 = vv6Var.a;
                if (str8 != null) {
                    fs4VarA = cs4Var2;
                } else {
                    fs4VarA = cs4Var2;
                }
                fs4 fs4VarF2 = fs4VarC3.f(fs4VarA);
                boolean zN2 = im3.n(str12, str);
                w50 w50Var3 = w50Var;
                pe6 pe6Var2 = new pe6(3);
                bw bwVar4 = bwVar;
                if ((i6 & 3670016) == 1048576) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                zH = z5 | ux2Var2.h(vv6Var);
                objK3 = ux2Var2.K();
                if (zH) {
                    objK3 = new x8(function1, vv6Var, (byte) 17);
                    ux2Var2.g0(objK3);
                } else {
                    objK3 = new x8(function1, vv6Var, (byte) 17);
                    ux2Var2.g0(objK3);
                }
                fs4 fs4VarC4 = ka0.C(g68.A(fs4VarF2, zN2, pe6Var2, (Function0) objK3), 16.0f, 12.0f);
                if (yf5Var2.z() <= 1) {
                    x50Var = xz2.x;
                } else {
                    x50Var = xz2.x;
                }
                dg6 dg6VarA2 = cg6.a(iq8.a, x50Var, ux2Var2, 0);
                int iHashCode5 = Long.hashCode(ux2Var2.T);
                yj5 yj5VarL5 = ux2Var2.l();
                fs4 fs4VarS5 = uf0.s(ux2Var2, fs4VarC4);
                yz0.c.getClass();
                ux2Var2.a0();
                if (ux2Var2.S) {
                    ux2Var2.k(tg3Var2);
                } else {
                    ux2Var2.j0();
                }
                o67.n(dg6VarA2, iz0Var4, ux2Var2);
                o67.n(yj5VarL5, iz0Var3, ux2Var2);
                e41.r(iHashCode5, ux2Var2, iz0Var2, ux2Var2);
                o67.n(fs4VarS5, iz0Var, ux2Var2);
                k06 k06Var2 = k06VarZ;
                bt1.j(im3.n(str12, str), ka0.A(cs4Var2, pd5Var), false, k06Var2, ux2Var2, 48, 40);
                kw0 kw0VarA4 = iw0.a(bwVar4, w50Var3, ux2Var2, 0);
                int iHashCode6 = Long.hashCode(ux2Var2.T);
                yj5 yj5VarL6 = ux2Var2.l();
                fs4 fs4VarS6 = uf0.s(ux2Var2, cs4Var2);
                ux2Var2.a0();
                cs4 cs4Var4 = cs4Var2;
                if (ux2Var2.S) {
                    ux2Var2.k(tg3Var2);
                } else {
                    ux2Var2.j0();
                }
                o67.n(kw0VarA4, iz0Var4, ux2Var2);
                o67.n(yj5VarL6, iz0Var3, ux2Var2);
                e41.r(iHashCode6, ux2Var2, iz0Var2, ux2Var2);
                o67.n(fs4VarS6, iz0Var, ux2Var2);
                String str13 = vv6Var.a;
                h72Var2 = un4.a;
                long j10 = ((rn4) ux2Var2.j(h72Var2)).a.q;
                ot7 ot7Var3 = ((rn4) ux2Var2.j(h72Var2)).b.j;
                zF = ux2Var2.f(yf5Var);
                tg3 tg3Var4 = tg3Var2;
                objK4 = ux2Var2.K();
                if (zF) {
                    objK4 = new ma(yf5Var, (byte) 1);
                    ux2Var2.g0(objK4);
                } else {
                    objK4 = new ma(yf5Var, (byte) 1);
                    ux2Var2.g0(objK4);
                }
                bwVar = bwVar4;
                qs7.b(str13, null, j10, 0L, null, 0L, null, 0L, 0, false, 0, 0, (Function1) objK4, ot7Var3, ux2Var, 0, 0, 65530);
                ux2Var2 = ux2Var;
                str9 = vv6Var.b;
                if (str9 == null) {
                    ux2Var2.W(-1771074562);
                    z6 = false;
                    ux2Var2.p(false);
                } else {
                    ux2Var2.W(-1771074561);
                    long j11 = ((rn4) ux2Var2.j(h72Var2)).a.s;
                    ot7 ot7Var4 = ((rn4) ux2Var2.j(h72Var2)).b.k;
                    zF2 = ux2Var2.f(yf5Var2);
                    objK5 = ux2Var2.K();
                    if (zF2) {
                        objK5 = new ma(yf5Var2, (byte) 2);
                        ux2Var2.g0(objK5);
                    } else {
                        objK5 = new ma(yf5Var2, (byte) 2);
                        ux2Var2.g0(objK5);
                    }
                    qs7.b(str9, null, j11, 0L, null, 0L, null, 0L, 0, false, 0, 0, (Function1) objK5, ot7Var4, ux2Var, 0, 0, 65530);
                    ux2Var2 = ux2Var;
                    z6 = false;
                    ux2Var2.p(false);
                }
                ux2Var2.p(true);
                ux2Var2.p(true);
                tg3Var2 = tg3Var4;
                w50Var = w50Var3;
                k06VarZ = k06Var2;
                cs4Var2 = cs4Var4;
                iz0Var = iz0Var;
                i7 = z6;
            }
            ux2Var2.p(i7);
            ux2Var2.p(true);
            nd5Var3 = nd5Var4;
            str4 = str7;
        } else {
            ux2Var2.Q();
            nd5Var3 = nd5Var2;
            str4 = str3;
        }
        j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new ex0(list, str, fs4Var, str4, nd5Var3, pd5Var, function1, i2, i3);
        }
    }

    public static final void S(List list, a91 a91Var, fs4 fs4Var, Function1 function1, ux2 ux2Var, int i2) {
        fs4 fs4Var2;
        ux2 ux2Var2 = ux2Var;
        iz0 iz0Var = d82.t;
        iz0 iz0Var2 = d82.w;
        iz0 iz0Var3 = d82.u;
        iz0 iz0Var4 = d82.v;
        ux2Var2.Y(1288122490);
        int i3 = i2 | (ux2Var2.f(list) ? 4 : 2) | (ux2Var2.d(a91Var.ordinal()) ? 32 : 16) | 384 | (ux2Var2.h(function1) ? 2048 : 1024);
        if (ux2Var2.N(i3 & 1, (i3 & 1171) != 1170)) {
            h72 h72Var = un4.a;
            long j2 = ((rn4) ux2Var2.j(h72Var)).a.a;
            long j3 = ((rn4) ux2Var2.j(h72Var)).a.a;
            long j4 = rv0.h;
            int i4 = i3;
            boolean z2 = false;
            k06 k06VarZ = xs1.z(j2, j3, j4, j4, ux2Var2);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var2, 0);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            cs4 cs4Var = cs4.b;
            fs4 fs4VarS = uf0.s(ux2Var2, cs4Var);
            yz0.c.getClass();
            ux2Var2.a0();
            boolean z3 = ux2Var2.S;
            tg3 tg3Var = LayoutNode.e0;
            if (z3) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            o67.n(kw0VarA, iz0Var4, ux2Var2);
            o67.n(yj5VarL, iz0Var3, ux2Var2);
            o67.n(Integer.valueOf(iHashCode), iz0Var2, ux2Var2);
            o67.l(ux2Var2);
            o67.n(fs4VarS, iz0Var, ux2Var2);
            ux2Var2.W(-1718419723);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                z81 z81Var = (z81) it.next();
                fs4 fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
                boolean z4 = z81Var.b == a91Var ? true : z2;
                pe6 pe6Var = new pe6(3);
                int i5 = i4;
                boolean zF = ((i5 & 7168) == 2048) | ux2Var2.f(z81Var);
                Object objK = ux2Var2.K();
                if (zF || objK == e01.a) {
                    objK = new x8(function1, z81Var, (byte) 28);
                    ux2Var2.g0(objK);
                }
                fs4 fs4VarA = androidx.compose.ui.platform.a.a(ka0.C(g68.A(fs4VarC, z4, pe6Var, (Function0) objK), 24.0f, 16.0f), z81Var.d);
                dg6 dg6VarA = cg6.a(iq8.a, xz2.y, ux2Var2, 48);
                int iHashCode2 = Long.hashCode(ux2Var2.T);
                yj5 yj5VarL2 = ux2Var2.l();
                fs4 fs4VarS2 = uf0.s(ux2Var2, fs4VarA);
                yz0.c.getClass();
                ux2Var2.a0();
                if (ux2Var2.S) {
                    ux2Var2.k(tg3Var);
                } else {
                    ux2Var2.j0();
                }
                o67.n(dg6VarA, iz0Var4, ux2Var2);
                o67.n(yj5VarL2, iz0Var3, ux2Var2);
                o67.n(Integer.valueOf(iHashCode2), iz0Var2, ux2Var2);
                o67.l(ux2Var2);
                o67.n(fs4VarS2, iz0Var, ux2Var2);
                s14 s14Var = new s14(1.0f, true);
                String str = z81Var.a;
                h72 h72Var2 = un4.a;
                iz0 iz0Var5 = iz0Var;
                iz0 iz0Var6 = iz0Var2;
                tg3 tg3Var2 = tg3Var;
                iz0 iz0Var7 = iz0Var4;
                cs4 cs4Var2 = cs4Var;
                qs7.b(str, s14Var, ((rn4) ux2Var2.j(h72Var2)).a.q, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(h72Var2)).b.j, ux2Var, 0, 0, 131064);
                bt1.j(z81Var.b == a91Var, null, false, k06VarZ, ux2Var, 48, 44);
                ux2Var2 = ux2Var;
                ux2Var2.p(true);
                iz0Var4 = iz0Var7;
                iz0Var = iz0Var5;
                iz0Var2 = iz0Var6;
                cs4Var = cs4Var2;
                tg3Var = tg3Var2;
                i4 = i5;
                z2 = false;
            }
            ux2Var2.p(z2);
            ux2Var2.p(true);
            fs4Var2 = cs4Var;
        } else {
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new z8((Object) list, (Object) a91Var, fs4Var2, (Object) function1, i2, (byte) 6);
        }
    }

    public static final void T(int i2, String str, ux2 ux2Var, fs4 fs4Var) {
        str.getClass();
        ux2Var.Y(1714994138);
        int i3 = (ux2Var.f(str) ? 4 : 2) | i2;
        if (ux2Var.N(i3 & 1, (i3 & 19) != 18)) {
            qs7.b(str, fs4Var, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var.j(un4.a)).b.g, ux2Var, i3 & 126, 0, 131068);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new gx0(str, fs4Var, i2, (byte) 0);
        }
    }

    public static final void U(boolean z2, fs4 fs4Var, ux2 ux2Var, int i2) {
        fs4 fs4Var2;
        ot7 ot7Var;
        ux2Var.Y(599761241);
        int i3 = i2 | (ux2Var.g(z2) ? 4 : 2) | 48;
        if (ux2Var.N(i3 & 1, (i3 & 19) != 18)) {
            String strZ = m77.z(R.string.connect_tab_title, ux2Var);
            cs4 cs4Var = cs4.b;
            fs4 fs4VarF = ka0.F(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 0.0f, 0.0f, 0.0f, z2 ? 48.0f : 24.0f, 7);
            if (z2) {
                ux2Var.W(844945446);
                ot7Var = ep1.s(ux2Var).d;
            } else {
                ux2Var.W(844946852);
                ot7Var = ep1.s(ux2Var).h;
            }
            ux2Var.p(false);
            qs7.b(strZ, fs4VarF, ep1.r(ux2Var).q, 0L, null, 0L, new qo7(3), 0L, 0, false, 0, 0, null, ot7Var, ux2Var, 0, 0, 130040);
            fs4Var2 = cs4Var;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new vh(z2, fs4Var2, i2, (byte) 1);
        }
    }

    public static final void V(xx4 xx4Var, es4 es4Var) {
        xx4 xx4VarL = p0(es4Var).L();
        int i2 = xx4VarL.f2559o - 1;
        Object[] objArr = xx4VarL.m;
        if (i2 < objArr.length) {
            while (i2 >= 0) {
                xx4Var.b((es4) ((LayoutNode) objArr[i2]).S.g);
                i2--;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final r04 X(es4 es4Var) {
        if ((es4Var.f737o & 2) != 0) {
            if (es4Var instanceof r04) {
                return (r04) es4Var;
            }
            if (es4Var instanceof vm1) {
                es4 es4Var2 = ((vm1) es4Var).B;
                while (es4Var2 != 0) {
                    if (es4Var2 instanceof r04) {
                        return (r04) es4Var2;
                    }
                    es4Var2 = (!(es4Var2 instanceof vm1) || (es4Var2.f737o & 2) == 0) ? es4Var2.r : ((vm1) es4Var2).B;
                }
            }
        }
        return null;
    }

    public static final ml8 Y(Activity activity, ux2 ux2Var) {
        gl8 gl8Var;
        ux2Var.j(lh.a);
        in1 in1Var = (in1) ux2Var.j(b11.h);
        el8.a.getClass();
        fl8 fl8Var = dl8.b;
        fl8Var.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            gl8Var = kn1.n;
        } else {
            gl8Var = i2 >= 30 ? qa0.n : z06.L;
        }
        return el5.a(in1Var.r(ds1.l0(gl8Var.h(activity, fl8Var.b).a.c()).c()));
    }

    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
      (r0v0 int) from 0x0007: SWITCH (r0v0 int)
     case -1811142716: goto B:118:0x0130
     case -1811142715: goto B:113:0x0123
     case -1811142714: goto B:108:0x0116
     case -1811142713: goto B:103:0x0109
     case -1811142712: goto B:98:0x00fc
     case -1811142711: goto B:93:0x00ef
     case -1811142710: goto B:88:0x00e2
     case -1811142709: goto B:83:0x00d5
     case -1811142708: goto B:78:0x00c8
     case -1811142707: goto B:73:0x00bb
     default: goto B:5:0x000a A[RegionRef:SW:4]
      (r0v0 int) from 0x000a: SWITCH (r0v0 int)
     case -1811142685: goto B:68:0x00ae
     case -1811142684: goto B:63:0x00a1
     case -1811142683: goto B:58:0x0094
     default: goto B:6:0x000d A[RegionRef:SW:5]
      (r0v0 int) from 0x000d: SWITCH (r0v0 int)
     case 80123371: goto B:53:0x0087
     case 80123372: goto B:48:0x007a
     case 80123373: goto B:43:0x006d
     case 80123374: goto B:38:0x0060
     case 80123375: goto B:33:0x0053
     case 80123376: goto B:28:0x0046
     case 80123377: goto B:23:0x0039
     case 80123378: goto B:18:0x002c
     case 80123379: goto B:13:0x001f
     case 80123380: goto B:8:0x0012
     default: goto B:331:? A[RegionRef:SW:6]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    public static String Z(String str) {
        switch (str) {
            case "kotlin.jvm.internal.DoubleCompanionObject":
                return "kotlin.Double.Companion";
            case "java.lang.Integer":
                return "kotlin.Int";
            case "java.lang.Cloneable":
                return "kotlin.Cloneable";
            case "java.lang.annotation.Annotation":
                return "kotlin.Annotation";
            case "java.lang.Comparable":
                return "kotlin.Comparable";
            case "java.util.Map":
                return "kotlin.collections.Map";
            case "java.util.Set":
                return "kotlin.collections.Set";
            case "double":
                return "kotlin.Double";
            case "kotlin.jvm.internal.ByteCompanionObject":
                return "kotlin.Byte.Companion";
            case "java.lang.CharSequence":
                return "kotlin.CharSequence";
            case "java.util.Collection":
                return "kotlin.collections.Collection";
            case "java.lang.Float":
                return "kotlin.Float";
            case "java.lang.Short":
                return "kotlin.Short";
            case "kotlin.jvm.internal.CharCompanionObject":
                return "kotlin.Char.Companion";
            case "kotlin.jvm.internal.LongCompanionObject":
                return "kotlin.Long.Companion";
            case "java.util.Map$Entry":
                return "kotlin.collections.Map.Entry";
            case "int":
                return "kotlin.Int";
            case "byte":
                return "kotlin.Byte";
            case "char":
                return "kotlin.Char";
            case "long":
                return "kotlin.Long";
            case "boolean":
                return "kotlin.Boolean";
            case "java.util.List":
                return "kotlin.collections.List";
            case "kotlin.jvm.internal.ShortCompanionObject":
                return "kotlin.Short.Companion";
            case "float":
                return "kotlin.Float";
            case "short":
                return "kotlin.Short";
            case "java.lang.Character":
                return "kotlin.Char";
            case "kotlin.jvm.internal.EnumCompanionObject":
                return "kotlin.Enum.Companion";
            case "java.lang.Boolean":
                return "kotlin.Boolean";
            case "java.lang.Byte":
                return "kotlin.Byte";
            case "java.lang.Enum":
                return "kotlin.Enum";
            case "java.lang.Long":
                return "kotlin.Long";
            case "kotlin.jvm.internal.FloatCompanionObject":
                return "kotlin.Float.Companion";
            case "java.util.Iterator":
                return "kotlin.collections.Iterator";
            case "java.util.ListIterator":
                return "kotlin.collections.ListIterator";
            case "kotlin.jvm.internal.StringCompanionObject":
                return "kotlin.String.Companion";
            case "java.lang.Double":
                return "kotlin.Double";
            case "java.lang.Number":
                return "kotlin.Number";
            case "java.lang.Object":
                return "kotlin.Any";
            case "java.lang.String":
                return "kotlin.String";
            case "java.lang.Iterable":
                return "kotlin.collections.Iterable";
            case "kotlin.jvm.internal.BooleanCompanionObject":
                return "kotlin.Boolean.Companion";
            case "java.lang.Throwable":
                return "kotlin.Throwable";
            case "kotlin.jvm.internal.IntCompanionObject":
                return "kotlin.Int.Companion";
            default:
                switch (iHashCode) {
                    case -1811142716:
                        if (str.equals("o.uv2")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("o.vv2")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("o.wv2")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("o.xv2")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("o.yv2")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("o.zv2")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("o.aw2")) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("o.bw2")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("o.cw2")) {
                            return "kotlin.Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("o.dw2")) {
                            return "kotlin.Function19";
                        }
                        return null;
                    default:
                        switch (iHashCode) {
                            case -1811142685:
                                if (str.equals("o.ew2")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("o.fw2")) {
                                    return "kotlin.Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("o.gw2")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (iHashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("o.hw2")) {
                                            return "kotlin.Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("o.iw2")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("o.jw2")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("o.kw2")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("o.lw2")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("o.mw2")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("o.nw2")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("o.ow2")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static final void a0(int i2, int i3) {
        if (i2 <= i3) {
            return;
        }
        hk0.r(fx3.d(i2, i3, "toIndex (", ") is greater than size (", ")."));
    }

    public static final boolean c0(fp6 fp6Var) {
        return !fp6Var.k().m.c(kp6.j);
    }

    public static final boolean d0(fp6 fp6Var) {
        Object objG = fp6Var.d.m.g(kp6.L);
        if (objG == null) {
            objG = null;
        }
        xv7 xv7Var = (xv7) objG;
        jx4 jx4Var = fp6Var.d.m;
        Object objG2 = jx4Var.g(kp6.z);
        if (objG2 == null) {
            objG2 = null;
        }
        pe6 pe6Var = (pe6) objG2;
        boolean z2 = xv7Var != null;
        Object objG3 = jx4Var.g(kp6.K);
        if (((Boolean) (objG3 != null ? objG3 : null)) == null || (pe6Var != null && pe6Var.a == 4)) {
            return z2;
        }
        return true;
    }

    public static final String e0(fp6 fp6Var, Resources resources) {
        ap6 ap6Var = fp6Var.d;
        ap6 ap6Var2 = fp6Var.d;
        Object objG = ap6Var.m.g(kp6.b);
        String string = null;
        if (objG == null) {
            objG = null;
        }
        jx4 jx4Var = ap6Var2.m;
        Object objG2 = jx4Var.g(kp6.L);
        if (objG2 == null) {
            objG2 = null;
        }
        xv7 xv7Var = (xv7) objG2;
        Object objG3 = jx4Var.g(kp6.z);
        if (objG3 == null) {
            objG3 = null;
        }
        pe6 pe6Var = (pe6) objG3;
        if (xv7Var != null) {
            int iOrdinal = xv7Var.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        gk0.s();
                        return null;
                    }
                    if (objG == null) {
                        objG = resources.getString(R.string.indeterminate);
                    }
                } else if (pe6Var != null && pe6Var.a == 2 && objG == null) {
                    objG = resources.getString(R.string.state_off);
                }
            } else if (pe6Var != null && pe6Var.a == 2 && objG == null) {
                objG = resources.getString(R.string.state_on);
            }
        }
        Object objG4 = jx4Var.g(kp6.K);
        if (objG4 == null) {
            objG4 = null;
        }
        Boolean bool = (Boolean) objG4;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((pe6Var == null || pe6Var.a != 4) && objG == null) {
                objG = zBooleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        Object objG5 = jx4Var.g(kp6.c);
        if (objG5 == null) {
            objG5 = null;
        }
        pt5 pt5Var = (pt5) objG5;
        if (pt5Var != null) {
            if (pt5Var != pt5.b) {
                if (objG == null) {
                    objG = resources.getString(R.string.template_percent, 0);
                }
            } else if (objG == null) {
                objG = resources.getString(R.string.in_progress);
            }
        }
        np6 np6Var = kp6.G;
        if (jx4Var.c(np6Var)) {
            jx4 jx4Var2 = new fp6(fp6Var.a, true, fp6Var.c, ap6Var2).k().m;
            Object objG6 = jx4Var2.g(kp6.a);
            if (objG6 == null) {
                objG6 = null;
            }
            Collection collection = (Collection) objG6;
            if (collection == null || collection.isEmpty()) {
                Object objG7 = jx4Var2.g(kp6.C);
                if (objG7 == null) {
                    objG7 = null;
                }
                Collection collection2 = (Collection) objG7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object objG8 = jx4Var2.g(np6Var);
                    if (objG8 == null) {
                        objG8 = null;
                    }
                    CharSequence charSequence = (CharSequence) objG8;
                    if (charSequence == null || charSequence.length() == 0) {
                        string = resources.getString(R.string.state_empty);
                    }
                }
            }
            objG = string;
        }
        return (String) objG;
    }

    public static final xo f0(fp6 fp6Var) {
        Object objG = fp6Var.d.m.g(kp6.G);
        if (objG == null) {
            objG = null;
        }
        xo xoVar = (xo) objG;
        Object objG2 = fp6Var.d.m.g(kp6.C);
        if (objG2 == null) {
            objG2 = null;
        }
        List list = (List) objG2;
        return xoVar == null ? list != null ? (xo) lv0.o0(list) : null : xoVar;
    }

    public static u7 g0() {
        u7 u7Var = u7.h;
        if (u7Var != null) {
            return u7Var;
        }
        u7 u7Var2 = new u7();
        u7.h = u7Var2;
        return u7Var2;
    }

    public static final boolean h0(fp6 fp6Var, Resources resources) {
        if (db8.Q(fp6Var)) {
            return false;
        }
        ap6 ap6Var = fp6Var.d;
        if (ap6Var.f346o) {
            return true;
        }
        Object objG = ap6Var.m.g(kp6.a);
        if (objG == null) {
            objG = null;
        }
        List list = (List) objG;
        return !((list != null ? (String) lv0.o0(list) : null) == null && f0(fp6Var) == null && e0(fp6Var, resources) == null && !d0(fp6Var)) && i0(fp6Var);
    }

    public static final boolean i0(fp6 fp6Var) {
        if (!fp6Var.n()) {
            List listI = fp6Var.i((4 & 1) != 0 ? !fp6Var.b : false, (4 & 2) == 0);
            int size = listI.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (xs1.Q((fp6) listI.get(i2))) {
                }
            }
            LayoutNode layoutNodeF = fp6Var.c.F();
            while (true) {
                if (layoutNodeF == null) {
                    layoutNodeF = null;
                    break;
                }
                ap6 ap6VarH = layoutNodeF.H();
                if (ap6VarH != null && ap6VarH.f346o) {
                    break;
                }
                layoutNodeF = layoutNodeF.F();
            }
            return !(layoutNodeF != null);
        }
        return false;
    }

    public static final fs4 j0(fs4 fs4Var, iw2 iw2Var) {
        return fs4Var.f(new k04(iw2Var));
    }

    public static void k0(int i2, int i3, int[] iArr) {
        int i4 = ((i2 << 8) + i3) - 1;
        int i5 = i4 / 1600;
        iArr[0] = i5;
        int i6 = i4 - (i5 * 1600);
        int i7 = i6 / 40;
        iArr[1] = i7;
        iArr[2] = i6 - (i7 * 40);
    }

    public static final es4 l0(xx4 xx4Var) {
        int i2;
        if (xx4Var == null || (i2 = xx4Var.f2559o) == 0) {
            return null;
        }
        return (es4) xx4Var.k(i2 - 1);
    }

    public static final void m0(um1 um1Var) {
        yf autofillManager;
        LayoutNode layoutNodeP0 = p0(um1Var);
        if (layoutNodeP0.G || (autofillManager = ((AndroidComposeView) e14.a(layoutNodeP0)).getAutofillManager()) == null) {
            return;
        }
        Rect rect = autofillManager.r;
        x56 x56Var = autofillManager.p;
        LayoutNode layoutNode = (LayoutNode) x56Var.a.b(layoutNodeP0.n);
        if (layoutNode == null || layoutNode.s == -4) {
            return;
        }
        ae aeVar = x56Var.c;
        int iD = x56Var.d(layoutNode);
        long[] jArr = (long[]) aeVar.c;
        long j2 = jArr[iD];
        long j3 = jArr[iD + 1];
        rect.set((int) (j2 >> 32), (int) j2, (int) (j3 >> 32), (int) j3);
        autofillManager.m.C0().requestAutofill(autofillManager.f2603o, layoutNodeP0.n, rect);
    }

    public static final e45 n0(um1 um1Var, int i2) {
        e45 e45Var = um1Var.f0().t;
        e45Var.getClass();
        if (e45Var.a1() != um1Var || !k45.g(i2)) {
            return e45Var;
        }
        e45 e45Var2 = e45Var.J;
        e45Var2.getClass();
        return e45Var2;
    }

    public static final e45 o0(um1 um1Var) {
        if (!um1Var.f0().z) {
            ki3.c("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        e45 e45VarN0 = n0(um1Var, 2);
        if (!e45VarN0.a1().z) {
            ki3.c("LayoutCoordinates is not attached.");
        }
        return e45VarN0;
    }

    public static final LayoutNode p0(um1 um1Var) {
        e45 e45Var = um1Var.f0().t;
        if (e45Var != null) {
            return e45Var.G;
        }
        throw ua5.r("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final Owner q0(um1 um1Var) {
        Owner owner = p0(um1Var).A;
        if (owner != null) {
            return owner;
        }
        throw ua5.r("This node does not have an owner.");
    }

    public static int r0(double d2) {
        if (Double.isNaN(d2)) {
            hk0.g("Cannot round NaN value.");
            return 0;
        }
        if (d2 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d2 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d2);
    }

    public static int s0(float f2) {
        if (!Float.isNaN(f2)) {
            return Math.round(f2);
        }
        hk0.g("Cannot round NaN value.");
        return 0;
    }

    public static long t0(double d2) {
        if (!Double.isNaN(d2)) {
            return Math.round(d2);
        }
        hk0.g("Cannot round NaN value.");
        return 0L;
    }

    public static final Object u0(de1 de1Var, hw2 hw2Var) throws Throwable {
        be2 be2VarA;
        de1 de1VarG;
        long jR0;
        ce1 ce1Var = d82.y;
        fe1 fe1Var = (fe1) de1Var.l0(ce1Var);
        ba2 ba2Var = ba2.m;
        if (fe1Var == null) {
            be2VarA = du7.a();
            de1VarG = j51.G(ba2Var, de1Var.H0(be2VarA), true);
            tk1 tk1Var = g22.a;
            if (de1VarG != tk1Var && de1VarG.l0(ce1Var) == null) {
                de1VarG = de1VarG.H0(tk1Var);
            }
        } else {
            be2VarA = (be2) du7.a.get();
            de1VarG = j51.G(ba2Var, de1Var, true);
            tk1 tk1Var2 = g22.a;
            if (de1VarG != tk1Var2 && de1VarG.l0(ce1Var) == null) {
                de1VarG = de1VarG.H0(tk1Var2);
            }
        }
        w70 w70Var = new w70(de1VarG, Thread.currentThread(), be2VarA);
        w70Var.e0(pe1.m, w70Var, hw2Var);
        be2 be2Var = w70Var.q;
        if (be2Var != null) {
            int i2 = be2.r;
            be2Var.Q0(false);
        }
        while (true) {
            if (be2Var != null) {
                try {
                    jR0 = be2Var.R0();
                } catch (Throwable th) {
                    if (be2Var != null) {
                        int i3 = be2.r;
                        be2Var.O0(false);
                    }
                    throw th;
                }
            } else {
                jR0 = Long.MAX_VALUE;
            }
            if (w70Var.L()) {
                break;
            }
            LockSupport.parkNanos(w70Var, jR0);
            if (Thread.interrupted()) {
                w70Var.i(new InterruptedException());
            }
        }
        if (be2Var != null) {
            int i4 = be2.r;
            be2Var.O0(false);
        }
        Object objI = ka0.I(w70Var.E());
        xx0 xx0Var = objI instanceof xx0 ? (xx0) objI : null;
        if (xx0Var == null) {
            return objI;
        }
        throw xx0Var.a;
    }

    public static final fs4 v0(fs4 fs4Var, tk6 tk6Var, gb5 gb5Var, li liVar, boolean z2, ym2 ym2Var, mw4 mw4Var, ia7 ia7Var) {
        gb5 gb5Var2 = gb5.m;
        cs4 cs4Var = cs4.b;
        return fs4Var.f(gb5Var == gb5Var2 ? iq8.j(cs4Var, pr0.d) : iq8.j(cs4Var, pr0.c)).f(new ik6(liVar, ia7Var, ym2Var, mw4Var, gb5Var, tk6Var, z2, false));
    }

    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
      (r0v0 int) from 0x0007: SWITCH (r0v0 int)
     case -1811142716: goto B:118:0x0130
     case -1811142715: goto B:113:0x0123
     case -1811142714: goto B:108:0x0116
     case -1811142713: goto B:103:0x0109
     case -1811142712: goto B:98:0x00fc
     case -1811142711: goto B:93:0x00ef
     case -1811142710: goto B:88:0x00e2
     case -1811142709: goto B:83:0x00d5
     case -1811142708: goto B:78:0x00c8
     case -1811142707: goto B:73:0x00bb
     default: goto B:5:0x000a A[RegionRef:SW:4]
      (r0v0 int) from 0x000a: SWITCH (r0v0 int)
     case -1811142685: goto B:68:0x00ae
     case -1811142684: goto B:63:0x00a1
     case -1811142683: goto B:58:0x0094
     default: goto B:6:0x000d A[RegionRef:SW:5]
      (r0v0 int) from 0x000d: SWITCH (r0v0 int)
     case 80123371: goto B:53:0x0087
     case 80123372: goto B:48:0x007a
     case 80123373: goto B:43:0x006d
     case 80123374: goto B:38:0x0060
     case 80123375: goto B:33:0x0053
     case 80123376: goto B:28:0x0046
     case 80123377: goto B:23:0x0039
     case 80123378: goto B:18:0x002c
     case 80123379: goto B:13:0x001f
     case 80123380: goto B:8:0x0012
     default: goto B:313:? A[RegionRef:SW:6]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    public static String w0(String str) {
        switch (str) {
            case "kotlin.jvm.internal.DoubleCompanionObject":
                return "Companion";
            case "java.lang.Integer":
                return "Int";
            case "java.lang.Cloneable":
                return "Cloneable";
            case "java.lang.annotation.Annotation":
                return "Annotation";
            case "java.lang.Comparable":
                return "Comparable";
            case "java.util.Map":
                return "Map";
            case "java.util.Set":
                return "Set";
            case "double":
                return "Double";
            case "kotlin.jvm.internal.ByteCompanionObject":
                return "Companion";
            case "java.lang.CharSequence":
                return "CharSequence";
            case "java.util.Collection":
                return "Collection";
            case "java.lang.Float":
                return "Float";
            case "java.lang.Short":
                return "Short";
            case "kotlin.jvm.internal.CharCompanionObject":
                return "Companion";
            case "kotlin.jvm.internal.LongCompanionObject":
                return "Companion";
            case "java.util.Map$Entry":
                return "Entry";
            case "int":
                return "Int";
            case "byte":
                return "Byte";
            case "char":
                return "Char";
            case "long":
                return "Long";
            case "boolean":
                return "Boolean";
            case "java.util.List":
                return "List";
            case "kotlin.jvm.internal.ShortCompanionObject":
                return "Companion";
            case "float":
                return "Float";
            case "short":
                return "Short";
            case "java.lang.Character":
                return "Char";
            case "kotlin.jvm.internal.EnumCompanionObject":
                return "Companion";
            case "java.lang.Boolean":
                return "Boolean";
            case "java.lang.Byte":
                return "Byte";
            case "java.lang.Enum":
                return "Enum";
            case "java.lang.Long":
                return "Long";
            case "kotlin.jvm.internal.FloatCompanionObject":
                return "Companion";
            case "java.util.Iterator":
                return "Iterator";
            case "java.util.ListIterator":
                return "ListIterator";
            case "kotlin.jvm.internal.StringCompanionObject":
                return "Companion";
            case "java.lang.Double":
                return "Double";
            case "java.lang.Number":
                return "Number";
            case "java.lang.Object":
                return "Any";
            case "java.lang.String":
                return "String";
            case "java.lang.Iterable":
                return "Iterable";
            case "kotlin.jvm.internal.BooleanCompanionObject":
                return "Companion";
            case "java.lang.Throwable":
                return "Throwable";
            case "kotlin.jvm.internal.IntCompanionObject":
                return "Companion";
            default:
                switch (iHashCode) {
                    case -1811142716:
                        if (str.equals("o.uv2")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("o.vv2")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("o.wv2")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("o.xv2")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("o.yv2")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("o.zv2")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("o.aw2")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("o.bw2")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("o.cw2")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("o.dw2")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (iHashCode) {
                            case -1811142685:
                                if (str.equals("o.ew2")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("o.fw2")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("o.gw2")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (iHashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("o.hw2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("o.iw2")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("o.jw2")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("o.kw2")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("o.lw2")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("o.mw2")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("o.nw2")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("o.ow2")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static final mb2 x0(u18 u18Var, Function1 function1, Object obj, ux2 ux2Var) {
        ux2Var.U(-422486566, u18Var);
        boolean zG = u18Var.g();
        g2 g2Var = u18Var.a;
        mb2 mb2Var = mb2.f1456o;
        mb2 mb2Var2 = mb2.n;
        mb2 mb2Var3 = mb2.m;
        if (zG) {
            ux2Var.W(-212166497);
            ux2Var.p(false);
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                mb2Var = mb2Var2;
            } else if (!((Boolean) function1.invoke(g2Var.p0())).booleanValue()) {
                mb2Var = mb2Var3;
            }
        } else {
            ux2Var.W(-211886815);
            Object objK = ux2Var.K();
            if (objK == e01.a) {
                objK = h57.p(Boolean.FALSE);
                ux2Var.g0(objK);
            }
            px4 px4Var = (px4) objK;
            Object value = u18Var.e.getValue();
            if (((Boolean) function1.invoke(g2Var.p0())).booleanValue() || (value != null && ((Boolean) function1.invoke(value)).booleanValue())) {
                px4Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                mb2Var = mb2Var2;
            } else if ((value != null && ((Boolean) function1.invoke(value)).booleanValue()) || !((Boolean) px4Var.getValue()).booleanValue()) {
                mb2Var = mb2Var3;
            }
            ux2Var.p(false);
        }
        ux2Var.p(false);
        return mb2Var;
    }

    public static int y0(int i2, int i3) {
        int i4 = i2 - (((i3 * 149) % 255) + 1);
        return i4 >= 0 ? i4 : i4 + 256;
    }

    public static final int z0(float f2, float[] fArr, int i2) {
        float f3 = f2 >= 0.0f ? f2 : 0.0f;
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (Math.abs(f3 - f2) > 1.05E-6f) {
            f3 = Float.NaN;
        }
        fArr[i2] = f3;
        return !Float.isNaN(f3) ? 1 : 0;
    }

    @Override // o.k01
    public boolean A(fq6 fq6Var, int i2) {
        fq6Var.getClass();
        return b();
    }

    @Override // o.aj1
    public double B() {
        b0();
        throw null;
    }

    public Object C(fq6 fq6Var, int i2, nw3 nw3Var, Object obj) {
        fq6Var.getClass();
        nw3Var.getClass();
        return a(nw3Var);
    }

    public int W(int i2, int i3, j04 j04Var) {
        return Math.round((1.0f - 1.0f) * ((i2 - i3) / 2.0f));
    }

    @Override // o.aj1
    public boolean b() {
        b0();
        throw null;
    }

    public void b0() {
        throw new nq6(w86.a.b(getClass()) + " can't retrieve untyped values");
    }

    @Override // o.aj1
    public char c() {
        b0();
        throw null;
    }

    @Override // o.aj1
    public aj1 d(fq6 fq6Var) {
        fq6Var.getClass();
        return this;
    }

    @Override // o.aj1
    public int e(fq6 fq6Var) {
        fq6Var.getClass();
        b0();
        throw null;
    }

    @Override // o.k01
    public double f(gs5 gs5Var, int i2) {
        return B();
    }

    @Override // o.aj1
    public abstract int g();

    public void i(fq6 fq6Var) {
        fq6Var.getClass();
    }

    @Override // o.aj1
    public String j() {
        b0();
        throw null;
    }

    @Override // o.k01
    public long k(gs5 gs5Var, int i2) {
        return p();
    }

    @Override // o.k01
    public char m(gs5 gs5Var, int i2) {
        return c();
    }

    @Override // o.k01
    public byte n(gs5 gs5Var, int i2) {
        return x();
    }

    @Override // o.k01
    public short o(gs5 gs5Var, int i2) {
        return y();
    }

    @Override // o.aj1
    public abstract long p();

    @Override // o.k01
    public float q(gs5 gs5Var, int i2) {
        return z();
    }

    @Override // o.aj1
    public boolean r() {
        return true;
    }

    @Override // o.k01
    public aj1 s(gs5 gs5Var, int i2) {
        return d(gs5Var.h(i2));
    }

    @Override // o.k01
    public String t(fq6 fq6Var, int i2) {
        fq6Var.getClass();
        return j();
    }

    @Override // o.aj1
    public k01 u(fq6 fq6Var) {
        fq6Var.getClass();
        return this;
    }

    @Override // o.k01
    public Object v(fq6 fq6Var, int i2, nw3 nw3Var, Object obj) {
        fq6Var.getClass();
        nw3Var.getClass();
        if (nw3Var.d().c() || r()) {
            return a(nw3Var);
        }
        return null;
    }

    @Override // o.k01
    public int w(gs5 gs5Var, int i2) {
        return g();
    }

    @Override // o.aj1
    public abstract byte x();

    @Override // o.aj1
    public abstract short y();

    @Override // o.aj1
    public float z() {
        b0();
        throw null;
    }
}
