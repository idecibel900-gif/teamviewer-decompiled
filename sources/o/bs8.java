package o;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class bs8 extends yo8 {
    public final pr8 d;
    public final Boolean e;
    public final int f;
    public final /* synthetic */ c60 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs8(c60 c60Var, pr8 pr8Var, Boolean bool, int i) {
        super("com.android.vending.billing.IInAppBillingInitializeCallback", (byte) 1);
        this.g = c60Var;
        this.d = pr8Var;
        this.e = bool;
        this.f = i;
    }

    @Override // o.yo8
    public final boolean f(Parcel parcel, int i) {
        as8 ks8Var;
        if (i != 1) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) zq8.a(parcel);
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(fx3.e(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
        if (bundle == null) {
            tr8.h("BillingClient", "Response bundle is null.");
            i(this.d, jt8.f, 122, this.e.booleanValue(), null, this.f);
            return true;
        }
        if (!bundle.containsKey("RESPONSE_CODE")) {
            tr8.h("BillingClient", "Response bundle doesn't contain a response code");
            i(this.d, jt8.f, 129, this.e.booleanValue(), null, this.f);
            return true;
        }
        if (bundle.getInt("RESPONSE_CODE") != 0) {
            i(this.d, jt8.a(bundle.getInt("RESPONSE_CODE"), bundle.getString("DEBUG_MESSAGE", "")), 130, this.e.booleanValue(), fx3.e(bundle.getInt("RESPONSE_CODE"), "Response code from Phonesky: "), this.f);
            return true;
        }
        if (!bundle.containsKey("BILLING_API_VERSION_KEY")) {
            tr8.h("BillingClient", "Billing API version not found in response bundle.");
            i(this.d, jt8.f, 128, this.e.booleanValue(), null, this.f);
            return true;
        }
        int i2 = bundle.getInt("BILLING_API_VERSION_KEY");
        c60 c60Var = this.g;
        c60.n(c60Var, i2);
        c60Var.k = i2 >= 3;
        Bundle bundle2 = bundle.getBundle("EXPERIMENT_VALUES_KEY");
        if (bundle2 != null) {
            try {
                bundle2.getBoolean("DELEGATION_API_ENABLED_KEY");
            } catch (Throwable th) {
                tr8.i("BillingClient", "Error reading EnableDelegationApi experiment flag: ".concat(bundle2.toString()), th);
            }
            try {
                r47.a = bundle2.getLong("AUTO_SERVICE_RECONNECTION_SYNCHRONOUS_TIMEOUT_MS_KEY");
            } catch (Throwable th2) {
                tr8.i("BillingClient", "Error reading AutoServiceReconnectionSynchronousTimeoutMs experiment flag: ".concat(bundle2.toString()), th2);
            }
            try {
                r47.b = bundle2.getLong("AUTO_SERVICE_RECONNECTION_ASYNCHRONOUS_TIMEOUT_MS_KEY");
            } catch (Throwable th3) {
                tr8.i("BillingClient", "Error reading AutoServiceReconnectionAsynchronousTimeoutMs experiment flag: ".concat(bundle2.toString()), th3);
            }
            try {
                r47.c = bundle2.getInt("AUTO_SERVICE_RECONNECTION_MAX_NUM_RETRIES_KEY");
            } catch (Throwable th4) {
                tr8.i("BillingClient", "Error reading AutoServiceReconnectionMaxNumRetries experiment flag: ".concat(bundle2.toString()), th4);
            }
            try {
                r47.d = bundle2.getBoolean("ENABLE_DEDUPLICATE_SERVICE_DISCONNECTED_CALLBACK");
            } catch (Throwable th5) {
                tr8.i("BillingClient", "Error reading EnableDeduplicateServiceDisconnectedCallback experiment flag: ".concat(bundle2.toString()), th5);
            }
        }
        Bundle bundle3 = bundle.getBundle("ENABLED_SUBSCRIPTION_CLIENT_ACTIONS_KEY");
        if (bundle3 != null) {
            Object[] objArrCopyOf = new Object[4];
            int i3 = 0;
            for (cu8 cu8Var : cu8.values()) {
                if (bundle3.getBoolean(cu8Var.name(), false)) {
                    int length = objArrCopyOf.length;
                    int i4 = i3 + 1;
                    int iD = m77.D(length, i4);
                    if (iD > length) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
                    }
                    objArrCopyOf[i3] = cu8Var;
                    i3 = i4;
                }
            }
            c60 c60Var2 = this.g;
            if (i3 == 0) {
                ks8Var = js8.v;
            } else if (i3 != 1) {
                ks8Var = as8.k(i3, objArrCopyOf);
                ks8Var.size();
            } else {
                Object obj = objArrCopyOf[0];
                Objects.requireNonNull(obj);
                ks8Var = new ks8(obj);
            }
            c60Var2.A = ks8Var;
            if (c60Var2.f != null) {
                c60Var2.f.g = c60Var2.A;
            }
        }
        c60 c60Var3 = this.g;
        if (c60Var3.l < 3) {
            tr8.h("BillingClient", "In-app billing API version 3 is not supported on this device.");
            i(this.d, jt8.a, 36, this.e.booleanValue(), null, this.f);
        } else {
            pr8 pr8Var = this.d;
            Boolean bool = this.e;
            int i5 = this.f;
            boolean zBooleanValue = bool.booleanValue();
            c60.o(c60Var3, 0);
            synchronized (c60Var3.a) {
                try {
                    if (c60Var3.b != 3) {
                        pr8Var.c(i5, zBooleanValue);
                        pr8Var.d(jt8.g);
                    }
                } catch (Throwable th6) {
                    throw th6;
                }
            }
        }
        return true;
    }

    public final void i(pr8 pr8Var, g60 g60Var, int i, boolean z, String str, int i2) {
        this.g.y(0);
        pr8Var.b(g60Var, i, str, z, i2);
        pr8Var.d(g60Var);
    }
}
