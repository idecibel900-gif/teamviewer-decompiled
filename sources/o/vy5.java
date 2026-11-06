package o;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class vy5 implements AutoCloseable {
    public static final char[] p = {'>', '+', '~'};
    public static final String[] q = {"=", "!=", "^=", "$=", "*=", "~="};
    public static final char[] r = {',', ')'};
    public static final Pattern s = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);
    public static final Pattern t = Pattern.compile("([+-])?(\\d+)");
    public final jw7 m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2357o;

    public vy5(String str) {
        db8.l0(str);
        String strTrim = str.trim();
        this.n = strTrim;
        this.m = new jw7(strTrim);
    }

    public static td2 b0(String str) {
        try {
            vy5 vy5Var = new vy5(str);
            try {
                td2 td2VarK0 = vy5Var.k0();
                jw7 jw7Var = vy5Var.m;
                jw7Var.u();
                tn0 tn0Var = jw7Var.m;
                if (!tn0Var.c0()) {
                    throw new xo6("Could not parse query '%s': unexpected token at '%s'", vy5Var.n, tn0Var.Y());
                }
                vy5Var.close();
                return td2VarK0;
            } catch (Throwable th) {
                try {
                    vy5Var.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IllegalArgumentException e) {
            throw new xo6(e.getMessage());
        }
        throw new xo6(e.getMessage());
    }

    public static td2 e(td2 td2Var, td2 td2Var2) {
        if (td2Var == null) {
            return td2Var2;
        }
        if (!(td2Var instanceof ww0)) {
            return new ww0(Arrays.asList(td2Var, td2Var2));
        }
        ww0 ww0Var = (ww0) td2Var;
        ww0Var.a.add(td2Var2);
        ww0Var.g();
        return td2Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0087  */
    /* JADX WARN: Code duplicated, block: B:29:0x008d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0095  */
    /* JADX WARN: Code duplicated, block: B:34:0x009b  */
    public final rd2 F(boolean z, boolean z2) {
        int i;
        int i2;
        String strI = us1.I(q());
        if (!"odd".equals(strI)) {
            if ("even".equals(strI)) {
                i = 0;
            } else {
                Matcher matcher = s.matcher(strI);
                if (matcher.matches()) {
                    if (matcher.group(3) != null) {
                        i2 = Integer.parseInt(matcher.group(1).replaceFirst("^\\+", ""));
                    } else {
                        i2 = "-".equals(matcher.group(2)) ? -1 : 1;
                    }
                    i = matcher.group(4) != null ? Integer.parseInt(matcher.group(4).replaceFirst("^\\+", "")) : 0;
                } else {
                    Matcher matcher2 = t.matcher(strI);
                    if (!matcher2.matches()) {
                        throw new xo6("Could not parse nth-index '%s': unexpected format", strI);
                    }
                    i = Integer.parseInt(matcher2.group().replaceFirst("^\\+", ""));
                    i2 = 0;
                }
            }
            if (z2) {
                return z ? new rd2(i2, i, (byte) 2) : new rd2(i2, i, (byte) 3);
            }
            return z ? new rd2(i2, i, (byte) 1) : new rd2(i2, i, (byte) 0);
        }
        i = 1;
        i2 = 2;
        if (z2) {
            if (z) {
            }
        }
        if (z) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final td2 G(jw7 jw7Var) {
        boolean z;
        Object[] objArr;
        tn0 tn0Var = jw7Var.m;
        StringBuilder sbB = lb7.b();
        loop0: while (true) {
            z = false;
            objArr = 0;
            if (tn0Var.c0()) {
                break;
            }
            for (int i = 0; i < 6; i++) {
                if (tn0Var.K0(q[i])) {
                    break loop0;
                }
            }
            sbB.append(tn0Var.u());
        }
        String strI = us1.I(lb7.k(sbB));
        db8.l0(strI);
        if (strI.equals("abs:")) {
            throw new fb8("Absolute attribute key must have a name");
        }
        jw7Var.u();
        if (tn0Var.c0()) {
            if (strI.startsWith("^")) {
                return new ld2(strI.substring(1), (byte) 1);
            }
            return strI.equals("*") ? new ld2("", (byte) 1) : new ld2(strI, z, objArr == true ? 1 : 0);
        }
        if (jw7Var.F('=')) {
            return new md2(strI, tn0Var.Y(), (byte) 0);
        }
        if (tn0Var.l0("!=")) {
            return new md2(strI, tn0Var.Y(), (byte) 3);
        }
        if (tn0Var.l0("^=")) {
            return new md2(strI, tn0Var.Y(), (byte) 4);
        }
        if (tn0Var.l0("$=")) {
            return new md2(strI, tn0Var.Y(), (byte) 2);
        }
        if (tn0Var.l0("*=")) {
            return new md2(strI, tn0Var.Y(), (byte) 1);
        }
        if (tn0Var.l0("~=")) {
            return new nd2(strI, d96.a(tn0Var.Y()));
        }
        throw new xo6("Could not parse attribute query '%s': unexpected token at '%s'", this.n, tn0Var.Y());
    }

    public final td2 J(boolean z) {
        String str = z ? ":matchesOwn" : ":matches";
        String strQ = q();
        db8.m0(strQ, str.concat("(regex) query must not be empty"));
        d96 d96VarA = d96.a(strQ);
        if (this.f2357o) {
            return new g45(d96VarA);
        }
        return z ? new sd2(d96VarA, (byte) 1) : new sd2(d96VarA, (byte) 0);
    }

    public final td2 Y(boolean z) {
        String str = z ? ":matchesWholeOwnText" : ":matchesWholeText";
        String strQ = q();
        db8.m0(strQ, str.concat("(regex) query must not be empty"));
        d96 d96VarA = d96.a(strQ);
        return z ? new sd2(d96VarA, (byte) 2) : new sd2(d96VarA, (byte) 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [o.td2] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [o.td2] */
    /* JADX WARN: Type inference failed for: r3v4, types: [o.td2] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [o.hc7, o.kc7] */
    /* JADX WARN: Type inference failed for: r3v8, types: [o.td2] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final td2 c0() {
        jw7 jw7Var = this.m;
        jw7Var.u();
        tn0 tn0Var = jw7Var.m;
        char[] cArr = p;
        ?? kd2Var = tn0Var.x0(cArr) ? new kd2((byte) 8) : l0();
        while (true) {
            byte b = 0;
            char cU = jw7Var.u() ? ' ' : (char) 0;
            if (!tn0Var.x0(cArr)) {
                if (!tn0Var.x0(r)) {
                    break;
                }
                break;
            }
            cU = tn0Var.u();
            if (cU == 0) {
                break;
            }
            td2 td2VarL0 = l0();
            if (cU == ' ') {
                kd2Var = e(new fc7(kd2Var, b), td2VarL0);
            } else if (cU == '+') {
                kd2Var = e(new ic7(kd2Var), td2VarL0);
            } else if (cU == '>') {
                kd2Var = kd2Var instanceof hc7 ? (hc7) kd2Var : new hc7(kd2Var);
                kd2Var.d.add(td2VarL0);
                kd2Var.e = td2VarL0.a() + kd2Var.e;
                kd2Var.b |= td2VarL0.f();
            } else {
                if (cU != '~') {
                    throw new xo6("Unknown combinator '%s'", Character.valueOf(cU));
                }
                kd2Var = e(new jc7(kd2Var), td2VarL0);
            }
        }
        return kd2Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.m.close();
    }

    public final int j() {
        String strTrim = q().trim();
        boolean z = false;
        if (strTrim != null && strTrim.length() != 0) {
            int length = strTrim.length();
            for (int i = 0; i < length; i++) {
                if (lb7.g(strTrim.charAt(i))) {
                }
            }
            z = true;
        }
        db8.e0("Index must be numeric", z);
        return Integer.parseInt(strTrim);
    }

    public final td2 k0() {
        td2 td2VarC0 = c0();
        while (this.m.F(',')) {
            td2 td2VarC1 = c0();
            if (td2VarC0 instanceof xw0) {
                xw0 xw0Var = (xw0) td2VarC0;
                xw0Var.a.add(td2VarC1);
                xw0Var.g();
            } else {
                td2VarC0 = new xw0(td2VarC0, td2VarC1);
            }
        }
        return td2VarC0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final td2 l0() {
        td2 ld2Var;
        td2 td2VarE;
        jw7 jw7Var = this.m;
        jw7Var.u();
        tn0 tn0Var = jw7Var.m;
        byte b = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (Character.isLetterOrDigit(tn0Var.b0()) || tn0Var.K0("*|")) {
            StringBuilder sbB = lb7.b();
            while (!tn0Var.c0()) {
                char cB0 = tn0Var.b0();
                if (cB0 != '\\') {
                    if (!Character.isLetterOrDigit(tn0Var.b0()) && !tn0Var.x0(jw7.n)) {
                        break;
                    }
                    sbB.append(cB0);
                    jw7Var.e();
                } else {
                    jw7Var.e();
                    if (tn0Var.c0()) {
                        break;
                    }
                    sbB.append(tn0Var.u());
                }
            }
            String strI = us1.I(lb7.k(sbB));
            db8.l0(strI);
            byte b2 = 9;
            if (strI.startsWith("*|")) {
                String strSubstring = strI.substring(2);
                ld2Var = new xw0(new ld2(strSubstring, objArr4 == true ? 1 : 0, b2), new ld2(":".concat(strSubstring), objArr3 == true ? 1 : 0, (byte) 10));
            } else if (strI.endsWith("|*")) {
                ld2Var = new ld2(strI.substring(0, strI.length() - 2).concat(":"), objArr2 == true ? 1 : 0, (byte) 11);
            } else {
                if (strI.contains("|")) {
                    strI = strI.replace("|", ":");
                }
                ld2Var = new ld2(strI, objArr == true ? 1 : 0, b2);
            }
            td2VarE = ld2Var;
        } else {
            td2VarE = jw7Var.F('*') ? new kd2(b) : null;
        }
        while (true) {
            td2 td2VarO0 = o0();
            if (td2VarO0 == null) {
                break;
            }
            td2VarE = e(td2VarE, td2VarO0);
        }
        if (td2VarE != null) {
            return td2VarE;
        }
        throw new xo6("Could not parse query '%s': unexpected token at '%s'", this.n, tn0Var.Y());
    }

    /* JADX WARN: Code restructure failed: missing block: B:256:?, code lost:
    
        r5 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:?, code lost:
    
        r5 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:?, code lost:
    
        r5 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:?, code lost:
    
        r5 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:?, code lost:
    
        r5 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:?, code lost:
    
        r5 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
    
        r5 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007f, code lost:
    
        if (r0.equals("leafnode") != true) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
    
        r5 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008a, code lost:
    
        if (r0.equals("comment") != true) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008d, code lost:
    
        r5 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
    
        if (r0.equals("cdata") != true) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0098, code lost:
    
        r5 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a0, code lost:
    
        if (r0.equals("text") == false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a9, code lost:
    
        if (r0.equals("node") != true) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ac, code lost:
    
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b4, code lost:
    
        if (r0.equals("data") != true) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b7, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b8, code lost:
    
        switch(r5) {
            case 0: goto L58;
            case 1: goto L57;
            case 2: goto L56;
            case 3: goto L55;
            case 4: goto L54;
            case 5: goto L53;
            default: goto L51;
        };
     */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v0 byte, still in use, count: 4, list:
      (r5v0 byte) from 0x00b8: PHI (r5v12 byte) = 
      (r5v1 byte)
      (r5v2 byte)
      (r5v3 byte)
      (r5v4 byte)
      (r5v0 byte)
      (r5v5 byte)
      (r5v6 byte)
      (r5v7 byte)
      (r5v8 byte)
      (r5v9 byte)
      (r5v10 byte)
      (r5v11 byte)
      (r5v13 byte)
     binds: [B:261:?, B:49:0x00b7, B:260:?, B:45:0x00ac, B:40:0x00a0, B:259:?, B:258:?, B:38:0x0098, B:257:?, B:34:0x008d, B:256:?, B:30:0x0082, B:26:0x0077] A[DONT_GENERATE, DONT_INLINE, REMOVE]
      (r5v0 byte) from 0x0032: CONSTRUCTOR 
      (wrap java.lang.String:0x002e: INVOKE (r15v37 java.lang.String) VIRTUAL call: java.lang.String.trim():java.lang.String A[MD:():java.lang.String (c), WRAPPED])
      (r4v0 boolean)
      (r5v0 byte)
     A[MD:(java.lang.String, boolean, byte):void (m), REMOVE, WRAPPED] call: o.ld2.<init>(java.lang.String, boolean, byte):void type: CONSTRUCTOR
      (r5v0 byte) from 0x0310: CONSTRUCTOR 
      (wrap o.td2:0x030c: INVOKE (r15v18 java.lang.String) STATIC call: o.vy5.b0(java.lang.String):o.td2 A[MD:(java.lang.String):o.td2 (m), WRAPPED])
      (r5v0 byte)
     A[MD:(o.td2, byte):void (m), REMOVE, WRAPPED] call: o.fc7.<init>(o.td2, byte):void type: CONSTRUCTOR
      (r5v0 byte) from 0x0391: CONSTRUCTOR (r5v0 byte) A[MD:(byte):void (m), REMOVE, WRAPPED] call: o.kd2.<init>(byte):void type: CONSTRUCTOR
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
    	at jadx.core.utils.InsnRemover.removeAllMarked(InsnRemover.java:276)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:354)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.td2 o0() {
        /*
            Method dump skipped, instruction units count: 1160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.vy5.o0():o.td2");
    }

    public final String q() {
        return this.m.j('(', ')');
    }

    public final String toString() {
        return this.n;
    }

    public final td2 u(boolean z) {
        String str = z ? ":containsOwn" : ":contains";
        String strG = jw7.G(q());
        db8.m0(strG, str.concat("(text) query must not be empty"));
        if (this.f2357o) {
            return new g45(strG);
        }
        return z ? new ld2(strG, (byte) 4) : new ld2(strG, (byte) 5);
    }

    public final td2 z(boolean z) {
        String str = z ? ":containsWholeOwnText" : ":containsWholeText";
        String strG = jw7.G(q());
        db8.m0(strG, str.concat("(text) query must not be empty"));
        boolean z2 = false;
        return z ? new ld2(strG, z2, (byte) 6) : new ld2(strG, z2, (byte) 7);
    }
}
