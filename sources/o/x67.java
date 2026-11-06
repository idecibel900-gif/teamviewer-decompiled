package o;

import android.content.Context;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.text.Spanned;
import android.util.TypedValue;
import android.view.View;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.teamviewer.market.mobile.R;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class x67 {
    public static final void a(int i, Function0 function0, Function0 function1, ux2 ux2Var, fs4 fs4Var) {
        fs4 fs4Var2;
        function0.getClass();
        function1.getClass();
        ux2Var.Y(-297419271);
        int i2 = 16;
        int i3 = i | (ux2Var.h(function0) ? 4 : 2) | (ux2Var.h(function1) ? 32 : 16) | 384;
        if (ux2Var.N(i3 & 1, (i3 & 147) != 146)) {
            cw cwVar = iq8.e;
            cs4 cs4Var = cs4.b;
            fs4 fs4VarZ = im3.Z(ka0.C(cs4Var, 40.0f, 16.0f), im3.W(ux2Var), true);
            kw0 kw0VarA = iw0.a(cwVar, xz2.A, ux2Var, 6);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarZ);
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
            List listL = qf0.L(Integer.valueOf(R.string.settings_twoFactorAuthentication_remote_instruction_1), Integer.valueOf(R.string.settings_twoFactorAuthentication_remote_instruction_2), Integer.valueOf(R.string.settings_twoFactorAuthentication_common_instruction_4));
            int i4 = 10;
            ArrayList arrayList = new ArrayList(mv0.Z(listL, 10));
            int i5 = 0;
            for (Object obj : listL) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    qf0.U();
                    throw null;
                }
                String strZ = m77.z(((Number) obj).intValue(), ux2Var);
                List listA = ob7.a(strZ);
                String strE = fx3.e(i5, "TVTA-settings-tfa-step-");
                String strB = ob7.b(strZ);
                int iQ = xm4.Q(mv0.Z(listA, i4));
                if (iQ < i2) {
                    iQ = i2;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iQ);
                for (Object obj2 : listA) {
                    linkedHashMap.put(obj2, j77.a);
                }
                arrayList.add(new h77(strE, strB, linkedHashMap));
                i5 = i6;
                i2 = 16;
                i4 = 10;
            }
            v67.c((i3 >> 3) & 14, function1, ux2Var, null);
            v67.a(arrayList, null, ux2Var, 0);
            v67.b(i3 & 14, function0, ux2Var, null);
            ux2Var.p(true);
            fs4Var2 = cs4Var;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new u71(function0, function1, fs4Var2, i, (byte) 4);
        }
    }

    public static final void b(String str, String str2, ux2 ux2Var, int i) {
        int i2;
        yy0 yy0Var = au8.j;
        str.getClass();
        ux2Var.Y(1967379860);
        if ((i & 6) == 0) {
            i2 = (ux2Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.h(yy0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.f(cs4.b) ? 256 : 128;
        }
        int i3 = i2 | 14380032;
        if (ux2Var.N(i3 & 1, (4793491 & i3) != 4793490)) {
            pd5 pd5Var = n08.a;
            h72 h72Var = vf2.a;
            qr.b(au8.O(-2116024711, new qa(str, (byte) 13), ux2Var), au8.O(1042998139, new jp6((byte) 21), ux2Var), au8.O(-512192092, new gz0((byte) 28), ux2Var), 0.0f, null, n08.b(((tf2) ux2Var.j(h72Var)).k, ((tf2) ux2Var.j(h72Var)).l, ((tf2) ux2Var.j(h72Var)).l, ((tf2) ux2Var.j(h72Var)).l, ux2Var, 34), null, ux2Var, ((i3 >> 3) & 112) | 3462, 432);
            str2 = "";
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new pa(i, str, str2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0126  */
    /* JADX WARN: Code duplicated, block: B:105:0x012c  */
    /* JADX WARN: Code duplicated, block: B:108:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:111:0x01da  */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0095  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ca A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:75:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:91:0x010d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x010f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0115  */
    /* JADX WARN: Code duplicated, block: B:96:0x0117  */
    /* JADX WARN: Code duplicated, block: B:99:0x011c  */
    public static final void c(String str, Function0 function0, fs4 fs4Var, ud5 ud5Var, List list, String str2, qj8 qj8Var, ux2 ux2Var, int i, int i2) {
        int i3;
        fs4 fs4Var2;
        int i4;
        boolean zH;
        int i5;
        int i6;
        int i7;
        boolean zH2;
        int i8;
        int i9;
        String str3;
        int i10;
        int i11;
        boolean z;
        ud5 ud5Var2;
        qj8 qj8Var2;
        List list2;
        fs4 fs4Var3;
        String str4;
        j56 j56VarR;
        ud5 ud5Var3;
        qj8 qj8VarA;
        qj8 qj8Var3;
        ud5 ud5Var4;
        int i12;
        fs4 fs4Var4;
        List list3 = list;
        str.getClass();
        function0.getClass();
        ux2Var.Y(-1915203726);
        if ((i & 6) == 0) {
            i3 = (ux2Var.f(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ux2Var.h(function0) ? 32 : 16;
        }
        int i13 = i2 & 4;
        if (i13 == 0) {
            if ((i & 384) == 0) {
                fs4Var2 = fs4Var;
                i3 |= ux2Var.f(fs4Var2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                if ((i & 4096) == 0) {
                    zH = ux2Var.f(ud5Var);
                } else {
                    zH = ux2Var.h(ud5Var);
                }
                if (zH) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i3 | 24576;
            i7 = i2 & 32;
            if (i7 != 0) {
                i6 = 221184 | i3;
            } else if ((196608 & i) == 0) {
                if ((262144 & i) == 0) {
                    zH2 = ux2Var.f(list3);
                } else {
                    zH2 = ux2Var.h(list3);
                }
                if (zH2) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i6 |= i8;
            }
            i9 = i2 & 64;
            if (i9 != 0) {
                if ((1572864 & i) == 0) {
                    str3 = str2;
                    if (ux2Var.f(str3)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i6 |= i10;
                }
                if ((12582912 & i) != 0) {
                    i6 |= ((i2 & 128) == 0 || !ux2Var.f(qj8Var)) ? 4194304 : 8388608;
                }
                i11 = i6 | 100663296;
                if ((i11 & 38347923) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (ux2Var.N(i11 & 1, z)) {
                    ux2Var.S();
                    if ((i & 1) != 0 || ux2Var.x()) {
                        if (i13 != 0) {
                            fs4Var2 = cs4.b;
                        }
                        if (i4 != 0) {
                            ud5Var3 = null;
                        } else {
                            ud5Var3 = ud5Var;
                        }
                        List list4 = i7 == 0 ? list3 : null;
                        if (i9 != 0) {
                            str3 = "";
                        }
                        if ((i2 & 128) != 0) {
                            qj8VarA = n08.a(ux2Var);
                            i11 &= -29360129;
                        } else {
                            qj8VarA = qj8Var;
                        }
                        qj8Var3 = qj8VarA;
                        ud5Var4 = ud5Var3;
                        i12 = i11;
                        list3 = list4;
                        fs4Var4 = fs4Var2;
                    } else {
                        ux2Var.Q();
                        if ((i2 & 128) != 0) {
                            i11 &= -29360129;
                        }
                        ud5Var4 = ud5Var;
                        qj8Var3 = qj8Var;
                        fs4Var4 = fs4Var2;
                        i12 = i11;
                    }
                    ux2Var.q();
                    pd5 pd5Var = n08.a;
                    h72 h72Var = vf2.a;
                    ud5 ud5Var5 = ud5Var4;
                    List list5 = list3;
                    String str5 = str3;
                    fs4 fs4Var5 = fs4Var4;
                    int i14 = i12 >> 3;
                    qj8 qj8Var4 = qj8Var3;
                    qr.e(au8.O(1932165422, new bs5(str5, str, (byte) 3), ux2Var), fs4Var5, au8.O(-63137300, new xl7(ud5Var5, function0, str5, (byte) 0), ux2Var), au8.O(1349495203, new sd(list5, str5, (byte) 16), ux2Var), 0.0f, qj8Var4, n08.b(((tf2) ux2Var.j(h72Var)).k, ((tf2) ux2Var.j(h72Var)).l, ((tf2) ux2Var.j(h72Var)).l, ((tf2) ux2Var.j(h72Var)).l, ux2Var, 34), null, ux2Var, (i14 & 112) | 3462 | (458752 & (i12 >> 6)) | (i14 & 29360128), 272);
                    str4 = str5;
                    fs4Var3 = fs4Var5;
                    qj8Var2 = qj8Var4;
                    ud5Var2 = ud5Var5;
                    list2 = list5;
                } else {
                    ux2Var.Q();
                    ud5Var2 = ud5Var;
                    qj8Var2 = qj8Var;
                    list2 = list3;
                    fs4Var3 = fs4Var2;
                    str4 = str3;
                }
                j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    j56VarR.d = new za4(str, function0, fs4Var3, ud5Var2, list2, str4, qj8Var2, i, i2);
                }
            }
            i6 |= 1572864;
            str3 = str2;
            if ((12582912 & i) != 0) {
                i6 |= ((i2 & 128) == 0 || !ux2Var.f(qj8Var)) ? 4194304 : 8388608;
            }
            i11 = i6 | 100663296;
            if ((i11 & 38347923) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (ux2Var.N(i11 & 1, z)) {
                ux2Var.S();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        fs4Var2 = cs4.b;
                    }
                    if (i4 != 0) {
                        ud5Var3 = null;
                    } else {
                        ud5Var3 = ud5Var;
                    }
                    if (i7 == 0) {
                    }
                    if (i9 != 0) {
                        str3 = "";
                    }
                    if ((i2 & 128) != 0) {
                        qj8VarA = n08.a(ux2Var);
                        i11 &= -29360129;
                    } else {
                        qj8VarA = qj8Var;
                    }
                    qj8Var3 = qj8VarA;
                    ud5Var4 = ud5Var3;
                    i12 = i11;
                    list3 = list4;
                    fs4Var4 = fs4Var2;
                } else {
                    if (i13 != 0) {
                        fs4Var2 = cs4.b;
                    }
                    if (i4 != 0) {
                        ud5Var3 = null;
                    } else {
                        ud5Var3 = ud5Var;
                    }
                    if (i7 == 0) {
                    }
                    if (i9 != 0) {
                        str3 = "";
                    }
                    if ((i2 & 128) != 0) {
                        qj8VarA = n08.a(ux2Var);
                        i11 &= -29360129;
                    } else {
                        qj8VarA = qj8Var;
                    }
                    qj8Var3 = qj8VarA;
                    ud5Var4 = ud5Var3;
                    i12 = i11;
                    list3 = list4;
                    fs4Var4 = fs4Var2;
                }
                ux2Var.q();
                pd5 pd5Var2 = n08.a;
                h72 h72Var2 = vf2.a;
                ud5 ud5Var6 = ud5Var4;
                List list6 = list3;
                String str6 = str3;
                fs4 fs4Var6 = fs4Var4;
                int i15 = i12 >> 3;
                qj8 qj8Var5 = qj8Var3;
                qr.e(au8.O(1932165422, new bs5(str6, str, (byte) 3), ux2Var), fs4Var6, au8.O(-63137300, new xl7(ud5Var6, function0, str6, (byte) 0), ux2Var), au8.O(1349495203, new sd(list6, str6, (byte) 16), ux2Var), 0.0f, qj8Var5, n08.b(((tf2) ux2Var.j(h72Var2)).k, ((tf2) ux2Var.j(h72Var2)).l, ((tf2) ux2Var.j(h72Var2)).l, ((tf2) ux2Var.j(h72Var2)).l, ux2Var, 34), null, ux2Var, (i15 & 112) | 3462 | (458752 & (i12 >> 6)) | (i15 & 29360128), 272);
                str4 = str6;
                fs4Var3 = fs4Var6;
                qj8Var2 = qj8Var5;
                ud5Var2 = ud5Var6;
                list2 = list6;
            } else {
                ux2Var.Q();
                ud5Var2 = ud5Var;
                qj8Var2 = qj8Var;
                list2 = list3;
                fs4Var3 = fs4Var2;
                str4 = str3;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new za4(str, function0, fs4Var3, ud5Var2, list2, str4, qj8Var2, i, i2);
            }
        }
        i3 |= 384;
        fs4Var2 = fs4Var;
        i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if ((i & 4096) == 0) {
                zH = ux2Var.f(ud5Var);
            } else {
                zH = ux2Var.h(ud5Var);
            }
            if (zH) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        i6 = i3 | 24576;
        i7 = i2 & 32;
        if (i7 != 0) {
            i6 = 221184 | i3;
        } else if ((196608 & i) == 0) {
            if ((262144 & i) == 0) {
                zH2 = ux2Var.f(list3);
            } else {
                zH2 = ux2Var.h(list3);
            }
            if (zH2) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i6 |= i8;
        }
        i9 = i2 & 64;
        if (i9 != 0) {
            if ((1572864 & i) == 0) {
                str3 = str2;
                if (ux2Var.f(str3)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i6 |= i10;
            }
            if ((12582912 & i) != 0) {
                i6 |= ((i2 & 128) == 0 || !ux2Var.f(qj8Var)) ? 4194304 : 8388608;
            }
            i11 = i6 | 100663296;
            if ((i11 & 38347923) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (ux2Var.N(i11 & 1, z)) {
                ux2Var.S();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        fs4Var2 = cs4.b;
                    }
                    if (i4 != 0) {
                        ud5Var3 = null;
                    } else {
                        ud5Var3 = ud5Var;
                    }
                    if (i7 == 0) {
                    }
                    if (i9 != 0) {
                        str3 = "";
                    }
                    if ((i2 & 128) != 0) {
                        qj8VarA = n08.a(ux2Var);
                        i11 &= -29360129;
                    } else {
                        qj8VarA = qj8Var;
                    }
                    qj8Var3 = qj8VarA;
                    ud5Var4 = ud5Var3;
                    i12 = i11;
                    list3 = list4;
                    fs4Var4 = fs4Var2;
                } else {
                    if (i13 != 0) {
                        fs4Var2 = cs4.b;
                    }
                    if (i4 != 0) {
                        ud5Var3 = null;
                    } else {
                        ud5Var3 = ud5Var;
                    }
                    if (i7 == 0) {
                    }
                    if (i9 != 0) {
                        str3 = "";
                    }
                    if ((i2 & 128) != 0) {
                        qj8VarA = n08.a(ux2Var);
                        i11 &= -29360129;
                    } else {
                        qj8VarA = qj8Var;
                    }
                    qj8Var3 = qj8VarA;
                    ud5Var4 = ud5Var3;
                    i12 = i11;
                    list3 = list4;
                    fs4Var4 = fs4Var2;
                }
                ux2Var.q();
                pd5 pd5Var3 = n08.a;
                h72 h72Var3 = vf2.a;
                ud5 ud5Var7 = ud5Var4;
                List list7 = list3;
                String str7 = str3;
                fs4 fs4Var7 = fs4Var4;
                int i16 = i12 >> 3;
                qj8 qj8Var6 = qj8Var3;
                qr.e(au8.O(1932165422, new bs5(str7, str, (byte) 3), ux2Var), fs4Var7, au8.O(-63137300, new xl7(ud5Var7, function0, str7, (byte) 0), ux2Var), au8.O(1349495203, new sd(list7, str7, (byte) 16), ux2Var), 0.0f, qj8Var6, n08.b(((tf2) ux2Var.j(h72Var3)).k, ((tf2) ux2Var.j(h72Var3)).l, ((tf2) ux2Var.j(h72Var3)).l, ((tf2) ux2Var.j(h72Var3)).l, ux2Var, 34), null, ux2Var, (i16 & 112) | 3462 | (458752 & (i12 >> 6)) | (i16 & 29360128), 272);
                str4 = str7;
                fs4Var3 = fs4Var7;
                qj8Var2 = qj8Var6;
                ud5Var2 = ud5Var7;
                list2 = list7;
            } else {
                ux2Var.Q();
                ud5Var2 = ud5Var;
                qj8Var2 = qj8Var;
                list2 = list3;
                fs4Var3 = fs4Var2;
                str4 = str3;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new za4(str, function0, fs4Var3, ud5Var2, list2, str4, qj8Var2, i, i2);
            }
        }
        i6 |= 1572864;
        str3 = str2;
        if ((12582912 & i) != 0) {
            i6 |= ((i2 & 128) == 0 || !ux2Var.f(qj8Var)) ? 4194304 : 8388608;
        }
        i11 = i6 | 100663296;
        if ((i11 & 38347923) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (ux2Var.N(i11 & 1, z)) {
            ux2Var.S();
            if ((i & 1) != 0) {
                if (i13 != 0) {
                    fs4Var2 = cs4.b;
                }
                if (i4 != 0) {
                    ud5Var3 = null;
                } else {
                    ud5Var3 = ud5Var;
                }
                if (i7 == 0) {
                }
                if (i9 != 0) {
                    str3 = "";
                }
                if ((i2 & 128) != 0) {
                    qj8VarA = n08.a(ux2Var);
                    i11 &= -29360129;
                } else {
                    qj8VarA = qj8Var;
                }
                qj8Var3 = qj8VarA;
                ud5Var4 = ud5Var3;
                i12 = i11;
                list3 = list4;
                fs4Var4 = fs4Var2;
            } else {
                if (i13 != 0) {
                    fs4Var2 = cs4.b;
                }
                if (i4 != 0) {
                    ud5Var3 = null;
                } else {
                    ud5Var3 = ud5Var;
                }
                if (i7 == 0) {
                }
                if (i9 != 0) {
                    str3 = "";
                }
                if ((i2 & 128) != 0) {
                    qj8VarA = n08.a(ux2Var);
                    i11 &= -29360129;
                } else {
                    qj8VarA = qj8Var;
                }
                qj8Var3 = qj8VarA;
                ud5Var4 = ud5Var3;
                i12 = i11;
                list3 = list4;
                fs4Var4 = fs4Var2;
            }
            ux2Var.q();
            pd5 pd5Var4 = n08.a;
            h72 h72Var4 = vf2.a;
            ud5 ud5Var8 = ud5Var4;
            List list8 = list3;
            String str8 = str3;
            fs4 fs4Var8 = fs4Var4;
            int i17 = i12 >> 3;
            qj8 qj8Var7 = qj8Var3;
            qr.e(au8.O(1932165422, new bs5(str8, str, (byte) 3), ux2Var), fs4Var8, au8.O(-63137300, new xl7(ud5Var8, function0, str8, (byte) 0), ux2Var), au8.O(1349495203, new sd(list8, str8, (byte) 16), ux2Var), 0.0f, qj8Var7, n08.b(((tf2) ux2Var.j(h72Var4)).k, ((tf2) ux2Var.j(h72Var4)).l, ((tf2) ux2Var.j(h72Var4)).l, ((tf2) ux2Var.j(h72Var4)).l, ux2Var, 34), null, ux2Var, (i17 & 112) | 3462 | (458752 & (i12 >> 6)) | (i17 & 29360128), 272);
            str4 = str8;
            fs4Var3 = fs4Var8;
            qj8Var2 = qj8Var7;
            ud5Var2 = ud5Var8;
            list2 = list8;
        } else {
            ux2Var.Q();
            ud5Var2 = ud5Var;
            qj8Var2 = qj8Var;
            list2 = list3;
            fs4Var3 = fs4Var2;
            str4 = str3;
        }
        j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new za4(str, function0, fs4Var3, ud5Var2, list2, str4, qj8Var2, i, i2);
        }
    }

    public static final void d(l08 l08Var, fs4 fs4Var, String str, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        String strA;
        ux2Var.Y(-1701238229);
        int i2 = i | (ux2Var.f(l08Var) ? 4 : 2) | 48 | (ux2Var.f(str) ? 256 : 128);
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            m78 m78Var = l08Var.a;
            if (m78Var == null) {
                ux2Var.W(-973809460);
                ux2Var.p(false);
                strA = null;
            } else {
                ux2Var.W(1492607445);
                strA = m78Var.a(ux2Var);
                ux2Var.p(false);
            }
            if (strA == null) {
                strA = "";
            }
            boolean zBooleanValue = ((Boolean) l08Var.e.getValue()).booleanValue();
            boolean zF = ux2Var.f(strA);
            Object objK = ux2Var.K();
            Object obj = e01.a;
            if (zF || objK == obj) {
                objK = new fy(strA, (byte) 22);
                ux2Var.g0(objK);
            }
            cs4 cs4Var = cs4.b;
            fs4 fs4VarA = androidx.compose.ui.platform.a.a(cp6.a(cs4Var, false, (Function1) objK), str + "-TopAppBarActionItemView");
            boolean z = (i2 & 14) == 4;
            Object objK2 = ux2Var.K();
            if (z || objK2 == obj) {
                objK2 = new y26(l08Var, (byte) 26);
                ux2Var.g0(objK2);
            }
            xo1.k((Function0) objK2, fs4VarA, zBooleanValue, null, null, au8.O(718923337, new gg4(l08Var, (byte) 23), ux2Var), ux2Var, 1572864, 56);
            fs4Var2 = cs4Var;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new f9((byte) 29, i, l08Var, fs4Var2, str, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:29:0x0073  */
    /* JADX WARN: Code duplicated, block: B:32:0x0077  */
    /* JADX WARN: Code duplicated, block: B:35:0x007e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0083  */
    /* JADX WARN: Code duplicated, block: B:39:0x008a  */
    /* JADX WARN: Code duplicated, block: B:40:0x008c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0090  */
    /* JADX WARN: Code duplicated, block: B:46:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x009c  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b4  */
    public static final cv7 e(int i, pu7 pu7Var, List list, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        ce5 ce5Var = xz2.R;
        k76 k76Var = new k76();
        k76 k76Var2 = new k76();
        k76 k76Var3 = new k76();
        yu7 yu7Var = yu7.f2646o;
        yu7 yu7Var2 = yu7.n;
        yu7 yu7Var3 = yu7.m;
        if (i == 1 && i2 > 1) {
            pu7Var.a(yu7Var3);
            pu7Var.a(yu7Var2);
            pu7Var.a(yu7Var);
        }
        qu7 qu7Var = (qu7) lv0.w0(list);
        if (qu7Var != null) {
            pu7Var.a(qu7Var.a);
        }
        int size = list.size() - 1;
        int i3 = 0;
        if (size >= 0) {
            while (true) {
                int i4 = size - 1;
                yu7 yu7Var4 = ((qu7) list.get(size)).a;
                boolean z4 = i3 < i;
                if (z4) {
                    if (f(k76Var, k76Var2, k76Var3, yu7Var4) == null) {
                        pu7Var.a(yu7Var4);
                        if (z4) {
                            g(k76Var, k76Var2, k76Var3, yu7Var4);
                            i3++;
                        }
                    }
                    if (i4 < 0) {
                        if (i3 < i) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            if (f(k76Var, k76Var2, k76Var3, yu7Var3) == null) {
                                pu7Var.a(yu7Var3);
                                if (z) {
                                    g(k76Var, k76Var2, k76Var3, yu7Var3);
                                    i3++;
                                }
                            }
                            if (i3 < i) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                if (f(k76Var, k76Var2, k76Var3, yu7Var2) == null) {
                                    pu7Var.a(yu7Var2);
                                    if (z2) {
                                        g(k76Var, k76Var2, k76Var3, yu7Var2);
                                        i3++;
                                    }
                                }
                                z3 = i3 < i;
                                if (z3 && f(k76Var, k76Var2, k76Var3, yu7Var) == null) {
                                    pu7Var.a(yu7Var);
                                    if (z3) {
                                        g(k76Var, k76Var2, k76Var3, yu7Var);
                                    }
                                }
                            }
                        }
                    } else {
                        size = i4;
                    }
                }
            }
        } else {
            if (i3 < i) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (f(k76Var, k76Var2, k76Var3, yu7Var3) == null) {
                    pu7Var.a(yu7Var3);
                    if (z) {
                        g(k76Var, k76Var2, k76Var3, yu7Var3);
                        i3++;
                    }
                }
                if (i3 < i) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (f(k76Var, k76Var2, k76Var3, yu7Var2) == null) {
                        pu7Var.a(yu7Var2);
                        if (z2) {
                            g(k76Var, k76Var2, k76Var3, yu7Var2);
                            i3++;
                        }
                    }
                    if (i3 < i) {
                    }
                    if (z3) {
                        pu7Var.a(yu7Var);
                        if (z3) {
                            g(k76Var, k76Var2, k76Var3, yu7Var);
                        }
                    }
                }
            }
        }
        ce5 ce5Var2 = (ce5) k76Var.m;
        if (ce5Var2 == null) {
            ce5Var2 = ce5Var;
        }
        ce5 ce5Var3 = (ce5) k76Var2.m;
        if (ce5Var3 == null) {
            ce5Var3 = ce5Var;
        }
        ce5 ce5Var4 = (ce5) k76Var3.m;
        if (ce5Var4 != null) {
            ce5Var = ce5Var4;
        }
        return new cv7(ce5Var2, ce5Var3, ce5Var, qu7Var != null ? qu7Var.a : null);
    }

    public static final ce5 f(k76 k76Var, k76 k76Var2, k76 k76Var3, yu7 yu7Var) {
        int iOrdinal = yu7Var.ordinal();
        if (iOrdinal == 0) {
            return (ce5) k76Var.m;
        }
        if (iOrdinal == 1) {
            return (ce5) k76Var2.m;
        }
        if (iOrdinal == 2) {
            return (ce5) k76Var3.m;
        }
        gk0.s();
        return null;
    }

    public static final void g(k76 k76Var, k76 k76Var2, k76 k76Var3, yu7 yu7Var) {
        be5 be5Var = xz2.Q;
        int iOrdinal = yu7Var.ordinal();
        if (iOrdinal == 0) {
            k76Var.m = be5Var;
            return;
        }
        if (iOrdinal == 1) {
            k76Var2.m = be5Var;
        } else if (iOrdinal == 2) {
            k76Var3.m = be5Var;
        } else {
            gk0.s();
        }
    }

    public static zo4 h(String str, Collection collection) {
        zo4 mm0Var;
        collection.getClass();
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(mv0.Z(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(((oz3) it.next()).I());
        }
        u17 u17VarK = yo1.K(arrayList);
        int i = u17VarK.m;
        if (i != 0) {
            mm0Var = i != 1 ? new mm0(str, (zo4[]) u17VarK.toArray(new zo4[0])) : (zo4) u17VarK.get(0);
        } else {
            mm0Var = yo4.b;
        }
        return u17VarK.m <= 1 ? mm0Var : new d54(mm0Var);
    }

    public static final void i(k13 k13Var, ac8 ac8Var) {
        ArrayList arrayList = ac8Var.v;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            cc8 cc8Var = (cc8) arrayList.get(i);
            if (cc8Var instanceof dc8) {
                yg5 yg5Var = new yg5();
                dc8 dc8Var = (dc8) cc8Var;
                yg5Var.d = dc8Var.n;
                yg5Var.n = true;
                yg5Var.c();
                yg5Var.s.a.setFillType(dc8Var.f609o == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
                yg5Var.c();
                yg5Var.c();
                yg5Var.b = dc8Var.p;
                yg5Var.c();
                yg5Var.c = dc8Var.q;
                yg5Var.c();
                yg5Var.g = dc8Var.r;
                yg5Var.c();
                yg5Var.e = dc8Var.s;
                yg5Var.c();
                yg5Var.f = dc8Var.t;
                yg5Var.f2606o = true;
                yg5Var.c();
                yg5Var.h = dc8Var.u;
                yg5Var.f2606o = true;
                yg5Var.c();
                yg5Var.i = dc8Var.v;
                yg5Var.f2606o = true;
                yg5Var.c();
                yg5Var.j = dc8Var.w;
                yg5Var.f2606o = true;
                yg5Var.c();
                yg5Var.k = dc8Var.x;
                yg5Var.p = true;
                yg5Var.c();
                yg5Var.l = dc8Var.y;
                yg5Var.p = true;
                yg5Var.c();
                yg5Var.m = dc8Var.z;
                yg5Var.p = true;
                yg5Var.c();
                k13Var.e(i, yg5Var);
            } else if (cc8Var instanceof ac8) {
                k13 k13Var2 = new k13();
                ac8 ac8Var2 = (ac8) cc8Var;
                k13Var2.k = ac8Var2.m;
                k13Var2.c();
                k13Var2.l = ac8Var2.n;
                k13Var2.s = true;
                k13Var2.c();
                k13Var2.f1220o = ac8Var2.q;
                k13Var2.s = true;
                k13Var2.c();
                k13Var2.p = ac8Var2.r;
                k13Var2.s = true;
                k13Var2.c();
                k13Var2.q = ac8Var2.s;
                k13Var2.s = true;
                k13Var2.c();
                k13Var2.r = ac8Var2.t;
                k13Var2.s = true;
                k13Var2.c();
                k13Var2.m = ac8Var2.f315o;
                k13Var2.s = true;
                k13Var2.c();
                k13Var2.n = ac8Var2.p;
                k13Var2.s = true;
                k13Var2.c();
                k13Var2.f = ac8Var2.u;
                k13Var2.g = true;
                k13Var2.c();
                i(k13Var2, ac8Var2);
                k13Var.e(i, k13Var2);
            }
        }
    }

    public static void j(View view, mf8 mf8Var) {
        WeakHashMap weakHashMap = be8.a;
        int paddingStart = view.getPaddingStart();
        int paddingTop = view.getPaddingTop();
        int paddingEnd = view.getPaddingEnd();
        int paddingBottom = view.getPaddingBottom();
        nf8 nf8Var = new nf8();
        nf8Var.a = paddingStart;
        nf8Var.b = paddingTop;
        nf8Var.c = paddingEnd;
        nf8Var.d = paddingBottom;
        sd8.c(view, new lh7(mf8Var, nf8Var, (byte) 12));
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new lf8());
        }
    }

    public static float k(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.text.BreakIterator] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, o.iu] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final int l(int i, String str) {
        ?? r5;
        ?? r6;
        int spanEnd;
        a92 a92VarN = n();
        Integer num = null;
        if (a92VarN != null) {
            if (!(a92VarN.c() == 1)) {
                hk0.l("Not initialized yet");
                return 0;
            }
            io1.A(str, "charSequence cannot be null");
            ?? r4 = a92VarN.e.b;
            r4.getClass();
            if (i < 0 || i >= str.length()) {
                r6 = str;
                spanEnd = -1;
            } else if (str instanceof Spanned) {
                Spanned spanned = (Spanned) str;
                a68[] a68VarArr = (a68[]) spanned.getSpans(i, i + 1, a68.class);
                if (a68VarArr.length > 0) {
                    spanEnd = spanned.getSpanEnd(a68VarArr[0]);
                    r6 = str;
                } else {
                    ?? r7 = str;
                    spanEnd = ((m92) r4.K(r7, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new m92(i))).f1450o;
                    r6 = r7;
                }
            } else {
                ?? r8 = str;
                spanEnd = ((m92) r4.K(r8, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new m92(i))).f1450o;
                r6 = r8;
            }
            Integer numValueOf = Integer.valueOf(spanEnd);
            r5 = r6;
            if (spanEnd != -1) {
                num = numValueOf;
            }
        } else {
            r5 = str;
        }
        if (num != null) {
            r5 = r6;
            return num.intValue();
        }
        r5 = r6;
        ?? characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(r5);
        return characterInstance.following(i);
    }

    public static final int m(int i, String str) {
        a92 a92VarN = n();
        Integer num = null;
        if (a92VarN != null) {
            Integer numValueOf = Integer.valueOf(a92VarN.b(Math.max(0, i - 1), str));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    public static final a92 n() {
        if (!a92.d()) {
            return null;
        }
        a92 a92VarA = a92.a();
        if (a92VarA.c() == 1) {
            return a92VarA;
        }
        return null;
    }

    public static final ba8 o(String str) {
        str.getClass();
        int iAbs = Math.abs(str.hashCode());
        jc2 jc2Var = ba8.p;
        return (ba8) jc2Var.get(iAbs % jc2Var.a());
    }

    public static final boolean q(cv7 cv7Var, yu7 yu7Var) {
        return !cv7Var.a(yu7Var).equals(xz2.R);
    }

    public static final long r(float f, long j) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : rv0.b(rv0.c(j) * f, j);
    }

    public static PorterDuff.Mode s(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static final VectorPainter t(we3 we3Var, ux2 ux2Var) {
        in1 in1Var = (in1) ux2Var.j(b11.h);
        boolean zE = ux2Var.e((((long) Float.floatToRawIntBits(in1Var.getDensity())) & 4294967295L) | (((long) Float.floatToRawIntBits(we3Var.j)) << 32));
        Object objK = ux2Var.K();
        if (zE || objK == e01.a) {
            k13 k13Var = new k13();
            i(k13Var, we3Var.f);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(in1Var.d0(we3Var.b))) << 32) | (((long) Float.floatToRawIntBits(in1Var.d0(we3Var.c))) & 4294967295L);
            float fIntBitsToFloat = we3Var.d;
            float fIntBitsToFloat2 = we3Var.e;
            if (Float.isNaN(fIntBitsToFloat)) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            }
            if (Float.isNaN(fIntBitsToFloat2)) {
                fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
            VectorPainter vectorPainter = new VectorPainter(k13Var);
            String str = we3Var.a;
            long j = we3Var.g;
            t70 t70Var = j != 16 ? new t70(we3Var.h, j) : null;
            boolean z = we3Var.i;
            vectorPainter.r.setValue(new y07(jFloatToRawIntBits));
            vectorPainter.s.setValue(Boolean.valueOf(z));
            xb8 xb8Var = vectorPainter.t;
            xb8Var.g.setValue(t70Var);
            xb8Var.i.setValue(new y07(jFloatToRawIntBits2));
            xb8Var.c = str;
            ux2Var.g0(vectorPainter);
            objK = vectorPainter;
        }
        return (VectorPainter) objK;
    }

    public static String x(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (iIndexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, iIndexOf);
            sb.append(y(objArr[i]));
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(y(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String y(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String strG = fx3.g(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strG), (Throwable) e);
            return fx3.h("<", strG, " threw ", e.getClass().getName(), ">");
        }
    }

    public abstract void p();

    public abstract void u(boolean z);

    public abstract void v(boolean z);

    public abstract void w();
}
