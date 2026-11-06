package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class fm7 {
    public static final long a;

    static {
        aw awVar = c72.n;
        a = lq1.K(200, g72.MILLISECONDS);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0182 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:101:0x0184  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:107:0x01be  */
    /* JADX WARN: Code duplicated, block: B:108:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:111:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:114:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x009e  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00de  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:79:0x0100  */
    /* JADX WARN: Code duplicated, block: B:82:0x012c  */
    /* JADX WARN: Code duplicated, block: B:83:0x012f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0141  */
    /* JADX WARN: Code duplicated, block: B:87:0x0144  */
    /* JADX WARN: Code duplicated, block: B:90:0x014d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x014f  */
    /* JADX WARN: Code duplicated, block: B:97:0x017a  */
    public static final void a(String str, String str2, fs4 fs4Var, dm7 dm7Var, boolean z, Function0 function0, String str3, ux2 ux2Var, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        String str4;
        int i6;
        boolean z3;
        Function0 function1;
        boolean z4;
        String str5;
        j56 j56VarR;
        boolean z5;
        Object objK;
        aw awVar;
        Object objK2;
        px4 px4Var;
        Object objK3;
        px4 px4Var2;
        Object objK4;
        px4 px4Var3;
        Object objK5;
        me1 me1Var;
        px4 px4VarT;
        boolean z6;
        boolean z7;
        boolean z8;
        Object zi3Var;
        aw awVar2;
        px4 px4Var4;
        px4 px4Var5;
        char c;
        boolean z9;
        Object objK6;
        str.getClass();
        str2.getClass();
        ux2Var.Y(-265592933);
        if ((i & 6) == 0) {
            i3 = (ux2Var.f(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ux2Var.f(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ux2Var.f(fs4Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ux2Var.f(dm7Var) ? 2048 : 1024;
        }
        int i7 = i2 & 16;
        if (i7 == 0) {
            if ((i & 24576) == 0) {
                z2 = z;
                i3 |= ux2Var.g(z2) ? 16384 : 8192;
            }
            i4 = 196608 | i3;
            i5 = i2 & 64;
            if (i5 != 0) {
                if ((1572864 & i) == 0) {
                    str4 = str3;
                    if (ux2Var.f(str4)) {
                        i6 = 1048576;
                    } else {
                        i6 = 524288;
                    }
                    i4 |= i6;
                }
                if ((599187 & i4) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (ux2Var.N(i4 & 1, z3)) {
                    if (i7 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    objK = ux2Var.K();
                    awVar = e01.a;
                    if (objK == awVar) {
                        objK = new jv6((byte) 19);
                        ux2Var.g0(objK);
                    }
                    Function0 function2 = (Function0) objK;
                    if (i5 != 0) {
                        str4 = "";
                    }
                    objK2 = ux2Var.K();
                    if (objK2 == awVar) {
                        objK2 = h57.p(Boolean.TRUE);
                        ux2Var.g0(objK2);
                    }
                    px4Var = (px4) objK2;
                    objK3 = ux2Var.K();
                    if (objK3 == awVar) {
                        objK3 = h57.p(Boolean.FALSE);
                        ux2Var.g0(objK3);
                    }
                    px4Var2 = (px4) objK3;
                    objK4 = ux2Var.K();
                    if (objK4 == awVar) {
                        objK4 = h57.p(Boolean.FALSE);
                        ux2Var.g0(objK4);
                    }
                    px4Var3 = (px4) objK4;
                    objK5 = ux2Var.K();
                    if (objK5 == awVar) {
                        objK5 = ck3.w(ux2Var);
                        ux2Var.g0(objK5);
                    }
                    me1Var = (me1) objK5;
                    px4VarT = h57.t(function2, ux2Var);
                    fs4 fs4VarA = androidx.compose.ui.platform.a.a(fs4Var, str4 + "-TVWebView");
                    if ((i4 & 7168) == 2048) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    boolean zH = z6 | ux2Var.h(me1Var) | ux2Var.f(px4VarT);
                    if ((i4 & 14) == 4) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z8 = zH | z7;
                    Object objK7 = ux2Var.K();
                    if (!z8 || objK7 == awVar) {
                        awVar2 = awVar;
                        px4Var4 = px4Var3;
                        px4Var5 = px4Var2;
                        c = 16384;
                        zi3Var = new zi3(dm7Var, str, px4Var5, px4Var4, px4Var, me1Var, px4VarT, (byte) 2);
                        ux2Var.g0(zi3Var);
                    } else {
                        zi3Var = objK7;
                        px4Var5 = px4Var2;
                        c = 16384;
                        px4Var4 = px4Var3;
                        awVar2 = awVar;
                    }
                    Function1 function3 = (Function1) zi3Var;
                    z9 = (57344 & i4) == c;
                    objK6 = ux2Var.K();
                    if (z9 || objK6 == awVar2) {
                        objK6 = new mk(z5, px4Var4, px4Var5, px4Var);
                        ux2Var.g0(objK6);
                    }
                    boolean z10 = z5;
                    di1.b(function3, fs4VarA, (Function1) objK6, ux2Var, 0, 0);
                    if (((Boolean) px4Var.getValue()).booleanValue()) {
                        ux2Var.W(-944502180);
                        n37.e(null, ux2Var, 0);
                        ux2Var.p(false);
                    } else if (((Boolean) px4Var5.getValue()).booleanValue()) {
                        ux2Var.W(-944436677);
                        n37.d(((i4 >> 12) & 896) | ((i4 >> 3) & 14), str2, str4, ux2Var, null);
                        ux2Var.p(false);
                    } else {
                        ux2Var.W(-944363641);
                        ux2Var.p(false);
                    }
                    z4 = z10;
                    function1 = function2;
                } else {
                    ux2Var.Q();
                    function1 = function0;
                    z4 = z2;
                }
                str5 = str4;
                j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    j56VarR.d = new li7(str, str2, fs4Var, dm7Var, z4, function1, str5, i, i2);
                }
            }
            i4 = 1769472 | i3;
            str4 = str3;
            if ((599187 & i4) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (ux2Var.N(i4 & 1, z3)) {
                if (i7 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                objK = ux2Var.K();
                awVar = e01.a;
                if (objK == awVar) {
                    objK = new jv6((byte) 19);
                    ux2Var.g0(objK);
                }
                Function0 function4 = (Function0) objK;
                if (i5 != 0) {
                    str4 = "";
                }
                objK2 = ux2Var.K();
                if (objK2 == awVar) {
                    objK2 = h57.p(Boolean.TRUE);
                    ux2Var.g0(objK2);
                }
                px4Var = (px4) objK2;
                objK3 = ux2Var.K();
                if (objK3 == awVar) {
                    objK3 = h57.p(Boolean.FALSE);
                    ux2Var.g0(objK3);
                }
                px4Var2 = (px4) objK3;
                objK4 = ux2Var.K();
                if (objK4 == awVar) {
                    objK4 = h57.p(Boolean.FALSE);
                    ux2Var.g0(objK4);
                }
                px4Var3 = (px4) objK4;
                objK5 = ux2Var.K();
                if (objK5 == awVar) {
                    objK5 = ck3.w(ux2Var);
                    ux2Var.g0(objK5);
                }
                me1Var = (me1) objK5;
                px4VarT = h57.t(function4, ux2Var);
                fs4 fs4VarA2 = androidx.compose.ui.platform.a.a(fs4Var, str4 + "-TVWebView");
                if ((i4 & 7168) == 2048) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean zH2 = z6 | ux2Var.h(me1Var) | ux2Var.f(px4VarT);
                if ((i4 & 14) == 4) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = zH2 | z7;
                Object objK8 = ux2Var.K();
                if (z8) {
                    awVar2 = awVar;
                    px4Var4 = px4Var3;
                    px4Var5 = px4Var2;
                    c = 16384;
                    zi3Var = new zi3(dm7Var, str, px4Var5, px4Var4, px4Var, me1Var, px4VarT, (byte) 2);
                    ux2Var.g0(zi3Var);
                } else {
                    awVar2 = awVar;
                    px4Var4 = px4Var3;
                    px4Var5 = px4Var2;
                    c = 16384;
                    zi3Var = new zi3(dm7Var, str, px4Var5, px4Var4, px4Var, me1Var, px4VarT, (byte) 2);
                    ux2Var.g0(zi3Var);
                }
                Function1 function5 = (Function1) zi3Var;
                if ((57344 & i4) == c) {
                }
                objK6 = ux2Var.K();
                if (z9) {
                    objK6 = new mk(z5, px4Var4, px4Var5, px4Var);
                    ux2Var.g0(objK6);
                } else {
                    objK6 = new mk(z5, px4Var4, px4Var5, px4Var);
                    ux2Var.g0(objK6);
                }
                boolean z11 = z5;
                di1.b(function5, fs4VarA2, (Function1) objK6, ux2Var, 0, 0);
                if (((Boolean) px4Var.getValue()).booleanValue()) {
                    ux2Var.W(-944502180);
                    n37.e(null, ux2Var, 0);
                    ux2Var.p(false);
                } else if (((Boolean) px4Var5.getValue()).booleanValue()) {
                    ux2Var.W(-944436677);
                    n37.d(((i4 >> 12) & 896) | ((i4 >> 3) & 14), str2, str4, ux2Var, null);
                    ux2Var.p(false);
                } else {
                    ux2Var.W(-944363641);
                    ux2Var.p(false);
                }
                z4 = z11;
                function1 = function4;
            } else {
                ux2Var.Q();
                function1 = function0;
                z4 = z2;
            }
            str5 = str4;
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new li7(str, str2, fs4Var, dm7Var, z4, function1, str5, i, i2);
            }
        }
        i3 |= 24576;
        z2 = z;
        i4 = 196608 | i3;
        i5 = i2 & 64;
        if (i5 != 0) {
            if ((1572864 & i) == 0) {
                str4 = str3;
                if (ux2Var.f(str4)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i4 |= i6;
            }
            if ((599187 & i4) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (ux2Var.N(i4 & 1, z3)) {
                if (i7 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                objK = ux2Var.K();
                awVar = e01.a;
                if (objK == awVar) {
                    objK = new jv6((byte) 19);
                    ux2Var.g0(objK);
                }
                Function0 function6 = (Function0) objK;
                if (i5 != 0) {
                    str4 = "";
                }
                objK2 = ux2Var.K();
                if (objK2 == awVar) {
                    objK2 = h57.p(Boolean.TRUE);
                    ux2Var.g0(objK2);
                }
                px4Var = (px4) objK2;
                objK3 = ux2Var.K();
                if (objK3 == awVar) {
                    objK3 = h57.p(Boolean.FALSE);
                    ux2Var.g0(objK3);
                }
                px4Var2 = (px4) objK3;
                objK4 = ux2Var.K();
                if (objK4 == awVar) {
                    objK4 = h57.p(Boolean.FALSE);
                    ux2Var.g0(objK4);
                }
                px4Var3 = (px4) objK4;
                objK5 = ux2Var.K();
                if (objK5 == awVar) {
                    objK5 = ck3.w(ux2Var);
                    ux2Var.g0(objK5);
                }
                me1Var = (me1) objK5;
                px4VarT = h57.t(function6, ux2Var);
                fs4 fs4VarA3 = androidx.compose.ui.platform.a.a(fs4Var, str4 + "-TVWebView");
                if ((i4 & 7168) == 2048) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean zH3 = z6 | ux2Var.h(me1Var) | ux2Var.f(px4VarT);
                if ((i4 & 14) == 4) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = zH3 | z7;
                Object objK9 = ux2Var.K();
                if (z8) {
                    awVar2 = awVar;
                    px4Var4 = px4Var3;
                    px4Var5 = px4Var2;
                    c = 16384;
                    zi3Var = new zi3(dm7Var, str, px4Var5, px4Var4, px4Var, me1Var, px4VarT, (byte) 2);
                    ux2Var.g0(zi3Var);
                } else {
                    awVar2 = awVar;
                    px4Var4 = px4Var3;
                    px4Var5 = px4Var2;
                    c = 16384;
                    zi3Var = new zi3(dm7Var, str, px4Var5, px4Var4, px4Var, me1Var, px4VarT, (byte) 2);
                    ux2Var.g0(zi3Var);
                }
                Function1 function7 = (Function1) zi3Var;
                if ((57344 & i4) == c) {
                }
                objK6 = ux2Var.K();
                if (z9) {
                    objK6 = new mk(z5, px4Var4, px4Var5, px4Var);
                    ux2Var.g0(objK6);
                } else {
                    objK6 = new mk(z5, px4Var4, px4Var5, px4Var);
                    ux2Var.g0(objK6);
                }
                boolean z12 = z5;
                di1.b(function7, fs4VarA3, (Function1) objK6, ux2Var, 0, 0);
                if (((Boolean) px4Var.getValue()).booleanValue()) {
                    ux2Var.W(-944502180);
                    n37.e(null, ux2Var, 0);
                    ux2Var.p(false);
                } else if (((Boolean) px4Var5.getValue()).booleanValue()) {
                    ux2Var.W(-944436677);
                    n37.d(((i4 >> 12) & 896) | ((i4 >> 3) & 14), str2, str4, ux2Var, null);
                    ux2Var.p(false);
                } else {
                    ux2Var.W(-944363641);
                    ux2Var.p(false);
                }
                z4 = z12;
                function1 = function6;
            } else {
                ux2Var.Q();
                function1 = function0;
                z4 = z2;
            }
            str5 = str4;
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new li7(str, str2, fs4Var, dm7Var, z4, function1, str5, i, i2);
            }
        }
        i4 = 1769472 | i3;
        str4 = str3;
        if ((599187 & i4) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (ux2Var.N(i4 & 1, z3)) {
            if (i7 != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            objK = ux2Var.K();
            awVar = e01.a;
            if (objK == awVar) {
                objK = new jv6((byte) 19);
                ux2Var.g0(objK);
            }
            Function0 function8 = (Function0) objK;
            if (i5 != 0) {
                str4 = "";
            }
            objK2 = ux2Var.K();
            if (objK2 == awVar) {
                objK2 = h57.p(Boolean.TRUE);
                ux2Var.g0(objK2);
            }
            px4Var = (px4) objK2;
            objK3 = ux2Var.K();
            if (objK3 == awVar) {
                objK3 = h57.p(Boolean.FALSE);
                ux2Var.g0(objK3);
            }
            px4Var2 = (px4) objK3;
            objK4 = ux2Var.K();
            if (objK4 == awVar) {
                objK4 = h57.p(Boolean.FALSE);
                ux2Var.g0(objK4);
            }
            px4Var3 = (px4) objK4;
            objK5 = ux2Var.K();
            if (objK5 == awVar) {
                objK5 = ck3.w(ux2Var);
                ux2Var.g0(objK5);
            }
            me1Var = (me1) objK5;
            px4VarT = h57.t(function8, ux2Var);
            fs4 fs4VarA4 = androidx.compose.ui.platform.a.a(fs4Var, str4 + "-TVWebView");
            if ((i4 & 7168) == 2048) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean zH4 = z6 | ux2Var.h(me1Var) | ux2Var.f(px4VarT);
            if ((i4 & 14) == 4) {
                z7 = true;
            } else {
                z7 = false;
            }
            z8 = zH4 | z7;
            Object objK10 = ux2Var.K();
            if (z8) {
                awVar2 = awVar;
                px4Var4 = px4Var3;
                px4Var5 = px4Var2;
                c = 16384;
                zi3Var = new zi3(dm7Var, str, px4Var5, px4Var4, px4Var, me1Var, px4VarT, (byte) 2);
                ux2Var.g0(zi3Var);
            } else {
                awVar2 = awVar;
                px4Var4 = px4Var3;
                px4Var5 = px4Var2;
                c = 16384;
                zi3Var = new zi3(dm7Var, str, px4Var5, px4Var4, px4Var, me1Var, px4VarT, (byte) 2);
                ux2Var.g0(zi3Var);
            }
            Function1 function9 = (Function1) zi3Var;
            if ((57344 & i4) == c) {
            }
            objK6 = ux2Var.K();
            if (z9) {
                objK6 = new mk(z5, px4Var4, px4Var5, px4Var);
                ux2Var.g0(objK6);
            } else {
                objK6 = new mk(z5, px4Var4, px4Var5, px4Var);
                ux2Var.g0(objK6);
            }
            boolean z13 = z5;
            di1.b(function9, fs4VarA4, (Function1) objK6, ux2Var, 0, 0);
            if (((Boolean) px4Var.getValue()).booleanValue()) {
                ux2Var.W(-944502180);
                n37.e(null, ux2Var, 0);
                ux2Var.p(false);
            } else if (((Boolean) px4Var5.getValue()).booleanValue()) {
                ux2Var.W(-944436677);
                n37.d(((i4 >> 12) & 896) | ((i4 >> 3) & 14), str2, str4, ux2Var, null);
                ux2Var.p(false);
            } else {
                ux2Var.W(-944363641);
                ux2Var.p(false);
            }
            z4 = z13;
            function1 = function8;
        } else {
            ux2Var.Q();
            function1 = function0;
            z4 = z2;
        }
        str5 = str4;
        j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new li7(str, str2, fs4Var, dm7Var, z4, function1, str5, i, i2);
        }
    }
}
