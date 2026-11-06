package o;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.teamviewer.market.mobile.R;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class ka0 {
    public static final ax5 b;
    public static final yy0 c;
    public static final yy0 e;
    public static final yy0 f;
    public static final yy0 h;
    public static final yy0 i;
    public static final yy0 k;
    public static final hr2 m;
    public static final hr2 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final hr2 f1243o;
    public static final hr2 p;
    public static final hr2 q;
    public static final hr2 u;
    public static final wj5 y;
    public static final t2 a = new t2(0);
    public static final yy0 d = new yy0(-357588203, false, new p20(21));
    public static final yy0 g = new yy0(772005774, false, new az0(27));
    public static final yy0 j = new yy0(-1065804199, false, new hz0(8));
    public static final Class[] l = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};
    public static final u92 r = new u92(false);
    public static final u92 s = new u92(true);
    public static final ir t = new ir(22);
    public static final ax6 v = ax6.q;
    public static final float w = 8.0f;
    public static final float x = 24.0f;

    static {
        byte b2 = 16;
        b = new ax5(new zq(b2));
        byte b3 = 20;
        c = new yy0(-548914847, false, new p20(b3));
        byte b4 = 11;
        e = new yy0(873111028, false, new az0(b4));
        f = new yy0(2092684975, false, new bz0(b4));
        h = new yy0(-556139673, false, new fz0(b2));
        byte b5 = 17;
        i = new yy0(-301750266, false, new fz0(b5));
        k = new yy0(-1817889139, false, new iz0(b5));
        byte b6 = 14;
        m = new hr2("COMPLETING_ALREADY", b6);
        n = new hr2("COMPLETING_WAITING_CHILDREN", b6);
        f1243o = new hr2("COMPLETING_RETRY", b6);
        p = new hr2("TOO_LATE_TO_CANCEL", b6);
        q = new hr2("SEALED", b6);
        u = new hr2("ResolutionAnchorProvider", b4);
        y = new wj5(b3);
    }

    public static final fs4 A(fs4 fs4Var, nd5 nd5Var) {
        return fs4Var.f(new od5(nd5Var, new at4((byte) 22)));
    }

    public static final fs4 B(fs4 fs4Var, float f2) {
        return fs4Var.f(new ld5(f2, f2, f2, f2, new at4((byte) 25)));
    }

    public static final fs4 C(fs4 fs4Var, float f2, float f3) {
        return fs4Var.f(new ld5(f2, f3, f2, f3, new at4((byte) 24)));
    }

    public static fs4 D(fs4 fs4Var, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return C(fs4Var, f2, f3);
    }

    public static final fs4 E(fs4 fs4Var, float f2, float f3, float f4, float f5) {
        return fs4Var.f(new ld5(f2, f3, f4, f5, new at4((byte) 23)));
    }

    public static fs4 F(fs4 fs4Var, float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f5 = 0.0f;
        }
        return E(fs4Var, f2, f3, f4, f5);
    }

    public static final void G(js7 js7Var, j64 j64Var, zr7 zr7Var, bf3 bf3Var, v65 v65Var) {
        wk0 wk0Var = j64Var.d;
        od1 od1Var = j64Var.v;
        od1 od1Var2 = j64Var.w;
        k76 k76Var = new k76();
        xn5 xn5Var = new xn5(wk0Var, od1Var, k76Var);
        vm5 vm5Var = js7Var.a;
        vm5Var.b(zr7Var, bf3Var, xn5Var, od1Var2);
        ns7 ns7Var = new ns7(js7Var, vm5Var);
        js7Var.b.set(ns7Var);
        k76Var.m = ns7Var;
        j64Var.e = ns7Var;
        y(j64Var, zr7Var, v65Var);
    }

    public static final boolean H(Throwable th, Function0 function0) {
        List listAsList;
        Object objInvoke;
        th.getClass();
        Integer num = mn3.a;
        i02 i02Var = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            listAsList = Arrays.asList(suppressed);
            listAsList.getClass();
        } else {
            Method method = ul5.b;
            if (method == null || (objInvoke = method.invoke(th, null)) == null) {
                listAsList = ea2.m;
            } else {
                listAsList = Arrays.asList((Throwable[]) objInvoke);
                listAsList.getClass();
            }
        }
        int size = listAsList.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            if (((Throwable) listAsList.get(i2)) instanceof i02) {
                return false;
            }
        }
        try {
            vz0 vz0Var = (vz0) function0.a();
            if (vz0Var != null) {
                boolean z2 = vz0Var.b;
                List list = vz0Var.a;
                if (z2) {
                    int size2 = list.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((xz0) list.get(i3)).getClass();
                    }
                } else if (!list.isEmpty()) {
                    z = true;
                }
            }
            if (z) {
                vz0Var.getClass();
                i02Var = new i02(vz0Var);
            }
        } catch (Throwable th2) {
            i02Var = th2;
        }
        if (i02Var != null) {
            ct1.q(th, i02Var);
        }
        return z;
    }

    public static final Object I(Object obj) {
        og3 og3Var = obj instanceof og3 ? (og3) obj : null;
        return og3Var != null ? og3Var.a : obj;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:77:0x0134  */
    /* JADX WARN: Code duplicated, block: B:80:0x0141  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:74:0x00cb, please report this as an issue */
    public static final void a(final ga0 ga0Var, boolean z, fs4 fs4Var, jb4 jb4Var, Function0 function0, final String str, ux2 ux2Var, int i2, int i3) {
        int i4;
        fs4 fs4Var2;
        int i5;
        Function0 function1;
        int i6;
        final byte b2;
        final byte b3;
        boolean z2;
        jb4 jb4VarA;
        fs4 fs4Var3;
        Function0 function2;
        j56 j56VarR;
        fs4 fs4Var4;
        fs4 fs4Var5;
        Function0 function3;
        fs4 fs4Var6;
        fs4 fs4VarA;
        int i7;
        ux2Var.Y(-1752757078);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? ux2Var.f(ga0Var) : ux2Var.h(ga0Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ux2Var.g(z) ? 32 : 16;
        }
        int i8 = i3 & 4;
        if (i8 == 0) {
            if ((i2 & 384) == 0) {
                fs4Var2 = fs4Var;
                i4 |= ux2Var.f(fs4Var2) ? 256 : 128;
            }
            if ((i2 & 3072) == 0) {
                i4 |= 1024;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i2 & 24576) == 0) {
                    function1 = function0;
                    if (ux2Var.h(function1)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i4 |= i6;
                }
                if ((196608 & i2) == 0) {
                    if (ux2Var.f(str)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i4 |= i7;
                }
                b2 = 0;
                b3 = 1;
                if ((74899 & i4) != 74898) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (ux2Var.N(i4 & 1, z2)) {
                    ux2Var.S();
                    if ((i2 & 1) != 0 || ux2Var.x()) {
                        if (i8 != 0) {
                            fs4Var4 = cs4.b;
                        } else {
                            fs4Var4 = fs4Var2;
                        }
                        int i9 = kb4.a;
                        jb4VarA = kb4.a(rv0.g, ux2Var);
                        if (i5 != 0) {
                            function1 = null;
                        }
                        fs4Var5 = fs4Var4;
                    } else {
                        ux2Var.Q();
                        jb4VarA = jb4Var;
                        fs4Var5 = fs4Var2;
                    }
                    function3 = function1;
                    ux2Var.q();
                    if (function3 != null) {
                        fs4Var6 = fs4Var5;
                        fs4VarA = androidx.compose.ui.platform.a.a(androidx.compose.foundation.b.b(fs4Var5, false, null, null, function3, 15), str + "-TVListItem");
                    } else {
                        fs4Var6 = fs4Var5;
                        fs4VarA = fs4Var6;
                    }
                    pb4.a(au8.O(-456354040, new hw2() { // from class: o.t4
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            String strM;
                            String str2;
                            byte b4 = b2;
                            f88 f88Var = f88.a;
                            cs4 cs4Var = cs4.b;
                            String str3 = str;
                            ga0 ga0Var2 = ga0Var;
                            switch (b4) {
                                case 0:
                                    ux2 ux2Var2 = (ux2) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    if (ux2Var2.N(1 & iIntValue, (iIntValue & 3) != 2)) {
                                        if (ga0Var2 instanceof s4) {
                                            ux2Var2.W(-469564980);
                                            ux2Var2.p(false);
                                            strM = ((s4) ga0Var2).v0;
                                        } else {
                                            if (!(ga0Var2 instanceof r4)) {
                                                throw fx3.m(-469567230, ux2Var2, false);
                                            }
                                            strM = to7.m(ux2Var2, -469563152, R.string.tv_account_name, ux2Var2, false);
                                        }
                                        qs7.b(strM, androidx.compose.ui.platform.a.a(cs4Var, str3 + "-TVListItemTitle"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(un4.a)).b.j, ux2Var2, 0, 0, 131068);
                                    } else {
                                        ux2Var2.Q();
                                    }
                                    return f88Var;
                                default:
                                    ux2 ux2Var3 = (ux2) obj;
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    if (!ux2Var3.N(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                                        ux2Var3.Q();
                                        return f88Var;
                                    }
                                    if (ga0Var2 instanceof s4) {
                                        str2 = ((s4) ga0Var2).w0;
                                    } else {
                                        if (!(ga0Var2 instanceof r4)) {
                                            gk0.s();
                                            return null;
                                        }
                                        str2 = ((r4) ga0Var2).v0;
                                    }
                                    String str4 = str2;
                                    if (str4 == null) {
                                        ux2Var3.W(-832627940);
                                        ux2Var3.p(false);
                                        return f88Var;
                                    }
                                    ux2Var3.W(-832627939);
                                    qs7.b(str4, androidx.compose.ui.platform.a.a(cs4Var, str3 + "-TVListItemSubtitle"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var3.j(un4.a)).b.k, ux2Var3, 0, 0, 131068);
                                    ux2Var3.p(false);
                                    return f88Var;
                            }
                        }
                    }, ux2Var), fs4VarA, au8.O(2117107915, new hw2() { // from class: o.t4
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            String strM;
                            String str2;
                            byte b4 = b3;
                            f88 f88Var = f88.a;
                            cs4 cs4Var = cs4.b;
                            String str3 = str;
                            ga0 ga0Var2 = ga0Var;
                            switch (b4) {
                                case 0:
                                    ux2 ux2Var2 = (ux2) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    if (ux2Var2.N(1 & iIntValue, (iIntValue & 3) != 2)) {
                                        if (ga0Var2 instanceof s4) {
                                            ux2Var2.W(-469564980);
                                            ux2Var2.p(false);
                                            strM = ((s4) ga0Var2).v0;
                                        } else {
                                            if (!(ga0Var2 instanceof r4)) {
                                                throw fx3.m(-469567230, ux2Var2, false);
                                            }
                                            strM = to7.m(ux2Var2, -469563152, R.string.tv_account_name, ux2Var2, false);
                                        }
                                        qs7.b(strM, androidx.compose.ui.platform.a.a(cs4Var, str3 + "-TVListItemTitle"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(un4.a)).b.j, ux2Var2, 0, 0, 131068);
                                    } else {
                                        ux2Var2.Q();
                                    }
                                    return f88Var;
                                default:
                                    ux2 ux2Var3 = (ux2) obj;
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    if (!ux2Var3.N(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                                        ux2Var3.Q();
                                        return f88Var;
                                    }
                                    if (ga0Var2 instanceof s4) {
                                        str2 = ((s4) ga0Var2).w0;
                                    } else {
                                        if (!(ga0Var2 instanceof r4)) {
                                            gk0.s();
                                            return null;
                                        }
                                        str2 = ((r4) ga0Var2).v0;
                                    }
                                    String str4 = str2;
                                    if (str4 == null) {
                                        ux2Var3.W(-832627940);
                                        ux2Var3.p(false);
                                        return f88Var;
                                    }
                                    ux2Var3.W(-832627939);
                                    qs7.b(str4, androidx.compose.ui.platform.a.a(cs4Var, str3 + "-TVListItemSubtitle"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var3.j(un4.a)).b.k, ux2Var3, 0, 0, 131068);
                                    ux2Var3.p(false);
                                    return f88Var;
                            }
                        }
                    }, ux2Var), au8.O(111617036, new u4(b2, ga0Var, z), ux2Var), au8.O(-1893873843, new v4(function3, b2), ux2Var), jb4VarA, ux2Var, 224262, 388);
                    fs4Var3 = fs4Var6;
                    function2 = function3;
                } else {
                    ux2Var.Q();
                    jb4VarA = jb4Var;
                    fs4Var3 = fs4Var2;
                    function2 = function1;
                }
                j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    j56VarR.d = new w4(ga0Var, z, fs4Var3, jb4VarA, function2, str, i2, i3);
                }
            }
            i4 |= 24576;
            function1 = function0;
            if ((196608 & i2) == 0) {
                if (ux2Var.f(str)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i4 |= i7;
            }
            b2 = 0;
            b3 = 1;
            if ((74899 & i4) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (ux2Var.N(i4 & 1, z2)) {
                ux2Var.S();
                if ((i2 & 1) != 0) {
                    if (i8 != 0) {
                        fs4Var4 = cs4.b;
                    } else {
                        fs4Var4 = fs4Var2;
                    }
                    int i10 = kb4.a;
                    jb4VarA = kb4.a(rv0.g, ux2Var);
                    if (i5 != 0) {
                        function1 = null;
                    }
                    fs4Var5 = fs4Var4;
                } else {
                    if (i8 != 0) {
                        fs4Var4 = cs4.b;
                    } else {
                        fs4Var4 = fs4Var2;
                    }
                    int i11 = kb4.a;
                    jb4VarA = kb4.a(rv0.g, ux2Var);
                    if (i5 != 0) {
                        function1 = null;
                    }
                    fs4Var5 = fs4Var4;
                }
                function3 = function1;
                ux2Var.q();
                if (function3 != null) {
                    fs4Var6 = fs4Var5;
                    fs4VarA = androidx.compose.ui.platform.a.a(androidx.compose.foundation.b.b(fs4Var5, false, null, null, function3, 15), str + "-TVListItem");
                } else {
                    fs4Var6 = fs4Var5;
                    fs4VarA = fs4Var6;
                }
                pb4.a(au8.O(-456354040, new hw2() { // from class: o.t4
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        String strM;
                        String str2;
                        byte b4 = b2;
                        f88 f88Var = f88.a;
                        cs4 cs4Var = cs4.b;
                        String str3 = str;
                        ga0 ga0Var2 = ga0Var;
                        switch (b4) {
                            case 0:
                                ux2 ux2Var2 = (ux2) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (ux2Var2.N(1 & iIntValue, (iIntValue & 3) != 2)) {
                                    if (ga0Var2 instanceof s4) {
                                        ux2Var2.W(-469564980);
                                        ux2Var2.p(false);
                                        strM = ((s4) ga0Var2).v0;
                                    } else {
                                        if (!(ga0Var2 instanceof r4)) {
                                            throw fx3.m(-469567230, ux2Var2, false);
                                        }
                                        strM = to7.m(ux2Var2, -469563152, R.string.tv_account_name, ux2Var2, false);
                                    }
                                    qs7.b(strM, androidx.compose.ui.platform.a.a(cs4Var, str3 + "-TVListItemTitle"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(un4.a)).b.j, ux2Var2, 0, 0, 131068);
                                } else {
                                    ux2Var2.Q();
                                }
                                return f88Var;
                            default:
                                ux2 ux2Var3 = (ux2) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (!ux2Var3.N(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                                    ux2Var3.Q();
                                    return f88Var;
                                }
                                if (ga0Var2 instanceof s4) {
                                    str2 = ((s4) ga0Var2).w0;
                                } else {
                                    if (!(ga0Var2 instanceof r4)) {
                                        gk0.s();
                                        return null;
                                    }
                                    str2 = ((r4) ga0Var2).v0;
                                }
                                String str4 = str2;
                                if (str4 == null) {
                                    ux2Var3.W(-832627940);
                                    ux2Var3.p(false);
                                    return f88Var;
                                }
                                ux2Var3.W(-832627939);
                                qs7.b(str4, androidx.compose.ui.platform.a.a(cs4Var, str3 + "-TVListItemSubtitle"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var3.j(un4.a)).b.k, ux2Var3, 0, 0, 131068);
                                ux2Var3.p(false);
                                return f88Var;
                        }
                    }
                }, ux2Var), fs4VarA, au8.O(2117107915, new hw2() { // from class: o.t4
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        String strM;
                        String str2;
                        byte b4 = b3;
                        f88 f88Var = f88.a;
                        cs4 cs4Var = cs4.b;
                        String str3 = str;
                        ga0 ga0Var2 = ga0Var;
                        switch (b4) {
                            case 0:
                                ux2 ux2Var2 = (ux2) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (ux2Var2.N(1 & iIntValue, (iIntValue & 3) != 2)) {
                                    if (ga0Var2 instanceof s4) {
                                        ux2Var2.W(-469564980);
                                        ux2Var2.p(false);
                                        strM = ((s4) ga0Var2).v0;
                                    } else {
                                        if (!(ga0Var2 instanceof r4)) {
                                            throw fx3.m(-469567230, ux2Var2, false);
                                        }
                                        strM = to7.m(ux2Var2, -469563152, R.string.tv_account_name, ux2Var2, false);
                                    }
                                    qs7.b(strM, androidx.compose.ui.platform.a.a(cs4Var, str3 + "-TVListItemTitle"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(un4.a)).b.j, ux2Var2, 0, 0, 131068);
                                } else {
                                    ux2Var2.Q();
                                }
                                return f88Var;
                            default:
                                ux2 ux2Var3 = (ux2) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (!ux2Var3.N(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                                    ux2Var3.Q();
                                    return f88Var;
                                }
                                if (ga0Var2 instanceof s4) {
                                    str2 = ((s4) ga0Var2).w0;
                                } else {
                                    if (!(ga0Var2 instanceof r4)) {
                                        gk0.s();
                                        return null;
                                    }
                                    str2 = ((r4) ga0Var2).v0;
                                }
                                String str4 = str2;
                                if (str4 == null) {
                                    ux2Var3.W(-832627940);
                                    ux2Var3.p(false);
                                    return f88Var;
                                }
                                ux2Var3.W(-832627939);
                                qs7.b(str4, androidx.compose.ui.platform.a.a(cs4Var, str3 + "-TVListItemSubtitle"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var3.j(un4.a)).b.k, ux2Var3, 0, 0, 131068);
                                ux2Var3.p(false);
                                return f88Var;
                        }
                    }
                }, ux2Var), au8.O(111617036, new u4(b2, ga0Var, z), ux2Var), au8.O(-1893873843, new v4(function3, b2), ux2Var), jb4VarA, ux2Var, 224262, 388);
                fs4Var3 = fs4Var6;
                function2 = function3;
            } else {
                ux2Var.Q();
                jb4VarA = jb4Var;
                fs4Var3 = fs4Var2;
                function2 = function1;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new w4(ga0Var, z, fs4Var3, jb4VarA, function2, str, i2, i3);
            }
        }
        i4 |= 384;
        fs4Var2 = fs4Var;
        if ((i2 & 3072) == 0) {
            i4 |= 1024;
        }
        i5 = i3 & 16;
        if (i5 != 0) {
            if ((i2 & 24576) == 0) {
                function1 = function0;
                if (ux2Var.h(function1)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i4 |= i6;
            }
            if ((196608 & i2) == 0) {
                if (ux2Var.f(str)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i4 |= i7;
            }
            b2 = 0;
            b3 = 1;
            if ((74899 & i4) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (ux2Var.N(i4 & 1, z2)) {
                ux2Var.S();
                if ((i2 & 1) != 0) {
                    if (i8 != 0) {
                        fs4Var4 = cs4.b;
                    } else {
                        fs4Var4 = fs4Var2;
                    }
                    int i12 = kb4.a;
                    jb4VarA = kb4.a(rv0.g, ux2Var);
                    if (i5 != 0) {
                        function1 = null;
                    }
                    fs4Var5 = fs4Var4;
                } else {
                    if (i8 != 0) {
                        fs4Var4 = cs4.b;
                    } else {
                        fs4Var4 = fs4Var2;
                    }
                    int i13 = kb4.a;
                    jb4VarA = kb4.a(rv0.g, ux2Var);
                    if (i5 != 0) {
                        function1 = null;
                    }
                    fs4Var5 = fs4Var4;
                }
                function3 = function1;
                ux2Var.q();
                if (function3 != null) {
                    fs4Var6 = fs4Var5;
                    fs4VarA = androidx.compose.ui.platform.a.a(androidx.compose.foundation.b.b(fs4Var5, false, null, null, function3, 15), str + "-TVListItem");
                } else {
                    fs4Var6 = fs4Var5;
                    fs4VarA = fs4Var6;
                }
                pb4.a(au8.O(-456354040, new hw2() { // from class: o.t4
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        String strM;
                        String str2;
                        byte b4 = b2;
                        f88 f88Var = f88.a;
                        cs4 cs4Var = cs4.b;
                        String str3 = str;
                        ga0 ga0Var2 = ga0Var;
                        switch (b4) {
                            case 0:
                                ux2 ux2Var2 = (ux2) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (ux2Var2.N(1 & iIntValue, (iIntValue & 3) != 2)) {
                                    if (ga0Var2 instanceof s4) {
                                        ux2Var2.W(-469564980);
                                        ux2Var2.p(false);
                                        strM = ((s4) ga0Var2).v0;
                                    } else {
                                        if (!(ga0Var2 instanceof r4)) {
                                            throw fx3.m(-469567230, ux2Var2, false);
                                        }
                                        strM = to7.m(ux2Var2, -469563152, R.string.tv_account_name, ux2Var2, false);
                                    }
                                    qs7.b(strM, androidx.compose.ui.platform.a.a(cs4Var, str3 + "-TVListItemTitle"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(un4.a)).b.j, ux2Var2, 0, 0, 131068);
                                } else {
                                    ux2Var2.Q();
                                }
                                return f88Var;
                            default:
                                ux2 ux2Var3 = (ux2) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (!ux2Var3.N(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                                    ux2Var3.Q();
                                    return f88Var;
                                }
                                if (ga0Var2 instanceof s4) {
                                    str2 = ((s4) ga0Var2).w0;
                                } else {
                                    if (!(ga0Var2 instanceof r4)) {
                                        gk0.s();
                                        return null;
                                    }
                                    str2 = ((r4) ga0Var2).v0;
                                }
                                String str4 = str2;
                                if (str4 == null) {
                                    ux2Var3.W(-832627940);
                                    ux2Var3.p(false);
                                    return f88Var;
                                }
                                ux2Var3.W(-832627939);
                                qs7.b(str4, androidx.compose.ui.platform.a.a(cs4Var, str3 + "-TVListItemSubtitle"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var3.j(un4.a)).b.k, ux2Var3, 0, 0, 131068);
                                ux2Var3.p(false);
                                return f88Var;
                        }
                    }
                }, ux2Var), fs4VarA, au8.O(2117107915, new hw2() { // from class: o.t4
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        String strM;
                        String str2;
                        byte b4 = b3;
                        f88 f88Var = f88.a;
                        cs4 cs4Var = cs4.b;
                        String str3 = str;
                        ga0 ga0Var2 = ga0Var;
                        switch (b4) {
                            case 0:
                                ux2 ux2Var2 = (ux2) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (ux2Var2.N(1 & iIntValue, (iIntValue & 3) != 2)) {
                                    if (ga0Var2 instanceof s4) {
                                        ux2Var2.W(-469564980);
                                        ux2Var2.p(false);
                                        strM = ((s4) ga0Var2).v0;
                                    } else {
                                        if (!(ga0Var2 instanceof r4)) {
                                            throw fx3.m(-469567230, ux2Var2, false);
                                        }
                                        strM = to7.m(ux2Var2, -469563152, R.string.tv_account_name, ux2Var2, false);
                                    }
                                    qs7.b(strM, androidx.compose.ui.platform.a.a(cs4Var, str3 + "-TVListItemTitle"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(un4.a)).b.j, ux2Var2, 0, 0, 131068);
                                } else {
                                    ux2Var2.Q();
                                }
                                return f88Var;
                            default:
                                ux2 ux2Var3 = (ux2) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (!ux2Var3.N(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                                    ux2Var3.Q();
                                    return f88Var;
                                }
                                if (ga0Var2 instanceof s4) {
                                    str2 = ((s4) ga0Var2).w0;
                                } else {
                                    if (!(ga0Var2 instanceof r4)) {
                                        gk0.s();
                                        return null;
                                    }
                                    str2 = ((r4) ga0Var2).v0;
                                }
                                String str4 = str2;
                                if (str4 == null) {
                                    ux2Var3.W(-832627940);
                                    ux2Var3.p(false);
                                    return f88Var;
                                }
                                ux2Var3.W(-832627939);
                                qs7.b(str4, androidx.compose.ui.platform.a.a(cs4Var, str3 + "-TVListItemSubtitle"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var3.j(un4.a)).b.k, ux2Var3, 0, 0, 131068);
                                ux2Var3.p(false);
                                return f88Var;
                        }
                    }
                }, ux2Var), au8.O(111617036, new u4(b2, ga0Var, z), ux2Var), au8.O(-1893873843, new v4(function3, b2), ux2Var), jb4VarA, ux2Var, 224262, 388);
                fs4Var3 = fs4Var6;
                function2 = function3;
            } else {
                ux2Var.Q();
                jb4VarA = jb4Var;
                fs4Var3 = fs4Var2;
                function2 = function1;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new w4(ga0Var, z, fs4Var3, jb4VarA, function2, str, i2, i3);
            }
        }
        i4 |= 24576;
        function1 = function0;
        if ((196608 & i2) == 0) {
            if (ux2Var.f(str)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i4 |= i7;
        }
        b2 = 0;
        b3 = 1;
        if ((74899 & i4) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (ux2Var.N(i4 & 1, z2)) {
            ux2Var.S();
            if ((i2 & 1) != 0) {
                if (i8 != 0) {
                    fs4Var4 = cs4.b;
                } else {
                    fs4Var4 = fs4Var2;
                }
                int i14 = kb4.a;
                jb4VarA = kb4.a(rv0.g, ux2Var);
                if (i5 != 0) {
                    function1 = null;
                }
                fs4Var5 = fs4Var4;
            } else {
                if (i8 != 0) {
                    fs4Var4 = cs4.b;
                } else {
                    fs4Var4 = fs4Var2;
                }
                int i15 = kb4.a;
                jb4VarA = kb4.a(rv0.g, ux2Var);
                if (i5 != 0) {
                    function1 = null;
                }
                fs4Var5 = fs4Var4;
            }
            function3 = function1;
            ux2Var.q();
            if (function3 != null) {
                fs4Var6 = fs4Var5;
                fs4VarA = androidx.compose.ui.platform.a.a(androidx.compose.foundation.b.b(fs4Var5, false, null, null, function3, 15), str + "-TVListItem");
            } else {
                fs4Var6 = fs4Var5;
                fs4VarA = fs4Var6;
            }
            pb4.a(au8.O(-456354040, new hw2() { // from class: o.t4
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    String strM;
                    String str2;
                    byte b4 = b2;
                    f88 f88Var = f88.a;
                    cs4 cs4Var = cs4.b;
                    String str3 = str;
                    ga0 ga0Var2 = ga0Var;
                    switch (b4) {
                        case 0:
                            ux2 ux2Var2 = (ux2) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (ux2Var2.N(1 & iIntValue, (iIntValue & 3) != 2)) {
                                if (ga0Var2 instanceof s4) {
                                    ux2Var2.W(-469564980);
                                    ux2Var2.p(false);
                                    strM = ((s4) ga0Var2).v0;
                                } else {
                                    if (!(ga0Var2 instanceof r4)) {
                                        throw fx3.m(-469567230, ux2Var2, false);
                                    }
                                    strM = to7.m(ux2Var2, -469563152, R.string.tv_account_name, ux2Var2, false);
                                }
                                qs7.b(strM, androidx.compose.ui.platform.a.a(cs4Var, str3 + "-TVListItemTitle"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(un4.a)).b.j, ux2Var2, 0, 0, 131068);
                            } else {
                                ux2Var2.Q();
                            }
                            return f88Var;
                        default:
                            ux2 ux2Var3 = (ux2) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (!ux2Var3.N(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                                ux2Var3.Q();
                                return f88Var;
                            }
                            if (ga0Var2 instanceof s4) {
                                str2 = ((s4) ga0Var2).w0;
                            } else {
                                if (!(ga0Var2 instanceof r4)) {
                                    gk0.s();
                                    return null;
                                }
                                str2 = ((r4) ga0Var2).v0;
                            }
                            String str4 = str2;
                            if (str4 == null) {
                                ux2Var3.W(-832627940);
                                ux2Var3.p(false);
                                return f88Var;
                            }
                            ux2Var3.W(-832627939);
                            qs7.b(str4, androidx.compose.ui.platform.a.a(cs4Var, str3 + "-TVListItemSubtitle"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var3.j(un4.a)).b.k, ux2Var3, 0, 0, 131068);
                            ux2Var3.p(false);
                            return f88Var;
                    }
                }
            }, ux2Var), fs4VarA, au8.O(2117107915, new hw2() { // from class: o.t4
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    String strM;
                    String str2;
                    byte b4 = b3;
                    f88 f88Var = f88.a;
                    cs4 cs4Var = cs4.b;
                    String str3 = str;
                    ga0 ga0Var2 = ga0Var;
                    switch (b4) {
                        case 0:
                            ux2 ux2Var2 = (ux2) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (ux2Var2.N(1 & iIntValue, (iIntValue & 3) != 2)) {
                                if (ga0Var2 instanceof s4) {
                                    ux2Var2.W(-469564980);
                                    ux2Var2.p(false);
                                    strM = ((s4) ga0Var2).v0;
                                } else {
                                    if (!(ga0Var2 instanceof r4)) {
                                        throw fx3.m(-469567230, ux2Var2, false);
                                    }
                                    strM = to7.m(ux2Var2, -469563152, R.string.tv_account_name, ux2Var2, false);
                                }
                                qs7.b(strM, androidx.compose.ui.platform.a.a(cs4Var, str3 + "-TVListItemTitle"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(un4.a)).b.j, ux2Var2, 0, 0, 131068);
                            } else {
                                ux2Var2.Q();
                            }
                            return f88Var;
                        default:
                            ux2 ux2Var3 = (ux2) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (!ux2Var3.N(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                                ux2Var3.Q();
                                return f88Var;
                            }
                            if (ga0Var2 instanceof s4) {
                                str2 = ((s4) ga0Var2).w0;
                            } else {
                                if (!(ga0Var2 instanceof r4)) {
                                    gk0.s();
                                    return null;
                                }
                                str2 = ((r4) ga0Var2).v0;
                            }
                            String str4 = str2;
                            if (str4 == null) {
                                ux2Var3.W(-832627940);
                                ux2Var3.p(false);
                                return f88Var;
                            }
                            ux2Var3.W(-832627939);
                            qs7.b(str4, androidx.compose.ui.platform.a.a(cs4Var, str3 + "-TVListItemSubtitle"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var3.j(un4.a)).b.k, ux2Var3, 0, 0, 131068);
                            ux2Var3.p(false);
                            return f88Var;
                    }
                }
            }, ux2Var), au8.O(111617036, new u4(b2, ga0Var, z), ux2Var), au8.O(-1893873843, new v4(function3, b2), ux2Var), jb4VarA, ux2Var, 224262, 388);
            fs4Var3 = fs4Var6;
            function2 = function3;
        } else {
            ux2Var.Q();
            jb4VarA = jb4Var;
            fs4Var3 = fs4Var2;
            function2 = function1;
        }
        j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new w4(ga0Var, z, fs4Var3, jb4VarA, function2, str, i2, i3);
        }
    }

    public static final void b(boolean z, boolean z2, Function1 function1, int i2, Function0 function0, fs4 fs4Var, String str, ux2 ux2Var, int i3) {
        String str2;
        function1.getClass();
        function0.getClass();
        ux2Var.Y(1592045132);
        int i4 = i3 | (ux2Var.g(z) ? 4 : 2) | (ux2Var.g(z2) ? 32 : 16) | (ux2Var.h(function1) ? 256 : 128) | (ux2Var.d(i2) ? 2048 : 1024) | (ux2Var.h(function0) ? 16384 : 8192) | (ux2Var.f(fs4Var) ? 131072 : 65536) | 1572864;
        if (ux2Var.N(i4 & 1, (599187 & i4) != 599186)) {
            if (z) {
                ux2Var.W(-707035564);
                m(i2, ((i4 >> 6) & 7168) | ((i4 >> 9) & 126) | 384, function0, ux2Var, fs4Var);
                ux2Var.p(false);
            } else {
                ux2Var.W(-706868381);
                h(z2, function1, fs4Var, ux2Var, ((i4 >> 6) & 7168) | ((i4 >> 3) & 126) | 384);
                ux2Var.p(false);
            }
            str2 = "TVTA-settings-advancedLogging";
        } else {
            ux2Var.Q();
            str2 = str;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new ic(z, z2, function1, i2, function0, fs4Var, str2, i3, (byte) 0);
        }
    }

    public static final void c(int i2, Function0 function0, ux2 ux2Var, fs4 fs4Var) {
        int i3;
        fs4 fs4Var2;
        function0.getClass();
        ux2Var.Y(-2080485906);
        if ((i2 & 6) == 0) {
            i3 = (ux2Var.h(function0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | 48;
        byte b2 = 0;
        byte b3 = 1;
        if (ux2Var.N(i4 & 1, (i4 & 19) != 18)) {
            yy0 yy0VarO = au8.O(1262591654, new z10((Context) ux2Var.j(lh.b), function0, b2), ux2Var);
            yy0 yy0VarO2 = au8.O(572760164, new v4(function0, b3), ux2Var);
            yy0 yy0Var = ga0.i;
            yy0 yy0Var2 = ga0.j;
            int i5 = (i4 & 14) | 1772976;
            fs4Var2 = cs4.b;
            uf0.b(function0, yy0VarO, fs4Var2, yy0VarO2, yy0Var, yy0Var2, null, 0L, 0L, 0L, 0L, null, ux2Var, i5, 0, 16272);
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new a20(function0, fs4Var2, i2, (byte) 0);
        }
    }

    public static kf0 d(int i2, int i3, df0 df0Var) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        int i4 = i3 & 2;
        df0 df0Var2 = df0.m;
        if (i4 != 0) {
            df0Var = df0Var2;
        }
        if (i2 == -2) {
            if (df0Var != df0Var2) {
                return new j21(1, df0Var);
            }
            wm0.b.getClass();
            return new kf0(vm0.b);
        }
        if (i2 == -1) {
            if (df0Var == df0Var2) {
                return new j21(1, df0.n);
            }
            hk0.g("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            return null;
        }
        if (i2 == 0) {
            return df0Var == df0Var2 ? new kf0(0) : new j21(1, df0Var);
        }
        if (i2 != Integer.MAX_VALUE) {
            return df0Var == df0Var2 ? new kf0(i2) : new j21(i2, df0Var);
        }
        return new kf0(Integer.MAX_VALUE);
    }

    /* JADX WARN: Code duplicated, block: B:98:0x02aa  */
    public static final void e(i81 i81Var, Function1 function1, Function1 function2, fs4 fs4Var, ux2 ux2Var, int i2) {
        ux2 ux2Var2;
        fs4 fs4Var2;
        aw awVar;
        Object objK;
        function1.getClass();
        function2.getClass();
        ux2Var.Y(316210836);
        byte b2 = 4;
        int i3 = 2;
        int i4 = (ux2Var.h(i81Var) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i4 |= ux2Var.h(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= ux2Var.h(function2) ? 256 : 128;
        }
        int i5 = i4 | 3072;
        if (ux2Var.N(i5 & 1, (i5 & 1171) != 1170)) {
            Object objK2 = ux2Var.K();
            hc1 hc1Var = null;
            aw awVar2 = e01.a;
            if (objK2 == awVar2) {
                objK2 = new l5(i3, hc1Var, b2);
                ux2Var.g0(objK2);
            }
            f88 f88Var = f88.a;
            ck3.i(f88Var, (hw2) objK2, ux2Var);
            Object objK3 = ux2Var.K();
            if (objK3 == awVar2) {
                objK3 = new sq2();
                ux2Var.g0(objK3);
            }
            sq2 sq2Var = (sq2) objK3;
            Object objK4 = ux2Var.K();
            if (objK4 == awVar2) {
                objK4 = new sq2();
                ux2Var.g0(objK4);
            }
            sq2 sq2Var2 = (sq2) objK4;
            Object[] objArr = new Object[0];
            Object objK5 = ux2Var.K();
            if (objK5 == awVar2) {
                objK5 = new y01((byte) 15);
                ux2Var.g0(objK5);
            }
            px4 px4Var = (px4) zu1.L(objArr, (Function0) objK5, ux2Var, 48);
            Object objK6 = ux2Var.K();
            if (objK6 == awVar2) {
                objK6 = (String) px4Var.getValue();
                ux2Var.g0(objK6);
            }
            String str = (String) objK6;
            Object objK7 = ux2Var.K();
            if (objK7 == awVar2) {
                objK7 = h57.p(Boolean.TRUE);
                ux2Var.g0(objK7);
            }
            px4 px4Var2 = (px4) objK7;
            Object objK8 = ux2Var.K();
            if (objK8 == awVar2) {
                objK8 = h57.p(null);
                ux2Var.g0(objK8);
            }
            px4 px4Var3 = (px4) objK8;
            Object objK9 = ux2Var.K();
            if (objK9 == awVar2) {
                objK9 = new bj(str, sq2Var, sq2Var2, px4Var2, null, (byte) 5);
                ux2Var.g0(objK9);
            }
            ck3.i(f88Var, (hw2) objK9, ux2Var);
            String str2 = (String) px4Var3.getValue();
            boolean zF = ux2Var.f(px4Var);
            Object objK10 = ux2Var.K();
            byte b3 = 17;
            if (zF || objK10 == awVar2) {
                objK10 = new j0(px4Var3, px4Var, hc1Var, b3);
                ux2Var.g0(objK10);
            }
            ck3.i(str2, (hw2) objK10, ux2Var);
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
            String str3 = i81Var.c;
            boolean z = i81Var.e;
            boolean z2 = (((Boolean) px4Var2.getValue()).booleanValue() && str == null) ? false : true;
            yy0 yy0Var = (i81Var.e || !ub7.b0(i81Var.c)) ? null : vn4.j;
            fs4 fs4VarF = F(androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-contactEditScreen-name"), 0.0f, 0.0f, 0.0f, 16.0f, 7);
            String strZ = m77.z(R.string.sort_name_label, ux2Var);
            boolean z3 = i81Var.b;
            boolean zF2 = ux2Var.f(px4Var);
            Object objK11 = ux2Var.K();
            if (zF2 || objK11 == awVar2) {
                objK11 = new m71(px4Var2, px4Var, px4Var3, (byte) 0);
                ux2Var.g0(objK11);
            }
            Function1 function3 = (Function1) objK11;
            Integer numValueOf = Integer.valueOf(R.string.device_tab_contact_edit_name_support_text_count);
            Object objK12 = ux2Var.K();
            if (objK12 == awVar2) {
                objK12 = new y01((byte) 16);
                ux2Var.g0(objK12);
            }
            lq1.b(str3, function1, false, z, z2, sq2Var, function3, fs4VarF, false, z3, numValueOf, strZ, yy0Var, (Function0) objK12, null, null, null, null, ux2Var, (i5 & 112) | 12779904, 3072, 246016);
            b77.a(ux2Var, androidx.compose.foundation.layout.b.d(cs4Var, 10.0f));
            String str4 = i81Var.d;
            boolean z4 = i81Var.f;
            boolean z5 = (((Boolean) px4Var2.getValue()).booleanValue() && str == 0) ? false : true;
            fs4 fs4VarF2 = F(androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-contactEditScreen-description"), 0.0f, 0.0f, 0.0f, 16.0f, 7);
            String strZ2 = m77.z(R.string.description_edit_title, ux2Var);
            boolean z6 = i81Var.b;
            boolean zF3 = ux2Var.f(px4Var);
            Object objK13 = ux2Var.K();
            if (zF3) {
                awVar = awVar2;
            } else {
                awVar = awVar2;
                if (objK13 == awVar) {
                }
                Function1 function4 = (Function1) objK13;
                Integer numValueOf2 = Integer.valueOf(R.string.device_tab_contact_edit_description_support_text_count);
                objK = ux2Var.K();
                if (objK == awVar) {
                    objK = new y01((byte) 17);
                    ux2Var.g0(objK);
                }
                lq1.b(str4, function2, true, z4, z5, sq2Var2, function4, fs4VarF2, false, z6, numValueOf2, strZ2, null, (Function0) objK, null, null, null, null, ux2Var, ((i5 >> 3) & 112) | 12779904, 3072, 250112);
                ux2Var2 = ux2Var;
                ux2Var2.p(true);
                fs4Var2 = cs4Var;
            }
            objK13 = new m71(px4Var2, px4Var, px4Var3, (byte) 1);
            ux2Var.g0(objK13);
            Function1 function5 = (Function1) objK13;
            Integer numValueOf3 = Integer.valueOf(R.string.device_tab_contact_edit_description_support_text_count);
            objK = ux2Var.K();
            if (objK == awVar) {
                objK = new y01((byte) 17);
                ux2Var.g0(objK);
            }
            lq1.b(str4, function2, true, z4, z5, sq2Var2, function5, fs4VarF2, false, z6, numValueOf3, strZ2, null, (Function0) objK, null, null, null, null, ux2Var, ((i5 >> 3) & 112) | 12779904, 3072, 250112);
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
            fs4Var2 = cs4Var;
        } else {
            ux2Var2 = ux2Var;
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new n71(i81Var, function1, function2, fs4Var2, i2, (byte) 0);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 25681. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static final void f(o.zr7 r66, kotlin.jvm.functions.Function1 r67, o.fs4 r68, o.ot7 r69, o.tg8 r70, kotlin.jvm.functions.Function1 r71, o.mw4 r72, o.sb0 r73, boolean r74, int r75, int r76, o.bf3 r77, o.xx3 r78, boolean r79, boolean r80, o.yy0 r81, o.ux2 r82, int r83, int r84) {
        /*
            Method dump skipped, instruction units count: 2568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ka0.f(o.zr7, kotlin.jvm.functions.Function1, o.fs4, o.ot7, o.tg8, kotlin.jvm.functions.Function1, o.mw4, o.sb0, boolean, int, int, o.bf3, o.xx3, boolean, boolean, o.yy0, o.ux2, int, int):void");
    }

    public static final void g(fs4 fs4Var, pr7 pr7Var, yy0 yy0Var, ux2 ux2Var, int i2) {
        ux2Var.Y(2036174316);
        int i3 = (ux2Var.f(fs4Var) ? 4 : 2) | i2 | (ux2Var.h(pr7Var) ? 32 : 16);
        if (ux2Var.N(i3 & 1, (i3 & 147) != 146)) {
            do4 do4VarC = ua0.c(xz2.f2564o, true);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4Var);
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
            iq8.f(pr7Var, yy0Var, ux2Var, (i3 >> 3) & 126);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new f9(fs4Var, (Object) pr7Var, (Object) yy0Var, i2, (byte) 7);
        }
    }

    public static final void h(boolean z, Function1 function1, fs4 fs4Var, ux2 ux2Var, int i2) {
        int i3;
        Function1 function2;
        fs4 fs4Var2;
        ux2Var.Y(2142663744);
        if ((i2 & 6) == 0) {
            i3 = (ux2Var.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            function2 = function1;
            i3 |= ux2Var.h(function2) ? 32 : 16;
        } else {
            function2 = function1;
        }
        if ((i2 & 384) == 0) {
            i3 |= ux2Var.f("TVTA-settings-advancedLogging") ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            fs4Var2 = fs4Var;
            i3 |= ux2Var.f(fs4Var2) ? 2048 : 1024;
        } else {
            fs4Var2 = fs4Var;
        }
        if (ux2Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            l47.d(new sk7(y57.g(R.string.tv_advanced_logging), null, new yk7(R.drawable.diagram), null, 26), z, function2, fs4Var2, "TVTA-settings-advancedLogging", m77.z(R.string.tv_advanced_logging, ux2Var), ux2Var, ((i3 << 3) & 1008) | (i3 & 7168) | ((i3 << 6) & 57344), 32);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new kc(z, function1, fs4Var, i2, (byte) 0);
        }
    }

    public static pd5 i(int i2, float f2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        return new pd5(f2, 0.0f, f2, 0.0f);
    }

    public static pd5 j(float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f5 = 0.0f;
        }
        return new pd5(f2, f3, f4, f5);
    }

    public static final gy8 k() {
        return new gy8(new Paint(7));
    }

    public static final void l(pr7 pr7Var, boolean z, ux2 ux2Var, int i2) {
        ws7 ws7VarD;
        ux2Var.Y(626339208);
        int i3 = (ux2Var.h(pr7Var) ? 4 : 2) | i2 | (ux2Var.g(z) ? 32 : 16);
        if (!ux2Var.N(i3 & 1, (i3 & 19) != 18)) {
            ux2Var.Q();
        } else if (z) {
            ux2Var.W(1530097388);
            j64 j64Var = pr7Var.d;
            vs7 vs7Var = null;
            if (j64Var != null && (ws7VarD = j64Var.d()) != null) {
                vs7 vs7Var2 = ws7VarD.a;
                j64 j64Var2 = pr7Var.d;
                if (!(j64Var2 != null ? j64Var2.p : true)) {
                    vs7Var = vs7Var2;
                }
            }
            if (vs7Var == null) {
                ux2Var.W(1530097387);
                ux2Var.p(false);
            } else {
                ux2Var.W(1530097388);
                if (gt7.c(pr7Var.l().b)) {
                    ux2Var.W(2110860558);
                    ux2Var.p(false);
                } else {
                    ux2Var.W(2109807302);
                    int iQ = pr7Var.b.q((int) (pr7Var.l().b >> 32));
                    int iQ2 = pr7Var.b.q((int) (pr7Var.l().b & 4294967295L));
                    rb6 rb6VarA = vs7Var.a(iQ);
                    rb6 rb6VarA2 = vs7Var.a(Math.max(iQ2 - 1, 0));
                    j64 j64Var3 = pr7Var.d;
                    if (j64Var3 == null || !((Boolean) j64Var3.m.getValue()).booleanValue()) {
                        ux2Var.W(2110490542);
                        ux2Var.p(false);
                    } else {
                        ux2Var.W(2110225306);
                        l47.e(true, rb6VarA, pr7Var, ux2Var, ((i3 << 6) & 896) | 6);
                        ux2Var.p(false);
                    }
                    j64 j64Var4 = pr7Var.d;
                    if (j64Var4 == null || !((Boolean) j64Var4.n.getValue()).booleanValue()) {
                        ux2Var.W(2110838734);
                        ux2Var.p(false);
                    } else {
                        ux2Var.W(2110574459);
                        l47.e(false, rb6VarA2, pr7Var, ux2Var, ((i3 << 6) & 896) | 6);
                        ux2Var.p(false);
                    }
                    ux2Var.p(false);
                }
                j64 j64Var5 = pr7Var.d;
                if (j64Var5 != null) {
                    bg5 bg5Var = j64Var5.l;
                    if (!im3.n(pr7Var.u.a.n, pr7Var.l().a.n)) {
                        bg5Var.setValue(Boolean.FALSE);
                    }
                    if (j64Var5.b()) {
                        if (((Boolean) bg5Var.getValue()).booleanValue()) {
                            pr7Var.s();
                        } else {
                            pr7Var.m();
                        }
                    }
                }
                ux2Var.p(false);
            }
            ux2Var.p(false);
        } else {
            ux2Var.W(1989076778);
            ux2Var.p(false);
            pr7Var.m();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new u4(pr7Var, z, i2);
        }
    }

    public static final void m(int i2, int i3, Function0 function0, ux2 ux2Var, fs4 fs4Var) {
        int i4;
        Function0 function1;
        ux2Var.Y(1450764483);
        if ((i3 & 6) == 0) {
            i4 = (ux2Var.d(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            function1 = function0;
            i4 |= ux2Var.h(function1) ? 32 : 16;
        } else {
            function1 = function0;
        }
        if ((i3 & 384) == 0) {
            i4 |= ux2Var.f("TVTA-settings-advancedLogging") ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= ux2Var.f(fs4Var) ? 2048 : 1024;
        }
        if (ux2Var.N(i4 & 1, (i4 & 1171) != 1170)) {
            int i5 = (i4 >> 6) & 112;
            int i6 = i4 << 6;
            x37.e(new sk7(y57.g(R.string.tv_advanced_logging), y57.g(i2), new yk7(R.drawable.diagram), null, 24), fs4Var, null, function1, "TVTA-settings-advancedLogging", ux2Var, (i6 & 57344) | i5 | (i6 & 7168), 36);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new jc(i2, function0, fs4Var, i3, (byte) 0);
        }
    }

    public static final void n(pr7 pr7Var, ux2 ux2Var, int i2) {
        xo xoVarK;
        ux2Var.Y(-1436003720);
        byte b2 = 2;
        int i3 = (ux2Var.h(pr7Var) ? 4 : 2) | i2;
        if (ux2Var.N(i3 & 1, (i3 & 3) != 2)) {
            j64 j64Var = pr7Var.d;
            if (j64Var == null || !((Boolean) j64Var.f1135o.getValue()).booleanValue() || (xoVarK = pr7Var.k()) == null || xoVarK.n.length() <= 0) {
                ux2Var.W(-2111042550);
                ux2Var.p(false);
            } else {
                ux2Var.W(-2112351432);
                boolean zF = ux2Var.f(pr7Var);
                Object objK = ux2Var.K();
                Object obj = e01.a;
                if (zF || objK == obj) {
                    objK = new lr7(pr7Var);
                    ux2Var.g0(objK);
                }
                zp7 zp7Var = (zp7) objK;
                in1 in1Var = (in1) ux2Var.j(b11.h);
                v65 v65Var = pr7Var.b;
                long j2 = pr7Var.l().b;
                int i4 = gt7.c;
                int iQ = v65Var.q((int) (j2 >> 32));
                j64 j64Var2 = pr7Var.d;
                ws7 ws7VarD = j64Var2 != null ? j64Var2.d() : null;
                ws7VarD.getClass();
                vs7 vs7Var = ws7VarD.a;
                v56 v56VarC = vs7Var.c(ct1.v(iQ, 0, vs7Var.a.a.n.length()));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((in1Var.d0(2.0f) / 2.0f) + v56VarC.a)) << 32) | (((long) Float.floatToRawIntBits(v56VarC.d)) & 4294967295L);
                boolean zE = ux2Var.e(jFloatToRawIntBits);
                Object objK2 = ux2Var.K();
                if (zE || objK2 == obj) {
                    objK2 = new sd1(jFloatToRawIntBits);
                    ux2Var.g0(objK2);
                }
                w65 w65Var = (w65) objK2;
                boolean zH = ux2Var.h(zp7Var) | ux2Var.h(pr7Var);
                Object objK3 = ux2Var.K();
                if (zH || objK3 == obj) {
                    objK3 = new ud1(zp7Var, pr7Var);
                    ux2Var.g0(objK3);
                }
                fs4 fs4VarA = qg7.a(cs4.b, zp7Var, (PointerInputEventHandler) objK3);
                boolean zE2 = ux2Var.e(jFloatToRawIntBits);
                Object objK4 = ux2Var.K();
                if (zE2 || objK4 == obj) {
                    objK4 = new wh(jFloatToRawIntBits, b2);
                    ux2Var.g0(objK4);
                }
                yh.a(w65Var, cp6.a(fs4VarA, false, (Function1) objK4), 0L, ux2Var, 0);
                ux2Var.p(false);
            }
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new t0((byte) 12, i2, pr7Var);
        }
    }

    public static final float o(nd5 nd5Var, j04 j04Var) {
        return j04Var == j04.m ? nd5Var.b(j04Var) : nd5Var.a(j04Var);
    }

    public static final float p(nd5 nd5Var, j04 j04Var) {
        return j04Var == j04.m ? nd5Var.a(j04Var) : nd5Var.b(j04Var);
    }

    public static final boolean q(Object obj) {
        if (obj instanceof a57) {
            a57 a57Var = (a57) obj;
            if (a57Var.e() == xz2.P || a57Var.e() == yl7.X || a57Var.e() == yl7.T) {
                Object value = a57Var.getValue();
                if (value == null) {
                    return true;
                }
                return q(value);
            }
        } else if (!(obj instanceof pw2) || !(obj instanceof Serializable)) {
            for (int i2 = 0; i2 < 7; i2++) {
                if (l[i2].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Object r(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(ka0.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static final List s(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return ea2.m;
        }
        if (size == 1) {
            return qf0.K(lv0.m0(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static final void t(j64 j64Var) {
        ns7 ns7Var = j64Var.e;
        if (ns7Var != null) {
            j64Var.v.invoke(zr7.a((zr7) j64Var.d.n, null, 0L, 3));
            js7 js7Var = ns7Var.a;
            AtomicReference atomicReference = js7Var.b;
            while (!atomicReference.compareAndSet(ns7Var, null)) {
                if (atomicReference.get() != ns7Var) {
                }
            }
            js7Var.a.g();
        }
        j64Var.e = null;
    }

    public static final Paint u(gy8 gy8Var) {
        if (gy8Var == null) {
            ji3.a("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + w86.a.b(gy8Var.getClass()).c());
        }
        return (Paint) gy8Var.c;
    }

    public static final int v(boolean z) {
        return z ? 0 : 8;
    }

    public static boolean w(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static final boolean x(ux2 ux2Var) {
        return (((Configuration) ux2Var.j(lh.a)).uiMode & 48) == 32;
    }

    public static final void y(j64 j64Var, zr7 zr7Var, v65 v65Var) {
        n47 n47VarC = el5.c();
        Function1 function1E = n47VarC != null ? n47VarC.e() : null;
        n47 n47VarF = el5.f(n47VarC);
        try {
            ws7 ws7VarD = j64Var.d();
            if (ws7VarD == null) {
                return;
            }
            ns7 ns7Var = j64Var.e;
            if (ns7Var == null) {
                return;
            }
            i04 i04VarC = j64Var.c();
            if (i04VarC == null) {
                return;
            }
            b77.l(zr7Var, j64Var.a, ws7VarD.a, i04VarC, ns7Var, j64Var.b(), v65Var);
        } finally {
            el5.h(n47VarC, n47VarF, function1E);
        }
    }

    public static final fs4 z(fs4 fs4Var, Function1 function1) {
        return fs4Var.f(new up2(function1));
    }
}
