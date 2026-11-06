package o;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSessionRecipientStatus;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSessionType;
import com.teamviewer.remotecontrolviewlib.activity.CopyrightActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class nv1 {
    public static int a;
    public static yt2 b;
    public static wj5 c;
    public static volatile yi5 d;

    public static final ov1 A(SharedPreferences sharedPreferences) {
        sharedPreferences.getClass();
        int i = sharedPreferences.getInt("KEY_SELECTED_DEVICE_TAB_CHIP", 0);
        if (i == 1) {
            return ov1.n;
        }
        if (i != 2) {
            return i != 3 ? ov1.m : ov1.p;
        }
        return ov1.f1680o;
    }

    public static final boolean B(rt3 rt3Var) {
        mj0 mj0VarT;
        mj0 mj0VarV;
        if (rt3Var instanceof ev3) {
            fw3 fw3Var = (fw3) rt3Var;
            Field fieldX = bt1.x(fw3Var);
            if (!(fieldX != null ? fieldX.isAccessible() : true)) {
                return false;
            }
            Method methodY = bt1.y(fw3Var.getGetter());
            if (!(methodY != null ? methodY.isAccessible() : true)) {
                return false;
            }
            Method methodY2 = bt1.y(((ev3) rt3Var).b());
            if (!(methodY2 != null ? methodY2.isAccessible() : true)) {
                return false;
            }
        } else if (rt3Var instanceof fw3) {
            fw3 fw3Var2 = (fw3) rt3Var;
            Field fieldX2 = bt1.x(fw3Var2);
            if (!(fieldX2 != null ? fieldX2.isAccessible() : true)) {
                return false;
            }
            Method methodY3 = bt1.y(fw3Var2.getGetter());
            if (!(methodY3 != null ? methodY3.isAccessible() : true)) {
                return false;
            }
        } else if (rt3Var instanceof rv3) {
            Field fieldX3 = bt1.x(((rv3) rt3Var).r());
            if (!(fieldX3 != null ? fieldX3.isAccessible() : true)) {
                return false;
            }
            Method methodY4 = bt1.y((pu3) rt3Var);
            if (!(methodY4 != null ? methodY4.isAccessible() : true)) {
                return false;
            }
        } else if (rt3Var instanceof lw3) {
            Field fieldX4 = bt1.x(((lw3) rt3Var).r());
            if (!(fieldX4 != null ? fieldX4.isAccessible() : true)) {
                return false;
            }
            Method methodY5 = bt1.y((pu3) rt3Var);
            if (!(methodY5 != null ? methodY5.isAccessible() : true)) {
                return false;
            }
        } else {
            if (!(rt3Var instanceof pu3)) {
                StringBuilder sb = new StringBuilder("Unknown callable: ");
                sb.append(rt3Var);
                Class<?> cls = rt3Var.getClass();
                sb.append(" (");
                sb.append(cls);
                sb.append(')');
                throw new UnsupportedOperationException(sb.toString());
            }
            pu3 pu3Var = (pu3) rt3Var;
            Method methodY6 = bt1.y(pu3Var);
            if (!(methodY6 != null ? methodY6.isAccessible() : true)) {
                return false;
            }
            vt3 vt3VarA = pa8.a(rt3Var);
            Object objB = (vt3VarA == null || (mj0VarV = vt3VarA.v()) == null) ? null : mj0VarV.b();
            AccessibleObject accessibleObject = objB instanceof AccessibleObject ? (AccessibleObject) objB : null;
            if (!(accessibleObject != null ? accessibleObject.isAccessible() : true)) {
                return false;
            }
            vt3 vt3VarA2 = pa8.a(pu3Var);
            Member memberB = (vt3VarA2 == null || (mj0VarT = vt3VarA2.t()) == null) ? null : mj0VarT.b();
            Constructor constructor = memberB instanceof Constructor ? (Constructor) memberB : null;
            if (!(constructor != null ? constructor.isAccessible() : true)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean C(Object obj) {
        return obj == xk0.m;
    }

    public static br4 E(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i = byteBufferDuplicate.getShort() & 65535;
        if (i > 100) {
            gk0.l("Cannot read metadata.");
            return null;
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j2 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = byteBufferDuplicate.getInt();
                long j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    byteBufferDuplicate.position((int) (j3 + j));
                    br4 br4Var = new br4();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    br4Var.p = byteBufferDuplicate;
                    br4Var.m = iPosition;
                    int i6 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    br4Var.n = i6;
                    br4Var.f988o = ((ByteBuffer) br4Var.p).getShort(i6);
                    return br4Var;
                }
            }
        }
        gk0.l("Cannot read metadata.");
        return null;
    }

    public static final he5 F(Function0 function0, boolean z, ux2 ux2Var) {
        at4 at4Var = he5.m;
        if (z) {
            ux2Var.W(-66051354);
            cv7 cv7Var = (cv7) function0.a();
            he5 he5VarI = I((ke5) cv7Var.f.getValue(), ea2.m, he5.l, qs1.L(ux2Var), at4Var, ux2Var, 0);
            ux2Var.p(false);
            return he5VarI;
        }
        ux2Var.W(-65987587);
        Object objK = ux2Var.K();
        if (objK == e01.a) {
            objK = new he5(new ie5(null, 15), at4Var);
            ux2Var.g0(objK);
        }
        he5 he5Var = (he5) objK;
        ux2Var.p(false);
        return he5Var;
    }

    public static final th3 G(String str, ux2 ux2Var, int i) {
        Object objK = ux2Var.K();
        if (objK == e01.a) {
            objK = new th3();
            ux2Var.g0(objK);
        }
        th3 th3Var = (th3) objK;
        th3Var.a(0, ux2Var);
        return th3Var;
    }

    public static final en3 H(Function0 function0, Function0 function1, Function0 function2, ux2 ux2Var) {
        function0.getClass();
        function1.getClass();
        function2.getClass();
        px4 px4VarT = h57.t(function0, ux2Var);
        px4 px4VarT2 = h57.t(function1, ux2Var);
        px4 px4VarT3 = h57.t(function2, ux2Var);
        Object objK = ux2Var.K();
        Object obj = e01.a;
        if (objK == obj) {
            objK = h57.p(null);
            ux2Var.g0(objK);
        }
        px4 px4Var = (px4) objK;
        byte b2 = 0;
        Object[] objArr = new Object[0];
        Object objK2 = ux2Var.K();
        if (objK2 == obj) {
            objK2 = new tg3((byte) 6);
            ux2Var.g0(objK2);
        }
        px4 px4Var2 = (px4) zu1.L(objArr, (Function0) objK2, ux2Var, 48);
        Object objK3 = ux2Var.K();
        if (objK3 == obj) {
            objK3 = new en3(new la(px4VarT, (byte) 26), new la(px4VarT2, (byte) 27), new la(px4VarT3, (byte) 28), new ua(px4Var, px4Var2, (byte) 1));
            ux2Var.g0(objK3);
        }
        en3 en3Var = (en3) objK3;
        if (!((Boolean) px4Var2.getValue()).booleanValue()) {
            ux2Var.W(922989144);
            ux2Var.p(false);
            return en3Var;
        }
        ux2Var.W(922556694);
        boolean zF = ux2Var.f(px4Var2);
        Object objK4 = ux2Var.K();
        if (zF || objK4 == obj) {
            objK4 = new fn3(px4Var2, px4Var, b2);
            ux2Var.g0(objK4);
        }
        Function0 function3 = (Function0) objK4;
        boolean zF2 = ux2Var.f(px4Var2) | ux2Var.f(px4VarT3);
        Object objK5 = ux2Var.K();
        if (zF2 || objK5 == obj) {
            objK5 = new n5((Object) px4VarT3, (Object) px4Var, (Object) px4Var2, (byte) 19);
            ux2Var.g0(objK5);
        }
        et1.b(0, function3, (Function0) objK5, ux2Var, null);
        ux2Var.p(false);
        return en3Var;
    }

    public static final he5 I(ke5 ke5Var, List list, rl2 rl2Var, zj1 zj1Var, Function1 function1, ux2 ux2Var, int i) {
        if ((i & 1) != 0) {
            ke5Var = z06.C;
        }
        if ((i & 2) != 0) {
            list = ea2.m;
        }
        Object obj = list;
        if ((i & 8) != 0) {
            rl2Var = he5.l;
        }
        Object obj2 = rl2Var;
        if ((i & 16) != 0) {
            zj1Var = qs1.L(ux2Var);
        }
        Object obj3 = zj1Var;
        if ((i & 32) != 0) {
            function1 = he5.m;
        }
        boolean zF = ux2Var.f(obj) | ux2Var.d(-1);
        Object objK = ux2Var.K();
        Object obj4 = e01.a;
        if (zF || objK == obj4) {
            objK = null;
            ux2Var.g0(null);
        }
        fe5 fe5Var = (fe5) objK;
        boolean zF2 = ux2Var.f(obj);
        Object objK2 = ux2Var.K();
        if (zF2 || objK2 == obj4) {
            ux2Var.g0(fe5Var);
            objK2 = fe5Var;
        }
        Object obj5 = (fe5) objK2;
        a65 a65VarB = vt1.B(new qo2((byte) 16), new at4((byte) 28));
        a65 a65VarB2 = vt1.B(new qo2((byte) 15), new at4((byte) 27));
        byte b2 = 0;
        Object[] objArr = new Object[0];
        a65 a65VarB3 = vt1.B(new u96(a65VarB, a65VarB2, b2), new v96(a65VarB, a65VarB2, b2));
        Object objK3 = ux2Var.K();
        if (objK3 == obj4) {
            objK3 = x00.x;
            ux2Var.g0(objK3);
        }
        Map map = (Map) zu1.O(objArr, a65VarB3, (Function0) objK3, ux2Var, 384);
        Object ie5Var = map.get(ke5Var);
        if (ie5Var == null) {
            ie5Var = new ie5(fe5Var, 7);
            map.put(ke5Var, ie5Var);
        }
        ie5 ie5Var2 = (ie5) ie5Var;
        l76 l76VarU = lv1.U(function1, ux2Var);
        l76VarU.a = function1;
        Object objK4 = ux2Var.K();
        if (objK4 == obj4) {
            objK4 = new he5(ie5Var2, new fj3((Object) l76VarU, (byte) 18));
            ux2Var.g0(objK4);
        }
        he5 he5Var = (he5) objK4;
        Object[] objArr2 = {ke5Var, obj, obj2, obj3};
        boolean zF3 = ux2Var.f(ie5Var2) | ux2Var.h(obj) | ux2Var.h(obj2) | ux2Var.f(obj3) | ux2Var.f(obj5);
        Object objK5 = ux2Var.K();
        if (zF3 || objK5 == obj4) {
            Object umVar = new um(he5Var, ie5Var2, obj, obj2, obj3, obj5, null, (byte) 4);
            ux2Var.g0(umVar);
            objK5 = umVar;
        }
        ck3.j(objArr2, (hw2) objK5, ux2Var);
        return he5Var;
    }

    public static final void J(rt3 rt3Var) {
        mj0 mj0VarT;
        mj0 mj0VarV;
        if (rt3Var instanceof ev3) {
            fw3 fw3Var = (fw3) rt3Var;
            Field fieldX = bt1.x(fw3Var);
            if (fieldX != null) {
                fieldX.setAccessible(true);
            }
            Method methodY = bt1.y(fw3Var.getGetter());
            if (methodY != null) {
                methodY.setAccessible(true);
            }
            Method methodY2 = bt1.y(((ev3) rt3Var).b());
            if (methodY2 != null) {
                methodY2.setAccessible(true);
                return;
            }
            return;
        }
        if (rt3Var instanceof fw3) {
            fw3 fw3Var2 = (fw3) rt3Var;
            Field fieldX2 = bt1.x(fw3Var2);
            if (fieldX2 != null) {
                fieldX2.setAccessible(true);
            }
            Method methodY3 = bt1.y(fw3Var2.getGetter());
            if (methodY3 != null) {
                methodY3.setAccessible(true);
                return;
            }
            return;
        }
        if (rt3Var instanceof rv3) {
            Field fieldX3 = bt1.x(((rv3) rt3Var).r());
            if (fieldX3 != null) {
                fieldX3.setAccessible(true);
            }
            Method methodY4 = bt1.y((pu3) rt3Var);
            if (methodY4 != null) {
                methodY4.setAccessible(true);
                return;
            }
            return;
        }
        if (rt3Var instanceof lw3) {
            Field fieldX4 = bt1.x(((lw3) rt3Var).r());
            if (fieldX4 != null) {
                fieldX4.setAccessible(true);
            }
            Method methodY5 = bt1.y((pu3) rt3Var);
            if (methodY5 != null) {
                methodY5.setAccessible(true);
                return;
            }
            return;
        }
        if (!(rt3Var instanceof pu3)) {
            StringBuilder sb = new StringBuilder("Unknown callable: ");
            sb.append(rt3Var);
            Class<?> cls = rt3Var.getClass();
            sb.append(" (");
            sb.append(cls);
            sb.append(')');
            throw new UnsupportedOperationException(sb.toString());
        }
        pu3 pu3Var = (pu3) rt3Var;
        Method methodY6 = bt1.y(pu3Var);
        if (methodY6 != null) {
            methodY6.setAccessible(true);
        }
        vt3 vt3VarA = pa8.a(rt3Var);
        Object objB = (vt3VarA == null || (mj0VarV = vt3VarA.v()) == null) ? null : mj0VarV.b();
        AccessibleObject accessibleObject = objB instanceof AccessibleObject ? (AccessibleObject) objB : null;
        if (accessibleObject != null) {
            accessibleObject.setAccessible(true);
        }
        vt3 vt3VarA2 = pa8.a(pu3Var);
        Member memberB = (vt3VarA2 == null || (mj0VarT = vt3VarA2.t()) == null) ? null : mj0VarT.b();
        Constructor constructor = memberB instanceof Constructor ? (Constructor) memberB : null;
        if (constructor != null) {
            constructor.setAccessible(true);
        }
    }

    public static final void M(List list, int i, in1 in1Var, j04 j04Var) {
        int size = list.size();
        long[] jArrCopyOf = size == 0 ? lg4.a : new long[size];
        int i2 = 0;
        int i3 = 0;
        for (Object obj : list) {
            int i4 = i2 + 1;
            if (i2 < 0) {
                qf0.U();
                throw null;
            }
            int iB = ((fe5) obj).b(i, in1Var);
            if (j04Var == j04.n) {
                iB = i - iB;
            }
            long j = (((long) iB) << 32) | (((long) i2) & 4294967295L);
            int i5 = i3 + 1;
            if (jArrCopyOf.length < i5) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i5, (jArrCopyOf.length * 3) / 2));
            }
            jArrCopyOf[i3] = j;
            i3++;
            jArrCopyOf = jArrCopyOf;
            i2 = i4;
        }
        if (i3 == 0) {
            return;
        }
        jArrCopyOf.getClass();
        Arrays.sort(jArrCopyOf, 0, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void N(r04 r04Var, Function1 function1) {
        e45 e45Var;
        if (((es4) r04Var).m.z && (e45Var = vn4.n0(r04Var, 2).J) != null) {
            e45Var.A1(function1, true);
        }
    }

    public static final long a(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0171  */
    public static final void b(boolean z, l33 l33Var, boolean z2, Function0 function0, Function0 function1, Function0 function2, fs4 fs4Var, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        long j;
        boolean z3;
        boolean z4;
        String strM;
        int i2;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(1580537669);
        int i3 = i | (ux2Var2.g(z) ? 4 : 2) | (ux2Var2.h(l33Var) ? 32 : 16) | (ux2Var2.g(z2) ? 256 : 128) | (ux2Var2.h(function0) ? 2048 : 1024) | (ux2Var2.h(function1) ? 16384 : 8192) | (ux2Var2.h(function2) ? 131072 : 65536) | 1572864;
        if (ux2Var2.N(i3 & 1, (599187 & i3) != 599186)) {
            k33 k33Var = l33Var.a;
            boolean z5 = k33Var instanceof h33;
            Object objK = ux2Var2.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = h57.p(Boolean.FALSE);
                ux2Var2.g0(objK);
            }
            px4 px4Var = (px4) objK;
            if (z2 && z) {
                ux2Var2.W(71659863);
                j = ((rn4) ux2Var2.j(un4.a)).a.G;
                ux2Var2.p(false);
            } else {
                ux2Var2.W(71734356);
                ux2Var2.p(false);
                j = rv0.g;
            }
            cs4 cs4Var = cs4.b;
            fs4 fs4VarS = au8.s(iq8.j(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), sf6.a(8.0f)), j, kh.V);
            boolean zG = ux2Var2.g(z5);
            Object objK2 = ux2Var2.K();
            if (zG || objK2 == awVar) {
                objK2 = new ld1((byte) 1, px4Var, z5);
                ux2Var2.g0(objK2);
            }
            fs4 fs4VarA = androidx.compose.ui.platform.a.a(ka0.C(androidx.compose.foundation.b.d(fs4VarS, (Function0) objK2, function0), 16.0f, 8.0f), "TVTA-devicesScreen-groupslist-groupItem");
            dg6 dg6VarA = cg6.a(iq8.a, xz2.y, ux2Var2, 48);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS2 = uf0.s(ux2Var2, fs4VarA);
            yz0.c.getClass();
            ux2Var2.a0();
            boolean z6 = ux2Var2.S;
            tg3 tg3Var = LayoutNode.e0;
            if (z6) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            iz0 iz0Var = d82.v;
            o67.n(dg6VarA, iz0Var, ux2Var2);
            iz0 iz0Var2 = d82.u;
            o67.n(yj5VarL, iz0Var2, ux2Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            iz0 iz0Var3 = d82.w;
            o67.n(numValueOf, iz0Var3, ux2Var2);
            o67.l(ux2Var2);
            iz0 iz0Var4 = d82.t;
            o67.n(fs4VarS2, iz0Var4, ux2Var2);
            if (k33Var instanceof h33) {
                z3 = z5;
                z4 = false;
                strM = to7.m(ux2Var2, 793076529, R.string.all_managed_group_label, ux2Var2, false);
            } else {
                z3 = z5;
                z4 = false;
                ux2Var2.W(793079178);
                ux2Var2.p(false);
                strM = l33Var.b;
                if (strM == null) {
                    strM = "";
                }
            }
            if (k33Var == null) {
                i2 = R.drawable.ic_group_managed;
            } else if (k33Var instanceof i33) {
                i2 = R.drawable.ic_group_legacy;
            } else if (k33Var instanceof h33) {
                i2 = R.drawable.ic_all_managed_devices_group;
            } else {
                i2 = R.drawable.ic_group_managed;
            }
            String str = strM;
            boolean z7 = z4;
            boolean z8 = z3;
            td3.a(b77.p(i2, ux2Var2), m77.z(R.string.device_tab_group_item_content_description, ux2Var2), null, rv0.h, ux2Var2, 3072, 4);
            fs4 fs4VarF = ka0.F(cs4Var, 16.0f, 0.0f, 8.0f, 0.0f, 10).f(new s14(1.0f, true));
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var2, z7 ? 1 : 0);
            int iHashCode2 = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL2 = ux2Var2.l();
            fs4 fs4VarS3 = uf0.s(ux2Var2, fs4VarF);
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            o67.n(kw0VarA, iz0Var, ux2Var2);
            o67.n(yj5VarL2, iz0Var2, ux2Var2);
            e41.r(iHashCode2, ux2Var2, iz0Var3, ux2Var2);
            o67.n(fs4VarS3, iz0Var4, ux2Var2);
            qs7.b(str, androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-groupsList-title"), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ((rn4) ux2Var2.j(un4.a)).b.j, ux2Var, 48, 24960, 110588);
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
            if (z8) {
                ux2Var2.W(-1183136319);
                ux2Var2.p(z7);
            } else {
                ux2Var2.W(-1183391945);
                boolean zBooleanValue = ((Boolean) px4Var.getValue()).booleanValue();
                Object objK3 = ux2Var2.K();
                if (objK3 == awVar) {
                    objK3 = new va(px4Var, (byte) 15);
                    ux2Var2.g0(objK3);
                }
                Function1 function3 = (Function1) objK3;
                int i4 = i3 >> 12;
                vs1.d(function1, function2, zBooleanValue, function3, null, null, ux2Var, (i4 & 14) | 3072 | (i4 & 112), 48);
                ux2Var2 = ux2Var;
                ux2Var2.p(z7);
            }
            ux2Var2.p(true);
            fs4Var2 = cs4Var;
        } else {
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new r23(z, l33Var, z2, function0, function1, function2, fs4Var2, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r27v0, types: [o.hc1] */
    public static final void c(final boolean z, final Function1 function1, final List list, final fs4 fs4Var, final Function1 function2, final k33 k33Var, e43 e43Var, ux2 ux2Var, final int i) {
        int i2;
        final e43 e43Var2;
        int i3;
        e43 e43Var3;
        Object ko2Var;
        px4 px4Var;
        aw awVar;
        int i4;
        ux2 ux2Var2;
        fs4 fs4Var2;
        px4 px4Var2;
        w44 w44Var;
        boolean z2;
        function1.getClass();
        list.getClass();
        ux2Var.Y(-870271730);
        if ((i & 6) == 0) {
            i2 = (ux2Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.h(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? ux2Var.f(list) : ux2Var.h(list) ? 256 : 128;
        }
        if ((i & 24576) == 0) {
            i2 |= ux2Var.h(function2) ? 16384 : 8192;
        }
        int i5 = i2 | (ux2Var.f(k33Var) ? 131072 : 65536) | 524288;
        byte b2 = 1;
        if (ux2Var.N(i5 & 1, (599187 & i5) != 599186)) {
            ux2Var.S();
            if ((i & 1) == 0 || ux2Var.x()) {
                dl5 dl5Var = new dl5(new uf2((byte) 15), b2);
                we8 we8VarA = id4.a(ux2Var);
                if (we8VarA == null) {
                    hk0.l("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    i3 = i5 & (-3670017);
                    e43Var3 = (e43) g57.t(w86.a.b(e43.class), we8VarA, null, dl5Var, h57.k(we8VarA), ux2Var);
                }
            } else {
                ux2Var.Q();
                i3 = i5 & (-3670017);
                e43Var3 = e43Var;
            }
            r15.q();
            Object objK = r15.K();
            aw awVar2 = e01.a;
            if (objK == awVar2) {
                objK = ck3.w(r15);
                ux2Var.g0(objK);
            }
            me1 me1Var = (me1) objK;
            px4 px4VarV = et1.v(e43Var3.f678o, r15);
            px4 px4VarT = h57.t(function1, r15);
            px4 px4VarV2 = et1.v(e43Var3.w, r15);
            px4 px4VarT2 = h57.t(function2, r15);
            px4 px4VarV3 = et1.v(e43Var3.s, r15);
            w44 w44VarA = z44.a(((Number) et1.v(e43Var3.p, r15).getValue()).intValue(), ((Number) et1.v(e43Var3.q, r15).getValue()).intValue(), r15, 0);
            Object[] objArr = new Object[0];
            boolean zF = r15.f(px4VarV);
            Object objK2 = r15.K();
            if (zF || objK2 == awVar2) {
                objK2 = new b5(px4VarV, (byte) 3);
                r15.g0(objK2);
            }
            px4 px4Var3 = (px4) zu1.L(objArr, (Function0) objK2, r15, 0);
            Object objK3 = r15.K();
            hc1 hc1Var = null;
            if (objK3 == awVar2) {
                objK3 = new l5(2, hc1Var, (byte) 11);
                r15.g0(objK3);
            }
            f88 f88Var = f88.a;
            ck3.i(f88Var, (hw2) objK3, r15);
            boolean zH = r15.h(e43Var3) | ((i3 & 896) == 256 || ((i3 & 512) != 0 && r15.h(list)));
            Object objK4 = r15.K();
            if (zH || objK4 == awVar2) {
                objK4 = new i9(e43Var3, list, null, (byte) 14);
                r15.g0(objK4);
            }
            ck3.i(list, (hw2) objK4, r15);
            Boolean boolValueOf = Boolean.valueOf(z);
            List list2 = (List) px4VarV2.getValue();
            int i6 = i3 & 14;
            int i7 = i3 & 458752;
            boolean zF2 = (i6 == 4) | (i7 == 131072) | r15.f(px4VarV2) | r15.f(px4VarT);
            Object objK5 = r15.K();
            if (zF2 || objK5 == awVar2) {
                px4Var = px4VarV2;
                awVar = awVar2;
                i4 = i3;
                ux2Var2 = r15;
                ko2Var = new ko2(z, k33Var, px4Var, px4VarT, null, (byte) 5);
                ux2Var2.g0(ko2Var);
            } else {
                px4Var = px4VarV2;
                awVar = awVar2;
                i4 = i3;
                ko2Var = objK5;
                ux2Var2 = r15;
            }
            ck3.h(boolValueOf, list2, (hw2) ko2Var, ux2Var2);
            boolean zH2 = ux2Var2.h(e43Var3) | ux2Var2.f(px4VarT2);
            Object objK6 = ux2Var2.K();
            if (zH2 || objK6 == awVar) {
                fs4Var2 = null;
                objK6 = new oa1((Object) e43Var3, (Object) px4VarT2, (hc1) (0 == true ? 1 : 0), (byte) 23);
                ux2Var2.g0(objK6);
            } else {
                fs4Var2 = null;
            }
            ck3.i(f88Var, (hw2) objK6, ux2Var2);
            l67 l67Var = (l67) px4VarV.getValue();
            boolean zF3 = ux2Var2.f(px4Var3) | ux2Var2.f(px4VarV) | ux2Var2.f(w44VarA);
            Object objK7 = ux2Var2.K();
            if (zF3 || objK7 == awVar) {
                px4Var2 = px4VarV;
                objK7 = new ko2((Object) w44VarA, (Object) px4Var3, (Object) px4Var2, (hc1) fs4Var2, (byte) 6);
                ux2Var2.g0(objK7);
            } else {
                px4Var2 = px4VarV;
            }
            ck3.i(l67Var, (hw2) objK7, ux2Var2);
            boolean zH3 = ux2Var2.h(e43Var3) | ux2Var2.f(w44VarA);
            Object objK8 = ux2Var2.K();
            if (zH3 || objK8 == awVar) {
                objK8 = new g0(e43Var3, w44VarA, (byte) 29);
                ux2Var2.g0(objK8);
            }
            ck3.e(f88Var, (Function1) objK8, ux2Var2);
            FillElement fillElement = androidx.compose.foundation.layout.b.c;
            fs4 fs4VarF = fs4Var.f(fillElement);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var2, 0);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4VarF);
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
            l67 l67Var2 = (l67) px4Var2.getValue();
            boolean zH4 = ux2Var2.h(e43Var3);
            Object objK9 = ux2Var2.K();
            if (zH4 || objK9 == awVar) {
                objK9 = new zz0(e43Var3, (byte) 21);
                ux2Var2.g0(objK9);
            }
            d(l67Var2, (Function0) objK9, fs4Var2, ux2Var2, 0);
            fs4 fs4VarD = ka0.D(fillElement, 0.0f, 0.0f, 2);
            pd5 pd5VarJ = ka0.j(0.0f, 0.0f, 0.0f, 121.0f, 7);
            ew ewVar = new ew(8.0f, new hk0((byte) 2));
            boolean zF4 = ux2Var2.f(px4Var) | (i6 == 4) | (i7 == 131072) | ux2Var2.h(me1Var) | ux2Var2.f(w44VarA) | ((i4 & 112) == 32) | ux2Var2.h(e43Var3);
            Object objK10 = ux2Var2.K();
            if (zF4 || objK10 == awVar) {
                w44Var = w44VarA;
                e43Var2 = e43Var3;
                z2 = true;
                y90 y90Var = new y90(px4Var, z, k33Var, me1Var, w44Var, function1, e43Var2);
                ux2Var2.g0(y90Var);
                objK10 = y90Var;
            } else {
                w44Var = w44VarA;
                e43Var2 = e43Var3;
                z2 = true;
            }
            ux2 ux2Var3 = ux2Var2;
            yo1.i(24966, 488, (Function1) objK10, null, null, ewVar, null, ux2Var3, w44Var, fs4VarD, pd5VarJ, false);
            ux2Var3.p(z2);
            i13 i13Var = (i13) px4VarV3.getValue();
            boolean zH5 = ux2Var3.h(e43Var2);
            Object objK11 = ux2Var3.K();
            if (zH5 || objK11 == awVar) {
                objK11 = new ew1(1, e43Var2, e43.class, "setRenameGroupText", "setRenameGroupText(Ljava/lang/String;)V", 0, (byte) 22);
                ux2Var3.g0(objK11);
            }
            Function1 function3 = (Function1) ((pu3) objK11);
            boolean zH6 = ux2Var3.h(e43Var2);
            Object objK12 = ux2Var3.K();
            if (zH6 || objK12 == awVar) {
                objK12 = new ax1(0, e43Var2, e43.class, "confirmRenameGroup", "confirmRenameGroup()V", 0, (byte) 14);
                ux2Var3.g0(objK12);
            }
            Function0 function0 = (Function0) ((pu3) objK12);
            boolean zH7 = ux2Var3.h(e43Var2);
            Object objK13 = ux2Var3.K();
            if (zH7 || objK13 == awVar) {
                objK13 = new ax1(0, e43Var2, e43.class, "confirmDeleteGroup", "confirmDeleteGroup()V", 0, (byte) 15);
                ux2Var3.g0(objK13);
            }
            Function0 function4 = (Function0) ((pu3) objK13);
            boolean zH8 = ux2Var3.h(e43Var2);
            Object objK14 = ux2Var3.K();
            if (zH8 || objK14 == awVar) {
                objK14 = new ax1(0, e43Var2, e43.class, "dismissDialog", "dismissDialog()V", 0, (byte) 16);
                ux2Var3.g0(objK14);
            }
            us1.e(i13Var, function3, function0, function4, (Function0) ((pu3) objK14), ux2Var3, 0);
        } else {
            ux2Var.Q();
            e43Var2 = e43Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.z33
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    nv1.c(z, function1, list, fs4Var, function2, k33Var, e43Var2, (ux2) obj, yo1.Y(i | 1));
                    return f88.a;
                }
            };
        }
    }

    public static final void d(l67 l67Var, Function0 function0, fs4 fs4Var, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(-1081348195);
        byte b2 = 2;
        int i2 = i | (ux2Var2.d(l67Var.ordinal()) ? 4 : 2) | (ux2Var2.h(function0) ? 32 : 16) | 384;
        if (ux2Var2.N(i2 & 1, (i2 & 147) != 146)) {
            cs4 cs4Var = cs4.b;
            fs4 fs4VarB = ka0.B(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 8.0f);
            cw cwVar = iq8.g;
            x50 x50Var = xz2.y;
            dg6 dg6VarA = cg6.a(cwVar, x50Var, ux2Var2, 54);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4VarB);
            yz0.c.getClass();
            ux2Var2.a0();
            boolean z = ux2Var2.S;
            tg3 tg3Var = LayoutNode.e0;
            if (z) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            iz0 iz0Var = d82.v;
            o67.n(dg6VarA, iz0Var, ux2Var2);
            iz0 iz0Var2 = d82.u;
            o67.n(yj5VarL, iz0Var2, ux2Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            iz0 iz0Var3 = d82.w;
            o67.n(numValueOf, iz0Var3, ux2Var2);
            o67.l(ux2Var2);
            iz0 iz0Var4 = d82.t;
            o67.n(fs4VarS, iz0Var4, ux2Var2);
            i97 i97VarA = vm.a(l67Var == l67.m ? 0.0f : 180.0f, null, "sortRotation", ux2Var2, 3072, 22);
            fs4 fs4VarA = androidx.compose.ui.platform.a.a(ka0.C(androidx.compose.foundation.b.b(iq8.j(cs4Var, sf6.a(8.0f)), false, null, null, function0, 15), 8.0f, 6.0f), "TVTA-devicesScreen-sortingItem");
            dg6 dg6VarA2 = cg6.a(new ew(8.0f, new hk0(b2)), x50Var, ux2Var2, 54);
            int iHashCode2 = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL2 = ux2Var2.l();
            fs4 fs4VarS2 = uf0.s(ux2Var2, fs4VarA);
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            o67.n(dg6VarA2, iz0Var, ux2Var2);
            o67.n(yj5VarL2, iz0Var2, ux2Var2);
            e41.r(iHashCode2, ux2Var2, iz0Var3, ux2Var2);
            o67.n(fs4VarS2, iz0Var4, ux2Var2);
            String strZ = m77.z(R.string.sort_name_label, ux2Var2);
            h72 h72Var = un4.a;
            qs7.b(strZ, androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-sortingLabel"), ((rn4) ux2Var2.j(h72Var)).a.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(h72Var)).b.m, ux2Var, 48, 0, 131064);
            td3.a(b77.p(R.drawable.ic_sort, ux2Var), m77.z(R.string.sort_group_content_description, ux2Var), androidx.compose.ui.platform.a.a(io1.e0(cs4Var, ((Number) i97VarA.getValue()).floatValue()), "TVTA-devicesScreen-sortingIcon"), ((rn4) ux2Var.j(h72Var)).a.s, ux2Var, 0, 0);
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
            ux2Var2.p(true);
            fs4Var2 = cs4Var;
        } else {
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new f9((Object) l67Var, (Object) function0, (Object) fs4Var2, i, (byte) 12);
        }
    }

    public static final void e(int i, String str, Function0 function0, Function1 function1, ux2 ux2Var, fs4 fs4Var, xy6 xy6Var) {
        fs4 fs4Var2;
        xy6 xy6Var2;
        int i2;
        xy6 xy6VarR;
        fs4 fs4Var3;
        str.getClass();
        function1.getClass();
        function0.getClass();
        ux2Var.Y(-763664304);
        int i3 = 2;
        int i4 = i | (ux2Var.f(str) ? 4 : 2) | (ux2Var.h(function1) ? 32 : 16) | (ux2Var.h(function0) ? 256 : 128) | 11264;
        if (ux2Var.N(i4 & 1, (i4 & 9363) != 9362)) {
            ux2Var.S();
            if ((i & 1) == 0 || ux2Var.x()) {
                i2 = i4 & (-57345);
                xy6VarR = yo1.R(null, ux2Var, 6, 2);
                fs4Var3 = cs4.b;
            } else {
                ux2Var.Q();
                xy6VarR = xy6Var;
                i2 = i4 & (-57345);
                fs4Var3 = fs4Var;
            }
            ux2Var.q();
            List listL = qf0.L(new vv6(m77.z(R.string.settings_biometric_timeout_Immediately, ux2Var), ew6.OnBiometricsAdjustedImmediately, "TVTA-settings-lockApp-immediately", i3), new vv6(m77.z(R.string.settings_biometric_timeout_After1min, ux2Var), ew6.OnBiometricsAdjusted1min, "TVTA-settings-lockApp-after1min", i3), new vv6(m77.z(R.string.settings_biometric_timeout_After5min, ux2Var), ew6.OnBiometricsAdjusted5min, "TVTA-settings-lockApp-after5min", i3), new vv6(m77.z(R.string.settings_biometric_timeout_After10min, ux2Var), ew6.OnBiometricsAdjusted10min, "TVTA-settings-lockApp-after10min", i3));
            Object[] objArr = {str};
            boolean z = (i2 & 14) == 4;
            Object objK = ux2Var.K();
            if (z || objK == e01.a) {
                objK = new lz1(str, (byte) 3);
                ux2Var.g0(objK);
            }
            px4 px4Var = (px4) zu1.L(objArr, (Function0) objK, ux2Var, 0);
            xy6 xy6Var3 = xy6VarR;
            fs4 fs4Var4 = fs4Var3;
            yo1.k(function0, fs4Var4, xy6Var3, 0.0f, false, null, 0L, 0L, 0L, null, null, null, au8.O(-1664448846, new od4(listL, (String) px4Var.j(), px4Var.c(), function1, function0, xy6VarR, (byte) 0), ux2Var), ux2Var, (i2 >> 6) & 1022, 3072, 8184);
            fs4Var2 = fs4Var4;
            xy6Var2 = xy6Var3;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
            xy6Var2 = xy6Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new fx0(str, function1, function0, fs4Var2, xy6Var2, i);
        }
    }

    public static final void f(int i, Function0 function0, Function0 function1, ux2 ux2Var, fs4 fs4Var, boolean z) {
        int i2;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(1219575006);
        byte b2 = 4;
        if ((i & 6) == 0) {
            i2 = (ux2Var2.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= ux2Var2.h(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ux2Var2.h(function1) ? 2048 : 1024;
        }
        byte b3 = 1;
        if (ux2Var2.N(i3 & 1, (i3 & 1171) != 1170)) {
            Object[] objArr = new Object[0];
            Object objK = ux2Var2.K();
            aw awVar = e01.a;
            byte b4 = 6;
            if (objK == awVar) {
                objK = new w26(b4);
                ux2Var2.g0(objK);
            }
            px4 px4Var = (px4) zu1.L(objArr, (Function0) objK, ux2Var2, 48);
            cs4 cs4Var = cs4.b;
            fs4 fs4VarF = ka0.F(cs4Var, 0.0f, 0.0f, 12.0f, 0.0f, 11);
            do4 do4VarC = ua0.c(xz2.f2564o, false);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4VarF);
            yz0.c.getClass();
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(LayoutNode.e0);
            } else {
                ux2Var2.j0();
            }
            o67.n(do4VarC, d82.v, ux2Var2);
            o67.n(yj5VarL, d82.u, ux2Var2);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
            o67.l(ux2Var2);
            o67.n(fs4VarS, d82.t, ux2Var2);
            fs4 fs4VarL = androidx.compose.foundation.layout.b.l(cs4Var, 40.0f);
            boolean zF = ux2Var2.f(px4Var);
            Object objK2 = ux2Var2.K();
            if (zF || objK2 == awVar) {
                objK2 = new j44(px4Var, b2);
                ux2Var2.g0(objK2);
            }
            xo1.k((Function0) objK2, fs4VarL, z, null, null, au8.O(1228227458, new bn1(b3, z), ux2Var2), ux2Var2, ((i3 << 6) & 896) | 1572912, 56);
            long j = ((rn4) ux2Var2.j(un4.a)).a.p;
            boolean zBooleanValue = ((Boolean) px4Var.getValue()).booleanValue();
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(-16.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
            boolean zF2 = ux2Var2.f(px4Var);
            Object objK3 = ux2Var2.K();
            if (zF2 || objK3 == awVar) {
                objK3 = new j44(px4Var, (byte) 5);
                ux2Var2.g0(objK3);
            }
            fs4Var = cs4Var;
            jj.a(zBooleanValue, (Function0) objK3, null, jFloatToRawIntBits, null, null, null, j, 0.0f, au8.O(1627119305, new c91(function0, px4Var, function1), ux2Var2), ux2Var, 3072, 1908);
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
        } else {
            ux2Var2.Q();
        }
        fs4 fs4Var2 = fs4Var;
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new w46(i, function0, function1, fs4Var2, z);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r2v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v1 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r37v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r37v0 ??, new type: o.ux2
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r38v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r38v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to set immutable type for var: r37v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r37v0 ??, new type: o.ux2
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to set immutable type for var: r38v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r38v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v0 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public static final void g(o.fs4 r25, o.hw2 r26, o.hw2 r27, o.hw2 r28, o.hw2 r29, int r30, long r31, long r33, o.qj8 r35, o.yy0 r36, o.ux2 r37, int r38, int r39) {
        /*
            Method dump skipped, instruction units count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.nv1.g(o.fs4, o.hw2, o.hw2, o.hw2, o.hw2, int, long, long, o.qj8, o.yy0, o.ux2, int, int):void");
    }

    public static final void h(int i, hw2 hw2Var, yy0 yy0Var, hw2 hw2Var2, hw2 hw2Var3, qj8 qj8Var, hw2 hw2Var4, ux2 ux2Var, int i2) {
        int i3;
        ux2Var.Y(-280287501);
        int i4 = i2 | (ux2Var.d(i) ? 4 : 2) | (ux2Var.h(hw2Var) ? 32 : 16) | (ux2Var.h(yy0Var) ? 256 : 128) | (ux2Var.h(hw2Var2) ? 2048 : 1024) | (ux2Var.h(hw2Var3) ? 16384 : 8192) | (ux2Var.f(qj8Var) ? 131072 : 65536) | (ux2Var.h(hw2Var4) ? 1048576 : 524288);
        if (ux2Var.N(i4 & 1, (599187 & i4) != 599186)) {
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = new li6();
                ux2Var.g0(objK);
            }
            li6 li6Var = (li6) objK;
            boolean z = ((i4 & 896) == 256) | ((i4 & 458752) == 131072) | ((i4 & 112) == 32) | ((i4 & 7168) == 2048) | ((57344 & i4) == 16384) | ((i4 & 14) == 4) | ((3670016 & i4) == 1048576);
            Object objK2 = ux2Var.K();
            if (z || objK2 == awVar) {
                i3 = 0;
                objK2 = new e9(qj8Var, hw2Var, hw2Var2, hw2Var3, i, hw2Var4, li6Var, yy0Var);
                ux2Var.g0(objK2);
            } else {
                i3 = 0;
            }
            g68.e(null, (hw2) objK2, ux2Var, i3, 1);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new ii6(i, hw2Var, yy0Var, hw2Var2, hw2Var3, qj8Var, hw2Var4, i2);
        }
    }

    public static final void i(SupportSession supportSession, hi7 hi7Var, fs4 fs4Var, ux2 ux2Var, int i) {
        SupportSession supportSession2;
        int i2;
        vd5 vd5Var;
        vl7 vl7Var;
        supportSession.getClass();
        hi7Var.getClass();
        ux2Var.Y(1688068504);
        if ((i & 6) == 0) {
            supportSession2 = supportSession;
            i2 = (ux2Var.h(supportSession2) ? 4 : 2) | i;
        } else {
            supportSession2 = supportSession;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.d(hi7Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.f(fs4Var) ? 256 : 128;
        }
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            SupportSessionRecipientStatus recipientStatus = supportSession2.getRecipientStatus();
            int[] iArr = xq6.a;
            int i3 = iArr[recipientStatus.ordinal()];
            if (i3 == 1) {
                ux2Var.W(-271835688);
                h72 h72Var = vf2.a;
                vd5Var = new vd5(new rv0(((tf2) ux2Var.j(h72Var)).b), new rv0(((tf2) ux2Var.j(h72Var)).c));
                ux2Var.p(false);
            } else {
                if (i3 != 2) {
                    throw fx3.m(-271837735, ux2Var, false);
                }
                ux2Var.W(-271829960);
                h72 h72Var2 = vf2.a;
                vd5Var = new vd5(new rv0(((tf2) ux2Var.j(h72Var2)).d), new rv0(((tf2) ux2Var.j(h72Var2)).e));
                ux2Var.p(false);
            }
            long j = ((rv0) vd5Var.m).a;
            long j2 = ((rv0) vd5Var.n).a;
            int i4 = iArr[supportSession2.getRecipientStatus().ordinal()];
            if (i4 == 1) {
                vl7Var = vl7.Online;
            } else {
                if (i4 != 2) {
                    gk0.s();
                    return;
                }
                vl7Var = vl7.Away;
            }
            SupportSessionType supportSessionType = supportSession2.getSupportSessionType();
            int i5 = (supportSessionType == null ? -1 : xq6.b[supportSessionType.ordinal()]) == 1 ? R.drawable.ic_remote_session : R.drawable.ic_assist_ar_session;
            vl7Var.getClass();
            fs4 fs4VarS = au8.s(androidx.compose.foundation.layout.b.l(fs4Var, hi7Var.m), j, sf6.a);
            do4 do4VarC = ua0.c(xz2.s, false);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS2 = uf0.s(ux2Var, fs4VarS);
            yz0.c.getClass();
            ux2Var.a0();
            boolean z = ux2Var.S;
            tg3 tg3Var = LayoutNode.e0;
            if (z) {
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
            o67.n(fs4VarS2, iz0Var4, ux2Var);
            cs4 cs4Var = cs4.b;
            td3.b(lv1.T(i5, ux2Var, 0), m77.z(R.string.avatar_content_description, ux2Var), androidx.compose.foundation.layout.b.l(ka0.B(cs4Var, 8.0f), hi7Var.f977o), j2, ux2Var, 8, 0);
            fs4 fs4VarA = ya0.a.a(cs4Var, xz2.w);
            do4 do4VarC2 = ua0.c(xz2.f2564o, false);
            int iHashCode2 = Long.hashCode(ux2Var.T);
            yj5 yj5VarL2 = ux2Var.l();
            fs4 fs4VarS3 = uf0.s(ux2Var, fs4VarA);
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(tg3Var);
            } else {
                ux2Var.j0();
            }
            o67.n(do4VarC2, iz0Var, ux2Var);
            o67.n(yj5VarL2, iz0Var2, ux2Var);
            e41.r(iHashCode2, ux2Var, iz0Var3, ux2Var);
            o67.n(fs4VarS3, iz0Var4, ux2Var);
            o67.c(hi7Var, vl7Var, null, ux2Var, 0, 4);
            ux2Var.p(true);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new ci((Object) supportSession, (Object) hi7Var, (Object) fs4Var, i, (byte) 20);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v61 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v27 */
    public static final void j(boolean z, boolean z2, a06 a06Var, dw6 dw6Var, Function0 function0, iv6 iv6Var, String str, fs4 fs4Var, Function0 function1, ux2 ux2Var, int i) {
        iv6 iv6Var2;
        ux2 ux2Var2;
        fs4 fs4Var2;
        boolean z3;
        iv6 iv6Var3;
        a06Var.getClass();
        dw6Var.getClass();
        function0.getClass();
        function1.getClass();
        ux2Var.Y(1651060848);
        int i2 = (ux2Var.g(z) ? 4 : 2) | i | (ux2Var.g(z2) ? 32 : 16) | (ux2Var.f(a06Var) ? 256 : 128) | (ux2Var.f(dw6Var) ? 2048 : 1024);
        if ((i & 24576) == 0) {
            i2 |= ux2Var.h(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ux2Var.f(iv6Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= ux2Var.f(str) ? 1048576 : 524288;
        }
        int i3 = i2 | 12582912;
        if ((100663296 & i) == 0) {
            i3 |= ux2Var.h(function1) ? 67108864 : 33554432;
        }
        if (ux2Var.N(i3 & 1, (38347923 & i3) != 38347922)) {
            px4 px4VarG = g57.g(a06Var.f, ux2Var);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var, 0);
            int i4 = i3;
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
            boolean zEquals = str.equals("ACCOUNT");
            aw awVar = e01.a;
            if (zEquals) {
                ux2Var.W(1996016816);
                boolean z4 = ((i4 & 112) == 32) | ((i4 & 234881024) == 67108864);
                Object objK = ux2Var.K();
                if (z4 || objK == awVar) {
                    objK = new dc1((byte) 2, function1, z2);
                    ux2Var.g0(objK);
                }
                xk0.a(iv6Var, (Function0) objK, null, null, ux2Var, (i4 >> 15) & 14);
                ux2Var2 = ux2Var;
                ux2Var2.p(false);
                iv6Var2 = iv6Var;
                fs4Var2 = cs4Var;
                z3 = true;
            } else {
                ux2Var2 = ux2Var;
                byte b2 = 0;
                if (str.equals("LOGIN")) {
                    ux2Var2.W(1996348144);
                    boolean z5 = ((i4 & 112) == 32) | ((234881024 & i4) == 67108864);
                    Object objK2 = ux2Var2.K();
                    if (z5 || objK2 == awVar) {
                        objK2 = new dc1((byte) 4, function1, z2);
                        ux2Var2.g0(objK2);
                    }
                    fs4Var2 = cs4Var;
                    z3 = true;
                    iv6Var3 = iv6Var;
                    h57.b(z2, iv6Var3, a06Var, (Function0) objK2, null, null, ux2Var2, ((i4 >> 3) & 14) | ((i4 >> 12) & 112) | (i4 & 896));
                    ux2Var2.p(false);
                } else {
                    fs4Var2 = cs4Var;
                    z3 = true;
                    z3 = true;
                    z3 = true;
                    z3 = true;
                    z3 = true;
                    z3 = true;
                    z3 = true;
                    z3 = true;
                    z3 = true;
                    z3 = true;
                    z3 = true;
                    z3 = true;
                    z3 = true;
                    z3 = true;
                    z3 = true;
                    z3 = true;
                    iv6Var3 = iv6Var;
                    if (str.equals("PERMISSIONS")) {
                        ux2Var2.W(1996755546);
                        cj5 cj5Var = new cj5();
                        cj5 cj5Var2 = new cj5();
                        cj5 cj5Var3 = new cj5(true, lj5.m);
                        lj5 lj5Var = lj5.n;
                        cj5 cj5Var4 = new cj5(true, lj5Var);
                        cj5 cj5Var5 = new cj5(true, lj5Var);
                        cj5 cj5Var6 = new cj5(true, lj5Var);
                        cj5 cj5Var7 = new cj5(true, lj5Var);
                        String strZ = m77.z(R.string.permissions_disclaimer_description_teamviewer, ux2Var2);
                        strZ.getClass();
                        zu1.j(null, new hj5(cj5Var, cj5Var2, cj5Var3, cj5Var5, cj5Var7, cj5Var6, cj5Var4, strZ), null, ux2Var2, 0);
                        ux2Var2.p(false);
                    } else {
                        byte b3 = 5;
                        if (str.equals("FEEDBACK")) {
                            ux2Var2.W(1997426851);
                            boolean zBooleanValue = ((Boolean) px4VarG.getValue()).booleanValue();
                            String strZ2 = m77.z(R.string.feedback_intro_text, ux2Var2);
                            String strZ3 = m77.z(R.string.feedback_url, ux2Var2);
                            Function1 function2 = iv6Var3.j;
                            Function0 function3 = iv6Var3.k;
                            ?? r5 = ((i4 & 112) == 32) | ((i4 & 234881024) == 67108864);
                            Object objK3 = ux2Var2.K();
                            if (r5 != false || objK3 == awVar) {
                                objK3 = new dc1(b3, function1, z2);
                                ux2Var2.g0(objK3);
                            }
                            ep1.b(zBooleanValue, strZ2, strZ3, function2, function3, (Function0) objK3, null, null, ux2Var2, 0);
                            ux2Var2.p(false);
                        } else if (str.equals("REMOTE_CURSOR")) {
                            ux2Var2.W(1998081664);
                            boolean z6 = dw6Var.b;
                            ?? r4 = (i4 & 458752) == 131072;
                            Object objK4 = ux2Var2.K();
                            if (r4 != false || objK4 == awVar) {
                                objK4 = new lv6(iv6Var3, (byte) 4);
                                ux2Var2.g0(objK4);
                            }
                            wo1.o(z6, (Function1) objK4, null, ux2Var2, 0);
                            ux2Var2.p(false);
                        } else if (str.equals("WALLPAPER")) {
                            ux2Var2.W(1998367236);
                            boolean z7 = dw6Var.e;
                            ?? r6 = (458752 & i4) == 131072;
                            Object objK5 = ux2Var2.K();
                            if (r6 != false || objK5 == awVar) {
                                objK5 = new lv6(iv6Var3, b3);
                                ux2Var2.g0(objK5);
                            }
                            n37.f(z7, (Function1) objK5, null, ux2Var2, 0);
                            ux2Var2.p(false);
                        } else if (str.equals("UDP")) {
                            ux2Var2.W(1998642454);
                            boolean z8 = dw6Var.d;
                            ?? r7 = (i4 & 458752) == 131072;
                            Object objK6 = ux2Var2.K();
                            if (r7 != false || objK6 == awVar) {
                                objK6 = new lv6(iv6Var3, (byte) 6);
                                ux2Var2.g0(objK6);
                            }
                            g57.c(z8, (Function1) objK6, null, ux2Var2, 0);
                            ux2Var2.p(false);
                        } else if (str.equals("MUSIC_AND_SOUND")) {
                            ux2Var2.W(1998911100);
                            boolean z9 = dw6Var.f;
                            ?? r8 = (i4 & 458752) == 131072;
                            Object objK7 = ux2Var2.K();
                            if (r8 != false || objK7 == awVar) {
                                objK7 = new lv6(iv6Var3, (byte) 7);
                                ux2Var2.g0(objK7);
                            }
                            o67.a(z9, (Function1) objK7, null, ux2Var2, 0);
                            ux2Var2.p(false);
                        } else if (str.equals("BIOMETRICS")) {
                            ux2Var2.W(1999226246);
                            boolean z10 = dw6Var.g;
                            String str2 = dw6Var.l;
                            boolean z11 = dw6Var.j;
                            int i5 = i4 & 458752;
                            ?? r9 = i5 == 131072;
                            Object objK8 = ux2Var2.K();
                            if (r9 != false || objK8 == awVar) {
                                objK8 = new lv6(iv6Var3, b2);
                                ux2Var2.g0(objK8);
                            }
                            Function1 function4 = (Function1) objK8;
                            ?? r10 = i5 == 131072;
                            Object objK9 = ux2Var2.K();
                            if (r10 != false || objK9 == awVar) {
                                objK9 = new lv6(iv6Var3, z3 ? (byte) 1 : (byte) 0);
                                ux2Var2.g0(objK9);
                            }
                            pm8.c(z10, z11, str2, function4, (Function1) objK9, null, ux2Var2, 0);
                            ux2Var2.p(false);
                            iv6Var2 = iv6Var;
                        } else if (str.equals("PASSWORDS")) {
                            ux2Var2.W(1999735297);
                            boolean z12 = dw6Var.c;
                            ?? r11 = (i4 & 458752) == 131072;
                            Object objK10 = ux2Var2.K();
                            if (r11 != false || objK10 == awVar) {
                                objK10 = new lv6(iv6Var3, (byte) 2);
                                ux2Var2.g0(objK10);
                            }
                            us1.i(z12, (Function1) objK10, null, ux2Var2, 0);
                            ux2Var2.p(false);
                        } else {
                            byte b4 = 3;
                            if (str.equals("TFA")) {
                                ux2Var2.W(2000015506);
                                ?? r2 = ((i4 & 112) == 32) | ((i4 & 234881024) == 67108864);
                                Object objK11 = ux2Var2.K();
                                if (r2 != false || objK11 == awVar) {
                                    objK11 = new dc1(b4, function1, z2);
                                    ux2Var2.g0(objK11);
                                }
                                iv6Var2 = iv6Var;
                                b77.c(function0, (Function0) objK11, null, null, ux2Var2, (i4 >> 12) & 14);
                                ux2Var2.p(false);
                            } else {
                                iv6Var2 = iv6Var3;
                                if (str.equals("SCAN_QR")) {
                                    ux2Var2.W(2000345408);
                                    xo1.t(z, iv6Var2.j, iv6Var2.k, function1, null, null, ux2Var2, (i4 & 14) | ((i4 >> 15) & 7168));
                                    ux2Var2.p(false);
                                } else if (str.equals("ADVANCED_LOGGING")) {
                                    ux2Var2.W(2000729436);
                                    boolean z13 = dw6Var.i;
                                    ?? r1 = (i4 & 458752) == 131072;
                                    Object objK12 = ux2Var2.K();
                                    if (r1 != false || objK12 == awVar) {
                                        objK12 = new lv6(iv6Var2, b4);
                                        ux2Var2.g0(objK12);
                                    }
                                    qf0.b(z13, (Function1) objK12, null, ux2Var2, 0);
                                    ux2Var2.p(false);
                                } else if (str.equals("LOGFILE")) {
                                    ux2Var2.W(2001011908);
                                    me4.a(iv6Var2, null, ux2Var2, (i4 >> 15) & 14);
                                    ux2Var2.p(false);
                                } else if (str.equals("EULA_WEB")) {
                                    ux2Var2.W(2001133056);
                                    xs1.d(((Boolean) px4VarG.getValue()).booleanValue(), null, ux2Var2, 0);
                                    ux2Var2.p(false);
                                } else if (str.equals("PRIVACY_POLICY_WEB")) {
                                    ux2Var2.W(2001267255);
                                    qs1.s(((Boolean) px4VarG.getValue()).booleanValue(), null, ux2Var2, 0);
                                    ux2Var2.p(false);
                                } else if (str.equals("COPYRIGHT")) {
                                    ux2Var2.W(2001406724);
                                    int[] iArr = CopyrightActivity.H;
                                    ga0.d(Arrays.copyOf(iArr, iArr.length), androidx.compose.foundation.layout.b.c, null, ux2Var2, 48, 4);
                                    ux2Var2.p(false);
                                } else {
                                    ux2Var2.W(2001616966);
                                    ux2Var2.p(false);
                                }
                            }
                        }
                    }
                }
                iv6Var2 = iv6Var3;
            }
            ux2Var2.p(z3);
        } else {
            iv6Var2 = iv6Var;
            ux2Var2 = ux2Var;
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new mv6(z, z2, a06Var, dw6Var, function0, iv6Var2, str, fs4Var2, function1, i);
        }
    }

    public static final rh3 k(th3 th3Var, float f, float f2, qh3 qh3Var, String str, ux2 ux2Var, int i, int i2) {
        Float fValueOf = Float.valueOf(f);
        Float fValueOf2 = Float.valueOf(f2);
        Object objK = ux2Var.K();
        aw awVar = e01.a;
        if (objK == awVar) {
            objK = new rh3(th3Var, fValueOf, fValueOf2, qh3Var);
            ux2Var.g0(objK);
        }
        rh3 rh3Var = (rh3) objK;
        boolean zH = ux2Var.h(qh3Var);
        Object objK2 = ux2Var.K();
        if (zH || objK2 == awVar) {
            eb ebVar = new eb((Object) fValueOf, (Object) rh3Var, (Object) fValueOf2, (Object) qh3Var, (byte) 9);
            ux2Var.g0(ebVar);
            objK2 = ebVar;
        }
        ck3.k((Function0) objK2, ux2Var);
        boolean zH2 = ux2Var.h(th3Var);
        Object objK3 = ux2Var.K();
        if (zH2 || objK3 == awVar) {
            objK3 = new o43(th3Var, rh3Var, (byte) 3);
            ux2Var.g0(objK3);
        }
        ck3.e(rh3Var, (Function1) objK3, ux2Var);
        return rh3Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object l(qi0 qi0Var, jc1 jc1Var) {
        u85 u85Var;
        if (jc1Var instanceof u85) {
            u85Var = (u85) jc1Var;
            int i = u85Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                u85Var.n = i - Integer.MIN_VALUE;
            } else {
                u85Var = new u85(jc1Var);
            }
        } else {
            u85Var = new u85(jc1Var);
        }
        Object objJ0 = u85Var.m;
        int i2 = u85Var.n;
        hc1 hc1Var = null;
        if (i2 == 0) {
            ct1.a0(objJ0);
            tk1 tk1Var = g22.a;
            gk1 gk1Var = gk1.f901o;
            v85 v85Var = new v85(qi0Var, hc1Var, (byte) 0);
            u85Var.n = 1;
            objJ0 = im3.j0(gk1Var, v85Var, u85Var);
            ne1 ne1Var = ne1.m;
            if (objJ0 == ne1Var) {
                return ne1Var;
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ct1.a0(objJ0);
        }
        return ((tc6) objJ0).m;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object m(qi0 qi0Var, jc1 jc1Var) {
        w85 w85Var;
        if (jc1Var instanceof w85) {
            w85Var = (w85) jc1Var;
            int i = w85Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                w85Var.n = i - Integer.MIN_VALUE;
            } else {
                w85Var = new w85(jc1Var);
            }
        } else {
            w85Var = new w85(jc1Var);
        }
        Object objJ0 = w85Var.m;
        int i2 = w85Var.n;
        hc1 hc1Var = null;
        byte b2 = 1;
        if (i2 == 0) {
            ct1.a0(objJ0);
            tk1 tk1Var = g22.a;
            gk1 gk1Var = gk1.f901o;
            v85 v85Var = new v85(qi0Var, hc1Var, b2);
            w85Var.n = 1;
            objJ0 = im3.j0(gk1Var, v85Var, w85Var);
            ne1 ne1Var = ne1.m;
            if (objJ0 == ne1Var) {
                return ne1Var;
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ct1.a0(objJ0);
        }
        return ((tc6) objJ0).m;
    }

    public static String n(ai0 ai0Var, ai0[] ai0VarArr, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int iD = ai0Var.d();
        int i5 = 0;
        while (i5 < iD) {
            int i6 = (i5 + iD) / 2;
            while (i6 > -1 && ai0Var.i(i6) != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (ai0Var.i(i2) == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    byte bI = ai0VarArr[i10].i(i11);
                    byte[] bArr = po8.a;
                    int i13 = bI & 255;
                    z = z2;
                    i3 = i13;
                }
                byte bI2 = ai0Var.i(i7 + i12);
                byte[] bArr2 = po8.a;
                i4 = i3 - (bI2 & 255);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 == i9) {
                    break;
                }
                if (ai0VarArr[i10].d() != i11) {
                    z2 = z;
                } else {
                    if (i10 == ai0VarArr.length - 1) {
                        break;
                    }
                    i10++;
                    i11 = -1;
                    z2 = true;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i14 = i9 - i12;
                    int iD2 = ai0VarArr[i10].d() - i11;
                    int length = ai0VarArr.length;
                    for (int i15 = i10 + 1; i15 < length; i15++) {
                        iD2 += ai0VarArr[i15].d();
                    }
                    if (iD2 >= i14) {
                        if (iD2 <= i14) {
                            return ai0Var.o(i7, i9 + i7).n(vn0.a);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            iD = i6;
        }
        return null;
    }

    public static void o(boolean z, String str) {
        if (z) {
            return;
        }
        hk0.g(str);
    }

    public static void p(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 35 + 1);
            e41.t(sb, "Must be called on ", name2, " thread, but got ", name);
            io.sentry.h2.l(sb, ".");
        }
    }

    public static void q(String str) {
        if (TextUtils.isEmpty(str)) {
            hk0.g("Given String is empty or null");
        }
    }

    public static void r(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            hk0.g(str2);
        }
    }

    public static void s(Object obj) {
        if (obj != null) {
            return;
        }
        yq4.l("null reference");
    }

    public static void t(Object obj, String str) {
        if (obj != null) {
            return;
        }
        yq4.l(str);
    }

    public static final go2 u(go2 go2Var, long j) {
        if (j >= 0) {
            return j == 0 ? go2Var : new ih1(new po2(new wh(j, (byte) 3), go2Var, null), (byte) 1);
        }
        hk0.g("Debounce timeout should not be negative");
        return null;
    }

    public static void v(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (Build.VERSION.SDK_INT < 28) {
                childAt.destroyDrawingCache();
            }
            if (childAt != null) {
                if (childAt instanceof ImageButton) {
                    ImageButton imageButton = (ImageButton) childAt;
                    Drawable drawable = imageButton.getDrawable();
                    if (drawable != null) {
                        drawable.setCallback(null);
                    }
                    imageButton.setOnClickListener(null);
                } else if (childAt instanceof Button) {
                    Button button = (Button) childAt;
                    Drawable background = button.getBackground();
                    if (background != null) {
                        background.setCallback(null);
                    }
                    button.setOnClickListener(null);
                } else if (childAt instanceof EditText) {
                    EditText editText = (EditText) childAt;
                    editText.setBackground(null);
                    editText.setOnEditorActionListener(null);
                    editText.setOnClickListener(null);
                } else if (childAt instanceof TextView) {
                    TextView textView = (TextView) childAt;
                    textView.setBackground(null);
                    textView.setOnClickListener(null);
                } else if (childAt instanceof ListView) {
                    ListView listView = (ListView) childAt;
                    listView.setAdapter((ListAdapter) null);
                    listView.setOnItemClickListener(null);
                } else if (childAt instanceof ViewGroup) {
                    ViewGroup viewGroup2 = (ViewGroup) childAt;
                    v(viewGroup2);
                    Drawable background2 = viewGroup2.getBackground();
                    if (background2 != null) {
                        background2.setCallback(null);
                    }
                }
            }
        }
    }

    public static final Object w(ke3 ke3Var, f4 f4Var) {
        Object obj = ke3Var.s.a.get(f4Var);
        if (obj != null) {
            return obj;
        }
        Object obj2 = ke3Var.u.n.a.get(f4Var);
        return obj2 == null ? f4Var.m : obj2;
    }

    public static final Object x(za5 za5Var, f4 f4Var) {
        Object obj = za5Var.j.a.get(f4Var);
        return obj == null ? f4Var.m : obj;
    }

    public static final tn6 z(Object obj) {
        if (obj != xk0.m) {
            return (tn6) obj;
        }
        hk0.l("Does not contain segment");
        return null;
    }

    public abstract boolean D();

    public abstract void K(boolean z);

    public abstract void L(boolean z);

    public abstract TransformationMethod O(TransformationMethod transformationMethod);

    public abstract InputFilter[] y(InputFilter[] inputFilterArr);
}
