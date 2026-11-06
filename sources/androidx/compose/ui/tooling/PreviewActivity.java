package androidx.compose.ui.tooling;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import io.sentry.android.core.v0;
import java.lang.reflect.Constructor;
import o.bs5;
import o.f9;
import o.fx3;
import o.hk0;
import o.lz3;
import o.my0;
import o.ny0;
import o.ub7;
import o.yy0;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewActivity extends my0 {
    public static final /* synthetic */ int I = 0;
    public final String H = "PreviewActivity";

    @Override // o.my0, o.ly0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        Class<?> cls;
        super.onCreate(bundle);
        int i = getApplicationInfo().flags & 2;
        String str = this.H;
        if (i == 0) {
            Log.d(str, "Application is not debuggable. Compose Preview not allowed.");
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("composable")) == null) {
            return;
        }
        Log.d(str, "PreviewActivity has composable ".concat(stringExtra));
        String strT0 = ub7.t0(stringExtra, '.');
        String strQ0 = ub7.q0('.', stringExtra, stringExtra);
        String stringExtra2 = getIntent().getStringExtra("parameterProviderClassName");
        int i2 = 0;
        if (stringExtra2 == null) {
            Log.d(str, "Previewing '" + strQ0 + "' without a parameter provider.");
            ny0.a(this, new yy0(-840626948, true, new bs5(strT0, strQ0, (byte) 0)));
            return;
        }
        Log.d(str, fx3.h("Previewing '", strQ0, "' with parameter provider: '", stringExtra2, "'"));
        try {
            cls = Class.forName(stringExtra2);
        } catch (ClassNotFoundException e) {
            v0.d("PreviewLogger", "Unable to find PreviewProvider '" + stringExtra2 + "'", e);
            cls = null;
        }
        getIntent().getIntExtra("parameterProviderIndex", -1);
        if (cls == null) {
            ny0.a(this, new yy0(-1901447514, true, new f9(strT0, strQ0, new Object[0], (byte) 19)));
            return;
        }
        try {
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            Constructor<?> constructor = null;
            boolean z = false;
            while (true) {
                if (i2 >= length) {
                    if (z) {
                        break;
                    }
                } else {
                    Constructor<?> constructor2 = constructors[i2];
                    if (constructor2.getParameterTypes().length == 0) {
                        if (!z) {
                            constructor = constructor2;
                            z = true;
                        }
                    }
                    i2++;
                }
                constructor = null;
                break;
            }
            if (constructor == null) {
                throw new IllegalArgumentException("PreviewParameterProvider constructor can not have parameters");
            }
            constructor.setAccessible(true);
            constructor.newInstance(null).getClass();
            throw new ClassCastException();
        } catch (lz3 unused) {
            hk0.l("Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle.");
        }
    }
}
