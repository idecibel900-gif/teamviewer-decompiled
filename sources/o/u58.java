package o;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class u58 extends r47 {
    public static Class l = null;
    public static Constructor m = null;
    public static Method n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static Method f2173o = null;
    public static boolean p = false;
    public final Class e;
    public final Constructor f;
    public final Method g;
    public final Method h;
    public final Method i;
    public final Method j;
    public final Method k;

    public u58() throws NoSuchMethodException {
        Method methodK;
        Constructor<?> constructor;
        Method methodJ;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodJ = J(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodK = K(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            io.sentry.android.core.v0.d("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            methodK = null;
            constructor = null;
            methodJ = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.e = cls;
        this.f = constructor;
        this.g = methodJ;
        this.h = method;
        this.i = method2;
        this.j = method3;
        this.k = methodK;
    }

    public static boolean F(Object obj, String str, int i, boolean z) throws NoSuchMethodException {
        I();
        try {
            return ((Boolean) n.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            gk0.r(e);
            return false;
        }
    }

    public static void I() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (p) {
            return;
        }
        p = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            io.sentry.android.core.v0.d("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        m = constructor;
        l = cls;
        n = method2;
        f2173o = method;
    }

    public static Method J(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public final boolean E(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.g.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface G(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.e, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.k.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean H(Object obj) {
        try {
            return ((Boolean) this.i.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method K(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // o.r47
    public final Typeface m(Context context, es2 es2Var, Resources resources, int i) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        InputStream inputStreamOpenRawResource;
        fs2[] fs2VarArr = es2Var.a;
        Method method = this.g;
        if (method == null) {
            io.sentry.android.core.v0.j("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        int i2 = 0;
        if (method == null) {
            I();
            try {
                Object objNewInstance2 = m.newInstance(null);
                for (fs2 fs2Var : fs2VarArr) {
                    File fileL = u47.l(context);
                    if (fileL != null) {
                        try {
                            try {
                                inputStreamOpenRawResource = resources.openRawResource(fs2Var.f);
                                try {
                                    boolean zH = u47.h(fileL, inputStreamOpenRawResource);
                                    if (inputStreamOpenRawResource != null) {
                                        try {
                                            inputStreamOpenRawResource.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                    if (!zH) {
                                        fileL.delete();
                                        return null;
                                    }
                                    if (!F(objNewInstance2, fileL.getPath(), fs2Var.b, fs2Var.c)) {
                                        fileL.delete();
                                        return null;
                                    }
                                    fileL.delete();
                                } catch (Throwable th) {
                                    th = th;
                                    Throwable th2 = th;
                                    if (inputStreamOpenRawResource == null) {
                                        throw th2;
                                    }
                                    try {
                                        inputStreamOpenRawResource.close();
                                        throw th2;
                                    } catch (IOException unused2) {
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                inputStreamOpenRawResource = null;
                            }
                        } catch (RuntimeException unused3) {
                            fileL.delete();
                            return null;
                        } catch (Throwable th4) {
                            fileL.delete();
                            throw th4;
                        }
                    }
                }
                I();
                try {
                    Object objNewInstance3 = Array.newInstance((Class<?>) l, 1);
                    Array.set(objNewInstance3, 0, objNewInstance2);
                    return (Typeface) f2173o.invoke(null, objNewInstance3);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    gk0.r(e);
                    return null;
                }
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
                gk0.r(e2);
                return null;
            }
        }
        try {
            objNewInstance = this.f.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused4) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            int length = fs2VarArr.length;
            while (i2 < length) {
                fs2 fs2Var2 = fs2VarArr[i2];
                u58 u58Var = this;
                Context context2 = context;
                if (u58Var.E(context2, objNewInstance, fs2Var2.a, fs2Var2.e, fs2Var2.b, fs2Var2.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(fs2Var2.d))) {
                    i2++;
                    this = u58Var;
                    context = context2;
                } else {
                    try {
                        u58Var.j.invoke(objNewInstance, null);
                    } catch (IllegalAccessException | InvocationTargetException unused5) {
                    }
                }
            }
            u58 u58Var2 = this;
            if (u58Var2.H(objNewInstance)) {
                return u58Var2.G(objNewInstance);
            }
        }
        return null;
    }

    @Override // o.r47
    public final Typeface n(Context context, ps2[] ps2VarArr, int i) throws IOException {
        Object objNewInstance;
        Typeface typefaceG;
        boolean zBooleanValue;
        if (ps2VarArr.length >= 1) {
            Method method = this.g;
            if (method == null) {
                io.sentry.android.core.v0.j("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap map = new HashMap();
                    for (ps2 ps2Var : ps2VarArr) {
                        if (ps2Var.f == 0) {
                            Uri uri = ps2Var.a;
                            if (!map.containsKey(uri)) {
                                map.put(uri, u47.o(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.f.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = ps2VarArr.length;
                        int i2 = 0;
                        boolean z = false;
                        while (true) {
                            Method method2 = this.j;
                            if (i2 >= length) {
                                if (!z) {
                                    method2.invoke(objNewInstance, null);
                                    break;
                                }
                                if (!H(objNewInstance) || (typefaceG = G(objNewInstance)) == null) {
                                    break;
                                    break;
                                }
                                return Typeface.create(typefaceG, i);
                            }
                            ps2 ps2Var2 = ps2VarArr[i2];
                            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(ps2Var2.a);
                            if (byteBuffer != null) {
                                try {
                                    zBooleanValue = ((Boolean) this.h.invoke(objNewInstance, byteBuffer, Integer.valueOf(ps2Var2.b), null, Integer.valueOf(ps2Var2.c), Integer.valueOf(ps2Var2.d ? 1 : 0))).booleanValue();
                                } catch (IllegalAccessException | InvocationTargetException unused2) {
                                    zBooleanValue = false;
                                }
                                if (!zBooleanValue) {
                                    method2.invoke(objNewInstance, null);
                                    break;
                                }
                                z = true;
                            }
                            i2++;
                            z = z;
                        }
                    }
                } else {
                    int i3 = (i & 1) == 0 ? 400 : 700;
                    boolean z2 = (i & 2) != 0;
                    int i4 = Integer.MAX_VALUE;
                    ps2 ps2Var3 = null;
                    for (ps2 ps2Var4 : ps2VarArr) {
                        int iAbs = (Math.abs(ps2Var4.c - i3) * 2) + (ps2Var4.d == z2 ? 0 : 1);
                        if (ps2Var3 == null || i4 > iAbs) {
                            ps2Var3 = ps2Var4;
                            i4 = iAbs;
                        }
                    }
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(ps2Var3.a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(ps2Var3.c).setItalic(ps2Var3.d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // o.r47
    public final Typeface p(Context context, Resources resources, int i, String str) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        InputStream inputStreamOpenRawResource;
        Method method = this.g;
        if (method == null) {
            io.sentry.android.core.v0.j("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                objNewInstance = this.f.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                objNewInstance = null;
            }
            if (objNewInstance != null) {
                if (!E(context, objNewInstance, str, 0, -1, -1, null)) {
                    try {
                        this.j.invoke(objNewInstance, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                } else if (H(objNewInstance)) {
                    return G(objNewInstance);
                }
            }
        } else {
            File fileL = u47.l(context);
            try {
                if (fileL != null) {
                    try {
                        inputStreamOpenRawResource = resources.openRawResource(i);
                        try {
                            boolean zH = u47.h(fileL, inputStreamOpenRawResource);
                            if (inputStreamOpenRawResource != null) {
                                try {
                                    inputStreamOpenRawResource.close();
                                } catch (IOException unused3) {
                                }
                            }
                            if (!zH) {
                                fileL.delete();
                                return null;
                            }
                            Typeface typefaceCreateFromFile = Typeface.createFromFile(fileL.getPath());
                            fileL.delete();
                            return typefaceCreateFromFile;
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            if (inputStreamOpenRawResource == null) {
                                throw th2;
                            }
                            try {
                                inputStreamOpenRawResource.close();
                                throw th2;
                            } catch (IOException unused4) {
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStreamOpenRawResource = null;
                    }
                }
            } catch (RuntimeException unused5) {
                return null;
            } finally {
                fileL.delete();
            }
        }
        return null;
    }
}
