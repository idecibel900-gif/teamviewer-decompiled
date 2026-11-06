package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class hm0 implements g28 {
    public final ConnectivityManager b;
    public final Context c;
    public final du0 e;
    public final du0 f;
    public final DataEncoder a = new JsonDataEncoderBuilder().configureWith(xz2.D).ignoreNullValues(true).build();
    public final URL d = b(ci0.c);

    public hm0(Context context, du0 du0Var, du0 du0Var2) {
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.e = du0Var2;
        this.f = du0Var;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(ua5.m("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:30:0x010b  */
    public final k00 a(k00 k00Var) {
        int type;
        int subtype;
        HashMap map;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        d11 d11VarC = k00Var.c();
        int i = Build.VERSION.SDK_INT;
        HashMap map2 = (HashMap) d11VarC.r;
        if (map2 == null) {
            hk0.l("Property \"autoMetadata\" has not been set");
            return null;
        }
        map2.put("sdk-version", String.valueOf(i));
        d11VarC.d("model", Build.MODEL);
        d11VarC.d("hardware", Build.HARDWARE);
        d11VarC.d("device", Build.DEVICE);
        d11VarC.d("product", Build.PRODUCT);
        d11VarC.d("os-uild", Build.ID);
        d11VarC.d("manufacturer", Build.MANUFACTURER);
        d11VarC.d("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap map3 = (HashMap) d11VarC.r;
        if (map3 == null) {
            hk0.l("Property \"autoMetadata\" has not been set");
            return null;
        }
        map3.put("tz-offset", String.valueOf(offset));
        int i2 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = n25.m;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap map4 = (HashMap) d11VarC.r;
        if (map4 == null) {
            hk0.l("Property \"autoMetadata\" has not been set");
            return null;
        }
        map4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = m25.m;
                subtype = 100;
            } else if (((m25) m25.m.get(subtype)) == null) {
            }
            map = (HashMap) d11VarC.r;
            if (map != null) {
                hk0.l("Property \"autoMetadata\" has not been set");
                return null;
            }
            map.put("mobile-subtype", String.valueOf(subtype));
            d11VarC.d("country", Locale.getDefault().getCountry());
            d11VarC.d("locale", Locale.getDefault().getLanguage());
            Context context = this.c;
            d11VarC.d("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                ep1.p("CctTransportBackend", "Unable to find version code for package", e);
            }
            d11VarC.d("application_build", Integer.toString(i2));
            return d11VarC.k();
        }
        SparseArray sparseArray3 = m25.m;
        subtype = 0;
        map = (HashMap) d11VarC.r;
        if (map != null) {
            hk0.l("Property \"autoMetadata\" has not been set");
            return null;
        }
        map.put("mobile-subtype", String.valueOf(subtype));
        d11VarC.d("country", Locale.getDefault().getCountry());
        d11VarC.d("locale", Locale.getDefault().getLanguage());
        Context context2 = this.c;
        d11VarC.d("mcc_mnc", ((TelephonyManager) context2.getSystemService("phone")).getSimOperator());
        i2 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
        d11VarC.d("application_build", Integer.toString(i2));
        return d11VarC.k();
    }
}
