package o;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b20 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Context f384o;

    public /* synthetic */ b20(Function0 function0, Context context) {
        this.m = (byte) 1;
        this.n = function0;
        this.f384o = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        Function0 function0 = this.n;
        Context context = this.f384o;
        switch (b) {
            case 0:
                try {
                    context.startActivity(new Intent("android.settings.IGNORE_BACKGROUND_DATA_RESTRICTIONS_SETTINGS", Uri.parse("package:" + context.getPackageName())), Bundle.EMPTY);
                } catch (ActivityNotFoundException unused) {
                    ye4.c("BackgroundDataAccessDialog", "Failed to start background data settings activity");
                }
                function0.a();
                break;
            case 1:
                function0.a();
                context.startActivity(new Intent("android.settings.SECURITY_SETTINGS"));
                break;
            case 2:
                Intent intent = new Intent();
                intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
                context.startActivity(intent);
                function0.a();
                break;
            default:
                String string = context.getString(R.string.tv_device_authentication_learn_more_url);
                string.getClass();
                Uri uri = Uri.parse(string);
                uri.getClass();
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setData(uri);
                intent2.addFlags(268435456);
                try {
                    context.startActivity(intent2);
                    break;
                } catch (ActivityNotFoundException unused2) {
                }
                function0.a();
                break;
        }
        return f88Var;
    }

    public /* synthetic */ b20(Context context, Function0 function0, byte b) {
        this.m = b;
        this.f384o = context;
        this.n = function0;
    }
}
