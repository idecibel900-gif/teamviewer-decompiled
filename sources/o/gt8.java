package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class gt8 {
    public static final /* synthetic */ int a = 0;

    static {
        int i = ht8.l;
    }

    public static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String simpleName = exc.getClass().getSimpleName();
            String message = exc.getMessage();
            if (message == null) {
                message = "";
            }
            String str = simpleName + ":" + message;
            int i = tr8.a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th) {
            tr8.i("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    public static gw8 b(int i, int i2, g60 g60Var, String str, mw8 mw8Var) {
        try {
            jw8 jw8VarP = kw8.p();
            jw8VarP.d(g60Var.a);
            String str2 = g60Var.c;
            jw8VarP.b();
            kw8.r((kw8) jw8VarP.n, str2);
            int i3 = g60Var.b;
            if (i3 != 0) {
                jw8VarP.b();
                kw8.t((kw8) jw8VarP.n, i3);
            }
            if (i != 0) {
                jw8VarP.c(i);
            }
            if (str != null) {
                jw8VarP.b();
                kw8.q((kw8) jw8VarP.n, str);
            }
            fw8 fw8VarR = gw8.r();
            fw8VarR.c(jw8VarP);
            fw8VarR.e(i2);
            if (!mw8Var.equals(mw8.BROADCAST_ACTION_UNSPECIFIED)) {
                fw8VarR.b();
                gw8.u((gw8) fw8VarR.n, mw8Var);
            }
            return (gw8) fw8VarR.a();
        } catch (Throwable th) {
            tr8.i("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }

    public static iw8 c(int i, mw8 mw8Var) {
        try {
            hw8 hw8VarP = iw8.p();
            hw8VarP.b();
            iw8.o((iw8) hw8VarP.n, i);
            if (!mw8Var.equals(mw8.BROADCAST_ACTION_UNSPECIFIED)) {
                hw8VarP.b();
                iw8.r((iw8) hw8VarP.n, mw8Var);
            }
            return (iw8) hw8VarP.a();
        } catch (Exception e) {
            tr8.i("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }
}
