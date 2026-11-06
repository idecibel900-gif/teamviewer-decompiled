package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Environment;
import android.util.Base64;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class k9 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1239o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k9(Object obj, Object obj2, Object obj3, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.n = obj;
        this.f1239o = obj2;
        this.p = obj3;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        Object obj2 = this.p;
        Object obj3 = this.f1239o;
        switch (b) {
            case 0:
                return new k9((ArrayList) this.n, (n9) obj3, (i97) obj2, hc1Var, (byte) 0);
            case 1:
                return new k9((ib) this.n, (l33) obj3, (hb) obj2, hc1Var, (byte) 1);
            case 2:
                return new k9((ArrayList) this.n, (ob) obj3, (ja) obj2, hc1Var, (byte) 2);
            case 3:
                return new k9((w44) this.n, (v23) obj3, (iq2) obj2, hc1Var, (byte) 3);
            case 4:
                return new k9((v23) this.n, (u23) obj3, (i97) obj2, hc1Var, (byte) 4);
            case 5:
                k9 k9Var = new k9((nn5) obj3, (zp7) obj2, hc1Var, (byte) 5);
                k9Var.n = obj;
                return k9Var;
            case 6:
                return new k9((vj5) this.n, (Context) obj3, (px4) obj2, hc1Var, (byte) 6);
            case 7:
                return new k9((qh4) this.n, (Context) obj3, (String) obj2, hc1Var, (byte) 7);
            case 8:
                k9 k9Var2 = new k9((su6) obj3, (px4) obj2, hc1Var, (byte) 8);
                k9Var2.n = obj;
                return k9Var2;
            case ep1.b /* 9 */:
                return new k9((String) this.n, (px4) obj3, (px4) obj2, hc1Var, (byte) 9);
            case ep1.c /* 10 */:
                return new k9((c67) this.n, (a06) obj3, (px4) obj2, hc1Var, (byte) 10);
            default:
                k9 k9Var3 = new k9((jf3) obj3, (Function0) obj2, hc1Var, (byte) 11);
                k9Var3.n = obj;
                return k9Var3;
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        me1 me1Var = (me1) obj;
        hc1 hc1Var = (hc1) obj2;
        switch (b) {
            case 0:
                ((k9) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                return f88Var;
            case 1:
                ((k9) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                return f88Var;
            case 2:
                ((k9) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                return f88Var;
            case 3:
                ((k9) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                return f88Var;
            case 4:
                ((k9) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                return f88Var;
            case 5:
                return ((k9) create(me1Var, hc1Var)).invokeSuspend(f88Var);
            case 6:
                ((k9) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                return f88Var;
            case 7:
                ((k9) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                return f88Var;
            case 8:
                ((k9) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                return f88Var;
            case ep1.b /* 9 */:
                ((k9) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                return f88Var;
            case ep1.c /* 10 */:
                ((k9) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                return f88Var;
            default:
                ((k9) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                return f88Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Bitmap bitmapDecodeStream;
        byte b = this.m;
        byte b2 = 2;
        byte b3 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        f88 f88Var = f88.a;
        Object obj2 = this.p;
        Object obj3 = this.f1239o;
        switch (b) {
            case 0:
                ct1.a0(obj);
                ArrayList arrayList = (ArrayList) this.n;
                if (!arrayList.isEmpty() && ((o9) ((i97) obj2).getValue()).c == null) {
                    ((n9) obj3).c.invoke(lv0.m0(arrayList));
                }
                return f88Var;
            case 1:
                hb hbVar = (hb) obj2;
                ct1.a0(obj);
                if (((ib) this.n).d.length() == 0) {
                    l33 l33Var = (l33) obj3;
                    if (l33Var != null) {
                        l33 l33Var2 = l33Var.c ? null : l33Var;
                        if (l33Var2 != null) {
                            hbVar.c.invoke(l33Var2);
                        }
                    }
                    hbVar.d.a();
                }
                return f88Var;
            case 2:
                ct1.a0(obj);
                ArrayList arrayList2 = (ArrayList) this.n;
                if (!arrayList2.isEmpty() && ((ob) obj3).c == null) {
                    ((ja) obj2).c.invoke(lv0.m0(arrayList2));
                }
                return f88Var;
            case 3:
                ct1.a0(obj);
                if (((w44) this.n).j.a() && ((v23) obj3).d) {
                    iq2.a((iq2) obj2);
                }
                return f88Var;
            case 4:
                ct1.a0(obj);
                int i = t23.a;
                if (((Boolean) ((i97) obj2).getValue()).booleanValue() && !((v23) this.n).b) {
                    ((u23) obj3).e.a();
                }
                return f88Var;
            case 5:
                ct1.a0(obj);
                me1 me1Var = (me1) this.n;
                nn5 nn5Var = (nn5) obj3;
                zp7 zp7Var = (zp7) obj2;
                td1 td1Var = new td1(nn5Var, zp7Var, objArr2 == true ? 1 : 0, b3);
                pe1 pe1Var = pe1.p;
                im3.R(me1Var, null, pe1Var, td1Var, 1);
                return im3.R(me1Var, null, pe1Var, new td1(nn5Var, zp7Var, objArr == true ? 1 : 0, b2), 1);
            case 6:
                l97 l97Var = ((vj5) this.n).n;
                Context context = (Context) obj3;
                ct1.a0(obj);
                if (kj5.a[((m84) ((px4) obj2).getValue()).ordinal()] == 1) {
                    boolean zV0 = vj5.V0(context);
                    do {
                        value = l97Var.getValue();
                    } while (!l97Var.j(value, mx0.a((mx0) value, zV0, false, false, false, false, false, 62)));
                    boolean zAreNotificationsEnabled = new r55(context).a.areNotificationsEnabled();
                    do {
                        value2 = l97Var.getValue();
                    } while (!l97Var.j(value2, mx0.a((mx0) value2, false, zAreNotificationsEnabled, false, false, false, false, 61)));
                    boolean z = hm3.h(context, "android.permission.ACCESS_FINE_LOCATION") == 0;
                    do {
                        value3 = l97Var.getValue();
                    } while (!l97Var.j(value3, mx0.a((mx0) value3, false, false, z, false, false, false, 59)));
                    boolean zIsExternalStorageManager = Build.VERSION.SDK_INT >= 30 ? Environment.isExternalStorageManager() : hm3.h(context, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
                    do {
                        value4 = l97Var.getValue();
                    } while (!l97Var.j(value4, mx0.a((mx0) value4, false, false, false, zIsExternalStorageManager, false, false, 55)));
                    boolean z2 = hm3.h(context, "android.permission.CAMERA") == 0;
                    do {
                        value5 = l97Var.getValue();
                    } while (!l97Var.j(value5, mx0.a((mx0) value5, false, false, false, false, false, z2, 31)));
                    boolean z3 = hm3.h(context, "android.permission.RECORD_AUDIO") == 0;
                    do {
                        value6 = l97Var.getValue();
                    } while (!l97Var.j(value6, mx0.a((mx0) value6, false, false, false, false, z3, false, 47)));
                }
                return f88Var;
            case 7:
                ct1.a0(obj);
                for (gi4 gi4Var : ((HashMap) ((qh4) this.n).c()).values()) {
                    gi4Var.getClass();
                    String str = gi4Var.d;
                    if (gi4Var.f == null && bc7.N(false, str, "data:") && ub7.Z(str, "base64,", 0, false, 6) > 0) {
                        try {
                            byte[] bArrDecode = Base64.decode(str.substring(ub7.Y(str, ',', 0, 6) + 1), 0);
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inScaled = true;
                            options.inDensity = 160;
                            gi4Var.f = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        } catch (IllegalArgumentException e) {
                            xe4.b("data URL did not have correct base64 format.", e);
                        }
                    }
                    Context context2 = (Context) obj3;
                    String str2 = (String) obj2;
                    if (gi4Var.f == null && str2 != null) {
                        try {
                            InputStream inputStreamOpen = context2.getAssets().open(str2 + str);
                            inputStreamOpen.getClass();
                            try {
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inScaled = true;
                                options2.inDensity = 160;
                                bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen, null, options2);
                            } catch (IllegalArgumentException e2) {
                                xe4.b("Unable to decode image.", e2);
                                bitmapDecodeStream = null;
                            }
                            if (bitmapDecodeStream != null) {
                                gi4Var.f = ta8.d(bitmapDecodeStream, gi4Var.a, gi4Var.b);
                            }
                        } catch (IOException e3) {
                            xe4.b("Unable to open asset.", e3);
                        }
                        break;
                    }
                    break;
                }
                return f88Var;
            case 8:
                me1 me1Var2 = (me1) this.n;
                ct1.a0(obj);
                im3.R(me1Var2, null, null, new vt4((su6) obj3, (px4) obj2, objArr3 == true ? 1 : 0, (byte) 20), 3);
                return f88Var;
            case ep1.b /* 9 */:
                ct1.a0(obj);
                String str3 = (String) this.n;
                ((Function1) ((px4) obj2).getValue()).invoke(Boolean.valueOf(!im3.n(str3, "SCAN_QR")));
                if (str3 != null) {
                    ((px4) obj3).setValue(str3);
                }
                return f88Var;
            case ep1.c /* 10 */:
                ct1.a0(obj);
                if (((Boolean) ((px4) obj2).getValue()).booleanValue()) {
                    e67 e67Var = ((c67) this.n).p0;
                    if (e67Var == null) {
                        im3.e0("viewModel");
                        throw null;
                    }
                    String str4 = ((a06) obj3).g;
                    str4.getClass();
                    gu0 gu0VarN = e8.n(e67Var);
                    tk1 tk1Var = g22.a;
                    im3.R(gu0VarN, gk1.f901o, null, new vt4(e67Var, str4, objArr4 == true ? 1 : 0, (byte) 23), 2);
                }
                return f88Var;
            default:
                me1 me1Var3 = (me1) this.n;
                ct1.a0(obj);
                im3.R(me1Var3, null, null, new vt4((jf3) obj3, (Function0) obj2, objArr5 == true ? 1 : 0, (byte) 26), 3);
                return f88Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k9(Object obj, Object obj2, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f1239o = obj;
        this.p = obj2;
    }
}
