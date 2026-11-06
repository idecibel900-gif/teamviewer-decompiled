package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.Display;
import android.view.RoundedCorner;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.chatviewmodel.swig.ChatConversationID;
import com.teamviewer.chatviewmodel.swig.ChatUIModelLocatorAndroid;
import com.teamviewer.chatviewmodel.swig.IStartChatUIModelAndroid;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class vt1 {
    public static int b;
    public static au2 c;
    public static int d;
    public final /* synthetic */ byte a;

    public /* synthetic */ vt1(byte b2) {
        this.a = b2;
    }

    public static hc1 A(hc1 hc1Var) {
        hc1<Object> hc1VarIntercepted;
        hc1Var.getClass();
        jc1 jc1Var = hc1Var instanceof jc1 ? (jc1) hc1Var : null;
        return (jc1Var == null || (hc1VarIntercepted = jc1Var.intercepted()) == null) ? hc1Var : hc1VarIntercepted;
    }

    public static final a65 B(hw2 hw2Var, Function1 function1) {
        xd xdVar = new xd(hw2Var, (byte) 2);
        e8.i(1, function1);
        return new a65((byte) 20, (Object) xdVar, (Object) function1, false);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:38:0x0116  */
    /* JADX WARN: Code duplicated, block: B:41:0x011a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object C(Context context, yh4 yh4Var, String str, String str2, String str3, String str4, jc1 jc1Var) {
        r96 r96Var;
        String str5;
        String str6;
        Context context2;
        String str7;
        Context context3;
        Object objJ0;
        String str8;
        qh4 qh4Var;
        String str9;
        Object objJ1;
        if (jc1Var instanceof r96) {
            r96Var = (r96) jc1Var;
            int i = r96Var.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                r96Var.r = i - Integer.MIN_VALUE;
            } else {
                r96Var = new r96(jc1Var);
            }
        } else {
            r96Var = new r96(jc1Var);
        }
        Object objQ = r96Var.q;
        int i2 = r96Var.r;
        Object obj = f88.a;
        byte b2 = 1;
        hc1 hc1Var = null;
        ne1 ne1Var = ne1.m;
        if (i2 == 0) {
            ct1.a0(objQ);
            ki4 ki4VarD = D(context, yh4Var, str4);
            r96Var.m = context;
            str5 = str;
            r96Var.n = str5;
            r96Var.f1905o = str2;
            str6 = str3;
            r96Var.p = str6;
            r96Var.r = 1;
            gl0 gl0Var = new gl0(1, A(r96Var));
            gl0Var.t();
            ki4VarD.b(new q96(gl0Var, (byte) 0));
            ki4VarD.a(new q96(gl0Var, b2));
            objQ = gl0Var.q();
            if (objQ != ne1Var) {
                context2 = context;
                str7 = str2;
            }
            return ne1Var;
        }
        if (i2 == 1) {
            String str10 = (String) r96Var.p;
            String str11 = r96Var.f1905o;
            String str12 = r96Var.n;
            context2 = (Context) r96Var.m;
            ct1.a0(objQ);
            str6 = str10;
            str7 = str11;
            str5 = str12;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qh4 qh4Var2 = (qh4) r96Var.m;
                ct1.a0(objQ);
                return qh4Var2;
            }
            qh4Var = (qh4) r96Var.p;
            str9 = r96Var.f1905o;
            str8 = r96Var.n;
            context3 = (Context) r96Var.m;
            ct1.a0(objQ);
        }
        r96Var.m = qh4Var;
        r96Var.n = null;
        r96Var.f1905o = null;
        r96Var.p = null;
        r96Var.r = 3;
        if (!qh4Var.f.isEmpty()) {
            tk1 tk1Var = g22.a;
            Context context4 = context3;
            objJ1 = im3.j0(gk1.f901o, new s11(qh4Var, context4, str8, str9, (hc1) null), r96Var);
            if (objJ1 == ne1Var) {
                obj = objJ1;
            }
        }
        if (obj != ne1Var) {
            return ne1Var;
        }
        return qh4Var;
        qh4 qh4Var3 = (qh4) objQ;
        r96Var.m = context2;
        r96Var.n = str7;
        r96Var.f1905o = str6;
        r96Var.p = qh4Var3;
        r96Var.r = 2;
        if (qh4Var3.d.isEmpty()) {
            objJ0 = obj;
            context3 = context2;
        } else {
            tk1 tk1Var2 = g22.a;
            Context context5 = context2;
            context3 = context5;
            objJ0 = im3.j0(gk1.f901o, new k9(qh4Var3, context5, str5, hc1Var, (byte) 7), r96Var);
            if (objJ0 != ne1Var) {
                objJ0 = obj;
            }
        }
        if (objJ0 != ne1Var) {
            str8 = str7;
            qh4Var = qh4Var3;
            str9 = str6;
            r96Var.m = qh4Var;
            r96Var.n = null;
            r96Var.f1905o = null;
            r96Var.p = null;
            r96Var.r = 3;
            if (!qh4Var.f.isEmpty()) {
                tk1 tk1Var3 = g22.a;
                Context context6 = context3;
                objJ1 = im3.j0(gk1.f901o, new s11(qh4Var, context6, str8, str9, (hc1) null), r96Var);
                if (objJ1 == ne1Var) {
                    obj = objJ1;
                }
            }
            if (obj != ne1Var) {
                return qh4Var;
            }
        }
        return ne1Var;
    }

    public static final ki4 D(Context context, yh4 yh4Var, final String str) {
        ki4 ki4Var;
        if (!(yh4Var instanceof yh4)) {
            gk0.s();
            return null;
        }
        final byte b2 = 1;
        final byte b3 = 0;
        if (!im3.n(str, "__LottieInternalDefaultCacheKey__")) {
            final int i = yh4Var.a;
            HashMap map = uh4.a;
            final WeakReference weakReference = new WeakReference(context);
            final Context applicationContext = context.getApplicationContext();
            Callable callable = new Callable() { // from class: o.sh4
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int i2 = i;
                    Context context2 = (Context) weakReference.get();
                    if (context2 == null) {
                        context2 = applicationContext;
                    }
                    String str2 = str;
                    qh4 qh4VarA = str2 == null ? null : rh4.b.a(str2);
                    if (qh4VarA != null) {
                        return new ii4(qh4VarA);
                    }
                    try {
                        w36 w36Var = new w36(et1.N(context2.getResources().openRawResource(i2)));
                        if (uh4.c(w36Var, uh4.c).booleanValue()) {
                            ZipInputStream zipInputStream = new ZipInputStream(new v36(w36Var));
                            try {
                                return uh4.b(context2, zipInputStream, str2);
                            } finally {
                                ta8.b(zipInputStream);
                            }
                        }
                        if (!uh4.c(w36Var, uh4.d).booleanValue()) {
                            String[] strArr = kr3.q;
                            return uh4.a(new or3(w36Var), str2, true);
                        }
                        try {
                            w36 w36Var2 = new w36(et1.N(new GZIPInputStream(new v36(w36Var))));
                            String[] strArr2 = kr3.q;
                            return uh4.a(new or3(w36Var2), str2, true);
                        } catch (IOException e) {
                            return new ii4(e);
                        }
                    } catch (Resources.NotFoundException e2) {
                        return new ii4(e2);
                    }
                    return new ii4(e2);
                }
            };
            HashMap map2 = uh4.a;
            qh4 qh4VarA = str == null ? null : rh4.b.a(str);
            ki4Var = qh4VarA != null ? new ki4(qh4VarA) : null;
            if (str != null && map2.containsKey(str)) {
                ki4Var = (ki4) map2.get(str);
            }
            if (ki4Var != null) {
                return ki4Var;
            }
            ki4 ki4Var2 = new ki4(callable);
            if (str != null) {
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                ki4Var2.b(new hi4() { // from class: o.th4
                    @Override // o.hi4
                    public final void onResult(Object obj) {
                        byte b4 = b3;
                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                        String str2 = str;
                        switch (b4) {
                            case 0:
                                HashMap map3 = uh4.a;
                                map3.remove(str2);
                                atomicBoolean2.set(true);
                                if (map3.size() == 0) {
                                    uh4.d();
                                }
                                break;
                            default:
                                HashMap map4 = uh4.a;
                                map4.remove(str2);
                                atomicBoolean2.set(true);
                                if (map4.size() == 0) {
                                    uh4.d();
                                }
                                break;
                        }
                    }
                });
                ki4Var2.a(new hi4() { // from class: o.th4
                    @Override // o.hi4
                    public final void onResult(Object obj) {
                        byte b4 = b2;
                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                        String str2 = str;
                        switch (b4) {
                            case 0:
                                HashMap map3 = uh4.a;
                                map3.remove(str2);
                                atomicBoolean2.set(true);
                                if (map3.size() == 0) {
                                    uh4.d();
                                }
                                break;
                            default:
                                HashMap map4 = uh4.a;
                                map4.remove(str2);
                                atomicBoolean2.set(true);
                                if (map4.size() == 0) {
                                    uh4.d();
                                }
                                break;
                        }
                    }
                });
                if (!atomicBoolean.get()) {
                    map2.put(str, ki4Var2);
                    if (map2.size() == 1) {
                        uh4.d();
                    }
                }
            }
            return ki4Var2;
        }
        final int i2 = yh4Var.a;
        HashMap map3 = uh4.a;
        StringBuilder sb = new StringBuilder("rawRes");
        sb.append((context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_");
        sb.append(i2);
        final String string = sb.toString();
        final WeakReference weakReference2 = new WeakReference(context);
        final Context applicationContext2 = context.getApplicationContext();
        Callable callable2 = new Callable() { // from class: o.sh4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i3 = i2;
                Context context2 = (Context) weakReference2.get();
                if (context2 == null) {
                    context2 = applicationContext2;
                }
                String str2 = string;
                qh4 qh4VarA2 = str2 == null ? null : rh4.b.a(str2);
                if (qh4VarA2 != null) {
                    return new ii4(qh4VarA2);
                }
                try {
                    w36 w36Var = new w36(et1.N(context2.getResources().openRawResource(i3)));
                    if (uh4.c(w36Var, uh4.c).booleanValue()) {
                        ZipInputStream zipInputStream = new ZipInputStream(new v36(w36Var));
                        try {
                            return uh4.b(context2, zipInputStream, str2);
                        } finally {
                            ta8.b(zipInputStream);
                        }
                    }
                    if (!uh4.c(w36Var, uh4.d).booleanValue()) {
                        String[] strArr = kr3.q;
                        return uh4.a(new or3(w36Var), str2, true);
                    }
                    try {
                        w36 w36Var2 = new w36(et1.N(new GZIPInputStream(new v36(w36Var))));
                        String[] strArr2 = kr3.q;
                        return uh4.a(new or3(w36Var2), str2, true);
                    } catch (IOException e) {
                        return new ii4(e);
                    }
                } catch (Resources.NotFoundException e2) {
                    return new ii4(e2);
                }
                return new ii4(e2);
            }
        };
        HashMap map4 = uh4.a;
        qh4 qh4VarA2 = rh4.b.a(string);
        ki4Var = qh4VarA2 != null ? new ki4(qh4VarA2) : null;
        if (map4.containsKey(string)) {
            ki4Var = (ki4) map4.get(string);
        }
        if (ki4Var != null) {
            return ki4Var;
        }
        ki4 ki4Var3 = new ki4(callable2);
        final AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        ki4Var3.b(new hi4() { // from class: o.th4
            @Override // o.hi4
            public final void onResult(Object obj) {
                byte b4 = b3;
                AtomicBoolean atomicBoolean3 = atomicBoolean2;
                String str2 = string;
                switch (b4) {
                    case 0:
                        HashMap map5 = uh4.a;
                        map5.remove(str2);
                        atomicBoolean3.set(true);
                        if (map5.size() == 0) {
                            uh4.d();
                        }
                        break;
                    default:
                        HashMap map6 = uh4.a;
                        map6.remove(str2);
                        atomicBoolean3.set(true);
                        if (map6.size() == 0) {
                            uh4.d();
                        }
                        break;
                }
            }
        });
        ki4Var3.a(new hi4() { // from class: o.th4
            @Override // o.hi4
            public final void onResult(Object obj) {
                byte b4 = b2;
                AtomicBoolean atomicBoolean3 = atomicBoolean2;
                String str2 = string;
                switch (b4) {
                    case 0:
                        HashMap map5 = uh4.a;
                        map5.remove(str2);
                        atomicBoolean3.set(true);
                        if (map5.size() == 0) {
                            uh4.d();
                        }
                        break;
                    default:
                        HashMap map6 = uh4.a;
                        map6.remove(str2);
                        atomicBoolean3.set(true);
                        if (map6.size() == 0) {
                            uh4.d();
                        }
                        break;
                }
            }
        });
        if (!atomicBoolean2.get()) {
            map4.put(string, ki4Var3);
            if (map4.size() == 1) {
                uh4.d();
            }
        }
        return ki4Var3;
    }

    public static final Class E(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            rawType.getClass();
            return E(rawType);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            upperBounds.getClass();
            Object objR0 = cx.R0(upperBounds);
            objR0.getClass();
            return E((Type) objR0);
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            genericComponentType.getClass();
            return E(genericComponentType);
        }
        StringBuilder sb = new StringBuilder("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument ");
        sb.append(type);
        sb.append(" has type ");
        hk0.g(ua5.o(w86.a, type.getClass(), sb));
        return null;
    }

    public static final xm0 F(wm0 wm0Var) {
        return new xm0(wm0Var, false);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c1  */
    public static final nw3 G(wj5 wj5Var, Class cls, List list) throws IllegalAccessException, InvocationTargetException {
        Object obj;
        nw3 fo5Var;
        Field field;
        Object obj2;
        nw3 nw3VarT;
        Field field2;
        nw3 nc2Var;
        nw3[] nw3VarArr = (nw3[]) list.toArray(new nw3[0]);
        nw3[] nw3VarArr2 = (nw3[]) Arrays.copyOf(nw3VarArr, nw3VarArr.length);
        if (cls.isEnum() && cls.getAnnotation(lq6.class) == null && cls.getAnnotation(bo5.class) == null) {
            Object[] enumConstants = cls.getEnumConstants();
            String canonicalName = cls.getCanonicalName();
            canonicalName.getClass();
            enumConstants.getClass();
            nc2Var = new nc2(canonicalName, (Enum[]) enumConstants);
        } else {
            nw3[] nw3VarArr3 = (nw3[]) Arrays.copyOf(nw3VarArr2, nw3VarArr2.length);
            try {
                Field declaredField = cls.getDeclaredField("Companion");
                declaredField.setAccessible(true);
                obj = declaredField.get(null);
            } catch (Throwable unused) {
                obj = null;
            }
            nw3 nw3VarT2 = obj == null ? null : ep1.t(obj, (nw3[]) Arrays.copyOf(nw3VarArr3, nw3VarArr3.length));
            if (nw3VarT2 != null) {
                nc2Var = nw3VarT2;
            } else {
                String canonicalName2 = cls.getCanonicalName();
                if (canonicalName2 == null || bc7.N(false, canonicalName2, "java.") || bc7.N(false, canonicalName2, "kotlin.")) {
                    fo5Var = null;
                } else {
                    Field[] declaredFields = cls.getDeclaredFields();
                    declaredFields.getClass();
                    int length = declaredFields.length;
                    int i = 0;
                    boolean z = false;
                    Field field3 = null;
                    while (true) {
                        if (i >= length) {
                            if (!z) {
                                break;
                            }
                            break;
                        }
                        Field field4 = declaredFields[i];
                        if (im3.n(field4.getName(), "INSTANCE") && im3.n(field4.getType(), cls) && Modifier.isStatic(field4.getModifiers())) {
                            if (!z) {
                                z = true;
                                field3 = field4;
                            }
                        }
                        i++;
                        field3 = null;
                        break;
                    }
                    if (field3 == null) {
                        fo5Var = null;
                    } else {
                        Object obj3 = field3.get(null);
                        Method[] methods = cls.getMethods();
                        methods.getClass();
                        int length2 = methods.length;
                        int i2 = 0;
                        boolean z2 = false;
                        Method method = null;
                        while (true) {
                            if (i2 >= length2) {
                                if (!z2) {
                                    break;
                                }
                                break;
                            }
                            Method method2 = methods[i2];
                            if (im3.n(method2.getName(), "serializer")) {
                                Class<?>[] parameterTypes = method2.getParameterTypes();
                                parameterTypes.getClass();
                                if (parameterTypes.length == 0 && im3.n(method2.getReturnType(), nw3.class)) {
                                    if (!z2) {
                                        z2 = true;
                                        method = method2;
                                    }
                                }
                            }
                            i2++;
                            method = null;
                            break;
                        }
                        if (method == null) {
                            fo5Var = null;
                        } else {
                            Object objInvoke = method.invoke(obj3, null);
                            if (objInvoke instanceof nw3) {
                                fo5Var = (nw3) objInvoke;
                            } else {
                                fo5Var = null;
                            }
                        }
                    }
                }
                if (fo5Var != null) {
                    nc2Var = fo5Var;
                } else {
                    nw3[] nw3VarArr4 = (nw3[]) Arrays.copyOf(nw3VarArr2, nw3VarArr2.length);
                    Field[] declaredFields2 = cls.getDeclaredFields();
                    declaredFields2.getClass();
                    int length3 = declaredFields2.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length3) {
                            field = null;
                            break;
                        }
                        field = declaredFields2[i3];
                        if (Modifier.isStatic(field.getModifiers()) && field.getType().getAnnotation(vy4.class) != null) {
                            break;
                        }
                        i3++;
                    }
                    if (field == null) {
                        obj2 = null;
                    } else {
                        try {
                            field.setAccessible(true);
                            obj2 = field.get(null);
                        } catch (Throwable unused2) {
                            obj2 = null;
                        }
                    }
                    if (obj2 == null || (nw3VarT = ep1.t(obj2, (nw3[]) Arrays.copyOf(nw3VarArr4, nw3VarArr4.length))) == null) {
                        try {
                            Class<?>[] declaredClasses = cls.getDeclaredClasses();
                            declaredClasses.getClass();
                            int length4 = declaredClasses.length;
                            Class<?> cls2 = null;
                            int i4 = 0;
                            boolean z3 = false;
                            while (true) {
                                if (i4 < length4) {
                                    Class<?> cls3 = declaredClasses[i4];
                                    if (cls3.getSimpleName().equals("$serializer")) {
                                        if (!z3) {
                                            z3 = true;
                                            cls2 = cls3;
                                        }
                                    }
                                    i4++;
                                } else if (!z3) {
                                }
                                cls2 = null;
                                break;
                            }
                            Object obj4 = (cls2 == null || (field2 = cls2.getField("INSTANCE")) == null) ? null : field2.get(null);
                            nw3VarT = obj4 instanceof nw3 ? (nw3) obj4 : null;
                        } catch (NoSuchFieldException unused3) {
                        }
                    }
                    nc2Var = nw3VarT;
                    if (nc2Var == null) {
                        if (cls.getAnnotation(bo5.class) == null) {
                            lq6 lq6Var = (lq6) cls.getAnnotation(lq6.class);
                            if (lq6Var != null) {
                                Class clsWith = lq6Var.with();
                                x86 x86Var = w86.a;
                                if (x86Var.b(clsWith).equals(x86Var.b(fo5.class))) {
                                }
                            }
                            nc2Var = null;
                        }
                        fo5Var = new fo5(w86.a.b(cls));
                        nc2Var = fo5Var;
                    }
                }
            }
        }
        if (nc2Var != null) {
            return nc2Var;
        }
        x86 x86Var2 = w86.a;
        nw3 nw3Var = (nw3) qs5.a.get(x86Var2.b(cls));
        if (nw3Var != null) {
            return nw3Var;
        }
        if (cls.isInterface()) {
            return new fo5(x86Var2.b(cls));
        }
        return null;
    }

    public static final xh4 H(yh4 yh4Var, ux2 ux2Var) {
        ux2Var.X(-1248473602);
        byte b2 = 3;
        m52 m52Var = new m52(b2, null, b2);
        Context context = (Context) ux2Var.j(lh.b);
        ux2Var.X(1388713953);
        boolean zF = ux2Var.f(yh4Var);
        Object objK = ux2Var.K();
        aw awVar = e01.a;
        if (zF || objK == awVar) {
            objK = h57.p(new xh4());
            ux2Var.g0(objK);
        }
        px4 px4Var = (px4) objK;
        ux2Var.p(false);
        ux2Var.X(1388714244);
        boolean zF2 = ux2Var.f(yh4Var) | ux2Var.f("__LottieInternalDefaultCacheKey__");
        Object objK2 = ux2Var.K();
        if (zF2 || objK2 == awVar) {
            objK2 = D(context, yh4Var, "__LottieInternalDefaultCacheKey__");
            ux2Var.g0(objK2);
        }
        ux2Var.p(false);
        ck3.h(yh4Var, "__LottieInternalDefaultCacheKey__", new s96(m52Var, context, yh4Var, px4Var, null), ux2Var);
        xh4 xh4Var = (xh4) px4Var.getValue();
        ux2Var.p(false);
        return xh4Var;
    }

    public static final nw3 I(wj5 wj5Var, Type type) {
        wj5Var.getClass();
        type.getClass();
        nw3 nw3VarJ = J(wj5Var, type, true);
        if (nw3VarJ != null) {
            return nw3VarJ;
        }
        Class clsE = E(type);
        clsE.getClass();
        String strF = w86.a.b(clsE).f();
        if (strF == null) {
            strF = "<local class name not available>";
        }
        throw new nq6(fx3.g("Serializer for class '", strF, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v21 o.nw3, still in use, count: 2, list:
          (r7v21 o.nw3) from 0x002d: IF  (r7v21 o.nw3) == (null o.nw3)  -> B:50:0x00f0 A[HIDDEN]
          (r7v21 o.nw3) from 0x0031: PHI (r7 I:??) = (r7v21 o.nw3) binds: [B:11:0x002d] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:133)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static final o.nw3 J(o.wj5 r7, java.lang.reflect.Type r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.vt1.J(o.wj5, java.lang.reflect.Type, boolean):o.nw3");
    }

    public static void K(int i, wz3 wz3Var) {
        PorterDuff.Mode mode;
        if (Build.VERSION.SDK_INT >= 29) {
            eq.v(wz3Var, i != 0 ? eq.q(i) : null);
            return;
        }
        if (i == 0) {
            wz3Var.setXfermode(null);
            return;
        }
        switch (ua5.B(i)) {
            case 0:
                mode = PorterDuff.Mode.CLEAR;
                break;
            case 1:
                mode = PorterDuff.Mode.SRC;
                break;
            case 2:
                mode = PorterDuff.Mode.DST;
                break;
            case 3:
                mode = PorterDuff.Mode.SRC_OVER;
                break;
            case 4:
                mode = PorterDuff.Mode.DST_OVER;
                break;
            case 5:
                mode = PorterDuff.Mode.SRC_IN;
                break;
            case 6:
                mode = PorterDuff.Mode.DST_IN;
                break;
            case 7:
                mode = PorterDuff.Mode.SRC_OUT;
                break;
            case 8:
                mode = PorterDuff.Mode.DST_OUT;
                break;
            case ep1.b /* 9 */:
                mode = PorterDuff.Mode.SRC_ATOP;
                break;
            case ep1.c /* 10 */:
                mode = PorterDuff.Mode.DST_ATOP;
                break;
            case 11:
                mode = PorterDuff.Mode.XOR;
                break;
            case ep1.d /* 12 */:
                mode = PorterDuff.Mode.ADD;
                break;
            case 13:
                mode = PorterDuff.Mode.MULTIPLY;
                break;
            case 14:
                mode = PorterDuff.Mode.SCREEN;
                break;
            case 15:
                mode = PorterDuff.Mode.OVERLAY;
                break;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                mode = PorterDuff.Mode.DARKEN;
                break;
            case 17:
                mode = PorterDuff.Mode.LIGHTEN;
                break;
            default:
                mode = null;
                break;
        }
        wz3Var.setXfermode(mode != null ? new PorterDuffXfermode(mode) : null);
    }

    public static void L(EditorInfo editorInfo, CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            b4.l(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i >= 30) {
            b4.l(editorInfo, charSequence);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 : i2;
        if (i2 <= i3) {
            i2 = i3;
        }
        int length = charSequence.length();
        if (i4 < 0 || i2 > length) {
            M(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            M(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            M(editorInfo, charSequence, i4, i2);
            return;
        }
        int i6 = i2 - i4;
        int i7 = i6 > 1024 ? 0 : i6;
        int i8 = 2048 - i7;
        int iMin = Math.min(charSequence.length() - i2, i8 - Math.min(i4, (int) (((double) i8) * 0.8d)));
        int iMin2 = Math.min(i4, i8 - iMin);
        int i9 = i4 - iMin2;
        if (Character.isLowSurrogate(charSequence.charAt(i9))) {
            i9++;
            iMin2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i2 + iMin) - 1))) {
            iMin--;
        }
        int i10 = iMin2 + i7;
        M(editorInfo, i7 != i6 ? TextUtils.concat(charSequence.subSequence(i9, i9 + iMin2), charSequence.subSequence(i2, iMin + i2)) : charSequence.subSequence(i9, i10 + iMin + i9), iMin2, i10);
    }

    public static void M(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0036  */
    /* JADX WARN: Code duplicated, block: B:17:0x003c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    public static final ht2 N(ht2 ht2Var, ht2 ht2Var2) {
        ht2Var.getClass();
        ht2Var2.getClass();
        if (!ht2Var.equals(ht2Var2) && !ht2Var2.d()) {
            String strB = ht2Var.b();
            String strB2 = ht2Var2.b();
            if (bc7.N(false, strB, strB2) && strB.charAt(strB2.length()) == '.') {
                if (!ht2Var2.d()) {
                    if (ht2Var.equals(ht2Var2)) {
                        return new ht2(ht2Var.b().substring(ht2Var2.b().length() + 1));
                    }
                    ht2 ht2Var3 = ht2.c;
                    ht2Var3.getClass();
                    return ht2Var3;
                }
            }
        } else if (!ht2Var2.d()) {
            if (ht2Var.equals(ht2Var2)) {
                return new ht2(ht2Var.b().substring(ht2Var2.b().length() + 1));
            }
            ht2 ht2Var4 = ht2.c;
            ht2Var4.getClass();
            return ht2Var4;
        }
        return ht2Var;
    }

    public static Object O(hw2 hw2Var, Object obj, hc1 hc1Var) {
        hw2Var.getClass();
        de1 context = hc1Var.getContext();
        Object lm3Var = context == ba2.m ? new lm3(hc1Var) : new mm3(hc1Var, context);
        e8.i(2, hw2Var);
        return hw2Var.invoke(obj, lm3Var);
    }

    /* JADX WARN: Code duplicated, block: B:157:0x027b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:160:0x0281  */
    /* JADX WARN: Code duplicated, block: B:163:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:164:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:167:0x02ae A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:168:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:171:0x02c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:172:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:175:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:176:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:179:0x030a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:180:0x030c  */
    /* JADX WARN: Code duplicated, block: B:183:0x033b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:184:0x033d  */
    /* JADX WARN: Code duplicated, block: B:187:0x0372 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:188:0x0374  */
    /* JADX WARN: Code duplicated, block: B:191:0x039e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:192:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:195:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:197:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:199:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:201:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:203:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:205:0x042a  */
    /* JADX WARN: Code duplicated, block: B:207:0x0451  */
    /* JADX WARN: Code duplicated, block: B:208:0x0453  */
    /* JADX WARN: Code duplicated, block: B:211:0x045f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:212:0x0461  */
    /* JADX WARN: Code duplicated, block: B:215:0x0484 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:216:0x0486  */
    /* JADX WARN: Code duplicated, block: B:219:0x04ab A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:220:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:223:0x04d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:224:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:227:0x04f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:230:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:233:0x051c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:234:0x051e  */
    /* JADX WARN: Code duplicated, block: B:237:0x0537 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:240:0x053c  */
    /* JADX WARN: Code duplicated, block: B:243:0x055c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:244:0x055e  */
    /* JADX WARN: Code duplicated, block: B:247:0x057e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:250:0x0583  */
    /* JADX WARN: Code duplicated, block: B:253:0x05a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:254:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:259:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:265:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:268:0x05f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:269:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:274:0x0631 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:275:0x0633  */
    /* JADX WARN: Code duplicated, block: B:278:0x064f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:279:0x0651  */
    /* JADX WARN: Code duplicated, block: B:282:0x066d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:283:0x066f  */
    /* JADX WARN: Code duplicated, block: B:286:0x068b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:287:0x068d  */
    /* JADX WARN: Code duplicated, block: B:290:0x06a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:291:0x06ab  */
    /* JADX WARN: Code duplicated, block: B:294:0x06c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:295:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:298:0x06e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:299:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:302:0x06f9  */
    /* JADX WARN: Code duplicated, block: B:303:0x071e  */
    /* JADX WARN: Code duplicated, block: B:305:0x072f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:306:0x0731  */
    /* JADX WARN: Code duplicated, block: B:309:0x0755 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:310:0x0757  */
    /* JADX WARN: Code duplicated, block: B:313:0x077b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:316:0x0780  */
    /* JADX WARN: Code duplicated, block: B:319:0x07b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:320:0x07b2  */
    /* JADX WARN: Code duplicated, block: B:330:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:? A[RETURN, SYNTHETIC] */
    public static final void a(final ns1 ns1Var, final boolean z, final Function1 function1, final Function1 function2, final Function0 function0, final List list, fs4 fs4Var, final Function1 function3, final Function1 function4, final Function1 function5, final Function0 function6, String str, final vx6 vx6Var, ru1 ru1Var, ux2 ux2Var, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        ux2 ux2Var2;
        final fs4 fs4Var2;
        final String str2;
        final ru1 ru1Var2;
        String str3;
        UUID uuid;
        boolean z2;
        final ru1 ru1Var3;
        int i6;
        fs4 fs4Var3;
        px4 px4Var;
        px4 px4Var2;
        px4 px4Var3;
        boolean z3;
        boolean zH;
        Object objK;
        aw awVar;
        px4 px4Var4;
        px4 px4Var5;
        int i7;
        px4 px4Var6;
        boolean z4;
        Object objK2;
        boolean zG;
        px4 px4Var7;
        Object objK3;
        en3 en3VarH;
        Object objK4;
        f88 f88Var;
        boolean zH2;
        Object objK5;
        boolean zF;
        Object objK6;
        px4 px4Var8;
        boolean zH3;
        Object objK7;
        boolean zH4;
        Object objK8;
        final String str4;
        final fs4 fs4Var4;
        ns1 ns1Var2;
        boolean z5;
        ru1 ru1Var4;
        boolean z6;
        boolean zH5;
        Object objK9;
        boolean z7;
        boolean zF2;
        Object objK10;
        boolean zF3;
        Object objK11;
        byte b2;
        px4 px4Var9;
        boolean zF4;
        Object objK12;
        boolean zF5;
        Object objK13;
        boolean zH6;
        Object objK14;
        boolean zH7;
        Object objK15;
        px4 px4Var10;
        boolean zH8;
        Object objK16;
        px4 px4Var11;
        boolean zH9;
        Object objK17;
        hc1 hc1Var;
        boolean zH10;
        Object objK18;
        px4 px4Var12;
        boolean z8;
        boolean zF6;
        Object bjVar;
        final ns1 ns1Var3;
        final ru1 ru1Var5;
        aw awVar2;
        boolean zH11;
        Object objK19;
        boolean zH12;
        Object objK20;
        boolean zH13;
        Object objK21;
        boolean zH14;
        Object objK22;
        boolean zH15;
        Object objK23;
        boolean zH16;
        Object objK24;
        boolean zH17;
        Object objK25;
        jt1 jt1Var;
        boolean zH18;
        Object objK26;
        boolean zH19;
        Object objK27;
        boolean zH20;
        Object objK28;
        final ru1 ru1Var6;
        boolean zH21;
        Object objK29;
        ru1 ru1Var7;
        j56 j56VarR;
        j56 j56VarR2;
        boolean z9;
        ns1Var.getClass();
        boolean z10 = ns1Var.l;
        Integer num = ns1Var.d;
        UUID uuid2 = ns1Var.v;
        long j = ns1Var.a;
        function1.getClass();
        function2.getClass();
        function0.getClass();
        list.getClass();
        ux2Var.Y(-1002958531);
        if ((i & 6) == 0) {
            i4 = i | (ux2Var.h(ns1Var) ? 4 : 2);
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= ux2Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= ux2Var.h(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= ux2Var.h(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= ux2Var.h(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= (262144 & i) == 0 ? ux2Var.f(list) : ux2Var.h(list) ? 131072 : 65536;
        }
        int i8 = i4 | 1572864;
        if ((i & 12582912) == 0) {
            i8 |= ux2Var.h(function3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i8 |= ux2Var.h(function4) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i8 |= ux2Var.h(function5) ? 536870912 : 268435456;
        }
        int i9 = i8;
        if ((i2 & 6) == 0) {
            i5 = (ux2Var.h(function6) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i10 = i3 & 2048;
        if (i10 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= ux2Var.f(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= (i2 & 512) == 0 ? ux2Var.f(vx6Var) : ux2Var.h(vx6Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= 1024;
        }
        int i11 = i5;
        if (ux2Var.N(i9 & 1, ((i9 & 306783379) == 306783378 && (i11 & 1171) == 1170) ? false : true)) {
            ux2Var.S();
            if ((i & 1) == 0 || ux2Var.x()) {
                str3 = i10 != 0 ? null : str;
                dl5 dl5Var = new dl5(new vr1((byte) 13), (byte) 1);
                we8 we8VarA = id4.a(ux2Var);
                if (we8VarA == null) {
                    hk0.l("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                uuid = uuid2;
                z2 = z10;
                oe8 oe8VarT = g57.t(w86.a.b(ru1.class), we8VarA, str3, dl5Var, h57.k(we8VarA), ux2Var);
                ux2Var2 = ux2Var;
                ru1Var3 = (ru1) oe8VarT;
                i6 = i11 & (-7169);
                fs4Var3 = cs4.b;
            } else {
                ux2Var.Q();
                i6 = i11 & (-7169);
                ru1Var3 = ru1Var;
                ux2Var2 = ux2Var;
                uuid = uuid2;
                fs4Var3 = fs4Var;
                z2 = z10;
                str3 = str;
            }
            ux2Var2.q();
            wt1 wt1Var = (wt1) g57.g(ru1Var3.A, ux2Var2).getValue();
            int i12 = i6;
            px4 px4VarT = h57.t(function4, ux2Var2);
            px4 px4VarT2 = h57.t(function5, ux2Var2);
            px4 px4VarT3 = h57.t(function6, ux2Var2);
            px4 px4VarT4 = h57.t(function0, ux2Var2);
            px4 px4VarT5 = h57.t(function1, ux2Var2);
            int i13 = i9 >> 9;
            px4 px4VarT6 = h57.t(function2, ux2Var2);
            px4 px4VarT7 = h57.t(function3, ux2Var2);
            boolean z11 = z && ru1Var3.e1();
            if (z) {
                wt1 wt1Var2 = (wt1) ru1Var3.A.m.getValue();
                px4Var3 = px4VarT3;
                ns1 ns1VarY0 = ru1Var3.Y0();
                if (ns1VarY0 == null) {
                    px4Var = px4VarT7;
                    px4Var2 = px4VarT2;
                } else {
                    px4Var2 = px4VarT2;
                    if (wt1Var2.v && wt1Var2.w) {
                        px4Var = px4VarT7;
                        if (im3.n(ns1VarY0.b, wt1Var2.l)) {
                            String str5 = ns1VarY0.h;
                            if (str5 == null) {
                                str5 = "";
                            }
                            if (!str5.equals(wt1Var2.n) || ((!(z9 = ns1VarY0.l) && wt1Var2.m != null) || (z9 && (wt1Var2.p || wt1Var2.u)))) {
                            }
                            zH = ux2Var2.h(ru1Var3) | ux2Var2.f(px4VarT5) | ux2Var2.f(px4VarT6) | ux2Var2.f(px4VarT4);
                            objK = ux2Var2.K();
                            awVar = e01.a;
                            if (!zH || objK == awVar) {
                                objK = new eb((Object) ru1Var3, (Object) px4VarT5, (Object) px4VarT6, (Object) px4VarT4, (byte) 6);
                                px4Var4 = px4VarT6;
                                px4Var5 = px4VarT4;
                                ux2Var2.g0(objK);
                            } else {
                                px4Var4 = px4VarT6;
                                px4Var5 = px4VarT4;
                            }
                            Function0 function7 = (Function0) objK;
                            i7 = i9 & 112;
                            px4Var6 = px4Var5;
                            if (i7 == 32) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            objK2 = ux2Var2.K();
                            if (z4 || objK2 == awVar) {
                                objK2 = new q71(z);
                                ux2Var2.g0(objK2);
                            }
                            Function0 function8 = (Function0) objK2;
                            zG = ux2Var2.g(z3);
                            px4Var7 = px4Var4;
                            objK3 = ux2Var2.K();
                            if (zG || objK3 == awVar) {
                                objK3 = new q71(z3);
                                ux2Var2.g0(objK3);
                            }
                            en3VarH = nv1.H(function8, (Function0) objK3, function7, ux2Var2);
                            et1.c((i9 >> 3) & 14, ux2Var2, z);
                            objK4 = ux2Var2.K();
                            if (objK4 == awVar) {
                                objK4 = new l5(2, null, (byte) 7);
                                ux2Var2.g0(objK4);
                            }
                            f88Var = f88.a;
                            ck3.i(f88Var, (hw2) objK4, ux2Var2);
                            zH2 = ux2Var2.h(ru1Var3) | ux2Var2.f(px4VarT);
                            objK5 = ux2Var2.K();
                            if (zH2 || objK5 == awVar) {
                                objK5 = new rt1(ru1Var3, px4VarT, null, (byte) 2);
                                ux2Var2.g0(objK5);
                            }
                            ck3.i(f88Var, (hw2) objK5, ux2Var2);
                            boolean z12 = z2;
                            zF = ux2Var2.f(ru1Var3) | ux2Var2.e(r19) | ux2Var2.f(uuid) | ux2Var2.f(r17) | ux2Var2.g(z12);
                            objK6 = ux2Var2.K();
                            if (zF || objK6 == awVar) {
                                objK6 = h57.p(Boolean.FALSE);
                                ux2Var2.g0(objK6);
                            }
                            px4Var8 = (px4) objK6;
                            Object[] objArr = {ru1Var3, Long.valueOf(r19), uuid, r17, Boolean.valueOf(z12)};
                            zH3 = ux2Var2.h(ru1Var3) | ux2Var2.h(ns1Var) | ux2Var2.f(px4Var8);
                            objK7 = ux2Var2.K();
                            if (zH3 || objK7 == awVar) {
                                objK7 = new m5((Object) ru1Var3, (Object) ns1Var, (Object) px4Var8, (byte) 14);
                                ux2Var2.g0(objK7);
                            }
                            ck3.f(objArr, (Function1) objK7, ux2Var2);
                            Object[] objArr2 = {ru1Var3, Long.valueOf(j), uuid, num, Boolean.valueOf(z12)};
                            zH4 = ux2Var2.h(ru1Var3) | ux2Var2.h(ns1Var);
                            objK8 = ux2Var2.K();
                            if (zH4 || objK8 == awVar) {
                                objK8 = new qt1(ru1Var3, ns1Var, null, (byte) 1);
                                ux2Var2.g0(objK8);
                            }
                            ck3.j(objArr2, (hw2) objK8, ux2Var2);
                            if (!((Boolean) px4Var8.getValue()).booleanValue()) {
                                j56VarR2 = ux2Var2.r();
                                if (j56VarR2 != null) {
                                    final byte b3 = 1;
                                    final String str6 = str3;
                                    final fs4 fs4Var5 = fs4Var3;
                                    j56VarR2.d = new hw2() { // from class: o.nt1
                                        @Override // o.hw2
                                        public final Object invoke(Object obj, Object obj2) {
                                            byte b4 = b3;
                                            f88 f88Var2 = f88.a;
                                            int i14 = i2;
                                            int i15 = i;
                                            switch (b4) {
                                                case 0:
                                                    ((Integer) obj2).getClass();
                                                    int iY = yo1.Y(i15 | 1);
                                                    int iY2 = yo1.Y(i14);
                                                    vt1.a(ns1Var, z, function1, function2, function0, list, fs4Var5, function3, function4, function5, function6, str6, vx6Var, ru1Var3, (ux2) obj, iY, iY2, i3);
                                                    break;
                                                case 1:
                                                    ((Integer) obj2).getClass();
                                                    int iY3 = yo1.Y(i15 | 1);
                                                    int iY4 = yo1.Y(i14);
                                                    vt1.a(ns1Var, z, function1, function2, function0, list, fs4Var5, function3, function4, function5, function6, str6, vx6Var, ru1Var3, (ux2) obj, iY3, iY4, i3);
                                                    break;
                                                default:
                                                    ((Integer) obj2).getClass();
                                                    int iY5 = yo1.Y(i15 | 1);
                                                    int iY6 = yo1.Y(i14);
                                                    vt1.a(ns1Var, z, function1, function2, function0, list, fs4Var5, function3, function4, function5, function6, str6, vx6Var, ru1Var3, (ux2) obj, iY5, iY6, i3);
                                                    break;
                                            }
                                            return f88Var2;
                                        }
                                    };
                                    return;
                                }
                                return;
                            }
                            str4 = str3;
                            fs4Var4 = fs4Var3;
                            ns1Var2 = wt1Var.b;
                            z5 = wt1Var.a;
                            if (ns1Var2 == null) {
                                j56VarR = ux2Var2.r();
                                if (j56VarR != null) {
                                    final byte b4 = 2;
                                    j56VarR.d = new hw2() { // from class: o.nt1
                                        @Override // o.hw2
                                        public final Object invoke(Object obj, Object obj2) {
                                            byte b5 = b4;
                                            f88 f88Var2 = f88.a;
                                            int i14 = i2;
                                            int i15 = i;
                                            switch (b5) {
                                                case 0:
                                                    ((Integer) obj2).getClass();
                                                    int iY = yo1.Y(i15 | 1);
                                                    int iY2 = yo1.Y(i14);
                                                    vt1.a(ns1Var, z, function1, function2, function0, list, fs4Var4, function3, function4, function5, function6, str4, vx6Var, ru1Var3, (ux2) obj, iY, iY2, i3);
                                                    break;
                                                case 1:
                                                    ((Integer) obj2).getClass();
                                                    int iY3 = yo1.Y(i15 | 1);
                                                    int iY4 = yo1.Y(i14);
                                                    vt1.a(ns1Var, z, function1, function2, function0, list, fs4Var4, function3, function4, function5, function6, str4, vx6Var, ru1Var3, (ux2) obj, iY3, iY4, i3);
                                                    break;
                                                default:
                                                    ((Integer) obj2).getClass();
                                                    int iY5 = yo1.Y(i15 | 1);
                                                    int iY6 = yo1.Y(i14);
                                                    vt1.a(ns1Var, z, function1, function2, function0, list, fs4Var4, function3, function4, function5, function6, str4, vx6Var, ru1Var3, (ux2) obj, iY5, iY6, i3);
                                                    break;
                                            }
                                            return f88Var2;
                                        }
                                    };
                                    return;
                                }
                                return;
                            }
                            ru1Var4 = ru1Var3;
                            long j2 = ns1Var2.a;
                            Object[] objArr3 = {Long.valueOf(j2), ns1Var2.d, Boolean.valueOf(ns1Var2.l), Boolean.valueOf(z)};
                            if (i7 == 32) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            zH5 = z6 | ux2Var2.h(ru1Var4);
                            objK9 = ux2Var2.K();
                            if (zH5 || objK9 == awVar) {
                                objK9 = new pt1(z, ru1Var4, (hc1) null);
                                ux2Var2.g0(objK9);
                            }
                            ck3.j(objArr3, (hw2) objK9, ux2Var2);
                            Boolean boolValueOf = Boolean.valueOf(z11);
                            z7 = z11;
                            zF2 = ux2Var2.f(px4VarT5) | ux2Var2.g(z7);
                            objK10 = ux2Var2.K();
                            if (zF2 || objK10 == awVar) {
                                objK10 = new e81(px4VarT5, z7, null, (byte) 2);
                                ux2Var2.g0(objK10);
                            }
                            ck3.i(boolValueOf, (hw2) objK10, ux2Var2);
                            Boolean boolValueOf2 = Boolean.valueOf(z3);
                            zF3 = ux2Var2.f(px4Var7) | ux2Var2.g(z3);
                            objK11 = ux2Var2.K();
                            b2 = 3;
                            if (zF3 || objK11 == awVar) {
                                objK11 = new e81(px4Var7, z3, null, b2);
                                ux2Var2.g0(objK11);
                            }
                            ck3.i(boolValueOf2, (hw2) objK11, ux2Var2);
                            Boolean boolValueOf3 = Boolean.valueOf(z5);
                            px4Var9 = px4Var;
                            zF4 = ux2Var2.f(px4Var9) | ux2Var2.h(wt1Var);
                            objK12 = ux2Var2.K();
                            if (zF4 || objK12 == awVar) {
                                objK12 = new i9(px4Var9, wt1Var, null, (byte) 8);
                                ux2Var2.g0(objK12);
                            }
                            ck3.i(boolValueOf3, (hw2) objK12, ux2Var2);
                            zF5 = ux2Var2.f(px4VarT5) | ux2Var2.f(px4Var7) | ux2Var2.f(px4Var9);
                            objK13 = ux2Var2.K();
                            if (zF5 || objK13 == awVar) {
                                objK13 = new m71(px4VarT5, px4Var7, px4Var9, (byte) 2);
                                ux2Var2.g0(objK13);
                            }
                            ck3.e(f88Var, (Function1) objK13, ux2Var2);
                            Long lValueOf = Long.valueOf(j2);
                            zH6 = ux2Var2.h(ru1Var4) | ux2Var2.h(ns1Var2);
                            objK14 = ux2Var2.K();
                            if (zH6 || objK14 == awVar) {
                                objK14 = new qt1(ru1Var4, ns1Var2, null, (byte) 0);
                                ux2Var2.g0(objK14);
                            }
                            ck3.i(lValueOf, (hw2) objK14, ux2Var2);
                            zH7 = ux2Var2.h(ru1Var4);
                            objK15 = ux2Var2.K();
                            if (zH7 || objK15 == awVar) {
                                objK15 = new ac(ru1Var4, null, (byte) 4);
                                ux2Var2.g0(objK15);
                            }
                            ck3.i(f88Var, (hw2) objK15, ux2Var2);
                            px4Var10 = px4Var2;
                            zH8 = ux2Var2.h(ru1Var4) | ux2Var2.f(px4Var10);
                            objK16 = ux2Var2.K();
                            if (zH8 || objK16 == awVar) {
                                objK16 = new rt1(ru1Var4, px4Var10, null, (byte) 0);
                                ux2Var2.g0(objK16);
                            }
                            ck3.i(f88Var, (hw2) objK16, ux2Var2);
                            px4Var11 = px4Var3;
                            zH9 = ux2Var2.h(ru1Var4) | ux2Var2.f(px4Var11);
                            objK17 = ux2Var2.K();
                            if (!zH9 || objK17 == awVar) {
                                hc1Var = null;
                                objK17 = new rt1(ru1Var4, px4Var11, hc1Var, (byte) 1);
                                ux2Var2.g0(objK17);
                            } else {
                                hc1Var = null;
                            }
                            ck3.i(f88Var, (hw2) objK17, ux2Var2);
                            zH10 = ux2Var2.h(ru1Var4) | ux2Var2.f(px4Var6) | ux2Var2.f(px4VarT);
                            objK18 = ux2Var2.K();
                            if (!zH10 || objK18 == awVar) {
                                px4Var12 = px4Var6;
                                j0 j0Var = new j0((Object) ru1Var4, (Object) px4Var12, (Object) px4VarT, hc1Var, (byte) 24);
                                ux2Var2.g0(j0Var);
                                objK18 = j0Var;
                            } else {
                                px4Var12 = px4Var6;
                            }
                            ck3.i(f88Var, (hw2) objK18, ux2Var2);
                            if ((i12 & 896) != 256 || ((i12 & 512) != 0 && ux2Var2.h(vx6Var))) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            zF6 = z8 | ux2Var2.f(px4Var12) | ux2Var2.h(ru1Var4) | ux2Var2.h(en3VarH);
                            Object objK30 = ux2Var2.K();
                            if (!zF6 || objK30 == awVar) {
                                px4 px4Var13 = px4Var12;
                                ns1Var3 = ns1Var2;
                                ru1Var5 = ru1Var4;
                                awVar2 = awVar;
                                bjVar = new bj(vx6Var, px4Var13, ru1Var5, en3VarH, null, (byte) 7);
                                ux2Var2.g0(bjVar);
                            } else {
                                ns1Var3 = ns1Var2;
                                awVar2 = awVar;
                                ru1Var5 = ru1Var4;
                                bjVar = objK30;
                            }
                            ck3.i(vx6Var, (hw2) bjVar, ux2Var2);
                            zH11 = ux2Var2.h(ru1Var5) | ux2Var2.h(ns1Var3);
                            objK19 = ux2Var2.K();
                            if (zH11 || objK19 == awVar2) {
                                final byte b5 = 0;
                                objK19 = new Function0() { // from class: o.mt1
                                    /* JADX WARN: Code duplicated, block: B:46:0x0138  */
                                    /* JADX WARN: Code duplicated, block: B:50:0x0179  */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object a() {
                                        ShortcutManager shortcutManager;
                                        l97 l97Var;
                                        Object value;
                                        List<ShortcutInfo> pinnedShortcuts;
                                        List<ShortcutInfo> pinnedShortcuts2;
                                        byte b6 = b5;
                                        byte size = 0;
                                        size = 0;
                                        byte b7 = 1;
                                        ru1 ru1Var8 = ru1Var5;
                                        byte b8 = 9;
                                        ns1 ns1Var4 = ns1Var3;
                                        hc1 hc1Var2 = null;
                                        byte b9 = 2;
                                        f88 f88Var2 = f88.a;
                                        switch (b6) {
                                            case 0:
                                                ns1Var4.getClass();
                                                im3.R(e8.n(ru1Var8), ru1Var8.x, null, new gu1(ru1Var8, ns1Var4, hc1Var2, b9), 2);
                                                break;
                                            case 1:
                                                ns1Var4.getClass();
                                                im3.R(e8.n(ru1Var8), ru1Var8.x, null, new gu1(ru1Var8, ns1Var4, hc1Var2, b7), 2);
                                                break;
                                            case 2:
                                                ns1Var4.getClass();
                                                im3.R(e8.n(ru1Var8), ru1Var8.x, null, new gu1(ru1Var8, ns1Var4, hc1Var2, size), 2);
                                                break;
                                            case 3:
                                                ns1Var4.getClass();
                                                cr crVar = ru1Var8.p;
                                                xk1 xk1Var = ru1Var8.V;
                                                crVar.getClass();
                                                xk1Var.getClass();
                                                ru1 ru1Var9 = (ru1) xk1Var.n;
                                                long j3 = ns1Var4.a;
                                                BigInteger bigIntegerValueOf = (j3 <= 0 || j3 > 4294967295L) ? null : BigInteger.valueOf(144115188075855872L + j3);
                                                e27 e27Var = e27.a;
                                                if (bigIntegerValueOf != null) {
                                                    IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                    if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                        ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(bigIntegerValueOf);
                                                        if (chatConversationIDRequestPrivateRoomWithEndPoint == null || chatConversationIDRequestPrivateRoomWithEndPoint.Equal(ChatConversationID.getInvalidConversationID())) {
                                                            ye4.a("DeviceChatHelper", "Not able to open device chat: invalid conversationId");
                                                            im3.R(e8.n(ru1Var9), null, null, new oa1(ru1Var9, e27Var, hc1Var2, b8), 3);
                                                        } else {
                                                            im3.R(e8.n(ru1Var9), null, null, new oa1((Object) ru1Var9, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var2, (byte) 8), 3);
                                                        }
                                                    } else {
                                                        ye4.a("DeviceChatHelper", "Not able to open device chat: startChatUIModel == null");
                                                        im3.R(e8.n(ru1Var9), null, null, new oa1(ru1Var9, e27Var, hc1Var2, b8), 3);
                                                    }
                                                } else {
                                                    ye4.a("DeviceChatHelper", "Not able to open device chat: invalid dyngateId " + j3);
                                                    im3.R(e8.n(ru1Var9), null, null, new oa1(ru1Var9, e27Var, hc1Var2, b8), 3);
                                                }
                                                break;
                                            case 4:
                                                ns1 ns1Var5 = ns1Var3;
                                                ns1Var5.getClass();
                                                ru1 ru1Var10 = ru1Var5;
                                                d31 d31Var = ru1Var10.f1953o;
                                                RemoteControlApplication remoteControlApplication = d31Var.a;
                                                RemoteControlApplication remoteControlApplication2 = d31Var.a;
                                                ShortcutManager shortcutManager2 = (ShortcutManager) remoteControlApplication.getSystemService(ShortcutManager.class);
                                                if (shortcutManager2 != null && shortcutManager2.isRequestPinShortcutSupported()) {
                                                    String strValueOf = String.valueOf(ns1Var5.a);
                                                    strValueOf.getClass();
                                                    ShortcutManager shortcutManager3 = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                    hc1 hc1Var3 = null;
                                                    if (shortcutManager3 == null || (pinnedShortcuts2 = shortcutManager3.getPinnedShortcuts()) == null || pinnedShortcuts2.isEmpty()) {
                                                        shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                        if (shortcutManager != null && (pinnedShortcuts = shortcutManager.getPinnedShortcuts()) != null) {
                                                            size = pinnedShortcuts.size();
                                                        }
                                                        if (size >= 5) {
                                                            im3.R(e8.n(ru1Var10), null, null, new j0((Object) ru1Var10, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                                        } else {
                                                            l97Var = ru1Var10.z;
                                                            do {
                                                                value = l97Var.getValue();
                                                            } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                                        }
                                                    } else {
                                                        Iterator<T> it = pinnedShortcuts2.iterator();
                                                        while (it.hasNext()) {
                                                            if (im3.n(((ShortcutInfo) it.next()).getId(), strValueOf)) {
                                                                im3.R(e8.n(ru1Var10), null, null, new oa1(ru1Var10, c37.a, hc1Var3, b8), 3);
                                                                break;
                                                            }
                                                        }
                                                        shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                        if (shortcutManager != null) {
                                                            size = pinnedShortcuts.size();
                                                        }
                                                        if (size >= 5) {
                                                            im3.R(e8.n(ru1Var10), null, null, new j0((Object) ru1Var10, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                                        } else {
                                                            l97Var = ru1Var10.z;
                                                            do {
                                                                value = l97Var.getValue();
                                                            } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                                        }
                                                    }
                                                }
                                                break;
                                            case 5:
                                                ru1 ru1Var11 = ru1Var5;
                                                fe1 fe1Var = ru1Var11.x;
                                                ns1Var4.getClass();
                                                long j4 = ns1Var4.a;
                                                l97 l97Var2 = ru1Var11.J;
                                                Long l = (Long) l97Var2.getValue();
                                                if (l == null || l.longValue() != j4) {
                                                    ms1 ms1Var = ns1Var4.f;
                                                    if (ms1Var != null) {
                                                        Long l2 = (Long) l97Var2.getValue();
                                                        if (l2 != null) {
                                                            ru1Var11.W0(l2.longValue());
                                                        }
                                                        l97Var2.l(null, Long.valueOf(j4));
                                                        ru1Var11.m1(j4, true);
                                                        im3.R(e8.n(ru1Var11), fe1Var, null, new pu1(ms1Var, ru1Var11, j4, null, (byte) 0), 2);
                                                        Long l3 = ru1Var11.y;
                                                        if (l3 != null) {
                                                            im3.R(e8.n(ru1Var11), fe1Var, null, new qu1(l3.longValue(), ru1Var11, j4, null, (byte) 0), 2);
                                                        }
                                                    } else {
                                                        ye4.c("DeviceInfoScreenViewModel", "no wake capability for " + j4);
                                                    }
                                                }
                                                break;
                                            default:
                                                ru1 ru1Var12 = ru1Var5;
                                                ru1Var12.X0();
                                                ns1 ns1Var6 = ns1Var3;
                                                ns1Var6.getClass();
                                                du1 du1VarV0 = ru1.V0(ns1Var6);
                                                ru1Var12.Q.add(du1VarV0);
                                                im3.R(e8.n(ru1Var12), null, null, new tx(ru1Var12, ns1Var6, du1VarV0, null, (byte) 5), 3);
                                                break;
                                        }
                                        return f88Var2;
                                    }
                                };
                                ux2Var2.g0(objK19);
                            }
                            Function0 function9 = (Function0) objK19;
                            zH12 = ux2Var2.h(ru1Var5) | ux2Var2.h(ns1Var3);
                            objK20 = ux2Var2.K();
                            if (zH12 || objK20 == awVar2) {
                                final byte b6 = 1;
                                objK20 = new Function0() { // from class: o.mt1
                                    /* JADX WARN: Code duplicated, block: B:46:0x0138  */
                                    /* JADX WARN: Code duplicated, block: B:50:0x0179  */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object a() {
                                        ShortcutManager shortcutManager;
                                        l97 l97Var;
                                        Object value;
                                        List<ShortcutInfo> pinnedShortcuts;
                                        List<ShortcutInfo> pinnedShortcuts2;
                                        byte b7 = b6;
                                        byte size = 0;
                                        size = 0;
                                        byte b8 = 1;
                                        ru1 ru1Var8 = ru1Var5;
                                        byte b9 = 9;
                                        ns1 ns1Var4 = ns1Var3;
                                        hc1 hc1Var2 = null;
                                        byte b10 = 2;
                                        f88 f88Var2 = f88.a;
                                        switch (b7) {
                                            case 0:
                                                ns1Var4.getClass();
                                                im3.R(e8.n(ru1Var8), ru1Var8.x, null, new gu1(ru1Var8, ns1Var4, hc1Var2, b10), 2);
                                                break;
                                            case 1:
                                                ns1Var4.getClass();
                                                im3.R(e8.n(ru1Var8), ru1Var8.x, null, new gu1(ru1Var8, ns1Var4, hc1Var2, b8), 2);
                                                break;
                                            case 2:
                                                ns1Var4.getClass();
                                                im3.R(e8.n(ru1Var8), ru1Var8.x, null, new gu1(ru1Var8, ns1Var4, hc1Var2, size), 2);
                                                break;
                                            case 3:
                                                ns1Var4.getClass();
                                                cr crVar = ru1Var8.p;
                                                xk1 xk1Var = ru1Var8.V;
                                                crVar.getClass();
                                                xk1Var.getClass();
                                                ru1 ru1Var9 = (ru1) xk1Var.n;
                                                long j3 = ns1Var4.a;
                                                BigInteger bigIntegerValueOf = (j3 <= 0 || j3 > 4294967295L) ? null : BigInteger.valueOf(144115188075855872L + j3);
                                                e27 e27Var = e27.a;
                                                if (bigIntegerValueOf != null) {
                                                    IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                    if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                        ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(bigIntegerValueOf);
                                                        if (chatConversationIDRequestPrivateRoomWithEndPoint == null || chatConversationIDRequestPrivateRoomWithEndPoint.Equal(ChatConversationID.getInvalidConversationID())) {
                                                            ye4.a("DeviceChatHelper", "Not able to open device chat: invalid conversationId");
                                                            im3.R(e8.n(ru1Var9), null, null, new oa1(ru1Var9, e27Var, hc1Var2, b9), 3);
                                                        } else {
                                                            im3.R(e8.n(ru1Var9), null, null, new oa1((Object) ru1Var9, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var2, (byte) 8), 3);
                                                        }
                                                    } else {
                                                        ye4.a("DeviceChatHelper", "Not able to open device chat: startChatUIModel == null");
                                                        im3.R(e8.n(ru1Var9), null, null, new oa1(ru1Var9, e27Var, hc1Var2, b9), 3);
                                                    }
                                                } else {
                                                    ye4.a("DeviceChatHelper", "Not able to open device chat: invalid dyngateId " + j3);
                                                    im3.R(e8.n(ru1Var9), null, null, new oa1(ru1Var9, e27Var, hc1Var2, b9), 3);
                                                }
                                                break;
                                            case 4:
                                                ns1 ns1Var5 = ns1Var3;
                                                ns1Var5.getClass();
                                                ru1 ru1Var10 = ru1Var5;
                                                d31 d31Var = ru1Var10.f1953o;
                                                RemoteControlApplication remoteControlApplication = d31Var.a;
                                                RemoteControlApplication remoteControlApplication2 = d31Var.a;
                                                ShortcutManager shortcutManager2 = (ShortcutManager) remoteControlApplication.getSystemService(ShortcutManager.class);
                                                if (shortcutManager2 != null && shortcutManager2.isRequestPinShortcutSupported()) {
                                                    String strValueOf = String.valueOf(ns1Var5.a);
                                                    strValueOf.getClass();
                                                    ShortcutManager shortcutManager3 = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                    hc1 hc1Var3 = null;
                                                    if (shortcutManager3 == null || (pinnedShortcuts2 = shortcutManager3.getPinnedShortcuts()) == null || pinnedShortcuts2.isEmpty()) {
                                                        shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                        if (shortcutManager != null && (pinnedShortcuts = shortcutManager.getPinnedShortcuts()) != null) {
                                                            size = pinnedShortcuts.size();
                                                        }
                                                        if (size >= 5) {
                                                            im3.R(e8.n(ru1Var10), null, null, new j0((Object) ru1Var10, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                                        } else {
                                                            l97Var = ru1Var10.z;
                                                            do {
                                                                value = l97Var.getValue();
                                                            } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                                        }
                                                    } else {
                                                        Iterator<T> it = pinnedShortcuts2.iterator();
                                                        while (it.hasNext()) {
                                                            if (im3.n(((ShortcutInfo) it.next()).getId(), strValueOf)) {
                                                                im3.R(e8.n(ru1Var10), null, null, new oa1(ru1Var10, c37.a, hc1Var3, b9), 3);
                                                                break;
                                                            }
                                                        }
                                                        shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                        if (shortcutManager != null) {
                                                            size = pinnedShortcuts.size();
                                                        }
                                                        if (size >= 5) {
                                                            im3.R(e8.n(ru1Var10), null, null, new j0((Object) ru1Var10, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                                        } else {
                                                            l97Var = ru1Var10.z;
                                                            do {
                                                                value = l97Var.getValue();
                                                            } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                                        }
                                                    }
                                                }
                                                break;
                                            case 5:
                                                ru1 ru1Var11 = ru1Var5;
                                                fe1 fe1Var = ru1Var11.x;
                                                ns1Var4.getClass();
                                                long j4 = ns1Var4.a;
                                                l97 l97Var2 = ru1Var11.J;
                                                Long l = (Long) l97Var2.getValue();
                                                if (l == null || l.longValue() != j4) {
                                                    ms1 ms1Var = ns1Var4.f;
                                                    if (ms1Var != null) {
                                                        Long l2 = (Long) l97Var2.getValue();
                                                        if (l2 != null) {
                                                            ru1Var11.W0(l2.longValue());
                                                        }
                                                        l97Var2.l(null, Long.valueOf(j4));
                                                        ru1Var11.m1(j4, true);
                                                        im3.R(e8.n(ru1Var11), fe1Var, null, new pu1(ms1Var, ru1Var11, j4, null, (byte) 0), 2);
                                                        Long l3 = ru1Var11.y;
                                                        if (l3 != null) {
                                                            im3.R(e8.n(ru1Var11), fe1Var, null, new qu1(l3.longValue(), ru1Var11, j4, null, (byte) 0), 2);
                                                        }
                                                    } else {
                                                        ye4.c("DeviceInfoScreenViewModel", "no wake capability for " + j4);
                                                    }
                                                }
                                                break;
                                            default:
                                                ru1 ru1Var12 = ru1Var5;
                                                ru1Var12.X0();
                                                ns1 ns1Var6 = ns1Var3;
                                                ns1Var6.getClass();
                                                du1 du1VarV0 = ru1.V0(ns1Var6);
                                                ru1Var12.Q.add(du1VarV0);
                                                im3.R(e8.n(ru1Var12), null, null, new tx(ru1Var12, ns1Var6, du1VarV0, null, (byte) 5), 3);
                                                break;
                                        }
                                        return f88Var2;
                                    }
                                };
                                ux2Var2.g0(objK20);
                            }
                            Function0 function10 = (Function0) objK20;
                            zH13 = ux2Var2.h(ru1Var5) | ux2Var2.h(ns1Var3);
                            objK21 = ux2Var2.K();
                            if (zH13 || objK21 == awVar2) {
                                final byte b7 = 2;
                                objK21 = new Function0() { // from class: o.mt1
                                    /* JADX WARN: Code duplicated, block: B:46:0x0138  */
                                    /* JADX WARN: Code duplicated, block: B:50:0x0179  */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object a() {
                                        ShortcutManager shortcutManager;
                                        l97 l97Var;
                                        Object value;
                                        List<ShortcutInfo> pinnedShortcuts;
                                        List<ShortcutInfo> pinnedShortcuts2;
                                        byte b8 = b7;
                                        byte size = 0;
                                        size = 0;
                                        byte b9 = 1;
                                        ru1 ru1Var8 = ru1Var5;
                                        byte b10 = 9;
                                        ns1 ns1Var4 = ns1Var3;
                                        hc1 hc1Var2 = null;
                                        byte b11 = 2;
                                        f88 f88Var2 = f88.a;
                                        switch (b8) {
                                            case 0:
                                                ns1Var4.getClass();
                                                im3.R(e8.n(ru1Var8), ru1Var8.x, null, new gu1(ru1Var8, ns1Var4, hc1Var2, b11), 2);
                                                break;
                                            case 1:
                                                ns1Var4.getClass();
                                                im3.R(e8.n(ru1Var8), ru1Var8.x, null, new gu1(ru1Var8, ns1Var4, hc1Var2, b9), 2);
                                                break;
                                            case 2:
                                                ns1Var4.getClass();
                                                im3.R(e8.n(ru1Var8), ru1Var8.x, null, new gu1(ru1Var8, ns1Var4, hc1Var2, size), 2);
                                                break;
                                            case 3:
                                                ns1Var4.getClass();
                                                cr crVar = ru1Var8.p;
                                                xk1 xk1Var = ru1Var8.V;
                                                crVar.getClass();
                                                xk1Var.getClass();
                                                ru1 ru1Var9 = (ru1) xk1Var.n;
                                                long j3 = ns1Var4.a;
                                                BigInteger bigIntegerValueOf = (j3 <= 0 || j3 > 4294967295L) ? null : BigInteger.valueOf(144115188075855872L + j3);
                                                e27 e27Var = e27.a;
                                                if (bigIntegerValueOf != null) {
                                                    IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                    if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                        ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(bigIntegerValueOf);
                                                        if (chatConversationIDRequestPrivateRoomWithEndPoint == null || chatConversationIDRequestPrivateRoomWithEndPoint.Equal(ChatConversationID.getInvalidConversationID())) {
                                                            ye4.a("DeviceChatHelper", "Not able to open device chat: invalid conversationId");
                                                            im3.R(e8.n(ru1Var9), null, null, new oa1(ru1Var9, e27Var, hc1Var2, b10), 3);
                                                        } else {
                                                            im3.R(e8.n(ru1Var9), null, null, new oa1((Object) ru1Var9, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var2, (byte) 8), 3);
                                                        }
                                                    } else {
                                                        ye4.a("DeviceChatHelper", "Not able to open device chat: startChatUIModel == null");
                                                        im3.R(e8.n(ru1Var9), null, null, new oa1(ru1Var9, e27Var, hc1Var2, b10), 3);
                                                    }
                                                } else {
                                                    ye4.a("DeviceChatHelper", "Not able to open device chat: invalid dyngateId " + j3);
                                                    im3.R(e8.n(ru1Var9), null, null, new oa1(ru1Var9, e27Var, hc1Var2, b10), 3);
                                                }
                                                break;
                                            case 4:
                                                ns1 ns1Var5 = ns1Var3;
                                                ns1Var5.getClass();
                                                ru1 ru1Var10 = ru1Var5;
                                                d31 d31Var = ru1Var10.f1953o;
                                                RemoteControlApplication remoteControlApplication = d31Var.a;
                                                RemoteControlApplication remoteControlApplication2 = d31Var.a;
                                                ShortcutManager shortcutManager2 = (ShortcutManager) remoteControlApplication.getSystemService(ShortcutManager.class);
                                                if (shortcutManager2 != null && shortcutManager2.isRequestPinShortcutSupported()) {
                                                    String strValueOf = String.valueOf(ns1Var5.a);
                                                    strValueOf.getClass();
                                                    ShortcutManager shortcutManager3 = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                    hc1 hc1Var3 = null;
                                                    if (shortcutManager3 == null || (pinnedShortcuts2 = shortcutManager3.getPinnedShortcuts()) == null || pinnedShortcuts2.isEmpty()) {
                                                        shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                        if (shortcutManager != null && (pinnedShortcuts = shortcutManager.getPinnedShortcuts()) != null) {
                                                            size = pinnedShortcuts.size();
                                                        }
                                                        if (size >= 5) {
                                                            im3.R(e8.n(ru1Var10), null, null, new j0((Object) ru1Var10, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                                        } else {
                                                            l97Var = ru1Var10.z;
                                                            do {
                                                                value = l97Var.getValue();
                                                            } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                                        }
                                                    } else {
                                                        Iterator<T> it = pinnedShortcuts2.iterator();
                                                        while (it.hasNext()) {
                                                            if (im3.n(((ShortcutInfo) it.next()).getId(), strValueOf)) {
                                                                im3.R(e8.n(ru1Var10), null, null, new oa1(ru1Var10, c37.a, hc1Var3, b10), 3);
                                                                break;
                                                            }
                                                        }
                                                        shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                        if (shortcutManager != null) {
                                                            size = pinnedShortcuts.size();
                                                        }
                                                        if (size >= 5) {
                                                            im3.R(e8.n(ru1Var10), null, null, new j0((Object) ru1Var10, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                                        } else {
                                                            l97Var = ru1Var10.z;
                                                            do {
                                                                value = l97Var.getValue();
                                                            } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                                        }
                                                    }
                                                }
                                                break;
                                            case 5:
                                                ru1 ru1Var11 = ru1Var5;
                                                fe1 fe1Var = ru1Var11.x;
                                                ns1Var4.getClass();
                                                long j4 = ns1Var4.a;
                                                l97 l97Var2 = ru1Var11.J;
                                                Long l = (Long) l97Var2.getValue();
                                                if (l == null || l.longValue() != j4) {
                                                    ms1 ms1Var = ns1Var4.f;
                                                    if (ms1Var != null) {
                                                        Long l2 = (Long) l97Var2.getValue();
                                                        if (l2 != null) {
                                                            ru1Var11.W0(l2.longValue());
                                                        }
                                                        l97Var2.l(null, Long.valueOf(j4));
                                                        ru1Var11.m1(j4, true);
                                                        im3.R(e8.n(ru1Var11), fe1Var, null, new pu1(ms1Var, ru1Var11, j4, null, (byte) 0), 2);
                                                        Long l3 = ru1Var11.y;
                                                        if (l3 != null) {
                                                            im3.R(e8.n(ru1Var11), fe1Var, null, new qu1(l3.longValue(), ru1Var11, j4, null, (byte) 0), 2);
                                                        }
                                                    } else {
                                                        ye4.c("DeviceInfoScreenViewModel", "no wake capability for " + j4);
                                                    }
                                                }
                                                break;
                                            default:
                                                ru1 ru1Var12 = ru1Var5;
                                                ru1Var12.X0();
                                                ns1 ns1Var6 = ns1Var3;
                                                ns1Var6.getClass();
                                                du1 du1VarV0 = ru1.V0(ns1Var6);
                                                ru1Var12.Q.add(du1VarV0);
                                                im3.R(e8.n(ru1Var12), null, null, new tx(ru1Var12, ns1Var6, du1VarV0, null, (byte) 5), 3);
                                                break;
                                        }
                                        return f88Var2;
                                    }
                                };
                                ux2Var2.g0(objK21);
                            }
                            Function0 function11 = (Function0) objK21;
                            zH14 = ux2Var2.h(ru1Var5) | ux2Var2.h(ns1Var3);
                            objK22 = ux2Var2.K();
                            if (zH14 || objK22 == awVar2) {
                                final byte b8 = 3;
                                objK22 = new Function0() { // from class: o.mt1
                                    /* JADX WARN: Code duplicated, block: B:46:0x0138  */
                                    /* JADX WARN: Code duplicated, block: B:50:0x0179  */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object a() {
                                        ShortcutManager shortcutManager;
                                        l97 l97Var;
                                        Object value;
                                        List<ShortcutInfo> pinnedShortcuts;
                                        List<ShortcutInfo> pinnedShortcuts2;
                                        byte b9 = b8;
                                        byte size = 0;
                                        size = 0;
                                        byte b10 = 1;
                                        ru1 ru1Var8 = ru1Var5;
                                        byte b11 = 9;
                                        ns1 ns1Var4 = ns1Var3;
                                        hc1 hc1Var2 = null;
                                        byte b12 = 2;
                                        f88 f88Var2 = f88.a;
                                        switch (b9) {
                                            case 0:
                                                ns1Var4.getClass();
                                                im3.R(e8.n(ru1Var8), ru1Var8.x, null, new gu1(ru1Var8, ns1Var4, hc1Var2, b12), 2);
                                                break;
                                            case 1:
                                                ns1Var4.getClass();
                                                im3.R(e8.n(ru1Var8), ru1Var8.x, null, new gu1(ru1Var8, ns1Var4, hc1Var2, b10), 2);
                                                break;
                                            case 2:
                                                ns1Var4.getClass();
                                                im3.R(e8.n(ru1Var8), ru1Var8.x, null, new gu1(ru1Var8, ns1Var4, hc1Var2, size), 2);
                                                break;
                                            case 3:
                                                ns1Var4.getClass();
                                                cr crVar = ru1Var8.p;
                                                xk1 xk1Var = ru1Var8.V;
                                                crVar.getClass();
                                                xk1Var.getClass();
                                                ru1 ru1Var9 = (ru1) xk1Var.n;
                                                long j3 = ns1Var4.a;
                                                BigInteger bigIntegerValueOf = (j3 <= 0 || j3 > 4294967295L) ? null : BigInteger.valueOf(144115188075855872L + j3);
                                                e27 e27Var = e27.a;
                                                if (bigIntegerValueOf != null) {
                                                    IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                    if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                        ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(bigIntegerValueOf);
                                                        if (chatConversationIDRequestPrivateRoomWithEndPoint == null || chatConversationIDRequestPrivateRoomWithEndPoint.Equal(ChatConversationID.getInvalidConversationID())) {
                                                            ye4.a("DeviceChatHelper", "Not able to open device chat: invalid conversationId");
                                                            im3.R(e8.n(ru1Var9), null, null, new oa1(ru1Var9, e27Var, hc1Var2, b11), 3);
                                                        } else {
                                                            im3.R(e8.n(ru1Var9), null, null, new oa1((Object) ru1Var9, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var2, (byte) 8), 3);
                                                        }
                                                    } else {
                                                        ye4.a("DeviceChatHelper", "Not able to open device chat: startChatUIModel == null");
                                                        im3.R(e8.n(ru1Var9), null, null, new oa1(ru1Var9, e27Var, hc1Var2, b11), 3);
                                                    }
                                                } else {
                                                    ye4.a("DeviceChatHelper", "Not able to open device chat: invalid dyngateId " + j3);
                                                    im3.R(e8.n(ru1Var9), null, null, new oa1(ru1Var9, e27Var, hc1Var2, b11), 3);
                                                }
                                                break;
                                            case 4:
                                                ns1 ns1Var5 = ns1Var3;
                                                ns1Var5.getClass();
                                                ru1 ru1Var10 = ru1Var5;
                                                d31 d31Var = ru1Var10.f1953o;
                                                RemoteControlApplication remoteControlApplication = d31Var.a;
                                                RemoteControlApplication remoteControlApplication2 = d31Var.a;
                                                ShortcutManager shortcutManager2 = (ShortcutManager) remoteControlApplication.getSystemService(ShortcutManager.class);
                                                if (shortcutManager2 != null && shortcutManager2.isRequestPinShortcutSupported()) {
                                                    String strValueOf = String.valueOf(ns1Var5.a);
                                                    strValueOf.getClass();
                                                    ShortcutManager shortcutManager3 = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                    hc1 hc1Var3 = null;
                                                    if (shortcutManager3 == null || (pinnedShortcuts2 = shortcutManager3.getPinnedShortcuts()) == null || pinnedShortcuts2.isEmpty()) {
                                                        shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                        if (shortcutManager != null && (pinnedShortcuts = shortcutManager.getPinnedShortcuts()) != null) {
                                                            size = pinnedShortcuts.size();
                                                        }
                                                        if (size >= 5) {
                                                            im3.R(e8.n(ru1Var10), null, null, new j0((Object) ru1Var10, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                                        } else {
                                                            l97Var = ru1Var10.z;
                                                            do {
                                                                value = l97Var.getValue();
                                                            } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                                        }
                                                    } else {
                                                        Iterator<T> it = pinnedShortcuts2.iterator();
                                                        while (it.hasNext()) {
                                                            if (im3.n(((ShortcutInfo) it.next()).getId(), strValueOf)) {
                                                                im3.R(e8.n(ru1Var10), null, null, new oa1(ru1Var10, c37.a, hc1Var3, b11), 3);
                                                                break;
                                                            }
                                                        }
                                                        shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                        if (shortcutManager != null) {
                                                            size = pinnedShortcuts.size();
                                                        }
                                                        if (size >= 5) {
                                                            im3.R(e8.n(ru1Var10), null, null, new j0((Object) ru1Var10, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                                        } else {
                                                            l97Var = ru1Var10.z;
                                                            do {
                                                                value = l97Var.getValue();
                                                            } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                                        }
                                                    }
                                                }
                                                break;
                                            case 5:
                                                ru1 ru1Var11 = ru1Var5;
                                                fe1 fe1Var = ru1Var11.x;
                                                ns1Var4.getClass();
                                                long j4 = ns1Var4.a;
                                                l97 l97Var2 = ru1Var11.J;
                                                Long l = (Long) l97Var2.getValue();
                                                if (l == null || l.longValue() != j4) {
                                                    ms1 ms1Var = ns1Var4.f;
                                                    if (ms1Var != null) {
                                                        Long l2 = (Long) l97Var2.getValue();
                                                        if (l2 != null) {
                                                            ru1Var11.W0(l2.longValue());
                                                        }
                                                        l97Var2.l(null, Long.valueOf(j4));
                                                        ru1Var11.m1(j4, true);
                                                        im3.R(e8.n(ru1Var11), fe1Var, null, new pu1(ms1Var, ru1Var11, j4, null, (byte) 0), 2);
                                                        Long l3 = ru1Var11.y;
                                                        if (l3 != null) {
                                                            im3.R(e8.n(ru1Var11), fe1Var, null, new qu1(l3.longValue(), ru1Var11, j4, null, (byte) 0), 2);
                                                        }
                                                    } else {
                                                        ye4.c("DeviceInfoScreenViewModel", "no wake capability for " + j4);
                                                    }
                                                }
                                                break;
                                            default:
                                                ru1 ru1Var12 = ru1Var5;
                                                ru1Var12.X0();
                                                ns1 ns1Var6 = ns1Var3;
                                                ns1Var6.getClass();
                                                du1 du1VarV0 = ru1.V0(ns1Var6);
                                                ru1Var12.Q.add(du1VarV0);
                                                im3.R(e8.n(ru1Var12), null, null, new tx(ru1Var12, ns1Var6, du1VarV0, null, (byte) 5), 3);
                                                break;
                                        }
                                        return f88Var2;
                                    }
                                };
                                ux2Var2.g0(objK22);
                            }
                            Function0 function12 = (Function0) objK22;
                            zH15 = ux2Var2.h(ru1Var5) | ux2Var2.h(ns1Var3);
                            objK23 = ux2Var2.K();
                            if (zH15 || objK23 == awVar2) {
                                final byte b9 = 4;
                                objK23 = new Function0() { // from class: o.mt1
                                    /* JADX WARN: Code duplicated, block: B:46:0x0138  */
                                    /* JADX WARN: Code duplicated, block: B:50:0x0179  */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object a() {
                                        ShortcutManager shortcutManager;
                                        l97 l97Var;
                                        Object value;
                                        List<ShortcutInfo> pinnedShortcuts;
                                        List<ShortcutInfo> pinnedShortcuts2;
                                        byte b10 = b9;
                                        byte size = 0;
                                        size = 0;
                                        byte b11 = 1;
                                        ru1 ru1Var8 = ru1Var5;
                                        byte b12 = 9;
                                        ns1 ns1Var4 = ns1Var3;
                                        hc1 hc1Var2 = null;
                                        byte b13 = 2;
                                        f88 f88Var2 = f88.a;
                                        switch (b10) {
                                            case 0:
                                                ns1Var4.getClass();
                                                im3.R(e8.n(ru1Var8), ru1Var8.x, null, new gu1(ru1Var8, ns1Var4, hc1Var2, b13), 2);
                                                break;
                                            case 1:
                                                ns1Var4.getClass();
                                                im3.R(e8.n(ru1Var8), ru1Var8.x, null, new gu1(ru1Var8, ns1Var4, hc1Var2, b11), 2);
                                                break;
                                            case 2:
                                                ns1Var4.getClass();
                                                im3.R(e8.n(ru1Var8), ru1Var8.x, null, new gu1(ru1Var8, ns1Var4, hc1Var2, size), 2);
                                                break;
                                            case 3:
                                                ns1Var4.getClass();
                                                cr crVar = ru1Var8.p;
                                                xk1 xk1Var = ru1Var8.V;
                                                crVar.getClass();
                                                xk1Var.getClass();
                                                ru1 ru1Var9 = (ru1) xk1Var.n;
                                                long j3 = ns1Var4.a;
                                                BigInteger bigIntegerValueOf = (j3 <= 0 || j3 > 4294967295L) ? null : BigInteger.valueOf(144115188075855872L + j3);
                                                e27 e27Var = e27.a;
                                                if (bigIntegerValueOf != null) {
                                                    IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                    if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                        ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(bigIntegerValueOf);
                                                        if (chatConversationIDRequestPrivateRoomWithEndPoint == null || chatConversationIDRequestPrivateRoomWithEndPoint.Equal(ChatConversationID.getInvalidConversationID())) {
                                                            ye4.a("DeviceChatHelper", "Not able to open device chat: invalid conversationId");
                                                            im3.R(e8.n(ru1Var9), null, null, new oa1(ru1Var9, e27Var, hc1Var2, b12), 3);
                                                        } else {
                                                            im3.R(e8.n(ru1Var9), null, null, new oa1((Object) ru1Var9, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var2, (byte) 8), 3);
                                                        }
                                                    } else {
                                                        ye4.a("DeviceChatHelper", "Not able to open device chat: startChatUIModel == null");
                                                        im3.R(e8.n(ru1Var9), null, null, new oa1(ru1Var9, e27Var, hc1Var2, b12), 3);
                                                    }
                                                } else {
                                                    ye4.a("DeviceChatHelper", "Not able to open device chat: invalid dyngateId " + j3);
                                                    im3.R(e8.n(ru1Var9), null, null, new oa1(ru1Var9, e27Var, hc1Var2, b12), 3);
                                                }
                                                break;
                                            case 4:
                                                ns1 ns1Var5 = ns1Var3;
                                                ns1Var5.getClass();
                                                ru1 ru1Var10 = ru1Var5;
                                                d31 d31Var = ru1Var10.f1953o;
                                                RemoteControlApplication remoteControlApplication = d31Var.a;
                                                RemoteControlApplication remoteControlApplication2 = d31Var.a;
                                                ShortcutManager shortcutManager2 = (ShortcutManager) remoteControlApplication.getSystemService(ShortcutManager.class);
                                                if (shortcutManager2 != null && shortcutManager2.isRequestPinShortcutSupported()) {
                                                    String strValueOf = String.valueOf(ns1Var5.a);
                                                    strValueOf.getClass();
                                                    ShortcutManager shortcutManager3 = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                    hc1 hc1Var3 = null;
                                                    if (shortcutManager3 == null || (pinnedShortcuts2 = shortcutManager3.getPinnedShortcuts()) == null || pinnedShortcuts2.isEmpty()) {
                                                        shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                        if (shortcutManager != null && (pinnedShortcuts = shortcutManager.getPinnedShortcuts()) != null) {
                                                            size = pinnedShortcuts.size();
                                                        }
                                                        if (size >= 5) {
                                                            im3.R(e8.n(ru1Var10), null, null, new j0((Object) ru1Var10, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                                        } else {
                                                            l97Var = ru1Var10.z;
                                                            do {
                                                                value = l97Var.getValue();
                                                            } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                                        }
                                                    } else {
                                                        Iterator<T> it = pinnedShortcuts2.iterator();
                                                        while (it.hasNext()) {
                                                            if (im3.n(((ShortcutInfo) it.next()).getId(), strValueOf)) {
                                                                im3.R(e8.n(ru1Var10), null, null, new oa1(ru1Var10, c37.a, hc1Var3, b12), 3);
                                                                break;
                                                            }
                                                        }
                                                        shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                        if (shortcutManager != null) {
                                                            size = pinnedShortcuts.size();
                                                        }
                                                        if (size >= 5) {
                                                            im3.R(e8.n(ru1Var10), null, null, new j0((Object) ru1Var10, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                                        } else {
                                                            l97Var = ru1Var10.z;
                                                            do {
                                                                value = l97Var.getValue();
                                                            } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                                        }
                                                    }
                                                }
                                                break;
                                            case 5:
                                                ru1 ru1Var11 = ru1Var5;
                                                fe1 fe1Var = ru1Var11.x;
                                                ns1Var4.getClass();
                                                long j4 = ns1Var4.a;
                                                l97 l97Var2 = ru1Var11.J;
                                                Long l = (Long) l97Var2.getValue();
                                                if (l == null || l.longValue() != j4) {
                                                    ms1 ms1Var = ns1Var4.f;
                                                    if (ms1Var != null) {
                                                        Long l2 = (Long) l97Var2.getValue();
                                                        if (l2 != null) {
                                                            ru1Var11.W0(l2.longValue());
                                                        }
                                                        l97Var2.l(null, Long.valueOf(j4));
                                                        ru1Var11.m1(j4, true);
                                                        im3.R(e8.n(ru1Var11), fe1Var, null, new pu1(ms1Var, ru1Var11, j4, null, (byte) 0), 2);
                                                        Long l3 = ru1Var11.y;
                                                        if (l3 != null) {
                                                            im3.R(e8.n(ru1Var11), fe1Var, null, new qu1(l3.longValue(), ru1Var11, j4, null, (byte) 0), 2);
                                                        }
                                                    } else {
                                                        ye4.c("DeviceInfoScreenViewModel", "no wake capability for " + j4);
                                                    }
                                                }
                                                break;
                                            default:
                                                ru1 ru1Var12 = ru1Var5;
                                                ru1Var12.X0();
                                                ns1 ns1Var6 = ns1Var3;
                                                ns1Var6.getClass();
                                                du1 du1VarV0 = ru1.V0(ns1Var6);
                                                ru1Var12.Q.add(du1VarV0);
                                                im3.R(e8.n(ru1Var12), null, null, new tx(ru1Var12, ns1Var6, du1VarV0, null, (byte) 5), 3);
                                                break;
                                        }
                                        return f88Var2;
                                    }
                                };
                                ux2Var2.g0(objK23);
                            }
                            Function0 function13 = (Function0) objK23;
                            zH16 = ux2Var2.h(ru1Var5);
                            objK24 = ux2Var2.K();
                            if (zH16 || objK24 == awVar2) {
                                objK24 = new zz0(ru1Var5, (byte) 11);
                                ux2Var2.g0(objK24);
                            }
                            Function0 function14 = (Function0) objK24;
                            zH17 = ux2Var2.h(ru1Var5) | ux2Var2.h(ns1Var3);
                            objK25 = ux2Var2.K();
                            if (zH17 || objK25 == awVar2) {
                                final byte b10 = 5;
                                objK25 = new Function0() { // from class: o.mt1
                                    /* JADX WARN: Code duplicated, block: B:46:0x0138  */
                                    /* JADX WARN: Code duplicated, block: B:50:0x0179  */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object a() {
                                        ShortcutManager shortcutManager;
                                        l97 l97Var;
                                        Object value;
                                        List<ShortcutInfo> pinnedShortcuts;
                                        List<ShortcutInfo> pinnedShortcuts2;
                                        byte b11 = b10;
                                        byte size = 0;
                                        size = 0;
                                        byte b12 = 1;
                                        ru1 ru1Var8 = ru1Var5;
                                        byte b13 = 9;
                                        ns1 ns1Var4 = ns1Var3;
                                        hc1 hc1Var2 = null;
                                        byte b14 = 2;
                                        f88 f88Var2 = f88.a;
                                        switch (b11) {
                                            case 0:
                                                ns1Var4.getClass();
                                                im3.R(e8.n(ru1Var8), ru1Var8.x, null, new gu1(ru1Var8, ns1Var4, hc1Var2, b14), 2);
                                                break;
                                            case 1:
                                                ns1Var4.getClass();
                                                im3.R(e8.n(ru1Var8), ru1Var8.x, null, new gu1(ru1Var8, ns1Var4, hc1Var2, b12), 2);
                                                break;
                                            case 2:
                                                ns1Var4.getClass();
                                                im3.R(e8.n(ru1Var8), ru1Var8.x, null, new gu1(ru1Var8, ns1Var4, hc1Var2, size), 2);
                                                break;
                                            case 3:
                                                ns1Var4.getClass();
                                                cr crVar = ru1Var8.p;
                                                xk1 xk1Var = ru1Var8.V;
                                                crVar.getClass();
                                                xk1Var.getClass();
                                                ru1 ru1Var9 = (ru1) xk1Var.n;
                                                long j3 = ns1Var4.a;
                                                BigInteger bigIntegerValueOf = (j3 <= 0 || j3 > 4294967295L) ? null : BigInteger.valueOf(144115188075855872L + j3);
                                                e27 e27Var = e27.a;
                                                if (bigIntegerValueOf != null) {
                                                    IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                    if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                        ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(bigIntegerValueOf);
                                                        if (chatConversationIDRequestPrivateRoomWithEndPoint == null || chatConversationIDRequestPrivateRoomWithEndPoint.Equal(ChatConversationID.getInvalidConversationID())) {
                                                            ye4.a("DeviceChatHelper", "Not able to open device chat: invalid conversationId");
                                                            im3.R(e8.n(ru1Var9), null, null, new oa1(ru1Var9, e27Var, hc1Var2, b13), 3);
                                                        } else {
                                                            im3.R(e8.n(ru1Var9), null, null, new oa1((Object) ru1Var9, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var2, (byte) 8), 3);
                                                        }
                                                    } else {
                                                        ye4.a("DeviceChatHelper", "Not able to open device chat: startChatUIModel == null");
                                                        im3.R(e8.n(ru1Var9), null, null, new oa1(ru1Var9, e27Var, hc1Var2, b13), 3);
                                                    }
                                                } else {
                                                    ye4.a("DeviceChatHelper", "Not able to open device chat: invalid dyngateId " + j3);
                                                    im3.R(e8.n(ru1Var9), null, null, new oa1(ru1Var9, e27Var, hc1Var2, b13), 3);
                                                }
                                                break;
                                            case 4:
                                                ns1 ns1Var5 = ns1Var3;
                                                ns1Var5.getClass();
                                                ru1 ru1Var10 = ru1Var5;
                                                d31 d31Var = ru1Var10.f1953o;
                                                RemoteControlApplication remoteControlApplication = d31Var.a;
                                                RemoteControlApplication remoteControlApplication2 = d31Var.a;
                                                ShortcutManager shortcutManager2 = (ShortcutManager) remoteControlApplication.getSystemService(ShortcutManager.class);
                                                if (shortcutManager2 != null && shortcutManager2.isRequestPinShortcutSupported()) {
                                                    String strValueOf = String.valueOf(ns1Var5.a);
                                                    strValueOf.getClass();
                                                    ShortcutManager shortcutManager3 = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                    hc1 hc1Var3 = null;
                                                    if (shortcutManager3 == null || (pinnedShortcuts2 = shortcutManager3.getPinnedShortcuts()) == null || pinnedShortcuts2.isEmpty()) {
                                                        shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                        if (shortcutManager != null && (pinnedShortcuts = shortcutManager.getPinnedShortcuts()) != null) {
                                                            size = pinnedShortcuts.size();
                                                        }
                                                        if (size >= 5) {
                                                            im3.R(e8.n(ru1Var10), null, null, new j0((Object) ru1Var10, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                                        } else {
                                                            l97Var = ru1Var10.z;
                                                            do {
                                                                value = l97Var.getValue();
                                                            } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                                        }
                                                    } else {
                                                        Iterator<T> it = pinnedShortcuts2.iterator();
                                                        while (it.hasNext()) {
                                                            if (im3.n(((ShortcutInfo) it.next()).getId(), strValueOf)) {
                                                                im3.R(e8.n(ru1Var10), null, null, new oa1(ru1Var10, c37.a, hc1Var3, b13), 3);
                                                                break;
                                                            }
                                                        }
                                                        shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                        if (shortcutManager != null) {
                                                            size = pinnedShortcuts.size();
                                                        }
                                                        if (size >= 5) {
                                                            im3.R(e8.n(ru1Var10), null, null, new j0((Object) ru1Var10, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                                        } else {
                                                            l97Var = ru1Var10.z;
                                                            do {
                                                                value = l97Var.getValue();
                                                            } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                                        }
                                                    }
                                                }
                                                break;
                                            case 5:
                                                ru1 ru1Var11 = ru1Var5;
                                                fe1 fe1Var = ru1Var11.x;
                                                ns1Var4.getClass();
                                                long j4 = ns1Var4.a;
                                                l97 l97Var2 = ru1Var11.J;
                                                Long l = (Long) l97Var2.getValue();
                                                if (l == null || l.longValue() != j4) {
                                                    ms1 ms1Var = ns1Var4.f;
                                                    if (ms1Var != null) {
                                                        Long l2 = (Long) l97Var2.getValue();
                                                        if (l2 != null) {
                                                            ru1Var11.W0(l2.longValue());
                                                        }
                                                        l97Var2.l(null, Long.valueOf(j4));
                                                        ru1Var11.m1(j4, true);
                                                        im3.R(e8.n(ru1Var11), fe1Var, null, new pu1(ms1Var, ru1Var11, j4, null, (byte) 0), 2);
                                                        Long l3 = ru1Var11.y;
                                                        if (l3 != null) {
                                                            im3.R(e8.n(ru1Var11), fe1Var, null, new qu1(l3.longValue(), ru1Var11, j4, null, (byte) 0), 2);
                                                        }
                                                    } else {
                                                        ye4.c("DeviceInfoScreenViewModel", "no wake capability for " + j4);
                                                    }
                                                }
                                                break;
                                            default:
                                                ru1 ru1Var12 = ru1Var5;
                                                ru1Var12.X0();
                                                ns1 ns1Var6 = ns1Var3;
                                                ns1Var6.getClass();
                                                du1 du1VarV0 = ru1.V0(ns1Var6);
                                                ru1Var12.Q.add(du1VarV0);
                                                im3.R(e8.n(ru1Var12), null, null, new tx(ru1Var12, ns1Var6, du1VarV0, null, (byte) 5), 3);
                                                break;
                                        }
                                        return f88Var2;
                                    }
                                };
                                ux2Var2.g0(objK25);
                            }
                            jt1Var = new jt1(function9, function10, function11, function12, function13, function14, (Function0) objK25);
                            if (z) {
                                ux2Var2.W(956027158);
                                h(z5, r17, au8.O(1055357172, new c91(wt1Var, ru1Var5, list, (byte) 2), ux2Var2), ux2Var2, ((i9 >> 15) & 112) | 384);
                                ux2Var2.p(false);
                                ru1Var7 = ru1Var5;
                                fs4Var2 = fs4Var4;
                            } else {
                                ux2Var2.W(956692790);
                                zH18 = ux2Var2.h(ru1Var5);
                                objK26 = ux2Var2.K();
                                if (zH18 || objK26 == awVar2) {
                                    objK26 = new m9(0, ru1Var5, ru1.class, "dismissMaximumShortcutsReachedDialog", "dismissMaximumShortcutsReachedDialog()V", 0, (byte) 22);
                                    ux2Var2.g0(objK26);
                                }
                                pu3 pu3Var = (pu3) objK26;
                                zH19 = ux2Var2.h(ru1Var5);
                                objK27 = ux2Var2.K();
                                if (zH19 || objK27 == awVar2) {
                                    objK27 = new m9(0, ru1Var5, ru1.class, "dismissDeleteDeviceDialog", "dismissDeleteDeviceDialog()V", 0, (byte) 23);
                                    ux2Var2.g0(objK27);
                                }
                                pu3 pu3Var2 = (pu3) objK27;
                                zH20 = ux2Var2.h(ru1Var5);
                                objK28 = ux2Var2.K();
                                if (!zH20 || objK28 == awVar2) {
                                    ru1 ru1Var8 = ru1Var5;
                                    objK28 = new m9(0, ru1Var8, ru1.class, "dismissDeviceUnavailableDialog", "dismissDeviceUnavailableDialog()V", 0, (byte) 24);
                                    ru1Var6 = ru1Var8;
                                    ux2Var2.g0(objK28);
                                } else {
                                    ru1Var6 = ru1Var5;
                                }
                                pu3 pu3Var3 = (pu3) objK28;
                                Function0 function15 = (Function0) pu3Var;
                                Function0 function16 = (Function0) pu3Var2;
                                zH21 = ux2Var2.h(ru1Var6) | ux2Var2.h(ns1Var3);
                                objK29 = ux2Var2.K();
                                if (zH21 || objK29 == awVar2) {
                                    final byte b11 = 6;
                                    objK29 = new Function0() { // from class: o.mt1
                                        /* JADX WARN: Code duplicated, block: B:46:0x0138  */
                                        /* JADX WARN: Code duplicated, block: B:50:0x0179  */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object a() {
                                            ShortcutManager shortcutManager;
                                            l97 l97Var;
                                            Object value;
                                            List<ShortcutInfo> pinnedShortcuts;
                                            List<ShortcutInfo> pinnedShortcuts2;
                                            byte b12 = b11;
                                            byte size = 0;
                                            size = 0;
                                            byte b13 = 1;
                                            ru1 ru1Var9 = ru1Var6;
                                            byte b14 = 9;
                                            ns1 ns1Var4 = ns1Var3;
                                            hc1 hc1Var2 = null;
                                            byte b15 = 2;
                                            f88 f88Var2 = f88.a;
                                            switch (b12) {
                                                case 0:
                                                    ns1Var4.getClass();
                                                    im3.R(e8.n(ru1Var9), ru1Var9.x, null, new gu1(ru1Var9, ns1Var4, hc1Var2, b15), 2);
                                                    break;
                                                case 1:
                                                    ns1Var4.getClass();
                                                    im3.R(e8.n(ru1Var9), ru1Var9.x, null, new gu1(ru1Var9, ns1Var4, hc1Var2, b13), 2);
                                                    break;
                                                case 2:
                                                    ns1Var4.getClass();
                                                    im3.R(e8.n(ru1Var9), ru1Var9.x, null, new gu1(ru1Var9, ns1Var4, hc1Var2, size), 2);
                                                    break;
                                                case 3:
                                                    ns1Var4.getClass();
                                                    cr crVar = ru1Var9.p;
                                                    xk1 xk1Var = ru1Var9.V;
                                                    crVar.getClass();
                                                    xk1Var.getClass();
                                                    ru1 ru1Var10 = (ru1) xk1Var.n;
                                                    long j3 = ns1Var4.a;
                                                    BigInteger bigIntegerValueOf = (j3 <= 0 || j3 > 4294967295L) ? null : BigInteger.valueOf(144115188075855872L + j3);
                                                    e27 e27Var = e27.a;
                                                    if (bigIntegerValueOf != null) {
                                                        IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                        if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                            ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(bigIntegerValueOf);
                                                            if (chatConversationIDRequestPrivateRoomWithEndPoint == null || chatConversationIDRequestPrivateRoomWithEndPoint.Equal(ChatConversationID.getInvalidConversationID())) {
                                                                ye4.a("DeviceChatHelper", "Not able to open device chat: invalid conversationId");
                                                                im3.R(e8.n(ru1Var10), null, null, new oa1(ru1Var10, e27Var, hc1Var2, b14), 3);
                                                            } else {
                                                                im3.R(e8.n(ru1Var10), null, null, new oa1((Object) ru1Var10, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var2, (byte) 8), 3);
                                                            }
                                                        } else {
                                                            ye4.a("DeviceChatHelper", "Not able to open device chat: startChatUIModel == null");
                                                            im3.R(e8.n(ru1Var10), null, null, new oa1(ru1Var10, e27Var, hc1Var2, b14), 3);
                                                        }
                                                    } else {
                                                        ye4.a("DeviceChatHelper", "Not able to open device chat: invalid dyngateId " + j3);
                                                        im3.R(e8.n(ru1Var10), null, null, new oa1(ru1Var10, e27Var, hc1Var2, b14), 3);
                                                    }
                                                    break;
                                                case 4:
                                                    ns1 ns1Var5 = ns1Var3;
                                                    ns1Var5.getClass();
                                                    ru1 ru1Var11 = ru1Var6;
                                                    d31 d31Var = ru1Var11.f1953o;
                                                    RemoteControlApplication remoteControlApplication = d31Var.a;
                                                    RemoteControlApplication remoteControlApplication2 = d31Var.a;
                                                    ShortcutManager shortcutManager2 = (ShortcutManager) remoteControlApplication.getSystemService(ShortcutManager.class);
                                                    if (shortcutManager2 != null && shortcutManager2.isRequestPinShortcutSupported()) {
                                                        String strValueOf = String.valueOf(ns1Var5.a);
                                                        strValueOf.getClass();
                                                        ShortcutManager shortcutManager3 = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                        hc1 hc1Var3 = null;
                                                        if (shortcutManager3 == null || (pinnedShortcuts2 = shortcutManager3.getPinnedShortcuts()) == null || pinnedShortcuts2.isEmpty()) {
                                                            shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                            if (shortcutManager != null && (pinnedShortcuts = shortcutManager.getPinnedShortcuts()) != null) {
                                                                size = pinnedShortcuts.size();
                                                            }
                                                            if (size >= 5) {
                                                                im3.R(e8.n(ru1Var11), null, null, new j0((Object) ru1Var11, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                                            } else {
                                                                l97Var = ru1Var11.z;
                                                                do {
                                                                    value = l97Var.getValue();
                                                                } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                                            }
                                                        } else {
                                                            Iterator<T> it = pinnedShortcuts2.iterator();
                                                            while (it.hasNext()) {
                                                                if (im3.n(((ShortcutInfo) it.next()).getId(), strValueOf)) {
                                                                    im3.R(e8.n(ru1Var11), null, null, new oa1(ru1Var11, c37.a, hc1Var3, b14), 3);
                                                                    break;
                                                                }
                                                            }
                                                            shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                            if (shortcutManager != null) {
                                                                size = pinnedShortcuts.size();
                                                            }
                                                            if (size >= 5) {
                                                                im3.R(e8.n(ru1Var11), null, null, new j0((Object) ru1Var11, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                                            } else {
                                                                l97Var = ru1Var11.z;
                                                                do {
                                                                    value = l97Var.getValue();
                                                                } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                                            }
                                                        }
                                                    }
                                                    break;
                                                case 5:
                                                    ru1 ru1Var12 = ru1Var6;
                                                    fe1 fe1Var = ru1Var12.x;
                                                    ns1Var4.getClass();
                                                    long j4 = ns1Var4.a;
                                                    l97 l97Var2 = ru1Var12.J;
                                                    Long l = (Long) l97Var2.getValue();
                                                    if (l == null || l.longValue() != j4) {
                                                        ms1 ms1Var = ns1Var4.f;
                                                        if (ms1Var != null) {
                                                            Long l2 = (Long) l97Var2.getValue();
                                                            if (l2 != null) {
                                                                ru1Var12.W0(l2.longValue());
                                                            }
                                                            l97Var2.l(null, Long.valueOf(j4));
                                                            ru1Var12.m1(j4, true);
                                                            im3.R(e8.n(ru1Var12), fe1Var, null, new pu1(ms1Var, ru1Var12, j4, null, (byte) 0), 2);
                                                            Long l3 = ru1Var12.y;
                                                            if (l3 != null) {
                                                                im3.R(e8.n(ru1Var12), fe1Var, null, new qu1(l3.longValue(), ru1Var12, j4, null, (byte) 0), 2);
                                                            }
                                                        } else {
                                                            ye4.c("DeviceInfoScreenViewModel", "no wake capability for " + j4);
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    ru1 ru1Var13 = ru1Var6;
                                                    ru1Var13.X0();
                                                    ns1 ns1Var6 = ns1Var3;
                                                    ns1Var6.getClass();
                                                    du1 du1VarV0 = ru1.V0(ns1Var6);
                                                    ru1Var13.Q.add(du1VarV0);
                                                    im3.R(e8.n(ru1Var13), null, null, new tx(ru1Var13, ns1Var6, du1VarV0, null, (byte) 5), 3);
                                                    break;
                                            }
                                            return f88Var2;
                                        }
                                    };
                                    ux2Var2.g0(objK29);
                                }
                                ru1Var7 = ru1Var6;
                                b(wt1Var, ns1Var3, list, r17, jt1Var, function15, function16, (Function0) objK29, (Function0) pu3Var3, ux2Var2, i13 & 8064);
                                fs4Var2 = r17;
                                ux2Var2.p(false);
                            }
                            str2 = str4;
                            ru1Var2 = ru1Var7;
                        }
                    } else {
                        px4Var = px4VarT7;
                    }
                    z3 = true;
                    zH = ux2Var2.h(ru1Var3) | ux2Var2.f(px4VarT5) | ux2Var2.f(px4VarT6) | ux2Var2.f(px4VarT4);
                    objK = ux2Var2.K();
                    awVar = e01.a;
                    if (zH) {
                        objK = new eb((Object) ru1Var3, (Object) px4VarT5, (Object) px4VarT6, (Object) px4VarT4, (byte) 6);
                        px4Var4 = px4VarT6;
                        px4Var5 = px4VarT4;
                        ux2Var2.g0(objK);
                    } else {
                        objK = new eb((Object) ru1Var3, (Object) px4VarT5, (Object) px4VarT6, (Object) px4VarT4, (byte) 6);
                        px4Var4 = px4VarT6;
                        px4Var5 = px4VarT4;
                        ux2Var2.g0(objK);
                    }
                    Function0 function17 = (Function0) objK;
                    i7 = i9 & 112;
                    px4Var6 = px4Var5;
                    if (i7 == 32) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objK2 = ux2Var2.K();
                    if (z4) {
                        objK2 = new q71(z);
                        ux2Var2.g0(objK2);
                    } else {
                        objK2 = new q71(z);
                        ux2Var2.g0(objK2);
                    }
                    Function0 function18 = (Function0) objK2;
                    zG = ux2Var2.g(z3);
                    px4Var7 = px4Var4;
                    objK3 = ux2Var2.K();
                    if (zG) {
                        objK3 = new q71(z3);
                        ux2Var2.g0(objK3);
                    } else {
                        objK3 = new q71(z3);
                        ux2Var2.g0(objK3);
                    }
                    en3VarH = nv1.H(function18, (Function0) objK3, function17, ux2Var2);
                    et1.c((i9 >> 3) & 14, ux2Var2, z);
                    objK4 = ux2Var2.K();
                    if (objK4 == awVar) {
                        objK4 = new l5(2, null, (byte) 7);
                        ux2Var2.g0(objK4);
                    }
                    f88Var = f88.a;
                    ck3.i(f88Var, (hw2) objK4, ux2Var2);
                    zH2 = ux2Var2.h(ru1Var3) | ux2Var2.f(px4VarT);
                    objK5 = ux2Var2.K();
                    if (zH2) {
                        objK5 = new rt1(ru1Var3, px4VarT, null, (byte) 2);
                        ux2Var2.g0(objK5);
                    } else {
                        objK5 = new rt1(ru1Var3, px4VarT, null, (byte) 2);
                        ux2Var2.g0(objK5);
                    }
                    ck3.i(f88Var, (hw2) objK5, ux2Var2);
                    boolean z13 = z2;
                    zF = ux2Var2.f(ru1Var3) | ux2Var2.e(r19) | ux2Var2.f(uuid) | ux2Var2.f(r17) | ux2Var2.g(z13);
                    objK6 = ux2Var2.K();
                    if (zF) {
                        objK6 = h57.p(Boolean.FALSE);
                        ux2Var2.g0(objK6);
                    } else {
                        objK6 = h57.p(Boolean.FALSE);
                        ux2Var2.g0(objK6);
                    }
                    px4Var8 = (px4) objK6;
                    Object[] objArr4 = {ru1Var3, Long.valueOf(r19), uuid, r17, Boolean.valueOf(z13)};
                    zH3 = ux2Var2.h(ru1Var3) | ux2Var2.h(ns1Var) | ux2Var2.f(px4Var8);
                    objK7 = ux2Var2.K();
                    if (zH3) {
                        objK7 = new m5((Object) ru1Var3, (Object) ns1Var, (Object) px4Var8, (byte) 14);
                        ux2Var2.g0(objK7);
                    } else {
                        objK7 = new m5((Object) ru1Var3, (Object) ns1Var, (Object) px4Var8, (byte) 14);
                        ux2Var2.g0(objK7);
                    }
                    ck3.f(objArr4, (Function1) objK7, ux2Var2);
                    Object[] objArr5 = {ru1Var3, Long.valueOf(j), uuid, num, Boolean.valueOf(z13)};
                    zH4 = ux2Var2.h(ru1Var3) | ux2Var2.h(ns1Var);
                    objK8 = ux2Var2.K();
                    if (zH4) {
                        objK8 = new qt1(ru1Var3, ns1Var, null, (byte) 1);
                        ux2Var2.g0(objK8);
                    } else {
                        objK8 = new qt1(ru1Var3, ns1Var, null, (byte) 1);
                        ux2Var2.g0(objK8);
                    }
                    ck3.j(objArr5, (hw2) objK8, ux2Var2);
                    if (!((Boolean) px4Var8.getValue()).booleanValue()) {
                        j56VarR2 = ux2Var2.r();
                        if (j56VarR2 != null) {
                            final byte b12 = 1;
                            final String str7 = str3;
                            final fs4 fs4Var6 = fs4Var3;
                            j56VarR2.d = new hw2() { // from class: o.nt1
                                @Override // o.hw2
                                public final Object invoke(Object obj, Object obj2) {
                                    byte b13 = b12;
                                    f88 f88Var2 = f88.a;
                                    int i14 = i2;
                                    int i15 = i;
                                    switch (b13) {
                                        case 0:
                                            ((Integer) obj2).getClass();
                                            int iY = yo1.Y(i15 | 1);
                                            int iY2 = yo1.Y(i14);
                                            vt1.a(ns1Var, z, function1, function2, function0, list, fs4Var6, function3, function4, function5, function6, str7, vx6Var, ru1Var3, (ux2) obj, iY, iY2, i3);
                                            break;
                                        case 1:
                                            ((Integer) obj2).getClass();
                                            int iY3 = yo1.Y(i15 | 1);
                                            int iY4 = yo1.Y(i14);
                                            vt1.a(ns1Var, z, function1, function2, function0, list, fs4Var6, function3, function4, function5, function6, str7, vx6Var, ru1Var3, (ux2) obj, iY3, iY4, i3);
                                            break;
                                        default:
                                            ((Integer) obj2).getClass();
                                            int iY5 = yo1.Y(i15 | 1);
                                            int iY6 = yo1.Y(i14);
                                            vt1.a(ns1Var, z, function1, function2, function0, list, fs4Var6, function3, function4, function5, function6, str7, vx6Var, ru1Var3, (ux2) obj, iY5, iY6, i3);
                                            break;
                                    }
                                    return f88Var2;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    str4 = str3;
                    fs4Var4 = fs4Var3;
                    ns1Var2 = wt1Var.b;
                    z5 = wt1Var.a;
                    if (ns1Var2 == null) {
                        j56VarR = ux2Var2.r();
                        if (j56VarR != null) {
                            final byte b13 = 2;
                            j56VarR.d = new hw2() { // from class: o.nt1
                                @Override // o.hw2
                                public final Object invoke(Object obj, Object obj2) {
                                    byte b14 = b13;
                                    f88 f88Var2 = f88.a;
                                    int i14 = i2;
                                    int i15 = i;
                                    switch (b14) {
                                        case 0:
                                            ((Integer) obj2).getClass();
                                            int iY = yo1.Y(i15 | 1);
                                            int iY2 = yo1.Y(i14);
                                            vt1.a(ns1Var, z, function1, function2, function0, list, fs4Var4, function3, function4, function5, function6, str4, vx6Var, ru1Var3, (ux2) obj, iY, iY2, i3);
                                            break;
                                        case 1:
                                            ((Integer) obj2).getClass();
                                            int iY3 = yo1.Y(i15 | 1);
                                            int iY4 = yo1.Y(i14);
                                            vt1.a(ns1Var, z, function1, function2, function0, list, fs4Var4, function3, function4, function5, function6, str4, vx6Var, ru1Var3, (ux2) obj, iY3, iY4, i3);
                                            break;
                                        default:
                                            ((Integer) obj2).getClass();
                                            int iY5 = yo1.Y(i15 | 1);
                                            int iY6 = yo1.Y(i14);
                                            vt1.a(ns1Var, z, function1, function2, function0, list, fs4Var4, function3, function4, function5, function6, str4, vx6Var, ru1Var3, (ux2) obj, iY5, iY6, i3);
                                            break;
                                    }
                                    return f88Var2;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    ru1Var4 = ru1Var3;
                    long j3 = ns1Var2.a;
                    Object[] objArr6 = {Long.valueOf(j3), ns1Var2.d, Boolean.valueOf(ns1Var2.l), Boolean.valueOf(z)};
                    if (i7 == 32) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    zH5 = z6 | ux2Var2.h(ru1Var4);
                    objK9 = ux2Var2.K();
                    if (zH5) {
                        objK9 = new pt1(z, ru1Var4, (hc1) null);
                        ux2Var2.g0(objK9);
                    } else {
                        objK9 = new pt1(z, ru1Var4, (hc1) null);
                        ux2Var2.g0(objK9);
                    }
                    ck3.j(objArr6, (hw2) objK9, ux2Var2);
                    Boolean boolValueOf4 = Boolean.valueOf(z11);
                    z7 = z11;
                    zF2 = ux2Var2.f(px4VarT5) | ux2Var2.g(z7);
                    objK10 = ux2Var2.K();
                    if (zF2) {
                        objK10 = new e81(px4VarT5, z7, null, (byte) 2);
                        ux2Var2.g0(objK10);
                    } else {
                        objK10 = new e81(px4VarT5, z7, null, (byte) 2);
                        ux2Var2.g0(objK10);
                    }
                    ck3.i(boolValueOf4, (hw2) objK10, ux2Var2);
                    Boolean boolValueOf5 = Boolean.valueOf(z3);
                    zF3 = ux2Var2.f(px4Var7) | ux2Var2.g(z3);
                    objK11 = ux2Var2.K();
                    b2 = 3;
                    if (zF3) {
                        objK11 = new e81(px4Var7, z3, null, b2);
                        ux2Var2.g0(objK11);
                    } else {
                        objK11 = new e81(px4Var7, z3, null, b2);
                        ux2Var2.g0(objK11);
                    }
                    ck3.i(boolValueOf5, (hw2) objK11, ux2Var2);
                    Boolean boolValueOf6 = Boolean.valueOf(z5);
                    px4Var9 = px4Var;
                    zF4 = ux2Var2.f(px4Var9) | ux2Var2.h(wt1Var);
                    objK12 = ux2Var2.K();
                    if (zF4) {
                        objK12 = new i9(px4Var9, wt1Var, null, (byte) 8);
                        ux2Var2.g0(objK12);
                    } else {
                        objK12 = new i9(px4Var9, wt1Var, null, (byte) 8);
                        ux2Var2.g0(objK12);
                    }
                    ck3.i(boolValueOf6, (hw2) objK12, ux2Var2);
                    zF5 = ux2Var2.f(px4VarT5) | ux2Var2.f(px4Var7) | ux2Var2.f(px4Var9);
                    objK13 = ux2Var2.K();
                    if (zF5) {
                        objK13 = new m71(px4VarT5, px4Var7, px4Var9, (byte) 2);
                        ux2Var2.g0(objK13);
                    } else {
                        objK13 = new m71(px4VarT5, px4Var7, px4Var9, (byte) 2);
                        ux2Var2.g0(objK13);
                    }
                    ck3.e(f88Var, (Function1) objK13, ux2Var2);
                    Long lValueOf2 = Long.valueOf(j3);
                    zH6 = ux2Var2.h(ru1Var4) | ux2Var2.h(ns1Var2);
                    objK14 = ux2Var2.K();
                    if (zH6) {
                        objK14 = new qt1(ru1Var4, ns1Var2, null, (byte) 0);
                        ux2Var2.g0(objK14);
                    } else {
                        objK14 = new qt1(ru1Var4, ns1Var2, null, (byte) 0);
                        ux2Var2.g0(objK14);
                    }
                    ck3.i(lValueOf2, (hw2) objK14, ux2Var2);
                    zH7 = ux2Var2.h(ru1Var4);
                    objK15 = ux2Var2.K();
                    if (zH7) {
                        objK15 = new ac(ru1Var4, null, (byte) 4);
                        ux2Var2.g0(objK15);
                    } else {
                        objK15 = new ac(ru1Var4, null, (byte) 4);
                        ux2Var2.g0(objK15);
                    }
                    ck3.i(f88Var, (hw2) objK15, ux2Var2);
                    px4Var10 = px4Var2;
                    zH8 = ux2Var2.h(ru1Var4) | ux2Var2.f(px4Var10);
                    objK16 = ux2Var2.K();
                    if (zH8) {
                        objK16 = new rt1(ru1Var4, px4Var10, null, (byte) 0);
                        ux2Var2.g0(objK16);
                    } else {
                        objK16 = new rt1(ru1Var4, px4Var10, null, (byte) 0);
                        ux2Var2.g0(objK16);
                    }
                    ck3.i(f88Var, (hw2) objK16, ux2Var2);
                    px4Var11 = px4Var3;
                    zH9 = ux2Var2.h(ru1Var4) | ux2Var2.f(px4Var11);
                    objK17 = ux2Var2.K();
                    if (zH9) {
                        hc1Var = null;
                        objK17 = new rt1(ru1Var4, px4Var11, hc1Var, (byte) 1);
                        ux2Var2.g0(objK17);
                    } else {
                        hc1Var = null;
                        objK17 = new rt1(ru1Var4, px4Var11, hc1Var, (byte) 1);
                        ux2Var2.g0(objK17);
                    }
                    ck3.i(f88Var, (hw2) objK17, ux2Var2);
                    zH10 = ux2Var2.h(ru1Var4) | ux2Var2.f(px4Var6) | ux2Var2.f(px4VarT);
                    objK18 = ux2Var2.K();
                    if (zH10) {
                        px4Var12 = px4Var6;
                        j0 j0Var2 = new j0((Object) ru1Var4, (Object) px4Var12, (Object) px4VarT, hc1Var, (byte) 24);
                        ux2Var2.g0(j0Var2);
                        objK18 = j0Var2;
                    } else {
                        px4Var12 = px4Var6;
                        j0 j0Var3 = new j0((Object) ru1Var4, (Object) px4Var12, (Object) px4VarT, hc1Var, (byte) 24);
                        ux2Var2.g0(j0Var3);
                        objK18 = j0Var3;
                    }
                    ck3.i(f88Var, (hw2) objK18, ux2Var2);
                    if ((i12 & 896) != 256) {
                        z8 = true;
                    } else {
                        z8 = true;
                    }
                    zF6 = z8 | ux2Var2.f(px4Var12) | ux2Var2.h(ru1Var4) | ux2Var2.h(en3VarH);
                    Object objK31 = ux2Var2.K();
                    if (zF6) {
                        px4 px4Var14 = px4Var12;
                        ns1Var3 = ns1Var2;
                        ru1Var5 = ru1Var4;
                        awVar2 = awVar;
                        bjVar = new bj(vx6Var, px4Var14, ru1Var5, en3VarH, null, (byte) 7);
                        ux2Var2.g0(bjVar);
                    } else {
                        px4 px4Var15 = px4Var12;
                        ns1Var3 = ns1Var2;
                        ru1Var5 = ru1Var4;
                        awVar2 = awVar;
                        bjVar = new bj(vx6Var, px4Var15, ru1Var5, en3VarH, null, (byte) 7);
                        ux2Var2.g0(bjVar);
                    }
                    ck3.i(vx6Var, (hw2) bjVar, ux2Var2);
                    zH11 = ux2Var2.h(ru1Var5) | ux2Var2.h(ns1Var3);
                    objK19 = ux2Var2.K();
                    if (zH11) {
                        final byte b14 = 0;
                        objK19 = new Function0() { // from class: o.mt1
                            /* JADX WARN: Code duplicated, block: B:46:0x0138  */
                            /* JADX WARN: Code duplicated, block: B:50:0x0179  */
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                ShortcutManager shortcutManager;
                                l97 l97Var;
                                Object value;
                                List<ShortcutInfo> pinnedShortcuts;
                                List<ShortcutInfo> pinnedShortcuts2;
                                byte b15 = b14;
                                byte size = 0;
                                size = 0;
                                byte b16 = 1;
                                ru1 ru1Var9 = ru1Var5;
                                byte b17 = 9;
                                ns1 ns1Var4 = ns1Var3;
                                hc1 hc1Var2 = null;
                                byte b18 = 2;
                                f88 f88Var2 = f88.a;
                                switch (b15) {
                                    case 0:
                                        ns1Var4.getClass();
                                        im3.R(e8.n(ru1Var9), ru1Var9.x, null, new gu1(ru1Var9, ns1Var4, hc1Var2, b18), 2);
                                        break;
                                    case 1:
                                        ns1Var4.getClass();
                                        im3.R(e8.n(ru1Var9), ru1Var9.x, null, new gu1(ru1Var9, ns1Var4, hc1Var2, b16), 2);
                                        break;
                                    case 2:
                                        ns1Var4.getClass();
                                        im3.R(e8.n(ru1Var9), ru1Var9.x, null, new gu1(ru1Var9, ns1Var4, hc1Var2, size), 2);
                                        break;
                                    case 3:
                                        ns1Var4.getClass();
                                        cr crVar = ru1Var9.p;
                                        xk1 xk1Var = ru1Var9.V;
                                        crVar.getClass();
                                        xk1Var.getClass();
                                        ru1 ru1Var10 = (ru1) xk1Var.n;
                                        long j4 = ns1Var4.a;
                                        BigInteger bigIntegerValueOf = (j4 <= 0 || j4 > 4294967295L) ? null : BigInteger.valueOf(144115188075855872L + j4);
                                        e27 e27Var = e27.a;
                                        if (bigIntegerValueOf != null) {
                                            IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                            if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(bigIntegerValueOf);
                                                if (chatConversationIDRequestPrivateRoomWithEndPoint == null || chatConversationIDRequestPrivateRoomWithEndPoint.Equal(ChatConversationID.getInvalidConversationID())) {
                                                    ye4.a("DeviceChatHelper", "Not able to open device chat: invalid conversationId");
                                                    im3.R(e8.n(ru1Var10), null, null, new oa1(ru1Var10, e27Var, hc1Var2, b17), 3);
                                                } else {
                                                    im3.R(e8.n(ru1Var10), null, null, new oa1((Object) ru1Var10, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var2, (byte) 8), 3);
                                                }
                                            } else {
                                                ye4.a("DeviceChatHelper", "Not able to open device chat: startChatUIModel == null");
                                                im3.R(e8.n(ru1Var10), null, null, new oa1(ru1Var10, e27Var, hc1Var2, b17), 3);
                                            }
                                        } else {
                                            ye4.a("DeviceChatHelper", "Not able to open device chat: invalid dyngateId " + j4);
                                            im3.R(e8.n(ru1Var10), null, null, new oa1(ru1Var10, e27Var, hc1Var2, b17), 3);
                                        }
                                        break;
                                    case 4:
                                        ns1 ns1Var5 = ns1Var3;
                                        ns1Var5.getClass();
                                        ru1 ru1Var11 = ru1Var5;
                                        d31 d31Var = ru1Var11.f1953o;
                                        RemoteControlApplication remoteControlApplication = d31Var.a;
                                        RemoteControlApplication remoteControlApplication2 = d31Var.a;
                                        ShortcutManager shortcutManager2 = (ShortcutManager) remoteControlApplication.getSystemService(ShortcutManager.class);
                                        if (shortcutManager2 != null && shortcutManager2.isRequestPinShortcutSupported()) {
                                            String strValueOf = String.valueOf(ns1Var5.a);
                                            strValueOf.getClass();
                                            ShortcutManager shortcutManager3 = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                            hc1 hc1Var3 = null;
                                            if (shortcutManager3 == null || (pinnedShortcuts2 = shortcutManager3.getPinnedShortcuts()) == null || pinnedShortcuts2.isEmpty()) {
                                                shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                if (shortcutManager != null && (pinnedShortcuts = shortcutManager.getPinnedShortcuts()) != null) {
                                                    size = pinnedShortcuts.size();
                                                }
                                                if (size >= 5) {
                                                    im3.R(e8.n(ru1Var11), null, null, new j0((Object) ru1Var11, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                                } else {
                                                    l97Var = ru1Var11.z;
                                                    do {
                                                        value = l97Var.getValue();
                                                    } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                                }
                                            } else {
                                                Iterator<T> it = pinnedShortcuts2.iterator();
                                                while (it.hasNext()) {
                                                    if (im3.n(((ShortcutInfo) it.next()).getId(), strValueOf)) {
                                                        im3.R(e8.n(ru1Var11), null, null, new oa1(ru1Var11, c37.a, hc1Var3, b17), 3);
                                                        break;
                                                    }
                                                }
                                                shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                if (shortcutManager != null) {
                                                    size = pinnedShortcuts.size();
                                                }
                                                if (size >= 5) {
                                                    im3.R(e8.n(ru1Var11), null, null, new j0((Object) ru1Var11, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                                } else {
                                                    l97Var = ru1Var11.z;
                                                    do {
                                                        value = l97Var.getValue();
                                                    } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                                }
                                            }
                                        }
                                        break;
                                    case 5:
                                        ru1 ru1Var12 = ru1Var5;
                                        fe1 fe1Var = ru1Var12.x;
                                        ns1Var4.getClass();
                                        long j5 = ns1Var4.a;
                                        l97 l97Var2 = ru1Var12.J;
                                        Long l = (Long) l97Var2.getValue();
                                        if (l == null || l.longValue() != j5) {
                                            ms1 ms1Var = ns1Var4.f;
                                            if (ms1Var != null) {
                                                Long l2 = (Long) l97Var2.getValue();
                                                if (l2 != null) {
                                                    ru1Var12.W0(l2.longValue());
                                                }
                                                l97Var2.l(null, Long.valueOf(j5));
                                                ru1Var12.m1(j5, true);
                                                im3.R(e8.n(ru1Var12), fe1Var, null, new pu1(ms1Var, ru1Var12, j5, null, (byte) 0), 2);
                                                Long l3 = ru1Var12.y;
                                                if (l3 != null) {
                                                    im3.R(e8.n(ru1Var12), fe1Var, null, new qu1(l3.longValue(), ru1Var12, j5, null, (byte) 0), 2);
                                                }
                                            } else {
                                                ye4.c("DeviceInfoScreenViewModel", "no wake capability for " + j5);
                                            }
                                        }
                                        break;
                                    default:
                                        ru1 ru1Var13 = ru1Var5;
                                        ru1Var13.X0();
                                        ns1 ns1Var6 = ns1Var3;
                                        ns1Var6.getClass();
                                        du1 du1VarV0 = ru1.V0(ns1Var6);
                                        ru1Var13.Q.add(du1VarV0);
                                        im3.R(e8.n(ru1Var13), null, null, new tx(ru1Var13, ns1Var6, du1VarV0, null, (byte) 5), 3);
                                        break;
                                }
                                return f88Var2;
                            }
                        };
                        ux2Var2.g0(objK19);
                    } else {
                        final byte b15 = 0;
                        objK19 = new Function0() { // from class: o.mt1
                            /* JADX WARN: Code duplicated, block: B:46:0x0138  */
                            /* JADX WARN: Code duplicated, block: B:50:0x0179  */
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                ShortcutManager shortcutManager;
                                l97 l97Var;
                                Object value;
                                List<ShortcutInfo> pinnedShortcuts;
                                List<ShortcutInfo> pinnedShortcuts2;
                                byte b16 = b15;
                                byte size = 0;
                                size = 0;
                                byte b17 = 1;
                                ru1 ru1Var9 = ru1Var5;
                                byte b18 = 9;
                                ns1 ns1Var4 = ns1Var3;
                                hc1 hc1Var2 = null;
                                byte b19 = 2;
                                f88 f88Var2 = f88.a;
                                switch (b16) {
                                    case 0:
                                        ns1Var4.getClass();
                                        im3.R(e8.n(ru1Var9), ru1Var9.x, null, new gu1(ru1Var9, ns1Var4, hc1Var2, b19), 2);
                                        break;
                                    case 1:
                                        ns1Var4.getClass();
                                        im3.R(e8.n(ru1Var9), ru1Var9.x, null, new gu1(ru1Var9, ns1Var4, hc1Var2, b17), 2);
                                        break;
                                    case 2:
                                        ns1Var4.getClass();
                                        im3.R(e8.n(ru1Var9), ru1Var9.x, null, new gu1(ru1Var9, ns1Var4, hc1Var2, size), 2);
                                        break;
                                    case 3:
                                        ns1Var4.getClass();
                                        cr crVar = ru1Var9.p;
                                        xk1 xk1Var = ru1Var9.V;
                                        crVar.getClass();
                                        xk1Var.getClass();
                                        ru1 ru1Var10 = (ru1) xk1Var.n;
                                        long j4 = ns1Var4.a;
                                        BigInteger bigIntegerValueOf = (j4 <= 0 || j4 > 4294967295L) ? null : BigInteger.valueOf(144115188075855872L + j4);
                                        e27 e27Var = e27.a;
                                        if (bigIntegerValueOf != null) {
                                            IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                            if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(bigIntegerValueOf);
                                                if (chatConversationIDRequestPrivateRoomWithEndPoint == null || chatConversationIDRequestPrivateRoomWithEndPoint.Equal(ChatConversationID.getInvalidConversationID())) {
                                                    ye4.a("DeviceChatHelper", "Not able to open device chat: invalid conversationId");
                                                    im3.R(e8.n(ru1Var10), null, null, new oa1(ru1Var10, e27Var, hc1Var2, b18), 3);
                                                } else {
                                                    im3.R(e8.n(ru1Var10), null, null, new oa1((Object) ru1Var10, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var2, (byte) 8), 3);
                                                }
                                            } else {
                                                ye4.a("DeviceChatHelper", "Not able to open device chat: startChatUIModel == null");
                                                im3.R(e8.n(ru1Var10), null, null, new oa1(ru1Var10, e27Var, hc1Var2, b18), 3);
                                            }
                                        } else {
                                            ye4.a("DeviceChatHelper", "Not able to open device chat: invalid dyngateId " + j4);
                                            im3.R(e8.n(ru1Var10), null, null, new oa1(ru1Var10, e27Var, hc1Var2, b18), 3);
                                        }
                                        break;
                                    case 4:
                                        ns1 ns1Var5 = ns1Var3;
                                        ns1Var5.getClass();
                                        ru1 ru1Var11 = ru1Var5;
                                        d31 d31Var = ru1Var11.f1953o;
                                        RemoteControlApplication remoteControlApplication = d31Var.a;
                                        RemoteControlApplication remoteControlApplication2 = d31Var.a;
                                        ShortcutManager shortcutManager2 = (ShortcutManager) remoteControlApplication.getSystemService(ShortcutManager.class);
                                        if (shortcutManager2 != null && shortcutManager2.isRequestPinShortcutSupported()) {
                                            String strValueOf = String.valueOf(ns1Var5.a);
                                            strValueOf.getClass();
                                            ShortcutManager shortcutManager3 = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                            hc1 hc1Var3 = null;
                                            if (shortcutManager3 == null || (pinnedShortcuts2 = shortcutManager3.getPinnedShortcuts()) == null || pinnedShortcuts2.isEmpty()) {
                                                shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                if (shortcutManager != null && (pinnedShortcuts = shortcutManager.getPinnedShortcuts()) != null) {
                                                    size = pinnedShortcuts.size();
                                                }
                                                if (size >= 5) {
                                                    im3.R(e8.n(ru1Var11), null, null, new j0((Object) ru1Var11, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                                } else {
                                                    l97Var = ru1Var11.z;
                                                    do {
                                                        value = l97Var.getValue();
                                                    } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                                }
                                            } else {
                                                Iterator<T> it = pinnedShortcuts2.iterator();
                                                while (it.hasNext()) {
                                                    if (im3.n(((ShortcutInfo) it.next()).getId(), strValueOf)) {
                                                        im3.R(e8.n(ru1Var11), null, null, new oa1(ru1Var11, c37.a, hc1Var3, b18), 3);
                                                        break;
                                                    }
                                                }
                                                shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                if (shortcutManager != null) {
                                                    size = pinnedShortcuts.size();
                                                }
                                                if (size >= 5) {
                                                    im3.R(e8.n(ru1Var11), null, null, new j0((Object) ru1Var11, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                                } else {
                                                    l97Var = ru1Var11.z;
                                                    do {
                                                        value = l97Var.getValue();
                                                    } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                                }
                                            }
                                        }
                                        break;
                                    case 5:
                                        ru1 ru1Var12 = ru1Var5;
                                        fe1 fe1Var = ru1Var12.x;
                                        ns1Var4.getClass();
                                        long j5 = ns1Var4.a;
                                        l97 l97Var2 = ru1Var12.J;
                                        Long l = (Long) l97Var2.getValue();
                                        if (l == null || l.longValue() != j5) {
                                            ms1 ms1Var = ns1Var4.f;
                                            if (ms1Var != null) {
                                                Long l2 = (Long) l97Var2.getValue();
                                                if (l2 != null) {
                                                    ru1Var12.W0(l2.longValue());
                                                }
                                                l97Var2.l(null, Long.valueOf(j5));
                                                ru1Var12.m1(j5, true);
                                                im3.R(e8.n(ru1Var12), fe1Var, null, new pu1(ms1Var, ru1Var12, j5, null, (byte) 0), 2);
                                                Long l3 = ru1Var12.y;
                                                if (l3 != null) {
                                                    im3.R(e8.n(ru1Var12), fe1Var, null, new qu1(l3.longValue(), ru1Var12, j5, null, (byte) 0), 2);
                                                }
                                            } else {
                                                ye4.c("DeviceInfoScreenViewModel", "no wake capability for " + j5);
                                            }
                                        }
                                        break;
                                    default:
                                        ru1 ru1Var13 = ru1Var5;
                                        ru1Var13.X0();
                                        ns1 ns1Var6 = ns1Var3;
                                        ns1Var6.getClass();
                                        du1 du1VarV0 = ru1.V0(ns1Var6);
                                        ru1Var13.Q.add(du1VarV0);
                                        im3.R(e8.n(ru1Var13), null, null, new tx(ru1Var13, ns1Var6, du1VarV0, null, (byte) 5), 3);
                                        break;
                                }
                                return f88Var2;
                            }
                        };
                        ux2Var2.g0(objK19);
                    }
                    Function0 function19 = (Function0) objK19;
                    zH12 = ux2Var2.h(ru1Var5) | ux2Var2.h(ns1Var3);
                    objK20 = ux2Var2.K();
                    if (zH12) {
                        final byte b16 = 1;
                        objK20 = new Function0() { // from class: o.mt1
                            /* JADX WARN: Code duplicated, block: B:46:0x0138  */
                            /* JADX WARN: Code duplicated, block: B:50:0x0179  */
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                ShortcutManager shortcutManager;
                                l97 l97Var;
                                Object value;
                                List<ShortcutInfo> pinnedShortcuts;
                                List<ShortcutInfo> pinnedShortcuts2;
                                byte b17 = b16;
                                byte size = 0;
                                size = 0;
                                byte b18 = 1;
                                ru1 ru1Var9 = ru1Var5;
                                byte b19 = 9;
                                ns1 ns1Var4 = ns1Var3;
                                hc1 hc1Var2 = null;
                                byte b110 = 2;
                                f88 f88Var2 = f88.a;
                                switch (b17) {
                                    case 0:
                                        ns1Var4.getClass();
                                        im3.R(e8.n(ru1Var9), ru1Var9.x, null, new gu1(ru1Var9, ns1Var4, hc1Var2, b110), 2);
                                        break;
                                    case 1:
                                        ns1Var4.getClass();
                                        im3.R(e8.n(ru1Var9), ru1Var9.x, null, new gu1(ru1Var9, ns1Var4, hc1Var2, b18), 2);
                                        break;
                                    case 2:
                                        ns1Var4.getClass();
                                        im3.R(e8.n(ru1Var9), ru1Var9.x, null, new gu1(ru1Var9, ns1Var4, hc1Var2, size), 2);
                                        break;
                                    case 3:
                                        ns1Var4.getClass();
                                        cr crVar = ru1Var9.p;
                                        xk1 xk1Var = ru1Var9.V;
                                        crVar.getClass();
                                        xk1Var.getClass();
                                        ru1 ru1Var10 = (ru1) xk1Var.n;
                                        long j4 = ns1Var4.a;
                                        BigInteger bigIntegerValueOf = (j4 <= 0 || j4 > 4294967295L) ? null : BigInteger.valueOf(144115188075855872L + j4);
                                        e27 e27Var = e27.a;
                                        if (bigIntegerValueOf != null) {
                                            IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                            if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(bigIntegerValueOf);
                                                if (chatConversationIDRequestPrivateRoomWithEndPoint == null || chatConversationIDRequestPrivateRoomWithEndPoint.Equal(ChatConversationID.getInvalidConversationID())) {
                                                    ye4.a("DeviceChatHelper", "Not able to open device chat: invalid conversationId");
                                                    im3.R(e8.n(ru1Var10), null, null, new oa1(ru1Var10, e27Var, hc1Var2, b19), 3);
                                                } else {
                                                    im3.R(e8.n(ru1Var10), null, null, new oa1((Object) ru1Var10, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var2, (byte) 8), 3);
                                                }
                                            } else {
                                                ye4.a("DeviceChatHelper", "Not able to open device chat: startChatUIModel == null");
                                                im3.R(e8.n(ru1Var10), null, null, new oa1(ru1Var10, e27Var, hc1Var2, b19), 3);
                                            }
                                        } else {
                                            ye4.a("DeviceChatHelper", "Not able to open device chat: invalid dyngateId " + j4);
                                            im3.R(e8.n(ru1Var10), null, null, new oa1(ru1Var10, e27Var, hc1Var2, b19), 3);
                                        }
                                        break;
                                    case 4:
                                        ns1 ns1Var5 = ns1Var3;
                                        ns1Var5.getClass();
                                        ru1 ru1Var11 = ru1Var5;
                                        d31 d31Var = ru1Var11.f1953o;
                                        RemoteControlApplication remoteControlApplication = d31Var.a;
                                        RemoteControlApplication remoteControlApplication2 = d31Var.a;
                                        ShortcutManager shortcutManager2 = (ShortcutManager) remoteControlApplication.getSystemService(ShortcutManager.class);
                                        if (shortcutManager2 != null && shortcutManager2.isRequestPinShortcutSupported()) {
                                            String strValueOf = String.valueOf(ns1Var5.a);
                                            strValueOf.getClass();
                                            ShortcutManager shortcutManager3 = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                            hc1 hc1Var3 = null;
                                            if (shortcutManager3 == null || (pinnedShortcuts2 = shortcutManager3.getPinnedShortcuts()) == null || pinnedShortcuts2.isEmpty()) {
                                                shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                if (shortcutManager != null && (pinnedShortcuts = shortcutManager.getPinnedShortcuts()) != null) {
                                                    size = pinnedShortcuts.size();
                                                }
                                                if (size >= 5) {
                                                    im3.R(e8.n(ru1Var11), null, null, new j0((Object) ru1Var11, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                                } else {
                                                    l97Var = ru1Var11.z;
                                                    do {
                                                        value = l97Var.getValue();
                                                    } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                                }
                                            } else {
                                                Iterator<T> it = pinnedShortcuts2.iterator();
                                                while (it.hasNext()) {
                                                    if (im3.n(((ShortcutInfo) it.next()).getId(), strValueOf)) {
                                                        im3.R(e8.n(ru1Var11), null, null, new oa1(ru1Var11, c37.a, hc1Var3, b19), 3);
                                                        break;
                                                    }
                                                }
                                                shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                if (shortcutManager != null) {
                                                    size = pinnedShortcuts.size();
                                                }
                                                if (size >= 5) {
                                                    im3.R(e8.n(ru1Var11), null, null, new j0((Object) ru1Var11, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                                } else {
                                                    l97Var = ru1Var11.z;
                                                    do {
                                                        value = l97Var.getValue();
                                                    } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                                }
                                            }
                                        }
                                        break;
                                    case 5:
                                        ru1 ru1Var12 = ru1Var5;
                                        fe1 fe1Var = ru1Var12.x;
                                        ns1Var4.getClass();
                                        long j5 = ns1Var4.a;
                                        l97 l97Var2 = ru1Var12.J;
                                        Long l = (Long) l97Var2.getValue();
                                        if (l == null || l.longValue() != j5) {
                                            ms1 ms1Var = ns1Var4.f;
                                            if (ms1Var != null) {
                                                Long l2 = (Long) l97Var2.getValue();
                                                if (l2 != null) {
                                                    ru1Var12.W0(l2.longValue());
                                                }
                                                l97Var2.l(null, Long.valueOf(j5));
                                                ru1Var12.m1(j5, true);
                                                im3.R(e8.n(ru1Var12), fe1Var, null, new pu1(ms1Var, ru1Var12, j5, null, (byte) 0), 2);
                                                Long l3 = ru1Var12.y;
                                                if (l3 != null) {
                                                    im3.R(e8.n(ru1Var12), fe1Var, null, new qu1(l3.longValue(), ru1Var12, j5, null, (byte) 0), 2);
                                                }
                                            } else {
                                                ye4.c("DeviceInfoScreenViewModel", "no wake capability for " + j5);
                                            }
                                        }
                                        break;
                                    default:
                                        ru1 ru1Var13 = ru1Var5;
                                        ru1Var13.X0();
                                        ns1 ns1Var6 = ns1Var3;
                                        ns1Var6.getClass();
                                        du1 du1VarV0 = ru1.V0(ns1Var6);
                                        ru1Var13.Q.add(du1VarV0);
                                        im3.R(e8.n(ru1Var13), null, null, new tx(ru1Var13, ns1Var6, du1VarV0, null, (byte) 5), 3);
                                        break;
                                }
                                return f88Var2;
                            }
                        };
                        ux2Var2.g0(objK20);
                    } else {
                        final byte b17 = 1;
                        objK20 = new Function0() { // from class: o.mt1
                            /* JADX WARN: Code duplicated, block: B:46:0x0138  */
                            /* JADX WARN: Code duplicated, block: B:50:0x0179  */
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                ShortcutManager shortcutManager;
                                l97 l97Var;
                                Object value;
                                List<ShortcutInfo> pinnedShortcuts;
                                List<ShortcutInfo> pinnedShortcuts2;
                                byte b18 = b17;
                                byte size = 0;
                                size = 0;
                                byte b19 = 1;
                                ru1 ru1Var9 = ru1Var5;
                                byte b110 = 9;
                                ns1 ns1Var4 = ns1Var3;
                                hc1 hc1Var2 = null;
                                byte b111 = 2;
                                f88 f88Var2 = f88.a;
                                switch (b18) {
                                    case 0:
                                        ns1Var4.getClass();
                                        im3.R(e8.n(ru1Var9), ru1Var9.x, null, new gu1(ru1Var9, ns1Var4, hc1Var2, b111), 2);
                                        break;
                                    case 1:
                                        ns1Var4.getClass();
                                        im3.R(e8.n(ru1Var9), ru1Var9.x, null, new gu1(ru1Var9, ns1Var4, hc1Var2, b19), 2);
                                        break;
                                    case 2:
                                        ns1Var4.getClass();
                                        im3.R(e8.n(ru1Var9), ru1Var9.x, null, new gu1(ru1Var9, ns1Var4, hc1Var2, size), 2);
                                        break;
                                    case 3:
                                        ns1Var4.getClass();
                                        cr crVar = ru1Var9.p;
                                        xk1 xk1Var = ru1Var9.V;
                                        crVar.getClass();
                                        xk1Var.getClass();
                                        ru1 ru1Var10 = (ru1) xk1Var.n;
                                        long j4 = ns1Var4.a;
                                        BigInteger bigIntegerValueOf = (j4 <= 0 || j4 > 4294967295L) ? null : BigInteger.valueOf(144115188075855872L + j4);
                                        e27 e27Var = e27.a;
                                        if (bigIntegerValueOf != null) {
                                            IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                            if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(bigIntegerValueOf);
                                                if (chatConversationIDRequestPrivateRoomWithEndPoint == null || chatConversationIDRequestPrivateRoomWithEndPoint.Equal(ChatConversationID.getInvalidConversationID())) {
                                                    ye4.a("DeviceChatHelper", "Not able to open device chat: invalid conversationId");
                                                    im3.R(e8.n(ru1Var10), null, null, new oa1(ru1Var10, e27Var, hc1Var2, b110), 3);
                                                } else {
                                                    im3.R(e8.n(ru1Var10), null, null, new oa1((Object) ru1Var10, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var2, (byte) 8), 3);
                                                }
                                            } else {
                                                ye4.a("DeviceChatHelper", "Not able to open device chat: startChatUIModel == null");
                                                im3.R(e8.n(ru1Var10), null, null, new oa1(ru1Var10, e27Var, hc1Var2, b110), 3);
                                            }
                                        } else {
                                            ye4.a("DeviceChatHelper", "Not able to open device chat: invalid dyngateId " + j4);
                                            im3.R(e8.n(ru1Var10), null, null, new oa1(ru1Var10, e27Var, hc1Var2, b110), 3);
                                        }
                                        break;
                                    case 4:
                                        ns1 ns1Var5 = ns1Var3;
                                        ns1Var5.getClass();
                                        ru1 ru1Var11 = ru1Var5;
                                        d31 d31Var = ru1Var11.f1953o;
                                        RemoteControlApplication remoteControlApplication = d31Var.a;
                                        RemoteControlApplication remoteControlApplication2 = d31Var.a;
                                        ShortcutManager shortcutManager2 = (ShortcutManager) remoteControlApplication.getSystemService(ShortcutManager.class);
                                        if (shortcutManager2 != null && shortcutManager2.isRequestPinShortcutSupported()) {
                                            String strValueOf = String.valueOf(ns1Var5.a);
                                            strValueOf.getClass();
                                            ShortcutManager shortcutManager3 = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                            hc1 hc1Var3 = null;
                                            if (shortcutManager3 == null || (pinnedShortcuts2 = shortcutManager3.getPinnedShortcuts()) == null || pinnedShortcuts2.isEmpty()) {
                                                shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                if (shortcutManager != null && (pinnedShortcuts = shortcutManager.getPinnedShortcuts()) != null) {
                                                    size = pinnedShortcuts.size();
                                                }
                                                if (size >= 5) {
                                                    im3.R(e8.n(ru1Var11), null, null, new j0((Object) ru1Var11, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                                } else {
                                                    l97Var = ru1Var11.z;
                                                    do {
                                                        value = l97Var.getValue();
                                                    } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                                }
                                            } else {
                                                Iterator<T> it = pinnedShortcuts2.iterator();
                                                while (it.hasNext()) {
                                                    if (im3.n(((ShortcutInfo) it.next()).getId(), strValueOf)) {
                                                        im3.R(e8.n(ru1Var11), null, null, new oa1(ru1Var11, c37.a, hc1Var3, b110), 3);
                                                        break;
                                                    }
                                                }
                                                shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                if (shortcutManager != null) {
                                                    size = pinnedShortcuts.size();
                                                }
                                                if (size >= 5) {
                                                    im3.R(e8.n(ru1Var11), null, null, new j0((Object) ru1Var11, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                                } else {
                                                    l97Var = ru1Var11.z;
                                                    do {
                                                        value = l97Var.getValue();
                                                    } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                                }
                                            }
                                        }
                                        break;
                                    case 5:
                                        ru1 ru1Var12 = ru1Var5;
                                        fe1 fe1Var = ru1Var12.x;
                                        ns1Var4.getClass();
                                        long j5 = ns1Var4.a;
                                        l97 l97Var2 = ru1Var12.J;
                                        Long l = (Long) l97Var2.getValue();
                                        if (l == null || l.longValue() != j5) {
                                            ms1 ms1Var = ns1Var4.f;
                                            if (ms1Var != null) {
                                                Long l2 = (Long) l97Var2.getValue();
                                                if (l2 != null) {
                                                    ru1Var12.W0(l2.longValue());
                                                }
                                                l97Var2.l(null, Long.valueOf(j5));
                                                ru1Var12.m1(j5, true);
                                                im3.R(e8.n(ru1Var12), fe1Var, null, new pu1(ms1Var, ru1Var12, j5, null, (byte) 0), 2);
                                                Long l3 = ru1Var12.y;
                                                if (l3 != null) {
                                                    im3.R(e8.n(ru1Var12), fe1Var, null, new qu1(l3.longValue(), ru1Var12, j5, null, (byte) 0), 2);
                                                }
                                            } else {
                                                ye4.c("DeviceInfoScreenViewModel", "no wake capability for " + j5);
                                            }
                                        }
                                        break;
                                    default:
                                        ru1 ru1Var13 = ru1Var5;
                                        ru1Var13.X0();
                                        ns1 ns1Var6 = ns1Var3;
                                        ns1Var6.getClass();
                                        du1 du1VarV0 = ru1.V0(ns1Var6);
                                        ru1Var13.Q.add(du1VarV0);
                                        im3.R(e8.n(ru1Var13), null, null, new tx(ru1Var13, ns1Var6, du1VarV0, null, (byte) 5), 3);
                                        break;
                                }
                                return f88Var2;
                            }
                        };
                        ux2Var2.g0(objK20);
                    }
                    Function0 function110 = (Function0) objK20;
                    zH13 = ux2Var2.h(ru1Var5) | ux2Var2.h(ns1Var3);
                    objK21 = ux2Var2.K();
                    if (zH13) {
                        final byte b18 = 2;
                        objK21 = new Function0() { // from class: o.mt1
                            /* JADX WARN: Code duplicated, block: B:46:0x0138  */
                            /* JADX WARN: Code duplicated, block: B:50:0x0179  */
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                ShortcutManager shortcutManager;
                                l97 l97Var;
                                Object value;
                                List<ShortcutInfo> pinnedShortcuts;
                                List<ShortcutInfo> pinnedShortcuts2;
                                byte b19 = b18;
                                byte size = 0;
                                size = 0;
                                byte b110 = 1;
                                ru1 ru1Var9 = ru1Var5;
                                byte b111 = 9;
                                ns1 ns1Var4 = ns1Var3;
                                hc1 hc1Var2 = null;
                                byte b112 = 2;
                                f88 f88Var2 = f88.a;
                                switch (b19) {
                                    case 0:
                                        ns1Var4.getClass();
                                        im3.R(e8.n(ru1Var9), ru1Var9.x, null, new gu1(ru1Var9, ns1Var4, hc1Var2, b112), 2);
                                        break;
                                    case 1:
                                        ns1Var4.getClass();
                                        im3.R(e8.n(ru1Var9), ru1Var9.x, null, new gu1(ru1Var9, ns1Var4, hc1Var2, b110), 2);
                                        break;
                                    case 2:
                                        ns1Var4.getClass();
                                        im3.R(e8.n(ru1Var9), ru1Var9.x, null, new gu1(ru1Var9, ns1Var4, hc1Var2, size), 2);
                                        break;
                                    case 3:
                                        ns1Var4.getClass();
                                        cr crVar = ru1Var9.p;
                                        xk1 xk1Var = ru1Var9.V;
                                        crVar.getClass();
                                        xk1Var.getClass();
                                        ru1 ru1Var10 = (ru1) xk1Var.n;
                                        long j4 = ns1Var4.a;
                                        BigInteger bigIntegerValueOf = (j4 <= 0 || j4 > 4294967295L) ? null : BigInteger.valueOf(144115188075855872L + j4);
                                        e27 e27Var = e27.a;
                                        if (bigIntegerValueOf != null) {
                                            IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                            if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(bigIntegerValueOf);
                                                if (chatConversationIDRequestPrivateRoomWithEndPoint == null || chatConversationIDRequestPrivateRoomWithEndPoint.Equal(ChatConversationID.getInvalidConversationID())) {
                                                    ye4.a("DeviceChatHelper", "Not able to open device chat: invalid conversationId");
                                                    im3.R(e8.n(ru1Var10), null, null, new oa1(ru1Var10, e27Var, hc1Var2, b111), 3);
                                                } else {
                                                    im3.R(e8.n(ru1Var10), null, null, new oa1((Object) ru1Var10, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var2, (byte) 8), 3);
                                                }
                                            } else {
                                                ye4.a("DeviceChatHelper", "Not able to open device chat: startChatUIModel == null");
                                                im3.R(e8.n(ru1Var10), null, null, new oa1(ru1Var10, e27Var, hc1Var2, b111), 3);
                                            }
                                        } else {
                                            ye4.a("DeviceChatHelper", "Not able to open device chat: invalid dyngateId " + j4);
                                            im3.R(e8.n(ru1Var10), null, null, new oa1(ru1Var10, e27Var, hc1Var2, b111), 3);
                                        }
                                        break;
                                    case 4:
                                        ns1 ns1Var5 = ns1Var3;
                                        ns1Var5.getClass();
                                        ru1 ru1Var11 = ru1Var5;
                                        d31 d31Var = ru1Var11.f1953o;
                                        RemoteControlApplication remoteControlApplication = d31Var.a;
                                        RemoteControlApplication remoteControlApplication2 = d31Var.a;
                                        ShortcutManager shortcutManager2 = (ShortcutManager) remoteControlApplication.getSystemService(ShortcutManager.class);
                                        if (shortcutManager2 != null && shortcutManager2.isRequestPinShortcutSupported()) {
                                            String strValueOf = String.valueOf(ns1Var5.a);
                                            strValueOf.getClass();
                                            ShortcutManager shortcutManager3 = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                            hc1 hc1Var3 = null;
                                            if (shortcutManager3 == null || (pinnedShortcuts2 = shortcutManager3.getPinnedShortcuts()) == null || pinnedShortcuts2.isEmpty()) {
                                                shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                if (shortcutManager != null && (pinnedShortcuts = shortcutManager.getPinnedShortcuts()) != null) {
                                                    size = pinnedShortcuts.size();
                                                }
                                                if (size >= 5) {
                                                    im3.R(e8.n(ru1Var11), null, null, new j0((Object) ru1Var11, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                                } else {
                                                    l97Var = ru1Var11.z;
                                                    do {
                                                        value = l97Var.getValue();
                                                    } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                                }
                                            } else {
                                                Iterator<T> it = pinnedShortcuts2.iterator();
                                                while (it.hasNext()) {
                                                    if (im3.n(((ShortcutInfo) it.next()).getId(), strValueOf)) {
                                                        im3.R(e8.n(ru1Var11), null, null, new oa1(ru1Var11, c37.a, hc1Var3, b111), 3);
                                                        break;
                                                    }
                                                }
                                                shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                if (shortcutManager != null) {
                                                    size = pinnedShortcuts.size();
                                                }
                                                if (size >= 5) {
                                                    im3.R(e8.n(ru1Var11), null, null, new j0((Object) ru1Var11, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                                } else {
                                                    l97Var = ru1Var11.z;
                                                    do {
                                                        value = l97Var.getValue();
                                                    } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                                }
                                            }
                                        }
                                        break;
                                    case 5:
                                        ru1 ru1Var12 = ru1Var5;
                                        fe1 fe1Var = ru1Var12.x;
                                        ns1Var4.getClass();
                                        long j5 = ns1Var4.a;
                                        l97 l97Var2 = ru1Var12.J;
                                        Long l = (Long) l97Var2.getValue();
                                        if (l == null || l.longValue() != j5) {
                                            ms1 ms1Var = ns1Var4.f;
                                            if (ms1Var != null) {
                                                Long l2 = (Long) l97Var2.getValue();
                                                if (l2 != null) {
                                                    ru1Var12.W0(l2.longValue());
                                                }
                                                l97Var2.l(null, Long.valueOf(j5));
                                                ru1Var12.m1(j5, true);
                                                im3.R(e8.n(ru1Var12), fe1Var, null, new pu1(ms1Var, ru1Var12, j5, null, (byte) 0), 2);
                                                Long l3 = ru1Var12.y;
                                                if (l3 != null) {
                                                    im3.R(e8.n(ru1Var12), fe1Var, null, new qu1(l3.longValue(), ru1Var12, j5, null, (byte) 0), 2);
                                                }
                                            } else {
                                                ye4.c("DeviceInfoScreenViewModel", "no wake capability for " + j5);
                                            }
                                        }
                                        break;
                                    default:
                                        ru1 ru1Var13 = ru1Var5;
                                        ru1Var13.X0();
                                        ns1 ns1Var6 = ns1Var3;
                                        ns1Var6.getClass();
                                        du1 du1VarV0 = ru1.V0(ns1Var6);
                                        ru1Var13.Q.add(du1VarV0);
                                        im3.R(e8.n(ru1Var13), null, null, new tx(ru1Var13, ns1Var6, du1VarV0, null, (byte) 5), 3);
                                        break;
                                }
                                return f88Var2;
                            }
                        };
                        ux2Var2.g0(objK21);
                    } else {
                        final byte b19 = 2;
                        objK21 = new Function0() { // from class: o.mt1
                            /* JADX WARN: Code duplicated, block: B:46:0x0138  */
                            /* JADX WARN: Code duplicated, block: B:50:0x0179  */
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                ShortcutManager shortcutManager;
                                l97 l97Var;
                                Object value;
                                List<ShortcutInfo> pinnedShortcuts;
                                List<ShortcutInfo> pinnedShortcuts2;
                                byte b110 = b19;
                                byte size = 0;
                                size = 0;
                                byte b111 = 1;
                                ru1 ru1Var9 = ru1Var5;
                                byte b112 = 9;
                                ns1 ns1Var4 = ns1Var3;
                                hc1 hc1Var2 = null;
                                byte b113 = 2;
                                f88 f88Var2 = f88.a;
                                switch (b110) {
                                    case 0:
                                        ns1Var4.getClass();
                                        im3.R(e8.n(ru1Var9), ru1Var9.x, null, new gu1(ru1Var9, ns1Var4, hc1Var2, b113), 2);
                                        break;
                                    case 1:
                                        ns1Var4.getClass();
                                        im3.R(e8.n(ru1Var9), ru1Var9.x, null, new gu1(ru1Var9, ns1Var4, hc1Var2, b111), 2);
                                        break;
                                    case 2:
                                        ns1Var4.getClass();
                                        im3.R(e8.n(ru1Var9), ru1Var9.x, null, new gu1(ru1Var9, ns1Var4, hc1Var2, size), 2);
                                        break;
                                    case 3:
                                        ns1Var4.getClass();
                                        cr crVar = ru1Var9.p;
                                        xk1 xk1Var = ru1Var9.V;
                                        crVar.getClass();
                                        xk1Var.getClass();
                                        ru1 ru1Var10 = (ru1) xk1Var.n;
                                        long j4 = ns1Var4.a;
                                        BigInteger bigIntegerValueOf = (j4 <= 0 || j4 > 4294967295L) ? null : BigInteger.valueOf(144115188075855872L + j4);
                                        e27 e27Var = e27.a;
                                        if (bigIntegerValueOf != null) {
                                            IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                            if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(bigIntegerValueOf);
                                                if (chatConversationIDRequestPrivateRoomWithEndPoint == null || chatConversationIDRequestPrivateRoomWithEndPoint.Equal(ChatConversationID.getInvalidConversationID())) {
                                                    ye4.a("DeviceChatHelper", "Not able to open device chat: invalid conversationId");
                                                    im3.R(e8.n(ru1Var10), null, null, new oa1(ru1Var10, e27Var, hc1Var2, b112), 3);
                                                } else {
                                                    im3.R(e8.n(ru1Var10), null, null, new oa1((Object) ru1Var10, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var2, (byte) 8), 3);
                                                }
                                            } else {
                                                ye4.a("DeviceChatHelper", "Not able to open device chat: startChatUIModel == null");
                                                im3.R(e8.n(ru1Var10), null, null, new oa1(ru1Var10, e27Var, hc1Var2, b112), 3);
                                            }
                                        } else {
                                            ye4.a("DeviceChatHelper", "Not able to open device chat: invalid dyngateId " + j4);
                                            im3.R(e8.n(ru1Var10), null, null, new oa1(ru1Var10, e27Var, hc1Var2, b112), 3);
                                        }
                                        break;
                                    case 4:
                                        ns1 ns1Var5 = ns1Var3;
                                        ns1Var5.getClass();
                                        ru1 ru1Var11 = ru1Var5;
                                        d31 d31Var = ru1Var11.f1953o;
                                        RemoteControlApplication remoteControlApplication = d31Var.a;
                                        RemoteControlApplication remoteControlApplication2 = d31Var.a;
                                        ShortcutManager shortcutManager2 = (ShortcutManager) remoteControlApplication.getSystemService(ShortcutManager.class);
                                        if (shortcutManager2 != null && shortcutManager2.isRequestPinShortcutSupported()) {
                                            String strValueOf = String.valueOf(ns1Var5.a);
                                            strValueOf.getClass();
                                            ShortcutManager shortcutManager3 = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                            hc1 hc1Var3 = null;
                                            if (shortcutManager3 == null || (pinnedShortcuts2 = shortcutManager3.getPinnedShortcuts()) == null || pinnedShortcuts2.isEmpty()) {
                                                shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                if (shortcutManager != null && (pinnedShortcuts = shortcutManager.getPinnedShortcuts()) != null) {
                                                    size = pinnedShortcuts.size();
                                                }
                                                if (size >= 5) {
                                                    im3.R(e8.n(ru1Var11), null, null, new j0((Object) ru1Var11, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                                } else {
                                                    l97Var = ru1Var11.z;
                                                    do {
                                                        value = l97Var.getValue();
                                                    } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                                }
                                            } else {
                                                Iterator<T> it = pinnedShortcuts2.iterator();
                                                while (it.hasNext()) {
                                                    if (im3.n(((ShortcutInfo) it.next()).getId(), strValueOf)) {
                                                        im3.R(e8.n(ru1Var11), null, null, new oa1(ru1Var11, c37.a, hc1Var3, b112), 3);
                                                        break;
                                                    }
                                                }
                                                shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                if (shortcutManager != null) {
                                                    size = pinnedShortcuts.size();
                                                }
                                                if (size >= 5) {
                                                    im3.R(e8.n(ru1Var11), null, null, new j0((Object) ru1Var11, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                                } else {
                                                    l97Var = ru1Var11.z;
                                                    do {
                                                        value = l97Var.getValue();
                                                    } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                                }
                                            }
                                        }
                                        break;
                                    case 5:
                                        ru1 ru1Var12 = ru1Var5;
                                        fe1 fe1Var = ru1Var12.x;
                                        ns1Var4.getClass();
                                        long j5 = ns1Var4.a;
                                        l97 l97Var2 = ru1Var12.J;
                                        Long l = (Long) l97Var2.getValue();
                                        if (l == null || l.longValue() != j5) {
                                            ms1 ms1Var = ns1Var4.f;
                                            if (ms1Var != null) {
                                                Long l2 = (Long) l97Var2.getValue();
                                                if (l2 != null) {
                                                    ru1Var12.W0(l2.longValue());
                                                }
                                                l97Var2.l(null, Long.valueOf(j5));
                                                ru1Var12.m1(j5, true);
                                                im3.R(e8.n(ru1Var12), fe1Var, null, new pu1(ms1Var, ru1Var12, j5, null, (byte) 0), 2);
                                                Long l3 = ru1Var12.y;
                                                if (l3 != null) {
                                                    im3.R(e8.n(ru1Var12), fe1Var, null, new qu1(l3.longValue(), ru1Var12, j5, null, (byte) 0), 2);
                                                }
                                            } else {
                                                ye4.c("DeviceInfoScreenViewModel", "no wake capability for " + j5);
                                            }
                                        }
                                        break;
                                    default:
                                        ru1 ru1Var13 = ru1Var5;
                                        ru1Var13.X0();
                                        ns1 ns1Var6 = ns1Var3;
                                        ns1Var6.getClass();
                                        du1 du1VarV0 = ru1.V0(ns1Var6);
                                        ru1Var13.Q.add(du1VarV0);
                                        im3.R(e8.n(ru1Var13), null, null, new tx(ru1Var13, ns1Var6, du1VarV0, null, (byte) 5), 3);
                                        break;
                                }
                                return f88Var2;
                            }
                        };
                        ux2Var2.g0(objK21);
                    }
                    Function0 function111 = (Function0) objK21;
                    zH14 = ux2Var2.h(ru1Var5) | ux2Var2.h(ns1Var3);
                    objK22 = ux2Var2.K();
                    if (zH14) {
                        final byte b20 = 3;
                        objK22 = new Function0() { // from class: o.mt1
                            /* JADX WARN: Code duplicated, block: B:46:0x0138  */
                            /* JADX WARN: Code duplicated, block: B:50:0x0179  */
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                ShortcutManager shortcutManager;
                                l97 l97Var;
                                Object value;
                                List<ShortcutInfo> pinnedShortcuts;
                                List<ShortcutInfo> pinnedShortcuts2;
                                byte b110 = b20;
                                byte size = 0;
                                size = 0;
                                byte b111 = 1;
                                ru1 ru1Var9 = ru1Var5;
                                byte b112 = 9;
                                ns1 ns1Var4 = ns1Var3;
                                hc1 hc1Var2 = null;
                                byte b113 = 2;
                                f88 f88Var2 = f88.a;
                                switch (b110) {
                                    case 0:
                                        ns1Var4.getClass();
                                        im3.R(e8.n(ru1Var9), ru1Var9.x, null, new gu1(ru1Var9, ns1Var4, hc1Var2, b113), 2);
                                        break;
                                    case 1:
                                        ns1Var4.getClass();
                                        im3.R(e8.n(ru1Var9), ru1Var9.x, null, new gu1(ru1Var9, ns1Var4, hc1Var2, b111), 2);
                                        break;
                                    case 2:
                                        ns1Var4.getClass();
                                        im3.R(e8.n(ru1Var9), ru1Var9.x, null, new gu1(ru1Var9, ns1Var4, hc1Var2, size), 2);
                                        break;
                                    case 3:
                                        ns1Var4.getClass();
                                        cr crVar = ru1Var9.p;
                                        xk1 xk1Var = ru1Var9.V;
                                        crVar.getClass();
                                        xk1Var.getClass();
                                        ru1 ru1Var10 = (ru1) xk1Var.n;
                                        long j4 = ns1Var4.a;
                                        BigInteger bigIntegerValueOf = (j4 <= 0 || j4 > 4294967295L) ? null : BigInteger.valueOf(144115188075855872L + j4);
                                        e27 e27Var = e27.a;
                                        if (bigIntegerValueOf != null) {
                                            IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                            if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(bigIntegerValueOf);
                                                if (chatConversationIDRequestPrivateRoomWithEndPoint == null || chatConversationIDRequestPrivateRoomWithEndPoint.Equal(ChatConversationID.getInvalidConversationID())) {
                                                    ye4.a("DeviceChatHelper", "Not able to open device chat: invalid conversationId");
                                                    im3.R(e8.n(ru1Var10), null, null, new oa1(ru1Var10, e27Var, hc1Var2, b112), 3);
                                                } else {
                                                    im3.R(e8.n(ru1Var10), null, null, new oa1((Object) ru1Var10, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var2, (byte) 8), 3);
                                                }
                                            } else {
                                                ye4.a("DeviceChatHelper", "Not able to open device chat: startChatUIModel == null");
                                                im3.R(e8.n(ru1Var10), null, null, new oa1(ru1Var10, e27Var, hc1Var2, b112), 3);
                                            }
                                        } else {
                                            ye4.a("DeviceChatHelper", "Not able to open device chat: invalid dyngateId " + j4);
                                            im3.R(e8.n(ru1Var10), null, null, new oa1(ru1Var10, e27Var, hc1Var2, b112), 3);
                                        }
                                        break;
                                    case 4:
                                        ns1 ns1Var5 = ns1Var3;
                                        ns1Var5.getClass();
                                        ru1 ru1Var11 = ru1Var5;
                                        d31 d31Var = ru1Var11.f1953o;
                                        RemoteControlApplication remoteControlApplication = d31Var.a;
                                        RemoteControlApplication remoteControlApplication2 = d31Var.a;
                                        ShortcutManager shortcutManager2 = (ShortcutManager) remoteControlApplication.getSystemService(ShortcutManager.class);
                                        if (shortcutManager2 != null && shortcutManager2.isRequestPinShortcutSupported()) {
                                            String strValueOf = String.valueOf(ns1Var5.a);
                                            strValueOf.getClass();
                                            ShortcutManager shortcutManager3 = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                            hc1 hc1Var3 = null;
                                            if (shortcutManager3 == null || (pinnedShortcuts2 = shortcutManager3.getPinnedShortcuts()) == null || pinnedShortcuts2.isEmpty()) {
                                                shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                if (shortcutManager != null && (pinnedShortcuts = shortcutManager.getPinnedShortcuts()) != null) {
                                                    size = pinnedShortcuts.size();
                                                }
                                                if (size >= 5) {
                                                    im3.R(e8.n(ru1Var11), null, null, new j0((Object) ru1Var11, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                                } else {
                                                    l97Var = ru1Var11.z;
                                                    do {
                                                        value = l97Var.getValue();
                                                    } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                                }
                                            } else {
                                                Iterator<T> it = pinnedShortcuts2.iterator();
                                                while (it.hasNext()) {
                                                    if (im3.n(((ShortcutInfo) it.next()).getId(), strValueOf)) {
                                                        im3.R(e8.n(ru1Var11), null, null, new oa1(ru1Var11, c37.a, hc1Var3, b112), 3);
                                                        break;
                                                    }
                                                }
                                                shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                if (shortcutManager != null) {
                                                    size = pinnedShortcuts.size();
                                                }
                                                if (size >= 5) {
                                                    im3.R(e8.n(ru1Var11), null, null, new j0((Object) ru1Var11, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                                } else {
                                                    l97Var = ru1Var11.z;
                                                    do {
                                                        value = l97Var.getValue();
                                                    } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                                }
                                            }
                                        }
                                        break;
                                    case 5:
                                        ru1 ru1Var12 = ru1Var5;
                                        fe1 fe1Var = ru1Var12.x;
                                        ns1Var4.getClass();
                                        long j5 = ns1Var4.a;
                                        l97 l97Var2 = ru1Var12.J;
                                        Long l = (Long) l97Var2.getValue();
                                        if (l == null || l.longValue() != j5) {
                                            ms1 ms1Var = ns1Var4.f;
                                            if (ms1Var != null) {
                                                Long l2 = (Long) l97Var2.getValue();
                                                if (l2 != null) {
                                                    ru1Var12.W0(l2.longValue());
                                                }
                                                l97Var2.l(null, Long.valueOf(j5));
                                                ru1Var12.m1(j5, true);
                                                im3.R(e8.n(ru1Var12), fe1Var, null, new pu1(ms1Var, ru1Var12, j5, null, (byte) 0), 2);
                                                Long l3 = ru1Var12.y;
                                                if (l3 != null) {
                                                    im3.R(e8.n(ru1Var12), fe1Var, null, new qu1(l3.longValue(), ru1Var12, j5, null, (byte) 0), 2);
                                                }
                                            } else {
                                                ye4.c("DeviceInfoScreenViewModel", "no wake capability for " + j5);
                                            }
                                        }
                                        break;
                                    default:
                                        ru1 ru1Var13 = ru1Var5;
                                        ru1Var13.X0();
                                        ns1 ns1Var6 = ns1Var3;
                                        ns1Var6.getClass();
                                        du1 du1VarV0 = ru1.V0(ns1Var6);
                                        ru1Var13.Q.add(du1VarV0);
                                        im3.R(e8.n(ru1Var13), null, null, new tx(ru1Var13, ns1Var6, du1VarV0, null, (byte) 5), 3);
                                        break;
                                }
                                return f88Var2;
                            }
                        };
                        ux2Var2.g0(objK22);
                    } else {
                        final byte b21 = 3;
                        objK22 = new Function0() { // from class: o.mt1
                            /* JADX WARN: Code duplicated, block: B:46:0x0138  */
                            /* JADX WARN: Code duplicated, block: B:50:0x0179  */
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                ShortcutManager shortcutManager;
                                l97 l97Var;
                                Object value;
                                List<ShortcutInfo> pinnedShortcuts;
                                List<ShortcutInfo> pinnedShortcuts2;
                                byte b110 = b21;
                                byte size = 0;
                                size = 0;
                                byte b111 = 1;
                                ru1 ru1Var9 = ru1Var5;
                                byte b112 = 9;
                                ns1 ns1Var4 = ns1Var3;
                                hc1 hc1Var2 = null;
                                byte b113 = 2;
                                f88 f88Var2 = f88.a;
                                switch (b110) {
                                    case 0:
                                        ns1Var4.getClass();
                                        im3.R(e8.n(ru1Var9), ru1Var9.x, null, new gu1(ru1Var9, ns1Var4, hc1Var2, b113), 2);
                                        break;
                                    case 1:
                                        ns1Var4.getClass();
                                        im3.R(e8.n(ru1Var9), ru1Var9.x, null, new gu1(ru1Var9, ns1Var4, hc1Var2, b111), 2);
                                        break;
                                    case 2:
                                        ns1Var4.getClass();
                                        im3.R(e8.n(ru1Var9), ru1Var9.x, null, new gu1(ru1Var9, ns1Var4, hc1Var2, size), 2);
                                        break;
                                    case 3:
                                        ns1Var4.getClass();
                                        cr crVar = ru1Var9.p;
                                        xk1 xk1Var = ru1Var9.V;
                                        crVar.getClass();
                                        xk1Var.getClass();
                                        ru1 ru1Var10 = (ru1) xk1Var.n;
                                        long j4 = ns1Var4.a;
                                        BigInteger bigIntegerValueOf = (j4 <= 0 || j4 > 4294967295L) ? null : BigInteger.valueOf(144115188075855872L + j4);
                                        e27 e27Var = e27.a;
                                        if (bigIntegerValueOf != null) {
                                            IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                            if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(bigIntegerValueOf);
                                                if (chatConversationIDRequestPrivateRoomWithEndPoint == null || chatConversationIDRequestPrivateRoomWithEndPoint.Equal(ChatConversationID.getInvalidConversationID())) {
                                                    ye4.a("DeviceChatHelper", "Not able to open device chat: invalid conversationId");
                                                    im3.R(e8.n(ru1Var10), null, null, new oa1(ru1Var10, e27Var, hc1Var2, b112), 3);
                                                } else {
                                                    im3.R(e8.n(ru1Var10), null, null, new oa1((Object) ru1Var10, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var2, (byte) 8), 3);
                                                }
                                            } else {
                                                ye4.a("DeviceChatHelper", "Not able to open device chat: startChatUIModel == null");
                                                im3.R(e8.n(ru1Var10), null, null, new oa1(ru1Var10, e27Var, hc1Var2, b112), 3);
                                            }
                                        } else {
                                            ye4.a("DeviceChatHelper", "Not able to open device chat: invalid dyngateId " + j4);
                                            im3.R(e8.n(ru1Var10), null, null, new oa1(ru1Var10, e27Var, hc1Var2, b112), 3);
                                        }
                                        break;
                                    case 4:
                                        ns1 ns1Var5 = ns1Var3;
                                        ns1Var5.getClass();
                                        ru1 ru1Var11 = ru1Var5;
                                        d31 d31Var = ru1Var11.f1953o;
                                        RemoteControlApplication remoteControlApplication = d31Var.a;
                                        RemoteControlApplication remoteControlApplication2 = d31Var.a;
                                        ShortcutManager shortcutManager2 = (ShortcutManager) remoteControlApplication.getSystemService(ShortcutManager.class);
                                        if (shortcutManager2 != null && shortcutManager2.isRequestPinShortcutSupported()) {
                                            String strValueOf = String.valueOf(ns1Var5.a);
                                            strValueOf.getClass();
                                            ShortcutManager shortcutManager3 = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                            hc1 hc1Var3 = null;
                                            if (shortcutManager3 == null || (pinnedShortcuts2 = shortcutManager3.getPinnedShortcuts()) == null || pinnedShortcuts2.isEmpty()) {
                                                shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                if (shortcutManager != null && (pinnedShortcuts = shortcutManager.getPinnedShortcuts()) != null) {
                                                    size = pinnedShortcuts.size();
                                                }
                                                if (size >= 5) {
                                                    im3.R(e8.n(ru1Var11), null, null, new j0((Object) ru1Var11, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                                } else {
                                                    l97Var = ru1Var11.z;
                                                    do {
                                                        value = l97Var.getValue();
                                                    } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                                }
                                            } else {
                                                Iterator<T> it = pinnedShortcuts2.iterator();
                                                while (it.hasNext()) {
                                                    if (im3.n(((ShortcutInfo) it.next()).getId(), strValueOf)) {
                                                        im3.R(e8.n(ru1Var11), null, null, new oa1(ru1Var11, c37.a, hc1Var3, b112), 3);
                                                        break;
                                                    }
                                                }
                                                shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                if (shortcutManager != null) {
                                                    size = pinnedShortcuts.size();
                                                }
                                                if (size >= 5) {
                                                    im3.R(e8.n(ru1Var11), null, null, new j0((Object) ru1Var11, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                                } else {
                                                    l97Var = ru1Var11.z;
                                                    do {
                                                        value = l97Var.getValue();
                                                    } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                                }
                                            }
                                        }
                                        break;
                                    case 5:
                                        ru1 ru1Var12 = ru1Var5;
                                        fe1 fe1Var = ru1Var12.x;
                                        ns1Var4.getClass();
                                        long j5 = ns1Var4.a;
                                        l97 l97Var2 = ru1Var12.J;
                                        Long l = (Long) l97Var2.getValue();
                                        if (l == null || l.longValue() != j5) {
                                            ms1 ms1Var = ns1Var4.f;
                                            if (ms1Var != null) {
                                                Long l2 = (Long) l97Var2.getValue();
                                                if (l2 != null) {
                                                    ru1Var12.W0(l2.longValue());
                                                }
                                                l97Var2.l(null, Long.valueOf(j5));
                                                ru1Var12.m1(j5, true);
                                                im3.R(e8.n(ru1Var12), fe1Var, null, new pu1(ms1Var, ru1Var12, j5, null, (byte) 0), 2);
                                                Long l3 = ru1Var12.y;
                                                if (l3 != null) {
                                                    im3.R(e8.n(ru1Var12), fe1Var, null, new qu1(l3.longValue(), ru1Var12, j5, null, (byte) 0), 2);
                                                }
                                            } else {
                                                ye4.c("DeviceInfoScreenViewModel", "no wake capability for " + j5);
                                            }
                                        }
                                        break;
                                    default:
                                        ru1 ru1Var13 = ru1Var5;
                                        ru1Var13.X0();
                                        ns1 ns1Var6 = ns1Var3;
                                        ns1Var6.getClass();
                                        du1 du1VarV0 = ru1.V0(ns1Var6);
                                        ru1Var13.Q.add(du1VarV0);
                                        im3.R(e8.n(ru1Var13), null, null, new tx(ru1Var13, ns1Var6, du1VarV0, null, (byte) 5), 3);
                                        break;
                                }
                                return f88Var2;
                            }
                        };
                        ux2Var2.g0(objK22);
                    }
                    Function0 function112 = (Function0) objK22;
                    zH15 = ux2Var2.h(ru1Var5) | ux2Var2.h(ns1Var3);
                    objK23 = ux2Var2.K();
                    if (zH15) {
                        final byte b22 = 4;
                        objK23 = new Function0() { // from class: o.mt1
                            /* JADX WARN: Code duplicated, block: B:46:0x0138  */
                            /* JADX WARN: Code duplicated, block: B:50:0x0179  */
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                ShortcutManager shortcutManager;
                                l97 l97Var;
                                Object value;
                                List<ShortcutInfo> pinnedShortcuts;
                                List<ShortcutInfo> pinnedShortcuts2;
                                byte b110 = b22;
                                byte size = 0;
                                size = 0;
                                byte b111 = 1;
                                ru1 ru1Var9 = ru1Var5;
                                byte b112 = 9;
                                ns1 ns1Var4 = ns1Var3;
                                hc1 hc1Var2 = null;
                                byte b113 = 2;
                                f88 f88Var2 = f88.a;
                                switch (b110) {
                                    case 0:
                                        ns1Var4.getClass();
                                        im3.R(e8.n(ru1Var9), ru1Var9.x, null, new gu1(ru1Var9, ns1Var4, hc1Var2, b113), 2);
                                        break;
                                    case 1:
                                        ns1Var4.getClass();
                                        im3.R(e8.n(ru1Var9), ru1Var9.x, null, new gu1(ru1Var9, ns1Var4, hc1Var2, b111), 2);
                                        break;
                                    case 2:
                                        ns1Var4.getClass();
                                        im3.R(e8.n(ru1Var9), ru1Var9.x, null, new gu1(ru1Var9, ns1Var4, hc1Var2, size), 2);
                                        break;
                                    case 3:
                                        ns1Var4.getClass();
                                        cr crVar = ru1Var9.p;
                                        xk1 xk1Var = ru1Var9.V;
                                        crVar.getClass();
                                        xk1Var.getClass();
                                        ru1 ru1Var10 = (ru1) xk1Var.n;
                                        long j4 = ns1Var4.a;
                                        BigInteger bigIntegerValueOf = (j4 <= 0 || j4 > 4294967295L) ? null : BigInteger.valueOf(144115188075855872L + j4);
                                        e27 e27Var = e27.a;
                                        if (bigIntegerValueOf != null) {
                                            IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                            if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(bigIntegerValueOf);
                                                if (chatConversationIDRequestPrivateRoomWithEndPoint == null || chatConversationIDRequestPrivateRoomWithEndPoint.Equal(ChatConversationID.getInvalidConversationID())) {
                                                    ye4.a("DeviceChatHelper", "Not able to open device chat: invalid conversationId");
                                                    im3.R(e8.n(ru1Var10), null, null, new oa1(ru1Var10, e27Var, hc1Var2, b112), 3);
                                                } else {
                                                    im3.R(e8.n(ru1Var10), null, null, new oa1((Object) ru1Var10, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var2, (byte) 8), 3);
                                                }
                                            } else {
                                                ye4.a("DeviceChatHelper", "Not able to open device chat: startChatUIModel == null");
                                                im3.R(e8.n(ru1Var10), null, null, new oa1(ru1Var10, e27Var, hc1Var2, b112), 3);
                                            }
                                        } else {
                                            ye4.a("DeviceChatHelper", "Not able to open device chat: invalid dyngateId " + j4);
                                            im3.R(e8.n(ru1Var10), null, null, new oa1(ru1Var10, e27Var, hc1Var2, b112), 3);
                                        }
                                        break;
                                    case 4:
                                        ns1 ns1Var5 = ns1Var3;
                                        ns1Var5.getClass();
                                        ru1 ru1Var11 = ru1Var5;
                                        d31 d31Var = ru1Var11.f1953o;
                                        RemoteControlApplication remoteControlApplication = d31Var.a;
                                        RemoteControlApplication remoteControlApplication2 = d31Var.a;
                                        ShortcutManager shortcutManager2 = (ShortcutManager) remoteControlApplication.getSystemService(ShortcutManager.class);
                                        if (shortcutManager2 != null && shortcutManager2.isRequestPinShortcutSupported()) {
                                            String strValueOf = String.valueOf(ns1Var5.a);
                                            strValueOf.getClass();
                                            ShortcutManager shortcutManager3 = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                            hc1 hc1Var3 = null;
                                            if (shortcutManager3 == null || (pinnedShortcuts2 = shortcutManager3.getPinnedShortcuts()) == null || pinnedShortcuts2.isEmpty()) {
                                                shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                if (shortcutManager != null && (pinnedShortcuts = shortcutManager.getPinnedShortcuts()) != null) {
                                                    size = pinnedShortcuts.size();
                                                }
                                                if (size >= 5) {
                                                    im3.R(e8.n(ru1Var11), null, null, new j0((Object) ru1Var11, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                                } else {
                                                    l97Var = ru1Var11.z;
                                                    do {
                                                        value = l97Var.getValue();
                                                    } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                                }
                                            } else {
                                                Iterator<T> it = pinnedShortcuts2.iterator();
                                                while (it.hasNext()) {
                                                    if (im3.n(((ShortcutInfo) it.next()).getId(), strValueOf)) {
                                                        im3.R(e8.n(ru1Var11), null, null, new oa1(ru1Var11, c37.a, hc1Var3, b112), 3);
                                                        break;
                                                    }
                                                }
                                                shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                if (shortcutManager != null) {
                                                    size = pinnedShortcuts.size();
                                                }
                                                if (size >= 5) {
                                                    im3.R(e8.n(ru1Var11), null, null, new j0((Object) ru1Var11, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                                } else {
                                                    l97Var = ru1Var11.z;
                                                    do {
                                                        value = l97Var.getValue();
                                                    } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                                }
                                            }
                                        }
                                        break;
                                    case 5:
                                        ru1 ru1Var12 = ru1Var5;
                                        fe1 fe1Var = ru1Var12.x;
                                        ns1Var4.getClass();
                                        long j5 = ns1Var4.a;
                                        l97 l97Var2 = ru1Var12.J;
                                        Long l = (Long) l97Var2.getValue();
                                        if (l == null || l.longValue() != j5) {
                                            ms1 ms1Var = ns1Var4.f;
                                            if (ms1Var != null) {
                                                Long l2 = (Long) l97Var2.getValue();
                                                if (l2 != null) {
                                                    ru1Var12.W0(l2.longValue());
                                                }
                                                l97Var2.l(null, Long.valueOf(j5));
                                                ru1Var12.m1(j5, true);
                                                im3.R(e8.n(ru1Var12), fe1Var, null, new pu1(ms1Var, ru1Var12, j5, null, (byte) 0), 2);
                                                Long l3 = ru1Var12.y;
                                                if (l3 != null) {
                                                    im3.R(e8.n(ru1Var12), fe1Var, null, new qu1(l3.longValue(), ru1Var12, j5, null, (byte) 0), 2);
                                                }
                                            } else {
                                                ye4.c("DeviceInfoScreenViewModel", "no wake capability for " + j5);
                                            }
                                        }
                                        break;
                                    default:
                                        ru1 ru1Var13 = ru1Var5;
                                        ru1Var13.X0();
                                        ns1 ns1Var6 = ns1Var3;
                                        ns1Var6.getClass();
                                        du1 du1VarV0 = ru1.V0(ns1Var6);
                                        ru1Var13.Q.add(du1VarV0);
                                        im3.R(e8.n(ru1Var13), null, null, new tx(ru1Var13, ns1Var6, du1VarV0, null, (byte) 5), 3);
                                        break;
                                }
                                return f88Var2;
                            }
                        };
                        ux2Var2.g0(objK23);
                    } else {
                        final byte b23 = 4;
                        objK23 = new Function0() { // from class: o.mt1
                            /* JADX WARN: Code duplicated, block: B:46:0x0138  */
                            /* JADX WARN: Code duplicated, block: B:50:0x0179  */
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                ShortcutManager shortcutManager;
                                l97 l97Var;
                                Object value;
                                List<ShortcutInfo> pinnedShortcuts;
                                List<ShortcutInfo> pinnedShortcuts2;
                                byte b110 = b23;
                                byte size = 0;
                                size = 0;
                                byte b111 = 1;
                                ru1 ru1Var9 = ru1Var5;
                                byte b112 = 9;
                                ns1 ns1Var4 = ns1Var3;
                                hc1 hc1Var2 = null;
                                byte b113 = 2;
                                f88 f88Var2 = f88.a;
                                switch (b110) {
                                    case 0:
                                        ns1Var4.getClass();
                                        im3.R(e8.n(ru1Var9), ru1Var9.x, null, new gu1(ru1Var9, ns1Var4, hc1Var2, b113), 2);
                                        break;
                                    case 1:
                                        ns1Var4.getClass();
                                        im3.R(e8.n(ru1Var9), ru1Var9.x, null, new gu1(ru1Var9, ns1Var4, hc1Var2, b111), 2);
                                        break;
                                    case 2:
                                        ns1Var4.getClass();
                                        im3.R(e8.n(ru1Var9), ru1Var9.x, null, new gu1(ru1Var9, ns1Var4, hc1Var2, size), 2);
                                        break;
                                    case 3:
                                        ns1Var4.getClass();
                                        cr crVar = ru1Var9.p;
                                        xk1 xk1Var = ru1Var9.V;
                                        crVar.getClass();
                                        xk1Var.getClass();
                                        ru1 ru1Var10 = (ru1) xk1Var.n;
                                        long j4 = ns1Var4.a;
                                        BigInteger bigIntegerValueOf = (j4 <= 0 || j4 > 4294967295L) ? null : BigInteger.valueOf(144115188075855872L + j4);
                                        e27 e27Var = e27.a;
                                        if (bigIntegerValueOf != null) {
                                            IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                            if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(bigIntegerValueOf);
                                                if (chatConversationIDRequestPrivateRoomWithEndPoint == null || chatConversationIDRequestPrivateRoomWithEndPoint.Equal(ChatConversationID.getInvalidConversationID())) {
                                                    ye4.a("DeviceChatHelper", "Not able to open device chat: invalid conversationId");
                                                    im3.R(e8.n(ru1Var10), null, null, new oa1(ru1Var10, e27Var, hc1Var2, b112), 3);
                                                } else {
                                                    im3.R(e8.n(ru1Var10), null, null, new oa1((Object) ru1Var10, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var2, (byte) 8), 3);
                                                }
                                            } else {
                                                ye4.a("DeviceChatHelper", "Not able to open device chat: startChatUIModel == null");
                                                im3.R(e8.n(ru1Var10), null, null, new oa1(ru1Var10, e27Var, hc1Var2, b112), 3);
                                            }
                                        } else {
                                            ye4.a("DeviceChatHelper", "Not able to open device chat: invalid dyngateId " + j4);
                                            im3.R(e8.n(ru1Var10), null, null, new oa1(ru1Var10, e27Var, hc1Var2, b112), 3);
                                        }
                                        break;
                                    case 4:
                                        ns1 ns1Var5 = ns1Var3;
                                        ns1Var5.getClass();
                                        ru1 ru1Var11 = ru1Var5;
                                        d31 d31Var = ru1Var11.f1953o;
                                        RemoteControlApplication remoteControlApplication = d31Var.a;
                                        RemoteControlApplication remoteControlApplication2 = d31Var.a;
                                        ShortcutManager shortcutManager2 = (ShortcutManager) remoteControlApplication.getSystemService(ShortcutManager.class);
                                        if (shortcutManager2 != null && shortcutManager2.isRequestPinShortcutSupported()) {
                                            String strValueOf = String.valueOf(ns1Var5.a);
                                            strValueOf.getClass();
                                            ShortcutManager shortcutManager3 = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                            hc1 hc1Var3 = null;
                                            if (shortcutManager3 == null || (pinnedShortcuts2 = shortcutManager3.getPinnedShortcuts()) == null || pinnedShortcuts2.isEmpty()) {
                                                shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                if (shortcutManager != null && (pinnedShortcuts = shortcutManager.getPinnedShortcuts()) != null) {
                                                    size = pinnedShortcuts.size();
                                                }
                                                if (size >= 5) {
                                                    im3.R(e8.n(ru1Var11), null, null, new j0((Object) ru1Var11, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                                } else {
                                                    l97Var = ru1Var11.z;
                                                    do {
                                                        value = l97Var.getValue();
                                                    } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                                }
                                            } else {
                                                Iterator<T> it = pinnedShortcuts2.iterator();
                                                while (it.hasNext()) {
                                                    if (im3.n(((ShortcutInfo) it.next()).getId(), strValueOf)) {
                                                        im3.R(e8.n(ru1Var11), null, null, new oa1(ru1Var11, c37.a, hc1Var3, b112), 3);
                                                        break;
                                                    }
                                                }
                                                shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                if (shortcutManager != null) {
                                                    size = pinnedShortcuts.size();
                                                }
                                                if (size >= 5) {
                                                    im3.R(e8.n(ru1Var11), null, null, new j0((Object) ru1Var11, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                                } else {
                                                    l97Var = ru1Var11.z;
                                                    do {
                                                        value = l97Var.getValue();
                                                    } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                                }
                                            }
                                        }
                                        break;
                                    case 5:
                                        ru1 ru1Var12 = ru1Var5;
                                        fe1 fe1Var = ru1Var12.x;
                                        ns1Var4.getClass();
                                        long j5 = ns1Var4.a;
                                        l97 l97Var2 = ru1Var12.J;
                                        Long l = (Long) l97Var2.getValue();
                                        if (l == null || l.longValue() != j5) {
                                            ms1 ms1Var = ns1Var4.f;
                                            if (ms1Var != null) {
                                                Long l2 = (Long) l97Var2.getValue();
                                                if (l2 != null) {
                                                    ru1Var12.W0(l2.longValue());
                                                }
                                                l97Var2.l(null, Long.valueOf(j5));
                                                ru1Var12.m1(j5, true);
                                                im3.R(e8.n(ru1Var12), fe1Var, null, new pu1(ms1Var, ru1Var12, j5, null, (byte) 0), 2);
                                                Long l3 = ru1Var12.y;
                                                if (l3 != null) {
                                                    im3.R(e8.n(ru1Var12), fe1Var, null, new qu1(l3.longValue(), ru1Var12, j5, null, (byte) 0), 2);
                                                }
                                            } else {
                                                ye4.c("DeviceInfoScreenViewModel", "no wake capability for " + j5);
                                            }
                                        }
                                        break;
                                    default:
                                        ru1 ru1Var13 = ru1Var5;
                                        ru1Var13.X0();
                                        ns1 ns1Var6 = ns1Var3;
                                        ns1Var6.getClass();
                                        du1 du1VarV0 = ru1.V0(ns1Var6);
                                        ru1Var13.Q.add(du1VarV0);
                                        im3.R(e8.n(ru1Var13), null, null, new tx(ru1Var13, ns1Var6, du1VarV0, null, (byte) 5), 3);
                                        break;
                                }
                                return f88Var2;
                            }
                        };
                        ux2Var2.g0(objK23);
                    }
                    Function0 function113 = (Function0) objK23;
                    zH16 = ux2Var2.h(ru1Var5);
                    objK24 = ux2Var2.K();
                    if (zH16) {
                        objK24 = new zz0(ru1Var5, (byte) 11);
                        ux2Var2.g0(objK24);
                    } else {
                        objK24 = new zz0(ru1Var5, (byte) 11);
                        ux2Var2.g0(objK24);
                    }
                    Function0 function114 = (Function0) objK24;
                    zH17 = ux2Var2.h(ru1Var5) | ux2Var2.h(ns1Var3);
                    objK25 = ux2Var2.K();
                    if (zH17) {
                        final byte b110 = 5;
                        objK25 = new Function0() { // from class: o.mt1
                            /* JADX WARN: Code duplicated, block: B:46:0x0138  */
                            /* JADX WARN: Code duplicated, block: B:50:0x0179  */
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                ShortcutManager shortcutManager;
                                l97 l97Var;
                                Object value;
                                List<ShortcutInfo> pinnedShortcuts;
                                List<ShortcutInfo> pinnedShortcuts2;
                                byte b111 = b110;
                                byte size = 0;
                                size = 0;
                                byte b112 = 1;
                                ru1 ru1Var9 = ru1Var5;
                                byte b113 = 9;
                                ns1 ns1Var4 = ns1Var3;
                                hc1 hc1Var2 = null;
                                byte b114 = 2;
                                f88 f88Var2 = f88.a;
                                switch (b111) {
                                    case 0:
                                        ns1Var4.getClass();
                                        im3.R(e8.n(ru1Var9), ru1Var9.x, null, new gu1(ru1Var9, ns1Var4, hc1Var2, b114), 2);
                                        break;
                                    case 1:
                                        ns1Var4.getClass();
                                        im3.R(e8.n(ru1Var9), ru1Var9.x, null, new gu1(ru1Var9, ns1Var4, hc1Var2, b112), 2);
                                        break;
                                    case 2:
                                        ns1Var4.getClass();
                                        im3.R(e8.n(ru1Var9), ru1Var9.x, null, new gu1(ru1Var9, ns1Var4, hc1Var2, size), 2);
                                        break;
                                    case 3:
                                        ns1Var4.getClass();
                                        cr crVar = ru1Var9.p;
                                        xk1 xk1Var = ru1Var9.V;
                                        crVar.getClass();
                                        xk1Var.getClass();
                                        ru1 ru1Var10 = (ru1) xk1Var.n;
                                        long j4 = ns1Var4.a;
                                        BigInteger bigIntegerValueOf = (j4 <= 0 || j4 > 4294967295L) ? null : BigInteger.valueOf(144115188075855872L + j4);
                                        e27 e27Var = e27.a;
                                        if (bigIntegerValueOf != null) {
                                            IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                            if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(bigIntegerValueOf);
                                                if (chatConversationIDRequestPrivateRoomWithEndPoint == null || chatConversationIDRequestPrivateRoomWithEndPoint.Equal(ChatConversationID.getInvalidConversationID())) {
                                                    ye4.a("DeviceChatHelper", "Not able to open device chat: invalid conversationId");
                                                    im3.R(e8.n(ru1Var10), null, null, new oa1(ru1Var10, e27Var, hc1Var2, b113), 3);
                                                } else {
                                                    im3.R(e8.n(ru1Var10), null, null, new oa1((Object) ru1Var10, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var2, (byte) 8), 3);
                                                }
                                            } else {
                                                ye4.a("DeviceChatHelper", "Not able to open device chat: startChatUIModel == null");
                                                im3.R(e8.n(ru1Var10), null, null, new oa1(ru1Var10, e27Var, hc1Var2, b113), 3);
                                            }
                                        } else {
                                            ye4.a("DeviceChatHelper", "Not able to open device chat: invalid dyngateId " + j4);
                                            im3.R(e8.n(ru1Var10), null, null, new oa1(ru1Var10, e27Var, hc1Var2, b113), 3);
                                        }
                                        break;
                                    case 4:
                                        ns1 ns1Var5 = ns1Var3;
                                        ns1Var5.getClass();
                                        ru1 ru1Var11 = ru1Var5;
                                        d31 d31Var = ru1Var11.f1953o;
                                        RemoteControlApplication remoteControlApplication = d31Var.a;
                                        RemoteControlApplication remoteControlApplication2 = d31Var.a;
                                        ShortcutManager shortcutManager2 = (ShortcutManager) remoteControlApplication.getSystemService(ShortcutManager.class);
                                        if (shortcutManager2 != null && shortcutManager2.isRequestPinShortcutSupported()) {
                                            String strValueOf = String.valueOf(ns1Var5.a);
                                            strValueOf.getClass();
                                            ShortcutManager shortcutManager3 = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                            hc1 hc1Var3 = null;
                                            if (shortcutManager3 == null || (pinnedShortcuts2 = shortcutManager3.getPinnedShortcuts()) == null || pinnedShortcuts2.isEmpty()) {
                                                shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                if (shortcutManager != null && (pinnedShortcuts = shortcutManager.getPinnedShortcuts()) != null) {
                                                    size = pinnedShortcuts.size();
                                                }
                                                if (size >= 5) {
                                                    im3.R(e8.n(ru1Var11), null, null, new j0((Object) ru1Var11, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                                } else {
                                                    l97Var = ru1Var11.z;
                                                    do {
                                                        value = l97Var.getValue();
                                                    } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                                }
                                            } else {
                                                Iterator<T> it = pinnedShortcuts2.iterator();
                                                while (it.hasNext()) {
                                                    if (im3.n(((ShortcutInfo) it.next()).getId(), strValueOf)) {
                                                        im3.R(e8.n(ru1Var11), null, null, new oa1(ru1Var11, c37.a, hc1Var3, b113), 3);
                                                        break;
                                                    }
                                                }
                                                shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                if (shortcutManager != null) {
                                                    size = pinnedShortcuts.size();
                                                }
                                                if (size >= 5) {
                                                    im3.R(e8.n(ru1Var11), null, null, new j0((Object) ru1Var11, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                                } else {
                                                    l97Var = ru1Var11.z;
                                                    do {
                                                        value = l97Var.getValue();
                                                    } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                                }
                                            }
                                        }
                                        break;
                                    case 5:
                                        ru1 ru1Var12 = ru1Var5;
                                        fe1 fe1Var = ru1Var12.x;
                                        ns1Var4.getClass();
                                        long j5 = ns1Var4.a;
                                        l97 l97Var2 = ru1Var12.J;
                                        Long l = (Long) l97Var2.getValue();
                                        if (l == null || l.longValue() != j5) {
                                            ms1 ms1Var = ns1Var4.f;
                                            if (ms1Var != null) {
                                                Long l2 = (Long) l97Var2.getValue();
                                                if (l2 != null) {
                                                    ru1Var12.W0(l2.longValue());
                                                }
                                                l97Var2.l(null, Long.valueOf(j5));
                                                ru1Var12.m1(j5, true);
                                                im3.R(e8.n(ru1Var12), fe1Var, null, new pu1(ms1Var, ru1Var12, j5, null, (byte) 0), 2);
                                                Long l3 = ru1Var12.y;
                                                if (l3 != null) {
                                                    im3.R(e8.n(ru1Var12), fe1Var, null, new qu1(l3.longValue(), ru1Var12, j5, null, (byte) 0), 2);
                                                }
                                            } else {
                                                ye4.c("DeviceInfoScreenViewModel", "no wake capability for " + j5);
                                            }
                                        }
                                        break;
                                    default:
                                        ru1 ru1Var13 = ru1Var5;
                                        ru1Var13.X0();
                                        ns1 ns1Var6 = ns1Var3;
                                        ns1Var6.getClass();
                                        du1 du1VarV0 = ru1.V0(ns1Var6);
                                        ru1Var13.Q.add(du1VarV0);
                                        im3.R(e8.n(ru1Var13), null, null, new tx(ru1Var13, ns1Var6, du1VarV0, null, (byte) 5), 3);
                                        break;
                                }
                                return f88Var2;
                            }
                        };
                        ux2Var2.g0(objK25);
                    } else {
                        final byte b111 = 5;
                        objK25 = new Function0() { // from class: o.mt1
                            /* JADX WARN: Code duplicated, block: B:46:0x0138  */
                            /* JADX WARN: Code duplicated, block: B:50:0x0179  */
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                ShortcutManager shortcutManager;
                                l97 l97Var;
                                Object value;
                                List<ShortcutInfo> pinnedShortcuts;
                                List<ShortcutInfo> pinnedShortcuts2;
                                byte b112 = b111;
                                byte size = 0;
                                size = 0;
                                byte b113 = 1;
                                ru1 ru1Var9 = ru1Var5;
                                byte b114 = 9;
                                ns1 ns1Var4 = ns1Var3;
                                hc1 hc1Var2 = null;
                                byte b115 = 2;
                                f88 f88Var2 = f88.a;
                                switch (b112) {
                                    case 0:
                                        ns1Var4.getClass();
                                        im3.R(e8.n(ru1Var9), ru1Var9.x, null, new gu1(ru1Var9, ns1Var4, hc1Var2, b115), 2);
                                        break;
                                    case 1:
                                        ns1Var4.getClass();
                                        im3.R(e8.n(ru1Var9), ru1Var9.x, null, new gu1(ru1Var9, ns1Var4, hc1Var2, b113), 2);
                                        break;
                                    case 2:
                                        ns1Var4.getClass();
                                        im3.R(e8.n(ru1Var9), ru1Var9.x, null, new gu1(ru1Var9, ns1Var4, hc1Var2, size), 2);
                                        break;
                                    case 3:
                                        ns1Var4.getClass();
                                        cr crVar = ru1Var9.p;
                                        xk1 xk1Var = ru1Var9.V;
                                        crVar.getClass();
                                        xk1Var.getClass();
                                        ru1 ru1Var10 = (ru1) xk1Var.n;
                                        long j4 = ns1Var4.a;
                                        BigInteger bigIntegerValueOf = (j4 <= 0 || j4 > 4294967295L) ? null : BigInteger.valueOf(144115188075855872L + j4);
                                        e27 e27Var = e27.a;
                                        if (bigIntegerValueOf != null) {
                                            IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                            if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(bigIntegerValueOf);
                                                if (chatConversationIDRequestPrivateRoomWithEndPoint == null || chatConversationIDRequestPrivateRoomWithEndPoint.Equal(ChatConversationID.getInvalidConversationID())) {
                                                    ye4.a("DeviceChatHelper", "Not able to open device chat: invalid conversationId");
                                                    im3.R(e8.n(ru1Var10), null, null, new oa1(ru1Var10, e27Var, hc1Var2, b114), 3);
                                                } else {
                                                    im3.R(e8.n(ru1Var10), null, null, new oa1((Object) ru1Var10, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var2, (byte) 8), 3);
                                                }
                                            } else {
                                                ye4.a("DeviceChatHelper", "Not able to open device chat: startChatUIModel == null");
                                                im3.R(e8.n(ru1Var10), null, null, new oa1(ru1Var10, e27Var, hc1Var2, b114), 3);
                                            }
                                        } else {
                                            ye4.a("DeviceChatHelper", "Not able to open device chat: invalid dyngateId " + j4);
                                            im3.R(e8.n(ru1Var10), null, null, new oa1(ru1Var10, e27Var, hc1Var2, b114), 3);
                                        }
                                        break;
                                    case 4:
                                        ns1 ns1Var5 = ns1Var3;
                                        ns1Var5.getClass();
                                        ru1 ru1Var11 = ru1Var5;
                                        d31 d31Var = ru1Var11.f1953o;
                                        RemoteControlApplication remoteControlApplication = d31Var.a;
                                        RemoteControlApplication remoteControlApplication2 = d31Var.a;
                                        ShortcutManager shortcutManager2 = (ShortcutManager) remoteControlApplication.getSystemService(ShortcutManager.class);
                                        if (shortcutManager2 != null && shortcutManager2.isRequestPinShortcutSupported()) {
                                            String strValueOf = String.valueOf(ns1Var5.a);
                                            strValueOf.getClass();
                                            ShortcutManager shortcutManager3 = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                            hc1 hc1Var3 = null;
                                            if (shortcutManager3 == null || (pinnedShortcuts2 = shortcutManager3.getPinnedShortcuts()) == null || pinnedShortcuts2.isEmpty()) {
                                                shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                if (shortcutManager != null && (pinnedShortcuts = shortcutManager.getPinnedShortcuts()) != null) {
                                                    size = pinnedShortcuts.size();
                                                }
                                                if (size >= 5) {
                                                    im3.R(e8.n(ru1Var11), null, null, new j0((Object) ru1Var11, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                                } else {
                                                    l97Var = ru1Var11.z;
                                                    do {
                                                        value = l97Var.getValue();
                                                    } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                                }
                                            } else {
                                                Iterator<T> it = pinnedShortcuts2.iterator();
                                                while (it.hasNext()) {
                                                    if (im3.n(((ShortcutInfo) it.next()).getId(), strValueOf)) {
                                                        im3.R(e8.n(ru1Var11), null, null, new oa1(ru1Var11, c37.a, hc1Var3, b114), 3);
                                                        break;
                                                    }
                                                }
                                                shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                if (shortcutManager != null) {
                                                    size = pinnedShortcuts.size();
                                                }
                                                if (size >= 5) {
                                                    im3.R(e8.n(ru1Var11), null, null, new j0((Object) ru1Var11, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                                } else {
                                                    l97Var = ru1Var11.z;
                                                    do {
                                                        value = l97Var.getValue();
                                                    } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                                }
                                            }
                                        }
                                        break;
                                    case 5:
                                        ru1 ru1Var12 = ru1Var5;
                                        fe1 fe1Var = ru1Var12.x;
                                        ns1Var4.getClass();
                                        long j5 = ns1Var4.a;
                                        l97 l97Var2 = ru1Var12.J;
                                        Long l = (Long) l97Var2.getValue();
                                        if (l == null || l.longValue() != j5) {
                                            ms1 ms1Var = ns1Var4.f;
                                            if (ms1Var != null) {
                                                Long l2 = (Long) l97Var2.getValue();
                                                if (l2 != null) {
                                                    ru1Var12.W0(l2.longValue());
                                                }
                                                l97Var2.l(null, Long.valueOf(j5));
                                                ru1Var12.m1(j5, true);
                                                im3.R(e8.n(ru1Var12), fe1Var, null, new pu1(ms1Var, ru1Var12, j5, null, (byte) 0), 2);
                                                Long l3 = ru1Var12.y;
                                                if (l3 != null) {
                                                    im3.R(e8.n(ru1Var12), fe1Var, null, new qu1(l3.longValue(), ru1Var12, j5, null, (byte) 0), 2);
                                                }
                                            } else {
                                                ye4.c("DeviceInfoScreenViewModel", "no wake capability for " + j5);
                                            }
                                        }
                                        break;
                                    default:
                                        ru1 ru1Var13 = ru1Var5;
                                        ru1Var13.X0();
                                        ns1 ns1Var6 = ns1Var3;
                                        ns1Var6.getClass();
                                        du1 du1VarV0 = ru1.V0(ns1Var6);
                                        ru1Var13.Q.add(du1VarV0);
                                        im3.R(e8.n(ru1Var13), null, null, new tx(ru1Var13, ns1Var6, du1VarV0, null, (byte) 5), 3);
                                        break;
                                }
                                return f88Var2;
                            }
                        };
                        ux2Var2.g0(objK25);
                    }
                    jt1Var = new jt1(function19, function110, function111, function112, function113, function114, (Function0) objK25);
                    if (z) {
                        ux2Var2.W(956027158);
                        h(z5, r17, au8.O(1055357172, new c91(wt1Var, ru1Var5, list, (byte) 2), ux2Var2), ux2Var2, ((i9 >> 15) & 112) | 384);
                        ux2Var2.p(false);
                        ru1Var7 = ru1Var5;
                        fs4Var2 = fs4Var4;
                    } else {
                        ux2Var2.W(956692790);
                        zH18 = ux2Var2.h(ru1Var5);
                        objK26 = ux2Var2.K();
                        if (zH18) {
                            objK26 = new m9(0, ru1Var5, ru1.class, "dismissMaximumShortcutsReachedDialog", "dismissMaximumShortcutsReachedDialog()V", 0, (byte) 22);
                            ux2Var2.g0(objK26);
                        } else {
                            objK26 = new m9(0, ru1Var5, ru1.class, "dismissMaximumShortcutsReachedDialog", "dismissMaximumShortcutsReachedDialog()V", 0, (byte) 22);
                            ux2Var2.g0(objK26);
                        }
                        pu3 pu3Var4 = (pu3) objK26;
                        zH19 = ux2Var2.h(ru1Var5);
                        objK27 = ux2Var2.K();
                        if (zH19) {
                            objK27 = new m9(0, ru1Var5, ru1.class, "dismissDeleteDeviceDialog", "dismissDeleteDeviceDialog()V", 0, (byte) 23);
                            ux2Var2.g0(objK27);
                        } else {
                            objK27 = new m9(0, ru1Var5, ru1.class, "dismissDeleteDeviceDialog", "dismissDeleteDeviceDialog()V", 0, (byte) 23);
                            ux2Var2.g0(objK27);
                        }
                        pu3 pu3Var5 = (pu3) objK27;
                        zH20 = ux2Var2.h(ru1Var5);
                        objK28 = ux2Var2.K();
                        if (zH20) {
                            ru1 ru1Var9 = ru1Var5;
                            objK28 = new m9(0, ru1Var9, ru1.class, "dismissDeviceUnavailableDialog", "dismissDeviceUnavailableDialog()V", 0, (byte) 24);
                            ru1Var6 = ru1Var9;
                            ux2Var2.g0(objK28);
                        } else {
                            ru1 ru1Var10 = ru1Var5;
                            objK28 = new m9(0, ru1Var10, ru1.class, "dismissDeviceUnavailableDialog", "dismissDeviceUnavailableDialog()V", 0, (byte) 24);
                            ru1Var6 = ru1Var10;
                            ux2Var2.g0(objK28);
                        }
                        pu3 pu3Var6 = (pu3) objK28;
                        Function0 function115 = (Function0) pu3Var4;
                        Function0 function116 = (Function0) pu3Var5;
                        zH21 = ux2Var2.h(ru1Var6) | ux2Var2.h(ns1Var3);
                        objK29 = ux2Var2.K();
                        if (zH21) {
                            final byte b112 = 6;
                            objK29 = new Function0() { // from class: o.mt1
                                /* JADX WARN: Code duplicated, block: B:46:0x0138  */
                                /* JADX WARN: Code duplicated, block: B:50:0x0179  */
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function0
                                public final Object a() {
                                    ShortcutManager shortcutManager;
                                    l97 l97Var;
                                    Object value;
                                    List<ShortcutInfo> pinnedShortcuts;
                                    List<ShortcutInfo> pinnedShortcuts2;
                                    byte b113 = b112;
                                    byte size = 0;
                                    size = 0;
                                    byte b114 = 1;
                                    ru1 ru1Var11 = ru1Var6;
                                    byte b115 = 9;
                                    ns1 ns1Var4 = ns1Var3;
                                    hc1 hc1Var2 = null;
                                    byte b116 = 2;
                                    f88 f88Var2 = f88.a;
                                    switch (b113) {
                                        case 0:
                                            ns1Var4.getClass();
                                            im3.R(e8.n(ru1Var11), ru1Var11.x, null, new gu1(ru1Var11, ns1Var4, hc1Var2, b116), 2);
                                            break;
                                        case 1:
                                            ns1Var4.getClass();
                                            im3.R(e8.n(ru1Var11), ru1Var11.x, null, new gu1(ru1Var11, ns1Var4, hc1Var2, b114), 2);
                                            break;
                                        case 2:
                                            ns1Var4.getClass();
                                            im3.R(e8.n(ru1Var11), ru1Var11.x, null, new gu1(ru1Var11, ns1Var4, hc1Var2, size), 2);
                                            break;
                                        case 3:
                                            ns1Var4.getClass();
                                            cr crVar = ru1Var11.p;
                                            xk1 xk1Var = ru1Var11.V;
                                            crVar.getClass();
                                            xk1Var.getClass();
                                            ru1 ru1Var12 = (ru1) xk1Var.n;
                                            long j4 = ns1Var4.a;
                                            BigInteger bigIntegerValueOf = (j4 <= 0 || j4 > 4294967295L) ? null : BigInteger.valueOf(144115188075855872L + j4);
                                            e27 e27Var = e27.a;
                                            if (bigIntegerValueOf != null) {
                                                IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                    ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(bigIntegerValueOf);
                                                    if (chatConversationIDRequestPrivateRoomWithEndPoint == null || chatConversationIDRequestPrivateRoomWithEndPoint.Equal(ChatConversationID.getInvalidConversationID())) {
                                                        ye4.a("DeviceChatHelper", "Not able to open device chat: invalid conversationId");
                                                        im3.R(e8.n(ru1Var12), null, null, new oa1(ru1Var12, e27Var, hc1Var2, b115), 3);
                                                    } else {
                                                        im3.R(e8.n(ru1Var12), null, null, new oa1((Object) ru1Var12, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var2, (byte) 8), 3);
                                                    }
                                                } else {
                                                    ye4.a("DeviceChatHelper", "Not able to open device chat: startChatUIModel == null");
                                                    im3.R(e8.n(ru1Var12), null, null, new oa1(ru1Var12, e27Var, hc1Var2, b115), 3);
                                                }
                                            } else {
                                                ye4.a("DeviceChatHelper", "Not able to open device chat: invalid dyngateId " + j4);
                                                im3.R(e8.n(ru1Var12), null, null, new oa1(ru1Var12, e27Var, hc1Var2, b115), 3);
                                            }
                                            break;
                                        case 4:
                                            ns1 ns1Var5 = ns1Var3;
                                            ns1Var5.getClass();
                                            ru1 ru1Var13 = ru1Var6;
                                            d31 d31Var = ru1Var13.f1953o;
                                            RemoteControlApplication remoteControlApplication = d31Var.a;
                                            RemoteControlApplication remoteControlApplication2 = d31Var.a;
                                            ShortcutManager shortcutManager2 = (ShortcutManager) remoteControlApplication.getSystemService(ShortcutManager.class);
                                            if (shortcutManager2 != null && shortcutManager2.isRequestPinShortcutSupported()) {
                                                String strValueOf = String.valueOf(ns1Var5.a);
                                                strValueOf.getClass();
                                                ShortcutManager shortcutManager3 = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                hc1 hc1Var3 = null;
                                                if (shortcutManager3 == null || (pinnedShortcuts2 = shortcutManager3.getPinnedShortcuts()) == null || pinnedShortcuts2.isEmpty()) {
                                                    shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                    if (shortcutManager != null && (pinnedShortcuts = shortcutManager.getPinnedShortcuts()) != null) {
                                                        size = pinnedShortcuts.size();
                                                    }
                                                    if (size >= 5) {
                                                        im3.R(e8.n(ru1Var13), null, null, new j0((Object) ru1Var13, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                                    } else {
                                                        l97Var = ru1Var13.z;
                                                        do {
                                                            value = l97Var.getValue();
                                                        } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                                    }
                                                } else {
                                                    Iterator<T> it = pinnedShortcuts2.iterator();
                                                    while (it.hasNext()) {
                                                        if (im3.n(((ShortcutInfo) it.next()).getId(), strValueOf)) {
                                                            im3.R(e8.n(ru1Var13), null, null, new oa1(ru1Var13, c37.a, hc1Var3, b115), 3);
                                                            break;
                                                        }
                                                    }
                                                    shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                    if (shortcutManager != null) {
                                                        size = pinnedShortcuts.size();
                                                    }
                                                    if (size >= 5) {
                                                        im3.R(e8.n(ru1Var13), null, null, new j0((Object) ru1Var13, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                                    } else {
                                                        l97Var = ru1Var13.z;
                                                        do {
                                                            value = l97Var.getValue();
                                                        } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                                    }
                                                }
                                            }
                                            break;
                                        case 5:
                                            ru1 ru1Var14 = ru1Var6;
                                            fe1 fe1Var = ru1Var14.x;
                                            ns1Var4.getClass();
                                            long j5 = ns1Var4.a;
                                            l97 l97Var2 = ru1Var14.J;
                                            Long l = (Long) l97Var2.getValue();
                                            if (l == null || l.longValue() != j5) {
                                                ms1 ms1Var = ns1Var4.f;
                                                if (ms1Var != null) {
                                                    Long l2 = (Long) l97Var2.getValue();
                                                    if (l2 != null) {
                                                        ru1Var14.W0(l2.longValue());
                                                    }
                                                    l97Var2.l(null, Long.valueOf(j5));
                                                    ru1Var14.m1(j5, true);
                                                    im3.R(e8.n(ru1Var14), fe1Var, null, new pu1(ms1Var, ru1Var14, j5, null, (byte) 0), 2);
                                                    Long l3 = ru1Var14.y;
                                                    if (l3 != null) {
                                                        im3.R(e8.n(ru1Var14), fe1Var, null, new qu1(l3.longValue(), ru1Var14, j5, null, (byte) 0), 2);
                                                    }
                                                } else {
                                                    ye4.c("DeviceInfoScreenViewModel", "no wake capability for " + j5);
                                                }
                                            }
                                            break;
                                        default:
                                            ru1 ru1Var15 = ru1Var6;
                                            ru1Var15.X0();
                                            ns1 ns1Var6 = ns1Var3;
                                            ns1Var6.getClass();
                                            du1 du1VarV0 = ru1.V0(ns1Var6);
                                            ru1Var15.Q.add(du1VarV0);
                                            im3.R(e8.n(ru1Var15), null, null, new tx(ru1Var15, ns1Var6, du1VarV0, null, (byte) 5), 3);
                                            break;
                                    }
                                    return f88Var2;
                                }
                            };
                            ux2Var2.g0(objK29);
                        } else {
                            final byte b113 = 6;
                            objK29 = new Function0() { // from class: o.mt1
                                /* JADX WARN: Code duplicated, block: B:46:0x0138  */
                                /* JADX WARN: Code duplicated, block: B:50:0x0179  */
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function0
                                public final Object a() {
                                    ShortcutManager shortcutManager;
                                    l97 l97Var;
                                    Object value;
                                    List<ShortcutInfo> pinnedShortcuts;
                                    List<ShortcutInfo> pinnedShortcuts2;
                                    byte b114 = b113;
                                    byte size = 0;
                                    size = 0;
                                    byte b115 = 1;
                                    ru1 ru1Var11 = ru1Var6;
                                    byte b116 = 9;
                                    ns1 ns1Var4 = ns1Var3;
                                    hc1 hc1Var2 = null;
                                    byte b117 = 2;
                                    f88 f88Var2 = f88.a;
                                    switch (b114) {
                                        case 0:
                                            ns1Var4.getClass();
                                            im3.R(e8.n(ru1Var11), ru1Var11.x, null, new gu1(ru1Var11, ns1Var4, hc1Var2, b117), 2);
                                            break;
                                        case 1:
                                            ns1Var4.getClass();
                                            im3.R(e8.n(ru1Var11), ru1Var11.x, null, new gu1(ru1Var11, ns1Var4, hc1Var2, b115), 2);
                                            break;
                                        case 2:
                                            ns1Var4.getClass();
                                            im3.R(e8.n(ru1Var11), ru1Var11.x, null, new gu1(ru1Var11, ns1Var4, hc1Var2, size), 2);
                                            break;
                                        case 3:
                                            ns1Var4.getClass();
                                            cr crVar = ru1Var11.p;
                                            xk1 xk1Var = ru1Var11.V;
                                            crVar.getClass();
                                            xk1Var.getClass();
                                            ru1 ru1Var12 = (ru1) xk1Var.n;
                                            long j4 = ns1Var4.a;
                                            BigInteger bigIntegerValueOf = (j4 <= 0 || j4 > 4294967295L) ? null : BigInteger.valueOf(144115188075855872L + j4);
                                            e27 e27Var = e27.a;
                                            if (bigIntegerValueOf != null) {
                                                IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                    ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(bigIntegerValueOf);
                                                    if (chatConversationIDRequestPrivateRoomWithEndPoint == null || chatConversationIDRequestPrivateRoomWithEndPoint.Equal(ChatConversationID.getInvalidConversationID())) {
                                                        ye4.a("DeviceChatHelper", "Not able to open device chat: invalid conversationId");
                                                        im3.R(e8.n(ru1Var12), null, null, new oa1(ru1Var12, e27Var, hc1Var2, b116), 3);
                                                    } else {
                                                        im3.R(e8.n(ru1Var12), null, null, new oa1((Object) ru1Var12, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var2, (byte) 8), 3);
                                                    }
                                                } else {
                                                    ye4.a("DeviceChatHelper", "Not able to open device chat: startChatUIModel == null");
                                                    im3.R(e8.n(ru1Var12), null, null, new oa1(ru1Var12, e27Var, hc1Var2, b116), 3);
                                                }
                                            } else {
                                                ye4.a("DeviceChatHelper", "Not able to open device chat: invalid dyngateId " + j4);
                                                im3.R(e8.n(ru1Var12), null, null, new oa1(ru1Var12, e27Var, hc1Var2, b116), 3);
                                            }
                                            break;
                                        case 4:
                                            ns1 ns1Var5 = ns1Var3;
                                            ns1Var5.getClass();
                                            ru1 ru1Var13 = ru1Var6;
                                            d31 d31Var = ru1Var13.f1953o;
                                            RemoteControlApplication remoteControlApplication = d31Var.a;
                                            RemoteControlApplication remoteControlApplication2 = d31Var.a;
                                            ShortcutManager shortcutManager2 = (ShortcutManager) remoteControlApplication.getSystemService(ShortcutManager.class);
                                            if (shortcutManager2 != null && shortcutManager2.isRequestPinShortcutSupported()) {
                                                String strValueOf = String.valueOf(ns1Var5.a);
                                                strValueOf.getClass();
                                                ShortcutManager shortcutManager3 = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                hc1 hc1Var3 = null;
                                                if (shortcutManager3 == null || (pinnedShortcuts2 = shortcutManager3.getPinnedShortcuts()) == null || pinnedShortcuts2.isEmpty()) {
                                                    shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                    if (shortcutManager != null && (pinnedShortcuts = shortcutManager.getPinnedShortcuts()) != null) {
                                                        size = pinnedShortcuts.size();
                                                    }
                                                    if (size >= 5) {
                                                        im3.R(e8.n(ru1Var13), null, null, new j0((Object) ru1Var13, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                                    } else {
                                                        l97Var = ru1Var13.z;
                                                        do {
                                                            value = l97Var.getValue();
                                                        } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                                    }
                                                } else {
                                                    Iterator<T> it = pinnedShortcuts2.iterator();
                                                    while (it.hasNext()) {
                                                        if (im3.n(((ShortcutInfo) it.next()).getId(), strValueOf)) {
                                                            im3.R(e8.n(ru1Var13), null, null, new oa1(ru1Var13, c37.a, hc1Var3, b116), 3);
                                                            break;
                                                        }
                                                    }
                                                    shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                                    if (shortcutManager != null) {
                                                        size = pinnedShortcuts.size();
                                                    }
                                                    if (size >= 5) {
                                                        im3.R(e8.n(ru1Var13), null, null, new j0((Object) ru1Var13, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                                    } else {
                                                        l97Var = ru1Var13.z;
                                                        do {
                                                            value = l97Var.getValue();
                                                        } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                                    }
                                                }
                                            }
                                            break;
                                        case 5:
                                            ru1 ru1Var14 = ru1Var6;
                                            fe1 fe1Var = ru1Var14.x;
                                            ns1Var4.getClass();
                                            long j5 = ns1Var4.a;
                                            l97 l97Var2 = ru1Var14.J;
                                            Long l = (Long) l97Var2.getValue();
                                            if (l == null || l.longValue() != j5) {
                                                ms1 ms1Var = ns1Var4.f;
                                                if (ms1Var != null) {
                                                    Long l2 = (Long) l97Var2.getValue();
                                                    if (l2 != null) {
                                                        ru1Var14.W0(l2.longValue());
                                                    }
                                                    l97Var2.l(null, Long.valueOf(j5));
                                                    ru1Var14.m1(j5, true);
                                                    im3.R(e8.n(ru1Var14), fe1Var, null, new pu1(ms1Var, ru1Var14, j5, null, (byte) 0), 2);
                                                    Long l3 = ru1Var14.y;
                                                    if (l3 != null) {
                                                        im3.R(e8.n(ru1Var14), fe1Var, null, new qu1(l3.longValue(), ru1Var14, j5, null, (byte) 0), 2);
                                                    }
                                                } else {
                                                    ye4.c("DeviceInfoScreenViewModel", "no wake capability for " + j5);
                                                }
                                            }
                                            break;
                                        default:
                                            ru1 ru1Var15 = ru1Var6;
                                            ru1Var15.X0();
                                            ns1 ns1Var6 = ns1Var3;
                                            ns1Var6.getClass();
                                            du1 du1VarV0 = ru1.V0(ns1Var6);
                                            ru1Var15.Q.add(du1VarV0);
                                            im3.R(e8.n(ru1Var15), null, null, new tx(ru1Var15, ns1Var6, du1VarV0, null, (byte) 5), 3);
                                            break;
                                    }
                                    return f88Var2;
                                }
                            };
                            ux2Var2.g0(objK29);
                        }
                        ru1Var7 = ru1Var6;
                        b(wt1Var, ns1Var3, list, r17, jt1Var, function115, function116, (Function0) objK29, (Function0) pu3Var6, ux2Var2, i13 & 8064);
                        fs4Var2 = r17;
                        ux2Var2.p(false);
                    }
                    str2 = str4;
                    ru1Var2 = ru1Var7;
                }
            } else {
                px4Var = px4VarT7;
                px4Var2 = px4VarT2;
                px4Var3 = px4VarT3;
            }
            z3 = false;
            zH = ux2Var2.h(ru1Var3) | ux2Var2.f(px4VarT5) | ux2Var2.f(px4VarT6) | ux2Var2.f(px4VarT4);
            objK = ux2Var2.K();
            awVar = e01.a;
            if (zH) {
                objK = new eb((Object) ru1Var3, (Object) px4VarT5, (Object) px4VarT6, (Object) px4VarT4, (byte) 6);
                px4Var4 = px4VarT6;
                px4Var5 = px4VarT4;
                ux2Var2.g0(objK);
            } else {
                objK = new eb((Object) ru1Var3, (Object) px4VarT5, (Object) px4VarT6, (Object) px4VarT4, (byte) 6);
                px4Var4 = px4VarT6;
                px4Var5 = px4VarT4;
                ux2Var2.g0(objK);
            }
            Function0 function117 = (Function0) objK;
            i7 = i9 & 112;
            px4Var6 = px4Var5;
            if (i7 == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            objK2 = ux2Var2.K();
            if (z4) {
                objK2 = new q71(z);
                ux2Var2.g0(objK2);
            } else {
                objK2 = new q71(z);
                ux2Var2.g0(objK2);
            }
            Function0 function118 = (Function0) objK2;
            zG = ux2Var2.g(z3);
            px4Var7 = px4Var4;
            objK3 = ux2Var2.K();
            if (zG) {
                objK3 = new q71(z3);
                ux2Var2.g0(objK3);
            } else {
                objK3 = new q71(z3);
                ux2Var2.g0(objK3);
            }
            en3VarH = nv1.H(function118, (Function0) objK3, function117, ux2Var2);
            et1.c((i9 >> 3) & 14, ux2Var2, z);
            objK4 = ux2Var2.K();
            if (objK4 == awVar) {
                objK4 = new l5(2, null, (byte) 7);
                ux2Var2.g0(objK4);
            }
            f88Var = f88.a;
            ck3.i(f88Var, (hw2) objK4, ux2Var2);
            zH2 = ux2Var2.h(ru1Var3) | ux2Var2.f(px4VarT);
            objK5 = ux2Var2.K();
            if (zH2) {
                objK5 = new rt1(ru1Var3, px4VarT, null, (byte) 2);
                ux2Var2.g0(objK5);
            } else {
                objK5 = new rt1(ru1Var3, px4VarT, null, (byte) 2);
                ux2Var2.g0(objK5);
            }
            ck3.i(f88Var, (hw2) objK5, ux2Var2);
            boolean z14 = z2;
            zF = ux2Var2.f(ru1Var3) | ux2Var2.e(r19) | ux2Var2.f(uuid) | ux2Var2.f(r17) | ux2Var2.g(z14);
            objK6 = ux2Var2.K();
            if (zF) {
                objK6 = h57.p(Boolean.FALSE);
                ux2Var2.g0(objK6);
            } else {
                objK6 = h57.p(Boolean.FALSE);
                ux2Var2.g0(objK6);
            }
            px4Var8 = (px4) objK6;
            Object[] objArr7 = {ru1Var3, Long.valueOf(r19), uuid, r17, Boolean.valueOf(z14)};
            zH3 = ux2Var2.h(ru1Var3) | ux2Var2.h(ns1Var) | ux2Var2.f(px4Var8);
            objK7 = ux2Var2.K();
            if (zH3) {
                objK7 = new m5((Object) ru1Var3, (Object) ns1Var, (Object) px4Var8, (byte) 14);
                ux2Var2.g0(objK7);
            } else {
                objK7 = new m5((Object) ru1Var3, (Object) ns1Var, (Object) px4Var8, (byte) 14);
                ux2Var2.g0(objK7);
            }
            ck3.f(objArr7, (Function1) objK7, ux2Var2);
            Object[] objArr8 = {ru1Var3, Long.valueOf(j), uuid, num, Boolean.valueOf(z14)};
            zH4 = ux2Var2.h(ru1Var3) | ux2Var2.h(ns1Var);
            objK8 = ux2Var2.K();
            if (zH4) {
                objK8 = new qt1(ru1Var3, ns1Var, null, (byte) 1);
                ux2Var2.g0(objK8);
            } else {
                objK8 = new qt1(ru1Var3, ns1Var, null, (byte) 1);
                ux2Var2.g0(objK8);
            }
            ck3.j(objArr8, (hw2) objK8, ux2Var2);
            if (!((Boolean) px4Var8.getValue()).booleanValue()) {
                j56VarR2 = ux2Var2.r();
                if (j56VarR2 != null) {
                    final byte b114 = 1;
                    final String str8 = str3;
                    final fs4 fs4Var7 = fs4Var3;
                    j56VarR2.d = new hw2() { // from class: o.nt1
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b115 = b114;
                            f88 f88Var2 = f88.a;
                            int i14 = i2;
                            int i15 = i;
                            switch (b115) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iY = yo1.Y(i15 | 1);
                                    int iY2 = yo1.Y(i14);
                                    vt1.a(ns1Var, z, function1, function2, function0, list, fs4Var7, function3, function4, function5, function6, str8, vx6Var, ru1Var3, (ux2) obj, iY, iY2, i3);
                                    break;
                                case 1:
                                    ((Integer) obj2).getClass();
                                    int iY3 = yo1.Y(i15 | 1);
                                    int iY4 = yo1.Y(i14);
                                    vt1.a(ns1Var, z, function1, function2, function0, list, fs4Var7, function3, function4, function5, function6, str8, vx6Var, ru1Var3, (ux2) obj, iY3, iY4, i3);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iY5 = yo1.Y(i15 | 1);
                                    int iY6 = yo1.Y(i14);
                                    vt1.a(ns1Var, z, function1, function2, function0, list, fs4Var7, function3, function4, function5, function6, str8, vx6Var, ru1Var3, (ux2) obj, iY5, iY6, i3);
                                    break;
                            }
                            return f88Var2;
                        }
                    };
                    return;
                }
                return;
            }
            str4 = str3;
            fs4Var4 = fs4Var3;
            ns1Var2 = wt1Var.b;
            z5 = wt1Var.a;
            if (ns1Var2 == null) {
                j56VarR = ux2Var2.r();
                if (j56VarR != null) {
                    final byte b115 = 2;
                    j56VarR.d = new hw2() { // from class: o.nt1
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b116 = b115;
                            f88 f88Var2 = f88.a;
                            int i14 = i2;
                            int i15 = i;
                            switch (b116) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iY = yo1.Y(i15 | 1);
                                    int iY2 = yo1.Y(i14);
                                    vt1.a(ns1Var, z, function1, function2, function0, list, fs4Var4, function3, function4, function5, function6, str4, vx6Var, ru1Var3, (ux2) obj, iY, iY2, i3);
                                    break;
                                case 1:
                                    ((Integer) obj2).getClass();
                                    int iY3 = yo1.Y(i15 | 1);
                                    int iY4 = yo1.Y(i14);
                                    vt1.a(ns1Var, z, function1, function2, function0, list, fs4Var4, function3, function4, function5, function6, str4, vx6Var, ru1Var3, (ux2) obj, iY3, iY4, i3);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iY5 = yo1.Y(i15 | 1);
                                    int iY6 = yo1.Y(i14);
                                    vt1.a(ns1Var, z, function1, function2, function0, list, fs4Var4, function3, function4, function5, function6, str4, vx6Var, ru1Var3, (ux2) obj, iY5, iY6, i3);
                                    break;
                            }
                            return f88Var2;
                        }
                    };
                    return;
                }
                return;
            }
            ru1Var4 = ru1Var3;
            long j4 = ns1Var2.a;
            Object[] objArr9 = {Long.valueOf(j4), ns1Var2.d, Boolean.valueOf(ns1Var2.l), Boolean.valueOf(z)};
            if (i7 == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            zH5 = z6 | ux2Var2.h(ru1Var4);
            objK9 = ux2Var2.K();
            if (zH5) {
                objK9 = new pt1(z, ru1Var4, (hc1) null);
                ux2Var2.g0(objK9);
            } else {
                objK9 = new pt1(z, ru1Var4, (hc1) null);
                ux2Var2.g0(objK9);
            }
            ck3.j(objArr9, (hw2) objK9, ux2Var2);
            Boolean boolValueOf7 = Boolean.valueOf(z11);
            z7 = z11;
            zF2 = ux2Var2.f(px4VarT5) | ux2Var2.g(z7);
            objK10 = ux2Var2.K();
            if (zF2) {
                objK10 = new e81(px4VarT5, z7, null, (byte) 2);
                ux2Var2.g0(objK10);
            } else {
                objK10 = new e81(px4VarT5, z7, null, (byte) 2);
                ux2Var2.g0(objK10);
            }
            ck3.i(boolValueOf7, (hw2) objK10, ux2Var2);
            Boolean boolValueOf8 = Boolean.valueOf(z3);
            zF3 = ux2Var2.f(px4Var7) | ux2Var2.g(z3);
            objK11 = ux2Var2.K();
            b2 = 3;
            if (zF3) {
                objK11 = new e81(px4Var7, z3, null, b2);
                ux2Var2.g0(objK11);
            } else {
                objK11 = new e81(px4Var7, z3, null, b2);
                ux2Var2.g0(objK11);
            }
            ck3.i(boolValueOf8, (hw2) objK11, ux2Var2);
            Boolean boolValueOf9 = Boolean.valueOf(z5);
            px4Var9 = px4Var;
            zF4 = ux2Var2.f(px4Var9) | ux2Var2.h(wt1Var);
            objK12 = ux2Var2.K();
            if (zF4) {
                objK12 = new i9(px4Var9, wt1Var, null, (byte) 8);
                ux2Var2.g0(objK12);
            } else {
                objK12 = new i9(px4Var9, wt1Var, null, (byte) 8);
                ux2Var2.g0(objK12);
            }
            ck3.i(boolValueOf9, (hw2) objK12, ux2Var2);
            zF5 = ux2Var2.f(px4VarT5) | ux2Var2.f(px4Var7) | ux2Var2.f(px4Var9);
            objK13 = ux2Var2.K();
            if (zF5) {
                objK13 = new m71(px4VarT5, px4Var7, px4Var9, (byte) 2);
                ux2Var2.g0(objK13);
            } else {
                objK13 = new m71(px4VarT5, px4Var7, px4Var9, (byte) 2);
                ux2Var2.g0(objK13);
            }
            ck3.e(f88Var, (Function1) objK13, ux2Var2);
            Long lValueOf3 = Long.valueOf(j4);
            zH6 = ux2Var2.h(ru1Var4) | ux2Var2.h(ns1Var2);
            objK14 = ux2Var2.K();
            if (zH6) {
                objK14 = new qt1(ru1Var4, ns1Var2, null, (byte) 0);
                ux2Var2.g0(objK14);
            } else {
                objK14 = new qt1(ru1Var4, ns1Var2, null, (byte) 0);
                ux2Var2.g0(objK14);
            }
            ck3.i(lValueOf3, (hw2) objK14, ux2Var2);
            zH7 = ux2Var2.h(ru1Var4);
            objK15 = ux2Var2.K();
            if (zH7) {
                objK15 = new ac(ru1Var4, null, (byte) 4);
                ux2Var2.g0(objK15);
            } else {
                objK15 = new ac(ru1Var4, null, (byte) 4);
                ux2Var2.g0(objK15);
            }
            ck3.i(f88Var, (hw2) objK15, ux2Var2);
            px4Var10 = px4Var2;
            zH8 = ux2Var2.h(ru1Var4) | ux2Var2.f(px4Var10);
            objK16 = ux2Var2.K();
            if (zH8) {
                objK16 = new rt1(ru1Var4, px4Var10, null, (byte) 0);
                ux2Var2.g0(objK16);
            } else {
                objK16 = new rt1(ru1Var4, px4Var10, null, (byte) 0);
                ux2Var2.g0(objK16);
            }
            ck3.i(f88Var, (hw2) objK16, ux2Var2);
            px4Var11 = px4Var3;
            zH9 = ux2Var2.h(ru1Var4) | ux2Var2.f(px4Var11);
            objK17 = ux2Var2.K();
            if (zH9) {
                hc1Var = null;
                objK17 = new rt1(ru1Var4, px4Var11, hc1Var, (byte) 1);
                ux2Var2.g0(objK17);
            } else {
                hc1Var = null;
                objK17 = new rt1(ru1Var4, px4Var11, hc1Var, (byte) 1);
                ux2Var2.g0(objK17);
            }
            ck3.i(f88Var, (hw2) objK17, ux2Var2);
            zH10 = ux2Var2.h(ru1Var4) | ux2Var2.f(px4Var6) | ux2Var2.f(px4VarT);
            objK18 = ux2Var2.K();
            if (zH10) {
                px4Var12 = px4Var6;
                j0 j0Var4 = new j0((Object) ru1Var4, (Object) px4Var12, (Object) px4VarT, hc1Var, (byte) 24);
                ux2Var2.g0(j0Var4);
                objK18 = j0Var4;
            } else {
                px4Var12 = px4Var6;
                j0 j0Var5 = new j0((Object) ru1Var4, (Object) px4Var12, (Object) px4VarT, hc1Var, (byte) 24);
                ux2Var2.g0(j0Var5);
                objK18 = j0Var5;
            }
            ck3.i(f88Var, (hw2) objK18, ux2Var2);
            if ((i12 & 896) != 256) {
                z8 = true;
            } else {
                z8 = true;
            }
            zF6 = z8 | ux2Var2.f(px4Var12) | ux2Var2.h(ru1Var4) | ux2Var2.h(en3VarH);
            Object objK32 = ux2Var2.K();
            if (zF6) {
                px4 px4Var16 = px4Var12;
                ns1Var3 = ns1Var2;
                ru1Var5 = ru1Var4;
                awVar2 = awVar;
                bjVar = new bj(vx6Var, px4Var16, ru1Var5, en3VarH, null, (byte) 7);
                ux2Var2.g0(bjVar);
            } else {
                px4 px4Var17 = px4Var12;
                ns1Var3 = ns1Var2;
                ru1Var5 = ru1Var4;
                awVar2 = awVar;
                bjVar = new bj(vx6Var, px4Var17, ru1Var5, en3VarH, null, (byte) 7);
                ux2Var2.g0(bjVar);
            }
            ck3.i(vx6Var, (hw2) bjVar, ux2Var2);
            zH11 = ux2Var2.h(ru1Var5) | ux2Var2.h(ns1Var3);
            objK19 = ux2Var2.K();
            if (zH11) {
                final byte b116 = 0;
                objK19 = new Function0() { // from class: o.mt1
                    /* JADX WARN: Code duplicated, block: B:46:0x0138  */
                    /* JADX WARN: Code duplicated, block: B:50:0x0179  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        ShortcutManager shortcutManager;
                        l97 l97Var;
                        Object value;
                        List<ShortcutInfo> pinnedShortcuts;
                        List<ShortcutInfo> pinnedShortcuts2;
                        byte b117 = b116;
                        byte size = 0;
                        size = 0;
                        byte b118 = 1;
                        ru1 ru1Var11 = ru1Var5;
                        byte b119 = 9;
                        ns1 ns1Var4 = ns1Var3;
                        hc1 hc1Var2 = null;
                        byte b1110 = 2;
                        f88 f88Var2 = f88.a;
                        switch (b117) {
                            case 0:
                                ns1Var4.getClass();
                                im3.R(e8.n(ru1Var11), ru1Var11.x, null, new gu1(ru1Var11, ns1Var4, hc1Var2, b1110), 2);
                                break;
                            case 1:
                                ns1Var4.getClass();
                                im3.R(e8.n(ru1Var11), ru1Var11.x, null, new gu1(ru1Var11, ns1Var4, hc1Var2, b118), 2);
                                break;
                            case 2:
                                ns1Var4.getClass();
                                im3.R(e8.n(ru1Var11), ru1Var11.x, null, new gu1(ru1Var11, ns1Var4, hc1Var2, size), 2);
                                break;
                            case 3:
                                ns1Var4.getClass();
                                cr crVar = ru1Var11.p;
                                xk1 xk1Var = ru1Var11.V;
                                crVar.getClass();
                                xk1Var.getClass();
                                ru1 ru1Var12 = (ru1) xk1Var.n;
                                long j5 = ns1Var4.a;
                                BigInteger bigIntegerValueOf = (j5 <= 0 || j5 > 4294967295L) ? null : BigInteger.valueOf(144115188075855872L + j5);
                                e27 e27Var = e27.a;
                                if (bigIntegerValueOf != null) {
                                    IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                    if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                        ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(bigIntegerValueOf);
                                        if (chatConversationIDRequestPrivateRoomWithEndPoint == null || chatConversationIDRequestPrivateRoomWithEndPoint.Equal(ChatConversationID.getInvalidConversationID())) {
                                            ye4.a("DeviceChatHelper", "Not able to open device chat: invalid conversationId");
                                            im3.R(e8.n(ru1Var12), null, null, new oa1(ru1Var12, e27Var, hc1Var2, b119), 3);
                                        } else {
                                            im3.R(e8.n(ru1Var12), null, null, new oa1((Object) ru1Var12, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var2, (byte) 8), 3);
                                        }
                                    } else {
                                        ye4.a("DeviceChatHelper", "Not able to open device chat: startChatUIModel == null");
                                        im3.R(e8.n(ru1Var12), null, null, new oa1(ru1Var12, e27Var, hc1Var2, b119), 3);
                                    }
                                } else {
                                    ye4.a("DeviceChatHelper", "Not able to open device chat: invalid dyngateId " + j5);
                                    im3.R(e8.n(ru1Var12), null, null, new oa1(ru1Var12, e27Var, hc1Var2, b119), 3);
                                }
                                break;
                            case 4:
                                ns1 ns1Var5 = ns1Var3;
                                ns1Var5.getClass();
                                ru1 ru1Var13 = ru1Var5;
                                d31 d31Var = ru1Var13.f1953o;
                                RemoteControlApplication remoteControlApplication = d31Var.a;
                                RemoteControlApplication remoteControlApplication2 = d31Var.a;
                                ShortcutManager shortcutManager2 = (ShortcutManager) remoteControlApplication.getSystemService(ShortcutManager.class);
                                if (shortcutManager2 != null && shortcutManager2.isRequestPinShortcutSupported()) {
                                    String strValueOf = String.valueOf(ns1Var5.a);
                                    strValueOf.getClass();
                                    ShortcutManager shortcutManager3 = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                    hc1 hc1Var3 = null;
                                    if (shortcutManager3 == null || (pinnedShortcuts2 = shortcutManager3.getPinnedShortcuts()) == null || pinnedShortcuts2.isEmpty()) {
                                        shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                        if (shortcutManager != null && (pinnedShortcuts = shortcutManager.getPinnedShortcuts()) != null) {
                                            size = pinnedShortcuts.size();
                                        }
                                        if (size >= 5) {
                                            im3.R(e8.n(ru1Var13), null, null, new j0((Object) ru1Var13, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                        } else {
                                            l97Var = ru1Var13.z;
                                            do {
                                                value = l97Var.getValue();
                                            } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                        }
                                    } else {
                                        Iterator<T> it = pinnedShortcuts2.iterator();
                                        while (it.hasNext()) {
                                            if (im3.n(((ShortcutInfo) it.next()).getId(), strValueOf)) {
                                                im3.R(e8.n(ru1Var13), null, null, new oa1(ru1Var13, c37.a, hc1Var3, b119), 3);
                                                break;
                                            }
                                        }
                                        shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                        if (shortcutManager != null) {
                                            size = pinnedShortcuts.size();
                                        }
                                        if (size >= 5) {
                                            im3.R(e8.n(ru1Var13), null, null, new j0((Object) ru1Var13, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                        } else {
                                            l97Var = ru1Var13.z;
                                            do {
                                                value = l97Var.getValue();
                                            } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                        }
                                    }
                                }
                                break;
                            case 5:
                                ru1 ru1Var14 = ru1Var5;
                                fe1 fe1Var = ru1Var14.x;
                                ns1Var4.getClass();
                                long j6 = ns1Var4.a;
                                l97 l97Var2 = ru1Var14.J;
                                Long l = (Long) l97Var2.getValue();
                                if (l == null || l.longValue() != j6) {
                                    ms1 ms1Var = ns1Var4.f;
                                    if (ms1Var != null) {
                                        Long l2 = (Long) l97Var2.getValue();
                                        if (l2 != null) {
                                            ru1Var14.W0(l2.longValue());
                                        }
                                        l97Var2.l(null, Long.valueOf(j6));
                                        ru1Var14.m1(j6, true);
                                        im3.R(e8.n(ru1Var14), fe1Var, null, new pu1(ms1Var, ru1Var14, j6, null, (byte) 0), 2);
                                        Long l3 = ru1Var14.y;
                                        if (l3 != null) {
                                            im3.R(e8.n(ru1Var14), fe1Var, null, new qu1(l3.longValue(), ru1Var14, j6, null, (byte) 0), 2);
                                        }
                                    } else {
                                        ye4.c("DeviceInfoScreenViewModel", "no wake capability for " + j6);
                                    }
                                }
                                break;
                            default:
                                ru1 ru1Var15 = ru1Var5;
                                ru1Var15.X0();
                                ns1 ns1Var6 = ns1Var3;
                                ns1Var6.getClass();
                                du1 du1VarV0 = ru1.V0(ns1Var6);
                                ru1Var15.Q.add(du1VarV0);
                                im3.R(e8.n(ru1Var15), null, null, new tx(ru1Var15, ns1Var6, du1VarV0, null, (byte) 5), 3);
                                break;
                        }
                        return f88Var2;
                    }
                };
                ux2Var2.g0(objK19);
            } else {
                final byte b117 = 0;
                objK19 = new Function0() { // from class: o.mt1
                    /* JADX WARN: Code duplicated, block: B:46:0x0138  */
                    /* JADX WARN: Code duplicated, block: B:50:0x0179  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        ShortcutManager shortcutManager;
                        l97 l97Var;
                        Object value;
                        List<ShortcutInfo> pinnedShortcuts;
                        List<ShortcutInfo> pinnedShortcuts2;
                        byte b118 = b117;
                        byte size = 0;
                        size = 0;
                        byte b119 = 1;
                        ru1 ru1Var11 = ru1Var5;
                        byte b1110 = 9;
                        ns1 ns1Var4 = ns1Var3;
                        hc1 hc1Var2 = null;
                        byte b1111 = 2;
                        f88 f88Var2 = f88.a;
                        switch (b118) {
                            case 0:
                                ns1Var4.getClass();
                                im3.R(e8.n(ru1Var11), ru1Var11.x, null, new gu1(ru1Var11, ns1Var4, hc1Var2, b1111), 2);
                                break;
                            case 1:
                                ns1Var4.getClass();
                                im3.R(e8.n(ru1Var11), ru1Var11.x, null, new gu1(ru1Var11, ns1Var4, hc1Var2, b119), 2);
                                break;
                            case 2:
                                ns1Var4.getClass();
                                im3.R(e8.n(ru1Var11), ru1Var11.x, null, new gu1(ru1Var11, ns1Var4, hc1Var2, size), 2);
                                break;
                            case 3:
                                ns1Var4.getClass();
                                cr crVar = ru1Var11.p;
                                xk1 xk1Var = ru1Var11.V;
                                crVar.getClass();
                                xk1Var.getClass();
                                ru1 ru1Var12 = (ru1) xk1Var.n;
                                long j5 = ns1Var4.a;
                                BigInteger bigIntegerValueOf = (j5 <= 0 || j5 > 4294967295L) ? null : BigInteger.valueOf(144115188075855872L + j5);
                                e27 e27Var = e27.a;
                                if (bigIntegerValueOf != null) {
                                    IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                    if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                        ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(bigIntegerValueOf);
                                        if (chatConversationIDRequestPrivateRoomWithEndPoint == null || chatConversationIDRequestPrivateRoomWithEndPoint.Equal(ChatConversationID.getInvalidConversationID())) {
                                            ye4.a("DeviceChatHelper", "Not able to open device chat: invalid conversationId");
                                            im3.R(e8.n(ru1Var12), null, null, new oa1(ru1Var12, e27Var, hc1Var2, b1110), 3);
                                        } else {
                                            im3.R(e8.n(ru1Var12), null, null, new oa1((Object) ru1Var12, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var2, (byte) 8), 3);
                                        }
                                    } else {
                                        ye4.a("DeviceChatHelper", "Not able to open device chat: startChatUIModel == null");
                                        im3.R(e8.n(ru1Var12), null, null, new oa1(ru1Var12, e27Var, hc1Var2, b1110), 3);
                                    }
                                } else {
                                    ye4.a("DeviceChatHelper", "Not able to open device chat: invalid dyngateId " + j5);
                                    im3.R(e8.n(ru1Var12), null, null, new oa1(ru1Var12, e27Var, hc1Var2, b1110), 3);
                                }
                                break;
                            case 4:
                                ns1 ns1Var5 = ns1Var3;
                                ns1Var5.getClass();
                                ru1 ru1Var13 = ru1Var5;
                                d31 d31Var = ru1Var13.f1953o;
                                RemoteControlApplication remoteControlApplication = d31Var.a;
                                RemoteControlApplication remoteControlApplication2 = d31Var.a;
                                ShortcutManager shortcutManager2 = (ShortcutManager) remoteControlApplication.getSystemService(ShortcutManager.class);
                                if (shortcutManager2 != null && shortcutManager2.isRequestPinShortcutSupported()) {
                                    String strValueOf = String.valueOf(ns1Var5.a);
                                    strValueOf.getClass();
                                    ShortcutManager shortcutManager3 = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                    hc1 hc1Var3 = null;
                                    if (shortcutManager3 == null || (pinnedShortcuts2 = shortcutManager3.getPinnedShortcuts()) == null || pinnedShortcuts2.isEmpty()) {
                                        shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                        if (shortcutManager != null && (pinnedShortcuts = shortcutManager.getPinnedShortcuts()) != null) {
                                            size = pinnedShortcuts.size();
                                        }
                                        if (size >= 5) {
                                            im3.R(e8.n(ru1Var13), null, null, new j0((Object) ru1Var13, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                        } else {
                                            l97Var = ru1Var13.z;
                                            do {
                                                value = l97Var.getValue();
                                            } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                        }
                                    } else {
                                        Iterator<T> it = pinnedShortcuts2.iterator();
                                        while (it.hasNext()) {
                                            if (im3.n(((ShortcutInfo) it.next()).getId(), strValueOf)) {
                                                im3.R(e8.n(ru1Var13), null, null, new oa1(ru1Var13, c37.a, hc1Var3, b1110), 3);
                                                break;
                                            }
                                        }
                                        shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                        if (shortcutManager != null) {
                                            size = pinnedShortcuts.size();
                                        }
                                        if (size >= 5) {
                                            im3.R(e8.n(ru1Var13), null, null, new j0((Object) ru1Var13, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                        } else {
                                            l97Var = ru1Var13.z;
                                            do {
                                                value = l97Var.getValue();
                                            } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                        }
                                    }
                                }
                                break;
                            case 5:
                                ru1 ru1Var14 = ru1Var5;
                                fe1 fe1Var = ru1Var14.x;
                                ns1Var4.getClass();
                                long j6 = ns1Var4.a;
                                l97 l97Var2 = ru1Var14.J;
                                Long l = (Long) l97Var2.getValue();
                                if (l == null || l.longValue() != j6) {
                                    ms1 ms1Var = ns1Var4.f;
                                    if (ms1Var != null) {
                                        Long l2 = (Long) l97Var2.getValue();
                                        if (l2 != null) {
                                            ru1Var14.W0(l2.longValue());
                                        }
                                        l97Var2.l(null, Long.valueOf(j6));
                                        ru1Var14.m1(j6, true);
                                        im3.R(e8.n(ru1Var14), fe1Var, null, new pu1(ms1Var, ru1Var14, j6, null, (byte) 0), 2);
                                        Long l3 = ru1Var14.y;
                                        if (l3 != null) {
                                            im3.R(e8.n(ru1Var14), fe1Var, null, new qu1(l3.longValue(), ru1Var14, j6, null, (byte) 0), 2);
                                        }
                                    } else {
                                        ye4.c("DeviceInfoScreenViewModel", "no wake capability for " + j6);
                                    }
                                }
                                break;
                            default:
                                ru1 ru1Var15 = ru1Var5;
                                ru1Var15.X0();
                                ns1 ns1Var6 = ns1Var3;
                                ns1Var6.getClass();
                                du1 du1VarV0 = ru1.V0(ns1Var6);
                                ru1Var15.Q.add(du1VarV0);
                                im3.R(e8.n(ru1Var15), null, null, new tx(ru1Var15, ns1Var6, du1VarV0, null, (byte) 5), 3);
                                break;
                        }
                        return f88Var2;
                    }
                };
                ux2Var2.g0(objK19);
            }
            Function0 function119 = (Function0) objK19;
            zH12 = ux2Var2.h(ru1Var5) | ux2Var2.h(ns1Var3);
            objK20 = ux2Var2.K();
            if (zH12) {
                final byte b118 = 1;
                objK20 = new Function0() { // from class: o.mt1
                    /* JADX WARN: Code duplicated, block: B:46:0x0138  */
                    /* JADX WARN: Code duplicated, block: B:50:0x0179  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        ShortcutManager shortcutManager;
                        l97 l97Var;
                        Object value;
                        List<ShortcutInfo> pinnedShortcuts;
                        List<ShortcutInfo> pinnedShortcuts2;
                        byte b119 = b118;
                        byte size = 0;
                        size = 0;
                        byte b1110 = 1;
                        ru1 ru1Var11 = ru1Var5;
                        byte b1111 = 9;
                        ns1 ns1Var4 = ns1Var3;
                        hc1 hc1Var2 = null;
                        byte b1112 = 2;
                        f88 f88Var2 = f88.a;
                        switch (b119) {
                            case 0:
                                ns1Var4.getClass();
                                im3.R(e8.n(ru1Var11), ru1Var11.x, null, new gu1(ru1Var11, ns1Var4, hc1Var2, b1112), 2);
                                break;
                            case 1:
                                ns1Var4.getClass();
                                im3.R(e8.n(ru1Var11), ru1Var11.x, null, new gu1(ru1Var11, ns1Var4, hc1Var2, b1110), 2);
                                break;
                            case 2:
                                ns1Var4.getClass();
                                im3.R(e8.n(ru1Var11), ru1Var11.x, null, new gu1(ru1Var11, ns1Var4, hc1Var2, size), 2);
                                break;
                            case 3:
                                ns1Var4.getClass();
                                cr crVar = ru1Var11.p;
                                xk1 xk1Var = ru1Var11.V;
                                crVar.getClass();
                                xk1Var.getClass();
                                ru1 ru1Var12 = (ru1) xk1Var.n;
                                long j5 = ns1Var4.a;
                                BigInteger bigIntegerValueOf = (j5 <= 0 || j5 > 4294967295L) ? null : BigInteger.valueOf(144115188075855872L + j5);
                                e27 e27Var = e27.a;
                                if (bigIntegerValueOf != null) {
                                    IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                    if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                        ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(bigIntegerValueOf);
                                        if (chatConversationIDRequestPrivateRoomWithEndPoint == null || chatConversationIDRequestPrivateRoomWithEndPoint.Equal(ChatConversationID.getInvalidConversationID())) {
                                            ye4.a("DeviceChatHelper", "Not able to open device chat: invalid conversationId");
                                            im3.R(e8.n(ru1Var12), null, null, new oa1(ru1Var12, e27Var, hc1Var2, b1111), 3);
                                        } else {
                                            im3.R(e8.n(ru1Var12), null, null, new oa1((Object) ru1Var12, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var2, (byte) 8), 3);
                                        }
                                    } else {
                                        ye4.a("DeviceChatHelper", "Not able to open device chat: startChatUIModel == null");
                                        im3.R(e8.n(ru1Var12), null, null, new oa1(ru1Var12, e27Var, hc1Var2, b1111), 3);
                                    }
                                } else {
                                    ye4.a("DeviceChatHelper", "Not able to open device chat: invalid dyngateId " + j5);
                                    im3.R(e8.n(ru1Var12), null, null, new oa1(ru1Var12, e27Var, hc1Var2, b1111), 3);
                                }
                                break;
                            case 4:
                                ns1 ns1Var5 = ns1Var3;
                                ns1Var5.getClass();
                                ru1 ru1Var13 = ru1Var5;
                                d31 d31Var = ru1Var13.f1953o;
                                RemoteControlApplication remoteControlApplication = d31Var.a;
                                RemoteControlApplication remoteControlApplication2 = d31Var.a;
                                ShortcutManager shortcutManager2 = (ShortcutManager) remoteControlApplication.getSystemService(ShortcutManager.class);
                                if (shortcutManager2 != null && shortcutManager2.isRequestPinShortcutSupported()) {
                                    String strValueOf = String.valueOf(ns1Var5.a);
                                    strValueOf.getClass();
                                    ShortcutManager shortcutManager3 = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                    hc1 hc1Var3 = null;
                                    if (shortcutManager3 == null || (pinnedShortcuts2 = shortcutManager3.getPinnedShortcuts()) == null || pinnedShortcuts2.isEmpty()) {
                                        shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                        if (shortcutManager != null && (pinnedShortcuts = shortcutManager.getPinnedShortcuts()) != null) {
                                            size = pinnedShortcuts.size();
                                        }
                                        if (size >= 5) {
                                            im3.R(e8.n(ru1Var13), null, null, new j0((Object) ru1Var13, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                        } else {
                                            l97Var = ru1Var13.z;
                                            do {
                                                value = l97Var.getValue();
                                            } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                        }
                                    } else {
                                        Iterator<T> it = pinnedShortcuts2.iterator();
                                        while (it.hasNext()) {
                                            if (im3.n(((ShortcutInfo) it.next()).getId(), strValueOf)) {
                                                im3.R(e8.n(ru1Var13), null, null, new oa1(ru1Var13, c37.a, hc1Var3, b1111), 3);
                                                break;
                                            }
                                        }
                                        shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                        if (shortcutManager != null) {
                                            size = pinnedShortcuts.size();
                                        }
                                        if (size >= 5) {
                                            im3.R(e8.n(ru1Var13), null, null, new j0((Object) ru1Var13, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                        } else {
                                            l97Var = ru1Var13.z;
                                            do {
                                                value = l97Var.getValue();
                                            } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                        }
                                    }
                                }
                                break;
                            case 5:
                                ru1 ru1Var14 = ru1Var5;
                                fe1 fe1Var = ru1Var14.x;
                                ns1Var4.getClass();
                                long j6 = ns1Var4.a;
                                l97 l97Var2 = ru1Var14.J;
                                Long l = (Long) l97Var2.getValue();
                                if (l == null || l.longValue() != j6) {
                                    ms1 ms1Var = ns1Var4.f;
                                    if (ms1Var != null) {
                                        Long l2 = (Long) l97Var2.getValue();
                                        if (l2 != null) {
                                            ru1Var14.W0(l2.longValue());
                                        }
                                        l97Var2.l(null, Long.valueOf(j6));
                                        ru1Var14.m1(j6, true);
                                        im3.R(e8.n(ru1Var14), fe1Var, null, new pu1(ms1Var, ru1Var14, j6, null, (byte) 0), 2);
                                        Long l3 = ru1Var14.y;
                                        if (l3 != null) {
                                            im3.R(e8.n(ru1Var14), fe1Var, null, new qu1(l3.longValue(), ru1Var14, j6, null, (byte) 0), 2);
                                        }
                                    } else {
                                        ye4.c("DeviceInfoScreenViewModel", "no wake capability for " + j6);
                                    }
                                }
                                break;
                            default:
                                ru1 ru1Var15 = ru1Var5;
                                ru1Var15.X0();
                                ns1 ns1Var6 = ns1Var3;
                                ns1Var6.getClass();
                                du1 du1VarV0 = ru1.V0(ns1Var6);
                                ru1Var15.Q.add(du1VarV0);
                                im3.R(e8.n(ru1Var15), null, null, new tx(ru1Var15, ns1Var6, du1VarV0, null, (byte) 5), 3);
                                break;
                        }
                        return f88Var2;
                    }
                };
                ux2Var2.g0(objK20);
            } else {
                final byte b119 = 1;
                objK20 = new Function0() { // from class: o.mt1
                    /* JADX WARN: Code duplicated, block: B:46:0x0138  */
                    /* JADX WARN: Code duplicated, block: B:50:0x0179  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        ShortcutManager shortcutManager;
                        l97 l97Var;
                        Object value;
                        List<ShortcutInfo> pinnedShortcuts;
                        List<ShortcutInfo> pinnedShortcuts2;
                        byte b1110 = b119;
                        byte size = 0;
                        size = 0;
                        byte b1111 = 1;
                        ru1 ru1Var11 = ru1Var5;
                        byte b1112 = 9;
                        ns1 ns1Var4 = ns1Var3;
                        hc1 hc1Var2 = null;
                        byte b1113 = 2;
                        f88 f88Var2 = f88.a;
                        switch (b1110) {
                            case 0:
                                ns1Var4.getClass();
                                im3.R(e8.n(ru1Var11), ru1Var11.x, null, new gu1(ru1Var11, ns1Var4, hc1Var2, b1113), 2);
                                break;
                            case 1:
                                ns1Var4.getClass();
                                im3.R(e8.n(ru1Var11), ru1Var11.x, null, new gu1(ru1Var11, ns1Var4, hc1Var2, b1111), 2);
                                break;
                            case 2:
                                ns1Var4.getClass();
                                im3.R(e8.n(ru1Var11), ru1Var11.x, null, new gu1(ru1Var11, ns1Var4, hc1Var2, size), 2);
                                break;
                            case 3:
                                ns1Var4.getClass();
                                cr crVar = ru1Var11.p;
                                xk1 xk1Var = ru1Var11.V;
                                crVar.getClass();
                                xk1Var.getClass();
                                ru1 ru1Var12 = (ru1) xk1Var.n;
                                long j5 = ns1Var4.a;
                                BigInteger bigIntegerValueOf = (j5 <= 0 || j5 > 4294967295L) ? null : BigInteger.valueOf(144115188075855872L + j5);
                                e27 e27Var = e27.a;
                                if (bigIntegerValueOf != null) {
                                    IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                    if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                        ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(bigIntegerValueOf);
                                        if (chatConversationIDRequestPrivateRoomWithEndPoint == null || chatConversationIDRequestPrivateRoomWithEndPoint.Equal(ChatConversationID.getInvalidConversationID())) {
                                            ye4.a("DeviceChatHelper", "Not able to open device chat: invalid conversationId");
                                            im3.R(e8.n(ru1Var12), null, null, new oa1(ru1Var12, e27Var, hc1Var2, b1112), 3);
                                        } else {
                                            im3.R(e8.n(ru1Var12), null, null, new oa1((Object) ru1Var12, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var2, (byte) 8), 3);
                                        }
                                    } else {
                                        ye4.a("DeviceChatHelper", "Not able to open device chat: startChatUIModel == null");
                                        im3.R(e8.n(ru1Var12), null, null, new oa1(ru1Var12, e27Var, hc1Var2, b1112), 3);
                                    }
                                } else {
                                    ye4.a("DeviceChatHelper", "Not able to open device chat: invalid dyngateId " + j5);
                                    im3.R(e8.n(ru1Var12), null, null, new oa1(ru1Var12, e27Var, hc1Var2, b1112), 3);
                                }
                                break;
                            case 4:
                                ns1 ns1Var5 = ns1Var3;
                                ns1Var5.getClass();
                                ru1 ru1Var13 = ru1Var5;
                                d31 d31Var = ru1Var13.f1953o;
                                RemoteControlApplication remoteControlApplication = d31Var.a;
                                RemoteControlApplication remoteControlApplication2 = d31Var.a;
                                ShortcutManager shortcutManager2 = (ShortcutManager) remoteControlApplication.getSystemService(ShortcutManager.class);
                                if (shortcutManager2 != null && shortcutManager2.isRequestPinShortcutSupported()) {
                                    String strValueOf = String.valueOf(ns1Var5.a);
                                    strValueOf.getClass();
                                    ShortcutManager shortcutManager3 = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                    hc1 hc1Var3 = null;
                                    if (shortcutManager3 == null || (pinnedShortcuts2 = shortcutManager3.getPinnedShortcuts()) == null || pinnedShortcuts2.isEmpty()) {
                                        shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                        if (shortcutManager != null && (pinnedShortcuts = shortcutManager.getPinnedShortcuts()) != null) {
                                            size = pinnedShortcuts.size();
                                        }
                                        if (size >= 5) {
                                            im3.R(e8.n(ru1Var13), null, null, new j0((Object) ru1Var13, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                        } else {
                                            l97Var = ru1Var13.z;
                                            do {
                                                value = l97Var.getValue();
                                            } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                        }
                                    } else {
                                        Iterator<T> it = pinnedShortcuts2.iterator();
                                        while (it.hasNext()) {
                                            if (im3.n(((ShortcutInfo) it.next()).getId(), strValueOf)) {
                                                im3.R(e8.n(ru1Var13), null, null, new oa1(ru1Var13, c37.a, hc1Var3, b1112), 3);
                                                break;
                                            }
                                        }
                                        shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                        if (shortcutManager != null) {
                                            size = pinnedShortcuts.size();
                                        }
                                        if (size >= 5) {
                                            im3.R(e8.n(ru1Var13), null, null, new j0((Object) ru1Var13, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                        } else {
                                            l97Var = ru1Var13.z;
                                            do {
                                                value = l97Var.getValue();
                                            } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                        }
                                    }
                                }
                                break;
                            case 5:
                                ru1 ru1Var14 = ru1Var5;
                                fe1 fe1Var = ru1Var14.x;
                                ns1Var4.getClass();
                                long j6 = ns1Var4.a;
                                l97 l97Var2 = ru1Var14.J;
                                Long l = (Long) l97Var2.getValue();
                                if (l == null || l.longValue() != j6) {
                                    ms1 ms1Var = ns1Var4.f;
                                    if (ms1Var != null) {
                                        Long l2 = (Long) l97Var2.getValue();
                                        if (l2 != null) {
                                            ru1Var14.W0(l2.longValue());
                                        }
                                        l97Var2.l(null, Long.valueOf(j6));
                                        ru1Var14.m1(j6, true);
                                        im3.R(e8.n(ru1Var14), fe1Var, null, new pu1(ms1Var, ru1Var14, j6, null, (byte) 0), 2);
                                        Long l3 = ru1Var14.y;
                                        if (l3 != null) {
                                            im3.R(e8.n(ru1Var14), fe1Var, null, new qu1(l3.longValue(), ru1Var14, j6, null, (byte) 0), 2);
                                        }
                                    } else {
                                        ye4.c("DeviceInfoScreenViewModel", "no wake capability for " + j6);
                                    }
                                }
                                break;
                            default:
                                ru1 ru1Var15 = ru1Var5;
                                ru1Var15.X0();
                                ns1 ns1Var6 = ns1Var3;
                                ns1Var6.getClass();
                                du1 du1VarV0 = ru1.V0(ns1Var6);
                                ru1Var15.Q.add(du1VarV0);
                                im3.R(e8.n(ru1Var15), null, null, new tx(ru1Var15, ns1Var6, du1VarV0, null, (byte) 5), 3);
                                break;
                        }
                        return f88Var2;
                    }
                };
                ux2Var2.g0(objK20);
            }
            Function0 function1110 = (Function0) objK20;
            zH13 = ux2Var2.h(ru1Var5) | ux2Var2.h(ns1Var3);
            objK21 = ux2Var2.K();
            if (zH13) {
                final byte b120 = 2;
                objK21 = new Function0() { // from class: o.mt1
                    /* JADX WARN: Code duplicated, block: B:46:0x0138  */
                    /* JADX WARN: Code duplicated, block: B:50:0x0179  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        ShortcutManager shortcutManager;
                        l97 l97Var;
                        Object value;
                        List<ShortcutInfo> pinnedShortcuts;
                        List<ShortcutInfo> pinnedShortcuts2;
                        byte b1110 = b120;
                        byte size = 0;
                        size = 0;
                        byte b1111 = 1;
                        ru1 ru1Var11 = ru1Var5;
                        byte b1112 = 9;
                        ns1 ns1Var4 = ns1Var3;
                        hc1 hc1Var2 = null;
                        byte b1113 = 2;
                        f88 f88Var2 = f88.a;
                        switch (b1110) {
                            case 0:
                                ns1Var4.getClass();
                                im3.R(e8.n(ru1Var11), ru1Var11.x, null, new gu1(ru1Var11, ns1Var4, hc1Var2, b1113), 2);
                                break;
                            case 1:
                                ns1Var4.getClass();
                                im3.R(e8.n(ru1Var11), ru1Var11.x, null, new gu1(ru1Var11, ns1Var4, hc1Var2, b1111), 2);
                                break;
                            case 2:
                                ns1Var4.getClass();
                                im3.R(e8.n(ru1Var11), ru1Var11.x, null, new gu1(ru1Var11, ns1Var4, hc1Var2, size), 2);
                                break;
                            case 3:
                                ns1Var4.getClass();
                                cr crVar = ru1Var11.p;
                                xk1 xk1Var = ru1Var11.V;
                                crVar.getClass();
                                xk1Var.getClass();
                                ru1 ru1Var12 = (ru1) xk1Var.n;
                                long j5 = ns1Var4.a;
                                BigInteger bigIntegerValueOf = (j5 <= 0 || j5 > 4294967295L) ? null : BigInteger.valueOf(144115188075855872L + j5);
                                e27 e27Var = e27.a;
                                if (bigIntegerValueOf != null) {
                                    IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                    if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                        ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(bigIntegerValueOf);
                                        if (chatConversationIDRequestPrivateRoomWithEndPoint == null || chatConversationIDRequestPrivateRoomWithEndPoint.Equal(ChatConversationID.getInvalidConversationID())) {
                                            ye4.a("DeviceChatHelper", "Not able to open device chat: invalid conversationId");
                                            im3.R(e8.n(ru1Var12), null, null, new oa1(ru1Var12, e27Var, hc1Var2, b1112), 3);
                                        } else {
                                            im3.R(e8.n(ru1Var12), null, null, new oa1((Object) ru1Var12, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var2, (byte) 8), 3);
                                        }
                                    } else {
                                        ye4.a("DeviceChatHelper", "Not able to open device chat: startChatUIModel == null");
                                        im3.R(e8.n(ru1Var12), null, null, new oa1(ru1Var12, e27Var, hc1Var2, b1112), 3);
                                    }
                                } else {
                                    ye4.a("DeviceChatHelper", "Not able to open device chat: invalid dyngateId " + j5);
                                    im3.R(e8.n(ru1Var12), null, null, new oa1(ru1Var12, e27Var, hc1Var2, b1112), 3);
                                }
                                break;
                            case 4:
                                ns1 ns1Var5 = ns1Var3;
                                ns1Var5.getClass();
                                ru1 ru1Var13 = ru1Var5;
                                d31 d31Var = ru1Var13.f1953o;
                                RemoteControlApplication remoteControlApplication = d31Var.a;
                                RemoteControlApplication remoteControlApplication2 = d31Var.a;
                                ShortcutManager shortcutManager2 = (ShortcutManager) remoteControlApplication.getSystemService(ShortcutManager.class);
                                if (shortcutManager2 != null && shortcutManager2.isRequestPinShortcutSupported()) {
                                    String strValueOf = String.valueOf(ns1Var5.a);
                                    strValueOf.getClass();
                                    ShortcutManager shortcutManager3 = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                    hc1 hc1Var3 = null;
                                    if (shortcutManager3 == null || (pinnedShortcuts2 = shortcutManager3.getPinnedShortcuts()) == null || pinnedShortcuts2.isEmpty()) {
                                        shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                        if (shortcutManager != null && (pinnedShortcuts = shortcutManager.getPinnedShortcuts()) != null) {
                                            size = pinnedShortcuts.size();
                                        }
                                        if (size >= 5) {
                                            im3.R(e8.n(ru1Var13), null, null, new j0((Object) ru1Var13, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                        } else {
                                            l97Var = ru1Var13.z;
                                            do {
                                                value = l97Var.getValue();
                                            } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                        }
                                    } else {
                                        Iterator<T> it = pinnedShortcuts2.iterator();
                                        while (it.hasNext()) {
                                            if (im3.n(((ShortcutInfo) it.next()).getId(), strValueOf)) {
                                                im3.R(e8.n(ru1Var13), null, null, new oa1(ru1Var13, c37.a, hc1Var3, b1112), 3);
                                                break;
                                            }
                                        }
                                        shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                        if (shortcutManager != null) {
                                            size = pinnedShortcuts.size();
                                        }
                                        if (size >= 5) {
                                            im3.R(e8.n(ru1Var13), null, null, new j0((Object) ru1Var13, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                        } else {
                                            l97Var = ru1Var13.z;
                                            do {
                                                value = l97Var.getValue();
                                            } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                        }
                                    }
                                }
                                break;
                            case 5:
                                ru1 ru1Var14 = ru1Var5;
                                fe1 fe1Var = ru1Var14.x;
                                ns1Var4.getClass();
                                long j6 = ns1Var4.a;
                                l97 l97Var2 = ru1Var14.J;
                                Long l = (Long) l97Var2.getValue();
                                if (l == null || l.longValue() != j6) {
                                    ms1 ms1Var = ns1Var4.f;
                                    if (ms1Var != null) {
                                        Long l2 = (Long) l97Var2.getValue();
                                        if (l2 != null) {
                                            ru1Var14.W0(l2.longValue());
                                        }
                                        l97Var2.l(null, Long.valueOf(j6));
                                        ru1Var14.m1(j6, true);
                                        im3.R(e8.n(ru1Var14), fe1Var, null, new pu1(ms1Var, ru1Var14, j6, null, (byte) 0), 2);
                                        Long l3 = ru1Var14.y;
                                        if (l3 != null) {
                                            im3.R(e8.n(ru1Var14), fe1Var, null, new qu1(l3.longValue(), ru1Var14, j6, null, (byte) 0), 2);
                                        }
                                    } else {
                                        ye4.c("DeviceInfoScreenViewModel", "no wake capability for " + j6);
                                    }
                                }
                                break;
                            default:
                                ru1 ru1Var15 = ru1Var5;
                                ru1Var15.X0();
                                ns1 ns1Var6 = ns1Var3;
                                ns1Var6.getClass();
                                du1 du1VarV0 = ru1.V0(ns1Var6);
                                ru1Var15.Q.add(du1VarV0);
                                im3.R(e8.n(ru1Var15), null, null, new tx(ru1Var15, ns1Var6, du1VarV0, null, (byte) 5), 3);
                                break;
                        }
                        return f88Var2;
                    }
                };
                ux2Var2.g0(objK21);
            } else {
                final byte b121 = 2;
                objK21 = new Function0() { // from class: o.mt1
                    /* JADX WARN: Code duplicated, block: B:46:0x0138  */
                    /* JADX WARN: Code duplicated, block: B:50:0x0179  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        ShortcutManager shortcutManager;
                        l97 l97Var;
                        Object value;
                        List<ShortcutInfo> pinnedShortcuts;
                        List<ShortcutInfo> pinnedShortcuts2;
                        byte b1110 = b121;
                        byte size = 0;
                        size = 0;
                        byte b1111 = 1;
                        ru1 ru1Var11 = ru1Var5;
                        byte b1112 = 9;
                        ns1 ns1Var4 = ns1Var3;
                        hc1 hc1Var2 = null;
                        byte b1113 = 2;
                        f88 f88Var2 = f88.a;
                        switch (b1110) {
                            case 0:
                                ns1Var4.getClass();
                                im3.R(e8.n(ru1Var11), ru1Var11.x, null, new gu1(ru1Var11, ns1Var4, hc1Var2, b1113), 2);
                                break;
                            case 1:
                                ns1Var4.getClass();
                                im3.R(e8.n(ru1Var11), ru1Var11.x, null, new gu1(ru1Var11, ns1Var4, hc1Var2, b1111), 2);
                                break;
                            case 2:
                                ns1Var4.getClass();
                                im3.R(e8.n(ru1Var11), ru1Var11.x, null, new gu1(ru1Var11, ns1Var4, hc1Var2, size), 2);
                                break;
                            case 3:
                                ns1Var4.getClass();
                                cr crVar = ru1Var11.p;
                                xk1 xk1Var = ru1Var11.V;
                                crVar.getClass();
                                xk1Var.getClass();
                                ru1 ru1Var12 = (ru1) xk1Var.n;
                                long j5 = ns1Var4.a;
                                BigInteger bigIntegerValueOf = (j5 <= 0 || j5 > 4294967295L) ? null : BigInteger.valueOf(144115188075855872L + j5);
                                e27 e27Var = e27.a;
                                if (bigIntegerValueOf != null) {
                                    IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                    if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                        ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(bigIntegerValueOf);
                                        if (chatConversationIDRequestPrivateRoomWithEndPoint == null || chatConversationIDRequestPrivateRoomWithEndPoint.Equal(ChatConversationID.getInvalidConversationID())) {
                                            ye4.a("DeviceChatHelper", "Not able to open device chat: invalid conversationId");
                                            im3.R(e8.n(ru1Var12), null, null, new oa1(ru1Var12, e27Var, hc1Var2, b1112), 3);
                                        } else {
                                            im3.R(e8.n(ru1Var12), null, null, new oa1((Object) ru1Var12, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var2, (byte) 8), 3);
                                        }
                                    } else {
                                        ye4.a("DeviceChatHelper", "Not able to open device chat: startChatUIModel == null");
                                        im3.R(e8.n(ru1Var12), null, null, new oa1(ru1Var12, e27Var, hc1Var2, b1112), 3);
                                    }
                                } else {
                                    ye4.a("DeviceChatHelper", "Not able to open device chat: invalid dyngateId " + j5);
                                    im3.R(e8.n(ru1Var12), null, null, new oa1(ru1Var12, e27Var, hc1Var2, b1112), 3);
                                }
                                break;
                            case 4:
                                ns1 ns1Var5 = ns1Var3;
                                ns1Var5.getClass();
                                ru1 ru1Var13 = ru1Var5;
                                d31 d31Var = ru1Var13.f1953o;
                                RemoteControlApplication remoteControlApplication = d31Var.a;
                                RemoteControlApplication remoteControlApplication2 = d31Var.a;
                                ShortcutManager shortcutManager2 = (ShortcutManager) remoteControlApplication.getSystemService(ShortcutManager.class);
                                if (shortcutManager2 != null && shortcutManager2.isRequestPinShortcutSupported()) {
                                    String strValueOf = String.valueOf(ns1Var5.a);
                                    strValueOf.getClass();
                                    ShortcutManager shortcutManager3 = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                    hc1 hc1Var3 = null;
                                    if (shortcutManager3 == null || (pinnedShortcuts2 = shortcutManager3.getPinnedShortcuts()) == null || pinnedShortcuts2.isEmpty()) {
                                        shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                        if (shortcutManager != null && (pinnedShortcuts = shortcutManager.getPinnedShortcuts()) != null) {
                                            size = pinnedShortcuts.size();
                                        }
                                        if (size >= 5) {
                                            im3.R(e8.n(ru1Var13), null, null, new j0((Object) ru1Var13, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                        } else {
                                            l97Var = ru1Var13.z;
                                            do {
                                                value = l97Var.getValue();
                                            } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                        }
                                    } else {
                                        Iterator<T> it = pinnedShortcuts2.iterator();
                                        while (it.hasNext()) {
                                            if (im3.n(((ShortcutInfo) it.next()).getId(), strValueOf)) {
                                                im3.R(e8.n(ru1Var13), null, null, new oa1(ru1Var13, c37.a, hc1Var3, b1112), 3);
                                                break;
                                            }
                                        }
                                        shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                        if (shortcutManager != null) {
                                            size = pinnedShortcuts.size();
                                        }
                                        if (size >= 5) {
                                            im3.R(e8.n(ru1Var13), null, null, new j0((Object) ru1Var13, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                        } else {
                                            l97Var = ru1Var13.z;
                                            do {
                                                value = l97Var.getValue();
                                            } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                        }
                                    }
                                }
                                break;
                            case 5:
                                ru1 ru1Var14 = ru1Var5;
                                fe1 fe1Var = ru1Var14.x;
                                ns1Var4.getClass();
                                long j6 = ns1Var4.a;
                                l97 l97Var2 = ru1Var14.J;
                                Long l = (Long) l97Var2.getValue();
                                if (l == null || l.longValue() != j6) {
                                    ms1 ms1Var = ns1Var4.f;
                                    if (ms1Var != null) {
                                        Long l2 = (Long) l97Var2.getValue();
                                        if (l2 != null) {
                                            ru1Var14.W0(l2.longValue());
                                        }
                                        l97Var2.l(null, Long.valueOf(j6));
                                        ru1Var14.m1(j6, true);
                                        im3.R(e8.n(ru1Var14), fe1Var, null, new pu1(ms1Var, ru1Var14, j6, null, (byte) 0), 2);
                                        Long l3 = ru1Var14.y;
                                        if (l3 != null) {
                                            im3.R(e8.n(ru1Var14), fe1Var, null, new qu1(l3.longValue(), ru1Var14, j6, null, (byte) 0), 2);
                                        }
                                    } else {
                                        ye4.c("DeviceInfoScreenViewModel", "no wake capability for " + j6);
                                    }
                                }
                                break;
                            default:
                                ru1 ru1Var15 = ru1Var5;
                                ru1Var15.X0();
                                ns1 ns1Var6 = ns1Var3;
                                ns1Var6.getClass();
                                du1 du1VarV0 = ru1.V0(ns1Var6);
                                ru1Var15.Q.add(du1VarV0);
                                im3.R(e8.n(ru1Var15), null, null, new tx(ru1Var15, ns1Var6, du1VarV0, null, (byte) 5), 3);
                                break;
                        }
                        return f88Var2;
                    }
                };
                ux2Var2.g0(objK21);
            }
            Function0 function1111 = (Function0) objK21;
            zH14 = ux2Var2.h(ru1Var5) | ux2Var2.h(ns1Var3);
            objK22 = ux2Var2.K();
            if (zH14) {
                final byte b24 = 3;
                objK22 = new Function0() { // from class: o.mt1
                    /* JADX WARN: Code duplicated, block: B:46:0x0138  */
                    /* JADX WARN: Code duplicated, block: B:50:0x0179  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        ShortcutManager shortcutManager;
                        l97 l97Var;
                        Object value;
                        List<ShortcutInfo> pinnedShortcuts;
                        List<ShortcutInfo> pinnedShortcuts2;
                        byte b1110 = b24;
                        byte size = 0;
                        size = 0;
                        byte b1111 = 1;
                        ru1 ru1Var11 = ru1Var5;
                        byte b1112 = 9;
                        ns1 ns1Var4 = ns1Var3;
                        hc1 hc1Var2 = null;
                        byte b1113 = 2;
                        f88 f88Var2 = f88.a;
                        switch (b1110) {
                            case 0:
                                ns1Var4.getClass();
                                im3.R(e8.n(ru1Var11), ru1Var11.x, null, new gu1(ru1Var11, ns1Var4, hc1Var2, b1113), 2);
                                break;
                            case 1:
                                ns1Var4.getClass();
                                im3.R(e8.n(ru1Var11), ru1Var11.x, null, new gu1(ru1Var11, ns1Var4, hc1Var2, b1111), 2);
                                break;
                            case 2:
                                ns1Var4.getClass();
                                im3.R(e8.n(ru1Var11), ru1Var11.x, null, new gu1(ru1Var11, ns1Var4, hc1Var2, size), 2);
                                break;
                            case 3:
                                ns1Var4.getClass();
                                cr crVar = ru1Var11.p;
                                xk1 xk1Var = ru1Var11.V;
                                crVar.getClass();
                                xk1Var.getClass();
                                ru1 ru1Var12 = (ru1) xk1Var.n;
                                long j5 = ns1Var4.a;
                                BigInteger bigIntegerValueOf = (j5 <= 0 || j5 > 4294967295L) ? null : BigInteger.valueOf(144115188075855872L + j5);
                                e27 e27Var = e27.a;
                                if (bigIntegerValueOf != null) {
                                    IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                    if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                        ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(bigIntegerValueOf);
                                        if (chatConversationIDRequestPrivateRoomWithEndPoint == null || chatConversationIDRequestPrivateRoomWithEndPoint.Equal(ChatConversationID.getInvalidConversationID())) {
                                            ye4.a("DeviceChatHelper", "Not able to open device chat: invalid conversationId");
                                            im3.R(e8.n(ru1Var12), null, null, new oa1(ru1Var12, e27Var, hc1Var2, b1112), 3);
                                        } else {
                                            im3.R(e8.n(ru1Var12), null, null, new oa1((Object) ru1Var12, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var2, (byte) 8), 3);
                                        }
                                    } else {
                                        ye4.a("DeviceChatHelper", "Not able to open device chat: startChatUIModel == null");
                                        im3.R(e8.n(ru1Var12), null, null, new oa1(ru1Var12, e27Var, hc1Var2, b1112), 3);
                                    }
                                } else {
                                    ye4.a("DeviceChatHelper", "Not able to open device chat: invalid dyngateId " + j5);
                                    im3.R(e8.n(ru1Var12), null, null, new oa1(ru1Var12, e27Var, hc1Var2, b1112), 3);
                                }
                                break;
                            case 4:
                                ns1 ns1Var5 = ns1Var3;
                                ns1Var5.getClass();
                                ru1 ru1Var13 = ru1Var5;
                                d31 d31Var = ru1Var13.f1953o;
                                RemoteControlApplication remoteControlApplication = d31Var.a;
                                RemoteControlApplication remoteControlApplication2 = d31Var.a;
                                ShortcutManager shortcutManager2 = (ShortcutManager) remoteControlApplication.getSystemService(ShortcutManager.class);
                                if (shortcutManager2 != null && shortcutManager2.isRequestPinShortcutSupported()) {
                                    String strValueOf = String.valueOf(ns1Var5.a);
                                    strValueOf.getClass();
                                    ShortcutManager shortcutManager3 = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                    hc1 hc1Var3 = null;
                                    if (shortcutManager3 == null || (pinnedShortcuts2 = shortcutManager3.getPinnedShortcuts()) == null || pinnedShortcuts2.isEmpty()) {
                                        shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                        if (shortcutManager != null && (pinnedShortcuts = shortcutManager.getPinnedShortcuts()) != null) {
                                            size = pinnedShortcuts.size();
                                        }
                                        if (size >= 5) {
                                            im3.R(e8.n(ru1Var13), null, null, new j0((Object) ru1Var13, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                        } else {
                                            l97Var = ru1Var13.z;
                                            do {
                                                value = l97Var.getValue();
                                            } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                        }
                                    } else {
                                        Iterator<T> it = pinnedShortcuts2.iterator();
                                        while (it.hasNext()) {
                                            if (im3.n(((ShortcutInfo) it.next()).getId(), strValueOf)) {
                                                im3.R(e8.n(ru1Var13), null, null, new oa1(ru1Var13, c37.a, hc1Var3, b1112), 3);
                                                break;
                                            }
                                        }
                                        shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                        if (shortcutManager != null) {
                                            size = pinnedShortcuts.size();
                                        }
                                        if (size >= 5) {
                                            im3.R(e8.n(ru1Var13), null, null, new j0((Object) ru1Var13, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                        } else {
                                            l97Var = ru1Var13.z;
                                            do {
                                                value = l97Var.getValue();
                                            } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                        }
                                    }
                                }
                                break;
                            case 5:
                                ru1 ru1Var14 = ru1Var5;
                                fe1 fe1Var = ru1Var14.x;
                                ns1Var4.getClass();
                                long j6 = ns1Var4.a;
                                l97 l97Var2 = ru1Var14.J;
                                Long l = (Long) l97Var2.getValue();
                                if (l == null || l.longValue() != j6) {
                                    ms1 ms1Var = ns1Var4.f;
                                    if (ms1Var != null) {
                                        Long l2 = (Long) l97Var2.getValue();
                                        if (l2 != null) {
                                            ru1Var14.W0(l2.longValue());
                                        }
                                        l97Var2.l(null, Long.valueOf(j6));
                                        ru1Var14.m1(j6, true);
                                        im3.R(e8.n(ru1Var14), fe1Var, null, new pu1(ms1Var, ru1Var14, j6, null, (byte) 0), 2);
                                        Long l3 = ru1Var14.y;
                                        if (l3 != null) {
                                            im3.R(e8.n(ru1Var14), fe1Var, null, new qu1(l3.longValue(), ru1Var14, j6, null, (byte) 0), 2);
                                        }
                                    } else {
                                        ye4.c("DeviceInfoScreenViewModel", "no wake capability for " + j6);
                                    }
                                }
                                break;
                            default:
                                ru1 ru1Var15 = ru1Var5;
                                ru1Var15.X0();
                                ns1 ns1Var6 = ns1Var3;
                                ns1Var6.getClass();
                                du1 du1VarV0 = ru1.V0(ns1Var6);
                                ru1Var15.Q.add(du1VarV0);
                                im3.R(e8.n(ru1Var15), null, null, new tx(ru1Var15, ns1Var6, du1VarV0, null, (byte) 5), 3);
                                break;
                        }
                        return f88Var2;
                    }
                };
                ux2Var2.g0(objK22);
            } else {
                final byte b25 = 3;
                objK22 = new Function0() { // from class: o.mt1
                    /* JADX WARN: Code duplicated, block: B:46:0x0138  */
                    /* JADX WARN: Code duplicated, block: B:50:0x0179  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        ShortcutManager shortcutManager;
                        l97 l97Var;
                        Object value;
                        List<ShortcutInfo> pinnedShortcuts;
                        List<ShortcutInfo> pinnedShortcuts2;
                        byte b1110 = b25;
                        byte size = 0;
                        size = 0;
                        byte b1111 = 1;
                        ru1 ru1Var11 = ru1Var5;
                        byte b1112 = 9;
                        ns1 ns1Var4 = ns1Var3;
                        hc1 hc1Var2 = null;
                        byte b1113 = 2;
                        f88 f88Var2 = f88.a;
                        switch (b1110) {
                            case 0:
                                ns1Var4.getClass();
                                im3.R(e8.n(ru1Var11), ru1Var11.x, null, new gu1(ru1Var11, ns1Var4, hc1Var2, b1113), 2);
                                break;
                            case 1:
                                ns1Var4.getClass();
                                im3.R(e8.n(ru1Var11), ru1Var11.x, null, new gu1(ru1Var11, ns1Var4, hc1Var2, b1111), 2);
                                break;
                            case 2:
                                ns1Var4.getClass();
                                im3.R(e8.n(ru1Var11), ru1Var11.x, null, new gu1(ru1Var11, ns1Var4, hc1Var2, size), 2);
                                break;
                            case 3:
                                ns1Var4.getClass();
                                cr crVar = ru1Var11.p;
                                xk1 xk1Var = ru1Var11.V;
                                crVar.getClass();
                                xk1Var.getClass();
                                ru1 ru1Var12 = (ru1) xk1Var.n;
                                long j5 = ns1Var4.a;
                                BigInteger bigIntegerValueOf = (j5 <= 0 || j5 > 4294967295L) ? null : BigInteger.valueOf(144115188075855872L + j5);
                                e27 e27Var = e27.a;
                                if (bigIntegerValueOf != null) {
                                    IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                    if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                        ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(bigIntegerValueOf);
                                        if (chatConversationIDRequestPrivateRoomWithEndPoint == null || chatConversationIDRequestPrivateRoomWithEndPoint.Equal(ChatConversationID.getInvalidConversationID())) {
                                            ye4.a("DeviceChatHelper", "Not able to open device chat: invalid conversationId");
                                            im3.R(e8.n(ru1Var12), null, null, new oa1(ru1Var12, e27Var, hc1Var2, b1112), 3);
                                        } else {
                                            im3.R(e8.n(ru1Var12), null, null, new oa1((Object) ru1Var12, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var2, (byte) 8), 3);
                                        }
                                    } else {
                                        ye4.a("DeviceChatHelper", "Not able to open device chat: startChatUIModel == null");
                                        im3.R(e8.n(ru1Var12), null, null, new oa1(ru1Var12, e27Var, hc1Var2, b1112), 3);
                                    }
                                } else {
                                    ye4.a("DeviceChatHelper", "Not able to open device chat: invalid dyngateId " + j5);
                                    im3.R(e8.n(ru1Var12), null, null, new oa1(ru1Var12, e27Var, hc1Var2, b1112), 3);
                                }
                                break;
                            case 4:
                                ns1 ns1Var5 = ns1Var3;
                                ns1Var5.getClass();
                                ru1 ru1Var13 = ru1Var5;
                                d31 d31Var = ru1Var13.f1953o;
                                RemoteControlApplication remoteControlApplication = d31Var.a;
                                RemoteControlApplication remoteControlApplication2 = d31Var.a;
                                ShortcutManager shortcutManager2 = (ShortcutManager) remoteControlApplication.getSystemService(ShortcutManager.class);
                                if (shortcutManager2 != null && shortcutManager2.isRequestPinShortcutSupported()) {
                                    String strValueOf = String.valueOf(ns1Var5.a);
                                    strValueOf.getClass();
                                    ShortcutManager shortcutManager3 = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                    hc1 hc1Var3 = null;
                                    if (shortcutManager3 == null || (pinnedShortcuts2 = shortcutManager3.getPinnedShortcuts()) == null || pinnedShortcuts2.isEmpty()) {
                                        shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                        if (shortcutManager != null && (pinnedShortcuts = shortcutManager.getPinnedShortcuts()) != null) {
                                            size = pinnedShortcuts.size();
                                        }
                                        if (size >= 5) {
                                            im3.R(e8.n(ru1Var13), null, null, new j0((Object) ru1Var13, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                        } else {
                                            l97Var = ru1Var13.z;
                                            do {
                                                value = l97Var.getValue();
                                            } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                        }
                                    } else {
                                        Iterator<T> it = pinnedShortcuts2.iterator();
                                        while (it.hasNext()) {
                                            if (im3.n(((ShortcutInfo) it.next()).getId(), strValueOf)) {
                                                im3.R(e8.n(ru1Var13), null, null, new oa1(ru1Var13, c37.a, hc1Var3, b1112), 3);
                                                break;
                                            }
                                        }
                                        shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                        if (shortcutManager != null) {
                                            size = pinnedShortcuts.size();
                                        }
                                        if (size >= 5) {
                                            im3.R(e8.n(ru1Var13), null, null, new j0((Object) ru1Var13, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                        } else {
                                            l97Var = ru1Var13.z;
                                            do {
                                                value = l97Var.getValue();
                                            } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                        }
                                    }
                                }
                                break;
                            case 5:
                                ru1 ru1Var14 = ru1Var5;
                                fe1 fe1Var = ru1Var14.x;
                                ns1Var4.getClass();
                                long j6 = ns1Var4.a;
                                l97 l97Var2 = ru1Var14.J;
                                Long l = (Long) l97Var2.getValue();
                                if (l == null || l.longValue() != j6) {
                                    ms1 ms1Var = ns1Var4.f;
                                    if (ms1Var != null) {
                                        Long l2 = (Long) l97Var2.getValue();
                                        if (l2 != null) {
                                            ru1Var14.W0(l2.longValue());
                                        }
                                        l97Var2.l(null, Long.valueOf(j6));
                                        ru1Var14.m1(j6, true);
                                        im3.R(e8.n(ru1Var14), fe1Var, null, new pu1(ms1Var, ru1Var14, j6, null, (byte) 0), 2);
                                        Long l3 = ru1Var14.y;
                                        if (l3 != null) {
                                            im3.R(e8.n(ru1Var14), fe1Var, null, new qu1(l3.longValue(), ru1Var14, j6, null, (byte) 0), 2);
                                        }
                                    } else {
                                        ye4.c("DeviceInfoScreenViewModel", "no wake capability for " + j6);
                                    }
                                }
                                break;
                            default:
                                ru1 ru1Var15 = ru1Var5;
                                ru1Var15.X0();
                                ns1 ns1Var6 = ns1Var3;
                                ns1Var6.getClass();
                                du1 du1VarV0 = ru1.V0(ns1Var6);
                                ru1Var15.Q.add(du1VarV0);
                                im3.R(e8.n(ru1Var15), null, null, new tx(ru1Var15, ns1Var6, du1VarV0, null, (byte) 5), 3);
                                break;
                        }
                        return f88Var2;
                    }
                };
                ux2Var2.g0(objK22);
            }
            Function0 function1112 = (Function0) objK22;
            zH15 = ux2Var2.h(ru1Var5) | ux2Var2.h(ns1Var3);
            objK23 = ux2Var2.K();
            if (zH15) {
                final byte b26 = 4;
                objK23 = new Function0() { // from class: o.mt1
                    /* JADX WARN: Code duplicated, block: B:46:0x0138  */
                    /* JADX WARN: Code duplicated, block: B:50:0x0179  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        ShortcutManager shortcutManager;
                        l97 l97Var;
                        Object value;
                        List<ShortcutInfo> pinnedShortcuts;
                        List<ShortcutInfo> pinnedShortcuts2;
                        byte b1110 = b26;
                        byte size = 0;
                        size = 0;
                        byte b1111 = 1;
                        ru1 ru1Var11 = ru1Var5;
                        byte b1112 = 9;
                        ns1 ns1Var4 = ns1Var3;
                        hc1 hc1Var2 = null;
                        byte b1113 = 2;
                        f88 f88Var2 = f88.a;
                        switch (b1110) {
                            case 0:
                                ns1Var4.getClass();
                                im3.R(e8.n(ru1Var11), ru1Var11.x, null, new gu1(ru1Var11, ns1Var4, hc1Var2, b1113), 2);
                                break;
                            case 1:
                                ns1Var4.getClass();
                                im3.R(e8.n(ru1Var11), ru1Var11.x, null, new gu1(ru1Var11, ns1Var4, hc1Var2, b1111), 2);
                                break;
                            case 2:
                                ns1Var4.getClass();
                                im3.R(e8.n(ru1Var11), ru1Var11.x, null, new gu1(ru1Var11, ns1Var4, hc1Var2, size), 2);
                                break;
                            case 3:
                                ns1Var4.getClass();
                                cr crVar = ru1Var11.p;
                                xk1 xk1Var = ru1Var11.V;
                                crVar.getClass();
                                xk1Var.getClass();
                                ru1 ru1Var12 = (ru1) xk1Var.n;
                                long j5 = ns1Var4.a;
                                BigInteger bigIntegerValueOf = (j5 <= 0 || j5 > 4294967295L) ? null : BigInteger.valueOf(144115188075855872L + j5);
                                e27 e27Var = e27.a;
                                if (bigIntegerValueOf != null) {
                                    IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                    if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                        ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(bigIntegerValueOf);
                                        if (chatConversationIDRequestPrivateRoomWithEndPoint == null || chatConversationIDRequestPrivateRoomWithEndPoint.Equal(ChatConversationID.getInvalidConversationID())) {
                                            ye4.a("DeviceChatHelper", "Not able to open device chat: invalid conversationId");
                                            im3.R(e8.n(ru1Var12), null, null, new oa1(ru1Var12, e27Var, hc1Var2, b1112), 3);
                                        } else {
                                            im3.R(e8.n(ru1Var12), null, null, new oa1((Object) ru1Var12, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var2, (byte) 8), 3);
                                        }
                                    } else {
                                        ye4.a("DeviceChatHelper", "Not able to open device chat: startChatUIModel == null");
                                        im3.R(e8.n(ru1Var12), null, null, new oa1(ru1Var12, e27Var, hc1Var2, b1112), 3);
                                    }
                                } else {
                                    ye4.a("DeviceChatHelper", "Not able to open device chat: invalid dyngateId " + j5);
                                    im3.R(e8.n(ru1Var12), null, null, new oa1(ru1Var12, e27Var, hc1Var2, b1112), 3);
                                }
                                break;
                            case 4:
                                ns1 ns1Var5 = ns1Var3;
                                ns1Var5.getClass();
                                ru1 ru1Var13 = ru1Var5;
                                d31 d31Var = ru1Var13.f1953o;
                                RemoteControlApplication remoteControlApplication = d31Var.a;
                                RemoteControlApplication remoteControlApplication2 = d31Var.a;
                                ShortcutManager shortcutManager2 = (ShortcutManager) remoteControlApplication.getSystemService(ShortcutManager.class);
                                if (shortcutManager2 != null && shortcutManager2.isRequestPinShortcutSupported()) {
                                    String strValueOf = String.valueOf(ns1Var5.a);
                                    strValueOf.getClass();
                                    ShortcutManager shortcutManager3 = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                    hc1 hc1Var3 = null;
                                    if (shortcutManager3 == null || (pinnedShortcuts2 = shortcutManager3.getPinnedShortcuts()) == null || pinnedShortcuts2.isEmpty()) {
                                        shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                        if (shortcutManager != null && (pinnedShortcuts = shortcutManager.getPinnedShortcuts()) != null) {
                                            size = pinnedShortcuts.size();
                                        }
                                        if (size >= 5) {
                                            im3.R(e8.n(ru1Var13), null, null, new j0((Object) ru1Var13, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                        } else {
                                            l97Var = ru1Var13.z;
                                            do {
                                                value = l97Var.getValue();
                                            } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                        }
                                    } else {
                                        Iterator<T> it = pinnedShortcuts2.iterator();
                                        while (it.hasNext()) {
                                            if (im3.n(((ShortcutInfo) it.next()).getId(), strValueOf)) {
                                                im3.R(e8.n(ru1Var13), null, null, new oa1(ru1Var13, c37.a, hc1Var3, b1112), 3);
                                                break;
                                            }
                                        }
                                        shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                        if (shortcutManager != null) {
                                            size = pinnedShortcuts.size();
                                        }
                                        if (size >= 5) {
                                            im3.R(e8.n(ru1Var13), null, null, new j0((Object) ru1Var13, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                        } else {
                                            l97Var = ru1Var13.z;
                                            do {
                                                value = l97Var.getValue();
                                            } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                        }
                                    }
                                }
                                break;
                            case 5:
                                ru1 ru1Var14 = ru1Var5;
                                fe1 fe1Var = ru1Var14.x;
                                ns1Var4.getClass();
                                long j6 = ns1Var4.a;
                                l97 l97Var2 = ru1Var14.J;
                                Long l = (Long) l97Var2.getValue();
                                if (l == null || l.longValue() != j6) {
                                    ms1 ms1Var = ns1Var4.f;
                                    if (ms1Var != null) {
                                        Long l2 = (Long) l97Var2.getValue();
                                        if (l2 != null) {
                                            ru1Var14.W0(l2.longValue());
                                        }
                                        l97Var2.l(null, Long.valueOf(j6));
                                        ru1Var14.m1(j6, true);
                                        im3.R(e8.n(ru1Var14), fe1Var, null, new pu1(ms1Var, ru1Var14, j6, null, (byte) 0), 2);
                                        Long l3 = ru1Var14.y;
                                        if (l3 != null) {
                                            im3.R(e8.n(ru1Var14), fe1Var, null, new qu1(l3.longValue(), ru1Var14, j6, null, (byte) 0), 2);
                                        }
                                    } else {
                                        ye4.c("DeviceInfoScreenViewModel", "no wake capability for " + j6);
                                    }
                                }
                                break;
                            default:
                                ru1 ru1Var15 = ru1Var5;
                                ru1Var15.X0();
                                ns1 ns1Var6 = ns1Var3;
                                ns1Var6.getClass();
                                du1 du1VarV0 = ru1.V0(ns1Var6);
                                ru1Var15.Q.add(du1VarV0);
                                im3.R(e8.n(ru1Var15), null, null, new tx(ru1Var15, ns1Var6, du1VarV0, null, (byte) 5), 3);
                                break;
                        }
                        return f88Var2;
                    }
                };
                ux2Var2.g0(objK23);
            } else {
                final byte b27 = 4;
                objK23 = new Function0() { // from class: o.mt1
                    /* JADX WARN: Code duplicated, block: B:46:0x0138  */
                    /* JADX WARN: Code duplicated, block: B:50:0x0179  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        ShortcutManager shortcutManager;
                        l97 l97Var;
                        Object value;
                        List<ShortcutInfo> pinnedShortcuts;
                        List<ShortcutInfo> pinnedShortcuts2;
                        byte b1110 = b27;
                        byte size = 0;
                        size = 0;
                        byte b1111 = 1;
                        ru1 ru1Var11 = ru1Var5;
                        byte b1112 = 9;
                        ns1 ns1Var4 = ns1Var3;
                        hc1 hc1Var2 = null;
                        byte b1113 = 2;
                        f88 f88Var2 = f88.a;
                        switch (b1110) {
                            case 0:
                                ns1Var4.getClass();
                                im3.R(e8.n(ru1Var11), ru1Var11.x, null, new gu1(ru1Var11, ns1Var4, hc1Var2, b1113), 2);
                                break;
                            case 1:
                                ns1Var4.getClass();
                                im3.R(e8.n(ru1Var11), ru1Var11.x, null, new gu1(ru1Var11, ns1Var4, hc1Var2, b1111), 2);
                                break;
                            case 2:
                                ns1Var4.getClass();
                                im3.R(e8.n(ru1Var11), ru1Var11.x, null, new gu1(ru1Var11, ns1Var4, hc1Var2, size), 2);
                                break;
                            case 3:
                                ns1Var4.getClass();
                                cr crVar = ru1Var11.p;
                                xk1 xk1Var = ru1Var11.V;
                                crVar.getClass();
                                xk1Var.getClass();
                                ru1 ru1Var12 = (ru1) xk1Var.n;
                                long j5 = ns1Var4.a;
                                BigInteger bigIntegerValueOf = (j5 <= 0 || j5 > 4294967295L) ? null : BigInteger.valueOf(144115188075855872L + j5);
                                e27 e27Var = e27.a;
                                if (bigIntegerValueOf != null) {
                                    IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                    if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                        ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(bigIntegerValueOf);
                                        if (chatConversationIDRequestPrivateRoomWithEndPoint == null || chatConversationIDRequestPrivateRoomWithEndPoint.Equal(ChatConversationID.getInvalidConversationID())) {
                                            ye4.a("DeviceChatHelper", "Not able to open device chat: invalid conversationId");
                                            im3.R(e8.n(ru1Var12), null, null, new oa1(ru1Var12, e27Var, hc1Var2, b1112), 3);
                                        } else {
                                            im3.R(e8.n(ru1Var12), null, null, new oa1((Object) ru1Var12, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var2, (byte) 8), 3);
                                        }
                                    } else {
                                        ye4.a("DeviceChatHelper", "Not able to open device chat: startChatUIModel == null");
                                        im3.R(e8.n(ru1Var12), null, null, new oa1(ru1Var12, e27Var, hc1Var2, b1112), 3);
                                    }
                                } else {
                                    ye4.a("DeviceChatHelper", "Not able to open device chat: invalid dyngateId " + j5);
                                    im3.R(e8.n(ru1Var12), null, null, new oa1(ru1Var12, e27Var, hc1Var2, b1112), 3);
                                }
                                break;
                            case 4:
                                ns1 ns1Var5 = ns1Var3;
                                ns1Var5.getClass();
                                ru1 ru1Var13 = ru1Var5;
                                d31 d31Var = ru1Var13.f1953o;
                                RemoteControlApplication remoteControlApplication = d31Var.a;
                                RemoteControlApplication remoteControlApplication2 = d31Var.a;
                                ShortcutManager shortcutManager2 = (ShortcutManager) remoteControlApplication.getSystemService(ShortcutManager.class);
                                if (shortcutManager2 != null && shortcutManager2.isRequestPinShortcutSupported()) {
                                    String strValueOf = String.valueOf(ns1Var5.a);
                                    strValueOf.getClass();
                                    ShortcutManager shortcutManager3 = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                    hc1 hc1Var3 = null;
                                    if (shortcutManager3 == null || (pinnedShortcuts2 = shortcutManager3.getPinnedShortcuts()) == null || pinnedShortcuts2.isEmpty()) {
                                        shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                        if (shortcutManager != null && (pinnedShortcuts = shortcutManager.getPinnedShortcuts()) != null) {
                                            size = pinnedShortcuts.size();
                                        }
                                        if (size >= 5) {
                                            im3.R(e8.n(ru1Var13), null, null, new j0((Object) ru1Var13, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                        } else {
                                            l97Var = ru1Var13.z;
                                            do {
                                                value = l97Var.getValue();
                                            } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                        }
                                    } else {
                                        Iterator<T> it = pinnedShortcuts2.iterator();
                                        while (it.hasNext()) {
                                            if (im3.n(((ShortcutInfo) it.next()).getId(), strValueOf)) {
                                                im3.R(e8.n(ru1Var13), null, null, new oa1(ru1Var13, c37.a, hc1Var3, b1112), 3);
                                                break;
                                            }
                                        }
                                        shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                        if (shortcutManager != null) {
                                            size = pinnedShortcuts.size();
                                        }
                                        if (size >= 5) {
                                            im3.R(e8.n(ru1Var13), null, null, new j0((Object) ru1Var13, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                        } else {
                                            l97Var = ru1Var13.z;
                                            do {
                                                value = l97Var.getValue();
                                            } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                        }
                                    }
                                }
                                break;
                            case 5:
                                ru1 ru1Var14 = ru1Var5;
                                fe1 fe1Var = ru1Var14.x;
                                ns1Var4.getClass();
                                long j6 = ns1Var4.a;
                                l97 l97Var2 = ru1Var14.J;
                                Long l = (Long) l97Var2.getValue();
                                if (l == null || l.longValue() != j6) {
                                    ms1 ms1Var = ns1Var4.f;
                                    if (ms1Var != null) {
                                        Long l2 = (Long) l97Var2.getValue();
                                        if (l2 != null) {
                                            ru1Var14.W0(l2.longValue());
                                        }
                                        l97Var2.l(null, Long.valueOf(j6));
                                        ru1Var14.m1(j6, true);
                                        im3.R(e8.n(ru1Var14), fe1Var, null, new pu1(ms1Var, ru1Var14, j6, null, (byte) 0), 2);
                                        Long l3 = ru1Var14.y;
                                        if (l3 != null) {
                                            im3.R(e8.n(ru1Var14), fe1Var, null, new qu1(l3.longValue(), ru1Var14, j6, null, (byte) 0), 2);
                                        }
                                    } else {
                                        ye4.c("DeviceInfoScreenViewModel", "no wake capability for " + j6);
                                    }
                                }
                                break;
                            default:
                                ru1 ru1Var15 = ru1Var5;
                                ru1Var15.X0();
                                ns1 ns1Var6 = ns1Var3;
                                ns1Var6.getClass();
                                du1 du1VarV0 = ru1.V0(ns1Var6);
                                ru1Var15.Q.add(du1VarV0);
                                im3.R(e8.n(ru1Var15), null, null, new tx(ru1Var15, ns1Var6, du1VarV0, null, (byte) 5), 3);
                                break;
                        }
                        return f88Var2;
                    }
                };
                ux2Var2.g0(objK23);
            }
            Function0 function1113 = (Function0) objK23;
            zH16 = ux2Var2.h(ru1Var5);
            objK24 = ux2Var2.K();
            if (zH16) {
                objK24 = new zz0(ru1Var5, (byte) 11);
                ux2Var2.g0(objK24);
            } else {
                objK24 = new zz0(ru1Var5, (byte) 11);
                ux2Var2.g0(objK24);
            }
            Function0 function1114 = (Function0) objK24;
            zH17 = ux2Var2.h(ru1Var5) | ux2Var2.h(ns1Var3);
            objK25 = ux2Var2.K();
            if (zH17) {
                final byte b1110 = 5;
                objK25 = new Function0() { // from class: o.mt1
                    /* JADX WARN: Code duplicated, block: B:46:0x0138  */
                    /* JADX WARN: Code duplicated, block: B:50:0x0179  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        ShortcutManager shortcutManager;
                        l97 l97Var;
                        Object value;
                        List<ShortcutInfo> pinnedShortcuts;
                        List<ShortcutInfo> pinnedShortcuts2;
                        byte b1111 = b1110;
                        byte size = 0;
                        size = 0;
                        byte b1112 = 1;
                        ru1 ru1Var11 = ru1Var5;
                        byte b1113 = 9;
                        ns1 ns1Var4 = ns1Var3;
                        hc1 hc1Var2 = null;
                        byte b1114 = 2;
                        f88 f88Var2 = f88.a;
                        switch (b1111) {
                            case 0:
                                ns1Var4.getClass();
                                im3.R(e8.n(ru1Var11), ru1Var11.x, null, new gu1(ru1Var11, ns1Var4, hc1Var2, b1114), 2);
                                break;
                            case 1:
                                ns1Var4.getClass();
                                im3.R(e8.n(ru1Var11), ru1Var11.x, null, new gu1(ru1Var11, ns1Var4, hc1Var2, b1112), 2);
                                break;
                            case 2:
                                ns1Var4.getClass();
                                im3.R(e8.n(ru1Var11), ru1Var11.x, null, new gu1(ru1Var11, ns1Var4, hc1Var2, size), 2);
                                break;
                            case 3:
                                ns1Var4.getClass();
                                cr crVar = ru1Var11.p;
                                xk1 xk1Var = ru1Var11.V;
                                crVar.getClass();
                                xk1Var.getClass();
                                ru1 ru1Var12 = (ru1) xk1Var.n;
                                long j5 = ns1Var4.a;
                                BigInteger bigIntegerValueOf = (j5 <= 0 || j5 > 4294967295L) ? null : BigInteger.valueOf(144115188075855872L + j5);
                                e27 e27Var = e27.a;
                                if (bigIntegerValueOf != null) {
                                    IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                    if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                        ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(bigIntegerValueOf);
                                        if (chatConversationIDRequestPrivateRoomWithEndPoint == null || chatConversationIDRequestPrivateRoomWithEndPoint.Equal(ChatConversationID.getInvalidConversationID())) {
                                            ye4.a("DeviceChatHelper", "Not able to open device chat: invalid conversationId");
                                            im3.R(e8.n(ru1Var12), null, null, new oa1(ru1Var12, e27Var, hc1Var2, b1113), 3);
                                        } else {
                                            im3.R(e8.n(ru1Var12), null, null, new oa1((Object) ru1Var12, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var2, (byte) 8), 3);
                                        }
                                    } else {
                                        ye4.a("DeviceChatHelper", "Not able to open device chat: startChatUIModel == null");
                                        im3.R(e8.n(ru1Var12), null, null, new oa1(ru1Var12, e27Var, hc1Var2, b1113), 3);
                                    }
                                } else {
                                    ye4.a("DeviceChatHelper", "Not able to open device chat: invalid dyngateId " + j5);
                                    im3.R(e8.n(ru1Var12), null, null, new oa1(ru1Var12, e27Var, hc1Var2, b1113), 3);
                                }
                                break;
                            case 4:
                                ns1 ns1Var5 = ns1Var3;
                                ns1Var5.getClass();
                                ru1 ru1Var13 = ru1Var5;
                                d31 d31Var = ru1Var13.f1953o;
                                RemoteControlApplication remoteControlApplication = d31Var.a;
                                RemoteControlApplication remoteControlApplication2 = d31Var.a;
                                ShortcutManager shortcutManager2 = (ShortcutManager) remoteControlApplication.getSystemService(ShortcutManager.class);
                                if (shortcutManager2 != null && shortcutManager2.isRequestPinShortcutSupported()) {
                                    String strValueOf = String.valueOf(ns1Var5.a);
                                    strValueOf.getClass();
                                    ShortcutManager shortcutManager3 = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                    hc1 hc1Var3 = null;
                                    if (shortcutManager3 == null || (pinnedShortcuts2 = shortcutManager3.getPinnedShortcuts()) == null || pinnedShortcuts2.isEmpty()) {
                                        shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                        if (shortcutManager != null && (pinnedShortcuts = shortcutManager.getPinnedShortcuts()) != null) {
                                            size = pinnedShortcuts.size();
                                        }
                                        if (size >= 5) {
                                            im3.R(e8.n(ru1Var13), null, null, new j0((Object) ru1Var13, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                        } else {
                                            l97Var = ru1Var13.z;
                                            do {
                                                value = l97Var.getValue();
                                            } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                        }
                                    } else {
                                        Iterator<T> it = pinnedShortcuts2.iterator();
                                        while (it.hasNext()) {
                                            if (im3.n(((ShortcutInfo) it.next()).getId(), strValueOf)) {
                                                im3.R(e8.n(ru1Var13), null, null, new oa1(ru1Var13, c37.a, hc1Var3, b1113), 3);
                                                break;
                                            }
                                        }
                                        shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                        if (shortcutManager != null) {
                                            size = pinnedShortcuts.size();
                                        }
                                        if (size >= 5) {
                                            im3.R(e8.n(ru1Var13), null, null, new j0((Object) ru1Var13, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                        } else {
                                            l97Var = ru1Var13.z;
                                            do {
                                                value = l97Var.getValue();
                                            } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                        }
                                    }
                                }
                                break;
                            case 5:
                                ru1 ru1Var14 = ru1Var5;
                                fe1 fe1Var = ru1Var14.x;
                                ns1Var4.getClass();
                                long j6 = ns1Var4.a;
                                l97 l97Var2 = ru1Var14.J;
                                Long l = (Long) l97Var2.getValue();
                                if (l == null || l.longValue() != j6) {
                                    ms1 ms1Var = ns1Var4.f;
                                    if (ms1Var != null) {
                                        Long l2 = (Long) l97Var2.getValue();
                                        if (l2 != null) {
                                            ru1Var14.W0(l2.longValue());
                                        }
                                        l97Var2.l(null, Long.valueOf(j6));
                                        ru1Var14.m1(j6, true);
                                        im3.R(e8.n(ru1Var14), fe1Var, null, new pu1(ms1Var, ru1Var14, j6, null, (byte) 0), 2);
                                        Long l3 = ru1Var14.y;
                                        if (l3 != null) {
                                            im3.R(e8.n(ru1Var14), fe1Var, null, new qu1(l3.longValue(), ru1Var14, j6, null, (byte) 0), 2);
                                        }
                                    } else {
                                        ye4.c("DeviceInfoScreenViewModel", "no wake capability for " + j6);
                                    }
                                }
                                break;
                            default:
                                ru1 ru1Var15 = ru1Var5;
                                ru1Var15.X0();
                                ns1 ns1Var6 = ns1Var3;
                                ns1Var6.getClass();
                                du1 du1VarV0 = ru1.V0(ns1Var6);
                                ru1Var15.Q.add(du1VarV0);
                                im3.R(e8.n(ru1Var15), null, null, new tx(ru1Var15, ns1Var6, du1VarV0, null, (byte) 5), 3);
                                break;
                        }
                        return f88Var2;
                    }
                };
                ux2Var2.g0(objK25);
            } else {
                final byte b1111 = 5;
                objK25 = new Function0() { // from class: o.mt1
                    /* JADX WARN: Code duplicated, block: B:46:0x0138  */
                    /* JADX WARN: Code duplicated, block: B:50:0x0179  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        ShortcutManager shortcutManager;
                        l97 l97Var;
                        Object value;
                        List<ShortcutInfo> pinnedShortcuts;
                        List<ShortcutInfo> pinnedShortcuts2;
                        byte b1112 = b1111;
                        byte size = 0;
                        size = 0;
                        byte b1113 = 1;
                        ru1 ru1Var11 = ru1Var5;
                        byte b1114 = 9;
                        ns1 ns1Var4 = ns1Var3;
                        hc1 hc1Var2 = null;
                        byte b1115 = 2;
                        f88 f88Var2 = f88.a;
                        switch (b1112) {
                            case 0:
                                ns1Var4.getClass();
                                im3.R(e8.n(ru1Var11), ru1Var11.x, null, new gu1(ru1Var11, ns1Var4, hc1Var2, b1115), 2);
                                break;
                            case 1:
                                ns1Var4.getClass();
                                im3.R(e8.n(ru1Var11), ru1Var11.x, null, new gu1(ru1Var11, ns1Var4, hc1Var2, b1113), 2);
                                break;
                            case 2:
                                ns1Var4.getClass();
                                im3.R(e8.n(ru1Var11), ru1Var11.x, null, new gu1(ru1Var11, ns1Var4, hc1Var2, size), 2);
                                break;
                            case 3:
                                ns1Var4.getClass();
                                cr crVar = ru1Var11.p;
                                xk1 xk1Var = ru1Var11.V;
                                crVar.getClass();
                                xk1Var.getClass();
                                ru1 ru1Var12 = (ru1) xk1Var.n;
                                long j5 = ns1Var4.a;
                                BigInteger bigIntegerValueOf = (j5 <= 0 || j5 > 4294967295L) ? null : BigInteger.valueOf(144115188075855872L + j5);
                                e27 e27Var = e27.a;
                                if (bigIntegerValueOf != null) {
                                    IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                    if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                        ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(bigIntegerValueOf);
                                        if (chatConversationIDRequestPrivateRoomWithEndPoint == null || chatConversationIDRequestPrivateRoomWithEndPoint.Equal(ChatConversationID.getInvalidConversationID())) {
                                            ye4.a("DeviceChatHelper", "Not able to open device chat: invalid conversationId");
                                            im3.R(e8.n(ru1Var12), null, null, new oa1(ru1Var12, e27Var, hc1Var2, b1114), 3);
                                        } else {
                                            im3.R(e8.n(ru1Var12), null, null, new oa1((Object) ru1Var12, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var2, (byte) 8), 3);
                                        }
                                    } else {
                                        ye4.a("DeviceChatHelper", "Not able to open device chat: startChatUIModel == null");
                                        im3.R(e8.n(ru1Var12), null, null, new oa1(ru1Var12, e27Var, hc1Var2, b1114), 3);
                                    }
                                } else {
                                    ye4.a("DeviceChatHelper", "Not able to open device chat: invalid dyngateId " + j5);
                                    im3.R(e8.n(ru1Var12), null, null, new oa1(ru1Var12, e27Var, hc1Var2, b1114), 3);
                                }
                                break;
                            case 4:
                                ns1 ns1Var5 = ns1Var3;
                                ns1Var5.getClass();
                                ru1 ru1Var13 = ru1Var5;
                                d31 d31Var = ru1Var13.f1953o;
                                RemoteControlApplication remoteControlApplication = d31Var.a;
                                RemoteControlApplication remoteControlApplication2 = d31Var.a;
                                ShortcutManager shortcutManager2 = (ShortcutManager) remoteControlApplication.getSystemService(ShortcutManager.class);
                                if (shortcutManager2 != null && shortcutManager2.isRequestPinShortcutSupported()) {
                                    String strValueOf = String.valueOf(ns1Var5.a);
                                    strValueOf.getClass();
                                    ShortcutManager shortcutManager3 = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                    hc1 hc1Var3 = null;
                                    if (shortcutManager3 == null || (pinnedShortcuts2 = shortcutManager3.getPinnedShortcuts()) == null || pinnedShortcuts2.isEmpty()) {
                                        shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                        if (shortcutManager != null && (pinnedShortcuts = shortcutManager.getPinnedShortcuts()) != null) {
                                            size = pinnedShortcuts.size();
                                        }
                                        if (size >= 5) {
                                            im3.R(e8.n(ru1Var13), null, null, new j0((Object) ru1Var13, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                        } else {
                                            l97Var = ru1Var13.z;
                                            do {
                                                value = l97Var.getValue();
                                            } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                        }
                                    } else {
                                        Iterator<T> it = pinnedShortcuts2.iterator();
                                        while (it.hasNext()) {
                                            if (im3.n(((ShortcutInfo) it.next()).getId(), strValueOf)) {
                                                im3.R(e8.n(ru1Var13), null, null, new oa1(ru1Var13, c37.a, hc1Var3, b1114), 3);
                                                break;
                                            }
                                        }
                                        shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                        if (shortcutManager != null) {
                                            size = pinnedShortcuts.size();
                                        }
                                        if (size >= 5) {
                                            im3.R(e8.n(ru1Var13), null, null, new j0((Object) ru1Var13, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                        } else {
                                            l97Var = ru1Var13.z;
                                            do {
                                                value = l97Var.getValue();
                                            } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                        }
                                    }
                                }
                                break;
                            case 5:
                                ru1 ru1Var14 = ru1Var5;
                                fe1 fe1Var = ru1Var14.x;
                                ns1Var4.getClass();
                                long j6 = ns1Var4.a;
                                l97 l97Var2 = ru1Var14.J;
                                Long l = (Long) l97Var2.getValue();
                                if (l == null || l.longValue() != j6) {
                                    ms1 ms1Var = ns1Var4.f;
                                    if (ms1Var != null) {
                                        Long l2 = (Long) l97Var2.getValue();
                                        if (l2 != null) {
                                            ru1Var14.W0(l2.longValue());
                                        }
                                        l97Var2.l(null, Long.valueOf(j6));
                                        ru1Var14.m1(j6, true);
                                        im3.R(e8.n(ru1Var14), fe1Var, null, new pu1(ms1Var, ru1Var14, j6, null, (byte) 0), 2);
                                        Long l3 = ru1Var14.y;
                                        if (l3 != null) {
                                            im3.R(e8.n(ru1Var14), fe1Var, null, new qu1(l3.longValue(), ru1Var14, j6, null, (byte) 0), 2);
                                        }
                                    } else {
                                        ye4.c("DeviceInfoScreenViewModel", "no wake capability for " + j6);
                                    }
                                }
                                break;
                            default:
                                ru1 ru1Var15 = ru1Var5;
                                ru1Var15.X0();
                                ns1 ns1Var6 = ns1Var3;
                                ns1Var6.getClass();
                                du1 du1VarV0 = ru1.V0(ns1Var6);
                                ru1Var15.Q.add(du1VarV0);
                                im3.R(e8.n(ru1Var15), null, null, new tx(ru1Var15, ns1Var6, du1VarV0, null, (byte) 5), 3);
                                break;
                        }
                        return f88Var2;
                    }
                };
                ux2Var2.g0(objK25);
            }
            jt1Var = new jt1(function119, function1110, function1111, function1112, function1113, function1114, (Function0) objK25);
            if (z) {
                ux2Var2.W(956027158);
                h(z5, r17, au8.O(1055357172, new c91(wt1Var, ru1Var5, list, (byte) 2), ux2Var2), ux2Var2, ((i9 >> 15) & 112) | 384);
                ux2Var2.p(false);
                ru1Var7 = ru1Var5;
                fs4Var2 = fs4Var4;
            } else {
                ux2Var2.W(956692790);
                zH18 = ux2Var2.h(ru1Var5);
                objK26 = ux2Var2.K();
                if (zH18) {
                    objK26 = new m9(0, ru1Var5, ru1.class, "dismissMaximumShortcutsReachedDialog", "dismissMaximumShortcutsReachedDialog()V", 0, (byte) 22);
                    ux2Var2.g0(objK26);
                } else {
                    objK26 = new m9(0, ru1Var5, ru1.class, "dismissMaximumShortcutsReachedDialog", "dismissMaximumShortcutsReachedDialog()V", 0, (byte) 22);
                    ux2Var2.g0(objK26);
                }
                pu3 pu3Var7 = (pu3) objK26;
                zH19 = ux2Var2.h(ru1Var5);
                objK27 = ux2Var2.K();
                if (zH19) {
                    objK27 = new m9(0, ru1Var5, ru1.class, "dismissDeleteDeviceDialog", "dismissDeleteDeviceDialog()V", 0, (byte) 23);
                    ux2Var2.g0(objK27);
                } else {
                    objK27 = new m9(0, ru1Var5, ru1.class, "dismissDeleteDeviceDialog", "dismissDeleteDeviceDialog()V", 0, (byte) 23);
                    ux2Var2.g0(objK27);
                }
                pu3 pu3Var8 = (pu3) objK27;
                zH20 = ux2Var2.h(ru1Var5);
                objK28 = ux2Var2.K();
                if (zH20) {
                    ru1 ru1Var11 = ru1Var5;
                    objK28 = new m9(0, ru1Var11, ru1.class, "dismissDeviceUnavailableDialog", "dismissDeviceUnavailableDialog()V", 0, (byte) 24);
                    ru1Var6 = ru1Var11;
                    ux2Var2.g0(objK28);
                } else {
                    ru1 ru1Var12 = ru1Var5;
                    objK28 = new m9(0, ru1Var12, ru1.class, "dismissDeviceUnavailableDialog", "dismissDeviceUnavailableDialog()V", 0, (byte) 24);
                    ru1Var6 = ru1Var12;
                    ux2Var2.g0(objK28);
                }
                pu3 pu3Var9 = (pu3) objK28;
                Function0 function1115 = (Function0) pu3Var7;
                Function0 function1116 = (Function0) pu3Var8;
                zH21 = ux2Var2.h(ru1Var6) | ux2Var2.h(ns1Var3);
                objK29 = ux2Var2.K();
                if (zH21) {
                    final byte b1112 = 6;
                    objK29 = new Function0() { // from class: o.mt1
                        /* JADX WARN: Code duplicated, block: B:46:0x0138  */
                        /* JADX WARN: Code duplicated, block: B:50:0x0179  */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            ShortcutManager shortcutManager;
                            l97 l97Var;
                            Object value;
                            List<ShortcutInfo> pinnedShortcuts;
                            List<ShortcutInfo> pinnedShortcuts2;
                            byte b1113 = b1112;
                            byte size = 0;
                            size = 0;
                            byte b1114 = 1;
                            ru1 ru1Var13 = ru1Var6;
                            byte b1115 = 9;
                            ns1 ns1Var4 = ns1Var3;
                            hc1 hc1Var2 = null;
                            byte b1116 = 2;
                            f88 f88Var2 = f88.a;
                            switch (b1113) {
                                case 0:
                                    ns1Var4.getClass();
                                    im3.R(e8.n(ru1Var13), ru1Var13.x, null, new gu1(ru1Var13, ns1Var4, hc1Var2, b1116), 2);
                                    break;
                                case 1:
                                    ns1Var4.getClass();
                                    im3.R(e8.n(ru1Var13), ru1Var13.x, null, new gu1(ru1Var13, ns1Var4, hc1Var2, b1114), 2);
                                    break;
                                case 2:
                                    ns1Var4.getClass();
                                    im3.R(e8.n(ru1Var13), ru1Var13.x, null, new gu1(ru1Var13, ns1Var4, hc1Var2, size), 2);
                                    break;
                                case 3:
                                    ns1Var4.getClass();
                                    cr crVar = ru1Var13.p;
                                    xk1 xk1Var = ru1Var13.V;
                                    crVar.getClass();
                                    xk1Var.getClass();
                                    ru1 ru1Var14 = (ru1) xk1Var.n;
                                    long j5 = ns1Var4.a;
                                    BigInteger bigIntegerValueOf = (j5 <= 0 || j5 > 4294967295L) ? null : BigInteger.valueOf(144115188075855872L + j5);
                                    e27 e27Var = e27.a;
                                    if (bigIntegerValueOf != null) {
                                        IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                        if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                            ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(bigIntegerValueOf);
                                            if (chatConversationIDRequestPrivateRoomWithEndPoint == null || chatConversationIDRequestPrivateRoomWithEndPoint.Equal(ChatConversationID.getInvalidConversationID())) {
                                                ye4.a("DeviceChatHelper", "Not able to open device chat: invalid conversationId");
                                                im3.R(e8.n(ru1Var14), null, null, new oa1(ru1Var14, e27Var, hc1Var2, b1115), 3);
                                            } else {
                                                im3.R(e8.n(ru1Var14), null, null, new oa1((Object) ru1Var14, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var2, (byte) 8), 3);
                                            }
                                        } else {
                                            ye4.a("DeviceChatHelper", "Not able to open device chat: startChatUIModel == null");
                                            im3.R(e8.n(ru1Var14), null, null, new oa1(ru1Var14, e27Var, hc1Var2, b1115), 3);
                                        }
                                    } else {
                                        ye4.a("DeviceChatHelper", "Not able to open device chat: invalid dyngateId " + j5);
                                        im3.R(e8.n(ru1Var14), null, null, new oa1(ru1Var14, e27Var, hc1Var2, b1115), 3);
                                    }
                                    break;
                                case 4:
                                    ns1 ns1Var5 = ns1Var3;
                                    ns1Var5.getClass();
                                    ru1 ru1Var15 = ru1Var6;
                                    d31 d31Var = ru1Var15.f1953o;
                                    RemoteControlApplication remoteControlApplication = d31Var.a;
                                    RemoteControlApplication remoteControlApplication2 = d31Var.a;
                                    ShortcutManager shortcutManager2 = (ShortcutManager) remoteControlApplication.getSystemService(ShortcutManager.class);
                                    if (shortcutManager2 != null && shortcutManager2.isRequestPinShortcutSupported()) {
                                        String strValueOf = String.valueOf(ns1Var5.a);
                                        strValueOf.getClass();
                                        ShortcutManager shortcutManager3 = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                        hc1 hc1Var3 = null;
                                        if (shortcutManager3 == null || (pinnedShortcuts2 = shortcutManager3.getPinnedShortcuts()) == null || pinnedShortcuts2.isEmpty()) {
                                            shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                            if (shortcutManager != null && (pinnedShortcuts = shortcutManager.getPinnedShortcuts()) != null) {
                                                size = pinnedShortcuts.size();
                                            }
                                            if (size >= 5) {
                                                im3.R(e8.n(ru1Var15), null, null, new j0((Object) ru1Var15, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                            } else {
                                                l97Var = ru1Var15.z;
                                                do {
                                                    value = l97Var.getValue();
                                                } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                            }
                                        } else {
                                            Iterator<T> it = pinnedShortcuts2.iterator();
                                            while (it.hasNext()) {
                                                if (im3.n(((ShortcutInfo) it.next()).getId(), strValueOf)) {
                                                    im3.R(e8.n(ru1Var15), null, null, new oa1(ru1Var15, c37.a, hc1Var3, b1115), 3);
                                                    break;
                                                }
                                            }
                                            shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                            if (shortcutManager != null) {
                                                size = pinnedShortcuts.size();
                                            }
                                            if (size >= 5) {
                                                im3.R(e8.n(ru1Var15), null, null, new j0((Object) ru1Var15, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                            } else {
                                                l97Var = ru1Var15.z;
                                                do {
                                                    value = l97Var.getValue();
                                                } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                            }
                                        }
                                    }
                                    break;
                                case 5:
                                    ru1 ru1Var16 = ru1Var6;
                                    fe1 fe1Var = ru1Var16.x;
                                    ns1Var4.getClass();
                                    long j6 = ns1Var4.a;
                                    l97 l97Var2 = ru1Var16.J;
                                    Long l = (Long) l97Var2.getValue();
                                    if (l == null || l.longValue() != j6) {
                                        ms1 ms1Var = ns1Var4.f;
                                        if (ms1Var != null) {
                                            Long l2 = (Long) l97Var2.getValue();
                                            if (l2 != null) {
                                                ru1Var16.W0(l2.longValue());
                                            }
                                            l97Var2.l(null, Long.valueOf(j6));
                                            ru1Var16.m1(j6, true);
                                            im3.R(e8.n(ru1Var16), fe1Var, null, new pu1(ms1Var, ru1Var16, j6, null, (byte) 0), 2);
                                            Long l3 = ru1Var16.y;
                                            if (l3 != null) {
                                                im3.R(e8.n(ru1Var16), fe1Var, null, new qu1(l3.longValue(), ru1Var16, j6, null, (byte) 0), 2);
                                            }
                                        } else {
                                            ye4.c("DeviceInfoScreenViewModel", "no wake capability for " + j6);
                                        }
                                    }
                                    break;
                                default:
                                    ru1 ru1Var17 = ru1Var6;
                                    ru1Var17.X0();
                                    ns1 ns1Var6 = ns1Var3;
                                    ns1Var6.getClass();
                                    du1 du1VarV0 = ru1.V0(ns1Var6);
                                    ru1Var17.Q.add(du1VarV0);
                                    im3.R(e8.n(ru1Var17), null, null, new tx(ru1Var17, ns1Var6, du1VarV0, null, (byte) 5), 3);
                                    break;
                            }
                            return f88Var2;
                        }
                    };
                    ux2Var2.g0(objK29);
                } else {
                    final byte b1113 = 6;
                    objK29 = new Function0() { // from class: o.mt1
                        /* JADX WARN: Code duplicated, block: B:46:0x0138  */
                        /* JADX WARN: Code duplicated, block: B:50:0x0179  */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            ShortcutManager shortcutManager;
                            l97 l97Var;
                            Object value;
                            List<ShortcutInfo> pinnedShortcuts;
                            List<ShortcutInfo> pinnedShortcuts2;
                            byte b1114 = b1113;
                            byte size = 0;
                            size = 0;
                            byte b1115 = 1;
                            ru1 ru1Var13 = ru1Var6;
                            byte b1116 = 9;
                            ns1 ns1Var4 = ns1Var3;
                            hc1 hc1Var2 = null;
                            byte b1117 = 2;
                            f88 f88Var2 = f88.a;
                            switch (b1114) {
                                case 0:
                                    ns1Var4.getClass();
                                    im3.R(e8.n(ru1Var13), ru1Var13.x, null, new gu1(ru1Var13, ns1Var4, hc1Var2, b1117), 2);
                                    break;
                                case 1:
                                    ns1Var4.getClass();
                                    im3.R(e8.n(ru1Var13), ru1Var13.x, null, new gu1(ru1Var13, ns1Var4, hc1Var2, b1115), 2);
                                    break;
                                case 2:
                                    ns1Var4.getClass();
                                    im3.R(e8.n(ru1Var13), ru1Var13.x, null, new gu1(ru1Var13, ns1Var4, hc1Var2, size), 2);
                                    break;
                                case 3:
                                    ns1Var4.getClass();
                                    cr crVar = ru1Var13.p;
                                    xk1 xk1Var = ru1Var13.V;
                                    crVar.getClass();
                                    xk1Var.getClass();
                                    ru1 ru1Var14 = (ru1) xk1Var.n;
                                    long j5 = ns1Var4.a;
                                    BigInteger bigIntegerValueOf = (j5 <= 0 || j5 > 4294967295L) ? null : BigInteger.valueOf(144115188075855872L + j5);
                                    e27 e27Var = e27.a;
                                    if (bigIntegerValueOf != null) {
                                        IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                        if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                            ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(bigIntegerValueOf);
                                            if (chatConversationIDRequestPrivateRoomWithEndPoint == null || chatConversationIDRequestPrivateRoomWithEndPoint.Equal(ChatConversationID.getInvalidConversationID())) {
                                                ye4.a("DeviceChatHelper", "Not able to open device chat: invalid conversationId");
                                                im3.R(e8.n(ru1Var14), null, null, new oa1(ru1Var14, e27Var, hc1Var2, b1116), 3);
                                            } else {
                                                im3.R(e8.n(ru1Var14), null, null, new oa1((Object) ru1Var14, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var2, (byte) 8), 3);
                                            }
                                        } else {
                                            ye4.a("DeviceChatHelper", "Not able to open device chat: startChatUIModel == null");
                                            im3.R(e8.n(ru1Var14), null, null, new oa1(ru1Var14, e27Var, hc1Var2, b1116), 3);
                                        }
                                    } else {
                                        ye4.a("DeviceChatHelper", "Not able to open device chat: invalid dyngateId " + j5);
                                        im3.R(e8.n(ru1Var14), null, null, new oa1(ru1Var14, e27Var, hc1Var2, b1116), 3);
                                    }
                                    break;
                                case 4:
                                    ns1 ns1Var5 = ns1Var3;
                                    ns1Var5.getClass();
                                    ru1 ru1Var15 = ru1Var6;
                                    d31 d31Var = ru1Var15.f1953o;
                                    RemoteControlApplication remoteControlApplication = d31Var.a;
                                    RemoteControlApplication remoteControlApplication2 = d31Var.a;
                                    ShortcutManager shortcutManager2 = (ShortcutManager) remoteControlApplication.getSystemService(ShortcutManager.class);
                                    if (shortcutManager2 != null && shortcutManager2.isRequestPinShortcutSupported()) {
                                        String strValueOf = String.valueOf(ns1Var5.a);
                                        strValueOf.getClass();
                                        ShortcutManager shortcutManager3 = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                        hc1 hc1Var3 = null;
                                        if (shortcutManager3 == null || (pinnedShortcuts2 = shortcutManager3.getPinnedShortcuts()) == null || pinnedShortcuts2.isEmpty()) {
                                            shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                            if (shortcutManager != null && (pinnedShortcuts = shortcutManager.getPinnedShortcuts()) != null) {
                                                size = pinnedShortcuts.size();
                                            }
                                            if (size >= 5) {
                                                im3.R(e8.n(ru1Var15), null, null, new j0((Object) ru1Var15, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                            } else {
                                                l97Var = ru1Var15.z;
                                                do {
                                                    value = l97Var.getValue();
                                                } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                            }
                                        } else {
                                            Iterator<T> it = pinnedShortcuts2.iterator();
                                            while (it.hasNext()) {
                                                if (im3.n(((ShortcutInfo) it.next()).getId(), strValueOf)) {
                                                    im3.R(e8.n(ru1Var15), null, null, new oa1(ru1Var15, c37.a, hc1Var3, b1116), 3);
                                                    break;
                                                }
                                            }
                                            shortcutManager = (ShortcutManager) remoteControlApplication2.getSystemService(ShortcutManager.class);
                                            if (shortcutManager != null) {
                                                size = pinnedShortcuts.size();
                                            }
                                            if (size >= 5) {
                                                im3.R(e8.n(ru1Var15), null, null, new j0((Object) ru1Var15, (Object) ns1Var5, (Object) strValueOf, hc1Var3, (byte) 26), 3);
                                            } else {
                                                l97Var = ru1Var15.z;
                                                do {
                                                    value = l97Var.getValue();
                                                } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, true, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                                            }
                                        }
                                    }
                                    break;
                                case 5:
                                    ru1 ru1Var16 = ru1Var6;
                                    fe1 fe1Var = ru1Var16.x;
                                    ns1Var4.getClass();
                                    long j6 = ns1Var4.a;
                                    l97 l97Var2 = ru1Var16.J;
                                    Long l = (Long) l97Var2.getValue();
                                    if (l == null || l.longValue() != j6) {
                                        ms1 ms1Var = ns1Var4.f;
                                        if (ms1Var != null) {
                                            Long l2 = (Long) l97Var2.getValue();
                                            if (l2 != null) {
                                                ru1Var16.W0(l2.longValue());
                                            }
                                            l97Var2.l(null, Long.valueOf(j6));
                                            ru1Var16.m1(j6, true);
                                            im3.R(e8.n(ru1Var16), fe1Var, null, new pu1(ms1Var, ru1Var16, j6, null, (byte) 0), 2);
                                            Long l3 = ru1Var16.y;
                                            if (l3 != null) {
                                                im3.R(e8.n(ru1Var16), fe1Var, null, new qu1(l3.longValue(), ru1Var16, j6, null, (byte) 0), 2);
                                            }
                                        } else {
                                            ye4.c("DeviceInfoScreenViewModel", "no wake capability for " + j6);
                                        }
                                    }
                                    break;
                                default:
                                    ru1 ru1Var17 = ru1Var6;
                                    ru1Var17.X0();
                                    ns1 ns1Var6 = ns1Var3;
                                    ns1Var6.getClass();
                                    du1 du1VarV0 = ru1.V0(ns1Var6);
                                    ru1Var17.Q.add(du1VarV0);
                                    im3.R(e8.n(ru1Var17), null, null, new tx(ru1Var17, ns1Var6, du1VarV0, null, (byte) 5), 3);
                                    break;
                            }
                            return f88Var2;
                        }
                    };
                    ux2Var2.g0(objK29);
                }
                ru1Var7 = ru1Var6;
                b(wt1Var, ns1Var3, list, r17, jt1Var, function1115, function1116, (Function0) objK29, (Function0) pu3Var9, ux2Var2, i13 & 8064);
                fs4Var2 = r17;
                ux2Var2.p(false);
            }
            str2 = str4;
            ru1Var2 = ru1Var7;
        } else {
            ux2Var2 = ux2Var;
            ux2Var2.Q();
            fs4Var2 = fs4Var;
            str2 = str;
            ru1Var2 = ru1Var;
        }
        j56 j56VarR3 = ux2Var2.r();
        if (j56VarR3 != null) {
            final byte b28 = 0;
            j56VarR3.d = new hw2() { // from class: o.nt1
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    byte b1114 = b28;
                    f88 f88Var2 = f88.a;
                    int i14 = i2;
                    int i15 = i;
                    switch (b1114) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iY = yo1.Y(i15 | 1);
                            int iY2 = yo1.Y(i14);
                            vt1.a(ns1Var, z, function1, function2, function0, list, fs4Var2, function3, function4, function5, function6, str2, vx6Var, ru1Var2, (ux2) obj, iY, iY2, i3);
                            break;
                        case 1:
                            ((Integer) obj2).getClass();
                            int iY3 = yo1.Y(i15 | 1);
                            int iY4 = yo1.Y(i14);
                            vt1.a(ns1Var, z, function1, function2, function0, list, fs4Var2, function3, function4, function5, function6, str2, vx6Var, ru1Var2, (ux2) obj, iY3, iY4, i3);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iY5 = yo1.Y(i15 | 1);
                            int iY6 = yo1.Y(i14);
                            vt1.a(ns1Var, z, function1, function2, function0, list, fs4Var2, function3, function4, function5, function6, str2, vx6Var, ru1Var2, (ux2) obj, iY5, iY6, i3);
                            break;
                    }
                    return f88Var2;
                }
            };
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 15161. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static final void b(o.wt1 r35, o.ns1 r36, java.util.List r37, o.fs4 r38, o.jt1 r39, kotlin.jvm.functions.Function0 r40, kotlin.jvm.functions.Function0 r41, kotlin.jvm.functions.Function0 r42, kotlin.jvm.functions.Function0 r43, o.ux2 r44, int r45) {
        /*
            Method dump skipped, instruction units count: 1516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.vt1.b(o.wt1, o.ns1, java.util.List, o.fs4, o.jt1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, o.ux2, int):void");
    }

    public static final void c(Function0 function0, ux2 ux2Var, int i) {
        function0.getClass();
        ux2Var.Y(-1398643379);
        int i2 = i | (ux2Var.h(function0) ? 4 : 2);
        if (ux2Var.N(i2 & 1, (i2 & 3) != 2)) {
            uf0.b(function0, au8.O(-917625339, new v4(function0, (byte) 20), ux2Var), null, null, e8.h, e8.i, null, 0L, 0L, 0L, 0L, null, ux2Var, (i2 & 14) | 1769520, 0, 16284);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new v4(function0, i, (byte) 21);
        }
    }

    public static final void d(fs4 fs4Var, ux2 ux2Var, int i) {
        int i2;
        ux2Var.Y(-178376325);
        if ((i & 6) == 0) {
            i2 = (ux2Var.f(fs4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (ux2Var.N(i2 & 1, (i2 & 3) != 2)) {
            h72 h72Var = un4.a;
            List listL = qf0.L(new rv0(((rn4) ux2Var.j(h72Var)).a.B), new rv0(((rn4) ux2Var.j(h72Var)).a.r), new rv0(((rn4) ux2Var.j(h72Var)).a.B));
            rh3 rh3VarK = nv1.k(nv1.G("shimmer", ux2Var, 0), 0.0f, 1000.0f, db8.J(db8.I0(1200, 2, q72.c), 4), "managedByChipShimmer", ux2Var, 29112, 0);
            float fFloatValue = ((Number) rh3VarK.f1923o.getValue()).floatValue();
            bg5 bg5Var = rh3VarK.f1923o;
            ua0.a(androidx.compose.ui.platform.a.a(au8.r(iq8.j(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.p(fs4Var, 168.0f), 24.0f), sf6.a(8.0f)), new t94(listL, null, (((long) Float.floatToRawIntBits(((Number) bg5Var.getValue()).floatValue())) & 4294967295L) | (((long) Float.floatToRawIntBits(fFloatValue)) << 32), (((long) Float.floatToRawIntBits(((Number) bg5Var.getValue()).floatValue() + 200.0f)) << 32) | (((long) Float.floatToRawIntBits(((Number) bg5Var.getValue()).floatValue() + 200.0f)) & 4294967295L), 0), null, 6), "TVTA-devicesScreen-deviceInfoScreen-chip-deviceType-shimmer"), ux2Var, 0);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new ta0(fs4Var, i, (byte) 3);
        }
    }

    public static final void e(String str, boolean z, Function0 function0, hw2 hw2Var, fs4 fs4Var, ux2 ux2Var, int i) {
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(-1991425546);
        byte b2 = 2;
        int i2 = i | (ux2Var2.f(str) ? 4 : 2) | (ux2Var2.g(z) ? 32 : 16) | (ux2Var2.h(function0) ? 256 : 128) | (ux2Var2.h(hw2Var) ? 2048 : 1024) | (ux2Var2.f(fs4Var) ? 16384 : 8192);
        if (ux2Var2.N(i2 & 1, (i2 & 9363) != 9362)) {
            fs4 fs4VarJ = iq8.j(androidx.compose.foundation.layout.b.f(androidx.compose.foundation.layout.b.c(fs4Var, 1.0f), 56.0f, 0.0f, 2), sf6.a(8.0f));
            pe6 pe6Var = new pe6(1);
            boolean z2 = (i2 & 896) == 256;
            Object objK = ux2Var2.K();
            if (z2 || objK == e01.a) {
                objK = new or(function0, (byte) 6);
                ux2Var2.g0(objK);
            }
            fs4 fs4VarE = ka0.E(di1.J(fs4VarJ, z, pe6Var, (Function1) objK), 16.0f, 8.0f, 24.0f, 8.0f);
            dg6 dg6VarA = cg6.a(new ew(16.0f, new hk0(b2)), xz2.y, ux2Var2, 54);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4VarE);
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
            if (hw2Var == null) {
                ux2Var2.W(-1193520473);
            } else {
                ux2Var2.W(-1701068646);
                hw2Var.invoke(ux2Var2, Integer.valueOf((i2 >> 9) & 14));
            }
            ux2Var2.p(false);
            h72 h72Var = un4.a;
            qs7.b(str, new s14(1.0f, true), ((rn4) ux2Var2.j(h72Var)).a.q, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ((rn4) ux2Var2.j(h72Var)).b.j, ux2Var2, i2 & 14, 24960, 110584);
            ux2Var2 = ux2Var;
            di1.e(z, null, null, false, null, ux2Var2, ((i2 >> 3) & 14) | 48, 60);
            ux2Var2.p(true);
        } else {
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new xa(str, z, function0, hw2Var, fs4Var, i);
        }
    }

    public static final void f(boolean z, Function0 function0, Function0 function1, Function0 function2, fs4 fs4Var, ux2 ux2Var, int i) {
        int i2;
        ux2 ux2Var2 = ux2Var;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        ux2Var2.Y(-805976545);
        if ((i & 6) == 0) {
            i2 = (ux2Var2.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var2.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var2.h(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ux2Var2.h(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ux2Var2.f(fs4Var) ? 16384 : 8192;
        }
        if (ux2Var2.N(i2 & 1, (i2 & 9363) != 9362)) {
            hk6 hk6VarW = im3.W(ux2Var2);
            Object objK = ux2Var2.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = ck3.w(ux2Var2);
                ux2Var2.g0(objK);
            }
            me1 me1Var = (me1) objK;
            Object[] objArr = new Object[0];
            Object objK2 = ux2Var2.K();
            if (objK2 == awVar) {
                objK2 = new ti4((byte) 21);
                ux2Var2.g0(objK2);
            }
            px4 px4Var = (px4) zu1.L(objArr, (Function0) objK2, ux2Var2, 48);
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
            qs1.k((i2 >> 9) & 14, function2, ux2Var2, null);
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
            boolean zF = ux2Var2.f(px4Var);
            Object objK3 = ux2Var2.K();
            if (zF || objK3 == awVar) {
                objK3 = new va(px4Var, (byte) 18);
                ux2Var2.g0(objK3);
            }
            Function1 function3 = (Function1) objK3;
            if (1.0f <= 0.0d) {
                ii3.a("invalid weight; must be greater than zero");
            }
            et1.g(0, function3, ux2Var2, androidx.compose.foundation.layout.b.f(new s14(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, false).f(fillElement), 0.0f, 240.0f, 1));
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
            String str = (String) px4Var.getValue();
            h72 h72Var = un4.a;
            qs7.b(str, null, ((rn4) ux2Var2.j(h72Var)).a.q, 0L, null, 0L, new qo7(3), 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(h72Var)).b.e, ux2Var, 0, 0, 130042);
            ux2Var2 = ux2Var;
            l47.g((i2 & 14) | 3072 | (i2 & 112) | (i2 & 896), function0, function1, ux2Var2, androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), z);
            ux2Var2.p(true);
            ux2Var2.p(true);
            ux2Var2.p(true);
        } else {
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new q75(z, function0, function1, function2, fs4Var, i, (byte) 1);
        }
    }

    public static final void g(int i, String str, Function0 function0, ux2 ux2Var, fs4 fs4Var) {
        String str2;
        function0.getClass();
        ux2Var.Y(1408757360);
        int i2 = (ux2Var.h(function0) ? 4 : 2) | i | (ux2Var.f(fs4Var) ? 32 : 16) | 384;
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            str2 = "TVTA-settings-permissions";
            x37.e(new sk7(y57.g(R.string.settings_permissions), null, new yk7(R.drawable.shield_checkmark), null, 26), fs4Var, null, function0, "TVTA-settings-permissions", ux2Var, ((i2 << 9) & 7168) | (i2 & 112) | 24576, 36);
        } else {
            ux2Var.Q();
            str2 = str;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new gd1(function0, fs4Var, str2, i, (byte) 4);
        }
    }

    public static final void h(boolean z, fs4 fs4Var, yy0 yy0Var, ux2 ux2Var, int i) {
        int i2;
        boolean z2;
        ux2Var.Y(-1485539261);
        if ((i & 6) == 0) {
            i2 = (ux2Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.f(fs4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.h(yy0Var) ? 256 : 128;
        }
        int i3 = i2;
        if (ux2Var.N(i3 & 1, (i3 & 147) != 146)) {
            iq2 iq2Var = (iq2) ux2Var.j(b11.i);
            q57 q57Var = (q57) ux2Var.j(b11.q);
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = new sq2();
                ux2Var.g0(objK);
            }
            sq2 sq2Var = (sq2) objK;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zH = ((i3 & 14) == 4) | ux2Var.h(iq2Var) | ux2Var.f(q57Var);
            Object objK2 = ux2Var.K();
            if (zH || objK2 == awVar) {
                ko2 ko2Var = new ko2(z, iq2Var, sq2Var, q57Var, null, (byte) 16);
                ux2Var.g0(ko2Var);
                objK2 = ko2Var;
            }
            ck3.i(boolValueOf, (hw2) objK2, ux2Var);
            y50 y50Var = xz2.f2564o;
            do4 do4VarC = ua0.c(y50Var, false);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4Var);
            yz0.c.getClass();
            ux2Var.a0();
            boolean z3 = ux2Var.S;
            tg3 tg3Var = LayoutNode.e0;
            if (z3) {
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
            int i4 = (i3 << 3) & 7168;
            do4 do4VarC2 = ua0.c(y50Var, false);
            int iHashCode2 = Long.hashCode(ux2Var.T);
            yj5 yj5VarL2 = ux2Var.l();
            fs4 fs4VarS2 = uf0.s(ux2Var, cs4.b);
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
            yy0Var.d(ya0.a, ux2Var, Integer.valueOf(((i4 >> 6) & 112) | 6));
            ux2Var.p(true);
            if (z) {
                ux2Var.W(-1215698058);
                ra0 ra0Var = new ra0(xz2.s, true);
                p90 p90Var = p90.a;
                fs4 fs4VarS3 = au8.s(ra0Var, rv0.b(0.32f, bw0.c(hm3.x, ux2Var)), kh.V);
                Object objK3 = ux2Var.K();
                if (objK3 == awVar) {
                    objK3 = al1.c;
                    ux2Var.g0(objK3);
                }
                z2 = true;
                ua0.a(androidx.compose.ui.platform.a.a(xk0.u(uf0.n(qg7.a(fs4VarS3, f88.a, (PointerInputEventHandler) objK3), sq2Var), true, null), "TVTA-devicesScreen-savePendingInputBlocker"), ux2Var, 0);
                ux2Var.p(false);
            } else {
                z2 = true;
                ux2Var.W(-1215295399);
                ux2Var.p(false);
            }
            ux2Var.p(z2);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new cn1(z, (Object) fs4Var, (Object) yy0Var, i, (byte) 7);
        }
    }

    public static final void i(List list, Function1 function1, Function1 function2, Function1 function3, hw2 hw2Var, fs4 fs4Var, Function1 function4, iw2 iw2Var, String str, String str2, ux2 ux2Var, int i) {
        boolean z;
        Object zi3Var;
        list.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        hw2Var.getClass();
        ux2Var.Y(-968639047);
        int i2 = i | (ux2Var.f(list) ? 4 : 2) | (ux2Var.h(function1) ? 32 : 16) | (ux2Var.h(function2) ? 256 : 128) | (ux2Var.f(fs4Var) ? 131072 : 65536) | (ux2Var.f(str) ? 67108864 : 33554432) | (ux2Var.f(str2) ? 536870912 : 268435456);
        if (ux2Var.N(i2 & 1, (306783379 & i2) != 306783378)) {
            ux2Var.S();
            if ((i & 1) != 0 && !ux2Var.x()) {
                ux2Var.Q();
            }
            ux2Var.q();
            Object[] objArr = new Object[0];
            Object objK = ux2Var.K();
            Object obj = e01.a;
            if (objK == obj) {
                objK = new w26((byte) 23);
                ux2Var.g0(objK);
            }
            px4 px4Var = (px4) zu1.L(objArr, (Function0) objK, ux2Var, 48);
            boolean zF = ux2Var.f((String) px4Var.getValue()) | ((i2 & 14) == 4);
            Object objK2 = ux2Var.K();
            if (zF || objK2 == obj) {
                if (ub7.b0((String) px4Var.getValue())) {
                    objK2 = list;
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (((Boolean) hw2Var.invoke(obj2, (String) px4Var.getValue())).booleanValue()) {
                            arrayList.add(obj2);
                        }
                    }
                    objK2 = arrayList;
                }
                ux2Var.g0(objK2);
            }
            List list2 = (List) objK2;
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var, 0);
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
            o67.n(kw0VarA, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS, d82.t, ux2Var);
            String str3 = (String) px4Var.getValue();
            boolean zF2 = ux2Var.f(px4Var);
            Object objK3 = ux2Var.K();
            if (zF2 || objK3 == obj) {
                objK3 = new va(px4Var, (byte) 25);
                ux2Var.g0(objK3);
            }
            it1.h(str3, (Function1) objK3, str, null, ux2Var, (i2 >> 18) & 896);
            if (list2.isEmpty()) {
                z = true;
                ux2Var.W(-2023516575);
                it1.g(0, (String) px4Var.getValue(), ux2Var, null);
                ux2Var.p(false);
            } else {
                ux2Var.W(-2024187849);
                w44 w44VarA = z44.a(0, 0, ux2Var, 3);
                fs4 fs4VarR = androidx.compose.foundation.layout.b.r(androidx.compose.foundation.layout.b.c(cs4.b, 1.0f));
                pd5 pd5VarJ = ka0.j(0.0f, 16.0f, 0.0f, 0.0f, 13);
                boolean zH = ux2Var.h(list2) | ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((1879048192 & i2) == 536870912);
                Object objK4 = ux2Var.K();
                if (zH || objK4 == obj) {
                    z = true;
                    zi3Var = new zi3(list2, function4, function3, function1, function2, iw2Var, str2, (byte) 1);
                    ux2Var.g0(zi3Var);
                } else {
                    zi3Var = objK4;
                    z = true;
                }
                yo1.i(390, 504, (Function1) zi3Var, null, null, null, null, ux2Var, w44VarA, fs4VarR, pd5VarJ, false);
                ux2Var.p(false);
            }
            ux2Var.p(z);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new xe5(list, function1, function2, function3, hw2Var, fs4Var, function4, iw2Var, str, str2, i);
        }
    }

    public static final void k(oe8 oe8Var, a65 a65Var, x84 x84Var) {
        a65Var.getClass();
        x84Var.getClass();
        sh6 sh6Var = (sh6) oe8Var.T0("androidx.lifecycle.savedstate.vm.tag");
        if (sh6Var == null || sh6Var.f2023o) {
            return;
        }
        sh6Var.j(a65Var, x84Var);
        m84 m84Var = x84Var.i;
        if (m84Var == m84.n || m84Var.compareTo(m84.p) >= 0) {
            a65Var.U0();
        } else {
            x84Var.a(new sk1((Object) x84Var, (Object) a65Var, (byte) 1));
        }
    }

    public static final v56 l(i04 i04Var) {
        i04 i04VarF = i04Var.F();
        return i04VarF != null ? i04VarF.b(i04Var, true) : new v56(0.0f, 0.0f, (int) (i04Var.j() >> 32), (int) (i04Var.j() & 4294967295L));
    }

    public static final v56 m(i04 i04Var, boolean z) {
        i04 i04VarS = s(i04Var);
        float fJ = (int) (i04VarS.j() >> 32);
        float fJ2 = (int) (i04VarS.j() & 4294967295L);
        v56 v56VarB = i04VarS.b(i04Var, z);
        float f = v56VarB.a;
        if (z) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f > fJ) {
                f = fJ;
            }
        }
        float f2 = v56VarB.b;
        if (z) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > fJ2) {
                f2 = fJ2;
            }
        }
        float f3 = v56VarB.c;
        if (z) {
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 <= fJ) {
                fJ = f3;
            }
            f3 = fJ;
        }
        float f4 = v56VarB.d;
        if (z) {
            float f5 = f4 >= 0.0f ? f4 : 0.0f;
            if (f5 <= fJ2) {
                fJ2 = f5;
            }
            f4 = fJ2;
        }
        if (f == f3 || f2 == f4) {
            return v56.e;
        }
        long jE = i04VarS.e((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long jE2 = i04VarS.e((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long jE3 = i04VarS.e((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L));
        long jE4 = i04VarS.e((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jE >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jE2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jE4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jE3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jE & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jE2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jE4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jE3 & 4294967295L));
        return new v56(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static final void n(View view) {
        view.getClass();
        aq6 aq6VarM = ct1.M(new ji(view, null, (byte) 2));
        while (aq6VarM.hasNext()) {
            ArrayList arrayList = y((View) aq6VarM.next()).a;
            int size = arrayList.size();
            while (true) {
                size--;
                if (-1 < size) {
                    ((ce8) arrayList.get(size)).a.e();
                }
            }
        }
    }

    public static final sz3 o(sz3 sz3Var, HashSet hashSet) {
        g07 g07VarG;
        sz3 sz3VarO;
        xz2 xz2Var = xz2.W;
        k48 k48VarC = xz2Var.c(sz3Var);
        if (hashSet.add(k48VarC)) {
            d58 d58VarD = db8.D(k48VarC);
            if (d58VarD != null) {
                sz3 sz3VarN = n37.n(d58VarD);
                sz3 sz3VarO2 = o(sz3VarN, hashSet);
                if (sz3VarO2 != null) {
                    boolean z = db8.S(xz2Var.c(sz3VarN)) || ((sz3VarN instanceof i07) && db8.Y((i07) sz3VarN));
                    if ((sz3VarO2 instanceof i07) && db8.Y((i07) sz3VarO2) && db8.X(sz3Var) && z) {
                        return xz2Var.A0(sz3VarN);
                    }
                    return (!db8.X(sz3VarO2) && (sz3Var instanceof i07) && db8.V((i07) sz3Var)) ? xz2Var.A0(sz3VarO2) : sz3VarO2;
                }
            } else {
                if (!db8.S(k48VarC)) {
                    return sz3Var;
                }
                sz3Var.getClass();
                if (sz3Var instanceof oz3) {
                    g07VarG = pi3.g((oz3) sz3Var);
                } else {
                    StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                    sb.append(sz3Var);
                    sb.append(", ");
                    gk0.h(ua5.o(w86.a, sz3Var.getClass(), sb));
                    g07VarG = null;
                }
                if (g07VarG != null && (sz3VarO = o(g07VarG, hashSet)) != null) {
                    if (!db8.X(sz3Var)) {
                        return sz3VarO;
                    }
                    if (db8.X(sz3VarO)) {
                        return sz3Var;
                    }
                    return ((sz3VarO instanceof i07) && db8.Y((i07) sz3VarO)) ? sz3Var : xz2Var.A0(sz3VarO);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static hc1 p(hc1 hc1Var, hc1 hc1Var2, hw2 hw2Var) {
        hw2Var.getClass();
        if (hw2Var instanceof i30) {
            return ((i30) hw2Var).create(hc1Var, hc1Var2);
        }
        de1 context = hc1Var2.getContext();
        return context == ba2.m ? new jm3(hc1Var2, hc1Var, hw2Var) : new km3(hc1Var2, context, hw2Var, hc1Var);
    }

    public static final cp1 q(ow5 ow5Var) {
        switch (ow5Var == null ? -1 : tw5.b[ow5Var.ordinal()]) {
            case 1:
                cp1 cp1Var = dp1.d;
                cp1Var.getClass();
                return cp1Var;
            case 2:
                cp1 cp1Var2 = dp1.a;
                cp1Var2.getClass();
                return cp1Var2;
            case 3:
                cp1 cp1Var3 = dp1.b;
                cp1Var3.getClass();
                return cp1Var3;
            case 4:
                cp1 cp1Var4 = dp1.c;
                cp1Var4.getClass();
                return cp1Var4;
            case 5:
                cp1 cp1Var5 = dp1.e;
                cp1Var5.getClass();
                return cp1Var5;
            case 6:
                cp1 cp1Var6 = dp1.f;
                cp1Var6.getClass();
                return cp1Var6;
            default:
                cp1 cp1Var7 = dp1.a;
                cp1Var7.getClass();
                return cp1Var7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x002f, B:25:0x0054, B:29:0x0069, B:31:0x0071, B:20:0x0045, B:24:0x0050), top: B:50:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r1.c(r10, r0) == r5) goto L33;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0083 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(o.ho2 r7, o.wm0 r8, boolean r9, o.hc1 r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof o.no2
            if (r0 == 0) goto L13
            r0 = r10
            o.no2 r0 = (o.no2) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            o.no2 r0 = new o.no2
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.q
            int r1 = r0.r
            r2 = 2
            r3 = 1
            r4 = 0
            o.ne1 r5 = o.ne1.m
            if (r1 == 0) goto L49
            if (r1 == r3) goto L3d
            if (r1 != r2) goto L37
            boolean r9 = r0.p
            o.ff0 r7 = r0.f1584o
            o.wm0 r8 = r0.n
            o.ho2 r1 = r0.m
            o.ct1.a0(r10)     // Catch: java.lang.Throwable -> L35
        L32:
            r10 = r7
            r7 = r1
            goto L54
        L35:
            r7 = move-exception
            goto L8e
        L37:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            o.hk0.l(r7)
            return r4
        L3d:
            boolean r9 = r0.p
            o.ff0 r7 = r0.f1584o
            o.wm0 r8 = r0.n
            o.ho2 r1 = r0.m
            o.ct1.a0(r10)     // Catch: java.lang.Throwable -> L35
            goto L69
        L49:
            o.ct1.a0(r10)
            boolean r10 = r7 instanceof o.gv7
            if (r10 != 0) goto La9
            o.ff0 r10 = r8.iterator()     // Catch: java.lang.Throwable -> L35
        L54:
            r0.m = r7     // Catch: java.lang.Throwable -> L35
            r0.n = r8     // Catch: java.lang.Throwable -> L35
            r0.f1584o = r10     // Catch: java.lang.Throwable -> L35
            r0.p = r9     // Catch: java.lang.Throwable -> L35
            r0.r = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r10.b(r0)     // Catch: java.lang.Throwable -> L35
            if (r1 != r5) goto L65
            goto L85
        L65:
            r6 = r1
            r1 = r7
            r7 = r10
            r10 = r6
        L69:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L86
            java.lang.Object r10 = r7.c()     // Catch: java.lang.Throwable -> L35
            r0.m = r1     // Catch: java.lang.Throwable -> L35
            r0.n = r8     // Catch: java.lang.Throwable -> L35
            r0.f1584o = r7     // Catch: java.lang.Throwable -> L35
            r0.p = r9     // Catch: java.lang.Throwable -> L35
            r0.r = r2     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r1.c(r10, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r5) goto L32
        L85:
            return r5
        L86:
            if (r9 == 0) goto L8b
            r8.j(r4)
        L8b:
            o.f88 r7 = o.f88.a
            return r7
        L8e:
            throw r7     // Catch: java.lang.Throwable -> L8f
        L8f:
            r10 = move-exception
            if (r9 == 0) goto La8
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L99
            r4 = r7
            java.util.concurrent.CancellationException r4 = (java.util.concurrent.CancellationException) r4
        L99:
            if (r4 != 0) goto La5
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            r4.<init>(r9)
            r4.initCause(r7)
        La5:
            r8.j(r4)
        La8:
            throw r10
        La9:
            o.gv7 r7 = (o.gv7) r7
            java.lang.Throwable r7 = r7.m
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.vt1.r(o.ho2, o.wm0, boolean, o.hc1):java.lang.Object");
    }

    public static final i04 s(i04 i04Var) {
        i04 i04Var2;
        i04 i04VarF = i04Var.F();
        while (true) {
            i04 i04Var3 = i04VarF;
            i04Var2 = i04Var;
            i04Var = i04Var3;
            if (i04Var == null) {
                break;
            }
            i04VarF = i04Var.F();
        }
        e45 e45Var = i04Var2 instanceof e45 ? (e45) i04Var2 : null;
        if (e45Var == null) {
            return i04Var2;
        }
        e45 e45Var2 = e45Var.K;
        while (true) {
            e45 e45Var3 = e45Var2;
            e45 e45Var4 = e45Var;
            e45Var = e45Var3;
            if (e45Var == null) {
                return e45Var4;
            }
            e45Var2 = e45Var.K;
        }
    }

    public static jo4 t(String str) {
        str.getClass();
        fn4 fn4VarB = jo4.e.b(0, str);
        if (fn4VarB == null) {
            hk0.g(to7.i('\"', "No subtype found for: \"", str));
            return null;
        }
        String str2 = (String) ((dn4) fn4VarB.a()).get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        lowerCase.getClass();
        String lowerCase2 = ((String) ((dn4) fn4VarB.a()).get(2)).toLowerCase(locale);
        lowerCase2.getClass();
        ArrayList arrayList = new ArrayList();
        int i = fn4VarB.b().n;
        while (true) {
            int i2 = i + 1;
            if (i2 >= str.length()) {
                return new jo4(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
            }
            fn4 fn4VarB2 = jo4.f.b(i2, str);
            if (fn4VarB2 == null) {
                throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + str.substring(i2) + "\" for: \"" + str + '\"').toString());
            }
            en4 en4Var = fn4VarB2.c;
            cn4 cn4VarB = en4Var.b(1);
            String str3 = cn4VarB != null ? cn4VarB.a : null;
            if (str3 == null) {
                i = fn4VarB2.b().n;
            } else {
                cn4 cn4VarB2 = en4Var.b(2);
                String strSubstring = cn4VarB2 != null ? cn4VarB2.a : null;
                if (strSubstring == null) {
                    cn4 cn4VarB3 = en4Var.b(3);
                    cn4VarB3.getClass();
                    strSubstring = cn4VarB3.a;
                } else if (strSubstring.length() > 0 && qf0.u(strSubstring.charAt(0), '\'', false) && ub7.T(strSubstring, '\'') && strSubstring.length() > 2) {
                    strSubstring = strSubstring.substring(1, strSubstring.length() - 1);
                }
                arrayList.add(str3);
                arrayList.add(strSubstring);
                i = fn4VarB2.b().n;
            }
        }
    }

    public static final long u(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static Intent v(xr xrVar) {
        Intent parentActivityIntent = xrVar.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strX = x(xrVar, xrVar.getComponentName());
            if (strX == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(xrVar, strX);
            try {
                return x(xrVar, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                io.sentry.android.core.v0.c("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strX + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static Intent w(xr xrVar, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strX = x(xrVar, componentName);
        if (strX == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strX);
        return x(xrVar, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String x(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static final uo5 y(View view) {
        uo5 uo5Var = (uo5) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (uo5Var != null) {
            return uo5Var;
        }
        uo5 uo5Var2 = new uo5();
        view.setTag(R.id.pooling_container_listener_holder_tag, uo5Var2);
        return uo5Var2;
    }

    public static pf6 z(Display display, int i) {
        RoundedCorner roundedCorner;
        int i2;
        if (Build.VERSION.SDK_INT < 31 || (roundedCorner = display.getRoundedCorner(i)) == null) {
            return null;
        }
        int position = roundedCorner.getPosition();
        if (position != 0) {
            i2 = 1;
            if (position != 1) {
                i2 = 2;
                if (position != 2) {
                    i2 = 3;
                    if (position != 3) {
                        hk0.g(fx3.e(position, "Invalid position: "));
                        return null;
                    }
                }
            }
        } else {
            i2 = 0;
        }
        return new pf6(i2, roundedCorner.getRadius(), roundedCorner.getCenter());
    }

    public abstract String j();

    public String toString() {
        switch (this.a) {
            case ep1.c /* 10 */:
                return j();
            default:
                return super.toString();
        }
    }
}
