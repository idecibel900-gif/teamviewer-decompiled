package o;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.widget.Toast;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jy0 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1211o;
    public final /* synthetic */ Object p;

    public /* synthetic */ jy0(byte b, int i, Object obj, Object obj2) {
        this.m = b;
        this.n = obj;
        this.f1211o = i;
        this.p = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        Object obj = this.p;
        int i = this.f1211o;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                ky0 ky0Var = (ky0) obj2;
                Object obj3 = ((f4) obj).m;
                String str = (String) ky0Var.a.get(Integer.valueOf(i));
                if (str != null) {
                    i8 i8Var = (i8) ky0Var.e.get(str);
                    if ((i8Var != null ? i8Var.a : null) != null) {
                        a8 a8Var = i8Var.a;
                        if (ky0Var.d.remove(str)) {
                            a8Var.a(obj3);
                        }
                    } else {
                        ky0Var.g.remove(str);
                        ky0Var.f.put(str, obj3);
                    }
                    break;
                }
                break;
            case 1:
                ((ky0) obj2).a(i, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                break;
            default:
                Context context = (Context) obj;
                context.getClass();
                Toast toastMakeText = Toast.makeText(context, (String) obj2, i);
                toastMakeText.getClass();
                toastMakeText.show();
                break;
        }
    }
}
