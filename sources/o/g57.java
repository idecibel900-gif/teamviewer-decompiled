package o;

import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.node.LayoutNode;
import androidx.lifecycle.LifecycleOwner;
import com.teamviewer.teamviewer.market.mobile.R;
import java.text.Bidi;
import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class g57 {
    public static se7 a() {
        return new se7(null);
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:35:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:46:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x007c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:55:0x008f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x009a  */
    /* JADX WARN: Code duplicated, block: B:60:0x009e  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:86:0x010e  */
    /* JADX WARN: Code duplicated, block: B:88:0x011c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0128  */
    /* JADX WARN: Code duplicated, block: B:93:0x0164  */
    /* JADX WARN: Code duplicated, block: B:95:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:98:0x01b7  */
    public static final void b(Function0 function0, fs4 fs4Var, pw6 pw6Var, boolean z, String str, d90 d90Var, yy0 yy0Var, ux2 ux2Var, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        String str2;
        int i5;
        int i6;
        d90 d90Var2;
        int i7;
        yy0 yy0Var2;
        boolean z3;
        pw6 pw6Var2;
        boolean z4;
        String str3;
        d90 d90Var3;
        j56 j56VarR;
        int i8;
        d90 d90Var4;
        pw6 pw6Var3;
        d90 d90Var5;
        zv0 zv0Var;
        ng0 ng0Var;
        d90 d90Var6;
        int i9;
        function0.getClass();
        ux2Var.Y(257968344);
        if ((i & 6) == 0) {
            i3 = (ux2Var.h(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ux2Var.f(fs4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= 128;
        }
        int i10 = i2 & 8;
        if (i10 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i3 |= ux2Var.g(z2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    str2 = str;
                    if (ux2Var.f(str2)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        d90Var2 = d90Var;
                        if (ux2Var.f(d90Var2)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    if ((1572864 & i) == 0) {
                        yy0Var2 = yy0Var;
                        if (ux2Var.h(yy0Var2)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    } else {
                        yy0Var2 = yy0Var;
                    }
                    if ((599187 & i3) != 599186) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (ux2Var.N(i3 & 1, z3)) {
                        ux2Var.S();
                        if ((i & 1) != 0 || ux2Var.x()) {
                            qf6 qf6VarA = sf6.a(8.0f);
                            i8 = i3 & (-897);
                            if (i10 != 0) {
                                z2 = true;
                            }
                            if (i4 != 0) {
                                str2 = "";
                            }
                            if (i6 != 0) {
                                d90Var4 = null;
                            } else {
                                d90Var4 = d90Var2;
                            }
                            pw6Var3 = qf6VarA;
                        } else {
                            ux2Var.Q();
                            i8 = i3 & (-897);
                            pw6Var3 = pw6Var;
                            str2 = str2;
                            d90Var4 = d90Var2;
                        }
                        ux2Var.q();
                        if (d90Var4 == null) {
                            ux2Var.W(1438762831);
                            d90Var6 = new d90(1.0f, new t57(((tf2) ux2Var.j(vf2.a)).q));
                            if (z2) {
                                ux2Var.W(-1200507154);
                                d90Var6 = og0.e(1, ux2Var, false);
                            } else {
                                ux2Var.W(-1200506266);
                            }
                            ux2Var.p(false);
                            ux2Var.p(false);
                            d90Var5 = d90Var6;
                        } else {
                            ux2Var.W(1439041676);
                            ux2Var.p(false);
                            d90Var5 = d90Var4;
                        }
                        fs4 fs4VarA = androidx.compose.ui.platform.a.a(fs4Var, str2 + "-TVOutlinedButton");
                        pd5 pd5Var = og0.a;
                        h72 h72Var = un4.a;
                        long j = ((rn4) ux2Var.j(h72Var)).a.a;
                        long j2 = rv0.h;
                        zv0Var = ((rn4) ux2Var.j(h72Var)).a;
                        ng0Var = zv0Var.X;
                        if (ng0Var == null) {
                            long j3 = rv0.g;
                            ng0Var = new ng0(j3, bw0.b(zv0Var, iq8.K), j3, rv0.b(iq8.J, bw0.b(zv0Var, iq8.I)));
                            zv0Var.X = ng0Var;
                        }
                        au8.m(function0, fs4VarA, z2, pw6Var3, ng0Var.a(j2, j, j2, j2), d90Var5, null, yy0Var2, ux2Var, (i8 & 14) | ((i8 >> 3) & 896) | ((i8 << 9) & 1879048192));
                        z4 = z2;
                        pw6Var2 = pw6Var3;
                        str3 = str2;
                        d90Var3 = d90Var4;
                    } else {
                        ux2Var.Q();
                        pw6Var2 = pw6Var;
                        z4 = z2;
                        str3 = str2;
                        d90Var3 = d90Var2;
                    }
                    j56VarR = ux2Var.r();
                    if (j56VarR != null) {
                        j56VarR.d = new li7(function0, fs4Var, pw6Var2, z4, str3, d90Var3, yy0Var, i, i2, (byte) 1);
                    }
                }
                i3 |= 196608;
                d90Var2 = d90Var;
                if ((1572864 & i) == 0) {
                    yy0Var2 = yy0Var;
                    if (ux2Var.h(yy0Var2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                } else {
                    yy0Var2 = yy0Var;
                }
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (ux2Var.N(i3 & 1, z3)) {
                    ux2Var.S();
                    if ((i & 1) != 0) {
                        qf6 qf6VarA2 = sf6.a(8.0f);
                        i8 = i3 & (-897);
                        if (i10 != 0) {
                            z2 = true;
                        }
                        if (i4 != 0) {
                            str2 = "";
                        }
                        if (i6 != 0) {
                            d90Var4 = null;
                        } else {
                            d90Var4 = d90Var2;
                        }
                        pw6Var3 = qf6VarA2;
                    } else {
                        qf6 qf6VarA3 = sf6.a(8.0f);
                        i8 = i3 & (-897);
                        if (i10 != 0) {
                            z2 = true;
                        }
                        if (i4 != 0) {
                            str2 = "";
                        }
                        if (i6 != 0) {
                            d90Var4 = null;
                        } else {
                            d90Var4 = d90Var2;
                        }
                        pw6Var3 = qf6VarA3;
                    }
                    ux2Var.q();
                    if (d90Var4 == null) {
                        ux2Var.W(1438762831);
                        d90Var6 = new d90(1.0f, new t57(((tf2) ux2Var.j(vf2.a)).q));
                        if (z2) {
                            ux2Var.W(-1200507154);
                            d90Var6 = og0.e(1, ux2Var, false);
                        } else {
                            ux2Var.W(-1200506266);
                        }
                        ux2Var.p(false);
                        ux2Var.p(false);
                        d90Var5 = d90Var6;
                    } else {
                        ux2Var.W(1439041676);
                        ux2Var.p(false);
                        d90Var5 = d90Var4;
                    }
                    fs4 fs4VarA2 = androidx.compose.ui.platform.a.a(fs4Var, str2 + "-TVOutlinedButton");
                    pd5 pd5Var2 = og0.a;
                    h72 h72Var2 = un4.a;
                    long j4 = ((rn4) ux2Var.j(h72Var2)).a.a;
                    long j5 = rv0.h;
                    zv0Var = ((rn4) ux2Var.j(h72Var2)).a;
                    ng0Var = zv0Var.X;
                    if (ng0Var == null) {
                        long j6 = rv0.g;
                        ng0Var = new ng0(j6, bw0.b(zv0Var, iq8.K), j6, rv0.b(iq8.J, bw0.b(zv0Var, iq8.I)));
                        zv0Var.X = ng0Var;
                    }
                    au8.m(function0, fs4VarA2, z2, pw6Var3, ng0Var.a(j5, j4, j5, j5), d90Var5, null, yy0Var2, ux2Var, (i8 & 14) | ((i8 >> 3) & 896) | ((i8 << 9) & 1879048192));
                    z4 = z2;
                    pw6Var2 = pw6Var3;
                    str3 = str2;
                    d90Var3 = d90Var4;
                } else {
                    ux2Var.Q();
                    pw6Var2 = pw6Var;
                    z4 = z2;
                    str3 = str2;
                    d90Var3 = d90Var2;
                }
                j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    j56VarR.d = new li7(function0, fs4Var, pw6Var2, z4, str3, d90Var3, yy0Var, i, i2, (byte) 1);
                }
            }
            i3 |= 24576;
            str2 = str;
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    d90Var2 = d90Var;
                    if (ux2Var.f(d90Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((1572864 & i) == 0) {
                    yy0Var2 = yy0Var;
                    if (ux2Var.h(yy0Var2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                } else {
                    yy0Var2 = yy0Var;
                }
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (ux2Var.N(i3 & 1, z3)) {
                    ux2Var.S();
                    if ((i & 1) != 0) {
                        qf6 qf6VarA4 = sf6.a(8.0f);
                        i8 = i3 & (-897);
                        if (i10 != 0) {
                            z2 = true;
                        }
                        if (i4 != 0) {
                            str2 = "";
                        }
                        if (i6 != 0) {
                            d90Var4 = null;
                        } else {
                            d90Var4 = d90Var2;
                        }
                        pw6Var3 = qf6VarA4;
                    } else {
                        qf6 qf6VarA5 = sf6.a(8.0f);
                        i8 = i3 & (-897);
                        if (i10 != 0) {
                            z2 = true;
                        }
                        if (i4 != 0) {
                            str2 = "";
                        }
                        if (i6 != 0) {
                            d90Var4 = null;
                        } else {
                            d90Var4 = d90Var2;
                        }
                        pw6Var3 = qf6VarA5;
                    }
                    ux2Var.q();
                    if (d90Var4 == null) {
                        ux2Var.W(1438762831);
                        d90Var6 = new d90(1.0f, new t57(((tf2) ux2Var.j(vf2.a)).q));
                        if (z2) {
                            ux2Var.W(-1200507154);
                            d90Var6 = og0.e(1, ux2Var, false);
                        } else {
                            ux2Var.W(-1200506266);
                        }
                        ux2Var.p(false);
                        ux2Var.p(false);
                        d90Var5 = d90Var6;
                    } else {
                        ux2Var.W(1439041676);
                        ux2Var.p(false);
                        d90Var5 = d90Var4;
                    }
                    fs4 fs4VarA3 = androidx.compose.ui.platform.a.a(fs4Var, str2 + "-TVOutlinedButton");
                    pd5 pd5Var3 = og0.a;
                    h72 h72Var3 = un4.a;
                    long j7 = ((rn4) ux2Var.j(h72Var3)).a.a;
                    long j8 = rv0.h;
                    zv0Var = ((rn4) ux2Var.j(h72Var3)).a;
                    ng0Var = zv0Var.X;
                    if (ng0Var == null) {
                        long j9 = rv0.g;
                        ng0Var = new ng0(j9, bw0.b(zv0Var, iq8.K), j9, rv0.b(iq8.J, bw0.b(zv0Var, iq8.I)));
                        zv0Var.X = ng0Var;
                    }
                    au8.m(function0, fs4VarA3, z2, pw6Var3, ng0Var.a(j8, j7, j8, j8), d90Var5, null, yy0Var2, ux2Var, (i8 & 14) | ((i8 >> 3) & 896) | ((i8 << 9) & 1879048192));
                    z4 = z2;
                    pw6Var2 = pw6Var3;
                    str3 = str2;
                    d90Var3 = d90Var4;
                } else {
                    ux2Var.Q();
                    pw6Var2 = pw6Var;
                    z4 = z2;
                    str3 = str2;
                    d90Var3 = d90Var2;
                }
                j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    j56VarR.d = new li7(function0, fs4Var, pw6Var2, z4, str3, d90Var3, yy0Var, i, i2, (byte) 1);
                }
            }
            i3 |= 196608;
            d90Var2 = d90Var;
            if ((1572864 & i) == 0) {
                yy0Var2 = yy0Var;
                if (ux2Var.h(yy0Var2)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            } else {
                yy0Var2 = yy0Var;
            }
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (ux2Var.N(i3 & 1, z3)) {
                ux2Var.S();
                if ((i & 1) != 0) {
                    qf6 qf6VarA6 = sf6.a(8.0f);
                    i8 = i3 & (-897);
                    if (i10 != 0) {
                        z2 = true;
                    }
                    if (i4 != 0) {
                        str2 = "";
                    }
                    if (i6 != 0) {
                        d90Var4 = null;
                    } else {
                        d90Var4 = d90Var2;
                    }
                    pw6Var3 = qf6VarA6;
                } else {
                    qf6 qf6VarA7 = sf6.a(8.0f);
                    i8 = i3 & (-897);
                    if (i10 != 0) {
                        z2 = true;
                    }
                    if (i4 != 0) {
                        str2 = "";
                    }
                    if (i6 != 0) {
                        d90Var4 = null;
                    } else {
                        d90Var4 = d90Var2;
                    }
                    pw6Var3 = qf6VarA7;
                }
                ux2Var.q();
                if (d90Var4 == null) {
                    ux2Var.W(1438762831);
                    d90Var6 = new d90(1.0f, new t57(((tf2) ux2Var.j(vf2.a)).q));
                    if (z2) {
                        ux2Var.W(-1200507154);
                        d90Var6 = og0.e(1, ux2Var, false);
                    } else {
                        ux2Var.W(-1200506266);
                    }
                    ux2Var.p(false);
                    ux2Var.p(false);
                    d90Var5 = d90Var6;
                } else {
                    ux2Var.W(1439041676);
                    ux2Var.p(false);
                    d90Var5 = d90Var4;
                }
                fs4 fs4VarA4 = androidx.compose.ui.platform.a.a(fs4Var, str2 + "-TVOutlinedButton");
                pd5 pd5Var4 = og0.a;
                h72 h72Var4 = un4.a;
                long j10 = ((rn4) ux2Var.j(h72Var4)).a.a;
                long j11 = rv0.h;
                zv0Var = ((rn4) ux2Var.j(h72Var4)).a;
                ng0Var = zv0Var.X;
                if (ng0Var == null) {
                    long j12 = rv0.g;
                    ng0Var = new ng0(j12, bw0.b(zv0Var, iq8.K), j12, rv0.b(iq8.J, bw0.b(zv0Var, iq8.I)));
                    zv0Var.X = ng0Var;
                }
                au8.m(function0, fs4VarA4, z2, pw6Var3, ng0Var.a(j11, j10, j11, j11), d90Var5, null, yy0Var2, ux2Var, (i8 & 14) | ((i8 >> 3) & 896) | ((i8 << 9) & 1879048192));
                z4 = z2;
                pw6Var2 = pw6Var3;
                str3 = str2;
                d90Var3 = d90Var4;
            } else {
                ux2Var.Q();
                pw6Var2 = pw6Var;
                z4 = z2;
                str3 = str2;
                d90Var3 = d90Var2;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new li7(function0, fs4Var, pw6Var2, z4, str3, d90Var3, yy0Var, i, i2, (byte) 1);
            }
        }
        i3 |= 3072;
        z2 = z;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                str2 = str;
                if (ux2Var.f(str2)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    d90Var2 = d90Var;
                    if (ux2Var.f(d90Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((1572864 & i) == 0) {
                    yy0Var2 = yy0Var;
                    if (ux2Var.h(yy0Var2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                } else {
                    yy0Var2 = yy0Var;
                }
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (ux2Var.N(i3 & 1, z3)) {
                    ux2Var.S();
                    if ((i & 1) != 0) {
                        qf6 qf6VarA8 = sf6.a(8.0f);
                        i8 = i3 & (-897);
                        if (i10 != 0) {
                            z2 = true;
                        }
                        if (i4 != 0) {
                            str2 = "";
                        }
                        if (i6 != 0) {
                            d90Var4 = null;
                        } else {
                            d90Var4 = d90Var2;
                        }
                        pw6Var3 = qf6VarA8;
                    } else {
                        qf6 qf6VarA9 = sf6.a(8.0f);
                        i8 = i3 & (-897);
                        if (i10 != 0) {
                            z2 = true;
                        }
                        if (i4 != 0) {
                            str2 = "";
                        }
                        if (i6 != 0) {
                            d90Var4 = null;
                        } else {
                            d90Var4 = d90Var2;
                        }
                        pw6Var3 = qf6VarA9;
                    }
                    ux2Var.q();
                    if (d90Var4 == null) {
                        ux2Var.W(1438762831);
                        d90Var6 = new d90(1.0f, new t57(((tf2) ux2Var.j(vf2.a)).q));
                        if (z2) {
                            ux2Var.W(-1200507154);
                            d90Var6 = og0.e(1, ux2Var, false);
                        } else {
                            ux2Var.W(-1200506266);
                        }
                        ux2Var.p(false);
                        ux2Var.p(false);
                        d90Var5 = d90Var6;
                    } else {
                        ux2Var.W(1439041676);
                        ux2Var.p(false);
                        d90Var5 = d90Var4;
                    }
                    fs4 fs4VarA5 = androidx.compose.ui.platform.a.a(fs4Var, str2 + "-TVOutlinedButton");
                    pd5 pd5Var5 = og0.a;
                    h72 h72Var5 = un4.a;
                    long j13 = ((rn4) ux2Var.j(h72Var5)).a.a;
                    long j14 = rv0.h;
                    zv0Var = ((rn4) ux2Var.j(h72Var5)).a;
                    ng0Var = zv0Var.X;
                    if (ng0Var == null) {
                        long j15 = rv0.g;
                        ng0Var = new ng0(j15, bw0.b(zv0Var, iq8.K), j15, rv0.b(iq8.J, bw0.b(zv0Var, iq8.I)));
                        zv0Var.X = ng0Var;
                    }
                    au8.m(function0, fs4VarA5, z2, pw6Var3, ng0Var.a(j14, j13, j14, j14), d90Var5, null, yy0Var2, ux2Var, (i8 & 14) | ((i8 >> 3) & 896) | ((i8 << 9) & 1879048192));
                    z4 = z2;
                    pw6Var2 = pw6Var3;
                    str3 = str2;
                    d90Var3 = d90Var4;
                } else {
                    ux2Var.Q();
                    pw6Var2 = pw6Var;
                    z4 = z2;
                    str3 = str2;
                    d90Var3 = d90Var2;
                }
                j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    j56VarR.d = new li7(function0, fs4Var, pw6Var2, z4, str3, d90Var3, yy0Var, i, i2, (byte) 1);
                }
            }
            i3 |= 196608;
            d90Var2 = d90Var;
            if ((1572864 & i) == 0) {
                yy0Var2 = yy0Var;
                if (ux2Var.h(yy0Var2)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            } else {
                yy0Var2 = yy0Var;
            }
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (ux2Var.N(i3 & 1, z3)) {
                ux2Var.S();
                if ((i & 1) != 0) {
                    qf6 qf6VarA10 = sf6.a(8.0f);
                    i8 = i3 & (-897);
                    if (i10 != 0) {
                        z2 = true;
                    }
                    if (i4 != 0) {
                        str2 = "";
                    }
                    if (i6 != 0) {
                        d90Var4 = null;
                    } else {
                        d90Var4 = d90Var2;
                    }
                    pw6Var3 = qf6VarA10;
                } else {
                    qf6 qf6VarA11 = sf6.a(8.0f);
                    i8 = i3 & (-897);
                    if (i10 != 0) {
                        z2 = true;
                    }
                    if (i4 != 0) {
                        str2 = "";
                    }
                    if (i6 != 0) {
                        d90Var4 = null;
                    } else {
                        d90Var4 = d90Var2;
                    }
                    pw6Var3 = qf6VarA11;
                }
                ux2Var.q();
                if (d90Var4 == null) {
                    ux2Var.W(1438762831);
                    d90Var6 = new d90(1.0f, new t57(((tf2) ux2Var.j(vf2.a)).q));
                    if (z2) {
                        ux2Var.W(-1200507154);
                        d90Var6 = og0.e(1, ux2Var, false);
                    } else {
                        ux2Var.W(-1200506266);
                    }
                    ux2Var.p(false);
                    ux2Var.p(false);
                    d90Var5 = d90Var6;
                } else {
                    ux2Var.W(1439041676);
                    ux2Var.p(false);
                    d90Var5 = d90Var4;
                }
                fs4 fs4VarA6 = androidx.compose.ui.platform.a.a(fs4Var, str2 + "-TVOutlinedButton");
                pd5 pd5Var6 = og0.a;
                h72 h72Var6 = un4.a;
                long j16 = ((rn4) ux2Var.j(h72Var6)).a.a;
                long j17 = rv0.h;
                zv0Var = ((rn4) ux2Var.j(h72Var6)).a;
                ng0Var = zv0Var.X;
                if (ng0Var == null) {
                    long j18 = rv0.g;
                    ng0Var = new ng0(j18, bw0.b(zv0Var, iq8.K), j18, rv0.b(iq8.J, bw0.b(zv0Var, iq8.I)));
                    zv0Var.X = ng0Var;
                }
                au8.m(function0, fs4VarA6, z2, pw6Var3, ng0Var.a(j17, j16, j17, j17), d90Var5, null, yy0Var2, ux2Var, (i8 & 14) | ((i8 >> 3) & 896) | ((i8 << 9) & 1879048192));
                z4 = z2;
                pw6Var2 = pw6Var3;
                str3 = str2;
                d90Var3 = d90Var4;
            } else {
                ux2Var.Q();
                pw6Var2 = pw6Var;
                z4 = z2;
                str3 = str2;
                d90Var3 = d90Var2;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new li7(function0, fs4Var, pw6Var2, z4, str3, d90Var3, yy0Var, i, i2, (byte) 1);
            }
        }
        i3 |= 24576;
        str2 = str;
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                d90Var2 = d90Var;
                if (ux2Var.f(d90Var2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((1572864 & i) == 0) {
                yy0Var2 = yy0Var;
                if (ux2Var.h(yy0Var2)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            } else {
                yy0Var2 = yy0Var;
            }
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (ux2Var.N(i3 & 1, z3)) {
                ux2Var.S();
                if ((i & 1) != 0) {
                    qf6 qf6VarA12 = sf6.a(8.0f);
                    i8 = i3 & (-897);
                    if (i10 != 0) {
                        z2 = true;
                    }
                    if (i4 != 0) {
                        str2 = "";
                    }
                    if (i6 != 0) {
                        d90Var4 = null;
                    } else {
                        d90Var4 = d90Var2;
                    }
                    pw6Var3 = qf6VarA12;
                } else {
                    qf6 qf6VarA13 = sf6.a(8.0f);
                    i8 = i3 & (-897);
                    if (i10 != 0) {
                        z2 = true;
                    }
                    if (i4 != 0) {
                        str2 = "";
                    }
                    if (i6 != 0) {
                        d90Var4 = null;
                    } else {
                        d90Var4 = d90Var2;
                    }
                    pw6Var3 = qf6VarA13;
                }
                ux2Var.q();
                if (d90Var4 == null) {
                    ux2Var.W(1438762831);
                    d90Var6 = new d90(1.0f, new t57(((tf2) ux2Var.j(vf2.a)).q));
                    if (z2) {
                        ux2Var.W(-1200507154);
                        d90Var6 = og0.e(1, ux2Var, false);
                    } else {
                        ux2Var.W(-1200506266);
                    }
                    ux2Var.p(false);
                    ux2Var.p(false);
                    d90Var5 = d90Var6;
                } else {
                    ux2Var.W(1439041676);
                    ux2Var.p(false);
                    d90Var5 = d90Var4;
                }
                fs4 fs4VarA7 = androidx.compose.ui.platform.a.a(fs4Var, str2 + "-TVOutlinedButton");
                pd5 pd5Var7 = og0.a;
                h72 h72Var7 = un4.a;
                long j19 = ((rn4) ux2Var.j(h72Var7)).a.a;
                long j110 = rv0.h;
                zv0Var = ((rn4) ux2Var.j(h72Var7)).a;
                ng0Var = zv0Var.X;
                if (ng0Var == null) {
                    long j111 = rv0.g;
                    ng0Var = new ng0(j111, bw0.b(zv0Var, iq8.K), j111, rv0.b(iq8.J, bw0.b(zv0Var, iq8.I)));
                    zv0Var.X = ng0Var;
                }
                au8.m(function0, fs4VarA7, z2, pw6Var3, ng0Var.a(j110, j19, j110, j110), d90Var5, null, yy0Var2, ux2Var, (i8 & 14) | ((i8 >> 3) & 896) | ((i8 << 9) & 1879048192));
                z4 = z2;
                pw6Var2 = pw6Var3;
                str3 = str2;
                d90Var3 = d90Var4;
            } else {
                ux2Var.Q();
                pw6Var2 = pw6Var;
                z4 = z2;
                str3 = str2;
                d90Var3 = d90Var2;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new li7(function0, fs4Var, pw6Var2, z4, str3, d90Var3, yy0Var, i, i2, (byte) 1);
            }
        }
        i3 |= 196608;
        d90Var2 = d90Var;
        if ((1572864 & i) == 0) {
            yy0Var2 = yy0Var;
            if (ux2Var.h(yy0Var2)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i3 |= i9;
        } else {
            yy0Var2 = yy0Var;
        }
        if ((599187 & i3) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (ux2Var.N(i3 & 1, z3)) {
            ux2Var.S();
            if ((i & 1) != 0) {
                qf6 qf6VarA14 = sf6.a(8.0f);
                i8 = i3 & (-897);
                if (i10 != 0) {
                    z2 = true;
                }
                if (i4 != 0) {
                    str2 = "";
                }
                if (i6 != 0) {
                    d90Var4 = null;
                } else {
                    d90Var4 = d90Var2;
                }
                pw6Var3 = qf6VarA14;
            } else {
                qf6 qf6VarA15 = sf6.a(8.0f);
                i8 = i3 & (-897);
                if (i10 != 0) {
                    z2 = true;
                }
                if (i4 != 0) {
                    str2 = "";
                }
                if (i6 != 0) {
                    d90Var4 = null;
                } else {
                    d90Var4 = d90Var2;
                }
                pw6Var3 = qf6VarA15;
            }
            ux2Var.q();
            if (d90Var4 == null) {
                ux2Var.W(1438762831);
                d90Var6 = new d90(1.0f, new t57(((tf2) ux2Var.j(vf2.a)).q));
                if (z2) {
                    ux2Var.W(-1200507154);
                    d90Var6 = og0.e(1, ux2Var, false);
                } else {
                    ux2Var.W(-1200506266);
                }
                ux2Var.p(false);
                ux2Var.p(false);
                d90Var5 = d90Var6;
            } else {
                ux2Var.W(1439041676);
                ux2Var.p(false);
                d90Var5 = d90Var4;
            }
            fs4 fs4VarA8 = androidx.compose.ui.platform.a.a(fs4Var, str2 + "-TVOutlinedButton");
            pd5 pd5Var8 = og0.a;
            h72 h72Var8 = un4.a;
            long j112 = ((rn4) ux2Var.j(h72Var8)).a.a;
            long j113 = rv0.h;
            zv0Var = ((rn4) ux2Var.j(h72Var8)).a;
            ng0Var = zv0Var.X;
            if (ng0Var == null) {
                long j114 = rv0.g;
                ng0Var = new ng0(j114, bw0.b(zv0Var, iq8.K), j114, rv0.b(iq8.J, bw0.b(zv0Var, iq8.I)));
                zv0Var.X = ng0Var;
            }
            au8.m(function0, fs4VarA8, z2, pw6Var3, ng0Var.a(j113, j112, j113, j113), d90Var5, null, yy0Var2, ux2Var, (i8 & 14) | ((i8 >> 3) & 896) | ((i8 << 9) & 1879048192));
            z4 = z2;
            pw6Var2 = pw6Var3;
            str3 = str2;
            d90Var3 = d90Var4;
        } else {
            ux2Var.Q();
            pw6Var2 = pw6Var;
            z4 = z2;
            str3 = str2;
            d90Var3 = d90Var2;
        }
        j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new li7(function0, fs4Var, pw6Var2, z4, str3, d90Var3, yy0Var, i, i2, (byte) 1);
        }
    }

    public static final void c(boolean z, Function1 function1, fs4 fs4Var, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        function1.getClass();
        ux2Var.Y(-1589761323);
        int i2 = i | (ux2Var.g(z) ? 4 : 2) | (ux2Var.h(function1) ? 32 : 16) | 384;
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 << 3;
            cs4 cs4Var = cs4.b;
            l47.d(new sk7(y57.g(R.string.tv_options_EnableUDP), y57.g(R.string.tv_options_EnableUDPDesc), new yk7(R.drawable.globe_information), null, 24), z, function1, cs4Var, "TVTA-settings-udp", m77.z(R.string.tv_options_EnableUDP, ux2Var), ux2Var, (i3 & 896) | (i3 & 112) | 24576 | 3072, 32);
            fs4Var2 = cs4Var;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new lc(z, function1, fs4Var2, i, (byte) 5);
        }
    }

    public static final void d(boolean z, Function0 function0, Function0 function1, String str, fs4 fs4Var, ux2 ux2Var, int i) {
        px4 px4Var;
        ux2 ux2Var2 = ux2Var;
        function0.getClass();
        function1.getClass();
        str.getClass();
        ux2Var2.Y(1127672120);
        byte b = 2;
        int i2 = i | (ux2Var2.g(z) ? 4 : 2) | (ux2Var2.h(function0) ? 32 : 16) | (ux2Var2.h(function1) ? 256 : 128) | (ux2Var2.f(str) ? 2048 : 1024) | (ux2Var2.f(fs4Var) ? 16384 : 8192);
        if (ux2Var2.N(i2 & 1, (i2 & 9363) != 9362)) {
            hk6 hk6VarW = im3.W(ux2Var2);
            Object objK = ux2Var2.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = ck3.w(ux2Var2);
                ux2Var2.g0(objK);
            }
            me1 me1Var = (me1) objK;
            Object objK2 = ux2Var2.K();
            if (objK2 == awVar) {
                objK2 = h57.p(null);
                ux2Var2.g0(objK2);
            }
            px4 px4Var2 = (px4) objK2;
            LifecycleOwner lifecycleOwner = (LifecycleOwner) ux2Var2.j(dd4.a);
            boolean zH = ux2Var2.h(lifecycleOwner);
            Object objK3 = ux2Var2.K();
            if (zH || objK3 == awVar) {
                objK3 = new jh8(lifecycleOwner, px4Var2, b);
                ux2Var2.g0(objK3);
            }
            ck3.e(lifecycleOwner, (Function1) objK3, ux2Var2);
            FillElement fillElement = androidx.compose.foundation.layout.b.c;
            fs4 fs4VarB = ka0.B(fs4Var.f(fillElement), 24.0f);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var2, 0);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4VarB);
            yz0.c.getClass();
            ux2Var2.a0();
            boolean z2 = ux2Var2.S;
            tg3 tg3Var = LayoutNode.e0;
            if (z2) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            iz0 iz0Var = d82.v;
            o67.n(kw0VarA, iz0Var, ux2Var2);
            iz0 iz0Var2 = d82.u;
            o67.n(yj5VarL, iz0Var2, ux2Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            iz0 iz0Var3 = d82.w;
            o67.n(numValueOf, iz0Var3, ux2Var2);
            o67.l(ux2Var2);
            iz0 iz0Var4 = d82.t;
            o67.n(fs4VarS, iz0Var4, ux2Var2);
            dg6 dg6VarA = cg6.a(iq8.h, xz2.y, ux2Var2, 54);
            int iHashCode2 = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL2 = ux2Var2.l();
            fs4 fs4VarS2 = uf0.s(ux2Var2, fillElement);
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            o67.n(dg6VarA, iz0Var, ux2Var2);
            o67.n(yj5VarL2, iz0Var2, ux2Var2);
            e41.r(iHashCode2, ux2Var2, iz0Var3, ux2Var2);
            o67.n(fs4VarS2, iz0Var4, ux2Var2);
            ud5 ud5VarT = lv1.T(R.drawable.type_sign_in, ux2Var2, 0);
            if (1.0f <= 0.0d) {
                ii3.a("invalid weight; must be greater than zero");
            }
            qs1.l(ud5VarT, null, androidx.compose.foundation.layout.b.f(new s14(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, false).f(fillElement), 0.0f, 240.0f, 1), null, null, 0.0f, null, ux2Var2, 56, 120);
            cs4 cs4Var = cs4.b;
            fs4 fs4VarA = eg6.a(ka0.D(o77.t(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), hk6VarW, me1Var), 24.0f, 0.0f, 2), 1.0f);
            kw0 kw0VarA2 = iw0.a(new ew(16.0f, new hk0((byte) 2)), xz2.B, ux2Var2, 54);
            int iHashCode3 = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL3 = ux2Var2.l();
            fs4 fs4VarS3 = uf0.s(ux2Var2, fs4VarA);
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            o67.n(kw0VarA2, iz0Var, ux2Var2);
            o67.n(yj5VarL3, iz0Var2, ux2Var2);
            e41.r(iHashCode3, ux2Var2, iz0Var3, ux2Var2);
            o67.n(fs4VarS3, iz0Var4, ux2Var2);
            h72 h72Var = un4.a;
            qs7.b(str, null, ((rn4) ux2Var2.j(h72Var)).a.s, 0L, null, 0L, new qo7(3), 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(h72Var)).b.j, ux2Var, (i2 >> 9) & 14, 0, 130042);
            ux2Var2 = ux2Var;
            boolean z3 = z && ((hf4) px4Var2.getValue()) == null;
            fs4 fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
            boolean z4 = (i2 & 112) == 32;
            Object objK4 = ux2Var2.K();
            if (z4 || objK4 == awVar) {
                px4Var = px4Var2;
                objK4 = new ot1(function0, px4Var, (byte) 9);
                ux2Var2.g0(objK4);
            } else {
                px4Var = px4Var2;
            }
            px4 px4Var3 = px4Var;
            m77.g((Function0) objK4, fs4VarC, null, z3, null, null, au8.O(-703662601, new kh8(px4Var, (byte) 4), ux2Var2), ux2Var2, 1572912, 52);
            boolean z5 = z && ((hf4) px4Var3.getValue()) == null;
            fs4 fs4VarC2 = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
            boolean z6 = (i2 & 896) == 256;
            Object objK5 = ux2Var2.K();
            if (z6 || objK5 == awVar) {
                objK5 = new ot1(function1, px4Var3, (byte) 10);
                ux2Var2.g0(objK5);
            }
            b((Function0) objK5, fs4VarC2, null, z5, null, null, au8.O(-96505607, new kh8(px4Var3, (byte) 5), ux2Var2), ux2Var2, 1572912, 52);
            ux2Var2.p(true);
            ux2Var2.p(true);
            ux2Var2.p(true);
        } else {
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new k5(z, function0, function1, str, fs4Var, i, (byte) 1);
        }
    }

    public static final fq6 e(fq6 fq6Var, wj5 wj5Var) {
        fq6Var.getClass();
        wj5Var.getClass();
        if (!im3.n(fq6Var.k(), jq6.d)) {
            return fq6Var.m() ? e(fq6Var.h(0), wj5Var) : fq6Var;
        }
        db8.z(fq6Var);
        return fq6Var;
    }

    public static final px4 f(go2 go2Var, Object obj, ux2 ux2Var, int i, int i2) {
        Object obj2 = ba2.m;
        boolean zH = ux2Var.h(obj2) | ux2Var.h(go2Var);
        Object objK = ux2Var.K();
        hc1 hc1Var = null;
        Object obj3 = e01.a;
        if (zH || objK == obj3) {
            objK = new tx(obj2, go2Var, hc1Var, (byte) 8);
            ux2Var.g0(objK);
        }
        hw2 hw2Var = (hw2) objK;
        Object objK2 = ux2Var.K();
        if (objK2 == obj3) {
            objK2 = h57.p(obj);
            ux2Var.g0(objK2);
        }
        px4 px4Var = (px4) objK2;
        boolean zH2 = ux2Var.h(hw2Var);
        Object objK3 = ux2Var.K();
        if (zH2 || objK3 == obj3) {
            objK3 = new e57(hw2Var, px4Var, hc1Var, (byte) 2);
            ux2Var.g0(objK3);
        }
        ck3.h(go2Var, obj2, (hw2) objK3, ux2Var);
        return px4Var;
    }

    public static final px4 g(j97 j97Var, ux2 ux2Var) {
        return f(j97Var, j97Var.getValue(), ux2Var, 0, 0);
    }

    public static StaticLayout h(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        if (i2 < 0) {
            li3.a("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            li3.a("invalid end value");
        }
        if (i3 < 0) {
            li3.a("invalid maxLines value");
        }
        if (i < 0) {
            li3.a("invalid width value");
        }
        if (i4 < 0) {
            li3.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i3);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i4);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(z);
        builderObtain.setBreakStrategy(i6);
        builderObtain.setHyphenationFrequency(i9);
        builderObtain.setIndents(null, null);
        builderObtain.setJustificationMode(i5);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            builderObtain.setUseLineSpacingFromFallbacks(true);
        }
        if (i10 >= 33) {
            c4.r(builderObtain, i7, i8);
        }
        if (i10 >= 35) {
            builderObtain.setUseBoundsForWidth(false);
        }
        return builderObtain.build();
    }

    public static final l28 i(es4 es4Var, Object obj) {
        nf nfVar;
        if (!es4Var.m.z) {
            ki3.c("visitAncestors called on an unattached node");
        }
        es4 es4Var2 = es4Var.m.q;
        LayoutNode layoutNodeP0 = vn4.p0(es4Var);
        while (layoutNodeP0 != null) {
            if ((((es4) layoutNodeP0.S.g).p & 262144) != 0) {
                while (es4Var2 != null) {
                    if ((es4Var2.f737o & 262144) != 0) {
                        es4 es4VarL0 = es4Var2;
                        xx4 xx4Var = null;
                        while (es4VarL0 != null) {
                            if (es4VarL0 instanceof l28) {
                                l28 l28Var = (l28) es4VarL0;
                                if (obj.equals(l28Var.k())) {
                                    return l28Var;
                                }
                            }
                            if ((es4VarL0.f737o & 262144) != 0 && (es4VarL0 instanceof vm1)) {
                                int i = 0;
                                for (es4 es4Var3 = ((vm1) es4VarL0).B; es4Var3 != null; es4Var3 = es4Var3.r) {
                                    if ((es4Var3.f737o & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            es4VarL0 = es4Var3;
                                        } else {
                                            if (xx4Var == null) {
                                                xx4Var = new xx4(new es4[16]);
                                            }
                                            if (es4VarL0 != null) {
                                                xx4Var.b(es4VarL0);
                                                es4VarL0 = null;
                                            }
                                            xx4Var.b(es4Var3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            es4VarL0 = vn4.l0(xx4Var);
                        }
                    }
                    es4Var2 = es4Var2.q;
                }
            }
            layoutNodeP0 = layoutNodeP0.F();
            es4Var2 = (layoutNodeP0 == null || (nfVar = layoutNodeP0.S) == null) ? null : (kn7) nfVar.f;
        }
        return null;
    }

    public static final String j(long j) {
        String strK;
        if (j <= -999500000) {
            strK = e41.k(new StringBuilder(), (j - 500000000) / 1000000000, " s ");
        } else if (j <= -999500) {
            strK = e41.k(new StringBuilder(), (j - 500000) / 1000000, " ms");
        } else if (j <= 0) {
            strK = e41.k(new StringBuilder(), (j - 500) / 1000, " µs");
        } else if (j < 999500) {
            strK = e41.k(new StringBuilder(), (j + 500) / 1000, " µs");
        } else {
            strK = j < 999500000 ? e41.k(new StringBuilder(), (j + 500000) / 1000000, " ms") : e41.k(new StringBuilder(), (j + 500000000) / 1000000000, " s ");
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{strK}, 1));
    }

    public static final float k(int i, int i2, float[] fArr) {
        return fArr[((i - i2) * 2) + 1];
    }

    /* JADX WARN: Code duplicated, block: B:144:0x025e A[EDGE_INSN: B:144:0x025e->B:171:0x02ba BREAK  A[LOOP:5: B:154:0x027a->B:206:0x027a]] */
    /* JADX WARN: Code duplicated, block: B:86:0x01a6  */
    public static final int l(ts7 ts7Var, Layout layout, yc4 yc4Var, int i, RectF rectF, un6 un6Var, t0 t0Var, boolean z) {
        l04[] l04VarArr;
        l04[] l04VarArr2;
        int i2;
        int iD;
        int i3;
        int i4;
        int iC;
        Bidi bidiCreateLineBidi;
        float fA;
        float fA2;
        float fA3;
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i5 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i5];
        Layout layout2 = ts7Var.f;
        int lineStart2 = layout2.getLineStart(i);
        int iE = ts7Var.e(i);
        if (i5 < (iE - lineStart2) * 2) {
            li3.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        c63 c63Var = new c63(ts7Var);
        boolean z2 = false;
        boolean z3 = layout2.getParagraphDirection(i) == 1;
        int i6 = 0;
        while (lineStart2 < iE) {
            boolean zIsRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z3 && !zIsRtlCharAt) {
                fA = c63Var.a(lineStart2, z2, z2, true);
                fA3 = c63Var.a(lineStart2 + 1, true, true, true);
            } else if (z3 && zIsRtlCharAt) {
                fA3 = c63Var.a(lineStart2, false, false, false);
                fA = c63Var.a(lineStart2 + 1, true, true, false);
            } else {
                if (zIsRtlCharAt) {
                    fA2 = c63Var.a(lineStart2, false, false, true);
                    fA = c63Var.a(lineStart2 + 1, true, true, true);
                } else {
                    fA = c63Var.a(lineStart2, false, false, false);
                    fA2 = c63Var.a(lineStart2 + 1, true, true, false);
                }
                fA3 = fA2;
            }
            fArr[i6] = fA;
            fArr[i6 + 1] = fA3;
            i6 += 2;
            lineStart2++;
            z3 = z3;
            z2 = false;
        }
        Layout layout3 = (Layout) yc4Var.m;
        int lineStart3 = layout3.getLineStart(i);
        int lineEnd2 = layout3.getLineEnd(i);
        int iJ = yc4Var.J(lineStart3, false);
        int iK = yc4Var.K(iJ);
        int i7 = lineStart3 - iK;
        int i8 = lineEnd2 - iK;
        Bidi bidiO = yc4Var.o(iJ);
        if (bidiO == null || (bidiCreateLineBidi = bidiO.createLineBidi(i7, i8)) == null) {
            l04VarArr = new l04[]{new l04(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = bidiCreateLineBidi.getRunCount();
            l04VarArr = new l04[runCount];
            int i9 = 0;
            while (i9 < runCount) {
                int i10 = runCount;
                l04VarArr[i9] = new l04(bidiCreateLineBidi.getRunStart(i9) + lineStart3, bidiCreateLineBidi.getRunLimit(i9) + lineStart3, bidiCreateLineBidi.getRunLevel(i9) % 2 == 1);
                i9++;
                runCount = i10;
            }
        }
        wk3 yk3Var = z ? new yk3(0, l04VarArr.length - 1, 1) : new wk3(l04VarArr.length - 1, 0, -1);
        int i11 = yk3Var.m;
        int i12 = yk3Var.n;
        int i13 = yk3Var.f2422o;
        if ((i13 <= 0 || i11 > i12) && (i13 >= 0 || i12 > i11)) {
            return -1;
        }
        while (true) {
            l04 l04Var = l04VarArr[i11];
            boolean z4 = l04Var.c;
            int iA = l04Var.a;
            int iB = l04Var.b;
            float f = z4 ? fArr[((iB - 1) - lineStart) * 2] : fArr[(iA - lineStart) * 2];
            float fK = z4 ? k(iA, lineStart, fArr) : k(iB - 1, lineStart, fArr);
            float f2 = rectF.left;
            int i14 = i13;
            if (!z) {
                l04VarArr2 = l04VarArr;
                if (fK < f2) {
                    iB = -1;
                    break;
                }
                float f3 = rectF.right;
                if (f <= f3) {
                    if ((z4 || f3 < fK) && (!z4 || f2 > f)) {
                        int i15 = iB;
                        int i16 = iA;
                        while (i15 - i16 > 1) {
                            int i17 = (i15 + i16) / 2;
                            float f4 = fArr[(i17 - lineStart) * 2];
                            int i18 = i15;
                            if ((z4 || f4 <= rectF.right) && (!z4 || f4 >= rectF.left)) {
                                i15 = i18;
                                i16 = i17;
                            } else {
                                i15 = i17;
                            }
                        }
                        i2 = z4 ? i15 : i16;
                    } else {
                        i2 = iB - 1;
                    }
                    int iC2 = un6Var.c(i2 + 1);
                    if (iC2 == -1 || (iD = un6Var.d(iC2)) <= iA) {
                        iB = -1;
                        break;
                    }
                    if (iC2 < iA) {
                        iC2 = iA;
                    }
                    if (iD <= iB) {
                        iB = iD;
                    }
                    RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                    int iC3 = iC2;
                    while (true) {
                        rectF2.left = z4 ? fArr[((iB - 1) - lineStart) * 2] : fArr[(iC3 - lineStart) * 2];
                        rectF2.right = z4 ? k(iC3, lineStart, fArr) : k(iB - 1, lineStart, fArr);
                        if (((Boolean) t0Var.invoke(rectF2, rectF)).booleanValue()) {
                            break;
                        }
                        iB = un6Var.b(iB);
                        if (iB == -1 || iB <= iA) {
                            iB = -1;
                            break;
                        }
                        iC3 = un6Var.c(iB);
                        if (iC3 < iA) {
                            iC3 = iA;
                        }
                    }
                } else {
                    iB = -1;
                    break;
                }
                iA = iB;
            } else {
                if (fK < f2) {
                    l04VarArr2 = l04VarArr;
                    iA = -1;
                    break;
                }
                float f5 = rectF.right;
                if (f <= f5) {
                    if ((z4 || f2 > f) && (!z4 || f5 < fK)) {
                        int i19 = iB;
                        int i20 = iA;
                        while (true) {
                            i3 = i19;
                            if (i19 - i20 <= 1) {
                                break;
                            }
                            int i21 = (i3 + i20) / 2;
                            float f6 = fArr[(i21 - lineStart) * 2];
                            if ((z4 || f6 <= rectF.left) && (!z4 || f6 >= rectF.right)) {
                                i19 = i3;
                                i20 = i21;
                            } else {
                                i19 = i21;
                            }
                        }
                        i4 = z4 ? i3 : i20;
                    } else {
                        i4 = iA;
                    }
                    int iD2 = un6Var.d(i4);
                    if (iD2 != -1 && (iC = un6Var.c(iD2)) < iB) {
                        if (iC >= iA) {
                            iA = iC;
                        }
                        if (iD2 > iB) {
                            iD2 = iB;
                        }
                        l04VarArr2 = l04VarArr;
                        RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                        int iD3 = iD2;
                        while (true) {
                            rectF3.left = z4 ? fArr[((iD3 - 1) - lineStart) * 2] : fArr[(iA - lineStart) * 2];
                            rectF3.right = z4 ? k(iA, lineStart, fArr) : k(iD3 - 1, lineStart, fArr);
                            if (((Boolean) t0Var.invoke(rectF3, rectF)).booleanValue()) {
                                break;
                            }
                            iA = un6Var.a(iA);
                            if (iA != -1 && iA < iB) {
                                iD3 = un6Var.d(iA);
                                if (iD3 > iB) {
                                    iD3 = iB;
                                }
                            }
                        }
                    } else {
                        l04VarArr2 = l04VarArr;
                    }
                    iA = -1;
                    break;
                } else {
                    l04VarArr2 = l04VarArr;
                    iA = -1;
                    break;
                }
            }
            if (iA >= 0) {
                return iA;
            }
            if (i11 == i12) {
                return -1;
            }
            i11 += i14;
            i13 = i14;
            l04VarArr = l04VarArr2;
        }
    }

    public static final void m(Logger logger, ao7 ao7Var, go7 go7Var, String str) {
        logger.fine(go7Var.b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + ao7Var.a);
    }

    public static final ih1 n(Function0 function0) {
        return new ih1(new nn6(function0, null), (byte) 2);
    }

    public static final zn8 o(rp3 rp3Var, fq6 fq6Var) {
        fq6Var.getClass();
        it1 it1VarK = fq6Var.k();
        if (it1VarK instanceof eo5) {
            return zn8.POLY_OBJ;
        }
        if (im3.n(it1VarK, lc7.e)) {
            return zn8.LIST;
        }
        if (!im3.n(it1VarK, lc7.f)) {
            return zn8.OBJ;
        }
        fq6 fq6VarE = e(fq6Var.h(0), rp3Var.b);
        it1 it1VarK2 = fq6VarE.k();
        if ((it1VarK2 instanceof is5) || im3.n(it1VarK2, kq6.d)) {
            return zn8.MAP;
        }
        String str = "Value of type '" + fq6VarE.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + fq6VarE.k() + '\'';
        fq6VarE.a();
        throw new rq3(str, "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    public static final void p(um1 um1Var, Object obj, Function1 function1) {
        nf nfVar;
        if (!um1Var.f0().z) {
            ki3.c("visitAncestors called on an unattached node");
        }
        es4 es4Var = um1Var.f0().q;
        LayoutNode layoutNodeP0 = vn4.p0(um1Var);
        while (layoutNodeP0 != null) {
            if ((((es4) layoutNodeP0.S.g).p & 262144) != 0) {
                while (es4Var != null) {
                    if ((es4Var.f737o & 262144) != 0) {
                        ?? L0 = es4Var;
                        ?? xx4Var = 0;
                        while (L0 != 0) {
                            if (L0 instanceof l28) {
                                l28 l28Var = (l28) L0;
                                if (!(obj.equals(l28Var.k()) ? ((Boolean) function1.invoke(l28Var)).booleanValue() : true)) {
                                    return;
                                }
                            } else if ((L0.f737o & 262144) != 0 && (L0 instanceof vm1)) {
                                es4 es4Var2 = ((vm1) L0).B;
                                int i = 0;
                                while (es4Var2 != null) {
                                    if ((es4Var2.f737o & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            L0 = L0;
                                            xx4Var = xx4Var;
                                            xx4Var = xx4Var;
                                            L0 = es4Var2;
                                        } else {
                                            if (xx4Var == 0) {
                                                xx4Var = new xx4(new es4[16]);
                                            }
                                            if (L0 != 0) {
                                                xx4Var.b(L0);
                                                L0 = 0;
                                            }
                                            xx4Var.b(es4Var2);
                                        }
                                    } else {
                                        L0 = L0;
                                        xx4Var = xx4Var;
                                    }
                                    es4Var2 = es4Var2.r;
                                    L0 = L0;
                                    xx4Var = xx4Var;
                                }
                                if (i == 1) {
                                    L0 = L0;
                                    xx4Var = xx4Var;
                                } else {
                                    L0 = L0;
                                    xx4Var = xx4Var;
                                }
                            }
                            L0 = vn4.l0(xx4Var);
                        }
                    }
                    es4Var = es4Var.q;
                }
            }
            layoutNodeP0 = layoutNodeP0.F();
            es4Var = (layoutNodeP0 == null || (nfVar = layoutNodeP0.S) == null) ? null : (kn7) nfVar.f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, o.l28, o.um1] */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public static final void q(l28 l28Var, Function1 function1) {
        nf nfVar;
        es4 es4Var = (es4) l28Var;
        if (!es4Var.m.z) {
            ki3.c("visitAncestors called on an unattached node");
        }
        es4 es4Var2 = es4Var.m.q;
        LayoutNode layoutNodeP0 = vn4.p0(l28Var);
        while (layoutNodeP0 != null) {
            if ((((es4) layoutNodeP0.S.g).p & 262144) != 0) {
                while (es4Var2 != null) {
                    if ((es4Var2.f737o & 262144) != 0) {
                        ?? L0 = es4Var2;
                        ?? xx4Var = 0;
                        while (L0 != 0) {
                            boolean zBooleanValue = true;
                            if (L0 instanceof l28) {
                                l28 l28Var2 = (l28) L0;
                                if (im3.n(l28Var.k(), l28Var2.k()) && l28Var.getClass() == l28Var2.getClass()) {
                                    zBooleanValue = ((Boolean) function1.invoke(l28Var2)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else if ((L0.f737o & 262144) != 0 && (L0 instanceof vm1)) {
                                es4 es4Var3 = ((vm1) L0).B;
                                int i = 0;
                                while (es4Var3 != null) {
                                    if ((es4Var3.f737o & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            L0 = L0;
                                            xx4Var = xx4Var;
                                            xx4Var = xx4Var;
                                            L0 = es4Var3;
                                        } else {
                                            if (xx4Var == 0) {
                                                xx4Var = new xx4(new es4[16]);
                                            }
                                            if (L0 != 0) {
                                                xx4Var.b(L0);
                                                L0 = 0;
                                            }
                                            xx4Var.b(es4Var3);
                                        }
                                    } else {
                                        L0 = L0;
                                        xx4Var = xx4Var;
                                    }
                                    es4Var3 = es4Var3.r;
                                    L0 = L0;
                                    xx4Var = xx4Var;
                                }
                                if (i == 1) {
                                    L0 = L0;
                                    xx4Var = xx4Var;
                                } else {
                                    L0 = L0;
                                    xx4Var = xx4Var;
                                }
                            }
                            L0 = vn4.l0(xx4Var);
                        }
                    }
                    es4Var2 = es4Var2.q;
                }
            }
            layoutNodeP0 = layoutNodeP0.F();
            es4Var2 = (layoutNodeP0 == null || (nfVar = layoutNodeP0.S) == null) ? null : (kn7) nfVar.f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v8 */
    public static final void r(es4 es4Var, String str, Function1 function1) {
        if (!es4Var.m.z) {
            ki3.c("visitSubtreeIf called on an unattached node");
        }
        xx4 xx4Var = new xx4(new es4[16]);
        es4 es4Var2 = es4Var.m;
        es4 es4Var3 = es4Var2.r;
        if (es4Var3 == null) {
            vn4.V(xx4Var, es4Var2);
        } else {
            xx4Var.b(es4Var3);
        }
        while (true) {
            int i = xx4Var.f2559o;
            if (i == 0) {
                return;
            }
            es4 es4Var4 = (es4) xx4Var.k(i - 1);
            if ((es4Var4.p & 262144) != 0) {
                es4 es4Var5 = es4Var4;
                while (true) {
                    if (es4Var5 != null && es4Var5.z) {
                        if ((es4Var5.f737o & 262144) != 0) {
                            ?? L0 = es4Var5;
                            ?? xx4Var2 = 0;
                            while (L0 != 0) {
                                if (L0 instanceof l28) {
                                    l28 l28Var = (l28) L0;
                                    k28 k28Var = str.equals(l28Var.k()) ? (k28) function1.invoke(l28Var) : k28.m;
                                    if (k28Var != k28.f1225o) {
                                        if (k28Var == k28.n) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((L0.f737o & 262144) != 0 && (L0 instanceof vm1)) {
                                    es4 es4Var6 = ((vm1) L0).B;
                                    int i2 = 0;
                                    L0 = L0;
                                    xx4Var2 = xx4Var2;
                                    while (es4Var6 != null) {
                                        if ((es4Var6.f737o & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                xx4Var2 = xx4Var2;
                                                L0 = es4Var6;
                                            } else {
                                                if (xx4Var2 == 0) {
                                                    xx4Var2 = new xx4(new es4[16]);
                                                }
                                                if (L0 != 0) {
                                                    xx4Var2.b(L0);
                                                    L0 = 0;
                                                }
                                                xx4Var2.b(es4Var6);
                                            }
                                        }
                                        es4Var6 = es4Var6.r;
                                        L0 = L0;
                                        xx4Var2 = xx4Var2;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                L0 = vn4.l0(xx4Var2);
                            }
                        }
                        es4Var5 = es4Var5.r;
                    }
                }
            }
            vn4.V(xx4Var, es4Var4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, o.l28] */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void s(l28 l28Var, Function1 function1) {
        es4 es4Var = (es4) l28Var;
        if (!es4Var.m.z) {
            ki3.c("visitSubtreeIf called on an unattached node");
        }
        xx4 xx4Var = new xx4(new es4[16]);
        es4 es4Var2 = es4Var.m;
        es4 es4Var3 = es4Var2.r;
        if (es4Var3 == null) {
            vn4.V(xx4Var, es4Var2);
        } else {
            xx4Var.b(es4Var3);
        }
        while (true) {
            int i = xx4Var.f2559o;
            if (i == 0) {
                return;
            }
            es4 es4Var4 = (es4) xx4Var.k(i - 1);
            if ((es4Var4.p & 262144) != 0) {
                es4 es4Var5 = es4Var4;
                while (true) {
                    if (es4Var5 != null && es4Var5.z) {
                        if ((es4Var5.f737o & 262144) != 0) {
                            ?? L0 = es4Var5;
                            ?? xx4Var2 = 0;
                            while (L0 != 0) {
                                if (L0 instanceof l28) {
                                    l28 l28Var2 = (l28) L0;
                                    k28 k28Var = (im3.n(l28Var.k(), l28Var2.k()) && l28Var.getClass() == l28Var2.getClass()) ? (k28) function1.invoke(l28Var2) : k28.m;
                                    if (k28Var != k28.f1225o) {
                                        if (k28Var == k28.n) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((L0.f737o & 262144) != 0 && (L0 instanceof vm1)) {
                                    es4 es4Var6 = ((vm1) L0).B;
                                    int i2 = 0;
                                    L0 = L0;
                                    xx4Var2 = xx4Var2;
                                    while (es4Var6 != null) {
                                        if ((es4Var6.f737o & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                xx4Var2 = xx4Var2;
                                                L0 = es4Var6;
                                            } else {
                                                if (xx4Var2 == 0) {
                                                    xx4Var2 = new xx4(new es4[16]);
                                                }
                                                if (L0 != 0) {
                                                    xx4Var2.b(L0);
                                                    L0 = 0;
                                                }
                                                xx4Var2.b(es4Var6);
                                            }
                                        }
                                        es4Var6 = es4Var6.r;
                                        L0 = L0;
                                        xx4Var2 = xx4Var2;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                L0 = vn4.l0(xx4Var2);
                            }
                        }
                        es4Var5 = es4Var5.r;
                    }
                }
            }
            vn4.V(xx4Var, es4Var4);
        }
    }

    public static final oe8 t(wt3 wt3Var, we8 we8Var, String str, se8 se8Var, bf1 bf1Var, ux2 ux2Var) {
        bf1Var.getClass();
        ve8 ve8VarO = we8Var.getG0();
        ve8VarO.getClass();
        pn5 pn5Var = new pn5(ve8VarO, se8Var, bf1Var);
        if (str != null) {
            wt3Var.getClass();
            return pn5Var.j(str, wt3Var);
        }
        wt3Var.getClass();
        String strC = wt3Var.c();
        if (strC != null) {
            return pn5Var.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3Var);
        }
        hk0.g("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public static final gv8 u(Object obj, Object obj2) {
        gv8 gv8Var = (gv8) obj;
        gv8 gv8Var2 = (gv8) obj2;
        if (!gv8Var2.isEmpty()) {
            if (!gv8Var.m) {
                if (gv8Var.isEmpty()) {
                    gv8Var = new gv8();
                } else {
                    gv8 gv8Var3 = new gv8(gv8Var);
                    gv8Var3.m = true;
                    gv8Var = gv8Var3;
                }
            }
            gv8Var.b();
            if (!gv8Var2.isEmpty()) {
                gv8Var.putAll(gv8Var2);
            }
        }
        return gv8Var;
    }
}
