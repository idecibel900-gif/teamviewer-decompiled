package o;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ls8 {
    public final byte a;
    public final Object b;

    public ls8(vc8 vc8Var, vc8 vc8Var2) {
        this.a = (byte) 62;
        this.b = new vc8[]{vc8Var, vc8Var2};
    }

    public String a(sx8 sx8Var) {
        String str;
        ft8 ft8Var = (ft8) this.b;
        byte b = this.a;
        try {
            if (ft8Var.H == null) {
                throw null;
            }
            gr8 gr8Var = ft8Var.H;
            String packageName = ft8Var.F.getPackageName();
            if (b == 2) {
                str = "LAUNCH_BILLING_FLOW";
            } else if (b == 3) {
                str = "ACKNOWLEDGE_PURCHASE";
            } else if (b == 4) {
                str = "CONSUME_ASYNC";
            } else if (b != 5) {
                str = b != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION";
            } else {
                str = "IS_FEATURE_SUPPORTED";
            }
            ws8 ws8Var = new ws8(sx8Var);
            ar8 ar8Var = (ar8) gr8Var;
            Parcel parcelC = ar8Var.c();
            parcelC.writeString(packageName);
            parcelC.writeString(str);
            int i = zq8.a;
            parcelC.writeStrongBinder(ws8Var);
            try {
                ar8Var.d.transact(1, parcelC, null, 1);
                return "billingOverrideService.getBillingOverride";
            } finally {
                parcelC.recycle();
            }
        } catch (Exception e) {
            ft8Var.I(95, 28, jt8.q);
            tr8.i("BillingClientTesting", "An error occurred while retrieving billing override.", e);
            sx8Var.a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ls8(ft8 ft8Var, int i) {
        this.b = ft8Var;
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ls8(int i, vc8 vc8Var) {
        this.a = i;
        this.b = new vc8[]{vc8Var};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ls8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
