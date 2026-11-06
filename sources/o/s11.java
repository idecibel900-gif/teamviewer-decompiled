package o;

import android.content.Context;
import android.graphics.Typeface;
import com.teamviewer.remotecontrolviewmodellib.swig.ConditionalAccessAuthenticationNotificationViewModelNative;
import com.teamviewer.remotecontrolviewmodellib.swig.ConditionalAccessAuthenticationPayloadSignalCallback;
import com.teamviewer.remotecontrolviewmodellib.swig.IConditionalAccessAuthNotificationViewModelSWIGJNI;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class s11 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1970o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s11(String str, String str2, t11 t11Var, String str3, hc1 hc1Var) {
        super(2, hc1Var);
        this.m = (byte) 0;
        this.n = str;
        this.f1970o = str2;
        this.q = t11Var;
        this.p = str3;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        Object obj2 = this.q;
        Object obj3 = this.p;
        Object obj4 = this.f1970o;
        switch (b) {
            case 0:
                return new s11((String) this.n, (String) obj4, (t11) obj2, (String) obj3, hc1Var);
            case 1:
                s11 s11Var = new s11(obj4, obj3, obj2, hc1Var, (byte) 1);
                s11Var.n = obj;
                return s11Var;
            case 2:
                return new s11((ew4) this.n, (List) obj4, (px4) obj3, (px4) obj2, hc1Var);
            case 3:
                return new s11((qh4) obj3, (Context) obj2, (String) this.n, (String) obj4, hc1Var);
            case 4:
                s11 s11Var2 = new s11(obj4, obj3, obj2, hc1Var, (byte) 4);
                s11Var2.n = obj;
                return s11Var2;
            default:
                s11 s11Var3 = new s11(obj4, obj3, obj2, hc1Var, (byte) 5);
                s11Var3.n = obj;
                return s11Var3;
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
                ((s11) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
            case 1:
                ((s11) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
            case 2:
                ((s11) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
            case 3:
                ((s11) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
            case 4:
                ((s11) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
            default:
                ((s11) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
        }
        return f88Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        dj5 dj5Var;
        int i;
        byte b = this.m;
        byte b2 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        byte b3 = 3;
        f88 f88Var = f88.a;
        Object obj2 = this.q;
        Object obj3 = this.p;
        Object obj4 = this.f1970o;
        switch (b) {
            case 0:
                ct1.a0(obj);
                c36 c36Var = zu1.c;
                v11 v11VarD = c36Var != null ? c36Var.d(null) : null;
                if (v11VarD != null) {
                    io.sentry.q7 q7Var = new io.sentry.q7((t11) obj2, (String) obj3, (byte) 12);
                    ConditionalAccessAuthenticationNotificationViewModelNative conditionalAccessAuthenticationNotificationViewModelNative = v11VarD.n;
                    u11 u11Var = new u11(q7Var, v11VarD);
                    IConditionalAccessAuthNotificationViewModelSWIGJNI.ConditionalAccessAuthenticationNotificationViewModelNative_DecryptPayload(conditionalAccessAuthenticationNotificationViewModelNative.a, conditionalAccessAuthenticationNotificationViewModelNative, (String) this.n, (String) obj4, ConditionalAccessAuthenticationPayloadSignalCallback.getCPtr((ConditionalAccessAuthenticationPayloadSignalCallback) u11Var), u11Var);
                }
                return f88Var;
            case 1:
                ct1.a0(obj);
                me1 me1Var = (me1) this.n;
                nn5 nn5Var = (nn5) obj4;
                td1 td1Var = new td1(nn5Var, (zp7) obj3, objArr2 == true ? 1 : 0, b2);
                pe1 pe1Var = pe1.p;
                im3.R(me1Var, null, pe1Var, td1Var, 1);
                im3.R(me1Var, null, pe1Var, new oa1((Object) nn5Var, obj2, (hc1) (objArr == true ? 1 : 0), b3), 1);
                return f88Var;
            case 2:
                ct1.a0(obj);
                ew4 ew4Var = (ew4) this.n;
                if (!ew4Var.a()) {
                    ew4Var.c();
                } else if (((Boolean) ((px4) obj3).getValue()).booleanValue()) {
                    px4 px4Var = (px4) obj2;
                    for (zi5 zi5Var : (List) obj4) {
                        Iterator it = ew4Var.b().iterator();
                        do {
                            if (!it.hasNext()) {
                                an4.j("Collection contains no element matching the predicate.");
                                return null;
                            }
                            dj5Var = (dj5) it.next();
                        } while (!im3.n(dj5Var.a(), zi5Var.a));
                        gj5 status = dj5Var.getStatus();
                        status.getClass();
                        if (!status.equals(fj5.a)) {
                            px4Var.setValue(zi5Var);
                        }
                    }
                }
                return f88Var;
            case 3:
                ct1.a0(obj);
                for (jr2 jr2Var : ((qh4) obj3).f.values()) {
                    Context context = (Context) obj2;
                    jr2Var.getClass();
                    String str = jr2Var.a;
                    String str2 = (String) this.n;
                    String str3 = jr2Var.b;
                    try {
                        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), str2 + str + ((String) obj4));
                        try {
                            typefaceCreateFromAsset.getClass();
                            str3.getClass();
                            boolean zQ = ub7.Q(str3, "Italic", false);
                            boolean zQ2 = ub7.Q(str3, "Bold", false);
                            if (zQ && zQ2) {
                                i = 3;
                            } else if (zQ) {
                                i = 2;
                            } else {
                                i = zQ2 ? 1 : 0;
                            }
                            if (typefaceCreateFromAsset.getStyle() != i) {
                                typefaceCreateFromAsset = Typeface.create(typefaceCreateFromAsset, i);
                            }
                            jr2Var.c = typefaceCreateFromAsset;
                        } catch (Exception unused) {
                            xe4.a.getClass();
                        }
                    } catch (Exception unused2) {
                        xe4.a.getClass();
                    }
                }
                return f88Var;
            case 4:
                me1 me1Var2 = (me1) this.n;
                ct1.a0(obj);
                im3.R(me1Var2, null, null, new ko2(obj4, obj3, obj2, (hc1) null, (byte) 26), 3);
                return f88Var;
            default:
                me1 me1Var3 = (me1) this.n;
                ct1.a0(obj);
                jf3 jf3Var = (jf3) obj4;
                Function1 function1 = (Function1) obj2;
                hc1 hc1Var = null;
                im3.R(me1Var3, null, null, new ko2((Object) jf3Var, obj3, (Object) function1, hc1Var, (byte) 27), 3);
                im3.R(me1Var3, null, null, new vt4(jf3Var, function1, hc1Var, (byte) 27), 3);
                return f88Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s11(Object obj, Object obj2, Object obj3, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f1970o = obj;
        this.p = obj2;
        this.q = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s11(qh4 qh4Var, Context context, String str, String str2, hc1 hc1Var) {
        super(2, hc1Var);
        this.m = (byte) 3;
        this.p = qh4Var;
        this.q = context;
        this.n = str;
        this.f1970o = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s11(ew4 ew4Var, List list, px4 px4Var, px4 px4Var2, hc1 hc1Var) {
        super(2, hc1Var);
        this.m = (byte) 2;
        this.n = ew4Var;
        this.f1970o = list;
        this.p = px4Var;
        this.q = px4Var2;
    }
}
