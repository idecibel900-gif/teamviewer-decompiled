package o;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.functions.Function1;
import org.jetbrains.compose.resources.AndroidContextProvider;

/* JADX INFO: loaded from: classes2.dex */
public final class pe3 extends og7 implements Function1 {
    public Function1 m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function1 f1730o;
    public final /* synthetic */ jj1 p;
    public final /* synthetic */ String q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe3(Function1 function1, jj1 jj1Var, String str, hc1 hc1Var) {
        super(1, hc1Var);
        this.f1730o = function1;
        this.p = jj1Var;
        this.q = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        jj1 jj1Var = this.p;
        String str = this.q;
        return new pe3(this.f1730o, jj1Var, str, (hc1) obj).invokeSuspend(f88.a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0068  */
    /* JADX WARN: Code duplicated, block: B:32:0x006e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0074  */
    /* JADX WARN: Code duplicated, block: B:36:0x0084  */
    /* JADX WARN: Code duplicated, block: B:38:0x008e  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a6 A[Catch: all -> 0x00c4, LOOP:0: B:40:0x00a4->B:41:0x00a6, LOOP_END, TryCatch #2 {all -> 0x00c4, blocks: (B:39:0x008f, B:41:0x00a6, B:42:0x00af), top: B:59:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00bd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x00be  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cb  */
    @Override // o.i30
    public final Object invokeSuspend(Object obj) throws or4, IOException {
        AssetManager assets;
        InputStream inputStreamOpen;
        ClassLoader classLoader;
        InputStream resourceAsStream;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        int i;
        ne1 ne1Var;
        Function1 function1;
        boolean z = this.n;
        if (!z) {
            ct1.a0(obj);
            String str = this.q;
            Function1 function2 = this.f1730o;
            this.m = function2;
            this.n = true;
            this.p.getClass();
            try {
                try {
                    try {
                        Context context = AndroidContextProvider.m;
                        AssetManager assets2 = context != null ? context.getAssets() : null;
                        if (assets2 == null || (inputStreamOpen = assets2.open(str)) == null) {
                            throw new FileNotFoundException("Current AssetManager is null.");
                        }
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStreamOpen.available()));
                            bArr = new byte[8192];
                            for (i = inputStreamOpen.read(bArr); i >= 0; i = inputStreamOpen.read(bArr)) {
                                byteArrayOutputStream.write(bArr, 0, i);
                            }
                            obj = byteArrayOutputStream.toByteArray();
                            obj.getClass();
                            inputStreamOpen.close();
                            ne1Var = ne1.m;
                            if (obj == ne1Var) {
                                return ne1Var;
                            }
                            function1 = function2;
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                kh.n(inputStreamOpen, th);
                                throw th2;
                            }
                        }
                    } catch (FileNotFoundException unused) {
                        classLoader = jj1.class.getClassLoader();
                        if (classLoader != null) {
                            hk0.l("Cannot find class loader");
                            return null;
                        }
                        resourceAsStream = classLoader.getResourceAsStream(str);
                        if (resourceAsStream == null) {
                            if (AndroidContextProvider.m == null) {
                                throw new or4("Missing resource with path: ".concat(str.concat(". Android context is not initialized. If it happens in the Preview mode then call PreviewContextConfigurationEffect() function.")));
                            }
                            throw new or4("Missing resource with path: ".concat(str));
                        }
                        inputStreamOpen = resourceAsStream;
                    }
                    if (classLoader != null) {
                        hk0.l("Cannot find class loader");
                        return null;
                    }
                    resourceAsStream = classLoader.getResourceAsStream(str);
                    if (resourceAsStream == null) {
                        if (AndroidContextProvider.m == null) {
                            throw new or4("Missing resource with path: ".concat(str.concat(". Android context is not initialized. If it happens in the Preview mode then call PreviewContextConfigurationEffect() function.")));
                        }
                        throw new or4("Missing resource with path: ".concat(str));
                    }
                    inputStreamOpen = resourceAsStream;
                    byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStreamOpen.available()));
                    bArr = new byte[8192];
                    while (i >= 0) {
                        byteArrayOutputStream.write(bArr, 0, i);
                    }
                    obj = byteArrayOutputStream.toByteArray();
                    obj.getClass();
                    inputStreamOpen.close();
                    ne1Var = ne1.m;
                    if (obj == ne1Var) {
                        return ne1Var;
                    }
                    function1 = function2;
                } catch (FileNotFoundException unused2) {
                    assets = sh.b().getAssets();
                    if (assets != null || (inputStreamOpen = assets.open(str)) == null) {
                        throw new FileNotFoundException("Current AssetManager is null.");
                    }
                    byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStreamOpen.available()));
                    bArr = new byte[8192];
                    while (i >= 0) {
                        byteArrayOutputStream.write(bArr, 0, i);
                    }
                    obj = byteArrayOutputStream.toByteArray();
                    obj.getClass();
                    inputStreamOpen.close();
                    ne1Var = ne1.m;
                    if (obj == ne1Var) {
                        return ne1Var;
                    }
                    function1 = function2;
                    return function1.invoke(obj);
                }
            } catch (NoClassDefFoundError unused3) {
                Log.d("ResourceReader", "Android Instrumentation context is not available.");
                assets = null;
                if (assets != null) {
                }
                throw new FileNotFoundException("Current AssetManager is null.");
            }
            classLoader = jj1.class.getClassLoader();
        } else {
            if (!z) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            function1 = this.m;
            ct1.a0(obj);
        }
        return function1.invoke(obj);
    }
}
