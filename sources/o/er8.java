package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public enum er8 {
    RESPONSE_CODE_UNSPECIFIED(-999),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_TIMEOUT(-3),
    /* JADX INFO: Fake field, exist only in values array */
    FEATURE_NOT_SUPPORTED(-2),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_DISCONNECTED(-1),
    /* JADX INFO: Fake field, exist only in values array */
    OK(0),
    /* JADX INFO: Fake field, exist only in values array */
    USER_CANCELED(1),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_UNAVAILABLE(2),
    /* JADX INFO: Fake field, exist only in values array */
    BILLING_UNAVAILABLE(3),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_UNAVAILABLE(4),
    /* JADX INFO: Fake field, exist only in values array */
    DEVELOPER_ERROR(5),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR(6),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_ALREADY_OWNED(7),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_NOT_OWNED(8),
    /* JADX INFO: Fake field, exist only in values array */
    EXPIRED_OFFER_TOKEN(11),
    /* JADX INFO: Fake field, exist only in values array */
    NETWORK_ERROR(12);


    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final is8 f736o;
    public final int m;

    static {
        ae aeVar = new ae((byte) 15);
        aeVar.c = new Object[8];
        aeVar.b = 0;
        for (er8 er8Var : values()) {
            Integer numValueOf = Integer.valueOf(er8Var.m);
            int i = aeVar.b + 1;
            Object[] objArrCopyOf = (Object[]) aeVar.c;
            int length = objArrCopyOf.length;
            int i2 = i + i;
            if (i2 > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, m77.D(length, i2));
                aeVar.c = objArrCopyOf;
            }
            int i3 = aeVar.b;
            int i4 = i3 + i3;
            objArrCopyOf[i4] = numValueOf;
            objArrCopyOf[i4 + 1] = er8Var;
            aeVar.b = i3 + 1;
        }
        zr8 zr8Var = (zr8) aeVar.d;
        if (zr8Var != null) {
            throw zr8Var.a();
        }
        is8 is8VarA = is8.a(aeVar.b, (Object[]) aeVar.c, aeVar);
        zr8 zr8Var2 = (zr8) aeVar.d;
        if (zr8Var2 != null) {
            throw zr8Var2.a();
        }
        f736o = is8VarA;
    }

    er8(int i) {
        this.m = i;
    }
}
