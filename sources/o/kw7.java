package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class kw7 {
    public static final char[] u;
    public static final int[] v = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final tn0 a;
    public final hg5 b;
    public final o28 c;
    public final int h;
    public final ew7 i;
    public final dw7 j;
    public fw7 k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final gw7 f1311o;
    public String p;
    public int q;
    public cz7 d = cz7.m;
    public sj5 e = null;
    public boolean f = false;
    public final lh7 g = new lh7((byte) 2, false);
    public final zv7 l = new zv7();
    public final bw7 m = new bw7();
    public final aw7 n = new aw7();
    public int r = 0;
    public final int[] s = new int[1];
    public final int[] t = new int[2];

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        u = cArr;
        Arrays.sort(cArr);
    }

    public kw7(o28 o28Var) {
        this.c = o28Var;
        this.h = o28Var instanceof do8 ? 2 : 1;
        ew7 ew7Var = new ew7(2, o28Var);
        this.i = ew7Var;
        this.k = ew7Var;
        this.j = new dw7(3, o28Var);
        gw7 gw7Var = new gw7(6, o28Var);
        gw7Var.m = true;
        this.f1311o = gw7Var;
        this.a = o28Var.b;
        this.b = o28Var.a.n;
    }

    public final void a(cz7 cz7Var) {
        m(cz7Var);
        this.a.e();
    }

    public final void b(String str, Object... objArr) {
        hg5 hg5Var = this.b;
        if (hg5Var.a()) {
            hg5Var.add(new fk3(this.a, String.format("Invalid character reference: ".concat(str), objArr)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:107:0x01be  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:110:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:112:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:121:0x0200  */
    /* JADX WARN: Code duplicated, block: B:122:0x020e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0218  */
    /* JADX WARN: Code duplicated, block: B:125:0x021d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0220  */
    /* JADX WARN: Code duplicated, block: B:128:0x0224  */
    /* JADX WARN: Code duplicated, block: B:130:0x0227  */
    /* JADX WARN: Code duplicated, block: B:132:0x022c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:133:0x022e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:134:0x022f  */
    /* JADX WARN: Code duplicated, block: B:149:0x01aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    /* JADX WARN: Code duplicated, block: B:150:? A[LOOP:4: B:95:0x0198->B:150:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    /* JADX WARN: Code duplicated, block: B:38:0x009e  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:62:0x0100  */
    /* JADX WARN: Code duplicated, block: B:64:0x0113  */
    /* JADX WARN: Code duplicated, block: B:78:0x0163  */
    /* JADX WARN: Code duplicated, block: B:79:0x0168  */
    /* JADX WARN: Code duplicated, block: B:82:0x016c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0176  */
    /* JADX WARN: Code duplicated, block: B:85:0x017b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0186  */
    /* JADX WARN: Code duplicated, block: B:94:0x0192  */
    /* JADX WARN: Code duplicated, block: B:97:0x019e  */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01dc, code lost:
    
        if (r0.x0('=', '-', '_') == false) goto L116;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] c(java.lang.Character r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.kw7.c(java.lang.Character, boolean):int[]");
    }

    public final void d(boolean z) {
        fw7 fw7Var;
        if (z) {
            fw7Var = this.i;
            fw7Var.f();
        } else {
            fw7Var = this.j;
            fw7Var.f();
        }
        this.k = fw7Var;
    }

    public final void e(char c) {
        zv7 zv7Var = this.l;
        zv7Var.d.f(c);
        zv7Var.b = this.r;
        zv7Var.c = this.a.L0();
    }

    public final void f(String str) {
        zv7 zv7Var = this.l;
        zv7Var.d.g(str);
        zv7Var.b = this.r;
        zv7Var.c = this.a.L0();
    }

    public final void g(sj5 sj5Var) {
        if (this.f) {
            throw new fb8("Must be false");
        }
        this.e = sj5Var;
        this.f = true;
        sj5Var.b = this.q;
        tn0 tn0Var = this.a;
        sj5Var.c = tn0Var.L0();
        this.r = tn0Var.L0();
        int i = sj5Var.a;
        if (i == 2) {
            this.p = ((ew7) sj5Var).d.F();
            return;
        }
        if (i == 3) {
            dw7 dw7Var = (dw7) sj5Var;
            if (dw7Var.g != null) {
                Object[] objArr = {dw7Var.m()};
                hg5 hg5Var = this.b;
                if (hg5Var.a()) {
                    hg5Var.add(new fk3(tn0Var, "Attributes incorrectly present on end tag [/%s]", objArr));
                }
            }
        }
    }

    public final void h() {
        g(this.n);
    }

    public final void i() {
        g(this.m);
    }

    public final void j() {
        fw7 fw7Var = this.k;
        if (fw7Var.h.s()) {
            fw7Var.l();
        }
        g(this.k);
    }

    public final void k(cz7 cz7Var) {
        hg5 hg5Var = this.b;
        if (hg5Var.a()) {
            hg5Var.add(new fk3(this.a, "Unexpectedly reached end of file (EOF) in input state [%s]", new Object[]{cz7Var}));
        }
    }

    public final void l(cz7 cz7Var) {
        hg5 hg5Var = this.b;
        if (hg5Var.a()) {
            tn0 tn0Var = this.a;
            hg5Var.add(new fk3(tn0Var, "Unexpected character '%s' in input state [%s]", new Object[]{Character.valueOf(tn0Var.b0()), cz7Var}));
        }
    }

    public final void m(cz7 cz7Var) {
        if (cz7Var == cz7.t) {
            this.q = this.a.L0();
        }
        this.d = cz7Var;
    }
}
